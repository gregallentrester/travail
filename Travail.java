public class Travail {

  public static final void main(String...args) {

    EXCURSION =
      Integer.parseInt(args[0]);


    System.err.println(
      "\n\n\n EXCURSION: " +
      EXCURSION + "mi\n\t ...");

    new Travail().
      computeNonstop().
      computeRegulated();
  }


  private Travail computeRegulated() {

    int wholeSessions =
      EXCURSION / PER_DAY_LIMIT;

    int elapsedHours =
      wholeSessions * SESSION_LENGTH;


    int fractionalMiles =
      (EXCURSION % PER_DAY_LIMIT);

    int fractionalHours =
      fractionalMiles / 60;

    int fractionalPeriod =
      fractionalHours * 60;

    int additionalHours =
      fractionalPeriod / 60;

    int additionalMinutes =
      fractionalMiles % 60;


    System.err.println(
      "\n\n computeRegulated()\n" +
      "\n  wholeSessions " +
      wholeSessions +
      "\n  elapsedHours " +
      elapsedHours +

      "\n\n  fractionalMiles " +
      fractionalMiles +
      "\n  fractionalHours " +
      fractionalHours +
      "\n  fractionalPeriod " +
      fractionalPeriod +

      "\n\n  additionalHours " +
      additionalHours +
      "\n  additionalMinutes " +
      additionalMinutes);


    System.err.println(
      "\n\n Answer: " +
       (elapsedHours + fractionalHours) +
       "H " +
       additionalMinutes +
       "m\n\t ...\n");

    return this;
  }


  private Travail computeNonstop() {

    int elapsedHours =
      EXCURSION / 60;

    int minutes =
      EXCURSION % 60;

    System.err.println(
      "\n\n computeNonstop()\n" +
      "\n Answer: " +
      elapsedHours + "H " +
      minutes + "m" +
      "\n\t ...");

    return this;
  }



  private static int EXCURSION;

  private static int SESSION_LENGTH = 20;
  private static int PER_DAY_LIMIT = 720;

  private static int MILES_PER_24_HOURS = 1440;
}
