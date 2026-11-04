package f1;

import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.compose.runtime.internal.w0;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@b1({b1.a.LIBRARY_GROUP})
public final class c implements f1.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f274926c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f274927d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final float[] f274928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final float[] f274929b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float b(float f10, float[] fArr, float[] fArr2) {
            float f11;
            float f12;
            float f13;
            float fA;
            float fAbs = Math.abs(f10);
            float fSignum = Math.signum(f10);
            int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
            if (iBinarySearch >= 0) {
                fA = fArr2[iBinarySearch];
            } else {
                int i10 = -(iBinarySearch + 1);
                int i11 = i10 - 1;
                float f14 = 0.0f;
                if (i11 >= fArr.length - 1) {
                    float f15 = fArr[fArr.length - 1];
                    float f16 = fArr2[fArr.length - 1];
                    if (f15 == 0.0f) {
                        return 0.0f;
                    }
                    return f10 * (f16 / f15);
                }
                if (i11 == -1) {
                    f11 = fArr[0];
                    f13 = fArr2[0];
                    f12 = 0.0f;
                } else {
                    f14 = fArr[i11];
                    f11 = fArr[i10];
                    f12 = fArr2[i11];
                    f13 = fArr2[i10];
                }
                fA = d.f274930a.a(f12, f13, f14, f11, fAbs);
            }
            return fSignum * fA;
        }

        private a() {
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    public c(@NotNull float[] fArr, @NotNull float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f274928a = fArr;
        this.f274929b = fArr2;
    }

    @l1
    public static /* synthetic */ void d() {
    }

    @l1
    public static /* synthetic */ void f() {
    }

    @Override // f1.a
    public float a(float f10) {
        return f274926c.b(f10, this.f274929b, this.f274928a);
    }

    @Override // f1.a
    public float b(float f10) {
        return f274926c.b(f10, this.f274928a, this.f274929b);
    }

    @NotNull
    public final float[] c() {
        return this.f274928a;
    }

    @NotNull
    public final float[] e() {
        return this.f274929b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof c)) {
            c cVar = (c) obj;
            return Arrays.equals(this.f274928a, cVar.f274928a) && Arrays.equals(this.f274929b, cVar.f274929b);
        }
        return false;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f274928a) * 31) + Arrays.hashCode(this.f274929b);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f274928a);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb2.append(string);
        sb2.append(", toDpValues=");
        String string2 = Arrays.toString(this.f274929b);
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sb2.append(string2);
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }
}
