package com.test.mybatis;

public class MemberDTO
{
	private String code, id, pw, name, nickname, tel
				 , profile_path, member_code, regist_datetime;
	
	// 전체회원목록 관련변수 추가
	private String rownum, reported_count, dormant;			//행, 신고횟수, 휴면여부
	
	// 페이징 관련변수 추가
	private String start, end;	
	
	public String getStart()
	{
		return start;
	}

	public void setStart(String start)
	{
		this.start = start;
	}

	public String getEnd()
	{
		return end;
	}

	public void setEnd(String end)
	{
		this.end = end;
	}

	public String getRownum()
	{
		return rownum;
	}

	public void setRownum(String rownum)
	{
		this.rownum = rownum;
	}

	public String getReported_count()
	{
		return reported_count;
	}

	public void setReported_count(String reported_count)
	{
		this.reported_count = reported_count;
	}

	public String getDormant()
	{
		return dormant;
	}

	public void setDormant(String dormant)
	{
		this.dormant = dormant;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getPw()
	{
		return pw;
	}

	public void setPw(String pw)
	{
		this.pw = pw;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getNickname()
	{
		return nickname;
	}

	public void setNickname(String nickname)
	{
		this.nickname = nickname;
	}

	public String getTel()
	{
		return tel;
	}

	public void setTel(String tel)
	{
		this.tel = tel;
	}

	public String getProfile_path()
	{
		return profile_path;
	}

	public void setProfile_path(String profile_path)
	{
		this.profile_path = profile_path;
	}

	public String getMember_code()
	{
		return member_code;
	}

	public void setMember_code(String member_code)
	{
		this.member_code = member_code;
	}

	public String getRegist_datetime()
	{
		return regist_datetime;
	}

	public void setRegist_datetime(String regist_datetime)
	{
		this.regist_datetime = regist_datetime;
	}
	
}
