package HinhTron;

public class TamHinhTron {
    private String tam;
    private double x;
    private double y;
    public String getTam() {
        return tam;
    }
    public void setTam(String tam) throws Exception {
        if (tam != null) {
            this.tam = tam;
        } else {
            throw new Exception("Error");
        }
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    // constructor
    public TamHinhTron(String tam, double x, double y) throws Exception {
        if (tam != null) {
            this.tam = tam;
        } else {
            throw new Exception("Error");
        }
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        String s = "";
        s += s.format("%3s| x = %3s| y = %3s|", getTam(), getX(), getY());
        return s;
    }
}
