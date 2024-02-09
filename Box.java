class Box {
  double width;
  double height;
  double depth;
}


class BoxDemo {
  public static void main(String args[]) {
  
  Box mybox = new Box();
  System.out.println("In BoxDemo class");
 	mybox.width=50;
	mybox.height=10;
	mybox.depth=20;
	System.out.println("Box width:"+mybox.width);
	System.out.println("Box height:"+mybox.height);
	System.out.println("Box depth:"+mybox.depth);
	System.out.println("Box volume:"+ (mybox.width*mybox.height*mybox.depth));
	double vol = mybox.width*mybox.height*mybox.depth;
	System.out.println("Box volume using variable:"+ vol);
	
	
	Box mybox_1 = new Box();
	mybox_1.width=15;
	mybox_1.height=12;
	mybox_1.depth=7;
	System.out.println("Box_1 width:"+mybox_1.width);
	System.out.println("Box_1 height:"+mybox_1.height);
	System.out.println("Box_1 depth:"+mybox_1.depth);
	System.out.println("Box_1 volume:"+ (mybox_1.width*mybox_1.height*mybox_1.depth));
	
	/*  Assigning a reference to an object
	Box b1 = new Box();
	b1.height=15;
	b1.width=12;	
	b1.depth=5;	
	
	
	Box b2 = b1;
	System.out.println("B1 width: "+b1.width);
	System.out.println("B2 depth: "+b2.depth);
	
	b2.depth = 2;
	System.out.println("B2 depth after: "+b2.depth);
	
	System.out.println("B1 depth after: "+b1.depth);
	
	b1.depth = 1;
	System.out.println("B2 depth after2: "+b2.depth);
	
	System.out.println("B1 depth after2: "+b1.depth);
	
	b1 = null;
//	System.out.println("B1 depth after3: "+b1.depth); // null. -> NullPointerException
	System.out.println("B2 depth after3: "+b2.depth);
	
	 */
	
  
}
}
