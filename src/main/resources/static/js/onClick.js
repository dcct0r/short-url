function viewField() {
    const shortUrlFieldBlock = document.getElementById("id_wrapper_short_url_field");
    const urlField = document.getElementById("id_url_field");
    const buttonReduce = document.getElementById("id_get_short_url");

    if(!urlField.checkValidity()) {
        alert("Wrong link");
        urlField.value = "";
    } else if(urlField.value === "") {
        alert("Filed can't be empty");
        urlField.value = "";
    }

    if(shortUrlFieldBlock.style.visibility !== "visible" && urlField.checkValidity() && urlField.value !== "") {
        shortUrlFieldBlock.style.visibility = "visible";
        buttonReduce.disabled = true;
        urlField.setAttribute('readonly', 'readonly');
    } else {
        shortUrlFieldBlock.style.visibility = "hidden";
        buttonReduce.disabled = false;
    }
}

function copyToClipboard() {
    const copyText = document.getElementById("id_short_url_field");

    copyText.select();
    copyText.setSelectionRange(0, 99999);

    navigator.clipboard.writeText(copyText.value).then(r => console.log("error"));
}