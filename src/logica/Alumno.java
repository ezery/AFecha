package logica;

public class Alumno {

	private String apellido;
	private String grupo;
	private float cuota;
	private Fecha fechaNac;

	public Alumno() {
		cuota = 1000;
	}

	public Alumno(String ape, String gru, float cuo, Fecha fechaNac) {
		apellido = ape;
		grupo = gru;
		cuota = cuo;
		this.fechaNac=fechaNac;
	}

	public String getApellido() {
		return apellido;
	}

	public String getGrupo() {
		return grupo;
	}

	public float getCuota() {
		return cuota;
	}

	public Fecha getFechaNac(Fecha f){
		return f;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public void setCuota(float cuota) {
		this.cuota = cuota;
	}

	public void setFechaNac(Fecha f) {
        this.fechaNac = f;
    }

	public boolean boletoGratis(){
        int edad = 2023 - fechaNac.getAño();
		if (edad>18){
			return true;
		}else{
			return false;
		}
    }

	@Override
	public String toString() {
		return String.format("Apellido: %s, Grupo: %s, Cuota: %s, Fecha de nacimiento: %s, Boleto Gratis: %s", apellido, grupo, cuota, fechaNac.toString(), boletoGratis());
	}

}