// Responsive front-end
const VW_LIMIT = 1400;

let btnInstitucional = document.getElementById("btn-institucional");
let btnCarrera = document.getElementById("btn-carrera");
let btnNovedades = document.getElementById("btn-novedades");
let btnTop = document.getElementById("btn-back-to-top");

window.onload = ()=>{
    AOS.init();
    responsiveSection();
}

window.onresize = responsiveSection;

window.onscroll = function () {
    scrollFunction();
};
  
function scrollFunction() {
    let vw = Math.max(document.documentElement.clientWidth || 0, window.innerWidth || 0);
    if ((document.body.scrollTop > 400 || document.documentElement.scrollTop > 400) && vw > VW_LIMIT) {
        btnTop.style.display = "block";
    } else {
        btnTop.style.display = "none";
    }
}

btnTop.addEventListener("click", () => {
    document.body.scrollTop = 380;
    document.documentElement.scrollTop = 380;
});

btnInstitucional.addEventListener("click",()=>{
    document.body.scrollTop = 2800;
    document.documentElement.scrollTop = 2800;
});

btnCarrera.addEventListener("click",()=>{
    document.body.scrollTop = 800;
    document.documentElement.scrollTop = 800;
})

btnNovedades.addEventListener("click",()=>{
    document.body.scrollTop = 2000;
    document.documentElement.scrollTop = 2000;
})

function responsiveSection(){
    let vw = Math.max(document.documentElement.clientWidth || 0, window.innerWidth || 0);
    let section = document.getElementsByClassName("section");
    let section_img = document.getElementsByClassName("section-img");
    let btn_back_to_top = document.getElementById("btn-back-to-top");

    if(vw < VW_LIMIT){
        btn_back_to_top.style.display = "none";
        for (var i = 0; i < section.length; i++) {
            section[i].classList.remove("col-8");
            section[i].classList.add("col-12");
        }
        for (var i = 0; i < section_img.length; i++) {
            section_img[i].style.display = "none";
            section_img[i].classList.remove("col-4");
        }
    }
    else{
        if (document.body.scrollTop > 400 || document.documentElement.scrollTop > 400){
            btn_back_to_top.style.display = "block";
        }
        for (var i = 0; i < section.length; i++) {
            section[i].classList.remove("col-12");
            section[i].classList.add("col-8");
        }

        for (var i = 0; i < section_img.length; i++) {
            section_img[i].style.display = "block";
            section_img[i].classList.add("col-4");
        }
    }
}