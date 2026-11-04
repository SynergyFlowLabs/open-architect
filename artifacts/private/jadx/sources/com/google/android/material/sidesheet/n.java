package com.google.android.material.sidesheet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.a0;
import androidx.annotation.d0;
import androidx.annotation.g1;
import androidx.annotation.j0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public class n extends g<m> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f113756s = r6.a.c.f359656xg;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f113757t = r6.a.n.f361434sc;

    class a extends m {
        a() {
        }

        @Override // com.google.android.material.sidesheet.m, com.google.android.material.sidesheet.d
        public void a(@NonNull View view, int i10) {
            if (i10 == 5) {
                n.this.cancel();
            }
        }

        @Override // com.google.android.material.sidesheet.m, com.google.android.material.sidesheet.d
        public void b(@NonNull View view, float f10) {
        }
    }

    public n(@NonNull Context context) {
        this(context, 0);
    }

    @Override // com.google.android.material.sidesheet.g
    public /* bridge */ /* synthetic */ void A(@a0 int i10) {
        super.A(i10);
    }

    @Override // com.google.android.material.sidesheet.g
    @NonNull
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public SideSheetBehavior<? extends View> p() {
        c cVarP = super.p();
        if (cVarP instanceof SideSheetBehavior) {
            return (SideSheetBehavior) cVarP;
        }
        throw new IllegalStateException("The view is not associated with SideSheetBehavior");
    }

    @Override // com.google.android.material.sidesheet.g, android.app.Dialog, android.content.DialogInterface
    public /* bridge */ /* synthetic */ void cancel() {
        super.cancel();
    }

    @Override // com.google.android.material.sidesheet.g
    void n(c<m> cVar) {
        cVar.a(new a());
    }

    @Override // com.google.android.material.sidesheet.g, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.google.android.material.sidesheet.g, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.google.android.material.sidesheet.g
    @NonNull
    c<m> q(@NonNull FrameLayout frameLayout) {
        return SideSheetBehavior.j0(frameLayout);
    }

    @Override // com.google.android.material.sidesheet.g
    @d0
    int s() {
        return r6.a.h.f360802x2;
    }

    @Override // com.google.android.material.sidesheet.g, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCancelable(boolean z10) {
        super.setCancelable(z10);
    }

    @Override // com.google.android.material.sidesheet.g, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
    }

    @Override // com.google.android.material.sidesheet.g, androidx.appcompat.app.q, androidx.activity.t, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@j0 int i10) {
        super.setContentView(i10);
    }

    @Override // com.google.android.material.sidesheet.g
    @j0
    int t() {
        return r6.a.k.Y;
    }

    @Override // com.google.android.material.sidesheet.g
    int v() {
        return 3;
    }

    @Override // com.google.android.material.sidesheet.g
    public /* bridge */ /* synthetic */ boolean x() {
        return super.x();
    }

    @Override // com.google.android.material.sidesheet.g
    public /* bridge */ /* synthetic */ void z(boolean z10) {
        super.z(z10);
    }

    public n(@NonNull Context context, @g1 int i10) {
        super(context, i10, f113756s, f113757t);
    }

    @Override // com.google.android.material.sidesheet.g, androidx.appcompat.app.q, androidx.activity.t, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@p0 View view) {
        super.setContentView(view);
    }

    @Override // com.google.android.material.sidesheet.g, androidx.appcompat.app.q, androidx.activity.t, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@p0 View view, @p0 ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
    }
}
