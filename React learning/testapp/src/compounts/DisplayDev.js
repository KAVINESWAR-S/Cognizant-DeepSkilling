import React from 'react';
import Developer from './Developer';
import DeveloperBios from './DeveloperBios';

class DisplayDev extends React.Component {
    constructor(props) {
        super(props);
        this.state={
            developer: [
                new Developer("John Doe", "Frontend Developer", "John is a skilled frontend developer with 5 years of experience in React and JavaScript."),
                new Developer("Jane Smith", "Backend Developer", "Jane is an experienced backend developer specializing in Node.js and database management."),
                new Developer("Mike Johnson", "Full Stack Developer", "Mike is a versatile full stack developer with expertise in both frontend and backend technologies.")
            ]
        };
    }

    render() {
        return (
            this.state.developer.map((dev) =>(
                <DeveloperBios key={dev.name} name={dev.name} role={dev.role} bio={dev.bio} />
            ) )
        );
    }
}
export default DisplayDev;