package com.google.vr.ndk.base;

/* JADX INFO: loaded from: classes5.dex */
public class m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f127186b = "m0";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f127187a;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f127188a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f127189b = 1;
    }

    m0(long j10) {
        this.f127187a = j10;
    }

    public int a() {
        return GvrApi.nativeUserPrefsGetControllerHandedness(this.f127187a);
    }
}
