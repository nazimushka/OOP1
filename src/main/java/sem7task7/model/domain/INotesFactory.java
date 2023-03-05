package sem7task7.model.domain;

import sem7task7.model.domain.entity.Note;

public interface INotesFactory {

    Note getNewNote(String header, String text);
}