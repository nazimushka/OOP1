package Sem5Task5.di;

import Sem5Task5.controllers.UserController;
import Sem5Task5.model.FileOperation;
import Sem5Task5.model.FileOperationImpl;
import Sem5Task5.model.Mapper;
import Sem5Task5.model.Repository;
import Sem5Task5.model.RepositoryAlternativeFile;
import Sem5Task5.model.UserMapperAlternative;
import Sem5Task5.views.ViewUser;

public class Module {

    public static FileOperation provideFileOPeration() {
        return new FileOperationImpl("users.txt");
    }

    public static Mapper provideMapper() {
        return new UserMapperAlternative();
    }

    public static Repository provideRepository(
            FileOperation fileOperation,
            Mapper mapper
    ) {
        return new RepositoryAlternativeFile(mapper ,fileOperation);
    }

    public static UserController provideUserController(
            Repository repository
    ) {
        return new UserController(repository);
    }

    public static ViewUser provideViewUser(
            UserController controller
    ) {
        return new ViewUser(controller);
    }
}