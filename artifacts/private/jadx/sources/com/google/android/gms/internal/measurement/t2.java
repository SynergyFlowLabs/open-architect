package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class t2 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f108858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Bundle f108859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ f4 f108860g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t2(f4 f4Var, Context context, Bundle bundle) {
        super(f4Var, true);
        this.f108858e = context;
        this.f108859f = bundle;
        Objects.requireNonNull(f4Var);
        this.f108860g = f4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    public final void a() {
        try {
            Context context = this.f108858e;
            com.google.android.gms.common.internal.w.r(context);
            String strA = com.google.android.gms.measurement.internal.y6.a(context);
            com.google.android.gms.common.internal.w.r(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strA)) {
                strA = com.google.android.gms.measurement.internal.y6.a(context);
            }
            Boolean boolC = com.google.android.gms.measurement.internal.y6.c("google_analytics_force_disable_updates", resources, strA);
            f4 f4Var = this.f108860g;
            f4Var.r(f4Var.x(context, boolC == null || !boolC.booleanValue()));
            if (f4Var.q() == null) {
                f4Var.o();
                return;
            }
            int iA = DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
            int iC = DynamiteModule.c(context, ModuleDescriptor.MODULE_ID);
            ((u1) com.google.android.gms.common.internal.w.r(f4Var.q())).initialize(com.google.android.gms.dynamic.f.p(context), new zzdd(133005L, Math.max(iA, iC), Boolean.TRUE.equals(boolC) || iC < iA, this.f108859f, com.google.android.gms.measurement.internal.y6.a(context)), this.f108861a);
        } catch (Exception e10) {
            this.f108860g.n(e10, true, false);
        }
    }
}
