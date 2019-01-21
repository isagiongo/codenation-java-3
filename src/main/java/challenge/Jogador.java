package challenge;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Jogador {

	private Integer id;
	private String name;
	private String fullName;
	private String club;
	private LocalDate birthDate;
	private String nationality;
	private BigDecimal eurReleaseClause;

	public Jogador(Integer id, String name, String fullName, String club, LocalDate birthDate, String nationality,
			BigDecimal eurReleaseClause) {
		super();
		this.id = id;
		this.name = name;
		this.fullName = fullName;
		this.club = club;
		this.birthDate = birthDate;
		this.nationality = nationality;
		this.eurReleaseClause = eurReleaseClause;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public BigDecimal getEurReleaseClause() {
		return eurReleaseClause;
	}

	public void setEurReleaseClause(BigDecimal eurReleaseClause) {
		this.eurReleaseClause = eurReleaseClause;
	}
}