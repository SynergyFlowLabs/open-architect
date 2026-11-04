package com.nineoldandroids.view;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final WeakHashMap<View, b> f131324a = new WeakHashMap<>(0);

    public static b c(View view) {
        WeakHashMap<View, b> weakHashMap = f131324a;
        b cVar = weakHashMap.get(view);
        if (cVar == null) {
            int iIntValue = Integer.valueOf(Build.VERSION.SDK).intValue();
            if (iIntValue >= 14) {
                cVar = new d(view);
            } else {
                cVar = iIntValue >= 11 ? new c(view) : new e(view);
            }
            weakHashMap.put(view, cVar);
        }
        return cVar;
    }

    public abstract b A(float f10);

    public abstract b B(float f10);

    public abstract b C(float f10);

    public abstract b a(float f10);

    public abstract b b(float f10);

    public abstract void d();

    public abstract long e();

    public abstract long f();

    public abstract b g(float f10);

    public abstract b h(float f10);

    public abstract b i(float f10);

    public abstract b j(float f10);

    public abstract b k(float f10);

    public abstract b l(float f10);

    public abstract b m(float f10);

    public abstract b n(float f10);

    public abstract b o(float f10);

    public abstract b p(float f10);

    public abstract b q(long j10);

    public abstract b r(Interpolator interpolator);

    public abstract b s(com.nineoldandroids.animation.a.InterfaceC1443a interfaceC1443a);

    public abstract b t(long j10);

    public abstract void u();

    public abstract b v(float f10);

    public abstract b w(float f10);

    public abstract b x(float f10);

    public abstract b y(float f10);

    public abstract b z(float f10);
}
