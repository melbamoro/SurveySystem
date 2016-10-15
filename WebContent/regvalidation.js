function isSubmit()
{
	 //isFirstName();
	 //isLastName();
	var fname = isFirstName();
	var lname = isLastName();
	var username = isUserName();
	var password = isPass();
	var confirmpass = isConfirm();
	var phone = isContact();
	var email = isEmail();
	if(!(fname && lname && username && password && confirmpass && phone && email))
	{
		alert("Problem with your input data");
		return false;
	}
	else
	{
		return true;
	}
	
}



function isFirstName()
{
	var fname = window.document.registerForm.fnTxt.value;
	var fnameMsg = document.getElementById("fnTxt");
	 
	var namePattern =  new RegExp("^[a-zA-Z]{3,}$");
	if(!fname.match(namePattern))
	{
		fnameMsg.innerHTML = "Atleast 2 characters <br/>  Only Alphabets Allowd";
		return false;
	}
	else
	{
		fnameMsg.innerHTML = "";
		return true;
	}
}

function isLastName()
{
	var lname = window.document.registerForm.lnTxt.value;
	var lnameMsg = document.getElementById("lnTxt");
	 
	var namePattern =  new RegExp("^[a-zA-Z]{3,}$");
	if(!lname.match(namePattern))
	{
		lnameMsg.innerHTML = "Atleast 2 characters <br/>  Only Alphabets Allowd";
		return false;
	}
	else
	{
		lnameMsg.innerHTML = "";
		return true;
	}
	
}

function isUserName()
{
	var uname = window.document.registerForm.unTxt.value;
	var unameMsg = document.getElementById("unTxt");
	 
	var namePattern =  new RegExp("^[a-zA-Z0-9]{5,}$");
	if(!uname.match(namePattern))
	{
		unameMsg.innerHTML = "Atleast 5 characters";
		return false;
	}
	else
	{
		unameMsg.innerHTML = "";
		return true;
	}
}

function isPass()
{
	var passname = window.document.registerForm.passTxt.value;
	var passMsg = document.getElementById("passTxt");
	var passPattern =  RegExp("^[a-zA-Z0-9]{8,}");
	if(!passname.match(passPattern))
	{
		passMsg.innerHTML = "Atleast 8 Characters required";
		return false;

	}
	else
	{
		passMsg.innerHTML = "";
		return true;

	}
}

function isConfirm()
{
	var passname = window.document.registerForm.passTxt.value;
	var conpassname = window.document.registerForm.conPassTxt.value;
	var conPassMsg = document.getElementById("conPassTxt");
	if(conpassname != passname)
	{
		conPassMsg.innerHTML = "Not Matched with Password";
		return false;
	}
	else
	{
		conPassMsg.innerHTML = "";
		return true;
	}
	
}
function isContact()
{

	var contactTxt = window.document.registerForm.ctTxt.value;
	var contactMsg = document.getElementById("ctTxt");
	var phonepattern = new RegExp("^[0-9]{10}$");
	
	if(!contactTxt.match(phonepattern))
	{
		contactMsg.innerHTML = "Invalid Contact Number";
		return false;
	}
	else
	{
		contactMsg.innerHTML = "";
		return true;
	}
}
function isEmail()
{
	var emailTxt = window.document.registerForm.emailTxt.value;
	var emailMsg = document.getElementById("emailTxt");
	var emailpattern = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"; 

	
	if(!emailTxt.match(emailpattern))
	{
		emailMsg.innerHTML = "Invalid Email ID";
		return false;
	}
	else
	{
		emailMsg.innerHTML = "";
		return true;
	}
}