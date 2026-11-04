package com.planner5d.library.widget.editor.popup.floors.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.annotation.n;
import androidx.appcompat.widget.AppCompatTextView;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.widget.w1;

/* JADX INFO: loaded from: classes8.dex */
public class a extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n
    private int f257225a;

    public a(Context context) {
        super(context);
        this.f257225a = com.planner5d.library.f.C1549f.G5;
        setGravity(8388627);
        Resources resources = getResources();
        setTextAlignment(5);
        setLayoutDirection(h3.U(getContext()) ? 1 : 0);
        setPadding((int) resources.getDimension(com.planner5d.library.f.g.f167420zh), 0, (int) resources.getDimension(com.planner5d.library.f.g.Lh), 0);
        setCompoundDrawablePadding((int) resources.getDimension(com.planner5d.library.f.g.Th));
        setPressedUi(false);
    }

    private void setPressedUi(boolean z10) {
        Context context = getContext();
        setBackgroundColor(z10 ? androidx.core.content.d.g(context, com.planner5d.library.f.C1549f.f166427i2) : 0);
        setTextColor(z10 ? -1 : androidx.core.content.d.g(context, this.f257225a));
        com.planner5d.library.widget.drawable.c.f254258a.j(getCompoundDrawables(), Integer.valueOf(z10 ? -1 : androidx.core.content.d.g(context, this.f257225a)));
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        setPressedUi(w1.f258867a.a(this));
    }

    public void setIconAndTextColor(@n int i10) {
        this.f257225a = i10;
        setPressedUi(false);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f257225a = com.planner5d.library.f.C1549f.G5;
        setGravity(8388627);
        Resources resources = getResources();
        setTextAlignment(5);
        setLayoutDirection(h3.U(getContext()) ? 1 : 0);
        setPadding((int) resources.getDimension(com.planner5d.library.f.g.f167420zh), 0, (int) resources.getDimension(com.planner5d.library.f.g.Lh), 0);
        setCompoundDrawablePadding((int) resources.getDimension(com.planner5d.library.f.g.Th));
        setPressedUi(false);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f257225a = com.planner5d.library.f.C1549f.G5;
        setGravity(8388627);
        Resources resources = getResources();
        setTextAlignment(5);
        setLayoutDirection(h3.U(getContext()) ? 1 : 0);
        setPadding((int) resources.getDimension(com.planner5d.library.f.g.f167420zh), 0, (int) resources.getDimension(com.planner5d.library.f.g.Lh), 0);
        setCompoundDrawablePadding((int) resources.getDimension(com.planner5d.library.f.g.Th));
        setPressedUi(false);
    }
}
