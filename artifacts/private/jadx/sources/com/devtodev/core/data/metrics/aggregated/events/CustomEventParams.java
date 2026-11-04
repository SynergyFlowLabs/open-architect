package com.devtodev.core.data.metrics.aggregated.events;

import com.devtodev.core.logic.NetworkStorage;
import com.devtodev.core.logic.SDKClient;
import com.devtodev.core.utils.log.CoreLog;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomEventParams implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f98109d = "CustomEventParams";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f98110e = 20;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, Number> f98111a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, String> f98112b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, Long> f98113c = new HashMap<>();

    public CustomEventParams() {
        NetworkStorage networkStorage = SDKClient.getInstance().getNetworkStorage();
        f98110e = networkStorage == null ? 20 : networkStorage.getCustomEventParamsCount();
    }

    private void a(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                this.f98112b.put(com.devtodev.core.utils.k.a.a(str, "UTF-8"), com.devtodev.core.utils.k.a.a(str2, "UTF-8"));
            } catch (Exception e10) {
                CoreLog.e("DevToDev", "", e10);
            }
        }
    }

    private boolean e() {
        return c() < f98110e;
    }

    HashMap<String, Number> b() {
        return this.f98111a;
    }

    int c() {
        return this.f98111a.size() + this.f98112b.size() + this.f98113c.size();
    }

    HashMap<String, String> d() {
        return this.f98112b;
    }

    public void putDouble(String str, double d10) {
        if (str == null) {
            return;
        }
        if (e()) {
            a(str, Double.valueOf(d10));
            return;
        }
        CoreLog.i(f98109d, "You have exceeded the maximum number of arguments for the event. Maximum count is " + f98110e);
    }

    public void putFloat(String str, float f10) {
        if (str == null) {
            return;
        }
        if (e()) {
            a(str, Float.valueOf(f10));
            return;
        }
        CoreLog.i("DevToDev", "You have exceeded the maximum number of arguments for the event. Maximum count is " + f98110e);
    }

    public void putInteger(String str, int i10) {
        if (str == null) {
            return;
        }
        if (e()) {
            a(str, Integer.valueOf(i10));
            return;
        }
        CoreLog.i("DevToDev", "You have exceeded the maximum number of arguments for the event. Maximum count is " + f98110e);
    }

    public void putLong(String str, long j10) {
        if (str == null) {
            return;
        }
        if (e()) {
            a(str, Long.valueOf(j10));
            return;
        }
        CoreLog.i("DevToDev", "You have exceeded the maximum number of arguments for the event. Maximum count is " + f98110e);
    }

    public void putString(String str, String str2) {
        if (str == null) {
            return;
        }
        if (e()) {
            a(str, str2);
            return;
        }
        CoreLog.i("DevToDev", "You have exceeded the maximum number of arguments for the event. Maximum count is " + f98110e);
    }

    private void a(String str, Number number) {
        if (str == null || number == null) {
            return;
        }
        try {
            this.f98111a.put(com.devtodev.core.utils.k.a.a(str, "UTF-8"), number);
        } catch (Exception e10) {
            CoreLog.e("DevToDev", "", e10);
        }
    }

    HashMap<String, Long> a() {
        return this.f98113c;
    }
}
