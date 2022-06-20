const URL = '/api/optativas'

async function fetchOptativasJSON() {
    const response = await fetch(URL);
    const optativas = await response.json();
    return optativas;
}

fetchOptativasJSON().then(optativas => {
    const tbody = document.getElementById("tbody-optativas");
    for(let i=0; i<optativas.length ; i++){
        let tr = tbody.insertRow(i);
        let td_asignatura = tr.insertCell(0);
        let td_codigo = tr.insertCell(1);
        let td_cuatrimestre = tr.insertCell(2);
        let td_cg = tr.insertCell(3)
        let td_correlativas = tr.insertCell(4);
        
        td_asignatura.innerHTML = `<h5 class="py-2 ps-4 text-start">${optativas[i].asignatura}</h5>`
        td_codigo.innerHTML = `<h5 class="py-2">${optativas[i].codigo}</h5>` 
        optativas[i].cuatrimestre ==  1? td_cuatrimestre.innerHTML = `<h5 class="py-2">Primero</h5>` : td_cuatrimestre.innerHTML = `<h5 class="py-2">Segundo</h5>`;
        td_cg.innerHTML = `<h5 class="py-2">${optativas[i].creditos_grado}</h5>` 
        td_correlativas.innerHTML = `<h5 class="py-2 text-start">${optativas[i].correlativas}</h5>` 
    }
});