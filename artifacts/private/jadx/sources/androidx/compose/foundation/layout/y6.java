package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,708:1\n110#2:709\n75#3:710\n75#3:711\n75#3:712\n1282#4,6:713\n1282#4,6:719\n66#5,5:725\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n*L\n76#1:709\n110#1:710\n112#1:711\n113#1:712\n115#1:713,6\n118#1:719,6\n118#1:725,5\n*E\n"})
public final class y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f16579a = 0.35f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f16580b = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f16581c = 9.80665f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f16582d = 39.37f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final double f16583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final double f16584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f16585g = 0.5f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f16586h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f16587i = 0.175f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f16588j = 0.35000002f;

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n*L\n1#1,110:1\n76#2:111\n*E\n"})
    public static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {
        public a() {
            super(1);
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("imeNestedScroll");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    static final class b implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f16589a = new b();

        b() {
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-369978792);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-369978792, i10, -1, "androidx.compose.foundation.layout.imeNestedScroll.<anonymous> (WindowInsetsConnection.android.kt:76)");
            }
            androidx.compose.ui.a0 a0VarB = androidx.compose.ui.input.nestedscroll.c.b(a0Var, y6.f(a7.f15880x.d(c0Var, 6).i(), v7.f16497b.e(), c0Var, 48), null, 2, null);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarB;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n*L\n1#1,69:1\n118#2:70\n*E\n"})
    public static final class c implements androidx.compose.runtime.u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p7 f16590a;

        public c(p7 p7Var) {
            this.f16590a = p7Var;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f16590a.o();
        }
    }

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f16583e = dLog;
        f16584f = dLog - 1.0d;
    }

    @u1
    @NotNull
    public static final androidx.compose.ui.a0 e(@NotNull androidx.compose.ui.a0 a0Var) {
        if (Build.VERSION.SDK_INT < 30) {
            return a0Var;
        }
        return androidx.compose.ui.m.f(a0Var, androidx.compose.ui.platform.r2.e() ? new a() : androidx.compose.ui.platform.r2.b(), b.f16589a);
    }

    @androidx.compose.runtime.o
    @u1
    @NotNull
    public static final androidx.compose.ui.input.nestedscroll.a f(@NotNull h hVar, int i10, @Nullable androidx.compose.runtime.c0 c0Var, int i11) {
        c0Var.E(-1011341039);
        if (androidx.compose.runtime.m0.l0()) {
            int i12 = 4 | (-1);
            androidx.compose.runtime.m0.A0(-1011341039, i11, -1, "androidx.compose.foundation.layout.rememberWindowInsetsConnection (WindowInsetsConnection.android.kt:105)");
        }
        if (Build.VERSION.SDK_INT < 30) {
            s1 s1Var = s1.f16401a;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return s1Var;
        }
        h6 h6VarA = h6.f16079a.a(i10, (androidx.compose.ui.unit.w) c0Var.W(androidx.compose.ui.platform.q1.u()));
        View view = (View) c0Var.W(AndroidCompositionLocals_androidKt.m());
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
        boolean zD = ((((i11 & 14) ^ 6) > 4 && c0Var.D(hVar)) || (i11 & 6) == 4) | c0Var.D(view) | c0Var.D(h6VarA) | c0Var.D(dVar);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new p7(hVar, view, h6VarA, dVar);
            c0Var.Y(objI0);
        }
        final p7 p7Var = (p7) objI0;
        boolean zK0 = c0Var.k0(p7Var);
        Object objI1 = c0Var.i0();
        if (zK0 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = new Function1() { // from class: androidx.compose.foundation.layout.x6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return y6.g(p7Var, (androidx.compose.runtime.v1) obj);
                }
            };
            c0Var.Y(objI1);
        }
        androidx.compose.runtime.b2.d(p7Var, (Function1) objI1, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return p7Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.u1 g(p7 p7Var, androidx.compose.runtime.v1 v1Var) {
        return new c(p7Var);
    }
}
