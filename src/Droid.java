public class Droid
{

    // 03/06/21.

    String name;
    int batteryLevel;

    public Droid(String droidName)
    {
        name = droidName;
        batteryLevel = 100;
    }

    public String toString()
    {
        return "Hello, I am the droid: " + name;
    }

    public void performTask(String task)
    {
        System.out.println(name + " is performing a " + task);

        System.out.println(batteryLevel = 100 - 10);
    }

    public void energyReport()
    {
        System.out.println(batteryLevel - 89);
    }

    public int energyLevel(int a)
    {
        return batteryLevel + a;
    }


    public static void main (String[] args)
    {
        Droid aDroid = new Droid(" IG-11");

        System.out.println(aDroid);

        aDroid.performTask("dance");

        aDroid.energyReport();

        System.out.println(aDroid.energyLevel(80));

        //System.out.println(aDroid.performTask("dance"));
    }

}
