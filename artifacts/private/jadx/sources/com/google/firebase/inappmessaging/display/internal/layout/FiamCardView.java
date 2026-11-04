package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes5.dex */
public class FiamCardView extends CardView implements a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.firebase.inappmessaging.display.internal.layout.util.a f122433j;

    public FiamCardView(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Boolean boolA = this.f122433j.a(keyEvent);
        return boolA != null ? boolA.booleanValue() : super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.a
    public void setDismissListener(View.OnClickListener onClickListener) {
        this.f122433j = new com.google.firebase.inappmessaging.display.internal.layout.util.a(this, onClickListener);
    }

    public FiamCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FiamCardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
