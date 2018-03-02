package co.com.prueba.almundo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallController {

    public ResponseEntity<Void> callHandler(){
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
