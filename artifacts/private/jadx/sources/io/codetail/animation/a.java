package io.codetail.animation;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public interface a {

    /* JADX INFO: renamed from: io.codetail.animation.a$a, reason: collision with other inner class name */
    public static class C1948a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f288263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f288264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f288265c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f288266d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final WeakReference<View> f288267e;

        public C1948a(int i10, int i11, float f10, float f11, WeakReference<View> weakReference) {
            this.f288263a = i10;
            this.f288264b = i11;
            this.f288265c = f10;
            this.f288266d = f11;
            this.f288267e = weakReference;
        }

        public View a() {
            return this.f288267e.get();
        }

        public boolean b() {
            return a() != null;
        }
    }

    void a();

    void b();

    b c();

    void d(C1948a c1948a);

    void e();

    float getRevealRadius();

    void invalidate(Rect rect);

    void setRevealRadius(float f10);
}
