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

package com.aboru.games;

import com.aboru.games.checkers.Board;
import com.aboru.games.checkers.Move;
import com.aboru.games.io.ConsoleReader;

import java.util.Scanner;

public class GamesApplication {

    public static void main(final String[] arguments) {
        final Scanner in = new Scanner(System.in);

        int player = 1;
        Board board = new Board();

        while (!board.isWin(player)) {
            System.out.println(board);
            System.out.printf("player %d make your move\n", player);

            final Move move = new Move();

            System.out.println("Starting position");
            move.add(ConsoleReader.getCoordinate());
            System.out.println("Landing position");
            move.add(ConsoleReader.getCoordinate());

            while (ConsoleReader.isAnotherInput()) {
                System.out.println("Landing position");
                move.add(ConsoleReader.getCoordinate());
            }

            board.move(move);

            player = (player % 2) + 1;
        }

        System.out.printf("player %d wins!\n", (player % 2) + 1);
        System.out.println(board);
    }

}
