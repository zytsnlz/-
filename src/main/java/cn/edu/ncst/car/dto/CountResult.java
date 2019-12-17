package cn.edu.ncst.car.dto;


import java.util.Map;

public class CountResult {

    /**
     * 管理员的id
     */
    public Integer id;
    /**
     * 管理员的姓名
     */
    public String name;
    /**
     * 管理员的处理的记录条数
     */
    public Map<Object,Object> workCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Object, Object> getWorkCount() {
        return workCount;
    }

    public void setWorkCount(Map<Object, Object> workCount) {
        this.workCount = workCount;
    }
}
