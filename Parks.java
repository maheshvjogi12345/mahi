class Parks{
		
	static void parkAll(String menu[]){
	
		for(int index=0; index<menu.length;index++){
				System.out.println(menu[index]);
				}
			}
			public static void main(String []args){
				String menu[] = {"CUBBON","SRK","MG","SAHYADRI","NATIONAL","FREEDOM"};
				parkAll(menu);
				menu[2] = "BANGLOGE PARK";
				System.out.println();
				parkAll(menu);
			}
		}
				