package org.slf4j.event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.h;
import org.slf4j.helpers.r;

/* JADX INFO: loaded from: classes14.dex */
public class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    e f339600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    List<h> f339601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f339602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    r f339603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f339604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f339605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object[] f339606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    List<d> f339607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f339608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Throwable f339609j;

    @Override // org.slf4j.event.f
    public String Q() {
        return this.f339605f;
    }

    @Override // org.slf4j.event.f
    public Object[] a() {
        return this.f339606g;
    }

    @Override // org.slf4j.event.f
    public Throwable b() {
        return this.f339609j;
    }

    @Override // org.slf4j.event.f
    public List<Object> d() {
        Object[] objArr = this.f339606g;
        if (objArr == null) {
            return null;
        }
        return Arrays.asList(objArr);
    }

    @Override // org.slf4j.event.f
    public List<h> e() {
        return this.f339601b;
    }

    @Override // org.slf4j.event.f
    public String f() {
        return this.f339604e;
    }

    @Override // org.slf4j.event.f
    public e g() {
        return this.f339600a;
    }

    @Override // org.slf4j.event.f
    public List<d> h() {
        return this.f339607h;
    }

    @Override // org.slf4j.event.f
    public long i() {
        return this.f339608i;
    }

    @Override // org.slf4j.event.f
    public String j() {
        return this.f339602c;
    }

    public void k(h hVar) {
        if (hVar == null) {
            return;
        }
        if (this.f339601b == null) {
            this.f339601b = new ArrayList(2);
        }
        this.f339601b.add(hVar);
    }

    public r l() {
        return this.f339603d;
    }

    public void m(Object[] objArr) {
        this.f339606g = objArr;
    }

    public void n(e eVar) {
        this.f339600a = eVar;
    }

    public void o(r rVar) {
        this.f339603d = rVar;
    }

    public void p(String str) {
        this.f339602c = str;
    }

    public void q(String str) {
        this.f339605f = str;
    }

    public void r(String str) {
        this.f339604e = str;
    }

    public void s(Throwable th2) {
        this.f339609j = th2;
    }

    public void t(long j10) {
        this.f339608i = j10;
    }
}
