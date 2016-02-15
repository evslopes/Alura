def le_mapa(numero)
  arquivo = "mapa#{numero}.txt"
  texto = File.read(arquivo)
  mapa = texto.split("\n")
end