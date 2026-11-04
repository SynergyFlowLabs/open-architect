package com.planner5d.library.model.metricunit;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.f1;
import com.planner5d.library.f;
import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @f1
    private final int f222425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f222426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final p0 f222427c;

    protected a(Context context, p0 p0Var, @f1 int i10) {
        this.f222425a = i10;
        this.f222426b = context.getApplicationContext();
        this.f222427c = p0Var;
    }

    public abstract String a(float f10);

    protected String b(float f10, String str) {
        return this.f222427c.x(f10) + " " + str;
    }

    public abstract String c(float f10);

    public String d(float f10) {
        return a(f10);
    }

    protected String e(int i10) {
        return TextUtils.split(f().replace(" ", ""), this.f222426b.getString(f.s.rq))[i10];
    }

    public String f() {
        return this.f222426b.getString(this.f222425a);
    }

    public String g() {
        return e(2);
    }
}
