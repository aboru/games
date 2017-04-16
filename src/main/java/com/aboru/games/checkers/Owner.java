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

/**
 * Enumerates the possible occupants of a position.
 *
 * @author aboru
 */
public enum Owner {

    None,
    PlayerOne,
    PlayerTwo;

    /**
     * Determines the owner of a value based on the integer value provided.
     *
     * @param value     the value to decide on the owner.
     * @return          the owner from this value.
     */
    public static Owner map(final int value) {
        if (value % 2 == 1)
            return PlayerOne;
        if (value % 2 == 0)
            return PlayerTwo;
        return None;
    }
}
