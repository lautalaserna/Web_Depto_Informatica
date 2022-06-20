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
                            <h4>${investigacion[i].titulo}</h4>
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
