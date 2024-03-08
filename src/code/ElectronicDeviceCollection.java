import java.util.ArrayList;
import java.util.List;

/**
 * ElectronicDeviceCollection represents a collection of screen devices.
 * <p>
 * This class manages a collection of ScreenDevice instances, providing methods to add, remove,
 * display, and retrieve information about the devices. It uses a generic List to store instances
 * of ScreenDevice in a unified collection.
 *
 * @author user
 * @version 1.0
 */
public class ElectronicDeviceCollection
{
    private final List<ScreenDevice> screenDevices;

    /**
     * Constructs an ElectronicDeviceCollection with an empty device list.
     */
    public ElectronicDeviceCollection()
    {
        screenDevices = new ArrayList<>();
    }

    /**
     * Adds a ScreenDevice to the collection.
     *
     * @param device The ScreenDevice to be added to the collection.
     */
    public void addDevice(ScreenDevice device)
    {
        screenDevices.add(device);
    }

    /**
     * Removes a ScreenDevice from the collection.
     *
     * @param device The ScreenDevice to be removed from the collection.
     */
    public void removeDevice(ScreenDevice device)
    {
        screenDevices.remove(device);
    }

    /**
     * Displays information about all devices in the collection.
     */
    public void displayDevices()
    {
        for(ScreenDevice device : screenDevices)
        {
            System.out.println(device.toString() + "\n");
        }
    }

    /**
     * Retrieves the number of devices in the collection.
     *
     * @return The number of devices in the collection.
     */
    public int getNumberDevices()
    {
        return screenDevices.size();
    }
}
