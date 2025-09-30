import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        
        // board 생성
        int[][] board = new int[N][N];
        
        // 사과 위치 입력
        for(int i=0; i<K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[x-1][y-1] = 1;
        }
        
        // 뱀 이동 명령
        int L = Integer.parseInt(br.readLine());
        Queue<int[]> moves = new ArrayDeque<>();
        for(int i=0; i<L; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            char y = st.nextToken().charAt(0);
            moves.add(new int[]{x, y});
        }
        
        // 방향 설정
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        
        // 뱀 생성
        Deque<int[]> snake = new ArrayDeque<>();
        snake.add(new int[]{0,0});
        int dir = 0; // 처음 방향 (오른쪽)
        int time = 0;
        
        while(true){
            time++;
            
            // 1. 머리 위치 계산
            int[] head = snake.peekLast();
            int nx = head[0] + dx[dir];
            int ny = head[1] + dy[dir];
            
            // 2. 벽 충돌 체크
            if(nx<0 || ny<0 || nx>=N || ny>=N) {
                System.out.println(time);
                return;
            }
            
            // 3. 자기 몸 충돌 체크
            for(int[] s : snake) {
                if(s[0] == nx && s[1] == ny){
                    System.out.println(time);
                    return;
                }
            }
            
            // 4. 이동 처리
            if(board[nx][ny] == 1) {
                board[nx][ny] = 0;
                snake.addLast(new int[]{nx, ny});
            } else {
                snake.addLast(new int[]{nx, ny});
                snake.pollFirst();
            }
            
            // 5. 방향 전환 처리
            if(!moves.isEmpty() && (int)moves.peek()[0] == time) {
                char c = (char)moves.peek()[1];
                if(c == 'D') dir = (dir+1) % 4;
                else dir = (dir+3) % 4;
                moves.poll();
            }
        }
    }
}