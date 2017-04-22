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

import java.util.LinkedList;
import java.util.List;

public class Move {

    private List<Coordinate> moves;
    private int current;

    public Move() {
        this.moves = new LinkedList<>();
        this.current = 0;
    }

    public void add(final Coordinate move) {
        this.moves.add(move);
    }

    public Coordinate next() {
        return this.moves.get(current++);
    }

    public boolean hasNext() {
        return this.moves.size() > current;
    }

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder("[ ");

        for (final Coordinate coordinate : moves)
            result.append(coordinate).append(" ");

        return result.append("]").toString();
    }

}
