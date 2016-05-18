require_relative 'ui'
require_relative 'logic'

def joga(nome)
  mapa = le_mapa(1)
  while 
    desenha mapa
    direcao = pede_movimento
  end
end

def inicia_fogefoge
  nome = da_boas_vindas
  joga nome
end

