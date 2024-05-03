package Final_exam_code;

public class Driver {
    public static void main(String[] args) {
        UIComponentFactory factory;
        // String osName = "macOS";
        String osName = "Windows";

        if (osName.contains("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacOSFactory();
        }

        Button button = factory.createButton();
        Window window = factory.createWindow();

        Command openWindow = new OpenWindowCommand(window);
        Command closeWindow = new CloseWindowCommand(window);

        button.click();
        openWindow.execute();
        closeWindow.execute();
    }
}

