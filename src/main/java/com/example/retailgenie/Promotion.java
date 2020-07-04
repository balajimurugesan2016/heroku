package com.example.retailgenie;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table
class Promotion {
      
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO) 	
    private Long promotionid;
    private String promotiontype;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date startfrom;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date untilwhen;
    private String productname;
    private String aisle;
    private String shelf;

    public  Promotion(){


    }

    public Promotion(Long promotionid, String promotiontype, Date startfrom, Date untilwhen) {
        super( );
      this.promotionid = promotionid;
      this.promotiontype = promotiontype;
      this.startfrom = startfrom;
      this.untilwhen = untilwhen;
    }



    /**
     * @return String return the promotionid
     */
    public Long getPromotionid() {
        return promotionid;
    }

    /**
     * @param promotionid the promotionid to set
     */
    public void setPromotionid(Long promotionid) {
        this.promotionid = promotionid;
    }

    /**
     * @return String return the promotiontype
     */
    public String getPromotiontype() {
        return promotiontype;
    }

    /**
     * @param promotiontype the promotiontype to set
     */
    public void setPromotiontype(String promotiontype) {
        this.promotiontype = promotiontype;
    }

    /**
     * @return Date return the startfrom
     */
    public Date getStartfrom() {
        return startfrom;
    }

    /**
     * @param startfrom the startfrom to set
     */
    public void setStartfrom(Date startfrom) {
        this.startfrom = startfrom;
    }

    /**
     * @return Date return the untilwhen
     */
    public Date getUntilwhen() {
        return untilwhen;
    }

    /**
     * @param untilwhen the untilwhen to set
     */
    public void setUntilwhen(Date untilwhen) {
        this.untilwhen = untilwhen;
    }

    public String getProductName(){
        return productname;
    }

    public void setProductName(String productname){

        this.productname = productname;
    }
    public String getAisle(){
        return aisle;
    }

    public void setAisle(String aisle){

        this.aisle = aisle;
    }

    public String getShelf(){

        return shelf;
    }

    public void setShelf(String shelf){
        this.shelf = shelf;
    }


}