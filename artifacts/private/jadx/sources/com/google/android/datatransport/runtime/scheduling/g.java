package com.google.android.datatransport.runtime.scheduling;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.datatransport.runtime.dagger.internal.f({"com.google.android.datatransport.runtime.time.WallTime"})
@com.google.android.datatransport.runtime.dagger.internal.g
@com.google.android.datatransport.runtime.dagger.internal.a
public final class g implements com.google.android.datatransport.runtime.dagger.internal.c<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.google.android.datatransport.runtime.time.a> f103609a;

    public g(ij.c<com.google.android.datatransport.runtime.time.a> cVar) {
        this.f103609a = cVar;
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.g a(com.google.android.datatransport.runtime.time.a aVar) {
        return (com.google.android.datatransport.runtime.scheduling.jobscheduling.g) com.google.android.datatransport.runtime.dagger.internal.e.f(f.a(aVar));
    }

    public static g b(ij.c<com.google.android.datatransport.runtime.time.a> cVar) {
        return new g(cVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.g get() {
        return a(this.f103609a.get());
    }
}
