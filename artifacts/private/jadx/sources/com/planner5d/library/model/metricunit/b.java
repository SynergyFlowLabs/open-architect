package com.planner5d.library.model.metricunit;

import android.content.Context;
import com.planner5d.library.f;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.p0;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes9.dex */
public class b extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f222428e = 0.3048f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f222429f = 0.09290304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f222430g = 12;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f222431d;

    public b(Context context, p0 p0Var) {
        super(context, p0Var, f.s.pq);
        this.f222431d = context;
    }

    @Override // com.planner5d.library.model.metricunit.a
    public String a(float f10) {
        return super.b(f10 / f222428e, e(0));
    }

    @Override // com.planner5d.library.model.metricunit.a
    public String c(float f10) {
        return super.b(f10 / f222429f, e(1));
    }

    @Override // com.planner5d.library.model.metricunit.a
    public String d(float f10) {
        try {
            long jLongValue = BigDecimal.valueOf((f10 / f222428e) * 12.0f).setScale(0, RoundingMode.HALF_UP).longValue();
            return String.format(h3.U(this.f222431d) ? "\"%s'%s" : "%s'%s\"", this.f222427c.x(jLongValue / 12), this.f222427c.x(Math.abs(jLongValue % 12)));
        } catch (NumberFormatException unused) {
            throw new NumberFormatException("Invalid number for format: " + f10);
        }
    }
}
