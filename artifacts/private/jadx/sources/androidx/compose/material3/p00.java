package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderRange\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,3223:1\n1#2:3224\n60#3:3225\n70#3:3227\n22#4:3226\n22#4:3228\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderRange\n*L\n3153#1:3225\n3162#1:3227\n3153#1:3226\n3162#1:3228\n*E\n"})
public final class p00 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f31525b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f31526c = j00.U(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f31527a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @androidx.compose.runtime.k7
        public static /* synthetic */ void b() {
        }

        public final long a() {
            return p00.f31526c;
        }

        private a() {
        }
    }

    private /* synthetic */ p00(long j10) {
        this.f31527a = j10;
    }

    public static final /* synthetic */ p00 b(long j10) {
        return new p00(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof p00) && j10 == ((p00) obj).m();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    @androidx.compose.runtime.k7
    public static /* synthetic */ void f() {
    }

    public static final float g(long j10) {
        if (j10 != f31526c) {
            return Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
        }
        throw new IllegalStateException("SliderRange is unspecified");
    }

    @androidx.compose.runtime.k7
    public static /* synthetic */ void i() {
    }

    public static final float j(long j10) {
        if (j10 != f31526c) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        throw new IllegalStateException("SliderRange is unspecified");
    }

    public static int k(long j10) {
        return Long.hashCode(j10);
    }

    @NotNull
    public static String l(long j10) {
        if (!j00.p0(j10)) {
            return "FloatRange.Unspecified";
        }
        return j(j10) + ".." + g(j10);
    }

    public boolean equals(Object obj) {
        return d(this.f31527a, obj);
    }

    public final long h() {
        return this.f31527a;
    }

    public int hashCode() {
        return k(this.f31527a);
    }

    public final /* synthetic */ long m() {
        return this.f31527a;
    }

    @NotNull
    public String toString() {
        return l(this.f31527a);
    }
}
