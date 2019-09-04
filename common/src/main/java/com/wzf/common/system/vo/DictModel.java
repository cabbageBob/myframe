package com.wzf.common.system.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class DictModel implements Serializable {
    private static final long serialVersionUID = -6100940324272566957L;

    /**
     * 字典value
     */
    private String value;
    /**
     * 字典文本
     */
    private String text;
}
