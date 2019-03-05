var slideIndex = 1;

function openModal() {
    document.getElementById("id-modal").style.display = "block";
}

function closeModal() {
    document.getElementById("id-modal").style.display = "none";
}

function scrollSlide(changeBy) {
    showSlide(slideIndex += changeBy);
}

function showSlide(newSlideIndex) {
    var i;
    var slides =  document.getElementsByClassName("mySlides");

    slideIndex = newSlideIndex;
    if (newSlideIndex > slides.length) {
        slideIndex = 1
    }
    if (newSlideIndex < 1) {
        slideIndex = slides.length;
    }

    for(i = 0; i < slides.length; i += 1) {
        slides[i].style.display = "none";
    }
    var image = document.getElementById(slideIndex + "-image");
    image.style.display = "block";
    openModal();
}