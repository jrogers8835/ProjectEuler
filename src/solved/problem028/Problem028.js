function problem28(){
		var width = 1001;
		var grid = intitializeGrid(width);
		instantiateGrid(grid);
		console.log(computeDiagonalSum(grid));
}

function intitializeGrid(width){
	var array = [];
	for(var i=0; i<width; i++){
		array.push(new Array(width));
	}
	return array;
}

function instantiateGrid(grid){
	var width = grid.length;
	var midPoint = Math.floor(grid.length/2);
	grid[midPoint][midPoint]=1;

	var row=midPoint;
	var col=midPoint+1;

	for(var x=2; x<width*width+1; x++){
		grid[row][col]=x;
		if(
			grid[row+1] && 
			grid[row+1][col]!==undefined &&
			grid[row][col-1]!==undefined){
				col++;
		}else if(
			grid[row][col-1]!==undefined && 
			grid[row-1] &&
			grid[row-1][col]!==undefined){
				row++;
		}else if(
			grid[row-1] &&
			grid[row-1][col]!==undefined && 
			grid[row][col+1]!==undefined){
				col--;
		}else if(
			grid[row][col+1]!==undefined && 
			grid[row+1] &&
			grid[row+1][col]!==undefined){
				row--;
		}else if(
			grid[row+1] &&
			grid[row+1][col]!==undefined){
				col++;
		}else if(
			grid[row][col-1]!==undefined){
				row++;
		}else if(
			grid[row-1] &&
			grid[row-1][col]!==undefined){
				col--;
		}else if(
			grid[row][col+1]!==undefined){
				row--;
		}
	}
}

function computeDiagonalSum(grid){
	var width = grid.length;
	var sum = 0;
	for(var pointer=0;pointer<width;pointer++){
		sum+=grid[pointer][pointer];
		sum+=grid[pointer][grid.length-pointer-1];
	}
	sum--;
	return sum;
}

var start = new Date().getTime();
problem28();
console.log(new Date().getTime()-start);