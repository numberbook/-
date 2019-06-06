package com.qfedu.innovate.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@TableName("t_question")
@Data
public class TQuestion extends Model<TQuestion> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "qid", type = IdType.AUTO)
    private Integer qid;
    private String qname;
    private String qdesc;
    private Integer sid;
    private Integer lid;


}
