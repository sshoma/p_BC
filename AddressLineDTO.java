package com.jmi.common.dto;

public class AddressLineDTO {
    private String label ;
    private String line;
    private String[][] dataplusGroup ;
    private int lineContent ;
    private Boolean overflow ;
    private Boolean truncated;

    public String[][] getDataplusGroup() {
        return dataplusGroup;
    }

    public void setDataplusGroup(String[][] dataplusGroup) {
        this.dataplusGroup = dataplusGroup;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public int getLineContent() {
        return lineContent;
    }

    public void setLineContent(int lineContent) {
        this.lineContent = lineContent;
    }

    public Boolean getOverflow() {
        return overflow;
    }

    public void setOverflow(Boolean overflow) {
        this.overflow = overflow;
    }

    public Boolean getTruncated() {
        return truncated;
    }

    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }
}
