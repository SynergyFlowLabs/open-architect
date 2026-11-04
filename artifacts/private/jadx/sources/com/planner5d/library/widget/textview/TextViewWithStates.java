package com.planner5d.library.widget.textview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes8.dex */
public class TextViewWithStates extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f258823a;

    public interface a {
        void a();
    }

    public TextViewWithStates(Context context) {
        super(context);
        this.f258823a = null;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        a aVar = this.f258823a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setOnDrawableStateChangedListener(a aVar) {
        this.f258823a = aVar;
    }

    public TextViewWithStates(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f258823a = null;
    }

    public TextViewWithStates(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f258823a = null;
    }
}
