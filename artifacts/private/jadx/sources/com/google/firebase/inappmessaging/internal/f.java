package com.google.firebase.inappmessaging.internal;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @com.google.common.annotations.e
    static final String f122623d = "Too many contextual triggers defined - limiting to 50";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.analytics.connector.a f122624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.reactivex.flowables.a<String> f122625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.firebase.analytics.connector.a.InterfaceC1123a f122626c;

    private class a implements io.reactivex.o<String> {
        a() {
        }

        @Override // io.reactivex.o
        @e.a({"InvalidDeferredApiUse"})
        public void a(io.reactivex.n<String> nVar) {
            p2.a("Subscribing to analytics events.");
            f fVar = f.this;
            fVar.f122626c = fVar.f122624a.e("fiam", new m0(nVar));
        }
    }

    public f(com.google.firebase.analytics.connector.a aVar) {
        this.f122624a = aVar;
        io.reactivex.flowables.a<String> aVarL4 = io.reactivex.l.w1(new a(), io.reactivex.b.BUFFER).L4();
        this.f122625b = aVarL4;
        aVarL4.P8();
    }

    @com.google.common.annotations.e
    static Set<String> c(com.google.internal.firebase.inappmessaging.v1.sdkserving.i iVar) {
        HashSet hashSet = new HashSet();
        Iterator<com.google.internal.firebase.inappmessaging.v1.a.f> it = iVar.hg().iterator();
        while (it.hasNext()) {
            for (com.google.firebase.inappmessaging.f.u uVar : it.next().uj()) {
                if (!TextUtils.isEmpty(uVar.getEvent().getName())) {
                    hashSet.add(uVar.getEvent().getName());
                }
            }
        }
        if (hashSet.size() > 50) {
            p2.c(f122623d);
        }
        return hashSet;
    }

    public io.reactivex.flowables.a<String> d() {
        return this.f122625b;
    }

    @fj.h
    public com.google.firebase.analytics.connector.a.InterfaceC1123a e() {
        return this.f122626c;
    }

    public void f(com.google.internal.firebase.inappmessaging.v1.sdkserving.i iVar) {
        Set<String> setC = c(iVar);
        p2.a("Updating contextual triggers for the following analytics events: " + setC);
        this.f122626c.c(setC);
    }
}
