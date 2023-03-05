package sem7task7.model.domain;

import sem7task7.model.domain.entity.Note;

public class NotesFactory implements INotesFactory {

    @Override
    public Note getNewNote(String header, String text) {
        return new Note(
                header,
                text
        );
    }
}
