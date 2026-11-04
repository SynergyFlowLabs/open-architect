package com.google.android.datatransport.runtime;

/* JADX INFO: loaded from: classes4.dex */
final class u<T> implements com.google.android.datatransport.l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f103810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f103811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.e f103812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.k<T, byte[]> f103813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v f103814e;

    u(r rVar, String str, com.google.android.datatransport.e eVar, com.google.android.datatransport.k<T, byte[]> kVar, v vVar) {
        this.f103810a = rVar;
        this.f103811b = str;
        this.f103812c = eVar;
        this.f103813d = kVar;
        this.f103814e = vVar;
    }

    public static /* synthetic */ void c(Exception exc) {
    }

    @Override // com.google.android.datatransport.l
    public void a(com.google.android.datatransport.f<T> fVar, com.google.android.datatransport.n nVar) {
        this.f103814e.a(q.a().f(this.f103810a).c(fVar).g(this.f103811b).e(this.f103813d).b(this.f103812c).a(), nVar);
    }

    @Override // com.google.android.datatransport.l
    public void b(com.google.android.datatransport.f<T> fVar) {
        a(fVar, new com.google.android.datatransport.n() { // from class: com.google.android.datatransport.runtime.t
            @Override // com.google.android.datatransport.n
            public final void a(Exception exc) {
                u.c(exc);
            }
        });
    }

    r d() {
        return this.f103810a;
    }
}
