let canvas = document.getElementById("board");
let ctx = canvas.getContext("2d");

let drawing = false;

canvas.addEventListener("mousedown", () => drawing = true);
canvas.addEventListener("mouseup", () => drawing = false);
canvas.addEventListener("mousemove", draw);

function draw(e) {
    if (!drawing) return;

    ctx.lineWidth = 2;
    ctx.lineCap = "round";

    ctx.lineTo(e.offsetX, e.offsetY);
    ctx.stroke();
    ctx.beginPath();
    ctx.moveTo(e.offsetX, e.offsetY);
}

function clearBoard() {
    ctx.clearRect(0, 0, canvas.width, canvas.height);
}

function saveDrawing() {
    let dataURL = canvas.toDataURL();

    fetch("save", {
        method: "POST",
        body: dataURL
    }).then(res => alert("Saved!"));
}