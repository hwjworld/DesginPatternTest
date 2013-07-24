package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Graphic {
	protected List<Graphic> list = new ArrayList<Graphic>() ;
	public void draw() {
		for(Graphic g:list){
			g.draw();
		}
	}
	public void add(Graphic g){
		list.add(g);
	}
	public void remove(Graphic g){
		list.remove(g);
	}
	public void getChild(int i){
		
	}
}
