package sem6task6.di;

import sem6task6.controllers.NoteController;
import sem6task6.model.FileStorage;
import sem6task6.model.IMapper;
import sem6task6.model.INoteController;
import sem6task6.model.IRepository;
import sem6task6.model.IStorage;
import sem6task6.model.IValidator;
import sem6task6.model.MapperIml;
import sem6task6.model.RepositoryImpl;
import sem6task6.views.NoteView;

public class Module {

    public static IStorage provideStorage() {
        return new FileStorage("notes.txt");
    }

    public static IMapper provideMapper() {
        return new MapperIml();
    }

    public static IValidator provideValidator() {
        return new MapperIml();
    }

    public static IRepository provideRepository(
            IStorage storage,
            IMapper mapper
    ) {
        return new RepositoryImpl(mapper, storage);
    }

    public static INoteController provideNoteController(
            IRepository repository,
            IValidator validator
    ) {
        return new NoteController(repository, validator);
    }

    public static NoteView provideView(
            INoteController controller
    ) {
        return new NoteView(controller);
    }
}