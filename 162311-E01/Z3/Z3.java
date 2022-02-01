import java.io.File;

public class Z3 {
    public static String[] withoutExtension(File dir, String extension) {
        return dir.list((path, fileName) -> {
            if(fileName.contains("." + extension)) {
                return false;
            }
            return true;
        });
    }

    public static void main(String[] args) {
        File dir = new File(".");
        withoutExtension(dir, "iml");
    }
}
