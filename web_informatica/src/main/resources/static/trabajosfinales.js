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
    td_titulo.innerHTML = obj.titulo
    td_estudiantes.innerHTML = obj.estudiantes
    td_demandante.innerHTML = obj.demandante
    td_directores.innerHTML = obj.directores
    td_url.innerHTML = `<a href=${obj.url}>ver trabajo</a>`
}