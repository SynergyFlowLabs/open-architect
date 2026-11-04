package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class s8 extends Exception {
    public s8() {
    }

    public s8(String str) {
        super(str);
    }

    public s8(String str, Throwable th2) {
        super("ContentProvider query failed", th2);
    }
}
