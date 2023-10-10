function sortArrayDescending(arr) 
{
  return arr.sort(function(a, b)
  {
    return b - a;
  });
}
const userInput = prompt('Enter an array of numbers, separated by commas:');
const inputArray = userInput.split(',').map(Number);
const sortedArray = sortArrayDescending(inputArray);
console.log('Sorted array in descending order:', sortedArray);

