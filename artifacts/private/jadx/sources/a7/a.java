package a7;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.f;
import androidx.annotation.g1;
import androidx.annotation.p0;
import androidx.appcompat.view.d;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f561a = {R.attr.theme, r6.a.c.f359435nj};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f562b = {r6.a.c.Wc};

    private a() {
    }

    @g1
    private static int a(@NonNull Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f561a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    @g1
    private static int b(@NonNull Context context, @p0 AttributeSet attributeSet, @f int i10, @g1 int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f562b, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    @NonNull
    public static Context c(@NonNull Context context, @p0 AttributeSet attributeSet, @f int i10, @g1 int i11) {
        int iB = b(context, attributeSet, i10, i11);
        boolean z10 = (context instanceof d) && ((d) context).c() == iB;
        if (iB == 0 || z10) {
            return context;
        }
        d dVar = new d(context, iB);
        int iA = a(context, attributeSet);
        if (iA != 0) {
            dVar.getTheme().applyStyle(iA, true);
        }
        return dVar;
    }
}
