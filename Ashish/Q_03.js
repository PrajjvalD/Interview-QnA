// Write a function findLongestWord that takes a string as input and returns the longest word in the string. If there are multiple largest words, return first one encoutered.

const findLargeWord = function (str) {
  if (str.trim().length === 0) {
    return false;
  }
  let largeWord = "";
  const words = str.split(/\s+/);
  for (let word of words) {
    if (word.length > largeWord.length) {
        largeWord = word;
    }
  }
  return largeWord;
};

console.log(findLargeWord("this is Ashish Vishwakarma"));
