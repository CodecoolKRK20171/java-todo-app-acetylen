/**
 * Class representing a single todo item.
 *
 */
public class TodoItem
{
    private String title;
    private boolean isDone;

    public TodoItem(String title)
    {
        this.title = title;
        this.isDone = false;
    }

    public void mark()
    {
        this.isDone = true;
    }

    public void unMark()
    {
        this.isDone = false;
    }

    public String toString()
    {
        String output;
        if(isDone)
        {
            output = "[X]";
        }
        else
        {
            output = "[ ]";
        }

        return output + " " + title;
    }

    public boolean getStatus()
    {
        return isDone;
    }
    public String getTitle()
    {
        return title;
    }

}
