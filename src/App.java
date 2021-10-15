/*
 * File: App.java
 * Created Date: 2021-10-15
 * Author: Katona Valentin
 * Original: Sallai Andras
 * Github: https://github.com/djvalee
 * Class: Szoftverfejleszto/Nappali/II
 * -----
 * Last Modified: 2021-10-15
 * Modified By: Katona Valentin
 * -----
 * Copyright (c) 2021 Katona Valentin
 * 
 * GNU GPL v2
 */

import controllers.MainController;
import views.MainWindow;

public class App {
    public static void main(String[] args) throws Exception {
        MainWindow mainWindow = new MainWindow();
        new MainController(mainWindow);
        mainWindow.setVisible(true);
    }
}
