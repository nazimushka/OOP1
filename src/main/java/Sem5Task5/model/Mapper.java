package Sem5Task5.model;

public interface Mapper {
    String map(User user);

    User map(String line);
}