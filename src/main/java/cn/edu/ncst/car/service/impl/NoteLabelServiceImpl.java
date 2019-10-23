package cn.edu.ncst.car.service.impl;

import cn.edu.ncst.car.mbg.mapper.NoteLabelMapper;
import cn.edu.ncst.car.mbg.model.NoteLabel;
import cn.edu.ncst.car.mbg.model.NoteLabelExample;
import cn.edu.ncst.car.service.NoteLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteLabelServiceImpl implements NoteLabelService {
    @Autowired
    NoteLabelMapper noteLabelMapper;
    @Override
    public void addNoteLabel(NoteLabel noteLabel) {
        noteLabelMapper.insert(noteLabel);
    }

    @Override
    public void deleteNoteLabel(String noteLabel, String userId) {
        NoteLabelExample noteLabelExample = new NoteLabelExample();
        NoteLabelExample.Criteria criteria = noteLabelExample.createCriteria();
        criteria.andLabelEqualTo(noteLabel);
        criteria.andUserIdEqualTo(Integer.parseInt(userId));
        noteLabelMapper.deleteByExample(noteLabelExample);
    }

    @Override
    public List<String> getNoteLabelsByUserId(String id) {
        NoteLabelExample noteLabelExample = new NoteLabelExample();
        NoteLabelExample.Criteria criteria = noteLabelExample.createCriteria();
        criteria.andUserIdEqualTo(Integer.parseInt(id));
        List<NoteLabel> noteLabels = noteLabelMapper.selectByExample(noteLabelExample);
        ArrayList<String> myNoteLabels = new ArrayList<>();
        for (int i = 0; i < noteLabels.size(); i++) {
            myNoteLabels.add(noteLabels.get(i).getLabel());
        }
        return myNoteLabels;
    }
}
