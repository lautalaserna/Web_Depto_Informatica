const URL = '/api/plan_estudio'

async function fetchPlanJSON() {
    const response = await fetch(URL);
    const plan = await response.json();
    return plan;
}

fetchPlanJSON().then(plan => {
    // {"id_plan_estudio":5,"anio":1,"cuatrimestre":1,"asignatura":"Algebra A","codigo":2,"creditos_grado":"8","correlativas":""}
    
    console.log(plan);
    for(let i=0; i<plan.length ; i++){
        console.log(plan[i]);
        if(i+1 <= plan.length && plan[i].cuatrimestre == 1 && plan[i+1].cuatrimestre == 2){
            insertAsignatura(plan[i].anio, plan[i], true);
        } else {
            insertAsignatura(plan[i].anio, plan[i], false);
        }
    }
});

function insertAsignatura(anio, asignatura, flag) {
    const tbody = document.getElementById("anio" + anio);
    let tr = tbody.insertRow();
    let td_asignatura = tr.insertCell(0);
    let td_codigo = tr.insertCell(1);
    let td_creditos = tr.insertCell(2);
    let td_correlativas = tr.insertCell(3);
    
    td_asignatura.innerHTML = `<h5 class="py-1 ps-2 text-start">${asignatura.asignatura}</h5>`
    td_codigo.innerHTML = `<h5 class="py-1">${asignatura.codigo}</h5>`//;
    td_creditos.innerHTML = `<h5 class="py-1">${asignatura.creditos_grado}</h5>`
    td_correlativas.innerHTML = `<h5 class="py-1">${asignatura.correlativas}</h5>`

    if(flag){
        let tr = tbody.insertRow();
        let td_espacio = tr.insertCell(0);
        td_espacio.setAttribute('colspan',4);    
        td_espacio.innerHTML = '<br>';
    }
}