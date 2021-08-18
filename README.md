# Travel_Agency_SignUp_Shaft

I used Shaft Engine as an automation tool because the powerful reporting tool that it used " Allure " .

I automate as required " Regersteration " process , And there are some test cases .

Some fields accepting wrong data , like " phone number & email " , we can exclude phone number as it's not an Egyptian website but i didn't , but the case here was that the website let the user write letters on phone number field .

# Test Cases
1/ Exist Email 
It is a positive test case that the user can't register with the same email twice .

2/ Wrong Phone Number
As i said i considered that the website is an Egyptian website so the phone number should be as example : 01234567890
so it is a negative test case .

3/ Password Validation
It is a negative test case cause the user can write the password > 8 characters with no capital or small letters .

4/ Wrong Email Format
It is a negative test case cause the user can write his email like that " zz " without a validation at email formation .

5/ Successfull Sign up 

It is the happy scenario that the user can sign up normally without any problems .  

# Allure Reporting Tool

Shaft Engine use an Amazing reporting tool calls Allure that write your test cases steps in details and give you a GIF about the steps happened .

Allure has a great and easy gui that gives you a chart about the percentage of the failed test cases and successfull one .

# Video for running the script

https://drive.google.com/file/d/1efWD9g-kUI65CpcPH3WQVaVs6ulT73R1/view?usp=sharing

Note : I uploaded the video before i edited something in " Wrong phone number " .
