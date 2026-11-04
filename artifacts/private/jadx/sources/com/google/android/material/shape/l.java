package com.google.android.material.shape;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.internal.p0;

/* JADX INFO: loaded from: classes4.dex */
public class l {
    private l() {
    }

    @NonNull
    static f a(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? b() : new g();
        }
        return new o();
    }

    @NonNull
    static f b() {
        return new o();
    }

    @NonNull
    static h c() {
        return new h();
    }

    public static void d(@NonNull View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof k) {
            ((k) background).o0(f10);
        }
    }

    public static void e(@NonNull View view) {
        Drawable background = view.getBackground();
        if (background instanceof k) {
            f(view, (k) background);
        }
    }

    public static void f(@NonNull View view, @NonNull k kVar) {
        if (kVar.c0()) {
            kVar.t0(p0.p(view));
        }
    }
}
