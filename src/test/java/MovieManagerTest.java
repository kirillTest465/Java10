import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {


    @Test
    public void findAllTest1() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMoviesTest1() {
        MovieManager manager = new MovieManager();
        manager.addMovies("Крестный отец");
        String[] expected = {"Крестный отец"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMoviesTest2() {
        MovieManager manager = new MovieManager();
        manager.addMovies("Крестный отец");
        manager.addMovies("Паразиты");
        manager.addMovies("Божественная ярость");
        String[] expected = {"Крестный отец", "Паразиты", "Божественная ярость"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest1() {
        MovieManager manager = new MovieManager();
        manager.addMovies("Крестный отец");
        manager.addMovies("Паразиты");
        manager.addMovies("Божественная ярость");
        String[] expected = {"Божественная ярость", "Паразиты", "Крестный отец"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest2() {
        MovieManager manager = new MovieManager(7);
        manager.addMovies("Бладшот");
        manager.addMovies("Вперед");
        manager.addMovies("Отель Белград");
        manager.addMovies("Джентельмены");
        manager.addMovies("Человек Невидимка");
        manager.addMovies("Тролии.Мировой тур");
        manager.addMovies("Номер один");
        String[] expected = {"Номер один", "Тролии.Мировой тур", "Человек Невидимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest3() {
        MovieManager manager = new MovieManager(7);
        manager.addMovies("Бладшот");
        manager.addMovies("Вперед");
        manager.addMovies("Отель Белград");
        manager.addMovies("Джентельмены");
        manager.addMovies("Человек Невидимка");
        manager.addMovies("Тролии.Мировой тур");
        manager.addMovies("Номер один");
        manager.addMovies("Банкир");
        String[] expected = { "Банкир", "Номер один", "Тролии.Мировой тур", "Человек Невидимка", "Джентельмены", "Отель Белград", "Вперед", };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void findLastTest4() {
        MovieManager manager = new MovieManager(7);
        manager.addMovies("Бладшот");
        manager.addMovies("Вперед");
        manager.addMovies("Отель Белград");
        manager.addMovies("Джентельмены");
        manager.addMovies("Человек Невидимка");
        manager.addMovies("Тролии.Мировой тур");
        String[] expected = { "Тролии.Мировой тур", "Человек Невидимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}

