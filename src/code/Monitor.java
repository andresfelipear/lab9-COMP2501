/**
 * Monitor of BCIT
 *
 * @author Andres Arevalo
 * @version 1.0
 */
public class Monitor extends ScreenDevice
{
    private final int refreshRate;
    private final int numberInputPorts;

    public Monitor(final double screenSizeInches,
                   final String resolution,
                   final String powerSource,
                   final String manufacturer,
                   final int refreshRate,
                   final int numberInputPorts)
    {
        super(screenSizeInches, resolution, powerSource, manufacturer);
        this.refreshRate = refreshRate;
        this.numberInputPorts = numberInputPorts;
    }

    @Override
    public String toString()
    {
        return "Monitor" +
                "\nRefresh Rate: " + refreshRate +
                "\nNumber of Input Ports: " + numberInputPorts;
    }
}
