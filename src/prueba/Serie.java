
package prueba;


public class Serie {
    
    public static void main(String[]args){
		int i=1,j=99;
		System.out.println("serie con for");
		for(i=1; i<=5;i++){
		   if(i<5){
			System.out.print(i+",");
			System.out.print(j+",");
		   }else{
			System.out.print(i+",");
			System.out.print(j);
		     }
		   j--;
		}
		
                System.out.println("");
		i=1;j=99;

	System.out.println("ciclo con while");
	while(i<=5){
		if(i<5){
			System.out.print(i+",");
			System.out.print(j+",");
		   }else{
			System.out.print(i+",");
			System.out.print(j);
		     }
		i++;
		j--;
	}
	i=1;
	System.out.println("");

	System.out.println("ciclo con do-while");
	do{
		if(i<10){
			System.out.print(i+",");
		   }else{
			System.out.print(i);
		     }
		i++;
		
	}while(i<=10);
	System.out.println("");
        
	int a=0,b=1,c=0;
	for( i=0;a<10; i++){
            
	System.out.print(a+",");
	c=a+b;
	a=b;
	b=c;
	}

//MATRIZ
	
    }
}
