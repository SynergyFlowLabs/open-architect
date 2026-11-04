package org.locationtech.jts.algorithm;

/* JADX INFO: loaded from: classes14.dex */
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f337983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f337984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f337985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f337986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f337987e;

    public static class a implements c {
        @Override // org.locationtech.jts.algorithm.c
        public boolean a(int i10) {
            return i10 > 0;
        }
    }

    public static class b implements c {
        @Override // org.locationtech.jts.algorithm.c
        public boolean a(int i10) {
            return i10 % 2 == 1;
        }
    }

    /* JADX INFO: renamed from: org.locationtech.jts.algorithm.c$c, reason: collision with other inner class name */
    public static class C2420c implements c {
        @Override // org.locationtech.jts.algorithm.c
        public boolean a(int i10) {
            return i10 == 1;
        }
    }

    public static class d implements c {
        @Override // org.locationtech.jts.algorithm.c
        public boolean a(int i10) {
            return i10 > 1;
        }
    }

    static {
        b bVar = new b();
        f337983a = bVar;
        f337984b = new a();
        f337985c = new d();
        f337986d = new C2420c();
        f337987e = bVar;
    }

    boolean a(int i10);
}
