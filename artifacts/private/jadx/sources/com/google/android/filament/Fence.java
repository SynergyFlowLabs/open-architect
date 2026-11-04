package com.google.android.filament;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class Fence {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f103923b = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f103924a;

    public enum a {
        ERROR,
        CONDITION_SATISFIED,
        TIMEOUT_EXPIRED
    }

    public enum b {
        FLUSH,
        DONT_FLUSH
    }

    Fence(long j10) {
        this.f103924a = j10;
    }

    public static a d(@NonNull Fence fence, @NonNull b bVar) {
        int iNWaitAndDestroy = nWaitAndDestroy(fence.b(), bVar.ordinal());
        if (iNWaitAndDestroy != -1 && iNWaitAndDestroy == 0) {
            return a.CONDITION_SATISFIED;
        }
        return a.ERROR;
    }

    private static native int nWait(long j10, int i10, long j11);

    private static native int nWaitAndDestroy(long j10, int i10);

    void a() {
        this.f103924a = 0L;
    }

    public long b() {
        long j10 = this.f103924a;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed Fence");
    }

    public a c(@NonNull b bVar, long j10) {
        int iNWait = nWait(b(), bVar.ordinal(), j10);
        if (iNWait == -1) {
            return a.ERROR;
        }
        if (iNWait != 0) {
            return iNWait != 1 ? a.ERROR : a.TIMEOUT_EXPIRED;
        }
        return a.CONDITION_SATISFIED;
    }
}
