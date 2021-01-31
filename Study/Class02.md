## 자료구조1
### Stack(스택)
* Stack은 한쪽 끝에서만 자료를 넣고(push) 뺄 수(pop) 있는 자료구조
* push 와 pop연산으로 이루어짐
* 젤 위에(top) 있는 자료만 알 수 있음
* 일차원 배열 하나로 구현할 수 있음
* 스택을 사용해야 하는 경우에는 맨 위의 데이터만 의미가 있을 때만 사용해야 좋음
* Last In First Out(LIFO) : 마지막으로 들어간 것이 첫번째로 나온다.
* 어떠한 것을 반대로 뒤집는 방법 중 가장 멋있는 방법은 Stack을 사용하는 것

<pre>
	int stack[10000];
	int size = 0;

	//push
	 void push(int data) {
		stack[size] = data;
		size += 1;
	}

	// pop
	int pop() {
		stack[size-1] = 0;
		size -= 1;
	}

	// top
	int top() {
		return stack[size - 1];
	}
</pre>
