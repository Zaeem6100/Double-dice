import java.util.Objects;

public class Die {
    int value;

    public Die() {
        this.value =0;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int roll() { return 1 + (int) (Math.random() * 6);}

    public boolean equal(Die a,Die b){
        return a.equals(b)?true:false;
    }

    
    @Override
    public String toString() {
        switch (value){
            case 1:
                return "One" ;
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
        }
        return null;
    }
}
