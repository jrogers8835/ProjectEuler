var numbers = [];
function problem40(input){
	console.log(
		getDigit(1)
		* getDigit(10)
		* getDigit(100)
		* getDigit(1000)
		* getDigit(10000)
		* getDigit(100000)
		* getDigit(1000000));
}

function getDigit(n){
	var temp = n;
	var pointer = 0;
	numbers=[1];
	while(temp>0 && numbers[pointer].toString().length<temp){
		temp-=numbers[pointer].toString().length;
		numbers.push(numbers[pointer]+1);
		pointer++;
	}
	numbers.push(numbers[pointer]+1);
	return numbers[pointer].toString().charAt(temp-1);
}


var start = new Date().getTime();
problem40();
console.log("time: ",new Date().getTime() - start );