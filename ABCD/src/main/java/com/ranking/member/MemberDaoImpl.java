package com.ranking.member;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ranking.mapper.member.MemberMapper;

@Repository	//DAO에 붙이는 어노테이션이다. 프로그램상에선 '이게 붙은게 DAO다'라고 알려주는 역할인 것 같다. application-config에서 스캔한다
public class MemberDaoImpl implements MemberDao {

	
	@Autowired
	MemberMapper memberMapper;
	
	@Override
	public int insertMember(MemberDto member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateMember(MemberDto member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMember(int m_num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberDto selectOneMember(String m_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<MemberDto> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
