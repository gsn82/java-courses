/**
класс реализует калькулятор 
*/

public class Calculator{
	/**
		Результат вычисления
	*/
	private int result;
	
	/**
	  Суммирование аргументы 
	  @param params Аргументы суммировнаия
	*/
	public void add (int ... params){
		for (Integer param: params){
			this.result += param;
		}
	}
	/**
		получить результат .
		@return результат вычисления
	*/
	public int getResult(){
		return this.result;
	}
	/**
	очистить результат вычисления
	*/
	public void clearResult(){
		this.result = 0;
	}

}