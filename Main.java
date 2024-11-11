import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> tasks = Arrays.asList(
                "Вигуляти собаку",
                "Зробити домашнє завдання",
                "Піти на тренування",
                "Вигуляти собаку",
                "Піти на тренування",
                "Зробити домашнє завдання"
        );

        List<String> uniqueTasks = Tasks.remove(tasks);

        System.out.println("Унікальні завдання: ");
        for (String task: uniqueTasks){
            System.out.println(task);
        }


        String word = "завдання";
        Map<Character, Integer> letterCount = Counter.countLetters(word);

        System.out.println("Кількість повторів букв у слові " + word + " :");

        for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}