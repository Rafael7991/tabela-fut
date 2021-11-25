package projeto2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import entities.times;

public class tabela {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer[] placar = new Integer[2];
		System.out.print("Numero de times: ");
		times[] timesn = new times[sc.nextInt()];
		List<times> timesm = new ArrayList<>();
		for (int i = 0; i < timesn.length; i++) {
			timesn[i] = new times();
			System.out.printf("%s%d%s", "DIgite o nome do time: ", i + 1, ": ");
			String nome = sc.next();
			timesn[i].setNome(nome);
			timesm.add(timesn[i]);
		}

		for (int i = 0; i < timesn.length; i++) {
			for (int j = 0; j < timesn.length; j++) {
				if (j != i) {
					sc.nextLine();
					System.out.printf("%s%s%s%s%n", timesn[i].getNome(), " X ", timesn[j].getNome(), " Foi realizado?");
					if (sc.next().charAt(0) == 'S' || sc.next().charAt(0) == 's') {
						System.out.printf("%s%s%s%s%n", "digite o resultado de: ", timesn[i].getNome(), " X ",
								timesn[j].getNome());
						placar[0] = sc.nextInt();
						placar[1] = sc.nextInt();

						timesn[i].setGolPro(placar[0]);
						timesn[j].setGolPro(placar[1]);
						timesn[i].setGolContra(placar[1]);
						timesn[j].setGolContra(placar[0]);

						if (placar[0] == placar[1]) {
							timesn[i].setPonto(1);
							timesn[j].setPonto(1);
						} else if (placar[0] > placar[1]) {
							timesn[i].setPonto(3);
							timesn[i].vit();
						} else {
							timesn[j].setPonto(3);
							timesn[j].vit();
						}
					} else {
						placar[0] = null;
						placar[1] = null;
					}
				}
			}
		}

		Collections.sort(timesm, new Comparator<times>() {
			public int compare(times lhs, times rhs) {
				if (lhs.getPonto() != rhs.getPonto())
					return Integer.compare(rhs.getPonto(), lhs.getPonto());
				else if (rhs.getVit() != lhs.getVit())
					return Integer.compare(rhs.getVit(), lhs.getVit());
				return Integer.compare(rhs.getSaldo(), lhs.getSaldo());
			}
		});

		for (times times : timesm) {
			System.out.print(timesm.indexOf(times) + 1);
			System.out.print(" ");
			System.out.print(times);
		}

		sc.close();

	}

}
