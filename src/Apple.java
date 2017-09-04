import java.awt.*;

/**
 * Created by Digital Anvil on 10.04.2017.
 */
public class Apple implements Comparable<Apple> {
    private String variety="";
    private Color color;
    private int weight;


    public int compareTo(Apple other) {
        int result = this.variety.compareTo(other.variety);
        if (result == 0) {
            result = Integer.compare(this.weight, other.weight);
        }
        return result;
    }

    public String getVariety() {
        return variety;
    }

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
