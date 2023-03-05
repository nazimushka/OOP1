package sem7task7.views;

import sem7task7.model.domain.entity.Note;

public class NotesAdapterImpl implements INotesAdapter {

    @Override
    public String getView(Note note) {
        return note.toString();
    }
}