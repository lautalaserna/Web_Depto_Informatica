const URL = '/api/docentes'


async function fetchDocentesJSON() {
    const response = await fetch(URL);
    const docentes = await response.json();
    return docentes;
}

/*
fetchDocentesJSON().then(docentes => {
    const tbody = document.getElementById("tbody-docentes");
    var i = 0;
    for(let i=0; i<docentes.length ; i++){
        let tr = tbody.insertRow(i);
        let td_img = tr.insertCell(0);
        let td_nombre = tr.insertCell(1);
        let td_titulo = tr.insertCell(2);
        let td_email = tr.insertCell(3);

        td_img.innerHTML = "[imagen]";
        td_nombre.innerHTML = docentes[i].nombre_completo;
        td_titulo.innerHTML = docentes[i].titulo;
        td_email.innerHTML = docentes[i].email;
    }

});*/

fetchDocentesJSON().then(docentes => {
    const tbody = document.getElementById("tbody-docentes");
    var i = 0;
    for(let i=0; i<docentes.length ; i++){
        let tr = tbody.insertRow(i);
        let td_img = tr.insertCell(0);
        let td_nombre = tr.insertCell(1);
        let td_email = tr.insertCell(2);
        let td_titulo = tr.insertCell(3);
        let td_asignatura = tr.insertCell(4);

        td_img.innerHTML = '<img class="rounded-circle ms-2" src="' + docentes[i].img_url + '" height="100px" width="100px">';
        //td_img.innerHTML = '<img width=100 height=100 style="border-radius = 50%" src=' + docente[i].img_url + '></>';
        td_nombre.innerHTML = docentes[i].nombre_completo;
        td_titulo.innerHTML = docentes[i].titulo;
        td_email.innerHTML = docentes[i].email;
        td_asignatura.innerHTML = docentes[i].asignatura;
    }

});