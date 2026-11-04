package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.m;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final d f102546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected b f102547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected d f102548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected String f102549i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected Object f102550j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f102551k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f102552l;

    public d(d dVar, b bVar, int i10, int i11, int i12) {
        this.f102546f = dVar;
        this.f102547g = bVar;
        this.f102647a = i10;
        this.f102551k = i11;
        this.f102552l = i12;
        this.f102648b = -1;
    }

    private void r(b bVar, String str) throws l {
        if (bVar.d(str)) {
            Object objC = bVar.c();
            throw new com.fasterxml.jackson.core.j(objC instanceof JsonParser ? (JsonParser) objC : null, "Duplicate field '" + str + "'");
        }
    }

    public static d v(int i10, int i11, b bVar) {
        return new d(null, bVar, 0, i10, i11);
    }

    public static d w(b bVar) {
        return new d(null, bVar, 0, 1, 0);
    }

    protected void A(int i10, int i11, int i12) {
        this.f102647a = i10;
        this.f102648b = -1;
        this.f102551k = i11;
        this.f102552l = i12;
        this.f102549i = null;
        this.f102550j = null;
        b bVar = this.f102547g;
        if (bVar != null) {
            bVar.e();
        }
    }

    public void B(String str) throws l {
        this.f102549i = str;
        b bVar = this.f102547g;
        if (bVar != null) {
            r(bVar, str);
        }
    }

    public d C(b bVar) {
        this.f102547g = bVar;
        return this;
    }

    @Override // com.fasterxml.jackson.core.m
    public String b() {
        return this.f102549i;
    }

    @Override // com.fasterxml.jackson.core.m
    public Object c() {
        return this.f102550j;
    }

    @Override // com.fasterxml.jackson.core.m
    public com.fasterxml.jackson.core.i f(Object obj) {
        return new com.fasterxml.jackson.core.i(obj, -1L, this.f102551k, this.f102552l);
    }

    @Override // com.fasterxml.jackson.core.m
    public boolean i() {
        return this.f102549i != null;
    }

    @Override // com.fasterxml.jackson.core.m
    public void p(Object obj) {
        this.f102550j = obj;
    }

    public d s() {
        this.f102550j = null;
        return this.f102546f;
    }

    public d t(int i10, int i11) {
        d dVar = this.f102548h;
        if (dVar != null) {
            dVar.A(1, i10, i11);
            return dVar;
        }
        b bVar = this.f102547g;
        d dVar2 = new d(this, bVar == null ? null : bVar.a(), 1, i10, i11);
        this.f102548h = dVar2;
        return dVar2;
    }

    public d u(int i10, int i11) {
        d dVar = this.f102548h;
        if (dVar != null) {
            dVar.A(2, i10, i11);
            return dVar;
        }
        b bVar = this.f102547g;
        d dVar2 = new d(this, bVar == null ? null : bVar.a(), 2, i10, i11);
        this.f102548h = dVar2;
        return dVar2;
    }

    public boolean x() {
        int i10 = this.f102648b + 1;
        this.f102648b = i10;
        return this.f102647a != 0 && i10 > 0;
    }

    public b y() {
        return this.f102547g;
    }

    @Override // com.fasterxml.jackson.core.m
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public d e() {
        return this.f102546f;
    }
}
