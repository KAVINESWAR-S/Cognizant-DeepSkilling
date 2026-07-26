import react, {Component} from 'react';
//import Post from './post';

class Posts extends Component {

    constructor(props) {
        super(props);
        this.state = {
            post:[]
        }
    }
    getposts = async () => {
        const response = await fetch('https://jsonplaceholder.typicode.com/posts');
        const data = await response.json();
        this.setState({post:data});
    }
    componentDidMount() {
        this.getposts();
    }
    componentDidCatch() {
        console.log("error");
    }
    render() {
        return (
            <div>
                {this.state.post.map((post) => (
                    <div key={post.id}>
                        <h3>{post.title}</h3>
                        <p>{post.body}</p>
                        <hr />
                    </div>
                ))}
            </div>
        )
    }
}
export default Posts;