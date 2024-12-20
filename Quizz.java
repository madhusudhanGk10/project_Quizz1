
import java.util.Scanner;
public class Quizz {
	public static boolean swap(int k,int i,double count){
		Scanner sc1=new Scanner(System.in);
		boolean o=false;
		if(k==1) {	
		System.out.println("*)1+2=?");
		System.out.println("a)4\t\tb)3\nc)3.0\t\td)5");
		char x1=sc1.next().charAt(0);
		if(x1=='b') {
			System.out.println("pass");
			o=true;
		}
		else {
			System.out.println("Wrong");
			System.out.println("ponts awarded:"+count);
			o=false;
		}
		}
		else {
			System.out.println("........Soory!......\n Your turn already completed  ");
			System.out.println("Enter your answer:");
			char x=sc1.next().charAt(0);
			if(Answer(x,i,count)) {
				o= true;
			}
			else {
				o= false;
			}
		}
		return o;
	}
	public static boolean Answer(char f,int i,double count) {
		char[] a= {'n','b','d','a','c','b','a','c','c','d','c'};
		if(f==a[i]) {
			System.out.println("pass");
			return true;
		}
		else {
			System.out.println("Wrong");
			System.out.println("ponts awarded:"+count);
			return false;
		}
	}
	public static boolean audiance(char x,int i,int g,double count,String str1,String str2,int k,int h) {
		Scanner sc1=new Scanner(System.in);
		boolean d=false;
		char[] a= {'n','b','d','a','c','b','a','c','c','d','c'};
		char[] b= {'a','b','c','d'};
		char temp;
		if(h==1) {
		for(int j=0;j<b.length;j++){
			if(a[i]==b[j]) {
				temp=b[0];
				b[0]=a[i];
				b[j]=temp;
			}
		}
		System.out.println(b[0]+") 50%");
		System.out.println(b[1]+") 20%");
		System.out.println(b[2]+") 30%");
		System.out.println(b[3]+") 10%");
		char x1=sc1.next().charAt(0);
		if(x1=='a'||x1=='A'||x1=='b'||x1=='B'||x1=='c'||x1=='C'||x1=='D'||x1=='d') {
			if(Answer(x1,i,count)) {
				d=true;
			}
			else {
				disp(str1,str2,count);
				System.exit(0);
			}
		}
		else if(x1=='n') {
			disp(str1,str2,count);
			System.exit(0);
			d=true;
		}
	}
		else {
			System.out.println("........Soory!......\n Your turn already completed  ");
			System.out.println("Enter your answer:");
			char x1=sc1.next().charAt(0);
			if(Answer(x1,i,count)) {
			d= true;
			}
			else {
				d= false;
			}
		}
		return d;
	}
	public static boolean ff(char x,int i,int g,double count,String str1,String str2,int k,int h) {
		Scanner sc1=new Scanner(System.in);
		char[] a= {'n','b','d','a','c','b','a','c','c','d','c'};
		boolean d=false;
		if(g==1) {
			if(a[i]=='a'||a[i]=='c') {
				System.out.println("A\nC");
			}
				else {
					System.out.println("B\nD");
				}
				char x1=sc1.next().charAt(0);
			if(x1=='a'||x1=='A'||x1=='b'||x1=='B'||x1=='c'||x1=='C'||x1=='D'||x1=='d') {
				if(Answer(x1,i,count)) {
					count+=0.5;
					d=true;
				}
				else {
					disp(str1,str2,count);
					System.exit(0);
				}
			}
			else if(x1=='n') {
				disp(str1,str2,count);
				System.exit(0);
				d=true;
			}
		}
		else {
			System.out.println("........Soory!......\n Your turn already completed  ");
			System.out.println("Enter your answer:");
			char x2=sc1.next().charAt(0);
			if(x2=='a'||x2=='A'||x2=='b'||x2=='B'||x2=='c'||x2=='C'||x2=='D'||x2=='d') {
				if(Answer(x2,i,count)) {
					d=true;
				}
				else {
					disp(str1,str2,count);
					System.exit(0);
				}
			}
			else if(x2=='n') {
				disp(str1,str2,count);
				System.exit(0);
			}
		}
		return d;
		}
	public static void disp(String str1,String str2,double count) {
		System.out.println("\t"+str1+"  your test has completed \n \t\t Thank you");
		System.out.println("...........Your Result details..............");
		System.out.println("Name:"+str1);
		System.out.println("Rollnumber:"+str2);
		System.out.println("points you gain:"+count);
		double per=(count/10.0)*100;
		System.out.println("percentage:"+per+"%");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("__________wellcome to Quizz_____________");
		System.out.println("Enter your name:");
		String str1=sc.next();
		System.out.println("Enter your RollNumbre:");
		String str2=sc.next();
		System.out.println("**************Rules*****************");
		System.out.println("enter options a,b,c,d \nif you want audiance poll enter: e\nfor 50-50 chancance enter: f\nfor swap the quation use:s");
		System.out.println("for exit from the quiz enter :n ");
		System.out.println("the chances are available for only once");
		System.out.println("if you use the pols the poits gets reduce half");
		System.out.println("\nAre you ready to participate?(Y/N)");
		char m=sc.next().charAt(0);
		if(m=='y') {
			System.out.println("\n........All The Best!.........");
		}
		else {
			System.exit(0);
		}
		int i=1;
		int g=1;
		int h=1;
		int k=1;
		double count=0;
		while(i<=11){
			switch(i) {
			case 1:
				System.out.println("1.Java has how many pillers?");
				System.out.println("A)3"+"\t\t"+"B)4"+"\n"+"C)2"+"\t\t"+"D)5");
				if(h==1) {
					System.out.print("e)Audiance pol");
				}
				if(g==1) {
					System.out.print("\nf)50-50");
				}
				if(k==1) {
					System.out.println("\ns)swap");
				}
				System.out.println("n)exit");
				char x=sc.next().charAt(0);
				if(x=='a'||x=='A'||x=='b'||x=='B'||x=='c'||x=='C'||x=='D'||x=='d') {
					if(Answer(x,i,count)) {
						count++;
						System.out.println("ponts awarded:"+count);
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(x=='e') {
					if(audiance(x, i, g, count,str1,str2,k,h)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						h++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(x=='f') {
					if(ff( x, i, g, count,str1,str2,k,h)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						g++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(x=='s') {
					if(swap(k,i,count)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						k++;
						}
						else {
							disp(str1,str2,count);
							System.exit(0);
						}
				}
				else if(x=='n') {
					disp(str1,str2,count);
					System.exit(0);
				}
				break;
			case 2:
				System.out.println("2.What are the pillers of java?");
				System.out.println("A)Abstraction"+"\t\t"+"B)Polymorphisam"+"\n"+"C)Inheritence"+"\t\t"+"D)All of the above");
				if(h==1) {
					System.out.print("e)Audiance pol");
				}
				if(g==1) {
					System.out.print("\nf)50-50");
				}
				if(k==1) {
					System.out.println("\ns)swap");
				}
				System.out.println("n)exit");
				char y=sc.next().charAt(0);
				if(y=='a'||y=='A'||y=='b'||y=='B'||y=='c'||y=='C'||y=='D'||y=='d') {
					if(Answer(y,i,count)) {
						count++;
						System.out.println("ponts awarded:"+count);
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(y=='e') {
					if(audiance(y, i, g, count,str1,str2,k,h)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						h++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(y=='f') {
					if( ff(y, i, g, count,str1,str2,k,h)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						g++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(y=='s') {
					if(swap(k,i,count)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						k++;
						}
						else {
							disp(str1,str2,count);
							System.exit(0);
						}
				}
				else if(y=='n') {
					disp(str1,str2,count);
					System.exit(0);
				}
				break;
			case 3:
				System.out.println("3. What is the Representation of an array?");
				System.out.println("A)a[]"+"\t\t"+"B)a{}"+"\n"+"C)a()"+"\t\t"+"D)a<>");
				if(h==1) {
					System.out.print("e)Audiance pol");
				}
				if(g==1) {
					System.out.print("\nf)50-50");
				}
				if(k==1) {
					System.out.println("\ns)swap");
				}
				System.out.println("n)exit");
				char z=sc.next().charAt(0);
				if(z=='a'||z=='A'||z=='b'||z=='B'||z=='c'||z=='C'||z=='D'||z=='d') {
					if(Answer(z,i,count)) {
						count++;
						System.out.println("ponts awarded:"+count);
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(z=='e') {
					if(audiance(z, i, g, count,str1,str2,k,h)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						h++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(z=='f') {
					if(ff(z, i, g, count,str1,str2,k,h)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
					g++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
				}
				}
				else if(z=='s') {
					if(swap(k,i,count)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						k++;
						}
						else {
							disp(str1,str2,count);
							System.exit(0);
						}
				}
				else if(z=='n') {
					disp(str1,str2,count);
					System.exit(0);
				}
				break;
			case 4:
				System.out.println("4.which is key word is use to create an object?");
				System.out.println("A)if"+"\t\t"+"B)for"+"\n"+"C)new"+"\t\t"+"D)create");
				if(h==1) {
					System.out.print("e)Audiance pol");
				}
				if(g==1) {
					System.out.print("\nf)50-50");
				}
				if(k==1) {
					System.out.println("\ns)swap");
				}
				System.out.println("n)exit");
				char w=sc.next().charAt(0);
				if(w=='a'||w=='A'||w=='b'||w=='B'||w=='c'||w=='C'||w=='D'||w=='d') {
					if(Answer(w,i,count)) {
						count++;
						System.out.println("ponts awarded:"+count);
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(w=='e') {
					if(audiance(w, i, g, count,str1,str2,k,h)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						h++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
					
				}
				else if(w=='f') {
					if(ff(w, i, g, count,str1,str2,k,h)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						g++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(w=='s') {
					if(swap(k,i,count)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						k++;
						}
						else {
							disp(str1,str2,count);
							System.exit(0);
						}
				}
				else if(w=='n') {
					disp(str1,str2,count);
					System.exit(0);
				}
				break;
			case 5:
				System.out.println("5.In java same method different parameters known as?");
				System.out.println("A)Override"+"\t\t"+"B)Overload"+"\n"+"C)Constructer"+"\t\t"+"D)AbStract");
				if(h==1) {
					System.out.print("e)Audiance pol");
				}
				if(g==1) {
					System.out.print("\nf)50-50");
				}
				if(k==1) {
					System.out.println("\ns)swap");
				}
				System.out.println("n)exit");
				char u=sc.next().charAt(0);
				if(u=='a'||u=='A'||u=='b'||u=='B'||u=='c'||u=='C'||u=='D'||u=='d') {
					if(Answer(u,i,count)) {
						count++;
						System.out.println("ponts awarded:"+count);
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(u=='e') {
					if(audiance(u, i, g, count,str1,str2,k,h)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						h++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(u=='f') {
					if(ff(u, i, g, count,str1,str2,k,h)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						g++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(u=='s') {
					if(swap(k,i,count)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						k++;
						}
						else {
							disp(str1,str2,count);
							System.exit(0);
						}
				}
				else if(u=='n') {
					disp(str1,str2,count);
					System.exit(0);
				}
				break;
			case 6:
				System.out.println("6.In java same method same parameters known as?");
				System.out.println("A)Override"+"\t\t"+"B)Overload"+"\n"+"C)Constructer"+"\t\t"+"D)AbStract");
				if(h==1) {
					System.out.print("e)Audiance pol");
				}
				if(g==1) {
					System.out.print("\nf)50-50");
				}
				if(k==1) {
					System.out.println("\ns)swap");
				}
				System.out.println("n)exit");
				char v=sc.next().charAt(0);
				if(v=='a'||v=='A'||v=='b'||v=='B'||v=='c'||v=='C'||v=='D'||v=='d') {
					if(Answer(v,i,count)) {
						count++;
						System.out.println("ponts awarded:"+count);
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(v=='e') {
					if(audiance(v, i, g, count,str1,str2,k,h)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						h++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(v=='f') {
					if(ff(v, i, g, count,str1,str2,k,h)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						g++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(v=='s') {
					if(swap(k,i,count)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						k++;
						}
						else {
							disp(str1,str2,count);
							System.exit(0);
						}
				}
				else if(v=='n') {
					disp(str1,str2,count);
					System.exit(0);
				}
				break;
			case 7:
				System.out.println("7.Acuriring properties from parent to child is know as?");
				System.out.println("A)Abstraction"+"\t\t"+"B)Polymorphisam"+"\n"+"C)Inheritence"+"\t\t"+"D)Abstraction");
				if(h==1) {
					System.out.print("e)Audiance pol");
				}
				 if(g==1) {
					System.out.print("e)50-50");
				}
				 if(k==1) {
					System.out.println("e)swap");
				}
				 System.out.println("n)exit");
				char t=sc.next().charAt(0);
				if(t=='a'||t=='A'||t=='b'||t=='B'||t=='c'||t=='C'||t=='D'||t=='d') {
					if(Answer(t,i,count)) {
						count++;
						System.out.println("ponts awarded:"+count);
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(t=='e') {
					if(audiance(t, i, g, count,str1,str2,k,h)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						h++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(t=='f') {
					if(ff(t, i, g, count,str1,str2,k,h)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						g++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(t=='s') {
					if(swap(k,i,count)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						k++;
						}
						else {
							disp(str1,str2,count);
							System.exit(0);
						}
				}
				else if(t=='n') {
					disp(str1,str2,count);
					System.exit(0);
				}
				break;
			case 8:
				System.out.println("8.the variable in interface is?");
				System.out.println("A)public Static"+"\t\t\t"+"B)Static"+"\n"+"C)public Static final"+"\t\t"+"D)public");
				if(h==1) {
					System.out.println("e)Audiance pol");
				}
				if(g==1) {
					System.out.println("e)50-50");
				}
				if(k==1) {
					System.out.println("e)swap");
				}
				System.out.println("n)exit");
				char s=sc.next().charAt(0);
				if(s=='a'||s=='A'||s=='b'||s=='B'||s=='c'||s=='C'||s=='D'||s=='d') {
					if(Answer(s,i,count)) {
						count++;
						System.out.println("ponts awarded:"+count);
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(s=='e') {
					if(audiance(s, i, g, count,str1,str2,k,h)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						h++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
					
				}
				else if(s=='f') {
					if(ff(s, i, g, count,str1,str2,k,h)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						g++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(s=='s') {
					if(swap(k,i,count)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						k++;
						}
						else {
							disp(str1,str2,count);
							System.exit(0);
						}
				}
				else if(s=='n') {
					disp(str1,str2,count);
					System.exit(0);
				}
				break;
			case 9:
				System.out.println("9.Which is not sub class of collection?");
				System.out.println("A)ArrayList"+"\t\t"+"B)Set"+"\n"+"C)Queue"+"\t\t\t"+"D)Map");
				if(h==1) {
					System.out.println("e)Audiance pol");
				}
				 if(g==1) {
					System.out.println("e)50-50");
				}
				if(k==1) {
					System.out.println("e)swap");
				}
				System.out.println("n)exit");
				char r=sc.next().charAt(0);
				if(r=='a'||r=='A'||r=='b'||r=='B'||r=='c'||r=='C'||r=='D'||r=='d') {
					if(Answer(r,i,count)) {
						count++;
						System.out.println("ponts awarded:"+count);
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(r=='e') {
					if(audiance(r, i, g, count,str1,str2,k,h)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						h++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(r=='f') {
					if(ff(r, i, g, count,str1,str2,k,h)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						g++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(r=='s') {
					if(swap(k,i,count)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						k++;
						}
						else {
							disp(str1,str2,count);
							System.exit(0);
						}
				}
				else if(r=='n') {
					disp(str1,str2,count);
					System.exit(0);
				}
				break;
			case 10:
				System.out.println("10.In java which plays parallel eecution?");
				System.out.println("A)Conatructer"+"\t\t"+"B)Super()"+"\n"+"C)Thread"+"\t\t"+"D)Nested loops");
				if(h==1) {
					System.out.println("e)Audiance pol");
				}
				 if(g==1) {
					System.out.println("e)50-50");
				}
				if(k==1) {
					System.out.println("e)swap");
				}
				System.out.println("n)exit");
				char q=sc.next().charAt(0);
				if(q=='a'||q=='A'||q=='b'||q=='B'||q=='c'||q=='C'||q=='D'||q=='d') {
					if(Answer(q,i,count)) {
						count++;
						System.out.println("ponts awarded:"+count);
						disp(str1,str2,count);
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(q=='e') {
					if(audiance(q, i, g, count,str1,str2,k,h)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						h++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(q=='f') {
					if(ff(q, i, g, count,str1,str2,k,h)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						g++;
					}
					else {
						disp(str1,str2,count);
						System.exit(0);
					}
				}
				else if(q=='s') {
					if(swap(k,i,count)) {
						count+=0.5;
						System.out.println("ponts awarded:"+count);
						k++;
						}
					else {
						disp(str1,str2,count);
						System.exit(0);
						}
				}
				else if(q=='n') {
					disp(str1,str2,count);
					System.exit(0);
				}
				break;	
			}
			i++;
		}
	}
	}
