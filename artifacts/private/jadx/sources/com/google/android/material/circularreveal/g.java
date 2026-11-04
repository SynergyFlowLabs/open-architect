package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.l;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public interface g extends com.google.android.material.circularreveal.d.a {

    public static class b implements TypeEvaluator<e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final TypeEvaluator<e> f111940b = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f111941a = new e();

        @Override // android.animation.TypeEvaluator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f10, @NonNull e eVar, @NonNull e eVar2) {
            this.f111941a.b(y6.a.f(eVar.f111945a, eVar2.f111945a, f10), y6.a.f(eVar.f111946b, eVar2.f111946b, f10), y6.a.f(eVar.f111947c, eVar2.f111947c, f10));
            return this.f111941a;
        }
    }

    public static class c extends Property<g, e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Property<g, e> f111942a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        @p0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(@NonNull g gVar) {
            return gVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull g gVar, @p0 e eVar) {
            gVar.setRevealInfo(eVar);
        }
    }

    public static class d extends Property<g, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Property<g, Integer> f111943a = new d("circularRevealScrimColor");

        private d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(@NonNull g gVar) {
            return Integer.valueOf(gVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull g gVar, @NonNull Integer num) {
            gVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final float f111944d = Float.MAX_VALUE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f111945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f111946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f111947c;

        public boolean a() {
            return this.f111947c == Float.MAX_VALUE;
        }

        public void b(float f10, float f11, float f12) {
            this.f111945a = f10;
            this.f111946b = f11;
            this.f111947c = f12;
        }

        public void c(@NonNull e eVar) {
            b(eVar.f111945a, eVar.f111946b, eVar.f111947c);
        }

        private e() {
        }

        public e(float f10, float f11, float f12) {
            this.f111945a = f10;
            this.f111946b = f11;
            this.f111947c = f12;
        }

        public e(@NonNull e eVar) {
            this(eVar.f111945a, eVar.f111946b, eVar.f111947c);
        }
    }

    void a();

    void d();

    void draw(Canvas canvas);

    @p0
    Drawable getCircularRevealOverlayDrawable();

    @l
    int getCircularRevealScrimColor();

    @p0
    e getRevealInfo();

    boolean isOpaque();

    void setCircularRevealOverlayDrawable(@p0 Drawable drawable);

    void setCircularRevealScrimColor(@l int i10);

    void setRevealInfo(@p0 e eVar);
}
