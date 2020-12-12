package com.fsk.issuemanagement.api;


import com.fsk.issuemanagement.dto.ProjectDTO;
import com.fsk.issuemanagement.services.implementations.ProjectServiceImpl;
import com.fsk.issuemanagement.utils.paths.ProjectApiPaths;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = ProjectApiPaths.BASE_PATH)
@AllArgsConstructor
public class ProjectController {


    private final ProjectServiceImpl projectServiceImpl;

    @GetMapping(value = ProjectApiPaths.GET_BY_ID + "{id}")
    public ResponseEntity<ProjectDTO> getById(@PathVariable(value = "id", required = true) Long id){
        ProjectDTO projectDTO = projectServiceImpl.getById(id);
        return ResponseEntity.ok(projectDTO);
    }

    @PostMapping(value = ProjectApiPaths.CREATE)
    public ResponseEntity<ProjectDTO> createProject(@RequestBody ProjectDTO project){
        return ResponseEntity.ok(projectServiceImpl.save(project));
    }

    @PutMapping(value = ProjectApiPaths.UPDATE_BY_ID + "{id}")
    public ResponseEntity<ProjectDTO> updateProject(@PathVariable(value = "id", required = true) Long id, @RequestBody ProjectDTO project){
        return ResponseEntity.ok(projectServiceImpl.update(id, project));
    }

    @DeleteMapping(ProjectApiPaths.DELETE_BY_ID + "{id}")
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id){
        return ResponseEntity.ok(projectServiceImpl.delete(id));
    }

}
