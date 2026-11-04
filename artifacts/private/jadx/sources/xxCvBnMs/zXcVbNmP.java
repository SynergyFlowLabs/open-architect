package xxCvBnMs;

import android.content.Context;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes14.dex */
public final class zXcVbNmP extends LinearLayout {
    public zXcVbNmP(Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getMeasuredWidth() > 1000) {
            setMeasuredDimension(1000, getMeasuredHeight());
        }
    }
}
