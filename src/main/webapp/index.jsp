<html>
<body>
<h2>Hello World!</h2>

<div>
    <h3> Choose File to Upload in Server </h3>
    <form action="book-load" method="post" enctype="multipart/form-data">
        <input type="file" name="file"/>
        <input type="submit" value="Upload book"/>
    </form>

    <h3> Write book title to download from Server </h3>
    <form action="book" method="get">
        Book title: <input  type="text" name="title"/>
        <input type="submit" value="Download book" />
    </form>
</div>
</body>
</html>
