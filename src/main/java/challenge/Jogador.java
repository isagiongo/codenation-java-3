package challenge;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Jogador {

	private Long id;
	private String name;
	private String fullName;
	private String club;
	private String clubLogo;
	private Integer special;
	private Integer age;
	private String league;
	private LocalDate birthDate;
	private Double heightCm;
	private Double weightKg;
	private String bodyType;
	private Boolean realFace;
	private String flag;
	private String nationality;
	private String photo;
	private BigDecimal eurValue;
	private BigDecimal eurWage;
	private BigDecimal eurReleaseClause;

	public Jogador(Long id, String name, String fullName, String club, String clubLogo, Integer special, Integer age,
			String league, LocalDate birthDate, Double heightCm, Double weightKg, String bodyType, Boolean realFace,
			String flag, String nationality, String photo, BigDecimal eurValue, BigDecimal eurWage,
			BigDecimal eurReleaseClause) {
		super();
		this.id = id;
		this.name = name;
		this.fullName = fullName;
		this.club = club;
		this.clubLogo = clubLogo;
		this.special = special;
		this.age = age;
		this.league = league;
		this.birthDate = birthDate;
		this.heightCm = heightCm;
		this.weightKg = weightKg;
		this.bodyType = bodyType;
		this.realFace = realFace;
		this.flag = flag;
		this.nationality = nationality;
		this.photo = photo;
		this.eurValue = eurValue;
		this.eurWage = eurWage;
		this.eurReleaseClause = eurReleaseClause;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getClubLogo() {
		return clubLogo;
	}

	public void setClubLogo(String clubLogo) {
		this.clubLogo = clubLogo;
	}

	public Integer getSpecial() {
		return special;
	}

	public void setSpecial(Integer special) {
		this.special = special;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getLeague() {
		return league;
	}

	public void setLeague(String league) {
		this.league = league;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Double getHeightCm() {
		return heightCm;
	}

	public void setHeightCm(Double heightCm) {
		this.heightCm = heightCm;
	}

	public Double getWeightKg() {
		return weightKg;
	}

	public void setWeightKg(Double weightKg) {
		this.weightKg = weightKg;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public Boolean getRealFace() {
		return realFace;
	}

	public void setRealFace(Boolean realFace) {
		this.realFace = realFace;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public BigDecimal getEurValue() {
		return eurValue;
	}

	public void setEurValue(BigDecimal eurValue) {
		this.eurValue = eurValue;
	}

	public BigDecimal getEurWage() {
		return eurWage;
	}

	public void setEurWage(BigDecimal eurWage) {
		this.eurWage = eurWage;
	}

	public BigDecimal getEurReleaseClause() {
		return eurReleaseClause;
	}

	public void setEurReleaseClause(BigDecimal eurReleaseClause) {
		this.eurReleaseClause = eurReleaseClause;
	}

	@Override
	public String toString() {
		return "Jogador [id=" + id + ", name=" + name + ", fullName=" + fullName + ", club=" + club + ", clubLogo="
				+ clubLogo + ", special=" + special + ", age=" + age + ", league=" + league + ", birthDate=" + birthDate
				+ ", heightCm=" + heightCm + ", weightKg=" + weightKg + ", bodyType=" + bodyType + ", realFace="
				+ realFace + ", flag=" + flag + ", nationality=" + nationality + ", photo=" + photo + ", eurValue="
				+ eurValue + ", eurWage=" + eurWage + ", eurReleaseClause=" + eurReleaseClause + "]";
	}
	
	

}
