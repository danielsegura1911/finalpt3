package iterators;


public interface listInterface<T>{
	
   public void add(T item);
   
   public void add(int position, T item);
   
   public void remove(int position);
   
   public void clear();

   public T view(int position);

   public T contains(int position);

   public boolean isEmpty();
   
}