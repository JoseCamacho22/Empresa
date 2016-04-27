package src;

public class Persona {
		String nick,nombre,apellido,email,pass,pasRep;

		public Persona(String nick, String nombre, String apellido, String email, String pass, String pasRep) {
			super();
			this.nick = nick;
			this.nombre = nombre;
			this.apellido = apellido;
			this.email = email;
			this.pass = pass;
			this.pasRep = pasRep;
		}
		//
//
		public String getNick() {
			return nick;
		}

		public void setNick(String nick) {
			this.nick = nick;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPass() {
			return pass;
		}

		public void setPass(String pass) {
			this.pass = pass;
		}

		public String getPasRep() {
			return pasRep;
		}

		public void setPasRep(String pasRep) {
			this.pasRep = pasRep;
		}

		@Override
		public String toString() {
			return "Persona [nick=" + nick + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
					+ ", pass=" + pass + ", pasRep=" + pasRep + "]";
		}
		
		
		
}
