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
    // Get the text field
    const copyText = document.getElementById("id_short_url_field");

    // Select the text field
    copyText.select();
    copyText.setSelectionRange(0, 99999); // For mobile devices

    // Copy the text inside the text field
    navigator.clipboard.writeText(copyText.value).then(r => console.log("error"));

    // Alert the copied text
    alert("Copied the text: " + copyText.value);
}