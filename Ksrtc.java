class Ksrtc{
		
	static void busesAll(String bus[]){
	
		for(int index=0; index<bus.length;index++){
				System.out.println(bus[index]);
				}
			}
			public static void main(String []args){
				String bus[] = {"SWKSRTC","NWKSRTC","Chigari","BMTC","Rajahamsa","Airavat"};
				busesAll(bus);
				bus[2] = "JAI BMTC";
				System.out.println();
				busesAll(bus);
			}
		}