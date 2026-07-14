# tinder-quack
Objetivo - Desenvolver um aplicativo de relacionamento para patos, permitindo que eles criem perfis, visualizem outros perfis e interajam com outros patos, assim formando matches e corversando com os interessados!

classe pato:
  Atributos: 
    email: String
    nome: String
    telefone: int
    sexo: String
    idade: int
    senha: String
    idPato: int
  Métodos:
    sairDaConta
    login
    editarDados
    excluirConta

classe patoSelvagem:
  Atributos:
    regiaoOrigem: String
  Métodos:
    editarRegiao
    excluirRegiao

classe patoDomestisco
  Atributos:
    raca: String
  Métodos:
    editarRaca
    excluirRaca

classe perfil:
  Atributos:
    bio: String
    foto: String
    nomeDoUsuario: String
    cidade: String
    estado: String
    lago: String
  Métodos:
    editarBio
    editarFoto
    editarNomedoUsuario

classe curtida:
  Atibutos:
   idCurtida: int
   perfilOrigem: perfil
   perfilDestino: perfil
  Métodos:
    registrarCurtida
    registrarDeslike

classe match:
  Atributos:
    idMatch: int
    perfil1: perfil
    perfil2: perfil
  Métodos: 
    criarMatch

classe mensagem:
    Atributos:
      idMensagem: int
      conteudo: String
      enviadoPor: perfil
    Método:
      enviarMensagem
      apagarMensagem
  
