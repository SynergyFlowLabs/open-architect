package com.airbnb.lottie;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f88325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final LottieAnimationView f88326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final w0 f88327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f88328d;

    @androidx.annotation.l1
    l1() {
        this.f88325a = new HashMap();
        this.f88328d = true;
        this.f88326b = null;
        this.f88327c = null;
    }

    private void d() {
        LottieAnimationView lottieAnimationView = this.f88326b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        w0 w0Var = this.f88327c;
        if (w0Var != null) {
            w0Var.invalidateSelf();
        }
    }

    public String a(String str) {
        return str;
    }

    public String b(String str, String str2) {
        return a(str2);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public final String c(String str, String str2) {
        if (this.f88328d && this.f88325a.containsKey(str2)) {
            return this.f88325a.get(str2);
        }
        String strB = b(str, str2);
        if (this.f88328d) {
            this.f88325a.put(str2, strB);
        }
        return strB;
    }

    public void e() {
        this.f88325a.clear();
        d();
    }

    public void f(String str) {
        this.f88325a.remove(str);
        d();
    }

    public void g(boolean z10) {
        this.f88328d = z10;
    }

    public void h(String str, String str2) {
        this.f88325a.put(str, str2);
        d();
    }

    public l1(LottieAnimationView lottieAnimationView) {
        this.f88325a = new HashMap();
        this.f88328d = true;
        this.f88326b = lottieAnimationView;
        this.f88327c = null;
    }

    public l1(w0 w0Var) {
        this.f88325a = new HashMap();
        this.f88328d = true;
        this.f88327c = w0Var;
        this.f88326b = null;
    }
}
