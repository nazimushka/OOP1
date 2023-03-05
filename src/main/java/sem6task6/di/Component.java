package sem6task6.di;

import sem6task6.model.INoteController;
import sem6task6.model.IRepository;
import sem6task6.model.IStorage;
import sem6task6.views.NoteView;


public class Component {

    public IStorage storage;
    public IRepository repository;
    public INoteController noteController;
    public NoteView noteView;

    public Component() {

        storage = Module.provideStorage();
        repository = Module.provideRepository(storage, Module.provideMapper());
        noteController = Module.provideNoteController(repository, Module.provideValidator());
        noteView = Module.provideView(noteController);
    }
}