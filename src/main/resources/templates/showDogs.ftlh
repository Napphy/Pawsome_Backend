<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>View Dog Images</title>
</head>
<body>
<h1>View Dog Images</h1>
<div class="main">
    <a href="/">Back</a>
</div>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Image</th>
        <th>Name</th>
        <th>Breed</th>
        <th>Age</th>
        <th>Sex</th>
        <th>Size</th>
        <th>Description</th>
        <th>Birthday</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <#list dogs as dog>
    <tr>
        <td>${dog.dogId}</td>
        <td>
            <img height="250px" src="data:image/jpeg;base64,${dog.dogImage}" alt="Dog Image">
        </td>
        <td>${dog.dogName}</td>
        <td>${dog.dogBreed}</td>
        <td>${dog.dogAge}</td>
        <td>${dog.dogSex}</td>
        <td>${dog.dogSize}</td>
        <td>${dog.dogDescription}</td>
        <td>${dog.dogBDay}</td>
        <td>
            <form method="get" action="/delete/${dog.dogId}">
                <button type="submit">Delete</button>
            </form>
            <form method="get" action="/dog/${dog.dogId}">
                <button type="submit">View</button>
            </form>
            <!-- Add the "Edit" button that redirects to the edit page -->
            <form method="get" action="/update/${dog.dogId}">
                <button type="submit">Edit</button>
            </form>
        </td>
    </tr>
    </#list>
    </tbody>
</table>
</body>
</html>
