package androidx.compose.ui.graphics.colorspace;

import androidx.annotation.d1;
import androidx.compose.ui.graphics.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,717:1\n53#2,3:718\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n*L\n246#1:718,3\n*E\n"})
public abstract class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f37579d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f37580e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f37581f = 63;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f37582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f37583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f37584c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(String str, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, i10);
    }

    @d1(min = 3)
    @NotNull
    public final float[] a(float f10, float f11, float f12) {
        float[] fArr = new float[b.j(this.f37583b)];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        return b(fArr);
    }

    @d1(min = 3)
    @NotNull
    public abstract float[] b(@d1(min = 3) @NotNull float[] fArr);

    @androidx.annotation.g0(from = 1, to = 4)
    public final int c() {
        return b.j(this.f37583b);
    }

    public final int d() {
        return this.f37584c;
    }

    public abstract float e(@androidx.annotation.g0(from = 0, to = 3) int i10);

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f37584c == cVar.f37584c && Intrinsics.areEqual(this.f37582a, cVar.f37582a)) {
            return b.h(this.f37583b, cVar.f37583b);
        }
        return false;
    }

    public abstract float f(@androidx.annotation.g0(from = 0, to = 3) int i10);

    public final long g() {
        return this.f37583b;
    }

    @NotNull
    public final String h() {
        return this.f37582a;
    }

    public int hashCode() {
        return (((this.f37582a.hashCode() * 31) + b.k(this.f37583b)) * 31) + this.f37584c;
    }

    public boolean i() {
        return false;
    }

    public abstract boolean j();

    public long k(float f10, float f11, float f12) {
        float[] fArrL = l(f10, f11, f12);
        float f13 = fArrL[0];
        float f14 = fArrL[1];
        return (((long) Float.floatToRawIntBits(f13)) << 32) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(f14)));
    }

    @d1(3)
    @NotNull
    public final float[] l(float f10, float f11, float f12) {
        return m(new float[]{f10, f11, f12});
    }

    @d1(min = 3)
    @NotNull
    public abstract float[] m(@d1(min = 3) @NotNull float[] fArr);

    public float n(float f10, float f11, float f12) {
        return l(f10, f11, f12)[2];
    }

    public long o(float f10, float f11, float f12, float f13, @NotNull c cVar) {
        float[] fArrA = a(f10, f11, f12);
        return s0.a(fArrA[0], fArrA[1], fArrA[2], f13, cVar);
    }

    @NotNull
    public String toString() {
        return this.f37582a + " (id=" + this.f37584c + ", model=" + ((Object) b.l(this.f37583b)) + ')';
    }

    public /* synthetic */ c(String str, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10);
    }

    private c(String str, long j10, int i10) {
        this.f37582a = str;
        this.f37583b = j10;
        this.f37584c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    private c(String str, long j10) {
        this(str, j10, -1, null);
    }
}
