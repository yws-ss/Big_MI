package fju.im.sa.entity2;

public class Return {

	private int Return_ID;

	private int Member_ID;

	private int Return_Money;

	private String Return_Date;

	private String Return_Reason;

	private boolean Return_Check;

	private int Manager_ID;

	private Manager manager;

	public List<Return> getReturnList() {
		return null;
	}

	public int getReturn_ID() {
		return Return_ID;
	}

	public Return(int return_ID, int member_ID, int return_Money, String return_Date, String return_Reason,
			boolean return_Check, int manager_ID, Manager manager) {
		super();
		Return_ID = return_ID;
		Member_ID = member_ID;
		Return_Money = return_Money;
		Return_Date = return_Date;
		Return_Reason = return_Reason;
		Return_Check = return_Check;
		Manager_ID = manager_ID;
		this.manager = manager;
	}

	public int getReturn_Money() {
		return Return_Money;
	}

	public void setReturn_Money(int return_Money) {
		Return_Money = return_Money;
	}

	public String getReturn_Date() {
		return Return_Date;
	}

	public void setReturn_Date(String return_Date) {
		Return_Date = return_Date;
	}

	public String getReturn_Reason() {
		return Return_Reason;
	}

	public void setReturn_Reason(String return_Reason) {
		Return_Reason = return_Reason;
	}

	public boolean isReturn_Check() {
		return Return_Check;
	}

	public void setReturn_Check(boolean return_Check) {
		Return_Check = return_Check;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public int getMember_ID() {
		return Member_ID;
	}

	public int getManager_ID() {
		return Manager_ID;
	}
	
	

}
