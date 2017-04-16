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

package com.aboru.games.shared;

/**
 * Represents a position in a game. A position has an x and y coordinate that
 * defines where it lies on a two dimensional grid.
 *
 * @author aboru
 */
public class Position {

    private int x;
    private int y;

    /**
     * Initializes a position with coordinates (0,0).
     */
    public Position() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Initializes a position with provided coordinates.
     *
     * @param x     the x coordinate of this position.
     * @param y     the y coordinate of this position.
     */
    public Position(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Sets the x coordinate of this position to a new value.
     *
     * @param x     the x coordinate for this position.
     */
    public void setX(final int x) {
        this.x = x;
    }

    /**
     * Retrieves the x coordinate for this position.
     *
     * @return      the x coordinate of this position.
     */
    public int getX() {
        return this.x;
    }

    /**
     * Sets the y coordinate of this position to a new value.
     *
     * @param y     the y coordinate of for this position.
     */
    public void setY(final int y) {
        this.y = y;
    }

    /**
     * Retrieves the y coordinate for this position.
     *
     * @return      the y coordinate of this position.
     */
    public int getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }

    @Override
    public boolean equals(final Object o) {
        if (o instanceof Position) {
            Position that = (Position) o;

            return this.x == that.x && this.y == that.y;
        }

        return false;
    }

}
