package four.inner;
//Outer klasa -> klasa koja se isto zove kao i fajl u kom se nalazi
class OuterModel {
    private int x;

    public OuterModel(int x){
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    //INNER klase: private, protected, public, paketno
    //INSTANCE INNER CLASS
    public class InnerModel{
        private int x;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }
    }


    //STATIC INNER XLASS
    public static class InnerStaticModel{
        private int x;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }
    }
}
