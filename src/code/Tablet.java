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

    public Tablet(final double screenSizeInches,
                  final String resolution,
                  final String powerSource,
                  final String manufacturer,
                  final boolean networkSupport,
                  final boolean frontCamera)
    {
        super(screenSizeInches, resolution, powerSource, manufacturer);
        this.networkSupport = networkSupport;
        this.frontCamera = frontCamera;
    }

    @Override
    public String toString()
    {

        return "Tv" +
                "\nNetwork Support: " + super.getString(networkSupport)+
                "\nFront Camera: " + super.getString(frontCamera)+
                super.toString();
    }




}
