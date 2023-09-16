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