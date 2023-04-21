package com.example;

public class Prenda {
  TipoDePrenda tipo;
  Material material;
  Color colorPrimario;
  Color colorSecundario;

  public Prenda(TipoDePrenda tipo, Material material, Color color) {
    this.tipo = tipo;
    this.material = material;
    this.colorPrimario = color;
  }

  public Categoria categoria()
  {
    return tipo.categoria();
  }
}
