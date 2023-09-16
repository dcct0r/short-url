function viewField() {
    const onAcceptButton = document.getElementById("id_wrapper_short_url_field");
    const urlField = document.getElementById("id_url_field");

    if(!urlField.checkValidity()) {
        alert("Wrong link");
        urlField.value = "";
    } else if(urlField.value === "") {
        alert("Filed can't be empty");
        urlField.value = "";
    }

    if (onAcceptButton.style.visibility !== "visible" && urlField.checkValidity() && urlField.value !== "") {
        onAcceptButton.style.visibility="visible";
        urlField.value = "";
    } else {
        onAcceptButton.style.visibility="hidden";
    }
}

function copyToClipboard() {
    const copyText = document.getElementById("id_short_url_field");

    copyText.select();
    copyText.setSelectionRange(0, 99999);

    navigator.clipboard.writeText(copyText.value).then(r => console.log("error"));
}