# [CLASS 2] 평균 - 1546 

[문제 링크](https://www.acmicpc.net/problem/1546)

[블로그 링크](https://heui-yong.github.io/백준/post-백준-1546/)

### 문제 설명

<p>세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.

예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.

세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.</p>

### 제한

 <p>시간 제한 2초</p>
 <p>메모리 제한 128MB</p>

### 입력 

 <p>첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.</p>

### 출력 

 <p>첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.</p>

### 예제 
| 입력  | 출력    |
|:-----|:-------|
| 3<br>40 80 60 | 75.0 |
| 3<br>10 20 30 | 66.666667 |
| 4<br>1 100 100 100 | 75.25 |
| 5<br>1 2 4 8 16 | 38.75 |
| 2<br>3 10 | 65.0 |
| 4<br>10 20 0 100 | 32.5 |
| 1<br>50 | 100.0 |
| 9<br>10 20 30 40 50 60 70 80 90 | 55.55555555555556 |
