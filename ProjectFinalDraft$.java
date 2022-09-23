import java.util.Scanner;
class ProjectFinalDraft$
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your option");
		System.out.println("");
		System.out.println("enter 1 for food");
		System.out.println("enter 2 for dress");
		System.out.println("enter 3 for accessories");
		System.out.println("enter 4 for transport booking");
		System.out.println("enter 5 for buying vehicles");
		int option = scan.nextInt();
		int sum=0;
		System.out.println("");
		System.out.println("enter your discount");
		double djk = scan.nextDouble();
		double summ=0;
		switch (option)
		{
			// This case 1 is used for food
		case 1 : System.out.println("welcome for food ");
		         System.out.println("");
		         System.out.println("enter your fav categeroy");
				 System.out.println("enter 1 for veg");
		         System.out.println("enter 2 for non veg");
		         int choose = scan.nextInt();
		switch (choose)
		{
			// This case 1 is used for veg section
		case 1 : System.out.println("you selected veg");
		         System.out.println("");
		         System.out.println("enter  option for your dish ");
				 System.out.println("enter 1 for paneer biryani");
		         System.out.println("enter 2 for roti with tamato curry");
		         System.out.println("enter 3 for roti with paneer curry");
		         System.out.println("enter 4 for chapathi with paneer curry");
		         System.out.println("enter 5 for parota");
		         System.out.println("enter 6 for tamato rice");
				  System.out.println("enter 7 for jeera rice");
		         int dish = scan.nextInt();
				 
				 switch (dish)
				 {
				 case 1 : System.out.println("you selected paneer biryani ");
				         int cost=150;
						 System.out.println("no of count");
		                 int count = scan.nextInt();
						 int  qq = cost * count ;
						  System.out.println("total bill is "+ qq);
						  sum=sum+qq;
						  System.out.println("");
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int axs=scan.nextInt();

						  if (axs==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (count>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				 case 2 : System.out.println("you selected roti with tamato curry ");
				         int c =99;
						 System.out.println("no of count");
		                 int d = scan.nextInt();
						     qq = c * d ;
						  System.out.println("total bill is "+qq);
						  sum=sum+qq;
						  System.out.println("");
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int axq=scan.nextInt();
						  if (axq==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (d>=5)
							  {
								  summ=sum*djk;
								  System.out.println( "final bill with discount    "+summ);
								   System.out.println("");
							  }
								  
							  break;
						  }
			     case 3 : System.out.println("you selected roti with paneer curry ");
				         int g =120;
						 System.out.println("no of count");
		                 int h = scan.nextInt();
						 int  j = g * h ;
						  System.out.println("total bill is "+j);
						  sum=sum+j;
						  System.out.println("");
						 System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int axa=scan.nextInt();

						  if (axa==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (h>=5)
							  {
								  summ=sum*djk;
								  System.out.println( "final bill with discount    "+summ);
								   System.out.println("");
							  }
								  
							  break;
						  }
			     case 4 : System.out.println("you selected chapathi with paneer curry ");
				         int k =110;
						 System.out.println("no of count");
		                 int l = scan.nextInt();
						 int  n = k * l ;
						  System.out.println("total bill is "+n);
						  sum=sum+n;
						  System.out.println("");
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int axsq=scan.nextInt();

						  if (axsq==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (l>=5)
							  {
								  summ=sum*djk;
								  System.out.println( "final bill with discount    "+summ);
								   System.out.println("");
							  }
								  
							  break;
						  }
				 case 5 : System.out.println("you selected parota ");
				         int o =40;
						 System.out.println("no of count");
		                 int p = scan.nextInt();
						 int  r = o * p;
						  System.out.println("total bill is "+r);
						  sum=sum+r;
						  System.out.println("");
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int axt=scan.nextInt();

						  if (axt==1)
						  {
							 System.out.println( "final bill    "+sum);
							  if (p>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								  
							  break;
						  }
				 case 6 : System.out.println("you selected Tamato rice ");
				         int s =80;
						 System.out.println("no of count");
		                 int t = scan.nextInt();
						 int  v = s * t ;
						  System.out.println("total bill is "+v);
						  sum=sum+v;
                          System.out.println("");
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int axl=scan.nextInt();

						  if (axl==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (t>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								  
							  break;
						  }
				 case 7 : System.out.println("you selected jeera rice ");
				         int w =70;
						 System.out.println("no of count");
		                 int x = scan.nextInt();
						 int  z = w * x ;
						  System.out.println("total bill is "+z);
						  sum=sum+z;
						  System.out.println( "final bill    "+sum);
							  if (x>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								  
							  
						    System.out.println("");
							System.out.println("enter your choice");
							  System.out.println("");
						   System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue with non veg");
							  int ixx=scan.nextInt();
							  
						  if (ixx==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (sum>=1250)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								  
							  break;
						  }

				          }         
		// This case 2 is used for non veg section
		case 2 : System.out.println("you selected non veg");
		         System.out.println("");
		         System.out.println("enter  option for your dish ");
				 System.out.println("enter 1 for chicken biryani");
		         System.out.println("enter 2 for chicken 65");
		         System.out.println("enter 3 for chicken majestic");
		         System.out.println("enter 4 for hyderabad chicken fry");
		         System.out.println("enter 5 for kheema biryani");
		         System.out.println("enter 6 for chicken drum sticks");
				  System.out.println("enter 7 for natukodi pulusu");
		         int item = scan.nextInt();
				 switch (item)
				 {
				 case 1 : System.out.println("you selected chicken biryani ");
				         int cost=150;
						 System.out.println("no of count");
		                 int count = scan.nextInt();
						 int fg = cost * count ;
						 sum=sum+fg;
						  System.out.println("total bill is "+fg);
						    System.out.println("");
						      System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int ax=scan.nextInt();

						  if (ax==1)
						  {
							 System.out.println( "final bill    "+sum);
							  if (count>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
						  
				 case 2 : System.out.println("you selected chicken 65 ");
				         int c =199;
						 System.out.println("no of count");
		                 int d = scan.nextInt();
						 int f = c * d ;
						  System.out.println("total bill is "+f);
						  sum=sum+f;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int bx=scan.nextInt();

						  if (bx==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (d>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
			     case 3 : System.out.println("you selected  chicken majestic ");
				         int g =120;
						 System.out.println("no of count");
		                 int h = scan.nextInt();
						 int  j = g * h ;
						  System.out.println("total bill is "+j);
						  sum=sum+j;
						 System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int cx=scan.nextInt();

						  if (cx==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (h>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
			     case 4 : System.out.println("you selected hyderabad chicken fry ");
				         int k =150;
						 System.out.println("no of count");
		                 int l = scan.nextInt();
						 int  n = k * l ;
						  System.out.println("total bill is "+n);
						  sum=sum+n;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int dx=scan.nextInt();

						  if (dx==1)
						  {
							 System.out.println( "final bill    "+sum);
							  if (l>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				 case 5 : System.out.println("you selected  kheema biryani ");
				         int o =240;
						 System.out.println("no of count");
		                 int p = scan.nextInt();
						 int  r = o * p ;
						  System.out.println("total bill is "+r);
						  sum=sum+r;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int ex=scan.nextInt();

						  if (ex==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (p>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				 case 6 : System.out.println("you selected chicken drum sticks ");
				         int s =180;
						 System.out.println("no of count");
		                 int t = scan.nextInt();
						 int  v = s * t ;
						  System.out.println("total bill is "+v);
						  sum=sum+v;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int fx=scan.nextInt();

						  if (fx==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (t>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				 case 7 : System.out.println("you selected  natukodi pulusu ");
				         int w =170;
						 System.out.println("no of count");
		                 int x = scan.nextInt();
						 int  z = w * x;
						  System.out.println("total bill is "+z);
						  sum=sum+z;
						  System.out.println( "final bill    "+sum);
						  System.out.println("");
						  System.out.println( "final bill    "+sum);
							  if (x>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							
				          }  
						 
		                  } 
						 
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for cotinue shopping");
							  int ix=scan.nextInt();

						  if (ix==1)
						  {
							   System.out.println( "final bill    "+sum);
							  if (sum>=2500)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
		// This case 2 is used for dress shopping
		case 2 : System.out.println("welcome for dress shopping ");
		         System.out.println("enter your fav categeroy");
				 System.out.println("enter 1 for child");
		         System.out.println("enter 2 for teenage");
				 System.out.println("enter 3 for adult");
		         System.out.println("enter 4 for oldage");
		         int f = scan.nextInt();
				 switch (f)
				 {
					 // This case 1 is used for kids shopping
				 case 1 :System.out.println("you selected kid dress");
				 System.out.println("enter 1 for girls");
				 System.out.println("enter 2 for boys");
		         int g = scan.nextInt();
				 switch (g)
				 {
					 // This case 1 is used for girls shopping
				 case 1: System.out.println("you selected girls section");
				 System.out.println("");
				 System.out.println("enter 1 for jeans pant& trouser");
		         System.out.println("enter 2 for shirt");
		         System.out.println("enter 3 for frock");
		         System.out.println("enter 4 for t-shirt");
		         System.out.println("enter 5 for tops");
		         System.out.println("enter 6 for night wear");
				  System.out.println("enter 7 for sports wear");
		         int d = scan.nextInt();
				 switch (d)
				 {
				 case 1 :
					     System.out.println("you selected jeans pant & trouser ");
				         int a=150;
						 System.out.println("no of count");
		                 int b = scan.nextInt();
						 int  hh = a * b;
						  System.out.println("total bill is "+ hh);
						  sum=sum+hh;
						 System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int axa=scan.nextInt();

						  if (axa==1)
						  {
							   System.out.println( "final bill    "+sum);
							  if (b>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				 case 2 :
					     System.out.println("you selected shirt ");
				         int e =100;
						 System.out.println("no of count");
		                 int oo = scan.nextInt();
						 int  h=e*oo;
						  System.out.println("total bill is "+h);
						  sum=sum+h;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int axb=scan.nextInt();

						  if (axb==1)
						  {
							   System.out.println( "final bill    "+sum);
							  if (oo>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				  case 3 :
					     System.out.println("you selected frock ");
				         int i=120;
						 System.out.println("no of count");
		                 int j = scan.nextInt();
						 int  l = i*j;
						  System.out.println("total bill is "+l);
						  sum=sum+l;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int axc=scan.nextInt();

						  if (axc==1)
						  {
							   System.out.println( "final bill    "+sum);
							  if (j>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				  case 4 :
					     System.out.println("you selected t-shirt ");
				         int m=100;
						 System.out.println("no of count");
		                 int n = scan.nextInt();
						 int  p = m*n;
						  System.out.println("total bill is "+p);
						  sum=sum+p;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int axd=scan.nextInt();

						  if (axd==1)
						  {
							   System.out.println( "final bill    "+sum);
							  if (n>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
			     case 5 :
					     System.out.println("you selected tops ");
				         int q=100;
						 System.out.println("no of count");
		                 int r = scan.nextInt();
						 int  t = q*r;
						  System.out.println("total bill is "+t);
						  sum=sum+t;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int axe=scan.nextInt();

						  if (axe==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (r>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
			     case 6 :
					     System.out.println("you selected night wear ");
				         int u=100;
						 System.out.println("no of count");
		                 int v = scan.nextInt();
						 int  x = u*v;
						  System.out.println("total bill is "+x);
						  sum=sum+x;
						 System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int axf=scan.nextInt();

						  if (axf==1)
						  {
							   System.out.println( "final bill    "+sum);
							  if (v>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				 case 7 :
					     System.out.println("you selected sports wear ");
				         int cost=100;
						 System.out.println("no of count");
		                 int count = scan.nextInt();
						 int  final_price = cost * count;
						  System.out.println("total bill is "+final_price);
						  sum=sum+final_price;

						   System.out.println( "final bill    "+sum);
							  if (count>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							 
						  

						 
				 } 
				 System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int axk=scan.nextInt();

						  if (axk==1)
						  {
							   System.out.println( "final bill    "+sum);
							  if (sum>=2500)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				 
				 // This case 2 is used for boys dress shopping
				 case 2: System.out.println("you selected boys section");
				 System.out.println("");
				 System.out.println("enter 1 for jeans pant& trouser");
		         System.out.println("enter 2 for shirt");
		         System.out.println("enter 3 for night wear");
		         System.out.println("enter 4 for t-shirt");
		         System.out.println("enter 5 for winter wear");
		         int qq = scan.nextInt();
				 switch (qq)
				 {
				 case 1 :
					     System.out.println("you selected jeans pant & trouser ");
				         int a=450;
						 System.out.println("no of count");
		                 int b = scan.nextInt();
						 int  hh = a * b;
						  System.out.println("total bill is "+ hh);
						  sum=sum+hh;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int axa=scan.nextInt();

						  if (axa==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (b>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				 case 2 :
					     System.out.println("you selected shirt ");
				         int e =100;
						 System.out.println("no of count");
		                 int oo = scan.nextInt();
						 int  h=e*oo;
						  System.out.println("total bill is "+h);
						  sum=sum+h;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int axb=scan.nextInt();

						  if (axb==1)
						  {
							   System.out.println( "final bill    "+sum);
							  if (oo>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				  case 3 :
					     System.out.println("you selected night wear ");
				         int i=120;
						 System.out.println("no of count");
		                 int j = scan.nextInt();
						 int  l = i*j;
						  System.out.println("total bill is "+l);
						  sum=sum+l;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int axc=scan.nextInt();

						  if (axc==1)
						  {
							   System.out.println( "final bill    "+sum);
							  if (j>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				  case 4 :
					     System.out.println("you selected t-shirt ");
				         int m=100;
						 System.out.println("no of count");
		                 int n = scan.nextInt();
						 int  p = m*n;
						  System.out.println("total bill is "+p);
						  sum=sum+p;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int axd=scan.nextInt();

						  if (axd==1)
						  {
							   System.out.println( "final bill    "+sum);
							  if (n>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
			     case 5 :
					     System.out.println("you selected winter wear ");
				         int q=150;
						 System.out.println("no of count");
		                 int r = scan.nextInt();
						 int  t = q*r;
						  System.out.println("total bill is "+t);
						  sum=sum+t;
						   System.out.println( "final bill    "+sum);
							  if (r>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  
						  
				 }
				 }
				 System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int axa=scan.nextInt();

						  if (axa==1)
						  {
							   System.out.println( "final bill    "+sum);
							  if (sum>=5000)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }

// This case 2 is used for teenager dress shopping
                 case 2 :System.out.println("you selected teenager");
				 System.out.println("enter 1 for girls");
				 System.out.println("enter 2 for boys");
		         int jj = scan.nextInt();
				 switch (jj)
				 {
					 // This case 1 is used for girls dress shopping
				 case 1: System.out.println("you selected girls section");
				 System.out.println("");
				 System.out.println("enter 1 for jeans pant& trouser");
		         System.out.println("enter 2 for shirt");
		         System.out.println("enter 3 for frock");
		         System.out.println("enter 4 for t-shirt");
		         System.out.println("enter 5 for tops");
		         System.out.println("enter 6 for night wear");
				  System.out.println("enter 7 for sports wear");
		         int ol = scan.nextInt();
				 switch (ol)
				 {
				 case 1 :
					     System.out.println("you selected jeans pant & trouser ");
				         int a=250;
						 System.out.println("no of count");
		                 int b = scan.nextInt();
						 int  hh = a * b;
						  System.out.println("total bill is "+ hh);
						  sum=sum+hh;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int aba=scan.nextInt();

						  if (aba==1)
						  {
							   System.out.println( "final bill    "+sum);
							  if (b>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				 case 2 :
					     System.out.println("you selected shirt ");
				         int e =200;
						 System.out.println("no of count");
		                 int oo = scan.nextInt();
						 int  h=e*oo;
						  System.out.println("total bill is "+h);
						  sum=sum+h;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int abb=scan.nextInt();

						  if (abb==1)
						  {
							   System.out.println( "final bill    "+sum);
							  if (oo>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				  case 3 :
					     System.out.println("you selected frock ");
				         int i=220;
						 System.out.println("no of count");
		                 int j = scan.nextInt();
						 int  l = i*j;
						  System.out.println("total bill is "+l);
						  sum=sum+l;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int abc=scan.nextInt();

						  if (abc==1)
						  {
							   System.out.println( "final bill    "+sum);
							  if (j>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				  case 4 :
					     System.out.println("you selected t-shirt ");
				         int m=200;
						 System.out.println("no of count");
		                 int n = scan.nextInt();
						 int  p = m*n;
						  System.out.println("total bill is "+p);
						  sum=sum+p;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int abd=scan.nextInt();

						  if (abd==1)
						  {
							   System.out.println( "final bill    "+sum);
							  if (n>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
			     case 5 :
					     System.out.println("you selected tops ");
				         int q=300;
						 System.out.println("no of count");
		                 int r = scan.nextInt();
						 int  t = q*r;
						  System.out.println("total bill is "+t);
						  sum=sum+t;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int abe=scan.nextInt();

						  if (abe==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (r>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
			     case 6 :
					     System.out.println("you selected night wear ");
				         int u=500;
						 System.out.println("no of count");
		                 int v = scan.nextInt();
						 int  x = u*v;
						  System.out.println("total bill is "+x);
						  sum=sum+x;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int abf=scan.nextInt();

						  if (abf==1)
						  {
							   System.out.println( "final bill    "+sum);
							  if (v>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				 case 7 :
					     System.out.println("you selected sports wear ");
				         int cost=200;
						 System.out.println("no of count");
		                 int count = scan.nextInt();
						 int  final_price = cost * count ;
						  System.out.println("total bill is "+final_price);
						  sum=sum+final_price;
						   System.out.println( "final bill    "+sum);
							  if (count>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  
				

				 } 
				 System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue boy's selection");
							  int abl=scan.nextInt();

						  if (abl==1)
						  {
							 System.out.println( "final bill    "+sum);
							  if (sum>=5000)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  
						  }
				 
				 // This case 2 is used for BOYS dress shopping
				 case 2: System.out.println("you selected boys section");
				 System.out.println("");
				 System.out.println("enter 1 for jeans pant& trouser");
		         System.out.println("enter 2 for shirt");
		         System.out.println("enter 3 for night wear");
		         System.out.println("enter 4 for t-shirt");
		         System.out.println("enter 5 for winter wear");
		         int uu = scan.nextInt();
				 switch (uu)
				 {
				 case 1 :
					     System.out.println("you selected jeans pant & trouser ");
				         int a=850;
						 System.out.println("no of count");
		                 int b = scan.nextInt();
						int  hh = a * b;
						  System.out.println("total bill is "+ hh);
						  sum=sum+hh;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a1=scan.nextInt();

						  if (a1==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (b>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				 case 2 :
					     System.out.println("you selected shirt ");
				         int e =200;
						 System.out.println("no of count");
		                 int oo = scan.nextInt();
						 int  h=e*oo;
						  System.out.println("total bill is "+h);
						  sum=sum+h;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a2=scan.nextInt();

						  if (a2==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (oo>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				  case 3 :
					     System.out.println("you selected night wear ");
				         int i=320;
						 System.out.println("no of count");
		                 int j = scan.nextInt();
						 int  l = i*j;
						  System.out.println("total bill is "+l);
						  sum=sum+l;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a3=scan.nextInt();

						  if (a3==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (j>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				  case 4 :
					     System.out.println("you selected t-shirt ");
				         int m=300;
						 System.out.println("no of count");
		                 int n = scan.nextInt();
						 int  p = m*n;
						  System.out.println("total bill is "+p);
						  sum=sum+p;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a4=scan.nextInt();

						  if (a4==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (n>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
			     case 5 :
					     System.out.println("you selected winter wear ");
				         int q=450;
						 System.out.println("no of count");
		                 int r = scan.nextInt();
						 int  t = q*r;
						  System.out.println("total bill is "+t);
						  sum=sum+t;
						  System.out.println( "final bill    "+sum);
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue adult selection");
							  int a5=scan.nextInt();

						  if (a5==1)
						  {
							 System.out.println( "final bill    "+sum);
							  if (r>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  
						  }
						  
			    
				 }
				 }
			
				 // This case 3 is used for adult dress shopping
				  case 3 :System.out.println("you selected adult");
				 System.out.println("enter 1 for girls");
				 System.out.println("enter 2 for boys");
		         int kkk = scan.nextInt();
				 switch (kkk)
				 {
					 // This case 1 is used for girls selection
				 case 1: System.out.println("you selected girls section");
				 System.out.println("");
				 System.out.println("enter 1 for jeans pant& trouser");
		         System.out.println("enter 2 for shirt");
		         System.out.println("enter 3 for frock");
		         System.out.println("enter 4 for t-shirt");
		         System.out.println("enter 5 for tops");
		         System.out.println("enter 6 for night wear");
				  System.out.println("enter 7 for sports wear");
		         int ol = scan.nextInt();
				 switch (ol)
				 {
				 case 1 :
					     System.out.println("you selected jeans pant & trouser ");
				         int a=350;
						 System.out.println("no of count");
		                 int b = scan.nextInt();
						 int  hh = a * b;
						  System.out.println("total bill is "+ hh);
						  sum=sum+hh;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a1=scan.nextInt();

						  if (a1==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (b>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				 case 2 :
					     System.out.println("you selected shirt ");
				         int e =205;
						 System.out.println("no of count");
		                 int oo = scan.nextInt();
						 int  h=e*oo;
						  System.out.println("total bill is "+h);
						  sum=sum+h;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a2=scan.nextInt();

						  if (a2==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (oo>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				  case 3 :
					     System.out.println("you selected frock ");
				         int i=220;
						 System.out.println("no of count");
		                 int j = scan.nextInt();
						 int  l = i*j;
						  System.out.println("total bill is "+l);
						  sum=sum+l;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a3=scan.nextInt();

						  if (a3==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (j>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				  case 4 :
					     System.out.println("you selected t-shirt ");
				         int m=250;
						 System.out.println("no of count");
		                 int n = scan.nextInt();
						 int  p = m*n;
						  System.out.println("total bill is "+p);
						  sum=sum+p;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a4=scan.nextInt();

						  if (a4==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (n>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
			     case 5 :
					     System.out.println("you selected tops ");
				         int q=350;
						 System.out.println("no of count");
		                 int r = scan.nextInt();
						 int  t = q*r;
						  System.out.println("total bill is "+t);
						  sum=sum+t;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a5=scan.nextInt();

						  if (a5==1)
						  {
							 System.out.println( "final bill    "+sum);
							  if (r>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
			     case 6 :
					     System.out.println("you selected night wear ");
				         int u=580;
						 System.out.println("no of count");
		                 int v = scan.nextInt();
						 int  x = u*v;
						  System.out.println("total bill is "+x);
						  sum=sum+x;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a6=scan.nextInt();

						  if (a6==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (v>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				 case 7 :
					     System.out.println("you selected sports wear ");
				         int cost=250;
						 System.out.println("no of count");
		                 int count = scan.nextInt();
						 int  final_price = cost * count ;
						  System.out.println("total bill is "+final_price);
						  sum=sum+final_price;
						  System.out.println( "final bill    "+sum);
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue boys selection");
							  int a7=scan.nextInt();

						  if (a7==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (count>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  
						  }
				

				 } 
				 
				 // This case 2 is used for boys selection
				 case 2: System.out.println("you selected boys section");
				 System.out.println("");
				 System.out.println("enter 1 for jeans pant& trouser");
		         System.out.println("enter 2 for shirt");
		         System.out.println("enter 3 for night wear");
		         System.out.println("enter 4 for t-shirt");
		         System.out.println("enter 5 for winter wear");
		         int uu = scan.nextInt();
				 switch (uu)
				 {
				 case 1 :
					     System.out.println("you selected jeans pant & trouser ");
				         int a=250;
						 System.out.println("no of count");
		                 int b = scan.nextInt();
						 int  hh = a * b;
						  System.out.println("total bill is "+ hh);
						  sum=sum+hh;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a1=scan.nextInt();

						  if (a1==1)
						  {
							 System.out.println( "final bill    "+sum);
							  if (b>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				 case 2 :
					     System.out.println("you selected shirt ");
				         int e =280;
						 System.out.println("no of count");
		                 int oo = scan.nextInt();
						 int  h=e*oo;
						  System.out.println("total bill is "+h);
						  sum=sum+h;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a2=scan.nextInt();

						  if (a2==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (oo>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				  case 3 :
					     System.out.println("you selected night wear ");
				         int i=120;
						 System.out.println("no of count");
		                 int j = scan.nextInt();
						 int  l = i*j;
						  System.out.println("total bill is "+l);
						  sum=sum+l;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a3=scan.nextInt();

						  if (a3==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (j>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				  case 4 :
					     System.out.println("you selected t-shirt ");
				         int m=320;
						 System.out.println("no of count");
		                 int n = scan.nextInt();
						 int  p = m*n;
						  System.out.println("total bill is "+p);
						  sum=sum+p;
						  System.out.println( "final bill    "+sum);
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a4=scan.nextInt();

						  if (a4==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (n>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
			     case 5 :
					     System.out.println("you selected winter wear ");
				         int q=450;
						 System.out.println("no of count");
		                 int r = scan.nextInt();
						 int  t = q*r;
						  System.out.println("total bill is "+t);
						  sum=sum+t;
						  System.out.println( "final bill    "+sum);
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue oldage selection");
							  int a5=scan.nextInt();

						  if (a5==1)
						  {
							 System.out.println( "final bill    "+sum);
							  if (r>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  
						  }
			    
				 }
				 } 
				 // This case 4 is used for oldage dress shopping
				 case 4 :System.out.println("you selected oldage selection");
				 System.out.println("enter 1 for girls");
				 System.out.println("enter 2 for boys");
		         int kkl = scan.nextInt();
				 switch (kkl)
				 {
				 case 1: System.out.println("you selected girls section");
				 System.out.println("");
				 System.out.println("enter 1 for jeans pant& trouser");
		         System.out.println("enter 2 for shirt");
		         System.out.println("enter 3 for frock");
		         System.out.println("enter 4 for t-shirt");
		         System.out.println("enter 5 for tops");
		         System.out.println("enter 6 for night wear");
				  System.out.println("enter 7 for sports wear");
		         int ol = scan.nextInt();
				 switch (ol)
				 {
					 // This case 1 is used for girls selection
				 case 1 :
					     System.out.println("you selected jeans pant & trouser ");
				         int a=350;
						 System.out.println("no of count");
		                 int b = scan.nextInt();
						 int  hh = a * b;
						  System.out.println("total bill is "+ hh);
						  sum=sum+hh;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a1=scan.nextInt();

						  if (a1==1)
						  {
							 System.out.println( "final bill    "+sum);
							  if (b>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				 case 2 :
					     System.out.println("you selected shirt ");
				         int e =205;
						 System.out.println("no of count");
		                 int oo = scan.nextInt();
						 int  h=e*oo;
						  System.out.println("total bill is "+h);
						  sum=sum+h;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a2=scan.nextInt();

						  if (a2==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (oo>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				  case 3 :
					     System.out.println("you selected frock ");
				         int i=220;
						 System.out.println("no of count");
		                 int j = scan.nextInt();
						 int l = i*j;
						  System.out.println("total bill is "+l);
						  sum=sum+l;
						 System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a3=scan.nextInt();

						  if (a3==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (j>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				  case 4 :
					     System.out.println("you selected t-shirt ");
				         int m=250;
						 System.out.println("no of count");
		                 int n = scan.nextInt();
						 int  p = m*n;
						  System.out.println("total bill is "+p);
						  sum=sum+p;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a4=scan.nextInt();

						  if (a4==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (n>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
			     case 5 :
					     System.out.println("you selected tops ");
				         int q=350;
						 System.out.println("no of count");
		                 int r = scan.nextInt();
						 int  t = q*r;
						  System.out.println("total bill is "+t);
						  sum=sum+t;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a5=scan.nextInt();

						  if (a5==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (r>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
			     case 6 :
					     System.out.println("you selected night wear ");
				         int u=580;
						 System.out.println("no of count");
		                 int v = scan.nextInt();
						 int  x = u*v;
						  System.out.println("total bill is "+x);
						  sum=sum+x;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a6=scan.nextInt();

						  if (a6==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (v>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				 case 7 :
					     System.out.println("you selected sports wear ");
				         int cost=250;
						 System.out.println("no of count");
		                 int count = scan.nextInt();
						 int  final_price = cost * count ;
						  System.out.println("total bill is "+final_price);
						  sum=sum+final_price;
						  System.out.println( "final bill    "+sum);
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue boys selection");
							  int a7=scan.nextInt();

						  if (a7==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (sum>=5000)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				

				 } 
				 
				 // This case 2 is used for boys selection
				 case 2: System.out.println("you selected boys section");
				 System.out.println("");
				 System.out.println("enter 1 for jeans pant& trouser");
		         System.out.println("enter 2 for shirt");
		         System.out.println("enter 3 for night wear");
		         System.out.println("enter 4 for t-shirt");
		         System.out.println("enter 5 for winter wear");
		         int uu = scan.nextInt();
				 switch (uu)
				 {
				 case 1 :
					     System.out.println("you selected jeans pant & trouser ");
				         int a=250;
						 System.out.println("no of count");
		                 int b = scan.nextInt();
						 int  hh = a * b;
						  System.out.println("total bill is "+ hh);
						  sum=sum+hh;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a1=scan.nextInt();

						  if (a1==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (b>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				 case 2 :
					     System.out.println("you selected shirt ");
				         int e =280;
						 System.out.println("no of count");
		                 int oo = scan.nextInt();
						 int h=e*oo;
						  System.out.println("total bill is "+h);
						  sum=sum+h;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a2=scan.nextInt();

						  if (a2==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (oo>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				  case 3 :
					     System.out.println("you selected night wear ");
				         int i=120;
						 System.out.println("no of count");
		                 int j = scan.nextInt();
						 int  l = i*j;
						  System.out.println("total bill is "+l);
						  sum=sum+l;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a3=scan.nextInt();

						  if (a3==1)
						  {
							  System.out.println( "final bill    "+sum);
							  if (j>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
				  case 4 :
					     System.out.println("you selected t-shirt ");
				         int m=320;
						 System.out.println("no of count");
		                 int n = scan.nextInt();
						 int  p = m*n;
						  System.out.println("total bill is "+p);
						  sum=sum+p;
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a4=scan.nextInt();

						  if (a4==1)
						  {
							 System.out.println( "final bill    "+sum);
							  if (n>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  break;
						  }
			     case 5 :
					     System.out.println("you selected winter wear ");
				         int q=450;
						 System.out.println("no of count");
		                 int r = scan.nextInt();
						 int  t = q*r;
						  System.out.println("total bill is "+t);
						  sum=sum+t;
						  System.out.println( "final bill    "+sum);
							  if (r>=5)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue accessories shopping");
							  int a5=scan.nextInt();

						  if (a5==1)
						  {
							 System.out.println( "final bill    "+sum);
							  if (sum>=5000)
							  {
								  summ=sum*djk;
								   System.out.println( "final bill with discount    "+summ);
								  System.out.println("");
							  }
								 
	
							  
						  }
						  
			    
				 
				 }
				 }
				 
				 }
				 
		// This case 3 is used for accessories shopping
		case 3 : System.out.println("welcome for accessories shopping ");
		         System.out.println("");
		         System.out.println("enter your category ");
				 System.out.println("enter 1 for girls ");
		         System.out.println("enter 2 for boys");
				
		         int fa = scan.nextInt();
				 switch (fa)
				 {
					 // This case 1 is used for girl section
				 case 1 :System.out.println("you selected girls");
				  System.out.println("");
				 System.out.println("enter 1 for  rings");
				 System.out.println("enter 2 for bracelets");
				 System.out.println("enter 3 for handbag");
		         System.out.println("enter 4 for cosmetic case");
		         System.out.println("enter 5 for necklace");
		         int g = scan.nextInt();
				 switch (g)
				{
                // This case 1 is used for ring section
				 case 1 :System.out.println("you selected rings");
				         System.out.println("");
						 System.out.println("enter your option");
				         System.out.println("enter 1 for gold");
				         System.out.println("enter 2 for silver");
				         System.out.println("enter 3 for platinum");
		                 System.out.println("enter 4 for diamond");
						  int p = scan.nextInt();
						 switch (p)
						 {
					 case 1:System.out.println("you selected gold");
						 int a =47000;
						 System.out.println("no of grams");
		                 int b = scan.nextInt();
						 System.out.println("enter your discount");
		                 double y = scan.nextDouble();
						 double z = a * b * y;
						  System.out.println("total bill is "+z);
						  summ=summ+z;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a1=scan.nextInt();

						  if (a1==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
					 case 2:System.out.println("you selected silver");
						 int d =17000;
						 System.out.println("no of grams");
		                 int e = scan.nextInt();
						 System.out.println("enter your discount");
		                 double i = scan.nextDouble();
						 double k = d * e * i;
						  System.out.println("total bill is "+k);
						   summ=summ+k;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a2=scan.nextInt();

						  if (a2==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
					 case 3:System.out.println("you selected platinum");
						 int dd =57000;
						 System.out.println("no of grams");
		                 int ee = scan.nextInt();
						 System.out.println("enter your discount");
		                 double ii = scan.nextDouble();
						 double kk= dd * ee * ii;
						  System.out.println("total bill is "+kk);
						   summ=summ+kk;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a3=scan.nextInt();

						  if (a3==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
					 case 4:System.out.println("you selected diamond");
						 int ddd =87000;
						 System.out.println("no of carat");
		                 int eee = scan.nextInt();
						 System.out.println("enter your discount");
		                 double iii = scan.nextDouble();
						 double kkk= ddd * eee * iii;
						  System.out.println("total bill is "+kkk);
						   summ=summ+kkk;
						   System.out.println( "final bill    "+summ);
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue bracelets");
							  int a4=scan.nextInt();

						  if (a4==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
						 }
				        // This case 2 is used for bracelet section
                      case 2 :System.out.println("you selected bracelet");
				         System.out.println("");
						 System.out.println("enter your option");
				         System.out.println("enter 1 for gold");
				         System.out.println("enter 2 for silver");
				         System.out.println("enter 3 for platinum");
		                 System.out.println("enter 4 for diamond");
						  int ps = scan.nextInt();
						 switch (ps)
						 {
					 case 1:System.out.println("you selected gold");
						 int a =47000;
						 System.out.println("no of grams");
		                 int b = scan.nextInt();
						 System.out.println("enter your discount");
		                 double y = scan.nextDouble();
						 double z = a * b * y;
						  System.out.println("total bill is "+z);
						   summ=summ+z;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a1=scan.nextInt();

						  if (a1==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
					 case 2:System.out.println("you selected silver");
						 int d =17000;
						 System.out.println("no of grams");
		                 int e = scan.nextInt();
						 System.out.println("enter your discount");
		                 double i = scan.nextDouble();
						 double k = d * e * i;
						  System.out.println("total bill is "+k);
						   summ=summ+k;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a2=scan.nextInt();

						  if (a2==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
					 case 3:System.out.println("you selected platinum");
						 int dd =57000;
						 System.out.println("no of grams");
		                 int ee = scan.nextInt();
						 System.out.println("enter your discount");
		                 double ii = scan.nextDouble();
						 double kk= dd * ee * ii;
						  System.out.println("total bill is "+kk);
						   summ=summ+kk;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a3=scan.nextInt();

						  if (a3==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
					 case 4:System.out.println("you selected diamond");
						 int ddd =87000;
						 System.out.println("no of carat");
		                 int eee = scan.nextInt();
						 System.out.println("enter your discount");
		                 double iii = scan.nextDouble();
						 double kkk= ddd * eee * iii;
						  System.out.println("total bill is "+kkk);
						   summ=summ+kkk;
						   System.out.println( "final bill    "+summ);
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue handbags");
							  int a4=scan.nextInt();

						  if (a4==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
						 
				 }  
				   
				 // This case 3 is used for handbag section

				 case 3 :System.out.println("you selected handbag");
				         System.out.println("");
						 System.out.println("enter your option");
				         System.out.println("enter 1 for tote bag");
				         System.out.println("enter 2 for messenger bag");
				         System.out.println("enter 3 for backpack");
		                 System.out.println("enter 4 for sling bag");
						  int dsp = scan.nextInt();
						 switch (dsp)
						 {
					 case 1:System.out.println("you selected tote bag");
						 int as =400;
						 System.out.println("no of count");
		                 int bs = scan.nextInt();
						 int  zs = as * bs ;
						  System.out.println("total bill is "+zs);
						  sum=sum+zs;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a1=scan.nextInt();

						  if (a1==1)
						  {
							  System.out.println( "final bill    "+sum);
							  break;
						  };
					 case 2:System.out.println("you selected messenger bag");
						 int ds =100;
						 System.out.println("no of count");
		                 int es = scan.nextInt();
						 int  ks = ds * es ;
						  System.out.println("total bill is "+ks);
						  sum=sum+ks;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a2=scan.nextInt();

						  if (a2==1)
						  {
							  System.out.println( "final bill    "+sum);
							  break;
						  }
					 case 3:System.out.println("you selected backpack");
						 int dds =570;
						 System.out.println("no of count");
		                 int ees = scan.nextInt();
						 int  kks= dds * ees ;
						  System.out.println("total bill is "+kks);
						  sum=sum+kks;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a3=scan.nextInt();

						  if (a3==1)
						  {
							  System.out.println( "final bill    "+sum);
							  break;
						  }
					 case 4:System.out.println("you selected sling bag");
						 int ddds =870;
						 System.out.println("no of count");
		                 int eees = scan.nextInt();
						 int kkks= ddds* eees ;
						  System.out.println("total bill is "+kkks);
						  sum=sum+kkks;
						  System.out.println( "final bill    "+sum);
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue for cosmetic case");
							  int a4=scan.nextInt();

						  if (a4==1)
						  {
							  System.out.println( "final bill    "+sum);
							  break;
						  }
						 }
						 // This case 4 is used for cosmetic case section

                          case 4 :System.out.println("you selected cosmetic case");
				         System.out.println("");
						 System.out.println("enter your option");
				         System.out.println("enter 1 for small");
				         System.out.println("enter 2 for medium");
				         System.out.println("enter 3 for big");
						  int pss= scan.nextInt();
						 switch (pss)
						 {
					 case 1:System.out.println("you selected small");
						 int a =470;
						 System.out.println("no of count");
		                 int b = scan.nextInt();
						 int  z = a * b ;
						  System.out.println("total bill is "+z);
						  sum=sum+z;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a1=scan.nextInt();

						  if (a1==1)
						  {
							  System.out.println( "final bill    "+sum);
							  break;
						  }
					 case 2:System.out.println("you selected medium");
						 int d =1700;
						 System.out.println("no of count");
		                 int e = scan.nextInt();
						 int  k = d * e ;
						  System.out.println("total bill is "+k);
						  sum=sum+k;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a2=scan.nextInt();

						  if (a2==1)
						  {
							  System.out.println( "final bill    "+sum);
							  break;
						  }
					 case 3:System.out.println("you selected big");
						 int dd =5700;
						 System.out.println("no of count");
		                 int ee = scan.nextInt();
						 int  kk= dd * ee ;
						  System.out.println("total bill is "+kk);
						  sum=sum+kk;
						  System.out.println( "final bill    "+sum);
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue for necklace");
							  int a3=scan.nextInt();

						  if (a3==1)
						  {
							  System.out.println( "final bill    "+sum);
							  break;
						  }
				        }  
						// This case 5 is used for necklace section
				
                          case 5 :System.out.println("you selected necklace");
				         System.out.println("");
						 System.out.println("enter your option");
				         System.out.println("enter 1 for gold");
				         System.out.println("enter 2 for silver");
				         System.out.println("enter 3 for platinum");
		                 System.out.println("enter 4 for diamond");
						  int pse = scan.nextInt();
						 switch (pse)
						 {
					 case 1:System.out.println("you selected gold");
						 int a =47000;
						 System.out.println("no of grams");
		                 int b = scan.nextInt();
						 System.out.println("enter your discount");
		                 double y = scan.nextDouble();
						 double z = a * b * y;
						  System.out.println("total bill is "+z);
						   summ=summ+z;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a1=scan.nextInt();

						  if (a1==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
					 case 2:System.out.println("you selected silver");
						 int d =17000;
						 System.out.println("no of grams");
		                 int e = scan.nextInt();
						 System.out.println("enter your discount");
		                 double i = scan.nextDouble();
						 double k = d * e * i;
						  System.out.println("total bill is "+k);
						   summ=summ+k;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a2=scan.nextInt();

						  if (a2==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
					 case 3:System.out.println("you selected platinum");
						 int dd =57000;
						 System.out.println("no of grams");
		                 int ee = scan.nextInt();
						 System.out.println("enter your discount");
		                 double ii = scan.nextDouble();
						 double kk= dd * ee * ii;
						  System.out.println("total bill is "+kk);
						   summ=summ+kk;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a3=scan.nextInt();

						  if (a3==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
					 case 4:System.out.println("you selected diamond");
						 int ddd =87000;
						 System.out.println("no of carat");
		                 int eee = scan.nextInt();
						 System.out.println("enter your discount");
		                 double iii = scan.nextDouble();
						 double kkk= ddd * eee * iii;
						  System.out.println("total bill is "+kkk);
						   summ=summ+kkk;
						   System.out.println( "final bill    "+summ);
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue boys selection");
							  int a4=scan.nextInt();

						  if (a4==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
				         }  

				         } 
						 // This case 2 is used for boys section
						  case 2 :System.out.println("you selected boys");
				         System.out.println("");
				        System.out.println("enter 1 for chains");
				        System.out.println("enter 2 for bracelets");
		                System.out.println("enter 3 for watches");
		                 int gd = scan.nextInt();
						 switch (gd)
						 {
							 // This case 1 is used for chain section
						 case 1:System.out.println("you selected chain");
				         System.out.println("");
						 System.out.println("enter your option");
				         System.out.println("enter 1 for gold");
				         System.out.println("enter 2 for silver");
				         System.out.println("enter 3 for platinum");
		                 System.out.println("enter 4 for diamond");
						  int pse = scan.nextInt();
						 switch (pse)
						 {
					 case 1:System.out.println("you selected gold");
						 int a =47000;
						 System.out.println("no of grams");
		                 int b = scan.nextInt();
						 System.out.println("enter your discount");
		                 double y = scan.nextDouble();
						 double z = a * b * y;
						  System.out.println("total bill is "+z);
						   summ=summ+z;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a1=scan.nextInt();

						  if (a1==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
					 case 2:System.out.println("you selected silver");
						 int d =17000;
						 System.out.println("no of grams");
		                 int e = scan.nextInt();
						 System.out.println("enter your discount");
		                 double i = scan.nextDouble();
						 double k = d * e * i;
						  System.out.println("total bill is "+k);
						   summ=summ+k;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a2=scan.nextInt();

						  if (a2==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
					 case 3:System.out.println("you selected platinum");
						 int dd =57000;
						 System.out.println("no of grams");
		                 int ee = scan.nextInt();
						 System.out.println("enter your discount");
		                 double ii = scan.nextDouble();
						 double kk= dd * ee * ii;
						  System.out.println("total bill is "+kk);
						   summ=summ+kk;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a3=scan.nextInt();

						  if (a3==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
					 case 4:System.out.println("you selected diamond");
						 int ddd =87000;
						 System.out.println("no of carat");
		                 int eee = scan.nextInt();
						 System.out.println("enter your discount");
		                 double iii = scan.nextDouble();
						 double kkk= ddd * eee * iii;
						  System.out.println("total bill is "+kkk);
						   summ=summ+kkk;
						   System.out.println( "final bill    "+summ);
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue for bracelets");
							  int a4=scan.nextInt();

						  if (a4==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
				         }
						 // This case 2 is used for bracelets section
						 case 2:
							 System.out.println("you selected bracelets");
				         System.out.println("");
						 System.out.println("enter your option");
				         System.out.println("enter 1 for gold");
				         System.out.println("enter 2 for silver");
				         System.out.println("enter 3 for platinum");
		                 System.out.println("enter 4 for diamond");
						  int pses = scan.nextInt();
						 switch (pses)
						 {
					 case 1:System.out.println("you selected gold");
						 int a =47000;
						 System.out.println("no of grams");
		                 int b = scan.nextInt();
						 System.out.println("enter your discount");
		                 double y = scan.nextDouble();
						 double z = a * b * y;
						  System.out.println("total bill is "+z);
						   summ=summ+z;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a1=scan.nextInt();

						  if (a1==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
					 case 2:System.out.println("you selected silver");
						 int d =17000;
						 System.out.println("no of grams");
		                 int e = scan.nextInt();
						 System.out.println("enter your discount");
		                 double i = scan.nextDouble();
						 double k = d * e * i;
						  System.out.println("total bill is "+k);
						   summ=summ+k;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a2=scan.nextInt();

						  if (a2==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
					 case 3:System.out.println("you selected platinum");
						 int dd =57000;
						 System.out.println("no of grams");
		                 int ee = scan.nextInt();
						 System.out.println("enter your discount");
		                 double ii = scan.nextDouble();
						 double kk= dd * ee * ii;
						  System.out.println("total bill is "+kk);
						   summ=summ+kk;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a3=scan.nextInt();

						  if (a3==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
					 case 4:System.out.println("you selected diamond");
						 int ddd =87000;
						 System.out.println("no of carat");
		                 int eee = scan.nextInt();
						 System.out.println("enter your discount");
		                 double iii = scan.nextDouble();
						 double kkk= ddd * eee * iii;
						  System.out.println("total bill is "+kkk);
						   summ=summ+kkk;
						   System.out.println( "final bill    "+summ);
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue for watches");
							  int a4=scan.nextInt();

						  if (a4==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
				         }
						 // This case 3 is used for watches section
						 case 3:
							 System.out.println("you selected watches");
				         System.out.println("");
						 System.out.println("enter your option");
				         System.out.println("enter 1 for boat smart");
				         System.out.println("enter 2 for oneplus ");
				         System.out.println("enter 3 for fossil");
		                 System.out.println("enter 4 for titan");
						  int pseu = scan.nextInt();
						 switch (pseu)
						 {
					 case 1:System.out.println("you selected boat smart");
						 int a =1500;
						 System.out.println("no of count");
		                 int b = scan.nextInt();
						 System.out.println("enter your discount");
		                 double y = scan.nextDouble();
						 double z = a * b * y;
						  System.out.println("total bill is "+z);
						   summ=summ+z;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a1=scan.nextInt();

						  if (a1==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
					 case 2:System.out.println("you selected oneplus");
						 int d =1700;
						 System.out.println("no of count");
		                 int e = scan.nextInt();
						 System.out.println("enter your discount");
		                 double i = scan.nextDouble();
						 double k = d * e * i;
						  System.out.println("total bill is "+k);
						   summ=summ+k;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a2=scan.nextInt();

						  if (a2==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
					 case 3:System.out.println("you selected fossil");
						 int dd =5700;
						 System.out.println("no of count");
		                 int ee = scan.nextInt();
						 System.out.println("enter your discount");
		                 double ii = scan.nextDouble();
						 double kk= dd * ee * ii;
						  System.out.println("total bill is "+kk);
						   summ=summ+kk;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a3=scan.nextInt();

						  if (a3==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
					 case 4:System.out.println("you selected titan");
						 int ddd =8700;
						 System.out.println("no of count");
		                 int eee = scan.nextInt();
						 System.out.println("enter your discount");
		                 double iii = scan.nextDouble();
						 double kkk= ddd * eee * iii;
						  System.out.println("total bill is "+kkk);
						   summ=summ+kkk;
						   System.out.println( "final bill    "+summ);
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue transport booking");
							  int a4=scan.nextInt();

						  if (a4==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
						 
				         }

						 }

						 }
						 
						 // This case 4 is used for transport booking section
						 case 4: System.out.println("you selected transport booking");
				         System.out.println("");
						 System.out.println("enter your option");
				         System.out.println("enter 1 for bike");
				         System.out.println("enter 2 for car");
				         System.out.println("enter 3 for van");
		                 System.out.println("enter 4 for auto");
						  int psess = scan.nextInt();
						 switch (psess)
						 {
					 case 1:System.out.println("you selected bike");
						 int a =15;
						 System.out.println("no of km");
		                 int b = scan.nextInt();
						 int z = a * b ;
						  System.out.println("total bill is "+z);
						  sum=sum+z;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a1=scan.nextInt();

						  if (a1==1)
						  {
							  System.out.println( "final bill    "+sum);
							  break;
						  }
					 case 2:System.out.println("you selected car");
						 int d =20;
						 System.out.println("no of km");
		                 int e = scan.nextInt();
						 int k = d * e ;
						  System.out.println("total bill is "+k);
						  sum=sum+k;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a2=scan.nextInt();

						  if (a2==1)
						  {
							  System.out.println( "final bill    "+sum);
							  break;
						  }
					 case 3:System.out.println("you selected van");
						 int dd =17;
						 System.out.println("no of km");
		                 int ee = scan.nextInt();
						 int kk= dd * ee ;
						  System.out.println("total bill is "+kk);
						  sum=sum+kk;
						   System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a3=scan.nextInt();

						  if (a3==1)
						  {
							  System.out.println( "final bill    "+sum);
							  break;
						  }
					 case 4:System.out.println("you selected auto");
						 int ddd =16;
						 System.out.println("no of km");
		                 int eee = scan.nextInt();
						 int kkk= ddd * eee ;
						  System.out.println("total bill is "+kkk);
						  sum=sum+kkk;
						  System.out.println( "final bill    "+sum);
						  System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue buy the vehicles");
							  int a4=scan.nextInt();

						  if (a4==1)
						  {
							  System.out.println( "final bill    "+sum);
							  break;
						  }
						 
				         }
						
						 // This case 5 is used for buy the vehicles section
						 case 5: System.out.println("you selected price of the vehicle");
				         System.out.println("");
						 System.out.println("enter your option");
				         System.out.println("enter 1 for bike");
				         System.out.println("enter 2 for car");
						  int psessAA = scan.nextInt();
						 switch (psessAA)
						 {
							 // This case 1 is used for bikes section
					 case 1:System.out.println("you selected bike");
					     System.out.println("");
						 System.out.println("enter your option");
				         System.out.println("enter 1 for FZ");
						 System.out.println("enter 2 for PULSAR");
						 System.out.println("enter 3 for ROYALENFIED");
						  int psessK = scan.nextInt();
						  switch (psessK)
						  {
						  case 1:System.out.println("you selected FZ");
						         int ddd =160000;
						        System.out.println("enter discount");
		                        double eee = scan.nextDouble();
						        double kkk= ddd * eee ;
						        System.out.println("total bill is "+kkk);
								 summ=summ+kkk;
						         System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a1=scan.nextInt();

						  if (a1==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  } 
							 case 2:System.out.println("you selected PULSAR");
						         int dddl =110000;
						        System.out.println("enter discount");
		                        double eeel = scan.nextDouble();
						        double kkkl= dddl * eeel ;
						        System.out.println("total bill is "+kkkl);
								 summ=summ+kkkl;
						         System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a2=scan.nextInt();

						  if (a2==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
						     case 3:System.out.println("you selected ROYAL ENFIED");
						         int Addd =260000;
						        System.out.println("enter discount");
		                        double Aeee = scan.nextDouble();
						        double Akkk= Addd * Aeee ;
						        System.out.println("total bill is "+Akkk);
								 summ=summ+Akkk;
								 System.out.println( "final bill    "+summ);
						         System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue for car");
							  int a3=scan.nextInt();

						  if (a3==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  }
						  }
						  // This case 2 is used for cars section
						case 2:System.out.println("you selected CAR");
					     System.out.println("");
						 System.out.println("enter your option");
				         System.out.println("enter 1 for AUDI");
						 System.out.println("enter 2 for BENZ");
						 System.out.println("enter 3 for ROLLS ROYCE");
						  int psessKA = scan.nextInt();
						  switch (psessKA)
						  {
						  case 1:System.out.println("you selected AUDI");
						         int ddd =1600000;
						        System.out.println("enter discount");
		                        double eee = scan.nextDouble();
						        double kkk= ddd * eee ;
						        System.out.println("total bill is "+kkk);
								 summ=summ+kkk;
						        System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a1=scan.nextInt();

						  if (a1==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  } 
							 case 2:System.out.println("you selected BENZ");
						         int dddl =1100000;
						        System.out.println("enter discount");
		                        double eeel = scan.nextDouble();
						        double kkkl= dddl * eeel ;
						        System.out.println("total bill is "+kkkl);
								 summ=summ+kkkl;
						         System.out.println("enter your choice");
							  System.out.println("");
							  System.out.println("enter 1 for break");
							  System.out.println("enter any value for continue");
							  int a2=scan.nextInt();

						  if (a2==1)
						  {
							  System.out.println( "final bill    "+summ);
							  break;
						  } 
						     case 3:System.out.println("you selected ROLLS ROYCE");
						         int Addd =2600000;
						        System.out.println("enter discount");
		                        double Aeee = scan.nextDouble();
						        double Akkk= Addd * Aeee ;
						        System.out.println("total bill is "+Akkk);
								 summ=summ+Akkk;
								 System.out.println( "final bill    "+summ);
						       
						  }
				
				         } break;
						 
                          default:  System.out.println("enter vaild option");
		                
		        }
		                 System.out.println("THANK YOU");
		
	}
}



