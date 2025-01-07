let toggle = false;

function changeColor(color) {
  document.getElementById("changeColor").style.color = color;
  document.getElementById("changeColor").setAttribute("value", color);
}

function show() {
  if (!toggle) {
    let color = document.getElementsByName("color");
    for (let i = 0; i < color.length; i++) {
      document.getElementsByName("color")[i].hidden = false;
    }
    toggle = true;
    document.getElementById("arrow").innerHTML = "▸";
  } else if (toggle) {
    let color = document.getElementsByName("color");
    for (let i = 0; i < color.length; i++) {
      document.getElementsByName("color")[i].hidden = true;
    }
    toggle = false;
    document.getElementById("arrow").innerHTML = "◂";
  }
}

function colorFill(id) {
  document
    .getElementById(id)
    .setAttribute("fill", document.getElementById("changeColor").style.color);
  let change = document.getElementsByName(id);
  for (let i = 0; i < change.length; i++) {
    document.getElementsByName(id)[i].value = document
      .getElementById("changeColor")
      .getAttribute("value");
  }
}
