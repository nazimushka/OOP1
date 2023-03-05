package sem7task7.model.domain;

import sem7task7.model.domain.entity.Note;

public interface IValidator {

    boolean validateNote(Note note);
}