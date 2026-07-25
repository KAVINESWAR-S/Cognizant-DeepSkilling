import React from "react";

function BlogDetails(props) {

  return (
    <div>
      <h1>Blog Details</h1>

      {props.blogs.map((blog) => (
        <div key={blog.id}>
          <h1>{blog.title}</h1>
          <h4>{blog.author}</h4>
          <p>{blog.description}</p>
        </div>
      ))}

    </div>
  );
}

export default BlogDetails;