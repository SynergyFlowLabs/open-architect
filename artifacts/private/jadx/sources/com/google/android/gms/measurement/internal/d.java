package com.google.android.gms.measurement.internal;

import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
final class d extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.r4 f109868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ e f109869h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, String str, int i10, com.google.android.gms.internal.measurement.r4 r4Var) {
        super(str, i10);
        Objects.requireNonNull(eVar);
        this.f109869h = eVar;
        this.f109868g = r4Var;
    }

    @Override // com.google.android.gms.measurement.internal.c
    final int a() {
        return this.f109868g.F();
    }

    @Override // com.google.android.gms.measurement.internal.c
    final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.c
    final boolean c() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean k(Long l10, Long l11, com.google.android.gms.internal.measurement.b8 b8Var, boolean z10) {
        com.google.android.gms.internal.measurement.jf.a();
        h7 h7Var = this.f109869h.f110184a;
        boolean zH = h7Var.w().H(this.f109800a, z4.E0);
        com.google.android.gms.internal.measurement.r4 r4Var = this.f109868g;
        boolean zI = r4Var.I();
        boolean zJ = r4Var.J();
        boolean zL = r4Var.L();
        Object[] objArr = zI || zJ || zL;
        Boolean boolE = null;
        boolE = null;
        boolE = null;
        boolE = null;
        boolE = null;
        if (z10 && objArr != true) {
            h7Var.a().w().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f109801b), r4Var.E() ? Integer.valueOf(r4Var.F()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.l4 l4VarH = r4Var.H();
        boolean zJ2 = l4VarH.J();
        if (b8Var.J()) {
            if (l4VarH.G()) {
                boolE = c.e(c.g(b8Var.K(), l4VarH.H()), zJ2);
            } else {
                h7Var.a().r().b("No number filter for long property. property", h7Var.D().c(b8Var.G()));
            }
        } else if (b8Var.N()) {
            if (l4VarH.G()) {
                boolE = c.e(c.h(b8Var.O(), l4VarH.H()), zJ2);
            } else {
                h7Var.a().r().b("No number filter for double property. property", h7Var.D().c(b8Var.G()));
            }
        } else if (!b8Var.H()) {
            h7Var.a().r().b("User property has no value, property", h7Var.D().c(b8Var.G()));
        } else if (l4VarH.E()) {
            boolE = c.e(c.f(b8Var.I(), l4VarH.F(), h7Var.a()), zJ2);
        } else if (!l4VarH.G()) {
            h7Var.a().r().b("No string or number filter defined. property", h7Var.D().c(b8Var.G()));
        } else if (ve.O(b8Var.I())) {
            boolE = c.e(c.i(b8Var.I(), l4VarH.H()), zJ2);
        } else {
            h7Var.a().r().c("Invalid user property value for Numeric number filter. property, value", h7Var.D().c(b8Var.G()), b8Var.I());
        }
        h7Var.a().w().b("Property filter result", boolE == null ? AbstractJsonLexerKt.NULL : boolE);
        if (boolE == null) {
            return false;
        }
        this.f109802c = Boolean.TRUE;
        if (zL && !boolE.booleanValue()) {
            return true;
        }
        if (!z10 || r4Var.I()) {
            this.f109803d = boolE;
        }
        if (boolE.booleanValue() && objArr != false && b8Var.E()) {
            long jF = b8Var.F();
            if (l10 != null) {
                jF = l10.longValue();
            }
            if (zH && r4Var.I() && !r4Var.J() && l11 != null) {
                jF = l11.longValue();
            }
            if (r4Var.J()) {
                this.f109805f = Long.valueOf(jF);
            } else {
                this.f109804e = Long.valueOf(jF);
            }
        }
        return true;
    }
}
