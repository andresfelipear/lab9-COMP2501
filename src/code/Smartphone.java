/**
 * Smartphone of BCIT
 *
 * @author Andres Arevalo
 * @version 1.0
 */
public class Smartphone extends ScreenDevice
{
    private final boolean supports5G;
    private final int numberRearCameras;

    public Smartphone(final double screenSizeInches,
                      final String resolution,
                      final String powerSource,
                      final String manufacturer,
                      final boolean supports5G,
                      final int numberRearCameras)
    {
        super(screenSizeInches, resolution, powerSource, manufacturer);
        this.supports5G = supports5G;
        this.numberRearCameras = numberRearCameras;
    }

    @Override
    public String toString()
    {
        return "Smartphone" +
                "\nSupports 5G: " + super.getString(supports5G)+
                "\nNumber of Rear Cameras: " + numberRearCameras +
                super.toString();
    }
}
