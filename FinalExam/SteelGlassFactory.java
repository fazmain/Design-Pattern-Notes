package FinalExam;

public class SteelGlassFactory implements GlassFactory{
    public Glass createGlass() {
        return new SteelGlass();
    }
}
