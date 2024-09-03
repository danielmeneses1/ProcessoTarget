public class FibonacciCheck {
    public static void main(String[] args) {
        int numberToCheck = 21; // Número a ser verificado

        if (isFibonacci(numberToCheck)) {
            System.out.println(numberToCheck + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numberToCheck + " não pertence à sequência de Fibonacci.");
        }
    }

    // Função que verifica se um número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int number) {
        int first = 0;
        int second = 1;

        // Verifica se o número é 0 ou 1, que pertencem à sequência
        if (number == first || number == second) {
            return true;
        }

        int next = first + second;

        // Gera a sequência de Fibonacci até que o número seja encontrado ou superado
        while (next <= number) {
            if (next == number) {
                return true;
            }
            first = second;
            second = next;
            next = first + second;
        }

        return false;
    }
}
