package com.khzero.rest.controller;

import com.khzero.rest.domain.Board;
import com.khzero.rest.respotiroy.BoardRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.web.PageableDefault;
import org.springframework.hateoas.PagedResources;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RepositoryRestController
public class BoardRestController {
    private BoardRepository boardRepository;

    public BoardRestController(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

//    @GetMapping("/boards")
//    public @ResponseBody
//    Resources<Board> simpleBoard(@PageableDefault Pageable pageable) {
//        Page<Board> boardList = boardRepository.findAll(pageable);
//
//        PagedResources.PageMetadata = new PagedResources.PageMetadata(pageable.getPageSize(), boardList.getNumber(), boardList.getTotalElements());
//    }

}
