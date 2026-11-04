package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class UnPressableLinearLayout extends LinearLayout {
    public UnPressableLinearLayout(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z10) {
    }

    public UnPressableLinearLayout(@NonNull Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
