const canvas = document.getElementById("board");
const ctx = canvas.getContext("2d");

canvas.width = window.innerWidth;
canvas.height = window.innerHeight;

let drawing = false;
let tool = "pen";

function setTool(t) {
    tool = t;
}

canvas.addEventListener("mousedown", () => drawing = true);
canvas.addEventListener("mouseup", () => drawing = false);

canvas.addEventListener("mousemove", draw);

function draw(e) {
    if (!drawing) return;

    ctx.lineWidth = 3;
    ctx.lineCap = "round";

    if (tool === "eraser") {
        ctx.strokeStyle = "white";
    } else {
        ctx.strokeStyle = document.getElementById("colorPicker").value;
    }

    ctx.lineTo(e.clientX, e.clientY);
    ctx.stroke();
    ctx.beginPath();
    ctx.moveTo(e.clientX, e.clientY);
}

function clearCanvas() {
    ctx.clearRect(0, 0, canvas.width, canvas.height);
}