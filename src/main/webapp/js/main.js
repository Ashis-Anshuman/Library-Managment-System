document.addEventListener("DOMContentLoaded", function() {
 
  var status = document.getElementById("status").value;

  
  if (status === "failed") {
    swal("Sorry", "Wrong Username or Password", "error");
  } else if (status === "success") {
    swal("Success", "Logged in successfully", "success");
  }
});
