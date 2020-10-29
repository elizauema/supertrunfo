package br.com.eliza.supertrunfo;

public class Carta {
		//public String nome;
		private String nome;
		private int forca;
		private int habilidade;
		private int velocidade;
		private int poderes;
		private int poderdecura;
		
		public Carta(String nome, int forca, int habilidade, int velocidade, int poderes, int poderdecura) {
			this.nome = nome;
			this.forca = forca;
			this.habilidade = habilidade;
			this.velocidade = velocidade;
			this.poderes = poderes;
			this.poderdecura = poderdecura;
		}
		
		//public String getNome() {
		//	return "Vilao "+nome;
		//}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			if (nome.length()<2 ) {
				throw new IllegalArgumentException();
			}
			this.nome = nome;
		}
		public int getForca() {
			return forca;
		}
		public void setForca(int forca) {
			this.forca = forca;
		}
		public int getHabilidade() {
			return habilidade;
		}
		public void setHabilidade(int habilidade) {
			this.habilidade = habilidade;
		}
		public int getVelocidade() {
			return velocidade;
		}
		public void setVelocidade(int velocidade) {
			this.velocidade = velocidade;
		}
		public int getPoderes() {
			 return poderes;
		}
		public void setPoderes(int poderes) {
			this.poderes = poderes;
		}
		public int getPoderDeCura() {
			return poderdecura;
		}
		public void setPoderDeCura( int poderesdecura) {
			this.poderdecura = poderdecura;
		}
		//public String toString() {
		//	return this.nome;
		//}

		@Override
		public String toString() {
			return "Carta [nome=" + nome + ", forca=" + forca + ", habilidade=" + habilidade + ", velocidade="
					+ velocidade + ", poderes=" + poderes + ", poderdecura=" + poderdecura + "]";
		}
		
}

