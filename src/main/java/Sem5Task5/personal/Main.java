package Sem5Task5.personal;

import Sem5Task5.di.Component;

public class Main {

    private static final Component appComponent = new Component();

    public static void main(String[] args) {

        appComponent.viewUser.run();
    }
}