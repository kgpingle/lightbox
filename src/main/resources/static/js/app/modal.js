var slideIndex = 1;

function openModal() {
    document.getElementById("id-modal").style.display = "block";
}

// Close the Modal
function closeModal() {
    document.getElementById("id-modal").style.display = "none";
}

function plusSlides(n) {
    currentSlide(slideIndex += n);
}

function currentSlide(n) {
    var i;
    var slides =  document.getElementsByClassName("mySlides");

    slideIndex = n;
    if (n > slides.length) {
        slideIndex = 1
    }
    if (n < 1) {
        slideIndex = slides.length;
    }

    for(i = 0; i < slides.length; i += 1) {
        slides[i].style.display = "none";
    }
    var image = document.getElementById(slideIndex + "-image");
    image.style.display = "block";
    openModal();
}