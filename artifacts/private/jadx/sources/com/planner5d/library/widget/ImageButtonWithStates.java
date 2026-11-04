package com.planner5d.library.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes12.dex */
@e.a({"AppCompatCustomView"})
public class ImageButtonWithStates extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f249465a;

    public interface a {
        void a();
    }

    public ImageButtonWithStates(Context context) {
        super(context);
        int i10 = 2 & 0;
        this.f249465a = null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        a aVar = this.f249465a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setDrawableColor(Integer num) {
        com.planner5d.library.widget.drawable.c.f254258a.i(getDrawable(), num);
    }

    public void setOnDrawableStateChangedListener(a aVar) {
        this.f249465a = aVar;
    }

    public ImageButtonWithStates(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f249465a = null;
    }

    public ImageButtonWithStates(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int i11 = 2 << 0;
        this.f249465a = null;
    }
}
