package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.r;
import java.io.IOException;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class k implements r, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f102827c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f102828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected m f102829b;

    public k() {
        this(r.K1.toString());
    }

    @Override // com.fasterxml.jackson.core.r
    public void a(com.fasterxml.jackson.core.h hVar) throws IOException {
        String str = this.f102828a;
        if (str != null) {
            hVar.G2(str);
        }
    }

    @Override // com.fasterxml.jackson.core.r
    public void b(com.fasterxml.jackson.core.h hVar) throws IOException {
        hVar.D2(this.f102829b.b());
    }

    @Override // com.fasterxml.jackson.core.r
    public void c(com.fasterxml.jackson.core.h hVar) throws IOException {
    }

    @Override // com.fasterxml.jackson.core.r
    public void d(com.fasterxml.jackson.core.h hVar, int i10) throws IOException {
        hVar.D2(AbstractJsonLexerKt.END_LIST);
    }

    @Override // com.fasterxml.jackson.core.r
    public void e(com.fasterxml.jackson.core.h hVar) throws IOException {
        hVar.D2(this.f102829b.d());
    }

    @Override // com.fasterxml.jackson.core.r
    public void f(com.fasterxml.jackson.core.h hVar) throws IOException {
        hVar.D2(AbstractJsonLexerKt.BEGIN_LIST);
    }

    @Override // com.fasterxml.jackson.core.r
    public void g(com.fasterxml.jackson.core.h hVar) throws IOException {
        hVar.D2(AbstractJsonLexerKt.BEGIN_OBJ);
    }

    @Override // com.fasterxml.jackson.core.r
    public void h(com.fasterxml.jackson.core.h hVar) throws IOException {
    }

    @Override // com.fasterxml.jackson.core.r
    public void i(com.fasterxml.jackson.core.h hVar) throws IOException {
        hVar.D2(this.f102829b.c());
    }

    public void j(String str) {
        this.f102828a = str;
    }

    @Override // com.fasterxml.jackson.core.r
    public void k(com.fasterxml.jackson.core.h hVar, int i10) throws IOException {
        hVar.D2(AbstractJsonLexerKt.END_OBJ);
    }

    public k l(m mVar) {
        this.f102829b = mVar;
        return this;
    }

    public k(String str) {
        this.f102828a = str;
        this.f102829b = r.J1;
    }
}
