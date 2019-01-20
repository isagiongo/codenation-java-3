package challenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Formatter;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	private List<Jogador> jogadores = new ArrayList<>();

	public Main() throws FileNotFoundException {
		File dadosCSV = new File("../java-3/src/main/resources/data.csv");
		Scanner scanner = new Scanner(dadosCSV);
		scanner.nextLine();
		while (scanner.hasNext()) {
			String str[] = scanner.nextLine().split(",");
			jogadores.add(new Jogador(new Integer(str[0]), str[1], str[2], str[3], 
				str[14]));
		}
	}

	// Quantas nacionalidades (coluna `nationality`) diferentes existem no arquivo?
	public int q1() {
		Set<String> nacionalidades = new HashSet<>();
		jogadores.forEach(jogador -> nacionalidades.add(jogador.getNationality()));
		return nacionalidades.size();
	}

	// Quantos clubes (coluna `club`) diferentes existem no arquivo?
	// Obs: Existem jogadores sem clube.
	public int q2() {
		Set<String> clubes = new HashSet<>();
		jogadores.forEach(jogador -> clubes.add(jogador.getClub()));
		System.out.println(clubes.size());
		return clubes.size();
	}

	// Liste o primeiro nome (coluna `full_name`) dos 20 primeiros jogadores.
	public List<String> q3() {
		return null;
	}

	// Quem são os top 10 jogadores que possuem as maiores cláusulas de rescisão?
	// (utilize as colunas `full_name` e `eur_release_clause`)
	public List<String> q4() {
		return null;
	}

	// Quem são os 10 jogadores mais velhos (use como critério de desempate o campo
	// `eur_wage`)?
	// (utilize as colunas `full_name` e `birth_date`)
	public List<String> q5() {
//		jogadores.stream()
//		.sorted(Comparator.comparing(Jogador::get))
//		.max(Comparator.comparing(Jogador::getDataNascimento).reversed()).map(Jogador::getId).get();
		return null;
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

//	
//	public List<Jogador> processInputFile() {
//		String fileName = "../java-3/src/main/resources/data.csv";
//	    List<Jogador> inputList = new ArrayList<>();
//	    try{
//	      File inputF = new File(fileName);
//	      InputStream inputFS = new FileInputStream(inputF);
//	      BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));
//	      inputList = br.lines().skip(1).map(listaJogador).collect(Collectors.toList());
//	      br.close();
//	    } catch (IOException e) {
//			e.printStackTrace();
//	    }
//	    return inputList ;
//	}
//	
//	public static Function<String, Jogador> listaJogador = (line) -> {
//		String[] str = line.split(",");
//		return new Jogador(Long.parseLong(str[0]), str[1], str[2], str[3], str[4], Integer.parseInt(str[5]),
//				Integer.parseInt(str[6]), str[7], LocalDate.parse(str[8], DateTimeFormatter.ofPattern("yyyy-MM-dd")),
//				Double.parseDouble(str[9]), Double.parseDouble(str[10]), str[11], Boolean.parseBoolean(str[12]),
//				str[13], str[14], str[15], new BigDecimal(str[16]), new BigDecimal(str[17]), new BigDecimal(str[18]));
//	};

}
