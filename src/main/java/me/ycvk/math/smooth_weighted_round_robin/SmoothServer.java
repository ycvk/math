package me.ycvk.math.smooth_weighted_round_robin;

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
public class SmoothServer {
    private String ip;

    private int weight;

    private int curWeight;

    public SmoothServer(String ip, int weight, int curWeight) {
        this.ip = ip;
        this.weight = weight;
        this.curWeight = curWeight;
    }
}
