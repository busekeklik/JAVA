package SuperSub;

public class Super {
    
    public int public_Super_Field;
    protected int protected_Super_Field;
    private int private_Super_Field;

    public Super(){
        public_Super_Field     = 10;
        protected_Super_Field  = 20;
		private_Super_Field    = 30;
    }

    public void superToSuper(Super anotherSuper) {
        int i = anotherSuper.public_Super_Field;
		int j = anotherSuper.protected_Super_Field;
		int k = anotherSuper.private_Super_Field;
    }
}
