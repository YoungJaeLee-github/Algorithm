## 알고리즘
* 어떠한 문제를 해결하기 위해 정해진 일련의 절차나 방법을 공식화한 형태로 표현한 것
* 이 문제를 푸는 알고리즘이 무엇인지 알아내는 능력이 중요함
* 알고리즘 공부에 가장 효과적인 것은 문제 풀이

### 효율성
* 알고리즘 문제를 해결하는 코드를 작성했을때 이 프로그램이 얼마나 효율적인지를 결정하는 가장 중요한 요소는 수행 시간임
* 1 부터 N 까지의 합 : O(N) vs O(1)
<pre>
for(int i = 1; i <= N; i++) -> O(N)
{
	sum += i;
}
</pre>

<pre> int sum = N * (N+1) / 2; -> O(1) </pre>

### 문제의 크기
* 문제의 크기를 보통 N이라고 하고, 문제의 크기 N에 따라 걸리는 시간이 다름
* 문제를 해결할 때도 문제의 크기에 따라 알맞은 방법을 선택하는 것이 좋음
* 대부분의 문제는 가장 빠른 방법이 정해져있지만, 가장 빠른 방법이 너무 어려운 경우일 수도 있어, 그 방법보다는 상대적으로 느리지만 문제는 해결할 수 있는 방법을 이용하기도 함
* 이러한 이유 때문에 문제를 해결할 때는 문제의 크기를 먼저 보고 방법을 생각해야 함

### 시간 복잡도
* 작성한 코드가 시간이 대략 얼마나 걸릴지 예상이 가능함
* Big O Notation 이라고도 불리며 대문자 O()를 사용
* 입력의 크기 N에 대해서 시간이 얼마나 걸릴지 나타내는 방법
* 즉, 최악의 경우에 시간이 얼마나 걸릴지 알 수 있음
* 소스를 보고 계산할 수도 있고, 소스를 작성하기 전에 먼저 계산해볼 수 있음
* 문제를 풀기 전에 먼저 시간복잡도를 계산해보고 정해진 시간 안에 수행될 것 같은 경우에만 구현하는 것이 좋음

### 대표적인 시간 복잡도
* O(1)
* O(logN)
* O(N)
* O(NlogN)
* O(N^2)
* O(N^3)
* O(2^N)
* O(N!)
* 시간 복잡도 안에 가장 큰 입력 범위를 넣었을 때. 1억이 1초 정도임(대략적인 값)

### 시간복잡도 계산
* Big O Notation 에서는 상수는 버림
* O(3N^2) = O(N^2)
* O(5) = O(1)
* 두 가지 항이 있을 때, 변수가 같으면 큰 것만 빼고 버림
* O(N^2 + N) = O(N^2)
* 두 가지 항이 있을 때, 변수가 다르면 놔둠
* O(N^2 + M)

### 메모리
* 메모리 제한은 보통 넉넉하기 때문에, 걱정할 필요가 없음
* 대략적으로 얼마나 공간을 사용할지 예상할 수 있음
* 보통 가장 많은 공간을 사용하는 자료형이 배열임
* 배열이 사용한 공간 : 배열의 크기 X 자료형의 크기 B
* 배열의 크기가 크면 시간 초과를 받는 경우가 많음
* 불필요한 공간이 없다면, 대부분 메모리 제한은 알아서 지켜짐