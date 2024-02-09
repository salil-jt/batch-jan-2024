class Box {
  double width;
  double height;
  double depth;
  
 // display volume of a box
  void volume() {
    System.out.println("Volume is ");
    System.out.println(width * height * depth);

  }
  
  void print(){
  	System.out.println("Box width:"+width);
	System.out.println("Box height:"+height);
	System.out.println("Box depth:"+depth);	
  
  }
 
  
  
}


class BoxDemo {
  public static void main(String args[]) {
  
  	Box mybox = new Box();
  	System.out.println("In BoxDemo class");
 	mybox.width=50;
	mybox.height=10;
	mybox.depth=20;

	//call the print method
	mybox.print();

	//call the volume method
	
	mybox.volume();
	System.out.println("Execution done for mybox");
	

	Box mybox_1 = new Box();
	mybox_1.width=15;
	mybox_1.height=12;
	mybox_1.depth=7;

	mybox_1.print();
	mybox_1.volume();



	Box mybox_2 = new Box();
	mybox_2.width=5;
	mybox_2.height=2;
	mybox_2.depth=8;
	mybox_2.print();	

	mybox_2.volume();

	

	
  
}
}
