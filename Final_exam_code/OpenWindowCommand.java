package Final_exam_code;

public class OpenWindowCommand implements Command {
    private Window window;

    public OpenWindowCommand(Window window) {
        this.window = window;
    }

    public void execute() {
        window.open();
    }
}
