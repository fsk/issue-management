package com.fsk.issuemanagement.services.implementations;

import com.fsk.issuemanagement.dto.IssueDTO;
import com.fsk.issuemanagement.entities.Issue;
import com.fsk.issuemanagement.repositories.IssueRepository;
import com.fsk.issuemanagement.services.IssueService;
import com.fsk.issuemanagement.utils.TPage;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@AllArgsConstructor
@Service
public class IssueServiceImpl implements IssueService {

    private final IssueRepository issueRepository;
    private final ModelMapper modelMapper;

    @Override
    public IssueDTO save(IssueDTO issue) {

        if (issue.getDate() == null){
            throw new IllegalArgumentException("Issue Date cannot be null");
        }
        Issue issueDb = modelMapper.map(issue, Issue.class);

        issueDb = issueRepository.save(issueDb);

        return modelMapper.map(issueDb, IssueDTO.class);
    }

    @Override
    public IssueDTO getById(Long id) {
        return null;
    }

    @Override
    public TPage<IssueDTO> getAllPageable(Pageable pageable) {
        Page<Issue> data =  issueRepository.findAll(pageable);
        TPage page = new TPage<IssueDTO>();
        IssueDTO[] dtos = modelMapper.map(data.getContent(), IssueDTO[].class);
        page.setStat(data, Arrays.asList(dtos));
        return page;
    }

    @Override
    public Boolean delete(Long issueId) {
        issueRepository.deleteById(issueId);
        return true;
    }





    @Override
    public IssueDTO update(Long id, IssueDTO issue) {
        return null;
    }
}
