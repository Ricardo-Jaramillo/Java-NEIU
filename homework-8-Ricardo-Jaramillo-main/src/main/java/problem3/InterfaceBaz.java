package problem3;

public interface InterfaceBaz {

    double myBazMethod(String s);
}

// Write a lambda that can be used with the above functional interface and explain why this
// lambda is valid for the interface.

/*

YOUR RESPONSE HERE: s -> "My String"
                    It's a valid lambda cause we return the string "My String" assigned to the lambda parameter "s".
                    It's not necessary to have the parameter between parenthesis 'cause it's only one parameter,
                    it's not necessary to specify the type of the parameter. It's not necessary to add the "return"
                    statement because the String that it's returned is not in curly braces, also same reason we don't
                    need the semicolon. Finally, the return type is a String just as the.

 */
