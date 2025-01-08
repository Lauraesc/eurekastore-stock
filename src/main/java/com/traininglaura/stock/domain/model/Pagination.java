package com.traininglaura.stock.domain.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pagination<T> {


    private Integer size;
    private Integer page;
    private Integer numPage;
    private Integer totalElem;
    private List<T> lista;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getNumPage() {
        return numPage;
    }

    public void setNumPage(Integer numPage) {
        this.numPage = numPage;
    }

    public Integer getTotalElem() {
        return totalElem;
    }

    public void setTotalElem(Integer totalElem) {
        this.totalElem = totalElem;
    }

    public List<T> getLista() {
        return lista;
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }
}
