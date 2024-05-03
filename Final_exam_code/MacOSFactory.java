package Final_exam_code;

public class MacOSFactory implements UIComponentFactory {
    public Button createButton() {
        return new MacOSButton();
    }

    public Window createWindow() {
        return new MacOSWindow();
    }
}
