class Box {
  double width;
  double height;
  double depth;
  
 // display volume of a box
  double volume() {
    System.out.println("Volume is "+(width * height * depth));
    return width * height * depth;

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
	//mybox.print();

	//call the volume method
	
	double vol1 = mybox.volume();
	System.out.println("Vol1:"+vol1);
	System.out.println("Execution done for mybox");
	

	Box mybox_1 = new Box();
	mybox_1.width=15;
	mybox_1.height=12;
	mybox_1.depth=70;

	//mybox_1.print();
	double vol2 = mybox_1.volume();
	System.out.println("Vol2:"+vol2);	
	
	//check which volume is greater
	if(vol1 > vol2){
	System.out.println("Vol1 is larger"); }
	else {
	System.out.println("Vol2 is larger"); }



	Box mybox_2 = new Box();
	mybox_2.width=5;
	mybox_2.height=2;
	mybox_2.depth=8;
	//mybox_2.print();	

	mybox_2.volume();

	

	
  
}
}
