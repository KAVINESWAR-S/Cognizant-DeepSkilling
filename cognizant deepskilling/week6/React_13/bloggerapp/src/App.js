import React from "react";
import "./App.css";

import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {

  const books = [
    {
      id: 101,
      bname: "Master React",
      price: 670
    },
    {
      id: 102,
      bname: "Deep Dive into Angular 11",
      price: 800
    },
    {
      id: 103,
      bname: "Mongo Essentials",
      price: 450
    }
  ];

  const blogs = [
    {
      id: 1,
      title: "React Learning",
      author: "Stephen Biz",
      description: "Welcome to learning React!"
    },
    {
      id: 2,
      title: "Installation",
      author: "Schewzdenier",
      description: "You can install React from npm."
    }
  ];

  const courses = [
    {
      id: 1,
      name: "Angular",
      date: "4/5/2021"
    },
    {
      id: 2,
      name: "React",
      date: "6/3/2020"
    }
  ];

  return (
    <div className="container">

      <div className="section">
        <CourseDetails courses={courses} />
      </div>

      <div className="section">
        <BookDetails books={books} />
      </div>

      <div className="section last">
        <BlogDetails blogs={blogs} />
      </div>

    </div>
  );
}

export default App;