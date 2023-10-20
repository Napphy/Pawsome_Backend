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
    <label for="dogId">DogId:</label><br>
    <input type="text" name="dogId" value="${dog.dogId}" readonly>
    <br>
    <label for="dogName">Name:</label><br>
    <input type="text" id="dogName" name="dogName" value="${dog.dogName}" readonly>
    <br>
    <label for="dogBreed">Breed:</label><br>
    <input type="text" id="dogBreed" name="dogBreed" value="${dog.dogBreed}" readonly>
    <br>
    <label for="dogAge">Age:</label><br>
    <input type="number" id="dogAge" name="dogAge" value="${dog.dogAge}" readonly>
    <br>
    <label for="dogSex">Sex:</label><br>
    <input type="text" id="dogSex" name="dogSex" value="${dog.dogSex}" readonly>
    <br>
    <label for="dogSize">Size:</label><br>
    <input type="text" id="dogSize" name="dogSize" value="${dog.dogSize}" readonly>
    <br>
    <label for = "dogDescription">Description:</label><br>
    <textarea id="dogDescription" name="dogDescription" cols="40" rows="5" readonly>${dog.dogDescription}</textarea>
    <br>
    <label for="dogBDay">Dog's Birthday:</label><br>
    <input type="date" id="dogBDay" name="dogBDay" value="${formattedDogBDay}" readonly><br>
    <br>
</form>
</body>
</html>
