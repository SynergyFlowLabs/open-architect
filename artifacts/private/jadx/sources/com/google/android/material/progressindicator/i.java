package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.g0;
import androidx.annotation.t0;
import androidx.annotation.x;
import androidx.collection.b3;
import com.google.android.material.progressindicator.c;

/* JADX INFO: loaded from: classes4.dex */
abstract class i<S extends c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    S f113248a;

    protected static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @x(from = 0.0d, to = 1.0d)
        float f113249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @x(from = 0.0d, to = 1.0d)
        float f113250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.l
        int f113251c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @t0
        int f113252d;

        protected a() {
        }
    }

    public i(S s10) {
        this.f113248a = s10;
    }

    abstract void a(@NonNull Canvas canvas, @NonNull Rect rect, @x(from = -1.0d, to = 1.0d) float f10, boolean z10, boolean z11);

    abstract void b(@NonNull Canvas canvas, @NonNull Paint paint, @androidx.annotation.l int i10, @g0(from = 0, to = b3.f12144d) int i11);

    abstract void c(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull a aVar, @g0(from = 0, to = b3.f12144d) int i10);

    abstract void d(@NonNull Canvas canvas, @NonNull Paint paint, @x(from = 0.0d, to = 1.0d) float f10, @x(from = 0.0d, to = 1.0d) float f11, @androidx.annotation.l int i10, @g0(from = 0, to = b3.f12144d) int i11, @t0 int i12);

    abstract int e();

    abstract int f();

    void g(@NonNull Canvas canvas, @NonNull Rect rect, @x(from = 0.0d, to = 1.0d) float f10, boolean z10, boolean z11) {
        this.f113248a.e();
        a(canvas, rect, f10, z10, z11);
    }
}
