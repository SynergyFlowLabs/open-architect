package com.google.firebase.remoteconfig.internal;

/* JADX INFO: loaded from: classes5.dex */
public class x implements com.google.firebase.remoteconfig.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f124689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f124690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.x f124691c;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f124692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f124693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.google.firebase.remoteconfig.x f124694c;

        public x a() {
            return new x(this.f124692a, this.f124693b, this.f124694c);
        }

        b b(com.google.firebase.remoteconfig.x xVar) {
            this.f124694c = xVar;
            return this;
        }

        b c(int i10) {
            this.f124693b = i10;
            return this;
        }

        public b d(long j10) {
            this.f124692a = j10;
            return this;
        }

        private b() {
        }
    }

    static b d() {
        return new b();
    }

    @Override // com.google.firebase.remoteconfig.v
    public long a() {
        return this.f124689a;
    }

    @Override // com.google.firebase.remoteconfig.v
    public com.google.firebase.remoteconfig.x b() {
        return this.f124691c;
    }

    @Override // com.google.firebase.remoteconfig.v
    public int c() {
        return this.f124690b;
    }

    private x(long j10, int i10, com.google.firebase.remoteconfig.x xVar) {
        this.f124689a = j10;
        this.f124690b = i10;
        this.f124691c = xVar;
    }
}
