package org.growit.kz.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by user on 21.12.2014.
 */
@Entity
@Table(name = "image", schema = "", catalog = "ultyksport")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ImageEntity implements Serializable{
    private int idimage;

    private String imagesrc;






    private ArticleEntity articleEntity;


    @JsonSerialize
    @ManyToOne
    @JoinColumn(name = "articleid")
    public ArticleEntity getArticleEntity(){
        return this.articleEntity;
    }
    public void setArticleEntity(ArticleEntity articleEntity){
        this.articleEntity = articleEntity;
    }




    @JsonSerialize
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idimage", nullable = false, insertable = true, updatable = true)
    public int getIdimage() {
        return idimage;
    }

    public void setIdimage(int idimage) {
        this.idimage = idimage;
    }


    @Column(name = "imagesrc", nullable = true, insertable = true, updatable = true)
    @JsonSerialize
    public String getImagesrc() {
        return imagesrc;
    }



    @Column(name = "imagesrc", nullable = true, insertable = true, updatable = true)
    public void setImagesrc(String imagesrc) {
        this.imagesrc = imagesrc;
    }





}
