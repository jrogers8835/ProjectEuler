var checkedNumbers = [];
var amicableNumbers = [];

function problem21(){
	for(var num=3;num<10000;num++){
		if(!checkedNumbers.includes(num)){
			checkAmicability(num);
		}
	}
	// console.log(amicableNumbers);
	console.log(
		"Sum of Amicable Numbers Less than 10,000: ",
		amicableNumbers.reduce(function(total,num){return total+num;}));
}

function checkAmicability(number){
	var pair = sumOfDivisors(number);
	if( pair !== number && sumOfDivisors(pair) === number){
		amicableNumbers.push(number);
		amicableNumbers.push(pair);
	}
	checkedNumbers.push(number);
	checkedNumbers.push(pair);
}

function sumOfDivisors(number){
	var divisors = [1];
	for(var i=2;i<Math.sqrt(number);i++){
		if(number % i === 0){
			divisors.push(i);
			divisors.push(number/i);
		}
	}
	return divisors.reduce(function(total,num){return total+num;});

}

var start = new Date().getTime();
problem21();
console.log("Duration: ",new Date().getTime()-start);