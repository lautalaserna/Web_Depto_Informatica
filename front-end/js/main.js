// Script
const VW_LIMIT = 1400;
window.onload = responsiveSection;
window.addEventListener("resize", responsiveSection);

function responsiveSection(){
    let vw = Math.max(document.documentElement.clientWidth || 0, window.innerWidth || 0);
    let section = document.getElementsByClassName("section");
    let section_img = document.getElementsByClassName("section-img");

    if(vw < VW_LIMIT){
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
