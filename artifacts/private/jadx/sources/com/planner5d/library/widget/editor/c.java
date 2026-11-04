package com.planner5d.library.widget.editor;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;

/* JADX INFO: loaded from: classes12.dex */
public class c extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SwitchCompat f254349a;

    public c(Context context, boolean z10) {
        super(context);
        setOrientation(0);
        c(context, com.planner5d.library.f.h.f167625k6, false, z10);
        SwitchCompat switchCompatA = com.planner5d.library.services.d.f224235a.a(context, true);
        this.f254349a = switchCompatA;
        b(switchCompatA, true);
        switchCompatA.setEnabled(z10);
        c(context, com.planner5d.library.f.h.f167663m6, true, z10);
        setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f254348a.d(view);
            }
        });
    }

    private void b(View view, boolean z10) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.planner5d.library.f.g.Th);
        layoutParams.leftMargin = dimensionPixelSize;
        if (z10) {
            layoutParams.rightMargin = dimensionPixelSize;
        }
        addView(view, layoutParams);
    }

    private ImageView c(Context context, int i10, boolean z10, boolean z11) {
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(com.planner5d.library.widget.drawable.c.f254258a.a(context, i10, Integer.valueOf(androidx.core.content.d.g(getContext(), z11 ? com.planner5d.library.f.C1549f.Rn : com.planner5d.library.f.C1549f.Qn))));
        b(imageView, z10);
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        setChecked(!this.f254349a.isChecked());
    }

    public void setChecked(boolean z10) {
        this.f254349a.setChecked(z10);
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f254349a.setOnCheckedChangeListener(onCheckedChangeListener);
    }
}
