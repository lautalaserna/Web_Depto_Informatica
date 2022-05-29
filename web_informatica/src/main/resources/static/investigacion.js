const URL = '/api/investigacion'

async function fetchInvestigacionJSON() {
    const response = await fetch(URL);
    const investigacion = await response.json();
    return investigacion;
}

fetchInvestigacionJSON().then(investigacion => {
    const div = document.getElementById("div-investigacion");
    let innerHTML = "";
    for(let i=0; i<investigacion.length ; i++){
        innerHTML += `<div class="container my-5">
                        <div class="header-investigacion">
                            <h3>${investigacion[i].titulo}</h3>
                        </div>
                        <div class="p-4 body-investigacion">
                            <div class="container">
                                <p class="lead"><b>Integrantes:&nbsp</b>${investigacion[i].integrantes}</p>
                            </div>
                            <div class="container">
                                <p class="lead"><b>Objetivo:&nbsp</b>${investigacion[i].objetivo}</p>
                            </div>
                            <div class="text-end">
                                <button href="${investigacion[i].url}" class="btn-section-size btn-style rounded"><h5 class="pt-2">Ver más</h5></button>
                            </div>
                        </div>
                    </div>`;
        console.log(innerHTML);
    }
    div.innerHTML = innerHTML;
});

/*
fetchInvestigacionJSON().then(investigacion => {
    const div = document.getElementById("div-investigacion");
    var i = 0;
    for(let i=0; i<investigacion.length ; i++){

        //Declaracion de elementos y classes
        let div_interno = document.createElement("div");
        div_interno.classList.add("bg-light");
        div_interno.classList.add("p-5");
        div_interno.classList.add("rounded");
        div_interno.classList.add("mt-3");
        
        let titulo = document.createElement("h3");

        let div_integrantes = document.createElement("div");
        div_integrantes.classList.add("container");

        let integrantes = document.createElement("p");
        integrantes.classList.add("lead");

        let div_objetivo = document.createElement("div");
        div_objetivo.classList.add("container");

        let objetivo = document.createElement("p");
        objetivo.classList.add("lead");

        let div_url = document.createElement("div");
        div_url.classList.add("container");

        let url = document.createElement("span");

        //añadido de valores
        titulo.innerHTML = investigacion[i].titulo

        integrantes.innerHTML = `<b>Integrantes:</b> ${investigacion[i].integrantes}`;
        objetivo.innerHTML = `<b>Objetivo:</b> ${investigacion[i].objetivo}`
        investigacion[i].url ? url.innerHTML = `<b>Ver más:</b> ${investigacion[i].url}`: url.innerHTML = '';
        
        //anidacion
        div.appendChild(div_interno);
        div_interno.appendChild(titulo);
        div_interno.appendChild(div_integrantes);
        div_interno.appendChild(div_objetivo);
        div_interno.appendChild(div_url);
        div_integrantes.appendChild(integrantes);
        div_objetivo.appendChild(objetivo);
        div_url.appendChild(url);
    }
});*/
