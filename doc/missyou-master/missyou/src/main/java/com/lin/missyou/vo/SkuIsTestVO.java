/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://7yue.pro
 * @免费专栏 $ http://course.7yue.pro
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2019-08-22 19:59
 */
package com.lin.missyou.vo;

import com.lin.missyou.model.Sku;
import com.lin.missyou.model.Spu;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.Optional;

@Getter
@Setter
public class SkuIsTestVO extends Sku {
//    private Boolean isTest;

    public SkuIsTestVO(Sku sku, List<Spu> spuList) {
//        BeanUtils.copyProperties(sku, this);
//        Optional<Spu> s = spuList
//                .stream()
//                .filter(spu->spu.getId().equals(sku.getSpuId()))
//                .findFirst();
//        if(s.isPresent()){
//            this.isTest = s.get().getIsTest();
//        }
    }
}
