package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.h1;
import androidx.annotation.l;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.vector.j;
import androidx.core.content.res.d;
import androidx.core.content.res.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f38324d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final XmlPullParser f38325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @f
    @NotNull
    public final j f38327c;

    public a(@NotNull XmlPullParser xmlPullParser, int i10) {
        this.f38325a = xmlPullParser;
        this.f38326b = i10;
        this.f38327c = new j();
    }

    public static /* synthetic */ a d(a aVar, XmlPullParser xmlPullParser, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            xmlPullParser = aVar.f38325a;
        }
        if ((i11 & 2) != 0) {
            i10 = aVar.f38326b;
        }
        return aVar.c(xmlPullParser, i10);
    }

    private final void r(int i10) {
        this.f38326b = i10 | this.f38326b;
    }

    @NotNull
    public final XmlPullParser a() {
        return this.f38325a;
    }

    public final int b() {
        return this.f38326b;
    }

    @NotNull
    public final a c(@NotNull XmlPullParser xmlPullParser, int i10) {
        return new a(xmlPullParser, i10);
    }

    public final int e() {
        return this.f38326b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f38325a, aVar.f38325a) && this.f38326b == aVar.f38326b;
    }

    public final float f(@NotNull TypedArray typedArray, int i10, float f10) {
        float dimension = typedArray.getDimension(i10, f10);
        r(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float g(@NotNull TypedArray typedArray, int i10, float f10) {
        float f11 = typedArray.getFloat(i10, f10);
        r(typedArray.getChangingConfigurations());
        return f11;
    }

    public final int h(@NotNull TypedArray typedArray, int i10, int i11) {
        int i12 = typedArray.getInt(i10, i11);
        r(typedArray.getChangingConfigurations());
        return i12;
    }

    public int hashCode() {
        return (this.f38325a.hashCode() * 31) + Integer.hashCode(this.f38326b);
    }

    public final boolean i(@NotNull TypedArray typedArray, @NotNull String str, @h1 int i10, boolean z10) {
        boolean zE = n.e(typedArray, this.f38325a, str, i10, z10);
        r(typedArray.getChangingConfigurations());
        return zE;
    }

    @Nullable
    public final ColorStateList j(@NotNull TypedArray typedArray, @Nullable Resources.Theme theme, @NotNull String str, @h1 int i10) {
        ColorStateList colorStateListG = n.g(typedArray, this.f38325a, theme, str, i10);
        r(typedArray.getChangingConfigurations());
        return colorStateListG;
    }

    @NotNull
    public final d k(@NotNull TypedArray typedArray, @Nullable Resources.Theme theme, @NotNull String str, @h1 int i10, @l int i11) {
        d dVarI = n.i(typedArray, this.f38325a, theme, str, i10, i11);
        r(typedArray.getChangingConfigurations());
        return dVarI;
    }

    public final float l(@NotNull TypedArray typedArray, @NotNull String str, @h1 int i10, float f10) {
        float fJ = n.j(typedArray, this.f38325a, str, i10, f10);
        r(typedArray.getChangingConfigurations());
        return fJ;
    }

    public final int m(@NotNull TypedArray typedArray, @NotNull String str, @h1 int i10, int i11) {
        int iK = n.k(typedArray, this.f38325a, str, i10, i11);
        r(typedArray.getChangingConfigurations());
        return iK;
    }

    @Nullable
    public final String n(@NotNull TypedArray typedArray, int i10) {
        String string = typedArray.getString(i10);
        r(typedArray.getChangingConfigurations());
        return string;
    }

    @NotNull
    public final XmlPullParser o() {
        return this.f38325a;
    }

    @NotNull
    public final TypedArray p(@NotNull Resources resources, @Nullable Resources.Theme theme, @NotNull AttributeSet attributeSet, @NotNull int[] iArr) {
        TypedArray typedArrayS = n.s(resources, theme, attributeSet, iArr);
        r(typedArrayS.getChangingConfigurations());
        return typedArrayS;
    }

    public final void q(int i10) {
        this.f38326b = i10;
    }

    @NotNull
    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.f38325a + ", config=" + this.f38326b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(XmlPullParser xmlPullParser, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 2) != 0) {
            i10 = 0;
            boolean z10 = true | false;
        }
        this(xmlPullParser, i10);
    }
}
