package z6;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.h1;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.resources.b;
import com.google.android.material.resources.c;

/* JADX INFO: loaded from: classes4.dex */
public class a extends AppCompatTextView {
    public a(@NonNull Context context) {
        this(context, null);
    }

    private void i(@NonNull Resources.Theme theme, int i10) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i10, r6.a.o.co);
        int iM = m(getContext(), typedArrayObtainStyledAttributes, r6.a.o.fo, r6.a.o.go);
        typedArrayObtainStyledAttributes.recycle();
        if (iM >= 0) {
            setLineHeight(iM);
        }
    }

    private static boolean j(Context context) {
        int i10 = 4 << 1;
        return b.b(context, r6.a.c.Mi, true);
    }

    private static int k(@NonNull Resources.Theme theme, @p0 AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, r6.a.o.ho, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(r6.a.o.f361815io, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private void l(@p0 AttributeSet attributeSet, int i10, int i11) {
        int iK;
        Context context = getContext();
        if (j(context)) {
            Resources.Theme theme = context.getTheme();
            if (!n(context, theme, attributeSet, i10, i11) && (iK = k(theme, attributeSet, i10, i11)) != -1) {
                i(theme, iK);
            }
        }
    }

    private static int m(@NonNull Context context, @NonNull TypedArray typedArray, @NonNull @h1 int... iArr) {
        int iD = -1;
        for (int i10 = 0; i10 < iArr.length && iD < 0; i10++) {
            iD = c.d(context, typedArray, iArr[i10], -1);
        }
        return iD;
    }

    private static boolean n(@NonNull Context context, @NonNull Resources.Theme theme, @p0 AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, r6.a.o.ho, i10, i11);
        int iM = m(context, typedArrayObtainStyledAttributes, r6.a.o.jo, r6.a.o.ko);
        typedArrayObtainStyledAttributes.recycle();
        return iM != -1;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(@NonNull Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (j(context)) {
            i(context.getTheme(), i10);
        }
    }

    public a(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public a(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        super(a7.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        l(attributeSet, i10, 0);
    }

    @Deprecated
    public a(@NonNull Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
        super(a7.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        l(attributeSet, i10, i11);
    }
}
