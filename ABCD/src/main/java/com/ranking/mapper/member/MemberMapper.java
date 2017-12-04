package com.ranking.mapper.member;
import java.util.ArrayList;
import com.ranking.member.MemberDto;


//MemberMapper.xml파일과 같은 이름(패키지까지 포함)으로 인터페이스를 만들어준다. 
//MemberDaoImpl이 이 인터페이스를 사용하여 MemberMapper.xml파일과 연동할 수 있도록
public interface MemberMapper {
	public int insertMember(MemberDto member);
	public int updateMember(MemberDto member);
	public int deleteMember(int m_num);
	public MemberDto selectOneMember(String m_name);
	public ArrayList<MemberDto> selectAll();
}
