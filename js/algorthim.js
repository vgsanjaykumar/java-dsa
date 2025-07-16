// function longestSubstring(s) {
//     let map = new Map();
//     let start = 0, maxLength = 0;

//     for (let end = 0; end < s.length; end++) {
//         // If the character exists in the map and is within the current window
//         if (map.has(s[end]) && map.get(s[end]) >= start) {
//             start = map.get(s[end]) + 1;
//         }
//         map.set(s[end], end);
//         maxLength = Math.max(maxLength, end - start + 1);
//     }
//     return maxLength;
// }

// // Example usage:
// console.log(longestSubstring("ASVAJS")); // Output: 3


// function isPalindrome(s) {
//     // Remove non-alphanumeric characters and convert to lowercase
//     let cleaned = s.replace(/[^a-zA-Z0-9]/g, '').toLowerCase();

//     let left = 0, right = cleaned.length - 1;
//     while (left < right) {
//         if (cleaned[left] !== cleaned[right]) return false;
//         left++;
//         right--;
//     }

//     return true;
// }

// // Example usage:
// console.log(isPalindrome("A man, a plan, a canal, Panama 1")); // Output: true
// console.log(isPalindrome("racecar")); // Output: true
// console.log(isPalindrome("hello")); // Output: false


function ispall(num) {
    let num1 = num.toString();
    let string = num1.split('').reverse('').join('');
    return num == string;
}
console.log(ispall(121))




function factorial(n) {
    let number = 1;
    for (let i = 1; i <= n; i++) {
        number *= i
    }
    return number
}
console.log(factorial(5))


function ispalldigit(num) {
    let num1 = num.toString();
    let string = num1.split('').reverse('').join('');
    return num == string;
}
console.log(ispalldigit(12))