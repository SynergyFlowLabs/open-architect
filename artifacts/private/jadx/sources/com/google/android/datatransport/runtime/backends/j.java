package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f103484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f103485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f103486c;

    @ij.a
    j(Context context, @com.google.android.datatransport.runtime.time.h com.google.android.datatransport.runtime.time.a aVar, @com.google.android.datatransport.runtime.time.b com.google.android.datatransport.runtime.time.a aVar2) {
        this.f103484a = context;
        this.f103485b = aVar;
        this.f103486c = aVar2;
    }

    i a(String str) {
        return i.b(this.f103484a, this.f103485b, this.f103486c, str);
    }
}
