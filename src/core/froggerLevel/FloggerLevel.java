package src.core.froggerLevel;

public class FloggerLevel implements java.io.Serializable
{
	private int[] speeds;
	private String[] patterns;

	public FloggerLevel(int[] speeds, String[] patterns)
	{
		this.speeds = speeds;
		this.patterns = patterns;
	}

	public int[] getSpeeds()
	{
		return speeds;
	}

	public String[] getPatterns()
	{
		return patterns;
	}
}