document.addEventListener("DOMContentLoaded", function() {
    
    var entrarBtn = document.querySelector(".component-15");
    var criarCadastroBtn = document.querySelector(".component-10");
    var emailInput = document.querySelector(".e-mail input");
    var senhaInput = document.querySelector(".senha input");
  
    
    entrarBtn.addEventListener("click", function() {
      var email = emailInput.value;
      var senha = senhaInput.value;
      
      if (email && senha) {
        
        console.log("Email:", email);
        console.log("Senha:", senha);
      } else {
        console.log("Por favor, preencha o email e a senha.");
      }
    });
  
    criarCadastroBtn.addEventListener("click", function() {
      
      console.log("Criar Cadastro clicado");
    });
  });