package com.gabriel.springboot.controllers;

import com.gabriel.springboot.data.vo.v1.BookVO;
import com.gabriel.springboot.mapper.BookMapper;
import com.gabriel.springboot.model.Book;
import com.gabriel.springboot.services.BookServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
@Tag(name = "2.0 Book", description = "Endpoint for managing books")
public class BookController {

    private final BookServices bookServices;
    private final BookMapper bookMapper;

    @GetMapping("/all")
    @Operation(summary = "Finds all books")
    public List<BookVO> findAll() {
        return bookServices.findAll().stream().map(bookMapper::entity2BookVO).collect(Collectors.toList());
    }

    @GetMapping()
    @Operation(summary = "Find a book by its ID")
    public BookVO findById(@RequestParam Long id) {
        return bookMapper.entity2BookVO(bookServices.findById(id));
    }

    @PostMapping(value = "/")
    @Operation(summary = "Create a new book")
    public BookVO create(@RequestBody Book book) {
        return bookMapper.entity2BookVO(bookServices.create(book));
    }

    @PutMapping(value = "/")
    @Operation(summary = "Update a book")
    public BookVO update(@RequestBody Book book) {
        return bookMapper.entity2BookVO(bookServices.update(book));
    }

    @DeleteMapping()
    @Operation(summary = "delete a book by its ID")
    public ResponseEntity<?> delete(@RequestParam Long id) {
        bookServices.delete(id);
        return ResponseEntity.noContent().build();
    }
}
