
public class LowBalanceException extends RuntimeException
{
	public LowBalanceException(String msg)
	{
		super(msg);
	}

	public LowBalanceException() 
	{
		super();
	}

	public LowBalanceException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) 
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public LowBalanceException(String message, Throwable cause) 
	{
		super(message, cause);
	}

	public LowBalanceException(Throwable cause) 
	{
		super(cause);
	}
	
}
