/**
 * 
 */
function validateTitle(inputField) {
	const alphabetsRegex = /^[A-Za-z]+$/;
	const errorTextElement = document.getElementById('errorTitle');

	if (inputField.value === '') {
		errorTextElement.textContent = 'Please enter something.';
	} else if (!alphabetsRegex.test(inputField.value)) {
		errorTextElement.textContent = 'Please enter alphabets only.';
	} else {
		errorTextElement.textContent = '';
	}
}

function validateFirstName(inputField) {
	const alphabetsRegex = /^[A-Za-z]+$/;
	const errorTextElement = document.getElementById('errorFirstname');

	if (inputField.value === '') {
		errorTextElement.textContent = 'Please enter something.';
	} else if (!alphabetsRegex.test(inputField.value)) {
		errorTextElement.textContent = 'Please enter alphabets only.';
	} else {
		errorTextElement.textContent = '';
	}
}

function validateMiddleName(inputField) {
	const alphabetsRegex = /^[A-Za-z]+$/;
	const errorTextElement = document.getElementById('errorMiddleName');

	if (!alphabetsRegex.test(inputField.value)) {
		errorTextElement.textContent = 'Please enter alphabets only.';
	} else {
		errorTextElement.textContent = '';
	}
}

function validateLastName(inputField) {
	const alphabetsRegex = /^[A-Za-z]+$/;
	const errorTextElement = document.getElementById('errorLastname');

	if (inputField.value === '') {
		errorTextElement.textContent = 'Please enter something.';
	} else if (!alphabetsRegex.test(inputField.value)) {
		errorTextElement.textContent = 'Please enter alphabets only.';
	} else {
		errorTextElement.textContent = '';
	}
}

function validateFatherName(inputField) {
	const alphabetsRegex = /^[A-Za-z]+$/;
	const errorTextElement = document.getElementById('errorFatherName');

	if (inputField.value === '') {
		errorTextElement.textContent = 'Please enter something.';
	} else if (!alphabetsRegex.test(inputField.value)) {
		errorTextElement.textContent = 'Please enter alphabets only.';
	} else {
		errorTextElement.textContent = '';
	}
}

function validateMotherName(inputField) {
	const alphabetsRegex = /^[A-Za-z]+$/;
	const errorTextElement = document.getElementById('errorMotherName');

	if (inputField.value === '') {
		errorTextElement.textContent = 'Please enter something.';
	} else if (!alphabetsRegex.test(inputField.value)) {
		errorTextElement.textContent = 'Please enter alphabets only.';
	} else {
		errorTextElement.textContent = '';
	}
}

function validateMobno(inputField) {
	const digitsOnlyRegex = /^\d{10}$/;
	const errorTextElement = document.getElementById('errorMobno');
	const inputValue = inputField.value.trim();

	if (inputValue === '') {
		errorTextElement.textContent = 'Please enter Moblile no.';
	} else if (!digitsOnlyRegex.test(inputValue)) {
		errorTextElement.textContent = 'Enter digits only (10 digits required).';
	} else {
		errorTextElement.textContent = '';
	}
}

function validateEmail(emailField) {
	const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
	const errorTextElement = document.getElementById('errorText');
	const emailValue = emailField.value.trim();

	if (!emailRegex.test(emailValue)) {
		errorTextElement.textContent = 'Invalid email address format.';
	} else {
		errorTextElement.textContent = '';
	}
}



function validateAdno(inputField) {
	const digitsOnlyRegex = /^\d{12}$/;
	const errorTextElement = document.getElementById('errorAdno');
	const inputValue = inputField.value.trim();

	if (inputValue === '') {
		errorTextElement.textContent = 'Please enter Aadhar no..';
	} else if (!digitsOnlyRegex.test(inputValue)) {
		errorTextElement.textContent = 'Enter digits only (12 digits required).';
	} else {
		errorTextElement.textContent = '';
	}
}

function validateDateOfBirth(dobField) {
	const errorTextElement = document.getElementById('dobErr');
	const dobValue = dobField.value;

	if (dobValue === '') {
		errorTextElement.textContent = 'Please enter your date of birth.';
		return;
	}

	const dobDate = new Date(dobValue);
	const currentDate = new Date();

	if (dobDate > currentDate) {
		errorTextElement.textContent = 'Invalid date of birth.';
		return;
	}

	const age = calculateAge(dobDate, currentDate);
	if (age < 18) {
		errorTextElement.textContent = 'You must be at least 18 years old.';
	} else {
		errorTextElement.textContent = '';
	}
}

function calculateAge(birthDate, currentDate) {
	let age = currentDate.getFullYear() - birthDate.getFullYear();
	const monthDifference = currentDate.getMonth() - birthDate.getMonth();

	if (monthDifference < 0 || (monthDifference === 0 && currentDate.getDate() < birthDate.getDate())) {
		age--;
	}

	return age;
}

function validateAddress1(addressField) {
	const errorTextElement = document.getElementById('addressErr1');
	const addressValue = addressField.value.trim();

	if (addressValue === '') {
		errorTextElement.textContent = 'Please enter your address.';
	} else {
		errorTextElement.textContent = '';
	}
}

function validateAddress2(addressField) {
	const errorTextElement = document.getElementById('addressErr2');
	const addressValue = addressField.value.trim();

	if (addressValue === '') {
		errorTextElement.textContent = 'Please enter your address.';
	} else {
		errorTextElement.textContent = '';
	}
}

function validateLandmark(addressField) {
	const errorTextElement = document.getElementById('landmarkErr');
	const addressValue = addressField.value.trim();

}

function validateState(inputField) {
	const alphabetsRegex = /^[A-Za-z]+$/;
	const errorTextElement = document.getElementById('errorState');

	if (inputField.value === '') {
		errorTextElement.textContent = 'Please enter something.';
	} else if (!alphabetsRegex.test(inputField.value)) {
		errorTextElement.textContent = 'Please enter alphabets only.';
	} else {
		errorTextElement.textContent = '';
	}
}

function validateCity(inputField) {
	const alphabetsRegex = /^[A-Za-z]+$/;
	const errorTextElement = document.getElementById('errorCity');

	if (inputField.value === '') {
		errorTextElement.textContent = 'Please enter something.';
	} else if (!alphabetsRegex.test(inputField.value)) {
		errorTextElement.textContent = 'Please enter alphabets only.';
	} else {
		errorTextElement.textContent = '';
	}
}