package sem7task7;

import sem7task7.di.Component;

public class Main {

    private static final Component appComponent = new Component();

    public static void main(String[] args) {

        appComponent.noteView.run();
    }
}