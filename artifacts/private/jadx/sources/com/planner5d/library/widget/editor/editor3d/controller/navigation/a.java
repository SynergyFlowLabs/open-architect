package com.planner5d.library.widget.editor.editor3d.controller.navigation;

import android.animation.FloatEvaluator;
import android.view.animation.DecelerateInterpolator;
import com.planner5d.library.math.m;

/* JADX INFO: loaded from: classes12.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m[] f255469a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f255474f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FloatEvaluator f255471c = new FloatEvaluator();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final DecelerateInterpolator f255472d = new DecelerateInterpolator();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m f255475g = new m();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m f255476h = new m();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f255477i = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f255473e = System.currentTimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m[] f255470b = {new m(), new m()};

    a(long j10, j jVar, j jVar2) {
        this.f255474f = j10;
        m[] mVarArr = {new m(), new m()};
        this.f255469a = mVarArr;
        jVar.i(this.f255470b[0], mVarArr[0]);
        jVar2.i(this.f255470b[1], this.f255469a[1]);
    }

    private boolean b(j jVar, float f10) {
        if (this.f255477i || f10 > 1.0f) {
            this.f255477i = true;
            return false;
        }
        if (f10 == 1.0f) {
            this.f255477i = true;
        }
        float interpolation = this.f255472d.getInterpolation(f10);
        jVar.C(this.f255475g.y0(this.f255471c.evaluate(interpolation, (Number) Float.valueOf(this.f255470b[0].f180482a), (Number) Float.valueOf(this.f255470b[1].f180482a)).floatValue(), this.f255471c.evaluate(interpolation, (Number) Float.valueOf(this.f255470b[0].f180483b), (Number) Float.valueOf(this.f255470b[1].f180483b)).floatValue(), this.f255471c.evaluate(interpolation, (Number) Float.valueOf(this.f255470b[0].f180484c), (Number) Float.valueOf(this.f255470b[1].f180484c)).floatValue()), this.f255476h.y0(this.f255471c.evaluate(interpolation, (Number) Float.valueOf(this.f255469a[0].f180482a), (Number) Float.valueOf(this.f255469a[1].f180482a)).floatValue(), this.f255471c.evaluate(interpolation, (Number) Float.valueOf(this.f255469a[0].f180483b), (Number) Float.valueOf(this.f255469a[1].f180483b)).floatValue(), this.f255471c.evaluate(interpolation, (Number) Float.valueOf(this.f255469a[0].f180484c), (Number) Float.valueOf(this.f255469a[1].f180484c)).floatValue()));
        return true;
    }

    boolean a(j jVar) {
        return b(jVar, (System.currentTimeMillis() - this.f255473e) / this.f255474f);
    }

    boolean c(j jVar) {
        return b(jVar, 1.0f);
    }
}
