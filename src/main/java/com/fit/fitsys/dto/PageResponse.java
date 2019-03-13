package com.fit.fitsys.dto;

import java.io.Serializable;

public class PageResponse implements Serializable {
    private Object rows;
    private long total;

    public PageResponse() {
    }

    public PageResponse(Object rows, long total) {
        this.rows = rows;
        this.total = total;
    }

    public Object getRows() {
        return rows;
    }

    public void setRows(Object rows) {
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
