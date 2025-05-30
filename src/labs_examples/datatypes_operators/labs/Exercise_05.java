package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }



        // example of "short-circuit AND"
        boolean c = true;
        boolean d = true;
        if (c && d){
            System.out.println("c is true so statement is true");
        }

        // example of "AND"
        boolean e = true;
        boolean f = true;
        if (e & f){
            System.out.println("e and f are true so statement is true ");
        }

        // example of "OR"
        boolean i = true;
        boolean j = false;
        if (i | j){
            System.out.println("i or j are true ");
        }

        // example of "Short-Circuit OR"
        boolean r = true;
        boolean s = false;
        if (r || s){
            System.out.println("since r is true, statement is true");
        }

        // example of "XOR"
        boolean m = true;
        boolean n = true;
        if (m ^ n){
            System.out.println("since m is true and n is true,, statement is false");
        }

        // example of "NOT"
        boolean x = true;
        boolean  y = false;
        if (x == !y){
            System.out.println("statement  is true");
        }
    }

}

