// First Name
let firstNameInput = document.getElementById("fname");
let firstNameError = document.getElementById("error1");

firstNameInput.addEventListener("blur", function () {
    let fname = firstNameInput.value.trim();
    if (fname === "") {
        firstNameError.textContent = "First Name Field is Required";
        firstNameInput.classList.add("error");
    } else if (!firstNameInput.checkValidity()) {
        firstNameError.textContent = "Enter valid First Name";
        firstNameInput.classList.add("error");
    } else {
        firstNameError.textContent = "";
        firstNameInput.classList.remove("error");
    }
});

// Last Name
let lastNameInput = document.getElementById("lname");
let lastNameError = document.getElementById("error2");

lastNameInput.addEventListener("blur", function () {
    let lname = lastNameInput.value.trim();
    if (lname === "") {
        lastNameError.textContent = "Last Name Field is Required";
        lastNameInput.classList.add("error");
    } else if (!lastNameInput.checkValidity()) {
        lastNameError.textContent = "Enter valid Last Name";
        lastNameInput.classList.add("error");
    } else {
        lastNameError.textContent = "";
        lastNameInput.classList.remove("error");
    }
});

// Email
let emailInput = document.getElementById("email");
let emailError = document.getElementById("error3");

emailInput.addEventListener("blur", function () {
    let email = emailInput.value.trim();
    if (email === "") {
        emailError.textContent = "Email is Required";
        emailInput.classList.add("error");
    } else if (!emailInput.checkValidity()) {
        emailError.textContent = "Enter valid Email ID";
        emailInput.classList.add("error");
    } else {
        emailError.textContent = "";
        emailInput.classList.remove("error");
    }
});

// Phone
let phoneInput = document.getElementById("phone");
let phoneError = document.getElementById("error4");

phoneInput.addEventListener("blur", function () {
    let phone = phoneInput.value.trim();
    if (phone === "") {
        phoneError.textContent = "Phone Number is Required";
        phoneInput.classList.add("error");
    } else if (!phoneInput.checkValidity()) {
        phoneError.textContent = "Enter valid Phone Number";
        phoneInput.classList.add("error");
    } else {
        phoneError.textContent = "";
        phoneInput.classList.remove("error");
    }
});

// DOB
let dateInput = document.getElementById("dob");
let dateError = document.getElementById("error5");

dateInput.addEventListener("blur", function () {
    let date = dateInput.value.trim();
    if (date === "") {
        dateError.textContent = "Date of Birth is Required";
        dateInput.classList.add("error");
    } else if (!dateInput.checkValidity()) {
        dateError.textContent = "Enter valid Date of Birth";
        dateInput.classList.add("error");
    } else {
        dateError.textContent = "";
        dateInput.classList.remove("error");
    }
});

// Address
let addressInput = document.getElementById("address");
let addressError = document.getElementById("error6");

addressInput.addEventListener("blur", function () {
    let address = addressInput.value.trim();
    if (address === "") {
        addressError.textContent = "Address is Required";
        addressInput.classList.add("error");
    } else if (!addressInput.checkValidity()) {
        addressError.textContent = "Enter valid Address";
        addressInput.classList.add("error");
    } else {
        addressError.textContent = "";
        addressInput.classList.remove("error");
    }
});

// Designation
let roleInput = document.getElementById("role");
let roleError = document.getElementById("error7");

roleInput.addEventListener("blur", function () {
    let role = roleInput.value.trim();
    if (role === "") {
        roleError.textContent = "Designation is Required";
        roleInput.classList.add("error");
    } else if (!roleInput.checkValidity()) {
        roleError.textContent = "Enter valid Designation";
        roleInput.classList.add("error");
    } else {
        roleError.textContent = "";
        roleInput.classList.remove("error");
    }
});

// Joining Date
let startDateInput = document.getElementById("startdate");
let startDateError = document.getElementById("error8");

startDateInput.addEventListener("blur", function () {
    let startdate = startDateInput.value.trim();
    if (startdate === "") {
        startDateError.textContent = "Joining Date is Required";
        startDateInput.classList.add("error");
    } else if (!startDateInput.checkValidity()) {
        startDateError.textContent = "Enter valid Joining Date";
        startDateInput.classList.add("error");
    } else {
        startDateError.textContent = "";
        startDateInput.classList.remove("error");
    }
});

// Work Location
let locationInput = document.getElementById("location");
let locationError = document.getElementById("error9");

locationInput.addEventListener("blur", function () {
    let location = locationInput.value.trim();
    if (location === "") {
        locationError.textContent = "Work Location is Required";
        locationInput.classList.add("error");
    } else if (!locationInput.checkValidity()) {
        locationError.textContent = "Enter valid Work Location";
        locationInput.classList.add("error");
    } else {
        locationError.textContent = "";
        locationInput.classList.remove("error");
    }
});

// Qualification
let qualificationInput = document.getElementById("qualification");
let qualificationError = document.getElementById("error10");

qualificationInput.addEventListener("blur", function () {
    let qualification = qualificationInput.value.trim();
    if (qualification === "") {
        qualificationError.textContent = "Qualification is Required";
        qualificationInput.classList.add("error");
    } else if (!qualificationInput.checkValidity()) {
        qualificationError.textContent = "Enter valid Qualification";
        qualificationInput.classList.add("error");
    } else {
        qualificationError.textContent = "";
        qualificationInput.classList.remove("error");
    }
});

// College
let collegeInput = document.getElementById("college");
let collegeError = document.getElementById("error11");

collegeInput.addEventListener("blur", function () {
    let college = collegeInput.value.trim();
    if (college === "") {
        collegeError.textContent = "College/University is Required";
        collegeInput.classList.add("error");
    } else if (!collegeInput.checkValidity()) {
        collegeError.textContent = "Enter valid College/University";
        collegeInput.classList.add("error");
    } else {
        collegeError.textContent = "";
        collegeInput.classList.remove("error");
    }
});

// Year of Passing
let yopInput = document.getElementById("yop");
let yopError = document.getElementById("error12");

yopInput.addEventListener("blur", function () {
    let yop = yopInput.value.trim();
    if (yop === "") {
        yopError.textContent = "Year of Passing is Required";
        yopInput.classList.add("error");
    } else if (!yopInput.checkValidity()) {
        yopError.textContent = "Enter valid Year of Passing";
        yopInput.classList.add("error");
    } else {
        yopError.textContent = "";
        yopInput.classList.remove("error");
    }
});

// Aadhar
let aadharInput = document.getElementById("aadhar");
let aadharError = document.getElementById("error13");

aadharInput.addEventListener("blur", function () {
    let aadhar = aadharInput.value.trim();
    if (aadhar === "") {
        aadharError.textContent = "Aadhar Number is Required";
        aadharInput.classList.add("error");
    } else if (!aadharInput.checkValidity()) {
        aadharError.textContent = "Enter valid Aadhar Number";
        aadharInput.classList.add("error");
    } else {
        aadharError.textContent = "";
        aadharInput.classList.remove("error");
    }
});

// PAN
let panInput = document.getElementById("pan");
let panError = document.getElementById("error14");

panInput.addEventListener("blur", function () {
    let pan = panInput.value.trim();
    if (pan === "") {
        panError.textContent = "PAN Number is Required";
        panInput.classList.add("error");
    } else if (!panInput.checkValidity()) {
        panError.textContent = "Enter valid PAN Number";
        panInput.classList.add("error");
    } else {
        panError.textContent = "";
        panInput.classList.remove("error");
    }
});

// Bank Account
let bankInput = document.getElementById("bank");
let bankError = document.getElementById("error15");

bankInput.addEventListener("blur", function () {
    let bank = bankInput.value.trim();
    if (bank === "") {
        bankError.textContent = "Bank Account Number is Required";
        bankInput.classList.add("error");
    } else if (!bankInput.checkValidity()) {
        bankError.textContent = "Enter valid Bank Account Number";
        bankInput.classList.add("error");
    } else {
        bankError.textContent = "";
        bankInput.classList.remove("error");
    }
});

// IFSC
let ifscInput = document.getElementById("ifsc");
let ifscError = document.getElementById("error16");

ifscInput.addEventListener("blur", function () {
    let ifsc = ifscInput.value.trim();
    if (ifsc === "") {
        ifscError.textContent = "IFSC Code is Required";
        ifscInput.classList.add("error");
    } else if (!ifscInput.checkValidity()) {
        ifscError.textContent = "Enter valid IFSC Code";
        ifscInput.classList.add("error");
    } else {
        ifscError.textContent = "";
        ifscInput.classList.remove("error");
    }
});

// Emergency Contact Person
let emgNameInput = document.getElementById("emgname");
let emgNameError = document.getElementById("error17");

emgNameInput.addEventListener("blur", function () {
    let emgname = emgNameInput.value.trim();
    if (emgname === "") {
        emgNameError.textContent = "Contact Person is Required";
        emgNameInput.classList.add("error");
    } else if (!emgNameInput.checkValidity()) {
        emgNameError.textContent = "Enter valid Contact Person";
        emgNameInput.classList.add("error");
    } else {
        emgNameError.textContent = "";
        emgNameInput.classList.remove("error");
    }
});

// Relation
let relationInput = document.getElementById("relation");
let relationError = document.getElementById("error18");

relationInput.addEventListener("blur", function () {
    let relation = relationInput.value.trim();
    if (relation === "") {
        relationError.textContent = "Relation is Required";
        relationInput.classList.add("error");
    } else if (!relationInput.checkValidity()) {
        relationError.textContent = "Enter valid Relation";
        relationInput.classList.add("error");
    } else {
        relationError.textContent = "";
        relationInput.classList.remove("error");
    }
});

// Emergency Phone
let emgPhoneInput = document.getElementById("emgphone");
let emgPhoneError = document.getElementById("error19");

emgPhoneInput.addEventListener("blur", function () {
    let emgphone = emgPhoneInput.value.trim();
    if (emgphone === "") {
        emgPhoneError.textContent = "Emergency Phone Number is Required";
        emgPhoneInput.classList.add("error");
    } else if (!emgPhoneInput.checkValidity()) {
        emgPhoneError.textContent = "Enter valid Emergency Phone Number";
        emgPhoneInput.classList.add("error");
    } else {
        emgPhoneError.textContent = "";
        emgPhoneInput.classList.remove("error");
    }
});

// Form Submit Validation
document.querySelector(".onboarding-form").addEventListener("submit", function (e) {
    let errors = document.querySelectorAll(".error-msg");
    let hasError = false;

    errors.forEach(err => {
        if (err.textContent !== "") {
            hasError = true;
        }
    });

    if (hasError) {
        e.preventDefault();
        alert("Please fix all errors before submitting the form.");
    }
});
