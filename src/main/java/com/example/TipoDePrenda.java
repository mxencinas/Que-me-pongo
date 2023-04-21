package com.example;

public enum TipoDePrenda
{
  CROCS(Categoria.CALZADO),
  ZAPATOS(Categoria.CALZADO),
  ZAPATILLAS(Categoria.CALZADO),
  BOTAS(Categoria.CALZADO),

  CAMISA_MANGA_CORTA(Categoria.PARTE_SUPERIOR),
  CAMISA_MANGA_LARGA(Categoria.PARTE_SUPERIOR),
  REMERA(Categoria.PARTE_SUPERIOR),
  MUSCULOSA(Categoria.PARTE_SUPERIOR),

  PANTALOM_CORTO(Categoria.PARTE_INFERIOR),
  PANTALON_LARGO(Categoria.PARTE_INFERIOR),
  BERMUDA(Categoria.PARTE_INFERIOR),
  POLLERA(Categoria.PARTE_INFERIOR),

  ANTEOJOS(Categoria.ACCESORIO),
  RELOJ(Categoria.ACCESORIO),
  SOMBRERO(Categoria.ACCESORIO),
  PANUELO(Categoria.ACCESORIO);

  private final Categoria categoria;

  TipoDePrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria categoria() {
    return categoria;
  }
}
