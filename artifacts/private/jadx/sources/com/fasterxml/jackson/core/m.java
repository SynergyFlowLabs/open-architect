package com.fasterxml.jackson.core;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final int f102644c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final int f102645d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final int f102646e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f102647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f102648b;

    protected m() {
    }

    public final int a() {
        int i10 = this.f102648b;
        if (i10 < 0) {
            i10 = 0;
        }
        return i10;
    }

    public abstract String b();

    public Object c() {
        return null;
    }

    public final int d() {
        return this.f102648b + 1;
    }

    public abstract m e();

    public i f(Object obj) {
        return i.f102393h;
    }

    @Deprecated
    public final String g() {
        int i10 = this.f102647a;
        if (i10 == 0) {
            return org.slf4j.c.Y2;
        }
        if (i10 != 1) {
            return i10 != 2 ? com.planner5d.library.model.payments.a.f222474i : "OBJECT";
        }
        return "ARRAY";
    }

    public boolean h() {
        return this.f102648b >= 0;
    }

    public boolean i() {
        return b() != null;
    }

    public boolean j() {
        int i10 = this.f102647a;
        if (i10 == 2) {
            return i();
        }
        if (i10 == 1) {
            return h();
        }
        return false;
    }

    public final boolean k() {
        return this.f102647a == 1;
    }

    public final boolean l() {
        if (this.f102647a != 2) {
            return false;
        }
        int i10 = 2 | 1;
        return true;
    }

    public final boolean m() {
        return this.f102647a == 0;
    }

    public k n() {
        return k.k(this, false);
    }

    public k o(boolean z10) {
        return k.k(this, z10);
    }

    public void p(Object obj) {
    }

    public String q() {
        int i10 = this.f102647a;
        if (i10 == 0) {
            return "root";
        }
        if (i10 != 1) {
            return i10 != 2 ? com.planner5d.library.model.payments.a.f222474i : "Object";
        }
        return "Array";
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        int i10 = this.f102647a;
        if (i10 == 0) {
            sb2.append("/");
        } else if (i10 != 1) {
            sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
            String strB = b();
            if (strB != null) {
                sb2.append('\"');
                com.fasterxml.jackson.core.io.a.a(sb2, strB);
                sb2.append('\"');
            } else {
                sb2.append('?');
            }
            sb2.append(AbstractJsonLexerKt.END_OBJ);
        } else {
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append(a());
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb2.toString();
    }

    protected m(m mVar) {
        this.f102647a = mVar.f102647a;
        this.f102648b = mVar.f102648b;
    }

    protected m(int i10, int i11) {
        this.f102647a = i10;
        this.f102648b = i11;
    }
}
