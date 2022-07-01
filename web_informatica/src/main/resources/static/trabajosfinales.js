const URL = '/api/trabajosfinales'

async function fetchTrabajosFinalesJSON() {
    const response = await fetch(URL);
    const trabajos = await response.json();
    return trabajos;
}

fetchTrabajosFinalesJSON().then(trabajos => {
    const tbody = document.getElementById("tbody-trabajos-finales-concluidos");
    const tbody2 = document.getElementById("tbody-trabajos-finales-no-concluidos");
    
    let i = 0
    while(trabajos[i] != undefined && trabajos[i].is_concluido == 'Y'){
        fillRow(tbody, trabajos[i], i)
        i++
    }
    let j = 0
    while(trabajos[i] != undefined && trabajos[i].is_concluido == 'N'){
        fillRow(tbody2, trabajos[i], j)
        i++
        j++
    }
});

function fillRow(tbody, obj, i){
    let tr = tbody.insertRow(i)
    let td_titulo = tr.insertCell(0)
    let td_estudiantes= tr.insertCell(1)
    let td_demandante = tr.insertCell(2)
    let td_directores = tr.insertCell(3)
    let td_url = tr.insertCell(4)
    td_titulo.innerHTML = `<h5 class="py-2">${obj.titulo}</h5>`
    td_estudiantes.innerHTML = `<h5 class="py-2">${obj.estudiantes}</h5>`
    td_demandante.innerHTML = `<h5 class="py-2">${obj.demandante}</h5>`
    td_directores.innerHTML = `<h5 class="py-2">${obj.directores}</h5>`
    td_url.innerHTML = `<a href=${obj.url}><h5 class="py-2">Ver Trabajo</h5></a>`
}