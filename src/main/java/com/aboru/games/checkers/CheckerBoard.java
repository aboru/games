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

import com.aboru.games.shared.Position;

/**
 * Represents the board in a checker game.
 *
 * @author aboru
 */
public class CheckerBoard {

    private int[][] state;

    public CheckerBoard() {
        this.state = new int[][] {
                { 0, 1, 0, 1, 0, 1, 0, 1},
                { 1, 0, 1, 0, 1, 0, 1, 0},
                { 0, 1, 0, 1, 0, 1, 0, 1},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 2, 0, 2, 0, 2, 0, 2, 0},
                { 0, 2, 0, 2, 0, 2, 0, 2},
                { 2, 0, 2, 0, 2, 0, 2, 0}
        };
    }

    /**
     * Describes the contents of the position provided.
     *
     * @param position      the location to describe.
     * @return              the description of the position.
     */
    public LocationDescriptor describe(final Position position) {
        final int value = this.state[position.getY()][position.getX()];

        return new LocationDescriptor.Builder()
                .at(position)
                .as(Type.map(value))
                .ownedBy(Owner.map(value))
                .build();
    }

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder();

        for (final int[] row : this.state) {
            for (final int value : row) {
                result.append(value);
            }
            result.append(System.lineSeparator());
        }

        return result.toString();
    }

}
