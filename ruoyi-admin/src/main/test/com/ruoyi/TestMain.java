package com.ruoyi;

import com.ruoyi.system.domain.SysNotice;
import com.ruoyi.system.service.ISysNoticeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author hml
 * @data 2023/2/16
 * @Description
 */
@SpringBootTest(classes = RuoYiApplication.class)
public class TestMain {
    @Autowired
    private ISysNoticeService sysNoticeService;

    @Test
    public void testListSysNotice(){
        SysNotice sysNotice = sysNoticeService.getBaseMapper().selectById(1);
        System.out.println(sysNotice);
    }

}
