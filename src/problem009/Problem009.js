function prob9(){
	for(var a=1;a<1000;a++){
		for(var b=a+1;b<1000;b++){
			c=1000-a-b;
			if(a*a+b*b===c*c && a+b+c===1000){
				return a*b*c;
			}
		}
	}
}

console.log(prob9());
