import java.util.ArrayList;
import java.util.List;

/**
 * ScreenDevice of BCIT
 *
 * @author Andres Arevalo, Yeongh Sun,
 * @version 1.0
 */
public class ScreenDevice
{
    private final double screenSizeInches;
    private final String resolution;
    private final String powerSource;
    private final String manufacturer;
    private final List<ScreenDevice> screenDevices;

    public ScreenDevice(final double screenSizeInches,
                        final String resolution,
                        final String powerSource,
                        final String manufacturer)
    {
        this.screenSizeInches = screenSizeInches;
        this.resolution = resolution;
        this.powerSource = powerSource;
        this.manufacturer = manufacturer;

        screenDevices = new ArrayList();
    }

    public void addDevice(ScreenDevice device)
    {
        screenDevices.add(device);
    }

    public void removeDevice(ScreenDevice device)
    {
        screenDevices.remove(device);
    }

    public void displayDevices()
    {
        for(ScreenDevice device : screenDevices)
        {
            System.out.println(device.toString());
        }

    }

    public int getNumberDevices()
    {
        return screenDevices.size();
    }

    public double getScreenSizeInches()
    {
        return screenSizeInches;
    }

    public String getResolution()
    {
        return resolution;
    }

    public String getPowerSource()
    {
        return powerSource;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public String toString()
    {
        return  "\nScreen Size(Inches): " + screenSizeInches +
                "\nResolution: " + resolution +
                "\nPower Source: " + powerSource +
                "\nManufacturer: " + manufacturer;
    }

    public String getString(final boolean option)
    {
        if(option)
        {
            return "Yes";
        }
        return "No";
    }
}
