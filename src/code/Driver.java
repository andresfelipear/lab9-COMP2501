/**
 * Driver of BCIT
 *
 * This class creates instances of Smartphone, Monitor, Tv, and Tablet, adds them to an ElectronicDeviceCollection,
 * displays the devices, and then removes one device to demonstrate the functionality.
 *
 * @author Andres Arevalo, Yeongsuk and
 * @version 1.0
 */
public class Driver {
    public static void main(String[] args) {

        // Create an ElectronicDeviceCollection to store different screen devices
        ElectronicDeviceCollection electronicDevices;

        // Create instances of different screen devices
        ScreenDevice smartphone;
        ScreenDevice tv;
        ScreenDevice monitor;
        ScreenDevice tablet;

        // Initialize the ElectronicDeviceCollection
        electronicDevices = new ElectronicDeviceCollection();

        // Create instances of different screen devices with specific attributes
        smartphone = new Smartphone("Galaxy S23", 6.1, "2340x1080", "battery", "samsung", true, 4);
        monitor = new Monitor("Nitro ED270R", 27, "1920x1080", "electricity", "acer", 165, 4);
        tv = new Tv("LG UHD", 65, "3840x2160", "electricity", "LG", true, "AI Sound Pro");
        tablet = new Tablet("iPad", 10.2, "2160x1620", "battery", "apple", true, true);

        // Add the created devices to the ElectronicDeviceCollection
        electronicDevices.addDevice(smartphone);
        electronicDevices.addDevice(monitor);
        electronicDevices.addDevice(tv);
        electronicDevices.addDevice(tablet);

        // Display information about all devices in the ElectronicDeviceCollection
        electronicDevices.displayDevices();

        // Display the number of devices in the ElectronicDeviceCollection
        System.out.println("Number Of Devices: " + electronicDevices.getNumberDevices());

        // Remove a device from the ElectronicDeviceCollection
        electronicDevices.removeDevice(tablet);

        // Display the updated number of devices in the ElectronicDeviceCollection
        System.out.println("Number Of Devices: " + electronicDevices.getNumberDevices());
    }
}
