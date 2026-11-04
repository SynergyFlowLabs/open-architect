package org.slf4j.event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.h;

/* JADX INFO: loaded from: classes14.dex */
public class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    org.slf4j.c f339569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e f339570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f339571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    List<h> f339572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    List<Object> f339573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    List<d> f339574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Throwable f339575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f339576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f339577i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f339578j;

    public a(e eVar, org.slf4j.c cVar) {
        this.f339569a = cVar;
        this.f339570b = eVar;
    }

    private List<Object> o() {
        if (this.f339573e == null) {
            this.f339573e = new ArrayList(3);
        }
        return this.f339573e;
    }

    private List<d> p() {
        if (this.f339574f == null) {
            this.f339574f = new ArrayList(4);
        }
        return this.f339574f;
    }

    @Override // org.slf4j.event.f
    public String Q() {
        return this.f339571c;
    }

    @Override // org.slf4j.event.f
    public Object[] a() {
        List<Object> list = this.f339573e;
        if (list == null) {
            return null;
        }
        return list.toArray();
    }

    @Override // org.slf4j.event.f
    public Throwable b() {
        return this.f339575g;
    }

    @Override // org.slf4j.event.f
    public String c() {
        return this.f339578j;
    }

    @Override // org.slf4j.event.f
    public List<Object> d() {
        return this.f339573e;
    }

    @Override // org.slf4j.event.f
    public List<h> e() {
        return this.f339572d;
    }

    @Override // org.slf4j.event.f
    public String f() {
        return this.f339576h;
    }

    @Override // org.slf4j.event.f
    public e g() {
        return this.f339570b;
    }

    @Override // org.slf4j.event.f
    public List<d> h() {
        return this.f339574f;
    }

    @Override // org.slf4j.event.f
    public long i() {
        return this.f339577i;
    }

    @Override // org.slf4j.event.f
    public String j() {
        return this.f339569a.getName();
    }

    public void k(Object obj) {
        o().add(obj);
    }

    public void l(Object... objArr) {
        o().addAll(Arrays.asList(objArr));
    }

    public void m(String str, Object obj) {
        p().add(new d(str, obj));
    }

    public void n(h hVar) {
        if (this.f339572d == null) {
            this.f339572d = new ArrayList(2);
        }
        this.f339572d.add(hVar);
    }

    public void q(String str) {
        this.f339578j = str;
    }

    public void r(String str) {
        this.f339571c = str;
    }

    public void s(Throwable th2) {
        this.f339575g = th2;
    }

    public void t(long j10) {
        this.f339577i = j10;
    }
}
