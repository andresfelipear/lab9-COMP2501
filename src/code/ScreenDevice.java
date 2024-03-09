import java.util.Arrays;

/**
 * ScreenDevice of BCIT
 *
 * @author Andres Arevalo, Yeongh Sun,
 * @version 1.0
 */
public class ScreenDevice
{
    private final String name;
    private final double screenSizeInches;
    private final String resolution;
    private final String powerSource;
    private final String manufacturer;

    private static final String SPLIT_CHARACTER = "x";
    private static final int VALID_NUMBER_ELEMENTS = 2;
    static final double MIN_SCREEN_SIZE_INCHES = 2.55;
    static final double MAX_SCREEN_SIZE_INCHES = 97.00;

    // Min screen resolution 240x320
    private static final int SCREEN_WIDTH_POSITION = 0;
    private static final int SCREEN_HEIGHT_POSITION = 0;
    static final int MIN_SCREEN_WIDTH_RESOLUTION = 240;
    static final int MIN_SCREEN_HEIGHT_RESOLUTION = 320;

    // Max screen resolution 7680 x 4320
    static final int MAX_SCREEN_WIDTH_RESOLUTION = 7680;
    static final int MAX_SCREEN_HEIGHT_RESOLUTION = 4320;

    static final String[] VALID_POWER_SOURCES = {"battery", "electricity"};

    /**
     * Constructs a ScreenDevice with the specified parameters.
     *
     * @param name             The name of the screen device.
     * @param screenSizeInches The size of the screen in inches.
     * @param resolutionPx       The screen resolutionPx in the format "width x height".
     * @param powerSource      The power source for the device, either "battery" or "electricity".
     * @param manufacturer     The manufacturer of the device.
     * @throws IllegalArgumentException if any parameter is invalid.
     */
    public ScreenDevice(final String name,
                        final double screenSizeInches,
                        final String resolutionPx,
                        final String powerSource,
                        final String manufacturer)
    {
        if(name == null || name.isEmpty())
        {
            throw new IllegalArgumentException("Invalid name");
        }

        if(screenSizeInches < MIN_SCREEN_SIZE_INCHES || screenSizeInches > MAX_SCREEN_SIZE_INCHES)
        {
            throw new IllegalArgumentException(
                    String.format("Invalid Screen Size, it should be between %.2f and %.2f",
                                  MIN_SCREEN_SIZE_INCHES,
                                  MAX_SCREEN_SIZE_INCHES));
        }

        if(!isValidResolutionHz(resolutionPx))
        {
            throw new IllegalArgumentException(
                    String.format("Invalid Screen Resolution, it should be between %dx%d and %dx%d",
                                  MIN_SCREEN_WIDTH_RESOLUTION,
                                  MIN_SCREEN_HEIGHT_RESOLUTION,
                                  MAX_SCREEN_WIDTH_RESOLUTION,
                                  MAX_SCREEN_HEIGHT_RESOLUTION));
        }

        if(!isValidPowerSource(powerSource))
        {
            throw new IllegalArgumentException("Invalid Power Source. It should be" + Arrays.toString(VALID_POWER_SOURCES));
        }

        if(!isValidManufacturer(manufacturer))
        {
            throw new IllegalArgumentException("Invalid Manufacturer.");
        }

        this.name = name;
        this.screenSizeInches = screenSizeInches;
        this.resolution = resolutionPx;
        this.powerSource = powerSource;
        this.manufacturer = manufacturer;
    }

    /**
     * Checks if the manufacturer is valid.
     *
     * @param manufacturer The manufacturer to be validated.
     * @return true if the manufacturer is not null and not empty, false otherwise.
     */
    private boolean isValidManufacturer(final String manufacturer)
    {
        return manufacturer != null && !manufacturer.isEmpty();
    }

    /**
     * Checks if the power source is valid.
     *
     * @param powerSource The power source to be validated.
     * @return true if the power source is one of the predefined valid sources, false otherwise.
     */
    private boolean isValidPowerSource(final String powerSource)
    {
        for(final String validPowerSource : VALID_POWER_SOURCES)
        {
            if(validPowerSource.equalsIgnoreCase(powerSource))
            {
                return true;
            }
        }

        return false;
    }

    /**
     * Checks if the screen resolutionHz is valid.
     *
     * @param resolutionHz The screen resolutionHz to be validated.
     * @return true if the resolutionHz is in the valid range, false otherwise.
     */
    private boolean isValidResolutionHz(final String resolutionHz)
    {
        final int      screenWidthPixels;
        final int      screenHeightPixels;
        final String[] arrayResolution;

        if(resolutionHz == null || resolutionHz.isEmpty())
        {
            return false;
        }

        arrayResolution = resolutionHz.split(SPLIT_CHARACTER);

        if(arrayResolution.length != VALID_NUMBER_ELEMENTS)
        {
            return false;
        }

        screenWidthPixels = Integer.parseInt(arrayResolution[SCREEN_WIDTH_POSITION]);
        screenHeightPixels = Integer.parseInt(arrayResolution[SCREEN_HEIGHT_POSITION]);

        return (screenWidthPixels > MIN_SCREEN_WIDTH_RESOLUTION && screenHeightPixels > MIN_SCREEN_HEIGHT_RESOLUTION) ||
                (screenWidthPixels < MAX_SCREEN_WIDTH_RESOLUTION && screenHeightPixels < MAX_SCREEN_HEIGHT_RESOLUTION);
    }

    /**
     * Returns a string representation of the ScreenDevice.
     *
     * @return A string containing information about the screen size, resolution, power source, and manufacturer.
     */
    public String toString()
    {
        return "\nScreen Size(Inches): " + screenSizeInches +
                "\nResolution: " + resolution +
                "\nPower Source: " + powerSource +
                "\nManufacturer: " + manufacturer;
    }

    /**
     * Returns a string representation of a boolean option.
     *
     * @param option The boolean value to be represented as a string ("Yes" or "No").
     * @return "Yes" if the option is true, "No" otherwise.
     */
    public String getString(final boolean option)
    {
        if(option)
        {
            return "Yes";
        }
        return "No";
    }
}
