package com.google.vr.ndk.base;

import android.os.Trace;

/* JADX INFO: loaded from: classes5.dex */
class l0 {
    l0() {
    }

    static void a(String str) {
        Trace.beginSection(str);
    }

    static void b() {
        Trace.endSection();
    }
}
