package v6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.f;
import androidx.annotation.p0;
import com.google.android.material.internal.g0;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class c {
    private c() {
    }

    @NonNull
    public static Rect a(@NonNull Context context, @f int i10, int i11) {
        int i12 = 4 ^ 0;
        TypedArray typedArrayK = g0.k(context, null, r6.a.o.Ll, i10, i11, new int[0]);
        int dimensionPixelSize = typedArrayK.getDimensionPixelSize(r6.a.o.Ol, context.getResources().getDimensionPixelSize(r6.a.f.f360301ma));
        int dimensionPixelSize2 = typedArrayK.getDimensionPixelSize(r6.a.o.Pl, context.getResources().getDimensionPixelSize(r6.a.f.f360317na));
        int dimensionPixelSize3 = typedArrayK.getDimensionPixelSize(r6.a.o.Nl, context.getResources().getDimensionPixelSize(r6.a.f.f360285la));
        int dimensionPixelSize4 = typedArrayK.getDimensionPixelSize(r6.a.o.Ml, context.getResources().getDimensionPixelSize(r6.a.f.f360269ka));
        typedArrayK.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }

    @NonNull
    public static InsetDrawable b(@p0 Drawable drawable, @NonNull Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
