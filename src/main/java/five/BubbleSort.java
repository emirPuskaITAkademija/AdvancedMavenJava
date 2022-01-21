package five;

public class BubbleSort {
    public void ahmedBubleSort(int[] niz) {
        int size = niz.length;
        for (int i = 0; i < (size - 1); i++) {
            boolean foundIt = false;
            for (int j = 0; j < (size - 1 - i); j++) {
                if(niz[j] > niz[j+1]){
                    int number = niz[j];
                    niz[j] = niz[j+1];
                    niz[j+1] = number;
                    foundIt = true;
                }
            }
            if(!foundIt){
                break;
            }
        }
    }

    public void ismarBubbleSort(int[] brojevi){

        for(int i = 0; i<brojevi.length; i++){
            // i = 0
            for(int j = i+1; j<brojevi.length; j++){
                //j = i
                if(brojevi[i]>brojevi[j]){
                    int privremeno = brojevi[i];
                    brojevi[i] = brojevi[j];
                    brojevi[j] = privremeno;
                }
            }
        }
    }
}
