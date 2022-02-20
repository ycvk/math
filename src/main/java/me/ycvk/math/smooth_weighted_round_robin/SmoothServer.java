package me.ycvk.math.smooth_weighted_round_robin;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * @author VERO
 * @version 1.0
 * @date 2022/2/20/13:13
 */
@Data
@AllArgsConstructor
public class SmoothServer {
    /**
     * 执行的服务器
     */
    private String ip;

    /**
     * 执行的服务器的权重
     */
    private int weight;

    /**
     * 当前服务器的权重
     */
    private int curWeight;

}
