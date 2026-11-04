package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.qg;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class r6 implements qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ x6 f110434a;

    r6(x6 x6Var) {
        Objects.requireNonNull(x6Var);
        this.f110434a = x6Var;
    }

    @Override // com.google.android.gms.internal.measurement.qg
    public final void a(int i10, String str, List list, boolean z10, boolean z11) {
        u5 u5VarV;
        int i11 = i10 - 1;
        int i12 = 7 | 1;
        if (i11 == 0) {
            u5VarV = this.f110434a.f110184a.a().v();
        } else if (i11 != 1) {
            if (i11 == 3) {
                u5VarV = this.f110434a.f110184a.a().w();
            } else if (i11 != 4) {
                u5VarV = this.f110434a.f110184a.a().u();
            } else if (z10) {
                u5VarV = this.f110434a.f110184a.a().s();
            } else {
                u5VarV = !z11 ? this.f110434a.f110184a.a().t() : this.f110434a.f110184a.a().r();
            }
        } else if (z10) {
            u5VarV = this.f110434a.f110184a.a().p();
        } else {
            u5VarV = !z11 ? this.f110434a.f110184a.a().q() : this.f110434a.f110184a.a().o();
        }
        int size = list.size();
        if (size == 1) {
            u5VarV.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            u5VarV.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            u5VarV.a(str);
        } else {
            u5VarV.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
