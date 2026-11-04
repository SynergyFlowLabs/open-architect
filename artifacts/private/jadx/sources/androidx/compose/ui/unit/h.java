package androidx.compose.ui.unit;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@o2
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,435:1\n102#2:436\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n74#1:436\n*E\n"})
public final class h implements Comparable<h> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f42689b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f42690c = r(0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f42691d = r(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f42692e = r(Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f42693a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @k7
        public static /* synthetic */ void b() {
        }

        @k7
        public static /* synthetic */ void d() {
        }

        @k7
        public static /* synthetic */ void f() {
        }

        public final float a() {
            return h.f42690c;
        }

        public final float c() {
            return h.f42691d;
        }

        public final float e() {
            return h.f42692e;
        }

        private a() {
        }
    }

    private /* synthetic */ h(float f10) {
        this.f42693a = f10;
    }

    public static int D(float f10) {
        return Float.hashCode(f10);
    }

    @k7
    public static final float E(float f10, float f11) {
        return r(f10 - f11);
    }

    @k7
    public static final float H(float f10, float f11) {
        return r(f10 + f11);
    }

    @k7
    public static final float I(float f10, float f11) {
        return r(f10 * f11);
    }

    @k7
    public static final float L(float f10, int i10) {
        return r(f10 * i10);
    }

    @k7
    @NotNull
    public static String M(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @k7
    public static final float N(float f10) {
        return r(-f10);
    }

    public static final /* synthetic */ h o(float f10) {
        return new h(f10);
    }

    @k7
    public static int q(float f10, float f11) {
        return Float.compare(f10, f11);
    }

    public static float r(float f10) {
        return f10;
    }

    @k7
    public static final float s(float f10, float f11) {
        return f10 / f11;
    }

    @k7
    public static final float t(float f10, float f11) {
        return r(f10 / f11);
    }

    @k7
    public static final float v(float f10, int i10) {
        return r(f10 / i10);
    }

    public static boolean w(float f10, Object obj) {
        return (obj instanceof h) && Float.compare(f10, ((h) obj).O()) == 0;
    }

    public static final boolean x(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    public final /* synthetic */ float O() {
        return this.f42693a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(h hVar) {
        return p(hVar.O());
    }

    public boolean equals(Object obj) {
        return w(this.f42693a, obj);
    }

    public int hashCode() {
        return D(this.f42693a);
    }

    @k7
    public int p(float f10) {
        return q(this.f42693a, f10);
    }

    @k7
    @NotNull
    public String toString() {
        return M(this.f42693a);
    }

    public final float z() {
        return this.f42693a;
    }
}
