package cn.ruleengine.web.vo.rule.general;

import cn.ruleengine.web.vo.condition.ConfigValue;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * 〈SaveActionRequest〉
 *
 * @author 丁乾文
 * @date 2021/7/12 5:34 下午
 * @since 1.0.0
 */
@Data
public class SaveDefaultActionRequest {

    @NotNull
    private Integer generalRuleId;

    /**
     * 结果配置信息
     */
    @NotNull
    @Valid
    private ConfigValue configValue;


}
