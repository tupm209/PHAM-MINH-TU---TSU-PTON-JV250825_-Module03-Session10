package bai4;

public interface IManager<T> {
    void add(T item);
    void update(int index, T item);
    void delete(int index);
    void display();
}
