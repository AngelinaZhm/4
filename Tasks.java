import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Tasks {
    public static List<String> remove (List<String>tasks){
        Set<String> addedTasks = new HashSet<>();
        List<String>uniqueTasks = new ArrayList<>();

        for (String task: tasks){
            if (!addedTasks.contains(task)){
                addedTasks.add(task);
                uniqueTasks.add(task);
            }
        }
        return uniqueTasks;
    }
}
