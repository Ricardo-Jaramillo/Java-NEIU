package problem3;

public interface InterfaceFoo {

    boolean theFooMethod();
}

// Which of the following methods could be used as a lambda for the above
// functional interface and why or why not?

/*
(1.) a -> false

YOUR RESPONSE HERE: It's a valid lambda because we assign the boolean variable "false" to the variable a. It's
return type it's still a boolean.


(2.) () -> true

YOUR RESPONSE HERE: It's a valid lambda because we pass the boolean variable "true". It's
return type it's still a boolean.


(3). (x, y) -> return x == y

YOUR RESPONSE HERE: It's not a valid lambda. We don't need the return statement because we don't have curly braces.

(4). () -> return false

YOUR RESPONSE HERE: Again, it's not a valid lambda. We don't need the return statement because we don't have curly
braces.

*/
