const body = document.querySelector(".faq-body")
function toggleBody() {
console.log("I am clicked");
if(body.classList.contains("hide")){
    body.classList.remove("hide")
    body.classList.add("show")
}
else if (body.classList.contains("show")){
    body.classList.remove("show")
    body.classList.add("hide")
}
}
