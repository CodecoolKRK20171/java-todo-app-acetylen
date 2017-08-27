public class UI
{
    public static void printMenu()
    {
        String menu;
        menu = "Welcome in TodoStuff" + "\n" +
                "(1) list"+ "\n" +
                "(2) add"+ "\n" +
                "(3) mark item"+ "\n" +
                "(4) archive"+ "\n" +
                "(q) to quit";
                
        System.out.println(menu);
    }

    public static void printList(TodoList list)
    {
        Integer i = 1;
        for(TodoItem item: list.list)
        {
            System.out.println(i.toString() + ". " + item);
            i++;
        }
    }
}
