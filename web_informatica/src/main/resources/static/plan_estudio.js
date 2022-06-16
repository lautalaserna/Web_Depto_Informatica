const URL = '/api/plan_estudio'

async function fetchPlanJSON() {
    const response = await fetch(URL);
    const plan = await response.json();
    return plan;
}

fetchPlanJSON().then(plan => {
    // {"id_plan_estudio":5,"anio":1,"cuatrimestre":1,"asignatura":"Algebra A","codigo":2,"creditos_grado":"8","correlativas":""}
    const tBodyAnio1 = document.getElementById("anio1");
    const tBodyAnio2 = document.getElementById("anio2");
    const tBodyAnio3 = document.getElementById("anio3");
    const tBodyAnio4 = document.getElementById("anio4");
    const tBodyAnio5 = document.getElementById("anio5");

    for(let i=0; i<plan.length ; i++){
        if(i+1 <= plan.length && plan[i].cuatrimestre == 1 && plan[i+1].cuatrimestre == 2){
            insertAsignatura(plan[i].anio, plan[i], true);
        } else {
            insertAsignatura(plan[i].anio, plan[i], false);
        }
    }
});

function insertAsignatura(anio, asignatura, flag) {
    const tBody = document.getElementById("anio" + anio);
    let tr = tbody.insertRow();
    let td_asignatura = tr.insertCell(0);
    let td_codigo = tr.insertCell(1);
    let td_creditos = tr.insertCell(2);
    let td_correlativas = tr.insertCell(3);
    
    td_asignatura.innerHTML = asignatura.asignatura;
    td_codigo.innerHTML = asignatura.codigo;
    td_creditos.innerHTML = asignatura.creditos_grado;
    td_correlativas.innerHTML = asignatura.correlativas;

    if(flag){
        let tr = tbody.insertRow();
        let td_espacio = tr.insertCell(0);      
        td_espacio.innerHTML = '<tr><td colspan="4"><br></td></tr>';
    }
}