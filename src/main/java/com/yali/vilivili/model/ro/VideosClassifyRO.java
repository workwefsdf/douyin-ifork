package com.yali.vilivili.model.ro;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class VideosClassifyRO extends PageRO{

    @ApiModelProperty(name = "git", value = "分类名", required = true)
    private String categoriesName;

}
