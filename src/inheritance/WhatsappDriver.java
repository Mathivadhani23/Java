package inheritance;

public class WhatsappDriver {
    
	public static void main(String[] args) {
		WhatsappV1 w1 = new WhatsappV1();
		w1.sent();
		// w1.audio();
		// w1.video();
		// w1.payment();CTE
		WhatsappV2 w2 = new WhatsappV2();

		w2.sent();
		w2.audio();

		// w2.video();
		// w2.payment();CTE

		WhatsappV3 w3 = new WhatsappV3();
		w3.sent();
		w3.audio();
		w3.video();

		// w3.payment();//CTE

		WhatsappV4 w4 = new WhatsappV4();
		w4.sent();
		w4.audio();
		w4.video();
		w4.payment();
	}
}



