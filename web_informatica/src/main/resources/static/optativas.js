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
        let td_correlativas = tr.insertCell(2);
        let td_cuatrimestre = tr.insertCell(3);
        
        td_asignatura.innerHTML = optativas[i].asignatura;
        td_codigo.innerHTML = optativas[i].codigo;
        td_correlativas.innerHTML = optativas[i].correlativas;
        optativas[i].cuatrimestre == 1? td_cuatrimestre.innerHTML = 'Primero': td_cuatrimestre.innerHTML = 'Segundo';
    }
});