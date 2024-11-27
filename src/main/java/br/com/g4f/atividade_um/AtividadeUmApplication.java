package br.com.g4f.atividade_um;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.g4f.atividade_um.impl.ArCondicionado;
import br.com.g4f.atividade_um.impl.Controle;
import br.com.g4f.atividade_um.impl.Tv;

@SpringBootApplication
public class AtividadeUmApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtividadeUmApplication.class, args);
		
		Controle controle = new Controle();
		System.out.println("\n\n\n");
		System.out.println("UTILIZANDO A TV");
		System.out.println("--/--/--/--/--/--/--/--/--/--/--/--/--/--/--/--/--/--\n");
		Tv tv = new Tv();
		
		System.out.println("CASO 01: aumentando volume com tv desligada");
		controle.aumentar(tv);
		
		System.out.println("\nCASO 02: ligando a TV");
		controle.power(tv);
		
		System.out.println("\nCASO 03: Aumentando volume da TV com ela ligada");
		controle.aumentar(tv);
		
		System.out.println("\nCASO 04: Aumentando volume da TV até máximo");
		while (controle.aumentar(tv)) {}
		
		System.out.println("\nCASO 05: Tentativa de aumentando volume além do permitido");
		controle.aumentar(tv);
		
		System.out.println("\nCASO 06: Reduzindo o volume até mínimo");
		while (controle.diminuir(tv)) {}
		
		System.out.println("\nCASO 07: Tentativa de diminuir volume além do permitido");
		controle.diminuir(tv);
		
		System.out.println("\nCASO 08: Mudar de canal crescente várias vezes");
		for(int i=0; i<62; i++) {
			controle.funcAumentar(tv);
		}
		
		System.out.println("\nCASO 08: Mudar de canal decrescente várias vezes");
		for(int i=0; i<62; i++) {
			controle.funcDiminuir(tv);
		}
		
		System.out.println("\n\n\n\n\nUTILIZANDO O AR\n\n\n");
		System.out.println("--/--/--/--/--/--/--/--/--/--/--/--/--/--/--/--/--/--\n");

		ArCondicionado arCondicionado = new ArCondicionado();
		
		System.out.println("CASO 01: aumentando temperatura com ar condicionado desligado");
		controle.aumentar(arCondicionado);
		
		System.out.println("\nCASO 02: ligando o ar condicionado");
		controle.power(arCondicionado);
		
		System.out.println("\nCASO 03: Aumentando a temperatura com ar condiconado ligado");
		controle.aumentar(arCondicionado);
		
		System.out.println("\nCASO 04: Aumentando temperatura até máximo");
		while (controle.aumentar(arCondicionado)) {}
		
		System.out.println("\nCASO 05: Tentativa de aumentando temperatura além do permitido");
		controle.aumentar(arCondicionado);
		
		System.out.println("\nCASO 06: Reduzindo a temperatura até mínimo");
		while (controle.diminuir(arCondicionado)) {}
		
		System.out.println("\nCASO 07: Tentativa de diminuir a temperatura além do permitido");
		controle.diminuir(arCondicionado);
		
		System.out.println("\nCASO 08: Mudar o modo do ar condicionado crescente várias vezes");
		for(int i=0; i<7; i++) {
			controle.funcAumentar(arCondicionado);
		}
		
		System.out.println("\nCASO 08: Mudar o modo do ar condicionado decrescente várias vezes");
		for(int i=0; i<7; i++) {
			controle.funcDiminuir(arCondicionado);
		}

	}

}
