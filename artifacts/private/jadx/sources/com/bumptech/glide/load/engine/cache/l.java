package com.bumptech.glide.load.engine.cache;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.l1;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f96483e = "MemorySizeCalculator";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l1
    static final int f96484f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f96485g = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f96486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f96487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f96488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f96489d;

    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @l1
        static final int f96490i = 2;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f96491j = 1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final float f96492k = 0.4f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final float f96493l = 0.33f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final int f96494m = 4194304;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f96495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ActivityManager f96496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c f96497c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f96499e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f96498d = 2.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f96500f = 0.4f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f96501g = f96493l;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f96502h = 4194304;

        public a(Context context) {
            this.f96499e = f96491j;
            this.f96495a = context;
            this.f96496b = (ActivityManager) context.getSystemService("activity");
            this.f96497c = new b(context.getResources().getDisplayMetrics());
            if (l.e(this.f96496b)) {
                this.f96499e = 0.0f;
            }
        }

        public l a() {
            return new l(this);
        }

        @l1
        a b(ActivityManager activityManager) {
            this.f96496b = activityManager;
            return this;
        }

        public a c(int i10) {
            this.f96502h = i10;
            return this;
        }

        public a d(float f10) {
            com.bumptech.glide.util.k.a(f10 >= 0.0f, "Bitmap pool screens must be greater than or equal to 0");
            this.f96499e = f10;
            return this;
        }

        public a e(float f10) {
            com.bumptech.glide.util.k.a(f10 >= 0.0f && f10 <= 1.0f, "Low memory max size multiplier must be between 0 and 1");
            this.f96501g = f10;
            return this;
        }

        public a f(float f10) {
            com.bumptech.glide.util.k.a(f10 >= 0.0f && f10 <= 1.0f, "Size multiplier must be between 0 and 1");
            this.f96500f = f10;
            return this;
        }

        public a g(float f10) {
            com.bumptech.glide.util.k.a(f10 >= 0.0f, "Memory cache screens must be greater than or equal to 0");
            this.f96498d = f10;
            return this;
        }

        @l1
        a h(c cVar) {
            this.f96497c = cVar;
            return this;
        }
    }

    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DisplayMetrics f96503a;

        b(DisplayMetrics displayMetrics) {
            this.f96503a = displayMetrics;
        }

        @Override // com.bumptech.glide.load.engine.cache.l.c
        public int a() {
            return this.f96503a.heightPixels;
        }

        @Override // com.bumptech.glide.load.engine.cache.l.c
        public int b() {
            return this.f96503a.widthPixels;
        }
    }

    interface c {
        int a();

        int b();
    }

    l(a aVar) {
        this.f96488c = aVar.f96495a;
        int i10 = e(aVar.f96496b) ? aVar.f96502h / 2 : aVar.f96502h;
        this.f96489d = i10;
        int iC = c(aVar.f96496b, aVar.f96500f, aVar.f96501g);
        float fB = aVar.f96497c.b() * aVar.f96497c.a() * 4;
        int iRound = Math.round(aVar.f96499e * fB);
        int iRound2 = Math.round(fB * aVar.f96498d);
        int i11 = iC - i10;
        if (iRound2 + iRound <= i11) {
            this.f96487b = iRound2;
            this.f96486a = iRound;
        } else {
            float f10 = i11;
            float f11 = aVar.f96499e;
            float f12 = aVar.f96498d;
            float f13 = f10 / (f11 + f12);
            this.f96487b = Math.round(f12 * f13);
            this.f96486a = Math.round(f13 * aVar.f96499e);
        }
        if (Log.isLoggable(f96483e, 3)) {
            f(this.f96487b);
            f(this.f96486a);
            f(i10);
            f(iC);
            aVar.f96496b.getMemoryClass();
            e(aVar.f96496b);
        }
    }

    private static int c(ActivityManager activityManager, float f10, float f11) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (e(activityManager)) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    @e.b(19)
    static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String f(int i10) {
        return Formatter.formatFileSize(this.f96488c, i10);
    }

    public int a() {
        return this.f96489d;
    }

    public int b() {
        return this.f96486a;
    }

    public int d() {
        return this.f96487b;
    }
}
