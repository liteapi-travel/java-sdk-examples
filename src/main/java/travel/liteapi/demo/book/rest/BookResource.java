package travel.liteapi.demo.book.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import travel.liteapi.demo.book.service.BookService;

@RestController
public class BookResource<T> {

    @Autowired
    private BookService bookService;

    @GetMapping("/prebook")
    public ResponseEntity<Object> prebook() {
        Object res = bookService.prebook();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @GetMapping("/book")
    public ResponseEntity<Object> book() {
        Object res = bookService.book();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

}
