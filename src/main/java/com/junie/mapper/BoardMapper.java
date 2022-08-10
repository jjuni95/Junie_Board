package com.junie.mapper;

import java.util.List;

import com.junie.model.BoardVo;
import com.junie.model.Criteria;

public interface BoardMapper {
	
	//게시판 등록
	public void enroll(BoardVo board);
	
	//게시판 목록
	public List<BoardVo> getList();
	
	//게시판 목록(페이징 적용)
	public List<BoardVo> getListPaging(Criteria cri);
	
	//게시판 조회
	public BoardVo getPage(int bno);
	
	//게시판 수정
	public int modify(BoardVo board);
	
	//게시판 삭제
	public int delete(int bno);
	
	//게시판 총 갯수
	public int getTotal(Criteria cri);
	
}
