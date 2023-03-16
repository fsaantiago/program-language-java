package br.com.restaurante;

public class Hamburguer {
		private String nome;
		private double valorHamburguer;
		private boolean artesanal;
		
		public Hamburguer(String nome, double valorHamburguer, boolean artesanal) {
			super();
			this.nome = nome;
			this.valorHamburguer = valorHamburguer;
			this.artesanal = artesanal;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getvalorHamburguer() {
			return valorHamburguer;
		}

		public void setvalorHamburguer(double valorHamburguer) {
			this.valorHamburguer = valorHamburguer;
		}

		public boolean isArtesanal() {
			return artesanal;
		}

		public void setArtesanal(boolean artesanal) {
			this.artesanal = artesanal;
		}
		
		public Double calculaArtesanal(Boolean artesanal){
			if (artesanal == true) {
				return valorHamburguer + 8;
			}
			return valorHamburguer;
		}
		
		public String consultaNome() {
			return nome;
		}
		
		
			
}

	