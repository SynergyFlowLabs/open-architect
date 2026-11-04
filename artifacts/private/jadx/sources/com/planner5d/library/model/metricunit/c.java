package com.planner5d.library.model.metricunit;

import android.content.Context;
import com.planner5d.library.f;
import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes9.dex */
public class c extends a {
    public c(Context context, p0 p0Var) {
        super(context, p0Var, f.s.qq);
    }

    @Override // com.planner5d.library.model.metricunit.a
    public String a(float f10) {
        return b(f10, e(0));
    }

    @Override // com.planner5d.library.model.metricunit.a
    public String c(float f10) {
        return b(f10, e(1));
    }

    @Override // com.planner5d.library.model.metricunit.a
    public String d(float f10) {
        return a(f10);
    }
}
