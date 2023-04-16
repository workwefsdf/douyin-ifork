package com.yali.vilivili.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * @author fuqianlin
 * @date 2023-01-09 18:25
 **/

@Data
@Entity
@Table(name = "comment")
@DynamicInsert
@DynamicUpdate
public class CommentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "video_id")
    private long videoId;


    @Column(name = "commentator_id")
    private String commentator;

    @Column(name = "comment_time")
    @JsonFormat(pattern = "yyyy.MM.dd HH:mm:ss", timezone = "GMT+08:00")
    private Date commentTime;

    @Column(name = "comment_info")
    private String commentInfo;

    @Column(name = "comment_ip")
    private String commentIp;

    @Column(name = "comment_like")
    private long commentLike;

    @Column(name = "comment_dislike")
    private long commentDislike;

}
