package inheritance;

public class MultiLevelParameterizedConstructors {
public static void main(String[] args) {
	
	//L objL = new L(1);
	N objN = new N(1,2,3);
	objN.k = 20;
	
	objN.printDetails();
	
	Q objQ = new Q();
	
	
}
}

class Q{
	
	
}
class L
{
    int i;
    L(int i)//L(1)
    {
        this.i = i;
        System.out.println("Created L");
    }
}

class M extends L
{
    int j;
    M(int i, int j)//M(1,2)
    {
        super(i); //super(1)
        this.j = j;
        System.out.println("Created M");
    }
}

class N extends M
{
    int k;
    N(int i, int j, int k) //N(1,2,3)
    {
        super(i, j);//super(1,2)
        this.k = k;
        System.out.println("Created N");
    }
    void printDetails() {
    	
    	System.out.println("I : "+ i + " J: "+j + " K:"+k);
    }
}
