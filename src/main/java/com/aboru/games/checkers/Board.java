/*
 * Copyright 2016 Anders Borg
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aboru.games.checkers;

public class Board {

    private int[][] state;

    public Board() {
        this.state = new int[][]{
            { 0, 1, 0, 1, 0, 1, 0, 1},
            { 1, 0, 1, 0, 1, 0, 1, 0},
            { 0, 1, 0, 1, 0, 1, 0, 1},
            { 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0},
            { 2, 0, 2, 0, 2, 0, 2, 0},
            { 0, 2, 0, 2, 0, 2, 0, 2},
            { 2, 0, 2, 0, 2, 0, 2, 0},
        };
    }

    public boolean isWin(final int player) {
        for (final int[] row : this.state) {
            for (final int value : row) {
                if (value % 2 == player % 2) {
                    return Boolean.FALSE;
                }
            }
        }

        return Boolean.TRUE;
    }

    public int get(final Coordinates location) {
        return this.state[location.getY()][location.getX()];
    }

    public void move(final Move move) {
        Coordinates initial = move.next();
        Coordinates destination = null;

        while (move.hasNext()) {
            destination = move.next();

            this.set(destination, this.get(initial));
            this.set(initial, 0);

            if (Math.abs(initial.getX() - destination.getX()) > 1) {
                final Coordinates intermediate = new Coordinates();
                intermediate.setX(Math.abs(initial.getX() - destination.getX()) / (initial.getX() - destination.getX()));
                intermediate.setY(Math.abs(initial.getY() - destination.getY()) / (initial.getY() - destination.getY()));
                this.set(intermediate, 0);
            }

            initial = destination;
        }
    }

    private void set(final Coordinates location, final int value) {
        this.state[location.getY()][location.getX()] = value;
    }

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder();

        for (final int[] row : this.state) {
            for (final int value : row) {
                result.append(value);
                result.append(" ");
            }
            result.append(System.lineSeparator());
        }

        return result.toString();
    }

}
