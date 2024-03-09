/**
 * Smartphone of BCIT
 *
 * @author Andres Arevalo, Yeonghsuk Oh & Ila Koukia
 * @version 1.0
 */
public class Smartphone extends ScreenDevice
{
    private final boolean supports5G;
    private final int numberRearCameras;

    static final int MIN_REAR_CAMERAS = 1;
    static final int MAX_REAR_CAMERAS = 6;

    /**
     * Constructs a Smartphone with the specified parameters.
     *
     * @param name              The name of the smartphone.
     * @param screenSizeInches  The size of the screen in inches.
     * @param resolution        The screen resolution in the format "width x height".
     * @param powerSource       The power source for the smartphone, either "battery" or "electricity".
     * @param manufacturer      The manufacturer of the smartphone.
     * @param supports5G        Whether the smartphone supports 5G.
     * @param numberRearCameras The number of rear cameras on the smartphone.
     * @throws IllegalArgumentException if the number of rear cameras is invalid.
     */
    public Smartphone(final String name,
                      final double screenSizeInches,
                      final String resolution,
                      final String powerSource,
                      final String manufacturer,
                      final boolean supports5G,
                      final int numberRearCameras)
    {
        super(name,
              screenSizeInches,
              resolution,
              powerSource,
              manufacturer);

        if(!isValidNumberRearCameras(numberRearCameras))
        {
            throw new IllegalArgumentException(
                    String.format("Invalid number of rear cameras. It should be between %d and %d",
                                  MIN_REAR_CAMERAS,
                                  MAX_REAR_CAMERAS));
        }

        this.supports5G = supports5G;
        this.numberRearCameras = numberRearCameras;
    }

    /**
     * Checks if the number of rear cameras is valid.
     *
     * @param numberRearCameras The number of rear cameras to be validated.
     * @return true if the number of rear cameras is within the valid range, false otherwise.
     */
    private boolean isValidNumberRearCameras(final int numberRearCameras)
    {
        return numberRearCameras > MIN_REAR_CAMERAS && numberRearCameras < MAX_REAR_CAMERAS;
    }

    /**
     * Returns a string representation of the Smartphone.
     *
     * @return A string containing information about the smartphone's screen size, resolution,
     * power source, manufacturer, 5G support, and number of rear cameras.
     */
    @Override
    public String toString()
    {
        return "Smartphone" + super.toString() +
                "\nSupports 5G: " + super.getString(supports5G) +
                "\nNumber of Rear Cameras: " + numberRearCameras;
    }
}
