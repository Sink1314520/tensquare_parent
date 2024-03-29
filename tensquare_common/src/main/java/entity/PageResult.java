package entity;

import java.util.List;

/**
 * 分页公共结果对象
 */
public class PageResult<T> {

    private Long total;///总的记录数
    private List<T> rows;//当前页码显示的记录数

    public PageResult(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
