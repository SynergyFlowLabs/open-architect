package io.noties.markwon.core.spans;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes8.dex */
abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Rect f297576a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final RectF f297577b = new RectF();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Paint f297578c = new Paint(1);

    private i() {
    }

    static Paint a() {
        return f297578c;
    }

    static Rect b() {
        return f297576a;
    }

    static RectF c() {
        return f297577b;
    }
}
