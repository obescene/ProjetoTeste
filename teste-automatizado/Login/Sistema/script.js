let form = {
    email : document.querySelector('#email'),
    senha : document.querySelector('#senha'),
    btnEntrar : document.querySelector('#btn-entrar'),
    linkEsqueciSenha : document.querySelector('#esqueci-senha')
}

const usuario = {
    email: 'admin@admin.com',
    senha: 'admin123'
}

form.email.addEventListener('keypress', (e)=>{
    preventDefaultHandler();
})

form.linkEsqueciSenha.addEventListener('click', (e)=>{
    e.preventDefault();
    successHandler();
})

form.btnEntrar.addEventListener('click', (e) =>{
   
    e.preventDefault();

    if(!form.email.value || !form.senha.value){
        errorHandler();
        return;
    }
    else if(form.email.value.toLowerCase() != usuario.email ||
            form.senha.value != usuario.senha){
        
        errorHandler();
        return;
    }

    successHandler();
})

const errorHandler = () => {
    form.btnEntrar.classList.remove('success');
    form.btnEntrar.classList.add('error');
    form.btnEntrar.textContent = "Error"
}

const preventDefaultHandler = () => {
    form.btnEntrar.classList.remove('success');
    form.btnEntrar.classList.remove('error');
    form.btnEntrar.textContent = "Login"
}

const successHandler = () => {
    form.btnEntrar.classList.remove('error');
    form.btnEntrar.classList.add('success');
    form.btnEntrar.textContent = "Okay"
}