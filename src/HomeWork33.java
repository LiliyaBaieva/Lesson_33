import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HomeWork33 {
//  Расширьте программу Task2MonthsEnums.
//  Добавьте ещё один enum, который будет описывать времена года (зима, лето, весна, осень)
//  и укажет, к какому именно времени года относится выбранный месяц.

  enum Month {  // список месяце
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER,
  }

  enum Season { // список сезонов
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN,
  }

  public static Map<Month, Season> bildMonthSeason() {  // создаём мапу какой месяц к какому сезону
    Map<Month, Season> monthSeasonMap = new HashMap<>();
    monthSeasonMap.put(Month.JANUARY, Season.WINTER);
    monthSeasonMap.put(Month.FEBRUARY, Season.WINTER);
    monthSeasonMap.put(Month.MARCH, Season.SPRING);
    monthSeasonMap.put(Month.APRIL, Season.SPRING);
    monthSeasonMap.put(Month.MAY, Season.SPRING);
    monthSeasonMap.put(Month.JUNE, Season.SUMMER);
    monthSeasonMap.put(Month.JULY, Season.SUMMER);
    monthSeasonMap.put(Month.AUGUST, Season.SUMMER);
    monthSeasonMap.put(Month.SEPTEMBER, Season.AUTUMN);
    monthSeasonMap.put(Month.OCTOBER, Season.AUTUMN);
    monthSeasonMap.put(Month.NOVEMBER, Season.AUTUMN);
    monthSeasonMap.put(Month.DECEMBER, Season.WINTER);

    return monthSeasonMap;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter the month: ");
    String month = inputReader.readLine();  // считываем месяц введеный пользователем

    Month monthToLook = Month.valueOf(month.toUpperCase());

    Map<Month, Season> monthSeason = bildMonthSeason(); //карта месяце и сезонов

    if (monthSeason.containsKey(monthToLook)) { // проверяем есть ли такой месяц, если хорошо выводим сезон
      System.out.printf("The month %s is in %s", month, monthSeason.get(monthToLook));
    } else {
      System.out.println("This month doesn't exist.");
    }

  }
}