import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame {

	public static void main(String[] args) {
		MainFrame1 mFrm = new MainFrame1();
		mFrm.setVisible(true);
	}

}

class MainFrame1 extends Frame{
	public MainFrame1(){
		initComp();
	}
	private void initComp(){
		this.setBounds(100, 100, 500, 500);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent windowEvent){
		        System.exit(0);
			}
		});
	}
}