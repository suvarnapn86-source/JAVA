import java.util.Stack;

public class BrowserHistory {

    public static void main(String[] args) {

        Stack<String> history = new Stack<>();

        history.push("Google");
        history.push("YouTube");
        history.push("GitHub");
        history.push("StackOverflow");
        history.push("Leetcode");

        System.out.println("Back from: " + history.pop());
        System.out.println("Back from: " + history.pop());

        System.out.println("Currently on: " + history.peek());
    }
}