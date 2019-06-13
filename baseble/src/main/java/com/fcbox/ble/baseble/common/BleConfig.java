package com.fcbox.ble.baseble.common;

import static com.fcbox.ble.baseble.common.BleConstant.DEFAULT_CONN_TIME;
import static com.fcbox.ble.baseble.common.BleConstant.DEFAULT_MAX_CONNECT_COUNT;
import static com.fcbox.ble.baseble.common.BleConstant.DEFAULT_OPERATE_TIME;
import static com.fcbox.ble.baseble.common.BleConstant.DEFAULT_RETRY_COUNT;
import static com.fcbox.ble.baseble.common.BleConstant.DEFAULT_RETRY_INTERVAL;
import static com.fcbox.ble.baseble.common.BleConstant.DEFAULT_SCAN_REPEAT_INTERVAL;
import static com.fcbox.ble.baseble.common.BleConstant.DEFAULT_SCAN_TIME;


/**
 * 蓝牙通信相关配置
 */
@SuppressWarnings("unused")
public class BleConfig {
    private static final String TAG = "[FcBox-ble]";
    private static BleConfig instance;

    private int scanTimeout = DEFAULT_SCAN_TIME;//扫描超时时间（毫秒）
    private int connectTimeout = DEFAULT_CONN_TIME;//连接超时时间（毫秒）
    private int operateTimeout = DEFAULT_OPERATE_TIME;//数据操作超时时间（毫秒）
    private int connectRetryCount = DEFAULT_RETRY_COUNT;//连接重试次数
    private int connectRetryInterval = DEFAULT_RETRY_INTERVAL;//连接重试间隔（毫秒）
    private int operateRetryCount = DEFAULT_RETRY_COUNT;//数据操作重试次数
    private int operateRetryInterval = DEFAULT_RETRY_INTERVAL;//数据操作重试间隔时间（毫秒）
    private int maxConnectCount = DEFAULT_MAX_CONNECT_COUNT;//最大连接数量

    //yankee
    private int scanRepeatInterval = DEFAULT_SCAN_REPEAT_INTERVAL;//每隔X时间重复扫描 (毫秒)

    private BleConfig() {
    }

    public static BleConfig getInstance() {
        if (instance == null) {
            synchronized (BleConfig.class) {
                if (instance == null) {
                    instance = new BleConfig();
                }
            }
        }
        return instance;
    }

    /**
     * 获取发送数据超时时间
     *
     * @return 返回发送数据超时时间
     */
    public int getOperateTimeout() {
        return operateTimeout;
    }

    /**
     * 设置发送数据超时时间
     *
     * @param operateTimeout 发送数据超时时间
     * @return 返回FcBoxBle
     */
    public BleConfig setOperateTimeout(int operateTimeout) {
        this.operateTimeout = operateTimeout;
        return this;
    }

    /**
     * 获取连接超时时间
     *
     * @return 返回连接超时时间
     */
    public int getConnectTimeout() {
        return connectTimeout;
    }

    /**
     * 设置连接超时时间
     *
     * @param connectTimeout 连接超时时间
     * @return 返回FcBoxBle
     */
    public BleConfig setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
        return this;
    }

    /**
     * 获取扫描超时时间
     *
     * @return 返回扫描超时时间
     */
    public int getScanTimeout() {
        return scanTimeout;
    }

    /**
     * 设置扫描超时时间
     *
     * @param scanTimeout 扫描超时时间
     * @return 返回FcBoxBle
     */
    public BleConfig setScanTimeout(int scanTimeout) {
        this.scanTimeout = scanTimeout;
        return this;
    }

    /**
     * 获取连接重试次数
     *
     * @return int
     */
    public int getConnectRetryCount() {
        return connectRetryCount;
    }

    /**
     * 设置连接重试次数
     *
     * @param connectRetryCount 重试次数
     * @return BleConfig
     */
    public BleConfig setConnectRetryCount(int connectRetryCount) {
        this.connectRetryCount = connectRetryCount;
        return this;
    }

    /**
     * 获取连接重试间隔时间
     *
     * @return int
     */
    public int getConnectRetryInterval() {
        return connectRetryInterval;
    }

    /**
     * 设置连接重试间隔时间
     *
     * @param connectRetryInterval 重试间隔时间
     * @return BleConfig
     */
    public BleConfig setConnectRetryInterval(int connectRetryInterval) {
        this.connectRetryInterval = connectRetryInterval;
        return this;
    }

    /**
     * 获取最大连接数量
     *
     * @return int
     */
    public int getMaxConnectCount() {
        return maxConnectCount;
    }

    /**
     * 设置最大连接数量
     *
     * @param maxConnectCount  最大连接数量
     * @return BleConfig
     */
    public BleConfig setMaxConnectCount(int maxConnectCount) {
        this.maxConnectCount = maxConnectCount;
        return this;
    }

    /**
     * 获取操作数据重试次数
     *
     * @return int
     */
    public int getOperateRetryCount() {
        return operateRetryCount;
    }

    /**
     * 设置操作数据重试次数
     *
     * @param operateRetryCount 重试次数
     * @return BleConfig
     */
    public BleConfig setOperateRetryCount(int operateRetryCount) {
        this.operateRetryCount = operateRetryCount;
        return this;
    }

    /**
     * 获取操作数据重试间隔时间
     *
     * @return int
     */
    public int getOperateRetryInterval() {
        return operateRetryInterval;
    }

    /**
     * 设置操作数据重试间隔时间
     *
     * @param operateRetryInterval  重试间隔时间
     * @return BleConfig
     */
    public BleConfig setOperateRetryInterval(int operateRetryInterval) {
        this.operateRetryInterval = operateRetryInterval;
        return this;
    }

    /**
     * 获取扫描间隔时间
     * @return int
     */
    public int getScanRepeatInterval() {
        return scanRepeatInterval;
    }

    /**
     * 设置每隔多少时间重复扫描一次
     * 设置扫描间隔时间 （毫秒）
     * @param scanRepeatInterval 扫描间隔时间
     * @return BleConfig
     */
    public BleConfig setScanRepeatInterval(int scanRepeatInterval) {
        this.scanRepeatInterval = scanRepeatInterval;
        return this;
    }
}
