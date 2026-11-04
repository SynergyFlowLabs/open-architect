package com.google.android.datatransport.runtime.firebase.transport;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e f103571c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f103572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103573b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f103574a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f103575b = 0;

        a() {
        }

        public e a() {
            return new e(this.f103574a, this.f103575b);
        }

        public a b(long j10) {
            this.f103574a = j10;
            return this;
        }

        public a c(long j10) {
            this.f103575b = j10;
            return this;
        }
    }

    e(long j10, long j11) {
        this.f103572a = j10;
        this.f103573b = j11;
    }

    public static e b() {
        return f103571c;
    }

    public static a d() {
        return new a();
    }

    @com.google.firebase.encoders.proto.d(tag = 1)
    public long a() {
        return this.f103572a;
    }

    @com.google.firebase.encoders.proto.d(tag = 2)
    public long c() {
        return this.f103573b;
    }
}
