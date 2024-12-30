var cancellable = function(fn, args, t) {
 // This line declares a variable named cancellable and assigns it a function value.
 // The function takes three parameters: fn, args, and t.
 // fn is another function that we want to call later.
 // args is an array of arguments that we want to pass to fn when we call it.
 // t is a number of milliseconds that we want to wait before calling fn.

 let timer = setTimeout(() => {
   // This line creates a variable named timer and assigns it the result of calling setTimeout.
   // setTimeout is a built-in function that can execute another function after a delay.
   // The first argument of setTimeout is a function that we want to execute later.
   // The second argument of setTimeout is the delay in milliseconds.
   // In this case, we are using an arrow function as the first argument, which is a shorthand way of writing a function.
   // The arrow function has no parameters and no curly braces, which means it will execute one statement and return its value.
   fn(...args); // This is the statement that the arrow function will execute. It calls fn with the args as parameters.
   // The ... operator is called the spread operator, which can expand an array into individual elements.
   // For example, if args is [2, 3], then fn(...args) is equivalent to fn(2, 3).
 }, t);
 // The result of calling setTimeout is a numeric value that represents the timer ID. We can use this ID to cancel the timer later.

 return function() {
   // This line returns another function from the cancellable function. This function will act as the cancel function.
   // This function has no parameters and no name. It is an anonymous function.

   clearTimeout(timer); // This line calls clearTimeout, which is another built-in function that can cancel a timer created by setTimeout.
   // The argument of clearTimeout is the timer ID that we want to cancel. In this case, we use the timer variable that we created earlier.
 };
};