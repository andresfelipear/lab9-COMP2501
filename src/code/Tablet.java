/**
 * Tablet of BCIT
 *
 * @author Andres Arevalo
 * @version 1.0
 */
public class Tablet extends ScreenDevice
{
    private final boolean networkSupport;
    private final boolean frontCamera;

    /**
     * Constructs a Tablet with the specified parameters.
     *
     * @param name             The name of the tablet.
     * @param screenSizeInches The size of the screen in inches.
     * @param resolution       The screen resolution in the format "width x height".
     * @param powerSource      The power source for the tablet, either "battery" or "electricity".
     * @param manufacturer     The manufacturer of the tablet.
     * @param networkSupport   Whether the tablet supports network connectivity.
     * @param frontCamera      Whether the tablet has a front camera.
     */
    public Tablet(final String name,
                  final double screenSizeInches,
                  final String resolution,
                  final String powerSource,
                  final String manufacturer,
                  final boolean networkSupport,
                  final boolean frontCamera)
    {
        super(name,
              screenSizeInches,
              resolution,
              powerSource,
              manufacturer);
        this.networkSupport = networkSupport;
        this.frontCamera = frontCamera;
    }

    /**
     * Returns a string representation of the Tablet.
     *
     * @return A string containing information about the tablet's screen size, resolution,
     * power source, manufacturer, network support, and front camera.
     */
    @Override
    public String toString()
    {
        return "Tablet" + super.toString() +
                "\nNetwork Support: " + super.getString(networkSupport) +
                "\nFront Camera: " + super.getString(frontCamera);
    }
}
