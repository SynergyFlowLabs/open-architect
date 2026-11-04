package com.google.vr.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import androidx.media3.extractor.m0;

/* JADX INFO: loaded from: classes5.dex */
@s9.a
public class DeviceInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f126757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f126758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BroadcastReceiver f126759c = new a();

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.HEADSET_PLUG")) {
                int intExtra = intent.getIntExtra("state", -1);
                if (intExtra == 0) {
                    DeviceInfo deviceInfo = DeviceInfo.this;
                    deviceInfo.nativeUpdateHeadphoneStateChange(deviceInfo.f126757a, 2);
                } else if (intExtra != 1) {
                    DeviceInfo deviceInfo2 = DeviceInfo.this;
                    deviceInfo2.nativeUpdateHeadphoneStateChange(deviceInfo2.f126757a, 0);
                } else {
                    DeviceInfo deviceInfo3 = DeviceInfo.this;
                    deviceInfo3.nativeUpdateHeadphoneStateChange(deviceInfo3.f126757a, 1);
                }
            }
        }
    }

    private DeviceInfo(long j10, Context context) {
        this.f126757a = j10;
        this.f126758b = context;
    }

    @s9.a
    private static DeviceInfo c(long j10, Context context) {
        return new DeviceInfo(j10, context);
    }

    @s9.a
    private int d() {
        String property = ((AudioManager) this.f126758b.getSystemService("audio")).getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property == null) {
            return 256;
        }
        return Integer.parseInt(property);
    }

    @s9.a
    private int e() {
        String property = ((AudioManager) this.f126758b.getSystemService("audio")).getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        return property == null ? m0.f67467a : Integer.parseInt(property);
    }

    @s9.a
    private boolean f() {
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) this.f126758b.getSystemService("audio")).getDevices(2)) {
            if (audioDeviceInfo.getType() == 8) {
                return true;
            }
        }
        return false;
    }

    @s9.a
    private boolean g() {
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) this.f126758b.getSystemService("audio")).getDevices(2)) {
            if (audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 22) {
                return true;
            }
        }
        return false;
    }

    @s9.a
    private void h() {
        this.f126758b.registerReceiver(this.f126759c, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    @s9.a
    private void i() {
        this.f126758b.unregisterReceiver(this.f126759c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUpdateHeadphoneStateChange(long j10, int i10);
}
