// Script
window.onload = responsiveSection;
window.addEventListener("resize", responsiveSection);

function responsiveSection(){
    let vw = Math.max(document.documentElement.clientWidth || 0, window.innerWidth || 0);
    let secCarrera = document.getElementById("section-carrera");
    let imgCarrera = document.getElementById("img-carrera");
    console.log(vw);

    if(vw < 1400){
        imgCarrera.style.visibility = "hidden";
        imgCarrera.classList.remove("col-4");
        secCarrera.classList.remove("col-8");
        secCarrera.classList.add("col-12");
    }
    else{
        secCarrera.classList.remove("col-12");
        secCarrera.classList.add("col-8");
        imgCarrera.classList.add("col-4");
        imgCarrera.style.visibility = "visible";
    }
}
