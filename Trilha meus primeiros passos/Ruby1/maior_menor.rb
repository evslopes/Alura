    puts "Bem vindo ao jogo da adivinhação"
    puts "Qual é o seu nome?"
    nome = gets
    puts "\n\n\n"
    puts "Começaremos o jogo para você, " + nome
    puts "Escolhendo um número secreto entre 0 e 200..."
    numero_secreto = 175
    puts "Escolhido... que tal adivinhar hoje nosso número secreto?"
    
    limite_de_tentativas = 5
    for n in 1..limite_de_tentativas
        puts "\n\n"
        puts "Tentativa " + n.to_s
        puts "Entre com o numero"
        chute = gets
        puts "Será que acertou? Você chutou " + chute
      
        acertou = numero_secreto == chute.to_i
       
        if acertou
         puts "Acertou!"
         break
        else
         if numero_secreto > chute.to_i
            puts "Errou! O numero é maior"
         else
            puts "Errou! O numero é menor"
         end    
       end
    end    