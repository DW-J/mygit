function appleRegCheck() {
	let lBox = document.appleRefForm.a_location;
	let pBox = document.appleRefForm.a_price;
	let iBox = document.appleRefForm.a_introduce;
	
	if (isEmpty(lBox)) {
		alert("Please Fill in Location Properly.");
		lBox.focus();
		return false;
	} else if (isEmpty(pBox) || isNotNumber(pBox)) {
		alert("Please Fill in Price Properly.");
		pBox.value = "";
		pBox.focus();
		return false;
	} else if (isEmpty(iBox) || atLeastLetter(iBox, 5)) {
		alert("Please Fill in intruduce Properly.");
		iBox.value = "";
		iBox.focus();
		return false;
	}
	return true;
}
















