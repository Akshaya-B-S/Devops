<!DOCTYPE html>
<html>
<head>
    <title>Whiteboard</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<div class="toolbar">
    <button onclick="setTool('pen')">Pen</button>
    <button onclick="setTool('eraser')">Eraser</button>
    <input type="color" id="colorPicker">
    <button onclick="clearCanvas()">Clear</button>
</div>

<canvas id="board"></canvas>

<script src="js/whiteboard.js"></script>

</body>
</html>