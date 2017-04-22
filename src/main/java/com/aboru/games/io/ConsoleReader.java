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

package com.aboru.games.io;

import com.aboru.games.checkers.Coordinate;

import java.util.Scanner;

public enum ConsoleReader {

    INSTANCE;

    private final Scanner in;

    ConsoleReader() {
        this.in = new Scanner(System.in);
    }

    public static boolean isAnotherInput() {
        System.out.printf("Is there another move? ");
        boolean isFirstAttempt = Boolean.TRUE;
        String result;

        do {
            if (!isFirstAttempt) {
                System.out.print("I did not understand, answer as Y or N: ");
            }

            result = INSTANCE.in.next();

            isFirstAttempt = Boolean.FALSE;
        } while (!result.toUpperCase().equals("Y") && !result.toUpperCase().equals("N"));

        return result.toUpperCase().equals("Y");
    }

    public static Coordinate getCoordinate() {
        final Coordinate coordinate = new Coordinate();
        coordinate.setX(INSTANCE.getOne("x"));
        coordinate.setY(INSTANCE.getOne("y"));
        return coordinate;
    }

    private int getOne(final String type) {
        boolean isFirstAttempt = Boolean.TRUE;
        int result;

        do {
            if (!isFirstAttempt) {
                System.out.println("Invalid input, must be in range 0-7");
            }

            System.out.printf("input %s coordinate: ", type);

            result = in.nextInt();

            isFirstAttempt = Boolean.FALSE;
        } while (result < 0 || result > 7);

        return result;
    }

}
