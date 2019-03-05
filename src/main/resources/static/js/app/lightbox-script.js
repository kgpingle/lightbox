function keypress(event) {
    if (event.keyCode === 13) {
        search();
    }
}

function search() {
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
    return new Promise(function (resolve, reject) {
        var xhr = new XMLHttpRequest();
        xhr.onreadystatechange = function (e) {
            if (xhr.readyState === 4) {
                stopLoading();
                if (xhr.status === 200) {
                    var response = JSON.parse(xhr.response);
                    var index = 1;
                    if (response.items.length != 0 ) {
                        var i;
                        for(i = 0; i < response.items.length; i += 1) {
                            var item = response.items[i];
                            addToGallery(item, index);
                            addToMySlides(item.pagemap.cse_image[0].src, item.title, index);
                            index += 1;
                        }
                    }
                    else{
                        showError("No results");
                    }
                } else {
                    showError("Oops! Something went wrong. Try again.");
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
