document.getElementById("myForm").addEventListener("submit", function(event) {
    event.preventDefault(); // prevent page reload

    let name = document.getElementById("name").value.trim();
    let email = document.getElementById("email").value.trim();
    let message = document.getElementById("message");

    if (name === "" || email === "") {
        message.style.color = "red";
        message.textContent = "Please fill all fields!";
    } else {
        message.style.color = "green";
        message.textContent = "Form submitted successfully!";
    }
});