package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.g0;
import androidx.activity.s0;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.m4;
import androidx.compose.runtime.n4;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/LocalFullyDrawnReporterOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,153:1\n77#2:154\n77#2:155\n77#2:156\n23#3,8:157\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/LocalFullyDrawnReporterOwner\n*L\n96#1:154\n97#1:155\n98#1:156\n98#1:157,8\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f9822a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final m4<g0> f9823b = a1.k(null, a.f9825a, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f9824c = 0;

    static final class a extends l0 implements Function0<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f9825a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final g0 invoke() {
            return null;
        }
    }

    private i() {
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getCurrent")
    @Nullable
    public final g0 a(@Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            int i11 = 2 ^ (-1);
            m0.A0(540186968, i10, -1, "androidx.activity.compose.LocalFullyDrawnReporterOwner.<get-current> (ReportDrawn.kt:95)");
        }
        g0 g0VarA = (g0) c0Var.W(f9823b);
        if (g0VarA == null) {
            c0Var.E(-1738308180);
            g0VarA = s0.a((View) c0Var.W(AndroidCompositionLocals_androidKt.m()));
            c0Var.A();
        } else {
            c0Var.E(-1738310474);
            c0Var.A();
        }
        if (g0VarA == null) {
            c0Var.E(-1738306337);
            Object baseContext = (Context) c0Var.W(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof g0) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            g0VarA = (g0) baseContext;
            c0Var.A();
        } else {
            c0Var.E(-1738310398);
            c0Var.A();
        }
        if (m0.l0()) {
            m0.z0();
        }
        return g0VarA;
    }

    @NotNull
    public final n4<g0> b(@NotNull g0 g0Var) {
        return f9823b.f(g0Var);
    }
}
