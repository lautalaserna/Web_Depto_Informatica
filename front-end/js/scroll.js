let btnInstitucional = document.getElementById("btn-institucional");
let btnCarrera = document.getElementById("btn-carrera");
let btnNovedades = document.getElementById("btn-novedades");
let btnTop = document.getElementById("btn-back-to-top");

// Para arrancar la librería Animate On Scroll
AOS.init();

window.onscroll = function () {
    scrollFunction();
};
  
function scrollFunction() {
    if (document.body.scrollTop > 400 || document.documentElement.scrollTop > 400) {
        btnTop.style.display = "block";
    } else {
        btnTop.style.display = "none";
    }
}

btnTop.addEventListener("click", () => {
    document.body.scrollTop = 400;
    document.documentElement.scrollTop = 400;
});

btnInstitucional.addEventListener("click",()=>{
    document.body.scrollTop = 980;
    document.documentElement.scrollTop = 980;
});

btnCarrera.addEventListener("click",()=>{
    document.body.scrollTop = 1680;
    document.documentElement.scrollTop = 1680;
})

btnNovedades.addEventListener("click",()=>{
    document.body.scrollTop = 2370;
    document.documentElement.scrollTop = 2370;
})

