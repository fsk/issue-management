package com.fsk.issuemanagement.api;


import com.fsk.issuemanagement.dto.ProjectDTO;
import com.fsk.issuemanagement.services.implementations.ProjectServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project")
@AllArgsConstructor
public class ProjectController {


    private final ProjectServiceImpl projectServiceImpl;

    @GetMapping("/getById/{id}")
    public ResponseEntity<ProjectDTO> getById(@PathVariable("id") Long id){
        ProjectDTO projectDTO = projectServiceImpl.getById(id);
        return ResponseEntity.ok(projectDTO);
    }

    @PostMapping
    public ResponseEntity<ProjectDTO> createProject(@RequestBody ProjectDTO project){
        return ResponseEntity.ok(projectServiceImpl.save(project));
    }

    @PutMapping("/updateById/{id}")
    public ResponseEntity<ProjectDTO> updateProject(@PathVariable("id") Long id, @RequestBody ProjectDTO project){
        return ResponseEntity.ok(projectServiceImpl.update(id, project));
    }

}
