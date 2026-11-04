package u0;

import android.content.res.Resources;
import androidx.annotation.f1;
import androidx.annotation.s0;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.p4;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nStringResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringResources.android.kt\nandroidx/compose/ui/res/StringResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,89:1\n75#2:90\n75#2:91\n75#2:92\n75#2:93\n75#2:94\n*S KotlinDebug\n*F\n+ 1 StringResources.android.kt\nandroidx/compose/ui/res/StringResources_androidKt\n*L\n35#1:90\n48#1:91\n60#1:92\n73#1:93\n87#1:94\n*E\n"})
public final class i {
    @o
    @p4
    @NotNull
    public static final String a(@s0 int i10, int i11, @Nullable c0 c0Var, int i12) {
        if (m0.l0()) {
            int i13 = 7 ^ (-1);
            m0.A0(1784741530, i12, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:71)");
        }
        String quantityString = ((Resources) c0Var.W(AndroidCompositionLocals_androidKt.k())).getQuantityString(i10, i11);
        if (m0.l0()) {
            m0.z0();
        }
        return quantityString;
    }

    @o
    @p4
    @NotNull
    public static final String b(@s0 int i10, int i11, @NotNull Object[] objArr, @Nullable c0 c0Var, int i12) {
        if (m0.l0()) {
            m0.A0(523207213, i12, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:85)");
        }
        String quantityString = ((Resources) c0Var.W(AndroidCompositionLocals_androidKt.k())).getQuantityString(i10, i11, Arrays.copyOf(objArr, objArr.length));
        if (m0.l0()) {
            m0.z0();
        }
        return quantityString;
    }

    @o
    @p4
    @NotNull
    public static final String[] c(@androidx.annotation.e int i10, @Nullable c0 c0Var, int i11) {
        if (m0.l0()) {
            m0.A0(1562162650, i11, -1, "androidx.compose.ui.res.stringArrayResource (StringResources.android.kt:58)");
        }
        String[] stringArray = ((Resources) c0Var.W(AndroidCompositionLocals_androidKt.k())).getStringArray(i10);
        if (m0.l0()) {
            m0.z0();
        }
        return stringArray;
    }

    @o
    @p4
    @NotNull
    public static final String d(@f1 int i10, @Nullable c0 c0Var, int i11) {
        if (m0.l0()) {
            m0.A0(1223887937, i11, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:33)");
        }
        String string = ((Resources) c0Var.W(AndroidCompositionLocals_androidKt.k())).getString(i10);
        if (m0.l0()) {
            m0.z0();
        }
        return string;
    }

    @o
    @p4
    @NotNull
    public static final String e(@f1 int i10, @NotNull Object[] objArr, @Nullable c0 c0Var, int i11) {
        if (m0.l0()) {
            m0.A0(2071230100, i11, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = ((Resources) c0Var.W(AndroidCompositionLocals_androidKt.k())).getString(i10, Arrays.copyOf(objArr, objArr.length));
        if (m0.l0()) {
            m0.z0();
        }
        return string;
    }
}
