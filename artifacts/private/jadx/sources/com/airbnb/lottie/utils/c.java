package com.airbnb.lottie.utils;

import com.airbnb.lottie.z0;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class c implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f88831a = new HashSet();

    @Override // com.airbnb.lottie.z0
    public void b(String str) {
        h(str, null);
    }

    @Override // com.airbnb.lottie.z0
    public void c(String str, Throwable th2) {
        boolean z10 = com.airbnb.lottie.f.f88209a;
    }

    @Override // com.airbnb.lottie.z0
    public void d(String str, Throwable th2) {
        boolean z10 = com.airbnb.lottie.f.f88209a;
    }

    @Override // com.airbnb.lottie.z0
    public void g(String str) {
        d(str, null);
    }

    @Override // com.airbnb.lottie.z0
    public void h(String str, Throwable th2) {
        Set<String> set = f88831a;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
    }
}
