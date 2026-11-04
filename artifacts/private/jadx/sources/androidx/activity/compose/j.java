package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.m0;
import androidx.activity.t0;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w0;
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
@SourceDebugExtension({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/LocalOnBackPressedDispatcherOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,109:1\n77#2:110\n77#2:111\n77#2:112\n23#3,8:113\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/LocalOnBackPressedDispatcherOwner\n*L\n51#1:110\n52#1:111\n53#1:112\n53#1:113,8\n*E\n"})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f9826a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final m4<m0> f9827b = a1.k(null, a.f9829a, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f9828c = 0;

    static final class a extends l0 implements Function0<m0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f9829a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final m0 invoke() {
            return null;
        }
    }

    private j() {
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getCurrent")
    @Nullable
    public final m0 a(@Nullable c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-2068013981, i10, -1, "androidx.activity.compose.LocalOnBackPressedDispatcherOwner.<get-current> (BackHandler.kt:50)");
        }
        m0 m0VarA = (m0) c0Var.W(f9827b);
        if (m0VarA == null) {
            c0Var.E(544166745);
            m0VarA = t0.a((View) c0Var.W(AndroidCompositionLocals_androidKt.m()));
            c0Var.A();
        } else {
            c0Var.E(544164296);
            c0Var.A();
        }
        if (m0VarA == null) {
            c0Var.E(544168748);
            Object baseContext = (Context) c0Var.W(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof m0) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            m0VarA = (m0) baseContext;
            c0Var.A();
        } else {
            c0Var.E(544164377);
            c0Var.A();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return m0VarA;
    }

    @NotNull
    public final n4<m0> b(@NotNull m0 m0Var) {
        return f9827b.f(m0Var);
    }
}
