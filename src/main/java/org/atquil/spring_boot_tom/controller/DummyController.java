package org.atquil.spring_boot_tom.controller;

import lombok.RequiredArgsConstructor;
import org.atquil.spring_boot_tom.service.DummyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author atquil
 */

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DummyController {

    private final DummyService dummyService;
    @GetMapping("/base")
    public ResponseEntity<String> getBase() {
        return ResponseEntity.ok(dummyService.sayHello());
    }
}
