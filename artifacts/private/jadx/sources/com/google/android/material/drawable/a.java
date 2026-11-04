package com.google.android.material.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l;
import androidx.annotation.n1;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.core.graphics.drawable.c;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f112536a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f112537b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f112538c = -1;

    /* JADX INFO: renamed from: com.google.android.material.drawable.a$a, reason: collision with other inner class name */
    @w0(21)
    private static class C0985a {
        private C0985a() {
        }

        @u
        static void a(@NonNull Outline outline, @NonNull Path path) {
            outline.setConvexPath(path);
        }
    }

    @w0(30)
    private static class b {
        private b() {
        }

        @u
        static void a(@NonNull Outline outline, @NonNull Path path) {
            outline.setPath(path);
        }
    }

    private a() {
    }

    @p0
    public static Drawable a(@p0 Drawable drawable, @p0 Drawable drawable2) {
        return b(drawable, drawable2, -1, -1);
    }

    @p0
    public static Drawable b(@p0 Drawable drawable, @p0 Drawable drawable2, @t0 int i10, @t0 int i11) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i10 == -1) {
            i10 = i(drawable, drawable2);
        }
        if (i11 == -1) {
            i11 = h(drawable, drawable2);
        }
        if (i10 > drawable.getIntrinsicWidth() || i11 > drawable.getIntrinsicHeight()) {
            float f10 = i10 / i11;
            if (f10 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i11 = (int) (intrinsicWidth / f10);
                i10 = intrinsicWidth;
            } else {
                i11 = drawable.getIntrinsicHeight();
                i10 = (int) (f10 * i11);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i10, i11);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    @p0
    public static Drawable c(@p0 Drawable drawable, @p0 ColorStateList colorStateList, @p0 PorterDuff.Mode mode) {
        return e(drawable, colorStateList, mode, false);
    }

    @p0
    public static Drawable d(@p0 Drawable drawable, @p0 ColorStateList colorStateList, @p0 PorterDuff.Mode mode) {
        return e(drawable, colorStateList, mode, false);
    }

    @p0
    private static Drawable e(@p0 Drawable drawable, @p0 ColorStateList colorStateList, @p0 PorterDuff.Mode mode, boolean z10) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList == null) {
            if (z10) {
                drawable.mutate();
            }
            return drawable;
        }
        Drawable drawableMutate = c.r(drawable).mutate();
        if (mode != null) {
            c.p(drawableMutate, mode);
        }
        return drawableMutate;
    }

    @NonNull
    public static int[] f(@NonNull int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 == 16842912) {
                return iArr;
            }
            if (i11 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i10] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    @p0
    public static ColorStateList g(@p0 Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (drawable instanceof ColorStateListDrawable) {
            return ((ColorStateListDrawable) drawable).getColorStateList();
        }
        return null;
    }

    private static int h(@NonNull Drawable drawable, @NonNull Drawable drawable2) {
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        return intrinsicHeight != -1 ? intrinsicHeight : drawable.getIntrinsicHeight();
    }

    private static int i(@NonNull Drawable drawable, @NonNull Drawable drawable2) {
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        return intrinsicWidth != -1 ? intrinsicWidth : drawable.getIntrinsicWidth();
    }

    @NonNull
    public static int[] j(@NonNull int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 != 16842912) {
                iArr2[i10] = i11;
                i10++;
            }
        }
        return iArr2;
    }

    @NonNull
    public static AttributeSet k(@NonNull Context context, @n1 int i10, @NonNull CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i10);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
                int i11 = 7 & 1;
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (TextUtils.equals(xml.getName(), charSequence)) {
                return Xml.asAttributeSet(xml);
            }
            throw new XmlPullParserException("Must have a <" + ((Object) charSequence) + "> start tag");
        } catch (IOException | XmlPullParserException e10) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i10));
            notFoundException.initCause(e10);
            throw notFoundException;
        }
    }

    public static void l(@NonNull Outline outline, @NonNull Path path) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.a(outline, path);
        } else {
            try {
                C0985a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @e.b(21)
    public static void m(@p0 RippleDrawable rippleDrawable, int i10) {
        rippleDrawable.setRadius(i10);
    }

    public static void n(@NonNull Drawable drawable, @l int i10) {
        if (i10 != 0) {
            c.n(drawable, i10);
        } else {
            c.o(drawable, null);
        }
    }

    @p0
    public static PorterDuffColorFilter o(@NonNull Drawable drawable, @p0 ColorStateList colorStateList, @p0 PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
