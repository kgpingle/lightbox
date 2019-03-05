
function showError(errorText) {
    document.getElementById("error").innerText = errorText;
    document.getElementById("error").style.display = "block";
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


function addToMySlides(imgSrc, title, index) {
    var uniqueId = index + "-image";
    var imgHTML = "<div id=\"" + uniqueId + "\" class=\"mySlides\"> " +
        "<img src=\"" + imgSrc + "\" class=\"display-image\"></img>" +
        "<div class=\"title\">" + title + "</div> " +
        "</div>" +
        "</div>";
    document.getElementById("id-slides").innerHTML += imgHTML;
}

function addToGallery(item, index) {
    var thumbnail = item.pagemap.cse_thumbnail[0].src;
    var iwidth = item.pagemap.cse_thumbnail[0].width;
    var iheight = item.pagemap.cse_thumbnail[0].height;
    if (iwidth > 400) {
        iwidth = 240;
    }
    var imgThumbnailHTML = "<img src=\"" + thumbnail + "\" alt=\"" + item.title + "\" width=\"" + iwidth + "\" height=\"" + iheight + "\"  onclick=\"currentSlide(" + index + ")\">";
    document.getElementById("id-gallery").innerHTML += imgThumbnailHTML;
}
