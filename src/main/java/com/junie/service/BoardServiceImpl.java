package com.junie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junie.mapper.BoardMapper;
import com.junie.model.BoardVo;
import com.junie.model.Criteria;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper mapper;
	
	//게시판 등록
	@Override
	public void enroll(BoardVo board) {
		mapper.enroll(board);
	}
	
	//게시판 목록
	@Override
	public List<BoardVo> getList(){
		return mapper.getList();
	}
	
	//게시판 목록(페이징 적용)
	@Override
	public List<BoardVo> getListPaging(Criteria cri){
		return mapper.getListPaging(cri);
	}
	
	//게시판 조회
	@Override
	public BoardVo getPage(int bno) {
		return mapper.getPage(bno);
	}
	
	//게시판 수정
	@Override
	public int modify(BoardVo board) {
		return mapper.modify(board);
	}
	
	//게시판 삭제
	@Override
	public int delete(int bno) {
		return mapper.delete(bno);
	}
	
	//게시판 총 갯수
	@Override
	public int getTotal(Criteria cri) {
		return mapper.getTotal(cri);
	}

}
