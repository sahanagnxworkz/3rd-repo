class SpicejetRunner{
	public static void main(String[] args){
		System.out.println("entered main");
		long[] flightNos={8947656,9327465490l,987987l,093876567l,87356784l,8375664l,865399l,982735243l,77789823l,8745629l};
		Spicejet.flightNos(flightNos);
		System.out.println(flightNos.length);
		for(int index=0;index<flightNos.length;index++){
			System.out.println("the flight numbers "+flightNos[index]);
		}
	}
}