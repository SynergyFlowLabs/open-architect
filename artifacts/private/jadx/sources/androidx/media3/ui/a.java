package androidx.media3.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class a extends View implements SubtitleView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<z0> f69760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<androidx.media3.common.text.a> f69761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f69762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f69763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f69764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f69765f;

    public a(Context context) {
        this(context, null);
    }

    private static androidx.media3.common.text.a b(androidx.media3.common.text.a aVar) {
        androidx.media3.common.text.a.c cVarB = aVar.a().w(-3.4028235E38f).x(Integer.MIN_VALUE).B(null);
        if (aVar.f61380f == 0) {
            cVarB.t(1.0f - aVar.f61379e, 0);
        } else {
            cVarB.t((-aVar.f61379e) - 1.0f, 1);
        }
        int i10 = aVar.f61381g;
        if (i10 == 0) {
            cVarB.u(2);
        } else if (i10 == 2) {
            cVarB.u(0);
        }
        return cVarB.a();
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public void a(List<androidx.media3.common.text.a> list, b bVar, float f10, int i10, float f11) {
        this.f69761b = list;
        this.f69764e = bVar;
        this.f69763d = f10;
        this.f69762c = i10;
        this.f69765f = f11;
        while (this.f69760a.size() < list.size()) {
            this.f69760a.add(new z0(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<androidx.media3.common.text.a> list = this.f69761b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i10 = paddingBottom - paddingTop;
        float f10 = c1.f(this.f69762c, this.f69763d, height, i10);
        if (f10 <= 0.0f) {
            return;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            androidx.media3.common.text.a aVarB = list.get(i11);
            if (aVarB.f61390p != Integer.MIN_VALUE) {
                aVarB = b(aVarB);
            }
            this.f69760a.get(i11).b(aVarB, this.f69764e, f10, c1.f(aVarB.f61388n, aVarB.f61389o, height, i10), this.f69765f, canvas, paddingLeft, paddingTop, width, paddingBottom);
        }
    }

    public a(Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69760a = new ArrayList();
        this.f69761b = Collections.EMPTY_LIST;
        this.f69762c = 0;
        this.f69763d = 0.0533f;
        this.f69764e = b.f69773m;
        this.f69765f = 0.08f;
    }
}
