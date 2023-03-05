package sem7task7.di;


import sem7task7.model.domain.INoteController;
import sem7task7.model.domain.IRepository;
import sem7task7.model.domain.IStorage;
import sem7task7.views.IView;

public class Component {

    public IStorage storage;
    public IRepository repository;
    public INoteController noteController;
    public IView noteView;

    public Component() {

        storage = Module.provideStorage();
        repository = Module.provideRepository(storage, Module.provideMapper());
        noteController = Module.provideNoteController(repository, Module.provideValidator());
        noteView = Module.provideView(
                noteController,
                Module.providePromptable(
                        Module.provideLogger()
                ),
                Module.provideNotesAdapter(),
                Module.provideNotesFactory()
        );
    }
}