package com.planner5d.library.widget.editor.propertiesbar;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.planner5d.library.widget.w1;

/* JADX INFO: loaded from: classes8.dex */
@e.a({"AppCompatCustomView"})
public class PropertiesButtonView extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f258130a;

    public PropertiesButtonView(Context context) {
        super(context);
    }

    private void setPressedUi(boolean z10) {
        int iG = z10 ? androidx.core.content.d.g(getContext(), com.planner5d.library.f.C1549f.f166427i2) : -1052175;
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            setBackgroundColor(iG);
        } else {
            com.planner5d.library.widget.drawable.c.f254258a.i(getBackground(), Integer.valueOf(iG));
        }
        com.planner5d.library.widget.drawable.c.f254258a.i(this.f258130a, Integer.valueOf(z10 ? -1 : androidx.core.content.d.g(getContext(), com.planner5d.library.f.C1549f.F3)));
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        setPressedUi(w1.f258867a.a(this));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f258130a = drawable;
        setPressedUi(false);
        super.setImageDrawable(this.f258130a);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        setImageDrawable(com.planner5d.library.widget.drawable.c.f254258a.b(getContext(), i10));
    }

    public PropertiesButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PropertiesButtonView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
