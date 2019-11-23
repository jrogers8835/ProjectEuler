function prob10(){
	var primes = [2];
	var total = 2;
	for(var x=3;x<2000000;x+=2){
		var isPrime =true;
		for(var primeIndex = 0; primeIndex<primes.length;primeIndex++){
			if(x%primes[primeIndex]==0){
				isPrime=false;
				break;
			}
		}
		if(isPrime){
			primes.push(x);
			total+=x;
		}
	}
	return total;
}

console.log(prob10());
