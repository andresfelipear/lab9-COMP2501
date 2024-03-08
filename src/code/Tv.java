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

    /**
     * Constructs a Tv with the specified parameters.
     *
     * @param name             The name of the TV.
     * @param screenSizeInches The size of the screen in inches.
     * @param resolution       The screen resolution in the format "width x height".
     * @param powerSource      The power source for the TV, either "battery" or "electricity".
     * @param manufacturer     The manufacturer of the TV.
     * @param smartTvFeatures  Whether the TV has smart TV features.
     * @param soundSystem      The sound system used by the TV.
     * @throws IllegalArgumentException if the sound system is invalid.
     */
    public Tv(final String name,
              final double screenSizeInches,
              final String resolution,
              final String powerSource,
              final String manufacturer,
              final boolean smartTvFeatures,
              final String soundSystem)
    {
        super(name,
              screenSizeInches,
              resolution,
              powerSource,
              manufacturer);

        if(!isValidSoundSystem(soundSystem))
        {
            throw new IllegalArgumentException("Invalid sound system");
        }

        this.smartTvFeatures = smartTvFeatures;
        this.soundSystem = soundSystem;
    }

    /**
     * Checks if the sound system is valid.
     *
     * @param soundSystem The sound system to be validated.
     * @return true if the sound system is not null and not empty, false otherwise.
     */
    private boolean isValidSoundSystem(final String soundSystem)
    {
        return soundSystem != null && !soundSystem.isEmpty();
    }

    /**
     * Returns a string representation of the Tv.
     *
     * @return A string containing information about the TV's screen size, resolution,
     * power source, manufacturer, smart TV features, and sound system.
     */
    @Override
    public String toString()
    {
        return "Tv" + super.toString() +
                "\nSmart TV Features: " + super.getString(smartTvFeatures) +
                "\nSound System: " + soundSystem;
    }
}
