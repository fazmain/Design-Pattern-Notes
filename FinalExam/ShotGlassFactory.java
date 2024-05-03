package FinalExam;

public class ShotGlassFactory implements GlassFactory{
    public Glass createGlass() {
        return new ShotGlass();
    }
}
