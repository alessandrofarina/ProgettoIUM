
function preview(field) {
    const file = field.files[0];
    const label = document.getElementById("preview");

    if(file) {
        label.style.backgroundImage = "url('" + URL.createObjectURL(file) + "')";
        label.style.backgroundColor = "transparent";
        label.innerHTML = "";
    }
}

function edit(field) {

    let name = field.childNodes[3].innerHTML;
    let quantity = field.childNodes[5].innerHTML.substring(1);
    let urgency = field.childNodes[7].innerHTML;

    document.getElementById("input-name").value = name;
    document.getElementById("input-quantity").value = quantity;
    document.getElementById("input-urgency").value = urgency.split(" ")[0];

    let form = document.getElementById("edit-form");
    form.style.display = "block";
}