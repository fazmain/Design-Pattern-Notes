package Final_exam_code;

public class CloseWindowCommand implements Command {
    private Window window;

    public CloseWindowCommand(Window window) {
        this.window = window;
    }

    public void execute() {
        window.close();
    }
}
