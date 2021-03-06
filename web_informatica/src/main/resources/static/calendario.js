const URL = '/api/calendario'

async function fetchDocentesJSON() {
    const response = await fetch(URL);
    const calendario = await response.json();
    return calendario;
}

fetchDocentesJSON().then(calendario => {
    const tbody = document.getElementById("tbody-calendario");
    for(let i=0; i<calendario.length ; i++){
        let tr = tbody.insertRow(i);
        let td_fecha_inicio = tr.insertCell(0);
        let td_fecha_fin = tr.insertCell(1);
        let td_motivo = tr.insertCell(2);
        
        td_fecha_inicio.innerHTML = `<h5 class="py-2">${calendario[i].fecha_inicio}</h5>`;
        td_fecha_fin.innerHTML = `<h5 class="py-2">${calendario[i].fecha_fin}</h5>`;
        td_motivo.innerHTML = `<h5 class="py-2 text-start">${calendario[i].concepto}</h5>`;
    }
});