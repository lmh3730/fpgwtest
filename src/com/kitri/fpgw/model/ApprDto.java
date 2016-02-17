package com.kitri.fpgw.model;

public class ApprDto {
	
	
	
	
	//appr_main �������� ����
	private String strAm_Docu_no;
	private String strAm_Disclosure;
	private String strAm_RecordKeeping_Bcode;
	private String strAm_RecordKeeping;
	private String strAm_Title;
	private String strAm_Get_User;
	private String strAm_Get_Date;
	private String strAm_Edit_User;
	private String strAm_Edit_Date;
	private String strAm_Seq;
	private String strUm_Code;
	private String strAm_Depart_Cd;
	private String strAm_Draft_Y;
	private String strAm_Draft_M;
	private String strAm_Draft_D;
	private String strAm_Draft_User;
	private String strAm_Disclosure_Bcode;
	
	//appr_detail �������� ��
	
	private String strAd_Am_No;
	private String strAd_Am_Seq;
	private int intAd_List_No;
	private int intAd_List_Seq;
	private String strAd_Value;
	private String strAd_Get_User;
	private String strAd_Get_Date;
	
	
	//appr_file ÷������ ����
	
	private String strAf_Am_No;
	private String strAf_Am_Seq;
	private int intAf_Seq;

	private String strAf_Origin_name;
	private String strAf_Save_Name;
	private String strAf_Path;
	private String strAf_Get_User;
	private String strAf_Get_Date;
	
	
	//appr_user ����ó���� ����
	
	private String strAu_Am_No;
	private String strAu_Response_Depart;
	private String strAu_Response_User;
	private String strAu_Reading_Flag_Bcode;
	private String strAu_Reading_Flag;
	private String strAu_Get_User;
	private String strAu_Get_Date;
	private String strAu_Edit_User;
	private String strAu_Edit_Date;
	private String strAu_Am_Seq;
	private String strAu_Approve_Group;
	private String strAu_Seq;
	
	private String strAu_Approve_Group_Bcode;
	private String strAu_Approve_User;
	private String strAu_Approve_Flag_Bcode;
	private String strAu_Approve_Flag;
	
	//docu_list ��ĸ���Ʈ
	private String strDl_Docu_Cd;
	private String strDl_Get_Date;
	private String strDl_Edit_User;
	private String strDl_Edit_Date;
	private String Dl_Pcode;
	private String Dl_Sort;
	private String Dl_Docu_Tag;
	private String Dl_Comment_Tag;
	private String Dl_Use_Flag;
	private String Dl_MenuIndex;
	private String Dl_Get_User;
	
	
public ApprDto(){}
		

	
	
	public ApprDto(String strAm_Docu_no, String strAm_Disclosure, String strAm_RecordKeeping_Bcode,
			String strAm_RecordKeeping, String strAm_Title, String strAm_Get_User, String strAm_Get_Date,
			String strAm_Edit_User, String strAm_Edit_Date, String strAm_Seq, String strUm_Code, String strAm_Depart_Cd,
			String strAm_Draft_Y, String strAm_Draft_M, String strAm_Draft_D, String strAm_Draft_User,
			String strAm_Disclosure_Bcode, String strAd_Am_No, String strAd_Am_Seq, int intAd_List_No,
			int intAd_List_Seq, String strAd_Value, String strAd_Get_User, String strAd_Get_Date, String strAf_Am_No,
			String strAf_Am_Seq, int intAf_Seq, String strAf_Origin_name, String strAf_Save_Name, String strAf_Path,
			String strAf_Get_User, String strAf_Get_Date, String strAu_Am_No, String strAu_Response_Depart,
			String strAu_Response_User, String strAu_Reading_Flag_Bcode, String strAu_Reading_Flag,
			String strAu_Get_User, String strAu_Get_Date, String strAu_Edit_User, String strAu_Edit_Date,
			String strAu_Am_Seq, String strAu_Approve_Group, String strAu_Seq, String strAu_Approve_Group_Bcode,
			String strAu_Approve_User, String strAu_Approve_Flag_Bcode, String strAu_Approve_Flag, String strDl_Docu_Cd,
			String strDl_Get_Date, String strDl_Edit_User, String strDl_Edit_Date, String dl_Pcode, String dl_Sort,
			String dl_Docu_Tag, String dl_Comment_Tag, String dl_Use_Flag, String dl_MenuIndex, String dl_Get_User) {
		super();
		this.strAm_Docu_no = strAm_Docu_no;
		this.strAm_Disclosure = strAm_Disclosure;
		this.strAm_RecordKeeping_Bcode = strAm_RecordKeeping_Bcode;
		this.strAm_RecordKeeping = strAm_RecordKeeping;
		this.strAm_Title = strAm_Title;
		this.strAm_Get_User = strAm_Get_User;
		this.strAm_Get_Date = strAm_Get_Date;
		this.strAm_Edit_User = strAm_Edit_User;
		this.strAm_Edit_Date = strAm_Edit_Date;
		this.strAm_Seq = strAm_Seq;
		this.strUm_Code = strUm_Code;
		this.strAm_Depart_Cd = strAm_Depart_Cd;
		this.strAm_Draft_Y = strAm_Draft_Y;
		this.strAm_Draft_M = strAm_Draft_M;
		this.strAm_Draft_D = strAm_Draft_D;
		this.strAm_Draft_User = strAm_Draft_User;
		this.strAm_Disclosure_Bcode = strAm_Disclosure_Bcode;
		this.strAd_Am_No = strAd_Am_No;
		this.strAd_Am_Seq = strAd_Am_Seq;
		this.intAd_List_No = intAd_List_No;
		this.intAd_List_Seq = intAd_List_Seq;
		this.strAd_Value = strAd_Value;
		this.strAd_Get_User = strAd_Get_User;
		this.strAd_Get_Date = strAd_Get_Date;
		this.strAf_Am_No = strAf_Am_No;
		this.strAf_Am_Seq = strAf_Am_Seq;
		this.intAf_Seq = intAf_Seq;
		this.strAf_Origin_name = strAf_Origin_name;
		this.strAf_Save_Name = strAf_Save_Name;
		this.strAf_Path = strAf_Path;
		this.strAf_Get_User = strAf_Get_User;
		this.strAf_Get_Date = strAf_Get_Date;
		this.strAu_Am_No = strAu_Am_No;
		this.strAu_Response_Depart = strAu_Response_Depart;
		this.strAu_Response_User = strAu_Response_User;
		this.strAu_Reading_Flag_Bcode = strAu_Reading_Flag_Bcode;
		this.strAu_Reading_Flag = strAu_Reading_Flag;
		this.strAu_Get_User = strAu_Get_User;
		this.strAu_Get_Date = strAu_Get_Date;
		this.strAu_Edit_User = strAu_Edit_User;
		this.strAu_Edit_Date = strAu_Edit_Date;
		this.strAu_Am_Seq = strAu_Am_Seq;
		this.strAu_Approve_Group = strAu_Approve_Group;
		this.strAu_Seq = strAu_Seq;
		this.strAu_Approve_Group_Bcode = strAu_Approve_Group_Bcode;
		this.strAu_Approve_User = strAu_Approve_User;
		this.strAu_Approve_Flag_Bcode = strAu_Approve_Flag_Bcode;
		this.strAu_Approve_Flag = strAu_Approve_Flag;
		this.strDl_Docu_Cd = strDl_Docu_Cd;
		this.strDl_Get_Date = strDl_Get_Date;
		this.strDl_Edit_User = strDl_Edit_User;
		this.strDl_Edit_Date = strDl_Edit_Date;
		Dl_Pcode = dl_Pcode;
		Dl_Sort = dl_Sort;
		Dl_Docu_Tag = dl_Docu_Tag;
		Dl_Comment_Tag = dl_Comment_Tag;
		Dl_Use_Flag = dl_Use_Flag;
		Dl_MenuIndex = dl_MenuIndex;
		Dl_Get_User = dl_Get_User;
	}
	
	
	public String getStrAm_Docu_no() {
		return strAm_Docu_no;
	}
	public void setStrAm_Docu_no(String strAm_Docu_no) {
		this.strAm_Docu_no = strAm_Docu_no;
	}
	public String getStrAm_Disclosure() {
		return strAm_Disclosure;
	}
	public void setStrAm_Disclosure(String strAm_Disclosure) {
		this.strAm_Disclosure = strAm_Disclosure;
	}
	public String getStrAm_RecordKeeping_Bcode() {
		return strAm_RecordKeeping_Bcode;
	}
	public void setStrAm_RecordKeeping_Bcode(String strAm_RecordKeeping_Bcode) {
		this.strAm_RecordKeeping_Bcode = strAm_RecordKeeping_Bcode;
	}
	public String getStrAm_RecordKeeping() {
		return strAm_RecordKeeping;
	}
	public void setStrAm_RecordKeeping(String strAm_RecordKeeping) {
		this.strAm_RecordKeeping = strAm_RecordKeeping;
	}
	public String getStrAm_Title() {
		return strAm_Title;
	}
	public void setStrAm_Title(String strAm_Title) {
		this.strAm_Title = strAm_Title;
	}
	public String getStrAm_Get_User() {
		return strAm_Get_User;
	}
	public void setStrAm_Get_User(String strAm_Get_User) {
		this.strAm_Get_User = strAm_Get_User;
	}
	public String getStrAm_Get_Date() {
		return strAm_Get_Date;
	}
	public void setStrAm_Get_Date(String strAm_Get_Date) {
		this.strAm_Get_Date = strAm_Get_Date;
	}
	public String getStrAm_Edit_User() {
		return strAm_Edit_User;
	}
	public void setStrAm_Edit_User(String strAm_Edit_User) {
		this.strAm_Edit_User = strAm_Edit_User;
	}
	public String getStrAm_Edit_Date() {
		return strAm_Edit_Date;
	}
	public void setStrAm_Edit_Date(String strAm_Edit_Date) {
		this.strAm_Edit_Date = strAm_Edit_Date;
	}
	public String getStrAm_Seq() {
		return strAm_Seq;
	}
	public void setStrAm_Seq(String strAm_Seq) {
		this.strAm_Seq = strAm_Seq;
	}
	public String getStrUm_Code() {
		return strUm_Code;
	}
	public void setStrUm_Code(String strUm_Code) {
		this.strUm_Code = strUm_Code;
	}
	public String getStrAm_Depart_Cd() {
		return strAm_Depart_Cd;
	}
	public void setStrAm_Depart_Cd(String strAm_Depart_Cd) {
		this.strAm_Depart_Cd = strAm_Depart_Cd;
	}
	public String getStrAm_Draft_Y() {
		return strAm_Draft_Y;
	}
	public void setStrAm_Draft_Y(String strAm_Draft_Y) {
		this.strAm_Draft_Y = strAm_Draft_Y;
	}
	public String getStrAm_Draft_M() {
		return strAm_Draft_M;
	}
	public void setStrAm_Draft_M(String strAm_Draft_M) {
		this.strAm_Draft_M = strAm_Draft_M;
	}
	public String getStrAm_Draft_D() {
		return strAm_Draft_D;
	}
	public void setStrAm_Draft_D(String strAm_Draft_D) {
		this.strAm_Draft_D = strAm_Draft_D;
	}
	public String getStrAm_Draft_User() {
		return strAm_Draft_User;
	}
	public void setStrAm_Draft_User(String strAm_Draft_User) {
		this.strAm_Draft_User = strAm_Draft_User;
	}
	public String getStrAm_Disclosure_Bcode() {
		return strAm_Disclosure_Bcode;
	}
	public void setStrAm_Disclosure_Bcode(String strAm_Disclosure_Bcode) {
		this.strAm_Disclosure_Bcode = strAm_Disclosure_Bcode;
	}
	public String getStrAd_Am_No() {
		return strAd_Am_No;
	}
	public void setStrAd_Am_No(String strAd_Am_No) {
		this.strAd_Am_No = strAd_Am_No;
	}
	public String getStrAd_Am_Seq() {
		return strAd_Am_Seq;
	}
	public void setStrAd_Am_Seq(String strAd_Am_Seq) {
		this.strAd_Am_Seq = strAd_Am_Seq;
	}
	public int getIntAd_List_No() {
		return intAd_List_No;
	}
	public void setIntAd_List_No(int intAd_List_No) {
		this.intAd_List_No = intAd_List_No;
	}
	public int getIntAd_List_Seq() {
		return intAd_List_Seq;
	}
	public void setIntAd_List_Seq(int intAd_List_Seq) {
		this.intAd_List_Seq = intAd_List_Seq;
	}
	public String getStrAd_Value() {
		return strAd_Value;
	}
	public void setStrAd_Value(String strAd_Value) {
		this.strAd_Value = strAd_Value;
	}
	public String getStrAd_Get_User() {
		return strAd_Get_User;
	}
	public void setStrAd_Get_User(String strAd_Get_User) {
		this.strAd_Get_User = strAd_Get_User;
	}
	public String getStrAd_Get_Date() {
		return strAd_Get_Date;
	}
	public void setStrAd_Get_Date(String strAd_Get_Date) {
		this.strAd_Get_Date = strAd_Get_Date;
	}
	public String getStrAf_Am_No() {
		return strAf_Am_No;
	}
	public void setStrAf_Am_No(String strAf_Am_No) {
		this.strAf_Am_No = strAf_Am_No;
	}
	public String getStrAf_Am_Seq() {
		return strAf_Am_Seq;
	}
	public void setStrAf_Am_Seq(String strAf_Am_Seq) {
		this.strAf_Am_Seq = strAf_Am_Seq;
	}
	public int getIntAf_Seq() {
		return intAf_Seq;
	}
	public void setIntAf_Seq(int intAf_Seq) {
		this.intAf_Seq = intAf_Seq;
	}
	public String getStrAf_Origin_name() {
		return strAf_Origin_name;
	}
	public void setStrAf_Origin_name(String strAf_Origin_name) {
		this.strAf_Origin_name = strAf_Origin_name;
	}
	public String getStrAf_Save_Name() {
		return strAf_Save_Name;
	}
	public void setStrAf_Save_Name(String strAf_Save_Name) {
		this.strAf_Save_Name = strAf_Save_Name;
	}
	public String getStrAf_Path() {
		return strAf_Path;
	}
	public void setStrAf_Path(String strAf_Path) {
		this.strAf_Path = strAf_Path;
	}
	public String getStrAf_Get_User() {
		return strAf_Get_User;
	}
	public void setStrAf_Get_User(String strAf_Get_User) {
		this.strAf_Get_User = strAf_Get_User;
	}
	public String getStrAf_Get_Date() {
		return strAf_Get_Date;
	}
	public void setStrAf_Get_Date(String strAf_Get_Date) {
		this.strAf_Get_Date = strAf_Get_Date;
	}
	public String getStrAu_Am_No() {
		return strAu_Am_No;
	}
	public void setStrAu_Am_No(String strAu_Am_No) {
		this.strAu_Am_No = strAu_Am_No;
	}
	public String getStrAu_Response_Depart() {
		return strAu_Response_Depart;
	}
	public void setStrAu_Response_Depart(String strAu_Response_Depart) {
		this.strAu_Response_Depart = strAu_Response_Depart;
	}
	public String getStrAu_Response_User() {
		return strAu_Response_User;
	}
	public void setStrAu_Response_User(String strAu_Response_User) {
		this.strAu_Response_User = strAu_Response_User;
	}
	public String getStrAu_Reading_Flag_Bcode() {
		return strAu_Reading_Flag_Bcode;
	}
	public void setStrAu_Reading_Flag_Bcode(String strAu_Reading_Flag_Bcode) {
		this.strAu_Reading_Flag_Bcode = strAu_Reading_Flag_Bcode;
	}
	public String getStrAu_Reading_Flag() {
		return strAu_Reading_Flag;
	}
	public void setStrAu_Reading_Flag(String strAu_Reading_Flag) {
		this.strAu_Reading_Flag = strAu_Reading_Flag;
	}
	public String getStrAu_Get_User() {
		return strAu_Get_User;
	}
	public void setStrAu_Get_User(String strAu_Get_User) {
		this.strAu_Get_User = strAu_Get_User;
	}
	public String getStrAu_Get_Date() {
		return strAu_Get_Date;
	}
	public void setStrAu_Get_Date(String strAu_Get_Date) {
		this.strAu_Get_Date = strAu_Get_Date;
	}
	public String getStrAu_Edit_User() {
		return strAu_Edit_User;
	}
	public void setStrAu_Edit_User(String strAu_Edit_User) {
		this.strAu_Edit_User = strAu_Edit_User;
	}
	public String getStrAu_Edit_Date() {
		return strAu_Edit_Date;
	}
	public void setStrAu_Edit_Date(String strAu_Edit_Date) {
		this.strAu_Edit_Date = strAu_Edit_Date;
	}
	public String getStrAu_Am_Seq() {
		return strAu_Am_Seq;
	}
	public void setStrAu_Am_Seq(String strAu_Am_Seq) {
		this.strAu_Am_Seq = strAu_Am_Seq;
	}
	public String getStrAu_Approve_Group() {
		return strAu_Approve_Group;
	}
	public void setStrAu_Approve_Group(String strAu_Approve_Group) {
		this.strAu_Approve_Group = strAu_Approve_Group;
	}
	public String getStrAu_Seq() {
		return strAu_Seq;
	}
	public void setStrAu_Seq(String strAu_Seq) {
		this.strAu_Seq = strAu_Seq;
	}
	public String getStrAu_Approve_Group_Bcode() {
		return strAu_Approve_Group_Bcode;
	}
	public void setStrAu_Approve_Group_Bcode(String strAu_Approve_Group_Bcode) {
		this.strAu_Approve_Group_Bcode = strAu_Approve_Group_Bcode;
	}
	public String getStrAu_Approve_User() {
		return strAu_Approve_User;
	}
	public void setStrAu_Approve_User(String strAu_Approve_User) {
		this.strAu_Approve_User = strAu_Approve_User;
	}
	public String getStrAu_Approve_Flag_Bcode() {
		return strAu_Approve_Flag_Bcode;
	}
	public void setStrAu_Approve_Flag_Bcode(String strAu_Approve_Flag_Bcode) {
		this.strAu_Approve_Flag_Bcode = strAu_Approve_Flag_Bcode;
	}
	public String getStrAu_Approve_Flag() {
		return strAu_Approve_Flag;
	}
	public void setStrAu_Approve_Flag(String strAu_Approve_Flag) {
		this.strAu_Approve_Flag = strAu_Approve_Flag;
	}
	public String getStrDl_Docu_Cd() {
		return strDl_Docu_Cd;
	}
	public void setStrDl_Docu_Cd(String strDl_Docu_Cd) {
		this.strDl_Docu_Cd = strDl_Docu_Cd;
	}
	public String getStrDl_Get_Date() {
		return strDl_Get_Date;
	}
	public void setStrDl_Get_Date(String strDl_Get_Date) {
		this.strDl_Get_Date = strDl_Get_Date;
	}
	public String getStrDl_Edit_User() {
		return strDl_Edit_User;
	}
	public void setStrDl_Edit_User(String strDl_Edit_User) {
		this.strDl_Edit_User = strDl_Edit_User;
	}
	public String getStrDl_Edit_Date() {
		return strDl_Edit_Date;
	}
	public void setStrDl_Edit_Date(String strDl_Edit_Date) {
		this.strDl_Edit_Date = strDl_Edit_Date;
	}
	public String getDl_Pcode() {
		return Dl_Pcode;
	}
	public void setDl_Pcode(String dl_Pcode) {
		Dl_Pcode = dl_Pcode;
	}
	public String getDl_Sort() {
		return Dl_Sort;
	}
	public void setDl_Sort(String dl_Sort) {
		Dl_Sort = dl_Sort;
	}
	public String getDl_Docu_Tag() {
		return Dl_Docu_Tag;
	}
	public void setDl_Docu_Tag(String dl_Docu_Tag) {
		Dl_Docu_Tag = dl_Docu_Tag;
	}
	public String getDl_Comment_Tag() {
		return Dl_Comment_Tag;
	}
	public void setDl_Comment_Tag(String dl_Comment_Tag) {
		Dl_Comment_Tag = dl_Comment_Tag;
	}
	public String getDl_Use_Flag() {
		return Dl_Use_Flag;
	}
	public void setDl_Use_Flag(String dl_Use_Flag) {
		Dl_Use_Flag = dl_Use_Flag;
	}
	public String getDl_MenuIndex() {
		return Dl_MenuIndex;
	}
	public void setDl_MenuIndex(String dl_MenuIndex) {
		Dl_MenuIndex = dl_MenuIndex;
	}
	public String getDl_Get_User() {
		return Dl_Get_User;
	}
	public void setDl_Get_User(String dl_Get_User) {
		Dl_Get_User = dl_Get_User;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
