package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.j1;

/* JADX INFO: loaded from: classes4.dex */
public class d extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f114033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f114034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f114035c;

    public d(Context context) {
        this(context, null);
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j1 j1VarF = j1.F(context, attributeSet, r6.a.o.wv);
        this.f114033a = j1VarF.x(r6.a.o.zv);
        this.f114034b = j1VarF.h(r6.a.o.xv);
        this.f114035c = j1VarF.u(r6.a.o.yv, 0);
        j1VarF.I();
    }
}
