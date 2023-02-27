function btnStyle(){
  let value = Number(document.getElementById("range").value);
  if(document.getElementById("blur").checked){
    document.querySelector("img").style.filter = `blur(${value}px)`;
  }else if(document.getElementById("brightness").checked){
    document.querySelector("img").style.filter = `brightness(${value}%)`;
  }else if(document.getElementById("contrast").checked){
    document.querySelector("img").style.filter = `contrast(${value}%)`;
  }else if(document.getElementById("grayscale").checked){
    document.querySelector("img").style.filter = `grayscale(${value}%)`;
  }else if(document.getElementById("hueRotate").checked){
    document.querySelector("img").style.filter = `hue-rotate(${value*3.6}deg)`;
  }else if(document.getElementById("invert").checked){
    document.querySelector("img").style.filter = `invert(${value}%)`;
  }else if(document.getElementById("opacity").checked){
    document.querySelector("img").style.filter = `opacity(${value}%)`;
  }else if(document.getElementById("saturate").checked){
    document.querySelector("img").style.filter = `saturate(${value*10}%)`;
  }else if(document.getElementById("sepia").checked){
    document.querySelector("img").style.filter = `sepia(${value}%)`;
  }
}

function changeSize(){
  document.querySelector("img").style.width = document.getElementById("size").value + "%";
}