package io.intercom.android.sdk.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes13.dex */
public class ContentAwareScrollView extends ScrollView {
    private Listener listener;

    public interface Listener {
        void onBottomReached();

        void onScrollChanged(int i10);
    }

    public ContentAwareScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public Listener getListener() {
        return this.listener;
    }

    public boolean isAtBottom() {
        int bottom = getChildAt(0).getBottom();
        return bottom != 0 && getBottom() + getScrollY() >= bottom;
    }

    protected void notifyListenerIfAtBottom() {
        if (this.listener == null || !isAtBottom()) {
            return;
        }
        this.listener.onBottomReached();
    }

    protected void notifyListenerScrollChanged(int i10) {
        Listener listener = this.listener;
        if (listener != null) {
            listener.onScrollChanged(i10);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        notifyListenerIfAtBottom();
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        notifyListenerIfAtBottom();
        notifyListenerScrollChanged(i11);
    }

    public void setListener(Listener listener) {
        this.listener = listener;
        notifyListenerIfAtBottom();
    }

    public ContentAwareScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ContentAwareScrollView(Context context) {
        super(context);
    }
}
