
function openModal() {
    document.getElementById('id-modal').style.display = "block";
}

// Close the Modal
function closeModal() {
    document.getElementById('id-modal').style.display = "none";
}

var slideIndex = 1;

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

    for (i = 0; i < slides.length; i++) {
        slides[i].style.display = "none";
    }
    var image = document.getElementById(slideIndex + "-image");
    image.style.display = "block";
    openModal();
}


function keypress(event) {
    if (event.keyCode === 13) {
        search();
    }
}

function search() {
    var query = document.getElementById("search").value;
    if ( query === "" || query === undefined) {
        document.getElementById("error").innerText = "Search is Empty";
        document.getElementById("error").style.display = "block";
    } else {
        document.getElementById("error").style.display = "none";
        document.getElementById("loading").style.display = "block";
        var url = "/search?query=" + query;
        document.getElementById("id-gallery").innerHTML = "";
        document.getElementById("id-slides").innerHTML = "";
        loadData(url);
    }
}

function loadData(url) {
    return new Promise(function (hndlr, reject) {
        var xhr = new XMLHttpRequest();
        xhr.onreadystatechange = function (e) {
            if (xhr.readyState === 4) {
                document.getElementById("loading").style.display  = "none";
                if (xhr.status === 200) {
                    var response = JSON.parse(xhr.response);
                    var index = 1;
                    if (response.items === undefined || response.items.length === 0 ) {
                        document.getElementById("error").innerText = " No results";
                        document.getElementById("error").style.display = "block";
                    }
                    for (var i = 0; i < response.items.length; i++) {
                        var item = response.items[i];
                        // in production code, item.htmlTitle should have the HTML entities escaped.
                        if (item.pagemap.cse_image != undefined) {
                            var thumbnail = item.pagemap.cse_thumbnail[0].src;
                            var iwidth = item.pagemap.cse_thumbnail[0].width;
                            var iheight = item.pagemap.cse_thumbnail[0].height;

                            if (iwidth > 400) {
                                iwidth = 240;
                            }

                            var imgThumbnailHTML = "<img src=\"" + thumbnail + "\" alt=\"" + item.title + "\" width=\"" + iwidth + "\" height=\"" + iheight + "\"  onclick=\"currentSlide("+index+")\">";
                            document.getElementById("id-gallery").innerHTML += imgThumbnailHTML;

                            var imgSrc = item.pagemap.cse_image[0].src;
                            var uniqueId = index + "-image";
                            var imgHTML = "<div id=\""+ uniqueId + "\" class=\"mySlides\"> " +
                                "<img src=\"" + imgSrc + "\" class=\"display-image\"></img>" +
                                "<div class=\"title\">" + item.title + "</div> " +
                                "</div>" +
                                "</div>";
                            document.getElementById("id-slides").innerHTML += imgHTML;
                            index += 1;
                        }
                    }
                } else {
                    document.getElementById("error").innerText = "Oops! Something went wrong. Try again.";
                    document.getElementById("error").style.display = "block";
                }
            }
        };
        xhr.ontimeout = function () {
            document.getElementById("error").innerText =  "Oops! It took longer than expected. Try again.";
            document.getElementById("error").style.display = "block";
        };
        xhr.open('get', url, true);
        xhr.send();
    });
}
