import java.util.ArrayList;
import java.util.Iterator;
/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */
public class TodoList
{
    String listName;
    ArrayList<TodoItem> list;
    public TodoList(String listName)
    {
        this.listName = listName;
        this.list = new ArrayList<TodoItem>();
    }

    public void add(TodoItem item)
    {
        this.list.add(item);
    }



    public String toString()
    {
        return list.toString();
    }
    public void archive()
    {
        for (Iterator<TodoItem> iterator = this.list.iterator(); iterator.hasNext(); ) {
    TodoItem task = iterator.next();
    if (task.getStatus()) {
        iterator.remove();
    }
}
    }
    public void markItem(String name, boolean toMark)
    {
        for (TodoItem item: list)
        {
            if (item.getTitle().equals(name))
            {
                if(toMark) item.mark();
                else item.unMark();
            }
        }
    }

}
