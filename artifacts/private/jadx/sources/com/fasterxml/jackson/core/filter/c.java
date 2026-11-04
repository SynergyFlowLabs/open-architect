package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.k;

/* JADX INFO: loaded from: classes4.dex */
public class c extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final k f102344b;

    public c(String str) {
        this(k.j(str));
    }

    @Override // com.fasterxml.jackson.core.filter.d
    protected boolean a() {
        return this.f102344b.r();
    }

    @Override // com.fasterxml.jackson.core.filter.d
    public d d() {
        return this;
    }

    @Override // com.fasterxml.jackson.core.filter.d
    public d e() {
        return this;
    }

    @Override // com.fasterxml.jackson.core.filter.d
    public d h(int i10) {
        k kVarP = this.f102344b.p(i10);
        if (kVarP == null) {
            return null;
        }
        return kVarP.r() ? d.f102345a : new c(kVarP);
    }

    @Override // com.fasterxml.jackson.core.filter.d
    public d q(String str) {
        k kVarQ = this.f102344b.q(str);
        if (kVarQ == null) {
            return null;
        }
        return kVarQ.r() ? d.f102345a : new c(kVarQ);
    }

    @Override // com.fasterxml.jackson.core.filter.d
    public String toString() {
        return "[JsonPointerFilter at: " + this.f102344b + "]";
    }

    public c(k kVar) {
        this.f102344b = kVar;
    }
}
