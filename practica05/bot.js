var msj_bot = {
    saludo : "Hola", 
    despedida : "Adios",
    preocupacion : "Como estas?",
    sorpresa : "orale!"
}

var arr_msj = ["Hola","Adios","Como estas?","orale!"]

function test(){
    let mensajes = document.getElementById("msjs")
    //mensajes.innerHTML = arr_msj;
    //mensajes.innerHTML = msj_bot;
    mensajes.innerHTML = JSON.stringify(msj_bot);    
}

function procesa(){
    let campo  =  document.getElementById("msj").value 
    console.log(woz(campo))
    let mensajes = document.getElementById("msjs")
    mensajes.innerHTML = msj_bot[woz(campo)]   
}

function woz(params){
    if(params == "Hola")
        return "saludo"
    if(params == "Me siento mal")
        return "sorpresa"

    if(params == "Adios")
        return "sespedida"

    if(params == "Hola")
        return "Saludo"

    if(params == "")
        return "preocupacion"
}