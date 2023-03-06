public class Marks {

	private float marks[];
	private int numdata;
	
	//default constructor
	public Marks() {
	}
	//class constructor
	public Marks(int numdata) {
		createData(numdata);
	}
	
	//getter and setter method
	public void setMark(int mark, int index) throws Exception {
        this.marks[index]=mark;
        if(marks[index] < 0){
            //stop whatever happen
            //Display messages
             throw new Exception("Mark is incorrect");
        }
    }
    public float getMark(int index){
          if(marks[index] < 0){
            return 0;
        }
        return marks[index];
    }
	
	//just an operations
	void createData(int numdat){
		marks = new float[numdat];
		for(int i =0; i<numdat; i++) {
			marks[i]=i;	
		}
		numdata =numdat;
	}
	
	float average(){
		float sum =0;
        for (int i=0; i<numdata; i++) {
            sum += marks[i];
            }
        float avg = sum / numdata;
        return avg;
	}
	
	float stanDev(float avg){
		 float sum = 0;
	        float sd;

	        for(int i =0; i< numdata; i++){
	            sum += Math.pow((marks[i]-avg),2);
	        };

	        sd = (float) Math.sqrt(sum/(numdata-1));
	        return sd;
	}
}
