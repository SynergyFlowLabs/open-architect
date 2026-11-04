package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.h;
import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.m;
import com.fasterxml.jackson.core.n;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class e extends m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final e f102346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected e f102347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected String f102348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected d f102349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected boolean f102350j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f102351k;

    protected e(int i10, e eVar, d dVar, boolean z10) {
        this.f102647a = i10;
        this.f102346f = eVar;
        this.f102349i = dVar;
        this.f102648b = -1;
        this.f102350j = z10;
        this.f102351k = false;
    }

    private void r(h hVar) throws IOException {
        d dVar = this.f102349i;
        if (dVar == null || dVar == d.f102345a) {
            return;
        }
        e eVar = this.f102346f;
        if (eVar != null) {
            eVar.r(hVar);
        }
        if (this.f102350j) {
            if (this.f102351k) {
                this.f102351k = false;
                hVar.E1(this.f102348h);
                return;
            }
            return;
        }
        this.f102350j = true;
        int i10 = this.f102647a;
        if (i10 != 2) {
            if (i10 == 1) {
                hVar.U2();
            }
        } else {
            hVar.X2();
            if (this.f102351k) {
                this.f102351k = false;
                hVar.E1(this.f102348h);
            }
        }
    }

    public static e y(d dVar) {
        return new e(0, null, dVar, true);
    }

    public d A() {
        return this.f102349i;
    }

    @Override // com.fasterxml.jackson.core.m
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final e e() {
        return this.f102346f;
    }

    public boolean C() {
        return this.f102350j;
    }

    public n D() {
        if (!this.f102350j) {
            this.f102350j = true;
            return this.f102647a == 2 ? n.START_OBJECT : n.START_ARRAY;
        }
        if (!this.f102351k || this.f102647a != 2) {
            return null;
        }
        this.f102351k = false;
        return n.FIELD_NAME;
    }

    protected e E(int i10, d dVar, boolean z10) {
        this.f102647a = i10;
        this.f102349i = dVar;
        this.f102648b = -1;
        this.f102348h = null;
        this.f102350j = z10;
        this.f102351k = false;
        return this;
    }

    public d F(String str) throws l {
        this.f102348h = str;
        this.f102351k = true;
        return this.f102349i;
    }

    public void G() {
        this.f102349i = null;
        for (e eVar = this.f102346f; eVar != null; eVar = eVar.f102346f) {
            this.f102346f.f102349i = null;
        }
    }

    public void H(h hVar) throws IOException {
        d dVar = this.f102349i;
        if (dVar != null && dVar != d.f102345a) {
            if (this.f102350j) {
                if (this.f102351k) {
                    hVar.E1(this.f102348h);
                    return;
                }
                return;
            }
            this.f102350j = true;
            int i10 = this.f102647a;
            if (i10 != 2) {
                if (i10 == 1) {
                    hVar.U2();
                }
            } else {
                hVar.X2();
                if (this.f102351k) {
                    hVar.E1(this.f102348h);
                }
            }
        }
    }

    public void I(h hVar) throws IOException {
        d dVar = this.f102349i;
        if (dVar == null || dVar == d.f102345a) {
            return;
        }
        e eVar = this.f102346f;
        if (eVar != null) {
            eVar.r(hVar);
        }
        if (this.f102350j) {
            if (this.f102351k) {
                hVar.E1(this.f102348h);
                return;
            }
            return;
        }
        this.f102350j = true;
        int i10 = this.f102647a;
        if (i10 == 2) {
            hVar.X2();
            hVar.E1(this.f102348h);
        } else if (i10 == 1) {
            hVar.U2();
        }
    }

    @Override // com.fasterxml.jackson.core.m
    public final String b() {
        return this.f102348h;
    }

    @Override // com.fasterxml.jackson.core.m
    public Object c() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.m
    public boolean i() {
        return this.f102348h != null;
    }

    @Override // com.fasterxml.jackson.core.m
    public void p(Object obj) {
    }

    protected void s(StringBuilder sb2) {
        e eVar = this.f102346f;
        if (eVar != null) {
            eVar.s(sb2);
        }
        int i10 = this.f102647a;
        if (i10 != 2) {
            if (i10 != 1) {
                sb2.append("/");
                return;
            }
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append(a());
            sb2.append(AbstractJsonLexerKt.END_LIST);
            return;
        }
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        if (this.f102348h != null) {
            sb2.append('\"');
            sb2.append(this.f102348h);
            sb2.append('\"');
        } else {
            sb2.append('?');
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
    }

    public d t(d dVar) {
        int i10 = this.f102647a;
        if (i10 == 2) {
            return dVar;
        }
        int i11 = this.f102648b + 1;
        this.f102648b = i11;
        return i10 == 1 ? dVar.h(i11) : dVar.s(i11);
    }

    @Override // com.fasterxml.jackson.core.m
    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        s(sb2);
        return sb2.toString();
    }

    public e u(h hVar) throws IOException {
        if (this.f102350j) {
            hVar.s1();
        }
        d dVar = this.f102349i;
        if (dVar != null && dVar != d.f102345a) {
            dVar.b();
        }
        return this.f102346f;
    }

    public e v(h hVar) throws IOException {
        if (this.f102350j) {
            hVar.u1();
        }
        d dVar = this.f102349i;
        if (dVar != null && dVar != d.f102345a) {
            dVar.c();
        }
        return this.f102346f;
    }

    public e w(d dVar, boolean z10) {
        e eVar = this.f102347g;
        if (eVar != null) {
            return eVar.E(1, dVar, z10);
        }
        e eVar2 = new e(1, this, dVar, z10);
        this.f102347g = eVar2;
        return eVar2;
    }

    public e x(d dVar, boolean z10) {
        e eVar = this.f102347g;
        int i10 = 5 << 2;
        if (eVar != null) {
            return eVar.E(2, dVar, z10);
        }
        e eVar2 = new e(2, this, dVar, z10);
        this.f102347g = eVar2;
        return eVar2;
    }

    public e z(e eVar) {
        e eVar2 = this.f102346f;
        if (eVar2 == eVar) {
            return this;
        }
        while (eVar2 != null) {
            e eVar3 = eVar2.f102346f;
            if (eVar3 == eVar) {
                return eVar2;
            }
            eVar2 = eVar3;
        }
        return null;
    }
}
