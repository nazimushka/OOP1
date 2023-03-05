package sem7task7.model.domain;

import sem7task7.model.domain.entity.Note;

public interface IMapper {

    String map(Note note);

    Note map(String line);
}