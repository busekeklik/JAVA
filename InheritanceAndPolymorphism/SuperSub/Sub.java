package SuperSub;

public class Sub extends Super{
    public    int public_Sub_Field;
	protected int protected_Sub_Field;
	private   int private_Sub_Field;
	
	public Sub( ) {
		public_Sub_Field    = 100;
		protected_Sub_Field = 200;
		private_Sub_Field   = 300;		
	}
	
	public void subToSub(Sub anotherSub) {
		int i = anotherSub.public_Sub_Field;
		int j = anotherSub.protected_Sub_Field;
		int k = anotherSub.private_Sub_Field;
		
		int l = anotherSub.public_Super_Field;
		int m = anotherSub.protected_Super_Field;	
	}

}