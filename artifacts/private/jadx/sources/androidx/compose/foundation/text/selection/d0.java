package androidx.compose.foundation.text.selection;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPlatformSelectionBehaviors.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformSelectionBehaviors.android.kt\nandroidx/compose/foundation/text/selection/PlatformSelectionBehaviors_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,346:1\n75#2:347\n75#2:348\n1282#3,6:349\n*S KotlinDebug\n*F\n+ 1 PlatformSelectionBehaviors.android.kt\nandroidx/compose/foundation/text/selection/PlatformSelectionBehaviors_androidKt\n*L\n100#1:347\n101#1:348\n102#1:349,6\n*E\n"})
public final class d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f21036b = 300;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f21037c = 200;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<CoroutineContext> f21035a = androidx.compose.runtime.a1.m(new Function0() { // from class: androidx.compose.foundation.text.selection.b0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d0.c();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.w0(28)
    @NotNull
    private static pj.o<? super CoroutineContext, ? super Context, ? super g0, ? super y0.f, ? extends x> f21038d = new pj.o() { // from class: androidx.compose.foundation.text.selection.c0
        @Override // pj.o
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return d0.d((CoroutineContext) obj, (Context) obj2, (g0) obj3, (y0.f) obj4);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext c() {
        return kotlinx.coroutines.l1.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y d(CoroutineContext coroutineContext, Context context, g0 g0Var, y0.f fVar) {
        return new y(coroutineContext, context, g0Var, fVar);
    }

    public static final void f(@NotNull a0.a aVar, @NotNull Context context, boolean z10, @Nullable CharSequence charSequence, @Nullable androidx.compose.ui.text.w3 w3Var, @Nullable x xVar, @NotNull Function1<? super a0.a, Unit> function1) {
        if (charSequence != null && w3Var != null && xVar != null && (xVar instanceof y)) {
            ((y) xVar).l(aVar, charSequence, w3Var.r(), function1);
            z.e.b(aVar, context, z10, charSequence, w3Var.r());
            return;
        }
        function1.invoke(aVar);
        if (charSequence == null || w3Var == null) {
            return;
        }
        z.e.b(aVar, context, z10, charSequence, w3Var.r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(p3 p3Var, CharSequence charSequence, long j10) {
        return androidx.compose.ui.text.w3.g(j10, p3Var.f()) && Intrinsics.areEqual(charSequence, p3Var.g());
    }

    @NotNull
    public static final androidx.compose.runtime.m4<CoroutineContext> h() {
        return f21035a;
    }

    @NotNull
    public static final pj.o<CoroutineContext, Context, g0, y0.f, x> i() {
        return f21038d;
    }

    @androidx.annotation.l1
    public static /* synthetic */ void j() {
    }

    @androidx.compose.runtime.o
    @Nullable
    public static final x k(@NotNull g0 g0Var, @Nullable y0.f fVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(430530635);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(430530635, i10, -1, "androidx.compose.foundation.text.selection.rememberPlatformSelectionBehaviors (PlatformSelectionBehaviors.android.kt:94)");
        }
        Context context = (Context) c0Var.W(AndroidCompositionLocals_androidKt.g());
        CoroutineContext coroutineContext = (CoroutineContext) c0Var.W(f21035a);
        boolean zD = c0Var.D(coroutineContext) | c0Var.D(context) | ((((i10 & 14) ^ 6) > 4 && c0Var.K(g0Var.ordinal())) || (i10 & 6) == 4) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.D(fVar)) || (i10 & 48) == 32);
        x xVarI0 = c0Var.i0();
        if (zD || xVarI0 == androidx.compose.runtime.c0.f35327a.a()) {
            xVarI0 = f21038d.invoke(coroutineContext, context, g0Var, fVar);
            c0Var.Y(xVarI0);
        }
        x xVar = (x) xVarI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return xVar;
    }

    public static final void l(@NotNull pj.o<? super CoroutineContext, ? super Context, ? super g0, ? super y0.f, ? extends x> oVar) {
        f21038d = oVar;
    }
}
