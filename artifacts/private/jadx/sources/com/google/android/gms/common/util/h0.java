package com.google.android.gms.common.util;

import android.os.StrictMode;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 {
    public static StrictMode.VmPolicy a() {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (v.r()) {
            StrictMode.setVmPolicy(g0.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        return vmPolicy;
    }
}
