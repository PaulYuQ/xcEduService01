package com.xuecheng.framework.domain.course.ext;

import com.xuecheng.framework.domain.course.Teachplan;
import lombok.Data;
import lombok.ToString;

import java.util.List;


/**
 * @author 小强子大大
 */
@Data
@ToString
public class TeachplanNode extends Teachplan {

    List<TeachplanNode> children;

    //媒资文件id
    String media;

    //媒资文件原始名称
    String mediaFileoriginalname;

}
