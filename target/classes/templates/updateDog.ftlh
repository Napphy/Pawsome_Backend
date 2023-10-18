<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Edit Dog</title>
</head>
<body>
<h1>Edit Dog</h1>
<div class="main">
    <a href="/">Back</a>
</div>
<form action="/update/${dog.dogId}" method="post" enctype="multipart/form-data">
    <label for="dogName">Dog's name:</label><br>
    <input type="text" id="dogName" name="dogName" value="${dog.dogName}"><br>
    <label for="dogBreed">Dog's Breed:</label><br>
    <input type="text" id="dogBreed" name="dogBreed" value="${dog.dogBreed}"><br>
    <label for="dogAge">Dog's Age:</label><br>
    <input type="number" id="dogAge" name="dogAge" value="${dog.dogAge}"><br>
    <label for="dogImage">Dog's Picture:</label><br>
    <input type="file" id="dogImage" name="file" value="${dog.dogImage}"><br>
    <label for="dogSex">Dog's Sex:</label><br>
    <input type="radio" id="female" name="dogSex" value="Female" <#if dog.dogSex == 'Female'>checked</#if>>
    <label for="female">Female</label><br>
    <input type="radio" id="male" name="dogSex" value="Male" <#if dog.dogSex == 'Male'>checked</#if>>
    <label for="male">Male</label><br>
    <label for="dogSize">Dog's Size:</label><br>
    <input type="radio" id="small" name="dogSize" value="Small" <#if dog.dogSize == 'Small'>checked</#if>>
    <label for="small">Small</label><br>
    <input type="radio" id="medium" name="dogSize" value="Medium" <#if dog.dogSize == 'Medium'>checked</#if>>
    <label for="medium">Medium</label><br>
    <input type="radio" id="large" name="dogSize" value="Large" <#if dog.dogSize == 'Large'>checked</#if>>
    <label for="large">Large</label><br>
    <label for="dogDescription">Dog's Description:</label><br>
    <textarea id="dogDescription" name="dogDescription" cols="40" rows="5">${dog.dogDescription}</textarea><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
