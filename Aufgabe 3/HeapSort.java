public class HeapSort{
  private char[] nodes;

  public HeapSort(char[] nodes){
    this.nodes = nodes;
  }

  public void buildHeap(){
    for(int i = nodes.length; i >= 0 ;i--){
      heapify(i,nodes.length - 1);
    }
  }

  private void swap(int a,int b){
    char temp = nodes[a];
    nodes[a] = nodes[b];
    nodes[b] = temp;
  }

  private void heapify(int curIdx, int endIdx){
    int largest = curIdx;
    int left = 2*curIdx +1;
    int right = left +1;

    if(left <= endIdx && nodes[left] > (nodes[largest]))
      largest = left;
    if(right <= endIdx && nodes[right] > (nodes[largest]))
      largest = right;

    if(largest != curIdx){
      swap(largest,curIdx);
      heapify(largest,endIdx);
      }
  }


    public void heapSort(){
      buildHeap();
      for(int end = nodes.length -1 ;end > 0; end--){
        swap(0,end);
        heapify(0,end-1);
      }
    }
}
