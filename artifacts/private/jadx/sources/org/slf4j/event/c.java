package org.slf4j.event;

import java.util.Queue;
import org.slf4j.h;
import org.slf4j.helpers.r;

/* JADX INFO: loaded from: classes14.dex */
public class c extends org.slf4j.helpers.g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f339585g = -176083308134819629L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final boolean f339586h = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f339587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    r f339588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Queue<g> f339589f;

    public c(r rVar, Queue<g> queue) {
        this.f339588e = rVar;
        this.f339587d = rVar.getName();
        this.f339589f = queue;
    }

    @Override // org.slf4j.c
    public boolean M() {
        return true;
    }

    @Override // org.slf4j.c
    public boolean O() {
        return true;
    }

    @Override // org.slf4j.c
    public boolean R() {
        return true;
    }

    @Override // org.slf4j.helpers.a, org.slf4j.c
    public String getName() {
        return this.f339587d;
    }

    @Override // org.slf4j.c
    public boolean l() {
        return true;
    }

    @Override // org.slf4j.helpers.a
    protected String r0() {
        return null;
    }

    @Override // org.slf4j.helpers.a
    protected void u0(e eVar, h hVar, String str, Object[] objArr, Throwable th2) {
        g gVar = new g();
        gVar.t(System.currentTimeMillis());
        gVar.n(eVar);
        gVar.o(this.f339588e);
        gVar.p(this.f339587d);
        if (hVar != null) {
            gVar.k(hVar);
        }
        gVar.q(str);
        gVar.r(Thread.currentThread().getName());
        gVar.m(objArr);
        gVar.s(th2);
        this.f339589f.add(gVar);
    }

    @Override // org.slf4j.c
    public boolean z() {
        return true;
    }
}
