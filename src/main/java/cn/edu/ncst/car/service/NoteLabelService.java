package cn.edu.ncst.car.service;

import cn.edu.ncst.car.mbg.model.NoteLabel;

import java.util.List;

public interface NoteLabelService {
    /**
     * 添加标签
     * @param noteLabel 标签
     */
    public void addNoteLabel(NoteLabel noteLabel);

    /**
     * 删除标签
     * @param noteLabel 标签
     */
    public void deleteNoteLabel(String noteLabel, String userId);

    /**
     * 获取指定用户的所有标签内容
     * @return 标签信息构成的列表
     */
    public List<String> getNoteLabelsByUserId(String id);
}
