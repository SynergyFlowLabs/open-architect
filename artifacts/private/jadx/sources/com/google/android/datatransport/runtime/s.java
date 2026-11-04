package com.google.android.datatransport.runtime;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class s implements com.google.android.datatransport.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<com.google.android.datatransport.e> f103588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f103589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v f103590c;

    s(Set<com.google.android.datatransport.e> set, r rVar, v vVar) {
        this.f103588a = set;
        this.f103589b = rVar;
        this.f103590c = vVar;
    }

    @Override // com.google.android.datatransport.m
    public <T> com.google.android.datatransport.l<T> a(String str, Class<T> cls, com.google.android.datatransport.k<T, byte[]> kVar) {
        return b(str, cls, com.google.android.datatransport.e.b("proto"), kVar);
    }

    @Override // com.google.android.datatransport.m
    public <T> com.google.android.datatransport.l<T> b(String str, Class<T> cls, com.google.android.datatransport.e eVar, com.google.android.datatransport.k<T, byte[]> kVar) {
        if (this.f103588a.contains(eVar)) {
            return new u(this.f103589b, str, eVar, kVar, this.f103590c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", eVar, this.f103588a));
    }
}
