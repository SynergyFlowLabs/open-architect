package com.google.android.datatransport.runtime.firebase.transport;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f103552c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f103553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f103554b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f103555a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f103556b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f103555a, this.f103556b);
        }

        public a b(long j10) {
            this.f103555a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f103556b = bVar;
            return this;
        }
    }

    public enum b implements com.google.firebase.encoders.proto.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f103565a;

        static {
            int i10 = 1 << 2;
            int i11 = 1 << 4;
        }

        b(int i10) {
            this.f103565a = i10;
        }

        @Override // com.google.firebase.encoders.proto.c
        public int i() {
            return this.f103565a;
        }
    }

    c(long j10, b bVar) {
        this.f103553a = j10;
        this.f103554b = bVar;
    }

    public static c a() {
        return f103552c;
    }

    public static a d() {
        return new a();
    }

    @com.google.firebase.encoders.proto.d(tag = 1)
    public long b() {
        return this.f103553a;
    }

    @com.google.firebase.encoders.proto.d(tag = 3)
    public b c() {
        return this.f103554b;
    }
}
