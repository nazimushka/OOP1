package sem6task6.model;

import java.util.List;

public interface IRepository {

    List<Note> getAllNotes();

    String createNote(Note note);

    void updateNote(Note note);

    void deleteNote(Note note);
}