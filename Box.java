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
  
  
  void setDim(double w, double h, double d){
  	width = w;
  	height = h;
  	depth = d;
  
  }
  
  double calculateSize(double w, double h){
  
  	return w*h;
  
  }
 
  
  
}


class BoxDemo {
  public static void main(String args[]) {
  
  
  	Box mybox = new Box();
  	System.out.println("In BoxDemo class");
  	
  	//call print method before setting the values
  	mybox.print();
  	

	//call setDim by passing in the width,height,depth
	mybox.setDim(50,10,20);


	//call the volume method
	
	double vol1 = mybox.volume();
	System.out.println("Vol1:"+vol1);
	System.out.println("Execution done for mybox");
	

	Box mybox_1 = new Box();
	mybox_1.setDim(15,12,70);

	//mybox_1.print();
	double vol2 = mybox_1.volume();
	System.out.println("Vol2:"+vol2);	
	
	//check which volume is greater
	if(vol1 > vol2){
	System.out.println("Vol1 is larger"); }
	else {
	System.out.println("Vol2 is larger"); }



	Box mybox_2 = new Box();

	mybox_2.setDim(5,2,8);

	mybox_2.volume();
	
	
	double size = mybox_2.calculateSize(3,8);
	System.out.println("Size is : "+size);

	

	
  
}
}
