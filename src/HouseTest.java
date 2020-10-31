import junit.framework.TestCase;

public class HouseTest extends TestCase {
	public void testDoor() {
		Locator locator = new Locator(new Door(), new Window(), new Roof());
		House h = new House(locator);
		Door d = h.getDoor();
	}
	public void testRoof() {
		Locator locator = new Locator(new Door(), new Window(), new Roof());
		House h = new House(locator);
		Roof r = h.getRoof();
	}
	public void testWindow() {
		Locator locator = new Locator(new Door(), new Window(), new Roof());
		House h = new House(locator);
		Window w = h.getWindow();
	}
}
