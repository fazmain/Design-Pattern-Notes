package Final_exam_code;

public class WindowsFactory implements UIComponentFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Window createWindow() {
        return new WindowsWindow();
    }
}
