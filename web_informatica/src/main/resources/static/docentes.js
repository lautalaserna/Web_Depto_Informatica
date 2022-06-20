const URL = '/api/docentes'

async function fetchDocentesJSON() {
    const response = await fetch(URL);
    const docentes = await response.json();
    return docentes;
}

fetchDocentesJSON().then(docentes => {
    const tbody = document.getElementById("tbody-docentes");
    for(let i=0; i<docentes.length ; i++){
        let tr = tbody.insertRow(i);
        let td_img = tr.insertCell(0);
        let td_nombre = tr.insertCell(1);
        let td_titulo = tr.insertCell(2);
        let td_email = tr.insertCell(3);
        let td_asignatura = tr.insertCell(4);
        
        if(docentes[i].img_url && docentes[i].img_url != '')
            td_img.innerHTML = `<img class="rounded-circle" src="${docentes[i].img_url}" height="85px" width="85px">`;
        else
            td_img.innerHTML =  `<img class="rounded-circle" src="img/user.png" height="85px" width="85px">`;
        td_nombre.innerHTML = `<h5 class="py-2">${docentes[i].nombre_completo}</h5>`;
        td_titulo.innerHTML = `<h5 class="py-2">${docentes[i].titulo}</h5>`;
        td_email.innerHTML = `<h5 class="py-2">${docentes[i].email}</h5>`;
        docentes[i].asignatura ? td_asignatura.innerHTML = `<h5 class="py-2">${docentes[i].asignatura}</h5>` : td_asignatura.innerHTML = '';
    }
});