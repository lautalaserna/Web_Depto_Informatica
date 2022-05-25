const URL = '/api/elecciones'

async function fetchEleccionesJSON() {
    const response = await fetch(URL);
    const elecciones = await response.json();
    return elecciones;
}

fetchEleccionesJSON().then(elecciones => {
    const tbody = document.getElementById("tbody-elecciones");
    var i = 0;
    for(let i=0; i<elecciones.length ; i++){
        let tr = tbody.insertRow(i);
        let td_postulante = tr.insertCell(0);
        let td_dni = tr.insertCell(1);
        let td_votos = tr.insertCell(2);
        
        td_postulante.innerHTML = `<h4 class="py-2">${elecciones[i].postulante}</h4>`;
        td_dni.innerHTML = `<h4 class="py-2">${elecciones[i].dni}</h4>`;
        td_votos.innerHTML = `<h4 class="py-2">${elecciones[i].votos}</h4>`;
    }
});