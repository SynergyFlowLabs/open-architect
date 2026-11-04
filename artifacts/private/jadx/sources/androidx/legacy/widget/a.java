package androidx.legacy.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class a extends View {
    @Deprecated
    public a(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    private static int a(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? i10 : size;
        }
        return Math.min(i10, size);
    }

    @Override // android.view.View
    @e.a({"MissingSuperCall"})
    @Deprecated
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    @Deprecated
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(a(getSuggestedMinimumWidth(), i10), a(getSuggestedMinimumHeight(), i11));
    }

    @Deprecated
    public a(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public a(@NonNull Context context) {
        this(context, null);
    }
}
