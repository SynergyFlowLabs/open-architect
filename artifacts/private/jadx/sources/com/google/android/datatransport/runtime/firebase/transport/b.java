package com.google.android.datatransport.runtime.firebase.transport;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f103549b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f103550a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f103551a = null;

        a() {
        }

        public b a() {
            return new b(this.f103551a);
        }

        public a b(e eVar) {
            this.f103551a = eVar;
            return this;
        }
    }

    b(e eVar) {
        this.f103550a = eVar;
    }

    public static b a() {
        return f103549b;
    }

    public static a d() {
        return new a();
    }

    @k8.a.b
    public e b() {
        e eVar = this.f103550a;
        return eVar == null ? e.b() : eVar;
    }

    @com.google.firebase.encoders.proto.d(tag = 1)
    @k8.a.InterfaceC2244a(name = "storageMetrics")
    public e c() {
        return this.f103550a;
    }
}
