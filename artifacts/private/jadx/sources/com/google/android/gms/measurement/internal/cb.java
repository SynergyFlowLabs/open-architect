package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes4.dex */
public enum cb {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f109857a;

    cb(int i10) {
        this.f109857a = i10;
    }

    public static cb b(int i10) {
        for (cb cbVar : values()) {
            if (cbVar.f109857a == i10) {
                return cbVar;
            }
        }
        return UNKNOWN;
    }

    public final int a() {
        return this.f109857a;
    }
}
