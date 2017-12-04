package com.ranking.member;

import java.util.ArrayList;

public interface MemberDao {
	public int insertMember(MemberDto member);
	public int updateMember(MemberDto member);
	public int deleteMember(int m_num);
	public MemberDto selectOneMember(String m_name);
	public ArrayList<MemberDto> selectAll();
}
