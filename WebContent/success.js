function display_Msg()
{
	//document.write("Successful login");

	var undata=window.document.form1.userNameTxt.value;
 	var pattern1= /[a-z]/;
 	var pattern2=/[0-9]/;
	var unMsgSection=document.getElementById("userNameId");

	if((undata=="")||(undata==null))
	{
		unMsgSection.innerHTML="Mandatory field";
		return false;
	}
	
	if(!(undata.match(pattern1)&& undata.match(pattern2)))
	{
		//alert("hello");
		unMsgSection.innerHTML="O-nly Characters and numbers";
		return false;
	} 
	
	
	
	var pwddata=window.document.form1.passwordTxt.value;
 	var pattern1= /[a-z]/;
 	var pattern2=/[0-9]/;
 	var pwdlength= pwddata.length; 
	var pwdMsgSection=document.getElementById("passwordId");
	
	if((pwddata=="")||(pwddata==null))
	{
		pwdMsgSection.innerHTML="Password cannot be blank";
		return false;
	}
	else if(pwdlength<8)
		{
			pwdMsgSection.innerHTML="Password should be 8 characters atleast";
			return false;
		}
		
	
	if(!(pwddata.match(pattern1)&& pwddata.match(pattern2)))
	{
		pwdMsgSection.innerHTML="Password must be alphanumeric";
		return false;
	}
	return true;
	
}
