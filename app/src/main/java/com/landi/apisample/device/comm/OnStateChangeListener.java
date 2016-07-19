package com.landi.apisample.device.comm;

import android.telephony.TelephonyManager;

public interface OnStateChangeListener {
	public static final int STATE_DISCONNECTED = TelephonyManager.DATA_DISCONNECTED;//网络断开
	public static final int STATE_DISCONNECTING =  TelephonyManager.DATA_CONNECTING;//网络正在连接
	public static final int STATE_CONNECTED =  TelephonyManager.DATA_CONNECTED;//网络连接上
	public static final int STATE_SUPENDED =  TelephonyManager.DATA_SUSPENDED;//网络挂起
	void onStateChanged(int state);
	void onStateMessageReceived(String msg);
}
