import java.util.Scanner;

public class CountLetterA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a entrada do usuário
        System.out.println("Digite uma string: ");
        String input = scanner.nextLine();

        // Chama a função que conta a ocorrência da letra 'a'
        int count = countLetterA(input);

        // Exibe o resultado
        if (count > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) aparece " + count + " vezes na string.");
        } else {
            System.out.println("A letra 'a' (maiúscula ou minúscula) não aparece na string.");
        }

        scanner.close();
    }

    // Função que conta as ocorrências de 'a' ou 'A' na string
    public static int countLetterA(String str) {
        int count = 0;

        // Itera sobre cada caractere da string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // Verifica se o caractere é 'a' ou 'A'
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        return count;
    }
}
