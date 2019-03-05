
function showError(errorText) {
    document.getElementById("error").innerText = errorText;
    document.getElementById("error").style.display = "block";
}

function resetShowError() {
    document.getElementById("error").innerText = "";
    document.getElementById("error").style.display = "none";
}

function resetGallery() {
    document.getElementById("id-gallery").innerHTML = "";
    document.getElementById("id-slides").innerHTML = "";
    startLoading();
}

function startLoading() {
    document.getElementById("loading").style.display = "block";
}

function stopLoading() {
    document.getElementById("loading").style.display = "none";
}


function appendToMySlides(imgSrc, title, index) {
    var uniqueId = index + "-image";
    var mySlideDiv = "<div id=\"" + uniqueId + "\" class=\"mySlides\"> " +
        "<img src=\"" + imgSrc + "\" class=\"display-image\"></img>" +
        "<div class=\"title\">" + title + "</div> " +
        "</div>" +
        "</div>";
    return  mySlideDiv;
}

function addToMySlides(imgInnerHTML) {
    document.getElementById("id-slides").innerHTML += imgInnerHTML;
}

function appendToGallery(item, index) {
    var thumbnail = item.pagemap.cse_thumbnail[0].src;
    var imgThumbnailHTML = "<img src=\"" + thumbnail + "\" onclick=\"showSlide(" + index + ")\">";
    return imgThumbnailHTML;
}

function addToGallery(imgThumbnailHTML) {
    document.getElementById("id-gallery").innerHTML += imgThumbnailHTML;
}