package ticket;
import java.util.*;
class display{
	void view(String s_con_name,String s_user_name,int s_mem,int platform,String seat_num[],String parking,int rank) {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("CONCERT NAME:"+s_con_name);
		System.out.println("TYPE OF CARD: "+"Platinum Card");
		System.out.println("ADMIN NAME: "+s_user_name);
		System.out.println("NO.OF.MEMBERS: "+s_mem);
		//if(rank<3) {
			System.out.print("SEAT NUMBER: ");
			for(int i=0;i<s_mem;i++) {
				System.out.print(seat_num[i]+" ");
			}
		//}
		System.out.println();
		if(parking.equals("yes")||parking.equals("YES")||parking.equals("Yes"))
		System.out.println("YOUR PARKING PLATFORM NUMBER: "+platform);
		System.out.println("ENJOY THE CONCERT!!!");
		System.out.println("------------------------------------------------------------------------");
	}
	void view2(String s_con_name,String s_user_name,int s_mem,int platform,String gold_num[],String parking,int rank) {
		System.out.println("------------------------------------------------------------------------");
		System.out.println("CONCERT NAME:"+s_con_name);
		System.out.println("TYPE OF CARD: "+"Gold Card");
		System.out.println("ADMIN NAME: "+s_user_name);
		System.out.println("NO.OF.MEMBERS: "+s_mem);
		if(rank<3) {
			System.out.print("SEAT NUMBER: ");
			for(int i=0;i<s_mem;i++) {
				System.out.print(gold_num[i]+" ");
			}
		}
		System.out.println();
		if(parking.equals("yes")||parking.equals("YES")||parking.equals("Yes"))
			System.out.println("YOUR PARKING PLATFORM: "+platform);
		System.out.println("ENJOY THE CONCERT!!!");
		System.out.println("------------------------------------------------------------------------");
	}
	void view2(String s_con_name,String s_user_name,int s_mem,String parking,int rank) {
		System.out.println("------------------------------------------------------------------------");
		System.out.println("CONCERT NAME:"+s_con_name);
		System.out.println();
		if(rank==3)
			System.out.println("TYPE OF CARD: "+"Silver Card");
		else
			System.out.println("TYPE OF CARD: "+"Bronze Card");
		System.out.println("ADMIN NAME: "+s_user_name);
		System.out.println("NO.OF.MEMBERS: "+s_mem);
		if((parking.equals("yes")||parking.equals("YES")||parking.equals("Yes"))&&rank==3)
			System.out.println("YOUR PARKING PLATFORM LAND: PL025");
		else if((parking.equals("yes")||parking.equals("YES")||parking.equals("Yes"))&&rank==4)
			System.out.println("YOUR PARKING PLATFORM LAND: PL030");
		System.out.println();
		System.out.println("ENJOY THE CONCERT!!!");
		System.out.println("------------------------------------------------------------------------");
	}
	}
class price{
	Scanner so=new Scanner(System.in);
	void concert_price(int rank,int no_mem,String parking){
			int amount=1,pay,tag=0;
			if(rank==1) {
				amount=5000*no_mem;
				System.out.println("Concert amount: "+amount);
				while(tag!=1) {
				System.out.println("pay the amount to enjoy the concert: ");
				pay=so.nextInt();
					if(pay!=amount) {
						System.out.println("Invaild payment:try again!...");
					   }
					else tag=1;
					}
					tag=0;
			}
			else if(rank==2) {
				amount=3000*no_mem;
				System.out.println("Concert amount: "+amount);
				while(tag!=1) {
					System.out.println("pay the amount to enjoy the concert: ");
					pay=so.nextInt();
						if(pay!=amount) {
							System.out.println("Invaild payment:try again!...");
						   }
						else tag=1;
						}
						tag=0;
			}
			else if(rank==3) {
				amount=2000*no_mem;
				System.out.println("Concert amount: "+amount);
				while(tag!=1) {
					System.out.println("pay the amount to enjoy the concert: ");
					pay=so.nextInt();
						if(pay!=amount) {
							System.out.println("Invaild payment:try again!...");
						   }
						else tag=1;
						}
						tag=0;
			}
			else {
				amount=1000*no_mem;
				System.out.println("Concert amount: "+amount);
				while(tag!=1) {
					System.out.println("pay the amount to enjoy the concert: ");
					pay=so.nextInt();
						if(pay!=amount) {
							System.out.println("Invaild payment:try again!...");
						   }
						else tag=1;
						}
						tag=0;
		}
	}
	void park_concertprice(int rank,int no_mem) {
		int amount=1,pay,tag=0;
		if(rank==1) {
			amount=(5000*no_mem)+100;
			System.out.println("Concert amount: "+amount);
			while(tag!=1) {
				System.out.println("pay the amount to enjoy the concert: ");
				pay=so.nextInt();
					if(pay!=amount) {
						System.out.println("Invaild payment:try again!...");
					   }
					else tag=1;
					}
					tag=0;
		}
		else if(rank==2) {
			amount=(3000*no_mem)+100;
			System.out.println("Concert amount: "+amount);
			while(tag!=1) {
				System.out.println("pay the amount to enjoy the concert: ");
				pay=so.nextInt();
					if(pay!=amount) {
						System.out.println("Invaild payment:try again!...");
					   }
					else tag=1;
					}
					tag=0;
		}
		else if(rank==3) {
			amount=(2000*no_mem)+50;
			System.out.println("Concert amount: "+amount);
			while(tag!=1) {
				System.out.println("pay the amount to enjoy the concert: ");
				pay=so.nextInt();
					if(pay!=amount) {
						System.out.println("Invaild payment:try again!...");
					   }
					else tag=1;
					}
					tag=0;
		}
		else {
			amount=(1000*no_mem)+50;
			System.out.println("Concert amount: "+amount);
			while(tag!=1) {
				System.out.println("pay the amount to enjoy the concert: ");
				pay=so.nextInt();
					if(pay!=amount) {
						System.out.println("Invaild payment:try again!...");
					   }
					else tag=1;
					}
					tag=0;
		}
		
	}
	
}
class parking extends price{
	 int park(int platform) {
		    int plat=0;
			platform++;
			return platform;
		}
	}
class User_detail{
	
	int flag=0,count=0,p=0,f=0;
	String available[]= {"Platinum","Gold","Silver","Bronze"};
	String seat_no[]=new String[50];
	String gold_seat[]=new String[50];
	 int rank;
	 void assign1(){
		 if(flag==0) {
				for(int i=1;i<=50;i++) {
				   	 seat_no[i-1]=String.valueOf(i);
				   	 flag=1;
				     }
		    	}
				for(int i=1;i<=50;i++) {
					if(count%10==0) System.out.println();
					System.out.print(seat_no[i-1]+" ");
					count++;
				}
	 }
	 void assign2() {
			if(f==0) {
				for(int i=51;i<101;i++) {
				   	 gold_seat[p]=String.valueOf(i);
				   	 p++;
				     }
				f=1;
		    	}
				for(int i=0;i<p;i++) {
					if(count%10==0) System.out.println();
					System.out.print(gold_seat[i]+" ");
					count++;
				}
	   
	 }
	 
	void seat_deatils(){
		for(int i=0;i<available.length;i++) {
		   System.out.println(i+1+". "+available[i]);	
		}
	}
	
	void select(String seat_num[],int rank) {
		if(rank==1) { 	
		for(int j=0;j<50;j++) {
			for(int k=0;k<seat_num.length;k++) {
				if(seat_no[j].equals(seat_num[k])) {
					seat_no[j]="-";
				}
			}
		}
		System.out.println();
	      }
		
		}
	void select2(int rank,String gold_num[]) {

			for(int j=0;j<50;j++) {
				for(int k=0;k<gold_num.length;k++) {
					
					if(gold_seat[j].equals(gold_num[k])) {
						
						gold_seat[j]="-";
					}
				}
			}
			System.out.println();
	}
	
}
class concert_details{
	String concerts[]= {"AR Rhahuman CONCERT on Sept 9(6.00PM TO 12.00PM)","YUVAN CONCERT on Setp 6(8.00PM TO 1.00PM)","Exit"};
       void news() {
    	   int choose=0;
		System.out.println("Concert available:");
        
	    for(int i=0;i<=concerts.length-1;i++) {
	    	System.out.println(i+1+". "+concerts[i]);
	    }  
	}
}
public class booking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user_name,phone_no;
		String parking;
		int no_of_mem,platform=0;
		int index=0,inc=0,index2=0,inc2=0;
		int choose,f=0,count=0,flags=0;
		int rank = 0;
		int n,q=0,k=0,p=0,t1=0;
		String seat_num[]=new String[50];
		//String seat_num2[]=new String[50];
		String gold_num[]=new String[50];
		//String gold_num2[]=new String[50];
		 String seat_no[]=new String[50];
		// String seat_no2[]=new String[50];
		 String gold_seat[]=new String[50];
		// String gold_seat2[]=new String[50];
		 User_detail details=new User_detail();
		 User_detail details2=new User_detail();
		 while(q!=3) {
        Scanner sc=new Scanner (System.in);
		System.out.println(".....CONCERT TICKET BOOKING.....");
        concert_details con=new concert_details();
        con.news();
       // concert_details von=new concert_details();
	    System.out.println();
	    System.out.println("CHOOSE THE CONCERT: ");
	    choose=sc.nextInt();
	    System.out.println(con.concerts[choose-1]);
	    String s_con_name=con.concerts[choose-1];
	 
	    if((choose)==3) {
	      	q=(choose);
	    }
	   switch(choose) {
	   
	   case 1:{
		   k=0;
	    if(q!=3) {
	    System.out.println();
	    System.out.println("-------------USER'S DETAILS-------------");
	    //customer details
	    String s_user_name;
	    int s_mem;
	    System.out.println("");
	    System.out.println("enter the name: ");
		String user=sc.nextLine();
	    user_name=sc.nextLine();
		s_user_name=user_name;
		while(flags!=1) {
		System.out.println("enter the phone_no: ");
		phone_no=sc.next();
		if(phone_no.length()!=10) {
			System.out.println("Invaild phone-no:try again!...");
		   }
		else flags=1;
		}
		flags=0;
		System.out.println("would you need a Parking space: Yes/No ");
		parking=sc.next();
		System.out.println("No.of.members attending the concert: ");
		no_of_mem=sc.nextInt();
		n=no_of_mem;
		s_mem=no_of_mem;
		System.out.println("----------SEATING ARRANGEMENT-----------");
	    details.seat_deatils();
	    System.out.println("CHOOSE THE CATEGEORY: ");
	    rank=sc.nextInt();
	   // details.seats(rank);
	   // detail.select(seat_num);
	    System.out.println();
	    if(rank==1) {
	    System.out.println("CHOOSE THE SEAT NUMBER: ");
//		if(details.flag==0) {
//			for(int i=1;i<=50;i++) {
//			   	 seat_no[i-1]=String.valueOf(i);
//			   	 details.flag=1;
//			     }
//	    	}
//			for(int i=1;i<=50;i++) {
//				if(count%10==0) System.out.println();
//				System.out.print(seat_no[i-1]+" ");
//				count++;
//			}
	    details.assign1();
	    while(n!=0) {
	    	seat_num[k]=sc.next();
	    	//inc++;
	    	k++;
	    	n--;
	    }
	    details.select(seat_num,rank);
	    }
	    if(rank==2) {
		    System.out.println("CHOOSE THE SEAT NUMBER: ");
		
	       details.assign2();
		    while(n!=0) {
		    	gold_num[k]=sc.next();
		    	//inc2++;
		    	k++;
		    	n--;
		    }
		    details.select2(rank,gold_num);
		    }   
	    parking place=new parking();
	    price money=new price();
	   // System.out.println(parking);
	   if(parking.equals("yes")||parking.equals("Yes")||parking.equals("YES")) {
		   place.park_concertprice(rank, s_mem);
		   platform=place.park(platform);
		    
	   }
	   else place.concert_price(rank, s_mem,parking);
	   //int s_park;
	   // s_park=place.platform;
	    display d=new display();
	    if(rank==1) {
	    	d.view(s_con_name,s_user_name,s_mem,platform,seat_num,parking,rank);
	    	index+=inc;
	    	
	    }
	    if(rank==2){
	    	d.view2(s_con_name,s_user_name,s_mem,platform,gold_num,parking,rank);
	       index2+=inc2;} 
	    if(rank==3||rank==4)
	    	d.view2(s_con_name,s_user_name,s_mem,parking, rank);
	    }
	    break;
	   }
		 case 2:{
			 k=0;platform=0;
			 
			   if(q!=3) {
				    System.out.println("-------------USER'S DETAILS-------------");
				    //customer details
				    String s_user_name;
				    int s_mem;
				    System.out.println("");
				    System.out.println("enter the name: ");
					user_name=sc.next();
					s_user_name=user_name;
					while(flags!=1) {
						System.out.println("enter the phone_no: ");
						phone_no=sc.next();
						if(phone_no.length()!=10) {
							System.out.println("Invaild phone-no:try again!...");
						   }
						if(phone_no.length()==10) flags=1;
						}
						flags=0;
					System.out.println("would you need a Parking space: Yes/No ");
					parking=sc.next();
					System.out.println("No.of.members attending the concert: ");
					no_of_mem=sc.nextInt();
					n=no_of_mem;
					s_mem=no_of_mem;
					System.out.println("----------SEATING ARRANGEMENT-----------");
				    details2.seat_deatils();
				    System.out.println("CHOOSE THE CATEGEORY: ");
				    rank=sc.nextInt();
				   // details.seats(rank);
				   // detail.select(seat_num);
				    System.out.println();
				    if(rank==1) {
				    System.out.println("CHOOSE THE SEAT NUMBER: ");
				    details2.assign1();
				    while(n!=0) {
				    	seat_num[k]=sc.next();
				    	inc++;
				    	k++;
				    	n--;
				    }
				    details2.select(seat_num,rank);
				    
				    }
				    if(rank==2) {
					    System.out.println("CHOOSE THE SEAT NUMBER: ");
					     
					  details2.assign2();
					    while(n!=0) {
					    	gold_num[k]=sc.next();
					    	inc2++;
					    	k++;
					    	n--;
					    }
					    details2.select2(rank,gold_num);
					    }   
				    parking place2=new parking();
				   if(parking.equals("yes")||parking.equals("Yes")||parking.equals("YES")) {
					   place2.park_concertprice(rank, s_mem);
					   platform=place2.park(platform);
					    
				   }
				   else place2.concert_price(rank, s_mem,parking);
				   
				    display d2=new display();
				    if(rank==1) {
				    	d2.view(s_con_name,s_user_name,s_mem,platform,seat_num,parking,rank);
				    	index+=inc;
				    	
				    }
				    if(rank==2){
				    	d2.view2(s_con_name,s_user_name,s_mem,platform,gold_num,parking,rank);
				       index2+=inc2;} 
				    if(rank==3||rank==4)
				    	d2.view2(s_con_name,s_user_name,s_mem,parking, rank);
				    }
				    break;
			   }
			   } 
	}
}
}
