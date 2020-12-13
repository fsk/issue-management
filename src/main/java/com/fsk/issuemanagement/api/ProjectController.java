package com.fsk.issuemanagement.api;


import com.fsk.issuemanagement.dto.ProjectDTO;
import com.fsk.issuemanagement.services.implementations.ProjectServiceImpl;
import com.fsk.issuemanagement.utils.paths.ProjectApiPaths;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = ProjectApiPaths.BASE_PATH)
@AllArgsConstructor
@Api(value = "PROJECT APIs")
public class ProjectController {


    private final ProjectServiceImpl projectServiceImpl;

    @GetMapping(value = ProjectApiPaths.GET_BY_ID + "{id}")
    @ApiOperation(value = "Get By Id Api Operation for PROJECT", response = ProjectDTO.class)
    public ResponseEntity<ProjectDTO> getById(@PathVariable(value = "id", required = true) Long id){
        ProjectDTO projectDTO = projectServiceImpl.getById(id);
        return ResponseEntity.ok(projectDTO);
    }

    @PostMapping(value = ProjectApiPaths.CREATE)
    @ApiOperation(value = "Create Api Operation for PROJECT", response = ProjectDTO.class)
    public ResponseEntity<ProjectDTO> createProject(@RequestBody ProjectDTO project){
        return ResponseEntity.ok(projectServiceImpl.save(project));
    }

    @ApiOperation(value = "Update By Id Api Operation for PROJECT", response = ProjectDTO.class)
    @PutMapping(value = ProjectApiPaths.UPDATE_BY_ID + "{id}")
    public ResponseEntity<ProjectDTO> updateProject(@PathVariable(value = "id", required = true) Long id, @RequestBody ProjectDTO project){
        return ResponseEntity.ok(projectServiceImpl.update(id, project));
    }

    @ApiOperation(value = "Delete By Id Api Operation for PROJECT", response = Boolean.class)
    @DeleteMapping(ProjectApiPaths.DELETE_BY_ID + "{id}")
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id){
        return ResponseEntity.ok(projectServiceImpl.delete(id));
    }

}
