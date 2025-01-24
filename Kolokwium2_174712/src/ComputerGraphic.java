abstract class ComputerGraphic {
    protected int width;
    protected int height;
    protected String fileName;


    public ComputerGraphic(int width, int height, String fileName) {
        this.width = width;
        this.height = height;
        this.fileName = fileName;
    }
    public abstract void loadFile();
    public abstract void saveFile();
}

class Bitmap extends ComputerGraphic{

    public Bitmap(int width, int height, String fileName) {
        super(width, height, fileName);
    }

    @Override
    public void loadFile() {
        System.out.println("Loading Bitmap");
    }

    @Override
    public void saveFile(){
        System.out.println("Saving Bitmap");
    }
}

class Vector extends ComputerGraphic{

    public Vector(int width, int height, String fileName) {
        super(width, height, fileName);
    }

    @Override
    public void loadFile() {
        System.out.println("Loading Vector");
    }

    @Override
    public void saveFile(){
        System.out.println("Saving Vector");
    }
}
