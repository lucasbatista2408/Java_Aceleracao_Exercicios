public class Duplicados {
    public static void main(String[] args) {
        String[] array1 = {"Morango", "Banana", "Maçã", "Uva", "Caqui"};
        String[] array2 = {"Manga", "Caqui", "Morango", "Amora"};

        for (String element : array2) {
            for (int i = 0; i < array1.length; i++) {
                if(element.equals(array1[i])){
                    System.out.println(element);
                }
            }
        }
        
    }
}
