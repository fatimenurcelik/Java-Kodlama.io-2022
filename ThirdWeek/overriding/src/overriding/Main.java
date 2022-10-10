package overriding;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
	//	OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
	//	System.out.println();
		
		BaseKrediManager[] krediManagers = new BaseKrediManager[] 
				{new OgretmenKrediManager(), new Tar�mKrediManager(),new OgrenciKrediManager()};
		
		for (BaseKrediManager krediManager : krediManagers) {
			System.out.println("Kredi hesapland�: " + krediManager.hesapla(1000));
		}
	}

}
