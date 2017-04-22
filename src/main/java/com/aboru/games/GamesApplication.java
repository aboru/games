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
import com.aboru.games.checkers.Coordinates;
import com.aboru.games.checkers.Move;

import java.util.Scanner;

public class GamesApplication {

    private static int getInt(final Scanner in, final String prompt) {
        int coordinate;

        do {
            System.out.print(prompt + ": ");
            coordinate = in.nextInt();
        } while (coordinate < 0 || coordinate > 7);

        return coordinate;
    }

    public static void main(final String[] arguments) {
        final Scanner in = new Scanner(System.in);

        int player = 1;
        Board board = new Board();

        while (!board.isWin(player)) {
            System.out.println(board);
            System.out.printf("player %d make your move\n", player);

            int x0 = getInt(in, "x coordinate");
            int y0 = getInt(in, "y coordinate");
            int x1 = getInt(in, "destination x coordinate");
            int y1 = getInt(in, "destination y coordinate");

            Coordinates initial, destination;
            initial = new Coordinates();
            initial.setX(x0);
            initial.setY(y0);
            destination = new Coordinates();
            destination.setX(x1);
            destination.setY(y1);

            Move move = new Move();
            move.add(initial);
            move.add(destination);

            board.move(move);

            player = (player % 2) + 1;
        }

        System.out.printf("player %d wins!\n", (player % 2) + 1);
        System.out.println(board);
    }

}
