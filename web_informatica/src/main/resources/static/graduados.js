const URL = '/api/graduados'

async function fetchGraduadosJSON() {
    const response = await fetch(URL);
    const graduados = await response.json();
    return graduados;
}

fetchGraduadosJSON().then(graduados => {
    const tbody = document.getElementById("tbody-graduados");
    for(let i=0; i<graduados.length ; i++){
        let tr = tbody.insertRow(i);
        let td_nombre_completo = tr.insertCell(0);
        td_nombre_completo.innerHTML = `<h4 class="py-2">${graduados[i].nombre_completo}</h4>`;
    }
});