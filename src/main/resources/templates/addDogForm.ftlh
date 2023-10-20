<!DOCTYPE html>
<html>
<head>
<style>
.main {
font-weight: bold;
font-size: xx-medium;
background-color: tomato;
}

.table{
color: blue;
background-color: yellow;
}
</style>


<title>Adding a Dog</title>
<meta charset="UTF-8">
           <meta name="viewport" content="width=device-width, initial-scale=1.0">
       </head>
       <body>
       <h2>Add Dog Form</h2>
        <div class="main">
               <a href="/">Back</a>
        </div>
       <form action="/add-dog" method="post" enctype="multipart/form-data">
         <label for="dogName">Dog's name:</label><br>
         <input type="text" id="dogName" name="dogName"><br>
         <label for="dogBreed">Dog's Breed:</label><br>
         <input type="text" id="dogBreed" name="dogBreed"><br>
         <label for="dogAge">Dog's Age:</label><br>
         <input type="number" id="dogAge" name ="dogAge"><br>
         <label for="dogImage">Dog's Picture:</label><br>
         <input type="file" id="dogImage" name="file"><br>
         <label for="dogSex">Dog's Sex:</label><br>
         <input type="radio" id="female" name="dogSex" value="Female">
         <label for="female">Female</label><br>
         <input type="radio" id="male" name="dogSex" value="Male">
         <label for="male">Male</label><br>
         <label for "dogBreed">Dog's Size:</label><br>
         <input type="radio" id="small" name="dogSize" value="Small">
         <label for="small">Small</label><br>
         <input type="radio" id="medium" name="dogSize" value="Medium">
         <label for="medium">Medium</label><br>
         <input type="radio" id="large" name="dogSize" value="Large">
         <label for="large">Large</label><br>
         <label for="dogDescription">Dog's Description:</label><br>
         <textarea id"dogDescription" name="dogDescription" cols="40" rows="5"></textarea><br>
         <label for="dogBDay">Dog's Birthday:</label><br>
         <input type="date" id="dogBDay" name="dogBDay"><br>

         <br>
         <input type="submit" value="Submit"/>
       </form>

</body>
</html>