package androidx.compose.foundation.layout;

import android.graphics.Insets;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(30)
interface h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f16079a = a.f16080a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f16080a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final b f16081b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final d f16082c = new d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private static final c f16083d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private static final C0100a f16084e = new C0100a();

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.h6$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/SideCalculator$Companion$BottomSideCalculator$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,708:1\n69#2:709\n70#3:710\n53#3,3:713\n22#4:711\n30#5:712\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/SideCalculator$Companion$BottomSideCalculator$1\n*L\n548#1:709\n548#1:710\n548#1:713,3\n548#1:711\n548#1:712\n*E\n"})
        public static final class C0100a implements h6 {
            C0100a() {
            }

            @Override // androidx.compose.foundation.layout.h6
            public long c(long j10) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
                return n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(fIntBitsToFloat))));
            }

            @Override // androidx.compose.foundation.layout.h6
            public float d(float f10, float f11) {
                return -f11;
            }

            @Override // androidx.compose.foundation.layout.h6
            public Insets e(Insets insets, int i10) {
                return Insets.of(insets.left, insets.top, insets.right, i10);
            }

            @Override // androidx.compose.foundation.layout.h6
            public int f(Insets insets) {
                return insets.bottom;
            }

            @Override // androidx.compose.foundation.layout.h6
            public long g(long j10, float f10) {
                return androidx.compose.ui.unit.d0.a(0.0f, androidx.compose.ui.unit.c0.n(j10) + f10);
            }
        }

        @SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/SideCalculator$Companion$LeftSideCalculator$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,708:1\n65#2:709\n60#3:710\n53#3,3:713\n22#4:711\n30#5:712\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/SideCalculator$Companion$LeftSideCalculator$1\n*L\n503#1:709\n503#1:710\n503#1:713,3\n503#1:711\n503#1:712\n*E\n"})
        public static final class b implements h6 {
            b() {
            }

            @Override // androidx.compose.foundation.layout.h6
            public long c(long j10) {
                return n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
            }

            @Override // androidx.compose.foundation.layout.h6
            public float d(float f10, float f11) {
                return f10;
            }

            @Override // androidx.compose.foundation.layout.h6
            public Insets e(Insets insets, int i10) {
                return Insets.of(i10, insets.top, insets.right, insets.bottom);
            }

            @Override // androidx.compose.foundation.layout.h6
            public int f(Insets insets) {
                return insets.left;
            }

            @Override // androidx.compose.foundation.layout.h6
            public long g(long j10, float f10) {
                return androidx.compose.ui.unit.d0.a(androidx.compose.ui.unit.c0.l(j10) - f10, 0.0f);
            }
        }

        @SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/SideCalculator$Companion$RightSideCalculator$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,708:1\n65#2:709\n60#3:710\n53#3,3:713\n22#4:711\n30#5:712\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/SideCalculator$Companion$RightSideCalculator$1\n*L\n533#1:709\n533#1:710\n533#1:713,3\n533#1:711\n533#1:712\n*E\n"})
        public static final class c implements h6 {
            c() {
            }

            @Override // androidx.compose.foundation.layout.h6
            public long c(long j10) {
                return n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
            }

            @Override // androidx.compose.foundation.layout.h6
            public float d(float f10, float f11) {
                return -f10;
            }

            @Override // androidx.compose.foundation.layout.h6
            public Insets e(Insets insets, int i10) {
                return Insets.of(insets.left, insets.top, i10, insets.bottom);
            }

            @Override // androidx.compose.foundation.layout.h6
            public int f(Insets insets) {
                return insets.right;
            }

            @Override // androidx.compose.foundation.layout.h6
            public long g(long j10, float f10) {
                return androidx.compose.ui.unit.d0.a(androidx.compose.ui.unit.c0.l(j10) + f10, 0.0f);
            }
        }

        @SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/SideCalculator$Companion$TopSideCalculator$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,708:1\n69#2:709\n70#3:710\n53#3,3:713\n22#4:711\n30#5:712\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/SideCalculator$Companion$TopSideCalculator$1\n*L\n518#1:709\n518#1:710\n518#1:713,3\n518#1:711\n518#1:712\n*E\n"})
        public static final class d implements h6 {
            d() {
            }

            @Override // androidx.compose.foundation.layout.h6
            public long c(long j10) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
                return n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(fIntBitsToFloat))));
            }

            @Override // androidx.compose.foundation.layout.h6
            public float d(float f10, float f11) {
                return f11;
            }

            @Override // androidx.compose.foundation.layout.h6
            public Insets e(Insets insets, int i10) {
                return Insets.of(insets.left, i10, insets.right, insets.bottom);
            }

            @Override // androidx.compose.foundation.layout.h6
            public int f(Insets insets) {
                return insets.top;
            }

            @Override // androidx.compose.foundation.layout.h6
            public long g(long j10, float f10) {
                return androidx.compose.ui.unit.d0.a(0.0f, androidx.compose.ui.unit.c0.n(j10) - f10);
            }
        }

        private a() {
        }

        @NotNull
        public final h6 a(int i10, @NotNull androidx.compose.ui.unit.w wVar) {
            v7.a aVar = v7.f16497b;
            if (v7.p(i10, aVar.h())) {
                return f16081b;
            }
            if (v7.p(i10, aVar.k())) {
                return f16082c;
            }
            if (v7.p(i10, aVar.i())) {
                return f16083d;
            }
            if (v7.p(i10, aVar.e())) {
                return f16084e;
            }
            if (v7.p(i10, aVar.j())) {
                return wVar == androidx.compose.ui.unit.w.Ltr ? f16081b : f16083d;
            }
            if (v7.p(i10, aVar.f())) {
                return wVar == androidx.compose.ui.unit.w.Ltr ? f16083d : f16081b;
            }
            throw new IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed");
        }
    }

    default float a(float f10, float f11) {
        return kotlin.ranges.r.t(d(f10, f11), 0.0f);
    }

    default float b(float f10, float f11) {
        return kotlin.ranges.r.A(d(f10, f11), 0.0f);
    }

    long c(long j10);

    float d(float f10, float f11);

    @NotNull
    Insets e(@NotNull Insets insets, int i10);

    int f(@NotNull Insets insets);

    long g(long j10, float f10);
}
