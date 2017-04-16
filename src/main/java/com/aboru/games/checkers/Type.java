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
 * Enumerates the possible types of a checker at any position.
 *
 * <p>The only types that are legal playing types are {@code Checker} and
 * {@code King}.
 *
 * @author aboru
 */
public enum Type {

    None,
    Checker,
    King;

    /**
     * Maps the given value to a checker type.
     *
     * @param value     the value to be mapped.
     * @return          the mapped value.
     */
    public static Type map(final int value) {
        if (value >= 3)
            return King;
        if (value >= 1)
            return Checker;
        return None;
    }

}
