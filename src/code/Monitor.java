/**
 * Monitor of BCIT
 *
 * @author Andres Arevalo, Yeonghsuk Oh & Ila Koukia
 * @version 1.0
 */
public class Monitor extends ScreenDevice
{
    private final int refreshRateHz;
    private final int numberInputPorts;

    private static final int MIN_NUMBER_INPUT_PORTS = 1;
    private static final int MAX_NUMBER_INPUT_PORTS = 6;

    private static final int MIN_REFRESH_RATE_HZ = 60;
    private static final int MAX_REFRESH_RATE_HZ = 360;

    /**
     * Constructs a Monitor with the specified parameters.
     *
     * @param name             The name of the monitor.
     * @param screenSizeInches The size of the screen in inches.
     * @param resolution       The screen resolution in the format "width x height".
     * @param powerSource      The power source for the monitor, either "battery" or "electricity".
     * @param manufacturer     The manufacturer of the monitor.
     * @param refreshRateHz      The refresh rate of the monitor.
     * @param numberInputPorts The number of input ports on the monitor.
     * @throws IllegalArgumentException if any parameter is invalid.
     */
    public Monitor(final String name,
                   final double screenSizeInches,
                   final String resolution,
                   final String powerSource,
                   final String manufacturer,
                   final int refreshRateHz,
                   final int numberInputPorts)
    {
        super(name,
              screenSizeInches,
              resolution,
              powerSource,
              manufacturer);

        if(!isValidRefreshRateHz(refreshRateHz))
        {
            throw new IllegalArgumentException(
                    String.format("Invalid Refresh Rate. It should be between %d and %d",
                                  MIN_REFRESH_RATE_HZ,
                                  MAX_REFRESH_RATE_HZ));
        }

        if(!isValidNumberInputPorts(numberInputPorts))
        {
            throw new IllegalArgumentException(
                    String.format("Invalid Number of Input Ports. It should be between %d and %d",
                                  MIN_NUMBER_INPUT_PORTS,
                                  MAX_NUMBER_INPUT_PORTS));
        }

        this.refreshRateHz = refreshRateHz;
        this.numberInputPorts = numberInputPorts;
    }

    /**
     * Checks if the refresh rate is valid.
     *
     * @param refreshRateHz The refresh rate to be validated.
     * @return true if the refresh rate is within the valid range, false otherwise.
     */
    private boolean isValidRefreshRateHz(final int refreshRateHz)
    {
        return refreshRateHz >= MIN_REFRESH_RATE_HZ && refreshRateHz <= MAX_REFRESH_RATE_HZ;
    }

    /**
     * Checks if the number of input ports is valid.
     *
     * @param numberInputPorts The number of input ports to be validated.
     * @return true if the number of input ports is within the valid range, false otherwise.
     */
    private boolean isValidNumberInputPorts(final int numberInputPorts)
    {
        return numberInputPorts >= MIN_NUMBER_INPUT_PORTS && numberInputPorts <= MAX_NUMBER_INPUT_PORTS;
    }

    /**
     * Returns a string representation of the Monitor.
     *
     * @return A string containing information about the monitor's screen size, resolution,
     * power source, manufacturer, refresh rate, and number of input ports.
     */
    @Override
    public String toString()
    {
        return "Monitor" + super.toString() +
                "\nRefresh Rate: " + refreshRateHz +
                "\nNumber of Input Ports: " + numberInputPorts;
    }
}
