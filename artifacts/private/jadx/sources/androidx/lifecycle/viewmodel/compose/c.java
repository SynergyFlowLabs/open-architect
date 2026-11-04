package androidx.lifecycle.viewmodel.compose;

import android.view.View;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.m2;
import androidx.lifecycle.p2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nLocalViewModelStoreOwner.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalViewModelStoreOwner.android.kt\nandroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,27:1\n75#2:28\n*S KotlinDebug\n*F\n+ 1 LocalViewModelStoreOwner.android.kt\nandroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner_androidKt\n*L\n26#1:28\n*E\n"})
public final class c {
    @o
    @Nullable
    public static final m2 a(@Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(1382572291, i10, -1, "androidx.lifecycle.viewmodel.compose.findViewTreeViewModelStoreOwner (LocalViewModelStoreOwner.android.kt:25)");
        }
        m2 m2VarA = p2.a((View) c0Var.W(AndroidCompositionLocals_androidKt.m()));
        if (m0.l0()) {
            m0.z0();
        }
        return m2VarA;
    }
}
