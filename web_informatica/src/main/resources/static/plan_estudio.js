const URL = '/api/plan_estudio'

async function fetchPlanJSON() {
    const response = await fetch(URL);
    const plan = await response.json();
    return plan;
}

fetchPlanJSON().then(plan => {
    const tbody = document.getElementById("tbody-plan");

    









    for(let i=0; i<plan.length ; i++){
        let tr = tbody.insertRow(i);
        //let td_anio = tr.insertCell(0);
        //let td_cuatrimestre = tr.insertCell(1);
        let td_asignatura = tr.insertCell(0);
        let td_codigo = tr.insertCell(1);
        let td_creditos = tr.insertCell(2);
        let td_correlativas = tr.insertCell(3);
        
        


        if(docentes[i].img_url && docentes[i].img_url != '')
            td_img.innerHTML = `<img class="rounded-circle" src="${docentes[i].img_url}" height="100px" width="100px">`;
        else
            td_img.innerHTML =  `<img class="rounded-circle" src="img/user.png" height="100px" width="100px">`;
        td_nombre.innerHTML = `<h4 class="py-2">${docentes[i].nombre_completo}</h4>`;
        td_titulo.innerHTML = `<h4 class="py-2">${docentes[i].titulo}</h4>`;
        td_email.innerHTML = `<h4 class="py-2">${docentes[i].email}</h4>`;
        docentes[i].asignatura ? td_asignatura.innerHTML = `<h4 class="py-2">${docentes[i].asignatura}</h4>` : td_asignatura.innerHTML = '';
    }
});