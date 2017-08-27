import java.util.Scanner;
/**

 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */
public class App{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TodoList list = new TodoList("my list");
        String chosenOption;
        String chosenItem = "";
        boolean toContinue = true;
        while (toContinue)
        {
            UI.printMenu();
            System.out.print("Enter option ");
            chosenOption = input.nextLine();

            if (chosenOption.equals("2") || chosenOption.equals("3"))
            {
               System.out.print("Enter item title ");
               chosenItem = input.nextLine();
            }
            if (chosenOption.equals("1"))
            {
                UI.printList(list);
            }
            if (chosenOption.equals("2"))
            {
                list.add(new TodoItem(chosenItem));
            }
            else if(chosenOption.equals("3"))
            {
                list.markItem(chosenItem, true);
            }
            else if(chosenOption.equals("4"))
            {
                list.archive();
            }
            else if(chosenOption.equals("q")) toContinue = false;
        }
    }

}
