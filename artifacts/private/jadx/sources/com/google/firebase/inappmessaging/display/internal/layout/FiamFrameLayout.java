package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes5.dex */
public class FiamFrameLayout extends FrameLayout implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.firebase.inappmessaging.display.internal.layout.util.a f122434a;

    public FiamFrameLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Boolean boolA = this.f122434a.a(keyEvent);
        return boolA != null ? boolA.booleanValue() : super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.a
    public void setDismissListener(View.OnClickListener onClickListener) {
        this.f122434a = new com.google.firebase.inappmessaging.display.internal.layout.util.a(this, onClickListener);
    }

    public FiamFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FiamFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @w0(21)
    public FiamFrameLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
