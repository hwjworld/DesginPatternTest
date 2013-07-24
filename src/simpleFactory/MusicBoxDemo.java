package simpleFactory;

/**
 * 
 * Simple Factory模式（又称Static Factory模式），一个Simple Factory生产成品，而对客户端隐藏产品产生的细节。实作时定义一个产品介面（interface），并透过特定静态方法来建立成品。
 * 
 * 由于客户端只依赖于IMusicBox介面，所以即使您日后改变了createMusicBox()中的实作方式，对客户端是一点影响也没有的。
 * 
 * 来看看Simple Factory的类别结构：
 * 
 * 客户只要面对Factory，客户依赖于产品介面，产品的具体实作是可以与客户隔开的，它们也是可以抽换的。
 * 
 * @author Administrator
 * 
 */
public class MusicBoxDemo {
	public static void main(String[] args) throws Exception {
		playMusicBox(MusicBoxFactory.createMusicBox("simpleFactory.PianoBox"));
		playMusicBox(MusicBoxFactory.createMusicBox("simpleFactory.ViolinBox"));
	}

	public static void playMusicBox(IMusicBox musicBox) {
		musicBox.play();
	}

}
