typedef struct {
    int p, v;
} Item;

Item categories[55][505];
int cat_count[55];

int dp[10005];
int new_dp[10005];

int maxSatisfaction(int W) {

    for (int w = 0; w <= W; w++)
        dp[w] = 0;

    for (int k = 1; k <= 50; k++) {
        if (cat_count[k] == 0)
            continue;

        for (int w = 0; w <= W; w++)
            new_dp[w] = dp[w];

        for (int i = 0; i < cat_count[k]; i++) {
            int p = categories[k][i].p;
            int v = categories[k][i].v;

            for (int w = W; w >= p; w--) {

                if (dp[w - p] + v > new_dp[w]) {
                    new_dp[w] = dp[w - p] + v;
                }
            }
        }

        for (int w = 0; w <= W; w++)
            dp[w] = new_dp[w];
    }

    int ans = 0;

    for (int w = 0; w <= W; w++) {
        if (dp[w] > ans)
            ans = dp[w];
    }
    return ans;
}

    int N, M;
        scanf("%d %d", &N, &M);

        for (int i = 0; i < N; i++) {
            int p, v, c;

            scanf("%d %d %d", &p, &v, &c);
            categories[c][cat_count[c]].p = p;
            categories[c][cat_count[c]].v = v;
            cat_count[c]++;
        }

        printf("%d\n", maxSatisfaction(M));
    
    return 0;