// Interfaces Funcionais - Predicate
package lambda;

import java.util.function.Predicate;

public class PredicadoComposicao {
    
    public static void main(String[] args) {
        
        // Interface funcional "Predicate" recebe um valor e retorna algo de mesmo valor.

        // Recebendo atráves do "Generics" um inteiro e retornando um inteiro:
        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;

        // Testando usando composição de função com operador and:
        System.out.println(isPar.and(isTresDigitos).test(122));
        System.out.println(isPar.and(isTresDigitos).test(123));

        // Testando usando composição de função com operador or:
        System.out.println(isPar.or(isTresDigitos).test(122));
        System.out.println(isPar.or(isTresDigitos).test(123));
    }
}
