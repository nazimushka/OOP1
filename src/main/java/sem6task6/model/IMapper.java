package sem6task6.model;

public interface IMapper {

    String map(Note note);

    Note map(String line);
}