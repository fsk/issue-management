package com.fsk.issuemanagement.api;



import com.fsk.issuemanagement.dto.IssueDTO;
import com.fsk.issuemanagement.services.implementations.IssueServiceImpl;
import com.fsk.issuemanagement.utils.paths.IssueApiPaths;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = IssueApiPaths.BASE_PATH)
@AllArgsConstructor
public class IssueController {


    private final IssueServiceImpl issueServiceImpl;

    @GetMapping(value = IssueApiPaths.GET_BY_ID + "{id}")
    public ResponseEntity<IssueDTO> getById(@PathVariable(value = "id", required = true) Long id){
        IssueDTO issueDTO = issueServiceImpl.getById(id);
        return ResponseEntity.ok(issueDTO);
    }

    @PostMapping(value = IssueApiPaths.CREATE)
    public ResponseEntity<IssueDTO> createProject(@RequestBody IssueDTO issue){
        return ResponseEntity.ok(issueServiceImpl.save(issue));
    }

    @PutMapping(value = IssueApiPaths.UPDATE_BY_ID + "{id}")
    public ResponseEntity<IssueDTO> updateProject(@PathVariable(value = "id", required = true) Long id, @RequestBody IssueDTO issue){
        return ResponseEntity.ok(issueServiceImpl.update(id, issue));
    }

    @DeleteMapping(value = IssueApiPaths.DELETE_BY_ID + "{id}")
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id){
        return ResponseEntity.ok(issueServiceImpl.delete(id));
    }

}
