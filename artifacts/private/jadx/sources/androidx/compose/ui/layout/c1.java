package androidx.compose.ui.layout;

import androidx.compose.runtime.k7;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@d1
@SourceDebugExtension({"SMAP\nMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureScope.kt\nandroidx/compose/ui/layout/MeasureScope\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,131:1\n394#2:132\n395#2,2:135\n398#2:138\n57#3,2:133\n60#3:137\n*S KotlinDebug\n*F\n+ 1 MeasureScope.kt\nandroidx/compose/ui/layout/MeasureScope\n*L\n76#1:132\n76#1:135,2\n76#1:138\n76#1:133,2\n76#1:137\n*E\n"})
public interface c1 extends z {

    public static final class a {
        @Deprecated
        public static boolean a(@NotNull c1 c1Var) {
            return c1.super.P5();
        }

        @Deprecated
        @NotNull
        public static b1 b(@NotNull c1 c1Var, int i10, int i11, @NotNull Map<androidx.compose.ui.layout.a, Integer> map, @NotNull Function1<? super i2.a, Unit> function1) {
            return c1.super.S6(i10, i11, map, function1);
        }

        @Deprecated
        @NotNull
        public static b1 c(@NotNull c1 c1Var, int i10, int i11, @NotNull Map<androidx.compose.ui.layout.a, Integer> map, @Nullable Function1<? super v2, Unit> function1, @NotNull Function1<? super i2.a, Unit> function2) {
            return c1.super.f8(i10, i11, map, function1, function2);
        }

        @k7
        @Deprecated
        public static int f(@NotNull c1 c1Var, long j10) {
            return c1.super.c8(j10);
        }

        @k7
        @Deprecated
        public static int g(@NotNull c1 c1Var, float f10) {
            return c1.super.g6(f10);
        }

        @k7
        @Deprecated
        public static float h(@NotNull c1 c1Var, long j10) {
            return c1.super.y(j10);
        }

        @k7
        @Deprecated
        public static float i(@NotNull c1 c1Var, float f10) {
            return c1.super.F3(f10);
        }

        @k7
        @Deprecated
        public static float j(@NotNull c1 c1Var, int i10) {
            return c1.super.D3(i10);
        }

        @k7
        @Deprecated
        public static long k(@NotNull c1 c1Var, long j10) {
            return c1.super.C0(j10);
        }

        @k7
        @Deprecated
        public static float l(@NotNull c1 c1Var, long j10) {
            return c1.super.p6(j10);
        }

        @k7
        @Deprecated
        public static float m(@NotNull c1 c1Var, float f10) {
            return c1.super.S7(f10);
        }

        @k7
        @Deprecated
        @NotNull
        public static n0.j n(@NotNull c1 c1Var, @NotNull androidx.compose.ui.unit.k kVar) {
            return c1.super.N3(kVar);
        }

        @k7
        @Deprecated
        public static long o(@NotNull c1 c1Var, long j10) {
            return c1.super.k4(j10);
        }

        @k7
        @Deprecated
        public static long p(@NotNull c1 c1Var, float f10) {
            return c1.super.d0(f10);
        }

        @k7
        @Deprecated
        public static long q(@NotNull c1 c1Var, float f10) {
            return c1.super.m1(f10);
        }

        @k7
        @Deprecated
        public static long r(@NotNull c1 c1Var, int i10) {
            return c1.super.j1(i10);
        }
    }

    public static final class b implements b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f39281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f39282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<androidx.compose.ui.layout.a, Integer> f39283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Function1<v2, Unit> f39284d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f39285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c1 f39286f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<i2.a, Unit> f39287g;

        /* JADX WARN: Multi-variable type inference failed */
        b(int i10, int i11, Map<androidx.compose.ui.layout.a, Integer> map, Function1<? super v2, Unit> function1, c1 c1Var, Function1<? super i2.a, Unit> function2) {
            this.f39285e = i10;
            this.f39286f = c1Var;
            this.f39287g = function2;
            this.f39281a = i10;
            this.f39282b = i11;
            this.f39283c = map;
            this.f39284d = function1;
        }

        @Override // androidx.compose.ui.layout.b1
        public int getHeight() {
            return this.f39282b;
        }

        @Override // androidx.compose.ui.layout.b1
        public int getWidth() {
            return this.f39281a;
        }

        @Override // androidx.compose.ui.layout.b1
        public Function1<v2, Unit> j() {
            return this.f39284d;
        }

        @Override // androidx.compose.ui.layout.b1
        public Map<androidx.compose.ui.layout.a, Integer> x() {
            return this.f39283c;
        }

        @Override // androidx.compose.ui.layout.b1
        public void y() {
            c1 c1Var = this.f39286f;
            if (c1Var instanceof androidx.compose.ui.node.u0) {
                this.f39287g.invoke(((androidx.compose.ui.node.u0) c1Var).t2());
            } else {
                this.f39287g.invoke(new y2(this.f39285e, this.f39286f.getLayoutDirection(), this.f39286f.getDensity(), this.f39286f.m0()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ b1 J4(c1 c1Var, int i10, int i11, Map map, Function1 function1, Function1 function2, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i12 & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        Map map2 = map;
        if ((i12 & 8) != 0) {
            function1 = null;
        }
        return c1Var.f8(i10, i11, map2, function1, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ b1 h6(c1 c1Var, int i10, int i11, Map map, Function1 function1, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i12 & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        return c1Var.S6(i10, i11, map, function1);
    }

    @NotNull
    default b1 S6(int i10, int i11, @NotNull Map<androidx.compose.ui.layout.a, Integer> map, @NotNull Function1<? super i2.a, Unit> function1) {
        return f8(i10, i11, map, null, function1);
    }

    @NotNull
    default b1 f8(int i10, int i11, @NotNull Map<androidx.compose.ui.layout.a, Integer> map, @Nullable Function1<? super v2, Unit> function1, @NotNull Function1<? super i2.a, Unit> function2) {
        if (!((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0)) {
            s0.a.i("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new b(i10, i11, map, function1, this, function2);
    }
}
