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

package com.aboru.games.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ApplicationView extends Application {

    @Override
    public void start(final Stage stage) {
        stage.setTitle("Games");

        Button button = new Button();
        button.setText("Say 'Hello, World!'");
        button.setOnAction(event -> System.out.println("Hello, World"));

        StackPane root = new StackPane();
        root.getChildren().add(button);

        stage.setScene(new Scene(root, 300, 250));
        stage.show();
    }

}
