package Sem5Task5.di;

import Sem5Task5.controllers.UserController;
import Sem5Task5.model.FileOperation;
import Sem5Task5.model.Repository;
import Sem5Task5.views.ViewUser;

public class Component {

    public FileOperation fileOperation;
    public Repository repository;
    public UserController userController;
    public ViewUser viewUser;

    public Component() {

        fileOperation = Module.provideFileOPeration();
        repository = Module.provideRepository(fileOperation, Module.provideMapper());
        userController = Module.provideUserController(repository);
        viewUser = Module.provideViewUser(userController);
    }
}