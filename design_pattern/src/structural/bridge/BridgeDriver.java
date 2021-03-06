package structural.bridge;

public class BridgeDriver
{
	public static void main(String[] args)
	{
		XWindowImp xWindowImp = new XWindowImp();
		PMWindowImp pmWindowImp = new PMWindowImp();

		Window xIcon = new IconWindow(xWindowImp);
		Window pmIcon = new IconWindow(pmWindowImp);

		Window xTran = new TransientWindow(xWindowImp);
		Window pmTran = new TransientWindow(pmWindowImp);

		testWindow(xIcon);
		testWindow(pmIcon);
		testWindow(xTran);
		testWindow(pmTran);

	}

	private static void testWindow(Window window)
	{
		window.drawRect();
		window.drawText();
	}
}
