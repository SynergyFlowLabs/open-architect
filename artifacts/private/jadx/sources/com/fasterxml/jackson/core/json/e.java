package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.m;

/* JADX INFO: loaded from: classes4.dex */
public class e extends m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f102553l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f102554m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f102555n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f102556o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f102557p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f102558q = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final e f102559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected b f102560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected e f102561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected String f102562i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected Object f102563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f102564k;

    protected e(int i10, e eVar, b bVar) {
        this.f102647a = i10;
        this.f102559f = eVar;
        this.f102560g = bVar;
        int i11 = 3 & (-1);
        this.f102648b = -1;
    }

    private final void r(b bVar, String str) throws l {
        if (bVar.d(str)) {
            Object objC = bVar.c();
            throw new com.fasterxml.jackson.core.g("Duplicate field '" + str + "'", objC instanceof com.fasterxml.jackson.core.h ? (com.fasterxml.jackson.core.h) objC : null);
        }
    }

    @Deprecated
    public static e v() {
        return w(null);
    }

    public static e w(b bVar) {
        return new e(0, null, bVar);
    }

    public e A(b bVar) {
        this.f102560g = bVar;
        return this;
    }

    public int B(String str) throws l {
        if (this.f102647a != 2 || this.f102564k) {
            return 4;
        }
        this.f102564k = true;
        this.f102562i = str;
        b bVar = this.f102560g;
        if (bVar != null) {
            r(bVar, str);
        }
        return this.f102648b < 0 ? 0 : 1;
    }

    public int C() {
        int i10 = this.f102647a;
        if (i10 == 2) {
            if (!this.f102564k) {
                return 5;
            }
            this.f102564k = false;
            this.f102648b++;
            return 2;
        }
        if (i10 == 1) {
            int i11 = this.f102648b;
            this.f102648b = i11 + 1;
            return i11 < 0 ? 0 : 1;
        }
        int i12 = this.f102648b + 1;
        this.f102648b = i12;
        return i12 == 0 ? 0 : 3;
    }

    @Override // com.fasterxml.jackson.core.m
    public final String b() {
        return this.f102562i;
    }

    @Override // com.fasterxml.jackson.core.m
    public Object c() {
        return this.f102563j;
    }

    @Override // com.fasterxml.jackson.core.m
    public boolean i() {
        return this.f102562i != null;
    }

    @Override // com.fasterxml.jackson.core.m
    public void p(Object obj) {
        this.f102563j = obj;
    }

    public e s() {
        this.f102563j = null;
        return this.f102559f;
    }

    public e t() {
        e eVar = this.f102561h;
        if (eVar != null) {
            return eVar.z(1);
        }
        b bVar = this.f102560g;
        e eVar2 = new e(1, this, bVar == null ? null : bVar.a());
        this.f102561h = eVar2;
        return eVar2;
    }

    public e u() {
        e eVar = this.f102561h;
        if (eVar != null) {
            return eVar.z(2);
        }
        b bVar = this.f102560g;
        e eVar2 = new e(2, this, bVar == null ? null : bVar.a());
        this.f102561h = eVar2;
        return eVar2;
    }

    public b x() {
        return this.f102560g;
    }

    @Override // com.fasterxml.jackson.core.m
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final e e() {
        return this.f102559f;
    }

    protected e z(int i10) {
        this.f102647a = i10;
        this.f102648b = -1;
        this.f102562i = null;
        this.f102564k = false;
        this.f102563j = null;
        b bVar = this.f102560g;
        if (bVar != null) {
            bVar.e();
        }
        return this;
    }
}
