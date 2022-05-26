const autoridadesURL = '/api/autoridades';
const consejoAlumnosURL = '/api/consejo_alumnos';
const consejoDepartamentalURL = '/api/consejo_departamental';

async function fetchJSON(URL) {
    const response = await fetch(URL);
    const res = await response.json();
    return res;
}

async function main(){
    const autoridades = await fetchJSON(autoridadesURL);
    const departamental = await fetchJSON(consejoDepartamentalURL);
    const alumnos = await fetchJSON(consejoAlumnosURL);

    //preparo autoridades
    const director = document.getElementById("director");
    const vice = document.getElementById("vicedirector");
    director.innerHTML = autoridades[0].director;
    vice.innerHTML = autoridades[0].vicedirector;

    //preparo departamental
    let arrayTitulares = [];
    let arraySuplentes = [];
    for(let i=0; i<departamental.length; i++){
        let name = departamental[i].nombre;
        departamental[i].tipo == 'T'? 
            arrayTitulares.push(name): 
            arraySuplentes.push(name);
    }

    const tbody_departamental = document.getElementById("consejo_departamental");
    let max_length = arrayTitulares.length > arraySuplentes.length? arrayTitulares.length: arraySuplentes.length;

    for(let i=0; i<max_length; i++){
        let tr = tbody_departamental.insertRow(i);
        let td_titular = tr.insertCell(0);
        let td_suplente = tr.insertCell(1);

        let titular = arrayTitulares[i];
        let suplente = arraySuplentes[i];
        titular == null? td_titular.innerHTML = '': td_titular.innerHTML = `<h4 class="py-2">${titular}</h4>`;
        suplente == null? td_suplente.innerHTML = '': td_suplente.innerHTML = `<h4 class="py-2">${suplente}</h4>`;
    }

    console.log(arraySuplentes)
    //preparo alumnos
    arrayTitulares = [];
    arraySuplentes = [];
    console.log(alumnos);
    for(let i=0; i<alumnos.length; i++){
        let name = alumnos[i].nombre;
        alumnos[i].tipo == 'T'? 
            arrayTitulares.push(name): 
            arraySuplentes.push(name);
    }

    const tbody_alumnos = document.getElementById("consejo_alumnos");
    max_length = arrayTitulares.length > arraySuplentes.length? arrayTitulares.length: arraySuplentes.length;

    for(let i=0; i<max_length; i++){
        let tr = tbody_alumnos.insertRow(i);
        let td_titular = tr.insertCell(0);
        let td_suplente = tr.insertCell(1);

        let titular = arrayTitulares[i];
        let suplente = arraySuplentes[i];
        titular == null? td_titular.innerHTML = '': td_titular.innerHTML = `<h4 class="py-2">${titular}</h4>`;
        suplente == null? td_suplente.innerHTML = '': td_suplente.innerHTML = `<h4 class="py-2">${suplente}</h4>`;
    }

}

main();

/*
fetchDocentesJSON().then(docentes => {
    const tbody = document.getElementById("tbody-docentes");
    for(let i=0; i<docentes.length ; i++){
        let tr = tbody.insertRow(i);
        let td_img = tr.insertCell(0);
        let td_nombre = tr.insertCell(1);
        let td_titulo = tr.insertCell(2);
        let td_email = tr.insertCell(3);
        let td_asignatura = tr.insertCell(4);
        
        td_img.innerHTML = `<img class="rounded-circle" src="${docentes[i].img_url}" height="100px" width="100px">`;
        td_nombre.innerHTML = `<h4 class="py-2">${docentes[i].nombre_completo}</h4>`;
        td_titulo.innerHTML = `<h4 class="py-2">${docentes[i].titulo}</h4>`;
        td_email.innerHTML = `<h4 class="py-2">${docentes[i].email}</h4>`;
        docentes[i].asignatura ? td_asignatura.innerHTML = `<h4 class="py-2">${docentes[i].asignatura}</h4>` : td_asignatura.innerHTML = '';
    }
});
*/