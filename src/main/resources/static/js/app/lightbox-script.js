function keypress(event) {
    if (event.keyCode === 13) {
        search();
    }
}

function search() {
    resetShowError();
    var query = document.getElementById("search").value;
    resetGallery();
    if ( query === "" || query === undefined) {
        showError("Search is Empty");
    } else {
        var url = "/search?query=" + query;
        loadData(url);
    }
}

function loadData(url) {
    return new Promise(function () {
        var xhr = new XMLHttpRequest();
        xhr.onreadystatechange = function () {
            var index = 1;
            var galleryDiv = "";
            var sildesDiv = "";
            if (xhr.readyState === 4) {
                stopLoading();
                if (xhr.status === 200) {
                    var response = JSON.parse(xhr.response);
                    if (response.items.length != 0 ) {
                        var i;
                        for(i = 0; i < response.items.length; i += 1) {
                            var item = response.items[i];
                            galleryDiv += appendToGallery(item, index);
                            sildesDiv += appendToMySlides(item.pagemap.cse_image[0].src, item.title, index);
                            index += 1;
                        }
                        addToGallery(galleryDiv);
                        addToMySlides(sildesDiv);
                    }
                    else{
                        showError("No results");
                    }
                } else {
                    showError("Oops! Something went wrong. Try again after sometime.");
                }
            }
        };
        xhr.ontimeout = function () {
            showError("Oops! It took longer than expected. Try again.");
        };
        xhr.open("get", url, true);
        xhr.send();
    });

}
