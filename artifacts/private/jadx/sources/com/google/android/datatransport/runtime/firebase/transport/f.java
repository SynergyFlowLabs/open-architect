package com.google.android.datatransport.runtime.firebase.transport;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f103576c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f103577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103578b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f103579a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f103580b = 0;

        a() {
        }

        public f a() {
            return new f(this.f103579a, this.f103580b);
        }

        public a b(long j10) {
            this.f103580b = j10;
            return this;
        }

        public a c(long j10) {
            this.f103579a = j10;
            return this;
        }
    }

    f(long j10, long j11) {
        this.f103577a = j10;
        this.f103578b = j11;
    }

    public static f a() {
        return f103576c;
    }

    public static a d() {
        return new a();
    }

    @com.google.firebase.encoders.proto.d(tag = 2)
    public long b() {
        return this.f103578b;
    }

    @com.google.firebase.encoders.proto.d(tag = 1)
    public long c() {
        return this.f103577a;
    }
}
