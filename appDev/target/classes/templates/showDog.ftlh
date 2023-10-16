<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>View Dog</title>
</head>
<body>
<h1>View Dog</h1>
<div class="main">
    <a href="/">Back</a>
</div>
<form>
    <img height="250px" src="data:image/jpeg;base64,${dog.dogImage}" alt="Dog Image">
    <br>
    <br>
    <label for="dogId">DogId:</label>
    <input type="text" name="dogId" value="${dog.dogId}" readonly>
    <br>
    <label for="dogName">Name:</label>
    <input type="text" id="dogName" name="dogName" value="${dog.dogName}" readonly>
    <br>
    <label for="dogBreed">Breed:</label>
    <input type="text" id="dogBreed" name="dogBreed" value="${dog.dogBreed}" readonly>
    <br>
    <label for="dogAge">Age:</label>
    <input type="number" id="dogAge" name="dogAge" value="${dog.dogAge}" readonly>
    <br>
</form>
</body>
</html>
