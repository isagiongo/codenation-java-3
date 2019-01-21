package challenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	private List<Jogador> jogadores;

	public Main() throws FileNotFoundException {
		jogadores  = new ArrayList<>();
		File dadosCSV = new File("../java-3/src/main/resources/data.csv");
		Scanner scanner = new Scanner(dadosCSV);
		scanner.nextLine();
		while (scanner.hasNext()) {
			String str[] = scanner.nextLine().split(",");
			jogadores.add(new Jogador(new Integer(str[0]), str[1], str[2], str[3], 
				LocalDate.parse(str[8]), str[14], new BigDecimal(str[18])));
		}
		scanner.close();
	}

	// Quantas nacionalidades (coluna `nationality`) diferentes existem no arquivo?
	public int q1() {
		Long nacionalidades = jogadores.stream().map(Jogador::getNationality).distinct().count();
		return nacionalidades.intValue();
	}

	// Quantos clubes (coluna `club`) diferentes existem no arquivo?
	// Obs: Existem jogadores sem clube.
	public int q2() {
		Long clubes = jogadores.stream().filter(vazio -> !vazio.getClub().isEmpty())
				.map(Jogador::getClub).distinct().count();
		return clubes.intValue();
	}

	// Liste o primeiro nome (coluna `full_name`) dos 20 primeiros jogadores.
	public List<String> q3() {
		List<String> primeirosVinte = jogadores.stream().limit(20).map(Jogador::getFullName)
				.collect(Collectors.toList());
		return primeirosVinte;
	}

	// Quem são os top 10 jogadores que possuem as maiores cláusulas de rescisão?
	// (utilize as colunas `full_name` e `eur_release_clause`)
	public List<String> q4() {
		List<String> dezMaiores = jogadores.stream().sorted(Comparator.comparing(Jogador::getEurReleaseClause).reversed())
				.map(Jogador::getFullName).limit(10).collect(Collectors.toList());
		return dezMaiores;
	}

	// Quem são os 10 jogadores mais velhos (use como critério de desempate o campo
	// `eur_wage`)?
	// (utilize as colunas `full_name` e `birth_date`)
	public List<String> q5() {
		List<String> maisVelhos = jogadores.stream()
				.sorted(Comparator.comparing(Jogador::getBirthDate).reversed())
				.map(Jogador::getFullName).limit(10).collect(Collectors.toList());
		return maisVelhos;
	}

	// Conte quantos jogadores existem por idade. Para isso, construa um mapa onde
	// as chaves são as idades e os valores a contagem.
	// (utilize a coluna `age`)
	public Map<Integer, Integer> q6() {
		return null;
	}

//	public void montaMapaJogadores() throws IOException {
//		String fileName = "../java-3/src/main/resources/data.csv";
//		
//		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
//			stream.skip(1).map(line -> line.split(","))
//					.map(str -> new Jogador(Long.parseLong(str[0]), str[1], str[2], str[3], str[4],
//							Integer.parseInt(str[5]), Integer.parseInt(str[6]), str[7],
//							LocalDate.parse(str[8], DateTimeFormatter.ofPattern("yyyy-MM-dd")),
//							Double.parseDouble(str[9]), Double.parseDouble(str[10]), str[11],
//							Boolean.parseBoolean(str[12]), str[13], str[14], str[15], new BigDecimal(str[16]),
//							new BigDecimal(str[17]), new BigDecimal(str[18])))
//					.forEach(System.out::println);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

}
