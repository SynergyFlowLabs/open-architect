package com.google.vr.ndk.base;

/* JADX INFO: loaded from: classes5.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f127065a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f127066a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f127067b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f127068c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f127069d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f127070e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f127071f = 6;

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f127072a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f127073b = 1;

        private b() {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final long f127074a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final long f127075b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final long f127076c = 4;

        private c() {
        }
    }

    f0(long j10) {
        this.f127065a = j10;
    }

    public final boolean a(int i10, n0 n0Var) {
        return GvrApi.nativeGetProperty(this.f127065a, i10, n0Var.f127191a);
    }
}
