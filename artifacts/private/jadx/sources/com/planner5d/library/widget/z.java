package com.planner5d.library.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes12.dex */
public class z extends ConstraintLayout implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BackgroundImageView f258889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.widget.listitem.j f258890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.services.bitmaploader.target.h f258891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.planner5d.library.model.manager.y0 f258892d;

    public z(Context context, com.planner5d.library.services.bitmaploader.target.h hVar, com.planner5d.library.model.manager.y0 y0Var, boolean z10) {
        super(context);
        this.f258891c = hVar;
        this.f258892d = y0Var;
        View.inflate(context, com.planner5d.library.f.m.f168700g7, this);
        BackgroundImageView backgroundImageView = (BackgroundImageView) findViewById(com.planner5d.library.f.j.Jd);
        this.f258889a = backgroundImageView;
        backgroundImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        backgroundImageView.g();
        this.f258890b = new com.planner5d.library.widget.listitem.j((ProfileIconView) findViewById(com.planner5d.library.f.j.L3));
        if (z10) {
            findViewById(com.planner5d.library.f.j.rt).setVisibility(8);
        }
    }

    private void setTitleAndMetaMinHorizontalSpaces(int i10) {
        View viewFindViewById = findViewById(com.planner5d.library.f.j.tv);
        ViewGroup.LayoutParams layoutParams = viewFindViewById != null ? viewFindViewById.getLayoutParams() : null;
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).T = i10 - (getResources().getDimensionPixelSize(com.planner5d.library.f.g.f167420zh) * 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(com.planner5d.library.model.h hVar) {
        if (getWindowToken() != null) {
            setModel(hVar);
        }
    }

    private void y(TextView textView, long j10) {
        textView.setVisibility(j10 > 0 ? 0 : 8);
        textView.setText(String.valueOf(j10));
    }

    @Override // com.planner5d.library.widget.d1
    public void a() {
        this.f258889a.a();
        this.f258890b.c(this.f258891c);
    }

    public void setModel(final com.planner5d.library.model.h hVar) {
        int measuredWidth = getMeasuredWidth();
        if (getMeasuredHeight() <= 0 || measuredWidth <= 0) {
            post(new Runnable() { // from class: com.planner5d.library.widget.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f258880a.x(hVar);
                }
            });
            return;
        }
        a();
        setTitleAndMetaMinHorizontalSpaces(measuredWidth);
        ((TextView) findViewById(com.planner5d.library.f.j.tv)).setText(hVar.f180743e);
        ((TextView) findViewById(com.planner5d.library.f.j.F3)).setText(hVar.f180744f);
        this.f258889a.setImageBitmap(null);
        this.f258889a.f(this.f258892d.a(0, hVar.c(hVar.a(null)), 0, 0, this.f258889a.e(this.f258891c, null), -3L, null));
        this.f258890b.b(this.f258891c, this.f258892d, hVar.f180745g);
        y((TextView) findViewById(com.planner5d.library.f.j.Qx), hVar.f180747i);
        y((TextView) findViewById(com.planner5d.library.f.j.f168212lg), hVar.f180748j);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        this.f258889a.setScaleType(scaleType);
        this.f258889a.g();
    }
}
