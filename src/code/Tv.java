/**
 * Tv of BCIT
 *
 * @author Andres Arevalo
 * @version 1.0
 */
public class Tv extends ScreenDevice
{
    private final boolean smartTvFeatures;
    private final String soundSystem;

    public Tv(final double screenSizeInches,
              final String resolution,
              final String powerSource,
              final String manufacturer,
              final boolean smartTvFeatures,
              final String soundSystem)
    {
        super(screenSizeInches, resolution, powerSource, manufacturer);
        this.smartTvFeatures = smartTvFeatures;
        this.soundSystem = soundSystem;
    }

    @Override
    public String toString()
    {
        return "Tv" +
                "\nSmartTv Features: " + super.getString(smartTvFeatures)+
                "\nSound System: " + soundSystem +
                super.toString();
    }
}
