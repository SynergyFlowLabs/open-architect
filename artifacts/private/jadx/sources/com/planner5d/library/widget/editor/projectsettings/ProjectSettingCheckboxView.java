package com.planner5d.library.widget.editor.projectsettings;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.g1;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.view.j0;
import com.planner5d.library.widget.c1;

/* JADX INFO: loaded from: classes8.dex */
public class ProjectSettingCheckboxView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SwitchCompat f258091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f258092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private CompoundButton.OnCheckedChangeListener f258093c;

    public ProjectSettingCheckboxView(Context context) {
        this(context, null);
    }

    public boolean a() {
        return this.f258091a.isChecked();
    }

    public void b() {
        View[] viewArr = {this.f258091a, this.f258092b};
        for (int i10 = 0; i10 < 2; i10++) {
            View view = viewArr[i10];
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            j0.h(layoutParams, 0);
            j0.g(layoutParams, 0);
            view.setLayoutParams(layoutParams);
            view.setPadding(0, 0, 0, 0);
        }
    }

    public void c() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f258092b.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.gravity = 16;
        this.f258092b.setLayoutParams(layoutParams);
        this.f258092b.setPadding(0, 0, 0, 0);
    }

    public void d(boolean z10, boolean z11) {
        if (z11) {
            this.f258091a.setChecked(z10);
            return;
        }
        this.f258091a.setOnCheckedChangeListener(null);
        this.f258091a.setChecked(z10);
        this.f258091a.setOnCheckedChangeListener(this.f258093c);
    }

    public void setChecked(boolean z10) {
        this.f258091a.setChecked(z10);
    }

    public void setOnCheckedChangeListener(@p0 CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f258093c = onCheckedChangeListener;
        this.f258091a.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public void setTitle(CharSequence charSequence) {
        this.f258092b.setText(charSequence);
    }

    public void setTitleStyle(@g1 int i10) {
        this.f258092b.setTextAppearance(i10);
    }

    public void setTitleTextSize(@q int i10) {
        this.f258092b.setTextSize(0, getResources().getDimensionPixelSize(i10));
    }

    public ProjectSettingCheckboxView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProjectSettingCheckboxView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        View.inflate(context, c1.l.f252190o2, this);
        setBackgroundColor(-1052175);
        setOrientation(0);
        TextView textView = (TextView) findViewById(c1.i.f251985s9);
        this.f258092b = textView;
        SwitchCompat switchCompatA = com.planner5d.library.services.d.f224235a.a(context, false);
        this.f258091a = switchCompatA;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        switchCompatA.setPadding((int) getResources().getDimension(c1.f.f251189oe), 0, (int) getResources().getDimension(c1.f.f251189oe), 0);
        layoutParams.gravity = 8388629;
        addView(switchCompatA, layoutParams);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c1.s.Wv);
        textView.setTextColor(typedArrayObtainStyledAttributes.getColor(c1.s.Yv, -11447722));
        textView.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(c1.s.Xv, getResources().getDimensionPixelSize(c1.f.f251196p3)));
        typedArrayObtainStyledAttributes.recycle();
    }
}
