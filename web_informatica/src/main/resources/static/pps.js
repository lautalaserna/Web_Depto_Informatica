const URL_disponibles = '/api/pps_disponibles'
const URL_curso = '/api/pps_curso'
const URL_finalizadas = '/api/pps_finalizadas'

async function fetchPPSJSON(url) {
    const response = await fetch(url);
    const pps = await response.json();
    return pps;
}

/*
async function process(){
    await fetchPPSJSON(URL_disponibles).then(pps => {generateTable(pps, "tbody-disponibles", false)})
    await fetchPPSJSON(URL_curso).then(pps => {generateTable(pps, "tbody-curso", true)})
    await fetchPPSJSON(URL_finalizadas).then(pps => {generateTable(pps, "tbody-finalizadas", true)})
}
*/

fetchPPSJSON(URL_disponibles).then(pps => {generateTable(pps, "tbody-disponibles", false)})
fetchPPSJSON(URL_curso).then(pps => {generateTable(pps, "tbody-curso", true)})
fetchPPSJSON(URL_finalizadas).then(pps => {generateTable(pps, "tbody-finalizadas", true)})

//una pps asignada es una pps en curso o finalizada (posee alumnos, tutores, etc..)
async function generateTable(pps, tbody_name, asignada){
    const tbody = document.getElementById(tbody_name);

    for(let i=0; i<pps.length; i++){
        let tr = tbody.insertRow(i)
        let td_entidad = tr.insertCell(0)
        let td_objetivo = tr.insertCell(1)
        let td_fechaInicio = tr.insertCell(2)
        let td_fechaFin = tr.insertCell(3)
        let td_presupuesto = tr.insertCell(4)
        let td_is_contratacion = tr.insertCell(5)

        //asignadas tienen atributos extra
        if(asignada){
            let td_estudiantes = tr.insertCell(6)
            let td_tutores = tr.insertCell(7)
            let td_lugar = tr.insertCell(8)
            let td_is_pdts = tr.insertCell(9)
            let td_is_pps = tr.insertCell(10)
            let td_is_psc = tr.insertCell(11)
            td_estudiantes.innerHTML = `<h5 class="py-2">${pps[i].estudiantes}</h5>`
            td_tutores.innerHTML = `<h5 class="py-2">${pps[i].tutores}</h5>`
            td_lugar.innerHTML = `<h5 class="py-2">${pps[i].lugar}</h5>`
            pps[i].td_is_pdts == 'Y' ?
                td_is_pdts.innerHTML = `<h5 class="py-2">Si</h5>`:
                td_is_pdts.innerHTML = `<h5 class="py-2">No</h5>`
            pps[i].td_is_pps == 'Y' ?
                td_is_pps.innerHTML = `<h5 class="py-2">Si</h5>`:
                td_is_pps.innerHTML = `<h5 class="py-2">No</h5>`
            pps[i].td_is_psc == 'Y' ?
                td_is_psc.innerHTML = `<h5 class="py-2">Si</h5>`:
                td_is_psc.innerHTML = `<h5 class="py-2">No</h5>`
        }
        td_entidad.innerHTML = `<h5 class="py-2">${pps[i].entidad}</h5>`
        td_objetivo.innerHTML = `<h5 class="py-2">${pps[i].objetivo}</h5>`
        td_fechaInicio.innerHTML = `<h5 class="py-2">${pps[i].fecha_inicio}</h5>`
        td_fechaFin.innerHTML = `<h5 class="py-2">${pps[i].fecha_fin}</h5>`
        td_presupuesto.innerHTML = `<h5 class="py-2">$${pps[i].presupuesto}</h5>`
        pps[i].is_contratacion == 'Y'?
            td_is_contratacion.innerHTML = `<h5 class="py-2">Si</h5>`:
            td_is_contratacion.innerHTML = `<h5 class="py-2">No</h5>`
    }
}

//process();