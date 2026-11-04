package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class a<V extends View> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f112966g = "MaterialBackHelper";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f112967h = 300;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f112968i = 150;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f112969j = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final TimeInterpolator f112970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    protected final V f112971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f112972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f112973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f112974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private androidx.activity.d f112975f;

    public a(@NonNull V v10) {
        this.f112971b = v10;
        Context context = v10.getContext();
        this.f112970a = j.g(context, r6.a.c.f359132ae, androidx.core.view.animation.b.b(0.0f, 0.0f, 0.0f, 1.0f));
        this.f112972c = j.f(context, r6.a.c.Jd, 300);
        this.f112973d = j.f(context, r6.a.c.Od, 150);
        this.f112974e = j.f(context, r6.a.c.Nd, 100);
    }

    public float a(float f10) {
        return this.f112970a.getInterpolation(f10);
    }

    @p0
    protected androidx.activity.d b() {
        androidx.activity.d dVar = this.f112975f;
        this.f112975f = null;
        return dVar;
    }

    @p0
    public androidx.activity.d c() {
        androidx.activity.d dVar = this.f112975f;
        this.f112975f = null;
        return dVar;
    }

    protected void d(@NonNull androidx.activity.d dVar) {
        this.f112975f = dVar;
    }

    @p0
    protected androidx.activity.d e(@NonNull androidx.activity.d dVar) {
        androidx.activity.d dVar2 = this.f112975f;
        this.f112975f = dVar;
        return dVar2;
    }
}
