<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Edit Dog</title>
</head>
<body>
<h1>View Dog</h1>
<div class="main">
    <a href="/">Back</a>
</div>
       <form action="/update/${dog.dogId}" method="post" enctype="multipart/form-data">

         <label for="dogName">Dog's name:</label>
         <input type="text" id="dogName" name="dogName" value="${dog.dogName}"><br>
         <label for="dogBreed">Dog's Breed:</label>
         <input type="text" id="dogBreed" name="dogBreed" value="${dog.dogBreed}"><br>
         <label for="dogAge">Dog's Age:</label>
         <input type="number" id="dogAge" name ="dogAge" value="${dog.dogAge}"><br>
         <label for="dogImage">Dog's Picture:</label>
         <input type="file" id="dogImage" name="file"><br>
         <br>
         <br>
         <input type="submit" value="Submit"/>
       </form>

</body>
</html>
