package six;
//Thread interferencije i Memorijske inkonzistencije
//
public class DeadLock {


    public static void main(String[] args) {
        Friend ahmed = new Friend("Ahmed");
        Friend nedim = new Friend("Nedim");
        new Thread(()->ahmed.naklon(nedim)).start();
        new Thread(()->nedim.naklon(ahmed)).start();
    }





    static class Friend{
        private final String name;

        public Friend(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized void naklon(Friend friend){
            System.out.format("%s: %s se naklonio meni%n", this.name, friend.getName());
            friend.uzvracanjeNaklona(this);

        }

        public synchronized void uzvracanjeNaklona(Friend friend){
            System.out.format("%s: %s mi je uzvratio naklon%n", this.name, friend.getName());
        }
    }
}
