package com.zipcodewilmington.froilansfarm.Pojo;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<CropRow> cropRow;

    public Field(){
        cropRow = new ArrayList<CropRow>();
    }

    public void addRow(CropRow cropRow){
        this.cropRow.add(cropRow);
    }

    public void remove(CropRow cropRow){
        this.cropRow.remove(cropRow);
    }

    public void remove(Integer index){
        this.cropRow.remove(index);
    }

    public void fertilize(){
        for (CropRow each : this.cropRow) {
            each.fertilize();
        }
    }



    public List<CropRow> getCropRow() {
        return cropRow;
    }
}

