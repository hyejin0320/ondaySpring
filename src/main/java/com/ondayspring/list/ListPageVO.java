package com.ondayspring.list;

import java.util.List;

public class ListPageVO {
    private int listCnt;
    private List<ListVO> listContent;

    public int getListCnt() {
        return listCnt;
    }

    public void setListCnt(int listCnt) {
        this.listCnt = listCnt;
    }

    public List<ListVO> getListContent() {
        return listContent;
    }

    public void setListContent(List<ListVO> listContent) {
        this.listContent = listContent;
    }
}
