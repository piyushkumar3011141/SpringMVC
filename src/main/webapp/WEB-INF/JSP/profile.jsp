
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>My Profile</title>

    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
            background-color: #f4f6f8;
        }

        .profile-container {
            width: 500px;
            margin: 60px auto;
            background-color: white;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.15);
        }

        .profile-container h1 {
            text-align: center;
            margin-bottom: 25px;
            color: #333;
        }

        .profile-image {
            width: 100px;
            height: 100px;
            border-radius: 50%;
            background-color: #0d6efd;
            color: white;
            display: flex;
            align-items: center;
            justify-content: center;
            font-size: 40px;
            margin: 0 auto 25px;
        }

        .profile-info {
            margin-bottom: 18px;
        }

        .profile-info label {
            display: block;
            font-weight: bold;
            color: #555;
            margin-bottom: 5px;
        }

        .profile-info p {
            background-color: #f1f3f5;
            padding: 10px;
            border-radius: 6px;
            color: #333;
        }

        .edit-btn {
            display: block;
            width: 100%;
            padding: 12px;
            border: none;
            border-radius: 6px;
            background-color: #0d6efd;
            color: white;
            font-size: 16px;
            cursor: pointer;
            margin-top: 25px;
        }

        .edit-btn:hover {
            background-color: #0b5ed7;
        }
    </style>
</head>

<body>

    <div class="profile-container">

        <h1>My Profile</h1>

        <div class="profile-image">
            👤
        </div>

        <div class="profile-info">
            <label>Name</label>
            <p>${username}</p>
        </div>


        <div class="profile-info">
            <label>Password</label>
            <p>${password}</p>
        </div>

        <button class="edit-btn">
            Edit Profile
        </button>
		
    </div>

</body>
</html>

