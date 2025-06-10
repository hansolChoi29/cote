function solution(n, q, ans) {
    let count = 0;
    const dfs = (idx, arr) => {
        if (arr.length === 5) {
            for (let i = 0; i < q.length; i++) {
                const matchCount = q[i].filter(num => arr.includes(num)).length;
                if (matchCount !== ans[i]) return; 
            }
            count++; 
            return;
        }
        
        for (let i = idx; i <= n; i++) {
            dfs(i + 1, [...arr, i])
        }
    }
    dfs(1, []);
    return count;
}