package contract;

import java.awt.Image;

public interface IAffichable {
	public int getX();
	public int getY();
	public Image getSprite();
	public void move(PossibleMove possibleMove);
	public void move();
	public <World> void registerWorld(World y);
	public String get_type();
}
