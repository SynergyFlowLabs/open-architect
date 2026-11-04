package com.google.android.gms.location;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.gms.common.internal.a0
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f109694a = Long.MIN_VALUE;

    public final x a(long j10) {
        com.google.android.gms.common.internal.w.b(j10 >= 0, "intervalMillis can't be negative.");
        this.f109694a = j10;
        return this;
    }

    public final zzb b() {
        com.google.android.gms.common.internal.w.y(this.f109694a != Long.MIN_VALUE, "Must set intervalMillis.");
        return new zzb(this.f109694a, true, null, null, null, false, null, 0L, null);
    }
}
