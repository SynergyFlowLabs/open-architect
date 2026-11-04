package com.planner5d.library.widget.editor.editor2d.drawable.gizmo;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.m1;
import com.planner5d.library.model.manager.f2;

/* JADX INFO: loaded from: classes12.dex */
class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f254972a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f254973b = new Rect();

    i() {
    }

    private void c(String str, Paint paint) {
        this.f254972a = str;
        paint.getTextBounds(str, 0, str.length(), this.f254973b);
    }

    public Rect a() {
        return this.f254973b;
    }

    public String b() {
        return this.f254972a;
    }

    protected void d(int i10, Paint paint) {
        c(i10 + "°", paint);
    }

    @m1
    protected void e(float f10, Paint paint) {
        f2 f2VarA = f2.f191325f.a();
        com.planner5d.library.model.metricunit.a aVarL = f2VarA.l();
        c(f2VarA.d(f10, aVarL) + " " + aVarL.g(), paint);
    }
}
