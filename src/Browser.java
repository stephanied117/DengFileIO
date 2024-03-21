import java.util.ArrayList;
import java.util.Scanner;

public class Browser {
    private Webpage currentPage;
    private ArrayList<Webpage> internet;
    private WebStack browserBack;
    private WebStack browserForward;
    private Scanner scanner;

    public Browser() {
        scanner = new Scanner(System.in);
        browserBack = new WebStack();
        browserForward = new WebStack();
        internet = new ArrayList<Webpage>();
        Webpage home = new Webpage("Home","This is the home page");
        currentPage = home;
        connectToInternet();
    }


    //This method establishes what webpages are available for a user to visit when using this app.
    //You may add webpages of your own making as well to this method in the space indicated below
    //As well as alter any of the pre-existing webpages
    public void connectToInternet() {
        Webpage fb = new Webpage("Facebook","Check in with your friends here!");
        internet.add(fb);
        Webpage yt = new Webpage("YouTube","Watch videos here!");
        internet.add(yt);
        Webpage x = new Webpage("X","The site formerly known as Twitter");
        internet.add(x);
        Webpage connections = new Webpage("Connections","OVERRIDE|TREE|TRAYS|HOPPER\nARRAY|LOVELACE|PANCAKES|BOOKS\nJOHNSON|QUEUE|SUPER|POLYMORPH\nCASH|CONWAY|EXTEND|STACK ");
        internet.add(connections);
        Webpage wiki = new Webpage("Wikipedia","Please donate $3 to keep Wikipedia thriving for years to come");
        internet.add(wiki);
        Webpage google = new Webpage("Google","Search for anything on the web!");
        internet.add(google);

        //(Optional) Add your own created webpages below this line

    }

    //TODO
    //This method should display the webpage the user is currently on
    public void displayCurrentPage() {

    }
    //TODO
    //This method takes the name of the webpage the user wants to visit
    //If the Webpage can be found by name in the internet ArrayList
    //The current page should be set to the target webpage
    //If the Webpage can't be found, a new Webpage object should be created
    //representing an error page and set to the current page.
    //regardless of whether the Webpage was found or not,
    //the webpage the user is currently on should be displayed
    public void goToWebpage(String name) {

    }

    //TODO
    //This method goes back to the webpage most recently visited
    //If there is no webpage to go back to, print a message that explains
    //that the user cannot go back any further
    public void goBack() {

    }

    //TODO
    //This method revisits a webpage that the user previously exited
    //through going backwards
    //If there is no webpage to revisit, print a message that explains
    //that the user cannot go forward any further
    public void goForward() {

    }

    //TODO
    //This method prints out both the webpages the user has visited
    //in browserHistory and the webpages they can revisit in browserForward
    //If there is no browsing history to view
    //print a message that explains that to the user instead
    public void viewBrowserBackAndForward() {

    }

    public void run() {
        displayCurrentPage(); //Used to display the home page on startup
        String userInput = "";
        while (!userInput.equals("6")) {
            System.out.println("1) Search for a webpage");
            System.out.println("2) Go back");
            System.out.println("3) Go forward");
            System.out.println("4) View browsing history");
            System.out.println("5) Refresh webpage");
            System.out.println("6) Quit");
            System.out.println("Enter the number of the action you wish to perform: ");
            userInput = scanner.nextLine();

            if (userInput.equals("1")) {
                System.out.println("Enter the name of the page you want to go to");
                String name = scanner.nextLine();
                goToWebpage(name);
            }
            else if (userInput.equals("2")) {
                goBack();
            }
            else if (userInput.equals("3")) {
                goForward();
            }
            else if (userInput.equals("4")) {
                viewBrowserBackAndForward();
            }
            else if (userInput.equals("5")) {
                displayCurrentPage();
            }
            else if (!userInput.equals("6")){
                System.out.println("That is not a valid input");
            }
        }
    }

}
