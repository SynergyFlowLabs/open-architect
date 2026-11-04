package com.appsflyer.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class AFa1nSDK extends HashMap<Integer, String> {
    private static AFa1nSDK getMonetizationNetwork;
    private final Object getRevenue = new Object();

    private AFa1nSDK() {
    }

    public static synchronized AFa1nSDK afErrorLog() {
        try {
            if (getMonetizationNetwork == null) {
                getMonetizationNetwork = new AFa1nSDK();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return getMonetizationNetwork;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    @androidx.annotation.p0
    public String put(Integer num, String str) {
        String str2;
        synchronized (this.getRevenue) {
            str2 = (String) super.put(num, str);
        }
        return str2;
    }

    @Override // java.util.HashMap, java.util.Map
    public boolean remove(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2) {
        boolean zRemove;
        synchronized (this.getRevenue) {
            try {
                zRemove = super.remove(obj, obj2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zRemove;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String remove(@androidx.annotation.p0 Object obj) {
        String str;
        synchronized (this.getRevenue) {
            try {
                str = (String) super.remove(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
