
const calculate = (score, goal) => {
    return totalScore(score / goal);
}
const totalScore = (decimal) => {
    return (decimal * 100).toFixed(2) + "%";
};

const Score = ({name, school, score, goal}) => {
  return (
    <div>
      <h2>{name}</h2>
      <p>School: {school}</p>
      <p>Score: {score}</p>
      <p>Goal: {goal}</p>
      <p>Score:{calculate(score, goal)}</p>
    </div>
  )
}
export default Score