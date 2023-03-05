package sem7task7.di;

import sem7task7.controllers.NoteController;
import sem7task7.model.data.FileStorage;
import sem7task7.model.domain.ILogger;
import sem7task7.model.domain.IMapper;
import sem7task7.model.domain.INoteController;
import sem7task7.model.domain.INotesFactory;
import sem7task7.model.domain.IRepository;
import sem7task7.model.domain.IStorage;
import sem7task7.model.domain.IValidator;
import sem7task7.model.domain.LoggerImpl;
import sem7task7.model.domain.MapperIml;
import sem7task7.model.data.RepositoryImpl;
import sem7task7.model.domain.NotesFactory;
import sem7task7.views.INotesAdapter;
import sem7task7.views.IView;
import sem7task7.views.NoteView;
import sem7task7.views.NotesAdapterImpl;
import sem7task7.views.Promptable;
import sem7task7.views.PromptableImpl;
import sem7task7.views.PromptableLoggingDecorator;

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

    public static ILogger provideLogger() {
        return new LoggerImpl("log.txt");
    }

    public static Promptable providePromptable(
            ILogger logger
    ) {
        return new PromptableLoggingDecorator(
                new PromptableImpl(),
                logger
        );
    }

    public static INotesAdapter provideNotesAdapter() {
        return new NotesAdapterImpl();
    }

    public static INotesFactory provideNotesFactory() {
        return new NotesFactory();
    }

    public static IView provideView(
            INoteController controller,
            Promptable promptable,
            INotesAdapter notesAdapter,
            INotesFactory notesFactory
    ) {
        return new NoteView(controller, promptable, notesAdapter, notesFactory);
    }
}