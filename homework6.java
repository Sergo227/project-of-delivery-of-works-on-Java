import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class homework6 {
   public static void main(String[] args) {
      Notebook notebook1 = new Notebook("Asus", "8", "1024", "Windows", "black");
      Notebook notebook2 = new Notebook("Aser", "16", "1024", "Lunex", "black");
      Notebook notebook3 = new Notebook("Dell", "16", "2048", "Windows", "black");
      Notebook notebook4 = new Notebook("HP", "16", "1024", "Windows", "grey");
      Notebook notebook5 = new Notebook("Huawei", "8", "1024", "Windows", "grey");

      Set<Notebook> notebooks = new HashSet<>(List.of(notebook1, notebook2,
            notebook3, notebook4, notebook5));

      Map<String, String> sel = selectCriteria();
      sort(sel, notebooks);

   }

   public static String scanner() {
      Scanner scanner = new Scanner(System.in);
      String scan = scanner.nextLine();
      return scan;
   }

   public static Map<String, String> selectCriteria() {
      Map<String, String> resultCriterias = new HashMap<>();
      while (true) {
         System.out.println("Вы хотите выбрать критерий? Если да введите 'yesy', если нет введите 'no'");
         String question = scanner();
         if (question.equals("no")) {
            break;
         } else {

            System.out.println(
                  "Введите цифру, соответствующую необходимому критерию: \n 1 - Название \n 2 - ОЗУ \n 3 - Объем ЖД \n 4 - Операционная система \n 5 - Цвет");
            String key = scanner();
            System.out.println("Введите значения для выбранного критерия: ");
            String value = scanner();

            resultCriterias.put(key, value);
         }
      }
      System.out.println(resultCriterias);
      return resultCriterias;

   }

   public static void sort(Map<String, String> criterias, Set<Notebook> notebooks) {

      Set<Notebook> temp = new HashSet<>(notebooks);
      for (Notebook notebook : notebooks) {

         for (Object pair : criterias.keySet()) {

            if (pair.equals("1") && !notebook.getName().equals(criterias.get(pair))) {
               temp.remove(notebook);
            }
            for (Object pair1 : criterias.keySet()) {

               if (pair1.equals("2") && !notebook.getRam().equals(criterias.get(pair1))) {
                  temp.remove(notebook);

               }
               for (Object pair2 : criterias.keySet()) {

                  if (pair2.equals("3") && !notebook.getHardDisk().equals(criterias.get(pair2))) {
                     temp.remove(notebook);

                  }
                  for (Object pair3 : criterias.keySet()) {

                     if (pair3.equals("4") && !notebook.getOperatingSystem().equals(criterias.get(pair3))) {
                        temp.remove(notebook);

                     }
                     for (Object pair4 : criterias.keySet()) {

                        if (pair4.equals("5") && !notebook.getColour().equals(criterias.get(pair4))) {
                           temp.remove(notebook);

                        }
                     }
                  }
               }
            }
         }

      }
      if (temp.isEmpty()) {
         System.out.println("По введенным критериям ничего не найдено!");
      } else {
         System.out.println("Вот что мы можем предложить: \n" + temp.toString());
      }

   }

}