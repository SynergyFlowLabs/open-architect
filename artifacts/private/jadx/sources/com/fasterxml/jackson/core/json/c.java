package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.q;
import com.fasterxml.jackson.core.s;
import com.fasterxml.jackson.core.util.p;
import com.fasterxml.jackson.core.v;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends com.fasterxml.jackson.core.base.a {
    protected static final int[] H1 = com.fasterxml.jackson.core.io.a.e();
    protected int[] X;
    protected int Y;
    protected com.fasterxml.jackson.core.io.b Z;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    protected s f102543p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    protected boolean f102544p1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected final com.fasterxml.jackson.core.io.d f102545w;

    public c(com.fasterxml.jackson.core.io.d dVar, int i10, q qVar) {
        super(i10, qVar);
        this.X = H1;
        this.f102543p0 = com.fasterxml.jackson.core.util.e.f102806i;
        this.f102545w = dVar;
        if (com.fasterxml.jackson.core.h.b.ESCAPE_NON_ASCII.n(i10)) {
            this.Y = 127;
        }
        this.f102544p1 = !com.fasterxml.jackson.core.h.b.QUOTE_FIELD_NAMES.n(i10);
    }

    protected void C3(String str) throws IOException {
        a(String.format("Can not %s, expecting field name (context: %s)", str, this.f102247e.q()));
    }

    protected void D3(String str, int i10) throws IOException {
        if (i10 == 0) {
            if (this.f102247e.k()) {
                this.f102376a.h(this);
                return;
            } else {
                if (this.f102247e.l()) {
                    this.f102376a.c(this);
                    return;
                }
                return;
            }
        }
        if (i10 == 1) {
            this.f102376a.b(this);
            return;
        }
        if (i10 == 2) {
            this.f102376a.e(this);
            return;
        }
        if (i10 == 3) {
            this.f102376a.a(this);
        } else if (i10 != 5) {
            c();
        } else {
            C3(str);
        }
    }

    @Override // com.fasterxml.jackson.core.h
    public com.fasterxml.jackson.core.h H0(s sVar) {
        this.f102543p0 = sVar;
        return this;
    }

    @Override // com.fasterxml.jackson.core.h
    public int R() {
        return this.Y;
    }

    @Override // com.fasterxml.jackson.core.h
    public final void h3(String str, String str2) throws IOException {
        E1(str);
        e3(str2);
    }

    @Override // com.fasterxml.jackson.core.h
    public com.fasterxml.jackson.core.h o0(com.fasterxml.jackson.core.io.b bVar) {
        this.Z = bVar;
        if (bVar == null) {
            this.X = H1;
            return this;
        }
        this.X = bVar.a();
        return this;
    }

    @Override // com.fasterxml.jackson.core.base.a, com.fasterxml.jackson.core.h
    public com.fasterxml.jackson.core.h t(com.fasterxml.jackson.core.h.b bVar) {
        super.t(bVar);
        if (bVar == com.fasterxml.jackson.core.h.b.QUOTE_FIELD_NAMES) {
            this.f102544p1 = true;
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.base.a
    protected void t3(int i10, int i11) {
        super.t3(i10, i11);
        this.f102544p1 = !com.fasterxml.jackson.core.h.b.QUOTE_FIELD_NAMES.n(i10);
    }

    @Override // com.fasterxml.jackson.core.base.a, com.fasterxml.jackson.core.h, com.fasterxml.jackson.core.w
    public v version() {
        return p.h(getClass());
    }

    @Override // com.fasterxml.jackson.core.base.a, com.fasterxml.jackson.core.h
    public com.fasterxml.jackson.core.h x(com.fasterxml.jackson.core.h.b bVar) {
        super.x(bVar);
        if (bVar == com.fasterxml.jackson.core.h.b.QUOTE_FIELD_NAMES) {
            this.f102544p1 = false;
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.h
    public com.fasterxml.jackson.core.io.b y() {
        return this.Z;
    }

    @Override // com.fasterxml.jackson.core.h
    public com.fasterxml.jackson.core.h y0(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.Y = i10;
        return this;
    }
}
