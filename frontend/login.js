let btn=document.getElementById("loginbutn");
btn.addEventListener("click",checkuser);
function checkuser(){
    let usr=document.getElementById("user").value;
    let pass=document.getElementById("password").value;
    let u ={username:usr,password:pass};
    fetch("http://localhost:8080/login",{
method:"POST",
headers:{
"Content-Type" : "application/json"
}
,
body:JSON.stringify(u)
    })
    .then(res=>res.text())
    .then(data=>{document.getElementById("reslt").innerHTML=data})
}