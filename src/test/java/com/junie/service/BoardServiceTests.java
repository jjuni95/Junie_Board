package com.junie.service;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.junie.model.Criteria;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardServiceTests {
	
	 private static final Logger log = LoggerFactory.getLogger(BoardServiceTests.class);
	 
	@Autowired
	private BoardService service;

	/* 게시판 등록
	 
	@Test
	public void testEnroll() {

		BoardVo vo = new BoardVo();

		vo.setTitle("service test");
		vo.setContent("service test");
		vo.setWriter("service test");

		service.enroll(vo);

	}
	*/
	
    /* 게시판 목록 테스트 */
//    @Test
//    public void testGetList() {
//        
//        service.getList().forEach(board -> log.info("" + board));        
//        
//    }
	
	/*게시판 조회*/
//    @Test
//    public void testGETPage() {
//        
//        int bno = 19;
//        
//        log.info("" + service.getPage(bno));
//        
//    }
	
    /* 게시판 수정 */
//    @Test
//    public void testModify() {
//        
//        BoardVo board = new BoardVo();
//        board.setBno(19);
//        board.setTitle("수정 제목");
//        board.setContent("수정 내용");
//        
//        int result = service.modify(board);
//        log.info("result : " +result);
//        
//    } 
	  /* 게시판 삭제 */
//    @Test
//    public void testDelete() {
//        
//        int result = service.delete(11);
//        log.info("result : " + result);
//        
//    }
	 /* 게시판 조회(페이징 적용) */
    @Test
    public void testGetListPaging() {
        
        Criteria cri = new Criteria();
        
        List list = service.getListPaging(cri);
        
        list.forEach(board -> log.info("" + board));
        
        
    }

}
