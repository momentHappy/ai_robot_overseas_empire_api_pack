package com.clsz.airobot;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author quheizi
 * @description 测试基类
 * @date 2024/3/26 09:31:43
 */

@SpringBootTest
@Transactional
@Rollback
@RunWith(SpringRunner.class)
public class SpringbootUnitTest {
}
