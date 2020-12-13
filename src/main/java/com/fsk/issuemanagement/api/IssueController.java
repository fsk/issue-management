package com.fsk.issuemanagement.api;



import com.fsk.issuemanagement.dto.IssueDTO;
import com.fsk.issuemanagement.dto.ProjectDTO;
import com.fsk.issuemanagement.services.implementations.IssueServiceImpl;
import com.fsk.issuemanagement.utils.paths.IssueApiPaths;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = IssueApiPaths.BASE_PATH)
@AllArgsConstructor
@Api(value = "ISSUE APIs")
public class IssueController {


    private final IssueServiceImpl issueServiceImpl;

    @GetMapping(value = IssueApiPaths.GET_BY_ID + "{id}")
    @ApiOperation(value = "Get By Id Api Operation for ISSUE", response = IssueDTO.class)
    public ResponseEntity<IssueDTO> getById(@PathVariable(value = "id", required = true) Long id){
        IssueDTO issueDTO = issueServiceImpl.getById(id);
        return ResponseEntity.ok(issueDTO);
    }

    @PostMapping(value = IssueApiPaths.CREATE)
    @ApiOperation(value = "Create Api Operation for ISSUE", response = IssueDTO.class)
    public ResponseEntity<IssueDTO> createProject(@RequestBody IssueDTO issue){
        return ResponseEntity.ok(issueServiceImpl.save(issue));
    }

    @PutMapping(value = IssueApiPaths.UPDATE_BY_ID + "{id}")
    @ApiOperation(value = "Update By Id Api Operation for ISSUE", response = IssueDTO.class)
    public ResponseEntity<IssueDTO> updateProject(@PathVariable(value = "id", required = true) Long id, @RequestBody IssueDTO issue){
        return ResponseEntity.ok(issueServiceImpl.update(id, issue));
    }

    @DeleteMapping(value = IssueApiPaths.DELETE_BY_ID + "{id}")
    @ApiOperation(value = "Delete By Id Api Operation for ISSUE", response = Boolean.class)
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id){
        return ResponseEntity.ok(issueServiceImpl.delete(id));
    }

}
