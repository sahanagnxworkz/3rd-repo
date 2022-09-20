class SportsRunner{
	public static void main(String[] args){
	System.out.println("---------THE TEAM INDIA------------");
	
			String[] namesList={ "Virat kohli","Rohit sharma","Rishab Pant","KL Rahul","Chahal","Padikal","Bhumra","ganguli"};
			Sports.cricketTeamMembers(namesList);
			int noOfPlayers=namesList.length;
			System.out.println("there are "   +noOfPlayers  + " members in a team");
			
			for(int index=0;index<namesList.length;index++){
				System.out.println("the name of player is :"+namesList[index]);
			
			}	
			System.out.println(" -----------------------------------");
			
			System.out.println("THE KABADDI TEAM");
			int[] nos={1,2,3,4,5,6,7,8,9,10};
			Sports.kabbadiTeamMembersJerseyNos(nos);
			System.out.println(nos.length);
			for(int index1=0;index1<nos.length;index1++){
				System.out.println("the Jersey no of player is :"+nos[index1]);
			
			}	
			System.out.println(" -----------------------------------");
			
				System.out.println("--the Foot ball team Salaries----");
				double[] salaries={6000,87309,4875,89539,49764,9037,8975,3846,7456,8465,2938};
				System.out.println("the no of person in foot ball team: "+salaries.length);
				Sports.FootBallTeamMembersSalary(salaries);
				for(int index=0;index<salaries.length;index++){
					System.out.println("the salaries of each persom in foot ball team is:"+salaries[index]);
				}
			System.out.println(" -----------------------------------");
			
				System.out.println("--the Ludo team----");	
				
				long[] no={9972451281l,9008284717l,8722159292l,9481038849l,9480642010l};
				Sports.ludoTeamMobileNumber(no);
				System.out.println("there are "+no.length +" members in ludo team");
				
				for(int index=0;index<no.length;index++){
					System.out.println("the Mobile Number of each persom in ludo team is:"+no[index]);
				}
			System.out.println(" -----------------------------------");
			
			System.out.println("--the Hockey team----");	
				
				int[] noOfMatches={1,2,3,5,5,7,8,4};
				Sports.hockeyTeamMembersNoOfMatches(noOfMatches);
			     for(int index=0;index<noOfMatches.length;index++){
					System.out.println("the Number of matches of Hockey team is:"+noOfMatches[index]);
				}
			System.out.println(" -----------------------------------");
			System.out.println("--the Koo-Koo team----");	
				
				String[] countryCode={"India :+91","Afghanistan:+93","Albania :+355","Algeria :+213","United Kingdom: +42"};
				Sports.kokoTeamMembersCountryCode(countryCode);
			     for(int index=0;index<countryCode.length;index++){
					System.out.println("the koo koo team country code:"+countryCode[index]);
				}
			
				System.out.println(" -----------------------------------");
			System.out.println("--the Lagori team----");
			  
				String[] alive={"true","false"};
				if(alive[0]=="true"){
					System.out.println(" the person is alive");
				}
				
				if(alive[1]=="false"){
				System.out.println(" the person is not alive");
				}
	}
}
