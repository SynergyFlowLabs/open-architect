package com.devtodev.core.data.metrics.simple;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import com.devtodev.core.data.metrics.Metric;
import com.devtodev.core.utils.DeviceUtils;
import com.devtodev.core.utils.e;
import com.devtodev.core.utils.f;
import com.devtodev.core.utils.h;
import com.devtodev.core.utils.log.CoreLog;
import d.b;

/* JADX INFO: loaded from: classes3.dex */
public final class DeviceInfo extends Metric {
    private static final long serialVersionUID = 3;

    class a implements f {
        a() {
        }

        @Override // com.devtodev.core.utils.f
        public void a(String str, boolean z10) {
            if (str != null && !str.equals("")) {
                DeviceInfo.this.addParameter("advertisingId", str);
            }
            DeviceInfo.this.addParameter("isLimitAdTrackingEnabled", Boolean.valueOf(z10));
        }
    }

    public DeviceInfo(Context context, String str) {
        super("Device Info", "di");
        addParameter("advertisingId", str);
        d(context);
    }

    private void a() {
        try {
            addParameter("isRooted", Integer.valueOf(h.d() ? 1 : 0));
        } catch (Exception e10) {
            CoreLog.e("DevToDev", String.format("Get is device rooted failed, message %s", e10.getMessage()), e10);
        }
    }

    private void b() {
        try {
            String serialId = DeviceUtils.getSerialId();
            if (serialId != null) {
                addParameter("serialId", serialId);
            }
        } catch (Exception e10) {
            CoreLog.e("DevToDev", String.format("Get serial number failed, message %s", e10.getMessage()), e10);
        }
    }

    private void c(Context context) {
        try {
            String strB = e.b(context);
            if (strB == null || strB.equals("")) {
                return;
            }
            addParameter("imei", strB);
        } catch (Exception e10) {
            CoreLog.e("DevToDev", String.format("Get IMEI failed, message %s", e10.getMessage()), e10);
        }
    }

    private void d(Context context) {
        b();
        addParameter("deviceVersion", Build.VERSION.RELEASE);
        b(context);
        addParameter("deviceOS", "Android");
        a();
        e(context);
        c(context);
        a(context);
        addParameter("manufacturer", DeviceUtils.getManufacturer());
        addParameter("model", DeviceUtils.getModel());
        addParameter("timeZoneOffset", Integer.valueOf(DeviceUtils.getTimeZoneOffset()));
    }

    private void e(Context context) {
        try {
            String strC = e.c(context);
            if (strC.equals("")) {
                return;
            }
            addParameter("macWifi", strC);
        } catch (Exception e10) {
            CoreLog.e("DevToDev", String.format("Get mac address failed, message %s", e10.getMessage()), e10);
        }
    }

    private void a(Context context) {
        try {
            addParameter("androidId", DeviceUtils.getAndroidID(context));
        } catch (Exception e10) {
            CoreLog.e("DevToDev", String.format("Get ID failed, message %s", e10.getMessage()), e10);
        }
        try {
            addParameter("odin", b.a(context));
        } catch (Exception e11) {
            CoreLog.e("DevToDev", String.format("Get ID failed, message %s", e11.getMessage()), e11);
        }
        try {
            addParameter("d2dUdid", d.a.a(context));
        } catch (Exception e12) {
            CoreLog.e("DevToDev", String.format("Get ID failed, message %s", e12.getMessage()), e12);
        }
    }

    public DeviceInfo(Context context) {
        super("Device Info", "di");
        DeviceUtils.getAdvertiserID(context, new a());
        d(context);
    }

    private void b(Context context) {
        try {
            Point screenResolutionSorted = DeviceUtils.getScreenResolutionSorted(context);
            addParameter("screenResolution", screenResolutionSorted.x + "x" + screenResolutionSorted.y);
        } catch (Exception e10) {
            CoreLog.e("DevToDev", String.format("Get device resolution failed, message %s", e10.getMessage()), e10);
        }
        try {
            addParameter("screenDpi", Integer.valueOf(DeviceUtils.getScreenDpi(context)));
        } catch (Exception e11) {
            CoreLog.e("DevToDev", String.format("Get device resolution failed, message %s", e11.getMessage()), e11);
        }
        try {
            addParameter("inch", Double.valueOf(DeviceUtils.getScreenInches(context)));
        } catch (Exception e12) {
            CoreLog.e("DevToDev", String.format("Get device resolution failed, message %s", e12.getMessage()), e12);
        }
    }
}
