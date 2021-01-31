## 자료구조1
### Queue(큐)
*  한쪽 끝에서만 자료를 넣고 다른 한쪽 끝에서만 뺄 수 있는 자료구조
* First In First Out(FIFO)
* 어떠한 작업을 순서대로 처리해야 할 때 많이 사용
* BFS 알고리즘에 많이 사용하게 됨 

* 일차원 배열 하나로 구현할 수 있음([begin, end))
<pre>
	int queue[10000];
	int begin = 0;
	int end = 0;

	void push(int data) {
		queue[end] = data;
		end += 1;
	}
	
	int pop() {
		queue[begin] = 0;
		begin += 1;
	}

	bool empty() {
		if (begin == end)
			return true;
		else
			return false;
	}

	int size() {
		return end-begin;
	}
</pre>

### Deque(덱)
* 양쪽 끝에서 자료를 넣고 뺄 수 있는 자료 구조
* Deque를 구현하면 Stack과 Queue를 동시에 구현하는거나 마찬가지
