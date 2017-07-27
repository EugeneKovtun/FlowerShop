package epam.courses.model.entities;

/**
 * Created by eugene on 27.07.17.
 */
public class Bouquet {
    int flowers;
    boolean bucket;
    boolean tape;
    boolean winding;

    public int getFlowers() {
        return flowers;
    }

    public void setFlowers(int flowers) {
        this.flowers = flowers;
    }

    public boolean isBucket() {
        return bucket;
    }

    public void setBucket(boolean bucket) {
        this.bucket = bucket;
    }

    public boolean isTape() {
        return tape;
    }

    public void setTape(boolean tape) {
        this.tape = tape;
    }

    public boolean isWinding() {
        return winding;
    }

    public void setWinding(boolean winding) {
        this.winding = winding;
    }
}
