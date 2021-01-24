package ca.onepoint.yul.controller;

import ca.onepoint.yul.dto.AvatarDto;
import ca.onepoint.yul.entity.Type;
import ca.onepoint.yul.service.IAvatarService;
import ca.onepoint.yul.service.ITypeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/type")
public class TypeController {

    @Resource
    private ITypeService iTypeService;

    @Autowired
    private SimpMessageSendingOperations messagingTemplate;

    @CrossOrigin
    @GetMapping("/")
    public List<Type> findAllTypess() {
        return iTypeService.getAllTypes();
    }

    @CrossOrigin
    @PostMapping("/")
    public void createType(@RequestBody Type type) {
        iTypeService.createType(type);
    }







}
