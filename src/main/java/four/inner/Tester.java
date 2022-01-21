package four.inner;

public class Tester {
    public static void main(String[] args) {
        //Zašto klasa postoji ??
        // da bi neko nekoad kreirao instancu ili objekat
        OuterModel outerModel = new OuterModel(23);
        //instance inner klase
        OuterModel.InnerModel instanceInner = outerModel.new InnerModel();
        //static inner klase
        OuterModel.InnerStaticModel innerStaticModel = new OuterModel.InnerStaticModel();
    }
}
