package com.google.android.play.core.appupdate.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f114837c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile g f114838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f114839b = f114837c;

    private e(g gVar) {
        this.f114838a = gVar;
    }

    public static g b(g gVar) {
        gVar.getClass();
        return gVar instanceof e ? gVar : new e(gVar);
    }

    @Override // com.google.android.play.core.appupdate.internal.g
    public final Object a() {
        Object objA;
        Object obj = this.f114839b;
        Object obj2 = f114837c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.f114839b;
                if (objA == obj2) {
                    objA = this.f114838a.a();
                    Object obj3 = this.f114839b;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f114839b = objA;
                    this.f114838a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objA;
    }
}
