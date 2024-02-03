const email = document.getElementById('email').value.trim();
const firstName = document.getElementById('firstName').value.trim();
const lastName = document.getElementById('lastName').value.trim();
const birthdate = document.getElementById('birthdate').value.trim();
const studentNumber = document.getElementById('studentNumber').value.trim();
const gender = document.querySelector('input[name="gender"]:checked').value.trim(); // Assuming gender is a radio button
const department = document.getElementById('department').value.trim();
const speciality = document.getElementById('speciality').value.trim();
const studyYear = document.getElementById('studyYear').value.trim();
const accommodation = document.getElementById('accommodation').value.trim();
const univResidence = document.getElementById('univResidence').value.trim(); // Assuming there is an input field with id 'univResidence'
const phoneNumber = document.getElementById('phoneNumber').value.trim();
const facebookURL = document.getElementById('facebookURL').value.trim();
const hobbies = document.getElementById('hobbies').value.trim();
const joining_reason = document.getElementById('joining_reason').value.trim();
const form = document.getElementById('form')


form.addEventListener('submit', e => {
    if(!validateInputs()){
        e.preventDefault()

    }
    }
 )
const setError = (element, message) => {
    const inputControl = element.parentElement;
    const errorDisplay = inputControl.querySelector('.error');

    errorDisplay.innerText = message;
    inputControl.classList.add('error');
    inputControl.classList.remove('success')
}

const validateInputs = () => {
    let studentNumber1 = false;
    if(studentNumber.length == 5){
        studentNumber1 = true
    }
    return email !== "" && firstName !== "" && lastName !== "" && birthdate !== "" && studentNumber1 && gender !== null &&
        department !== "" && speciality !== "" && studyYear !== "" && accommodation !== "";
};

