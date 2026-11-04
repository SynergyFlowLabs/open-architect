package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.s;
import java.io.IOException;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class e implements r, f<e>, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f102805h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.fasterxml.jackson.core.io.m f102806i = new com.fasterxml.jackson.core.io.m(" ");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected b f102807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected b f102808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final s f102809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f102810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected transient int f102811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected m f102812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f102813g;

    public static class a extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f102814b = new a();

        @Override // com.fasterxml.jackson.core.util.e.c, com.fasterxml.jackson.core.util.e.b
        public void a(com.fasterxml.jackson.core.h hVar, int i10) throws IOException {
            hVar.D2(' ');
        }

        @Override // com.fasterxml.jackson.core.util.e.c, com.fasterxml.jackson.core.util.e.b
        public boolean isInline() {
            return true;
        }
    }

    public interface b {
        void a(com.fasterxml.jackson.core.h hVar, int i10) throws IOException;

        boolean isInline();
    }

    public static class c implements b, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f102815a = new c();

        @Override // com.fasterxml.jackson.core.util.e.b
        public void a(com.fasterxml.jackson.core.h hVar, int i10) throws IOException {
        }

        @Override // com.fasterxml.jackson.core.util.e.b
        public boolean isInline() {
            return true;
        }
    }

    public e() {
        this(f102806i);
    }

    @Override // com.fasterxml.jackson.core.r
    public void a(com.fasterxml.jackson.core.h hVar) throws IOException {
        s sVar = this.f102809c;
        if (sVar != null) {
            hVar.E2(sVar);
        }
    }

    @Override // com.fasterxml.jackson.core.r
    public void b(com.fasterxml.jackson.core.h hVar) throws IOException {
        hVar.D2(this.f102812f.b());
        this.f102807a.a(hVar, this.f102811e);
    }

    @Override // com.fasterxml.jackson.core.r
    public void c(com.fasterxml.jackson.core.h hVar) throws IOException {
        this.f102808b.a(hVar, this.f102811e);
    }

    @Override // com.fasterxml.jackson.core.r
    public void d(com.fasterxml.jackson.core.h hVar, int i10) throws IOException {
        if (!this.f102807a.isInline()) {
            this.f102811e--;
        }
        if (i10 > 0) {
            this.f102807a.a(hVar, this.f102811e);
        } else {
            hVar.D2(' ');
        }
        hVar.D2(AbstractJsonLexerKt.END_LIST);
    }

    @Override // com.fasterxml.jackson.core.r
    public void e(com.fasterxml.jackson.core.h hVar) throws IOException {
        if (this.f102810d) {
            hVar.G2(this.f102813g);
        } else {
            hVar.D2(this.f102812f.d());
        }
    }

    @Override // com.fasterxml.jackson.core.r
    public void f(com.fasterxml.jackson.core.h hVar) throws IOException {
        if (!this.f102807a.isInline()) {
            this.f102811e++;
        }
        hVar.D2(AbstractJsonLexerKt.BEGIN_LIST);
    }

    @Override // com.fasterxml.jackson.core.r
    public void g(com.fasterxml.jackson.core.h hVar) throws IOException {
        hVar.D2(AbstractJsonLexerKt.BEGIN_OBJ);
        if (this.f102808b.isInline()) {
            return;
        }
        this.f102811e++;
    }

    @Override // com.fasterxml.jackson.core.r
    public void h(com.fasterxml.jackson.core.h hVar) throws IOException {
        this.f102807a.a(hVar, this.f102811e);
    }

    @Override // com.fasterxml.jackson.core.r
    public void i(com.fasterxml.jackson.core.h hVar) throws IOException {
        hVar.D2(this.f102812f.c());
        this.f102808b.a(hVar, this.f102811e);
    }

    @Override // com.fasterxml.jackson.core.r
    public void k(com.fasterxml.jackson.core.h hVar, int i10) throws IOException {
        if (!this.f102808b.isInline()) {
            this.f102811e--;
        }
        if (i10 > 0) {
            this.f102808b.a(hVar, this.f102811e);
        } else {
            hVar.D2(' ');
        }
        hVar.D2(AbstractJsonLexerKt.END_OBJ);
    }

    protected e l(boolean z10) {
        if (this.f102810d == z10) {
            return this;
        }
        e eVar = new e(this);
        eVar.f102810d = z10;
        return eVar;
    }

    @Override // com.fasterxml.jackson.core.util.f
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e j() {
        return new e(this);
    }

    public void n(b bVar) {
        if (bVar == null) {
            bVar = c.f102815a;
        }
        this.f102807a = bVar;
    }

    public void o(b bVar) {
        if (bVar == null) {
            bVar = c.f102815a;
        }
        this.f102808b = bVar;
    }

    public e p(b bVar) {
        if (bVar == null) {
            bVar = c.f102815a;
        }
        if (this.f102807a == bVar) {
            return this;
        }
        e eVar = new e(this);
        eVar.f102807a = bVar;
        return eVar;
    }

    public e q(b bVar) {
        if (bVar == null) {
            bVar = c.f102815a;
        }
        if (this.f102808b == bVar) {
            return this;
        }
        e eVar = new e(this);
        eVar.f102808b = bVar;
        return eVar;
    }

    public e r(s sVar) {
        s sVar2 = this.f102809c;
        return (sVar2 == sVar || (sVar != null && sVar.equals(sVar2))) ? this : new e(this, sVar);
    }

    public e s(String str) {
        return r(str == null ? null : new com.fasterxml.jackson.core.io.m(str));
    }

    public e t(m mVar) {
        this.f102812f = mVar;
        this.f102813g = " " + mVar.d() + " ";
        return this;
    }

    public e u() {
        return l(true);
    }

    public e v() {
        return l(false);
    }

    public e(String str) {
        this(str == null ? null : new com.fasterxml.jackson.core.io.m(str));
    }

    public e(s sVar) {
        this.f102807a = a.f102814b;
        this.f102808b = d.f102800g;
        this.f102810d = true;
        this.f102809c = sVar;
        t(r.J1);
    }

    public e(e eVar) {
        this(eVar, eVar.f102809c);
    }

    public e(e eVar, s sVar) {
        this.f102807a = a.f102814b;
        this.f102808b = d.f102800g;
        this.f102810d = true;
        this.f102807a = eVar.f102807a;
        this.f102808b = eVar.f102808b;
        this.f102810d = eVar.f102810d;
        this.f102811e = eVar.f102811e;
        this.f102812f = eVar.f102812f;
        this.f102813g = eVar.f102813g;
        this.f102809c = sVar;
    }
}
