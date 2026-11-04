package io.intercom.android.sdk.m5.conversation.utils;

import androidx.compose.foundation.layout.b7;
import androidx.compose.foundation.layout.b8;
import androidx.compose.foundation.layout.v6;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.o;
import androidx.compose.runtime.w6;
import androidx.compose.ui.platform.q1;
import androidx.compose.ui.unit.d;
import androidx.compose.ui.unit.h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nKeyboardState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyboardState.kt\nio/intercom/android/sdk/m5/conversation/utils/KeyboardStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,52:1\n1282#2,6:53\n75#3:59\n1#4:60\n113#5:61\n85#6:62\n117#6,2:63\n*S KotlinDebug\n*F\n+ 1 KeyboardState.kt\nio/intercom/android/sdk/m5/conversation/utils/KeyboardStateKt\n*L\n24#1:53,6\n25#1:59\n32#1:61\n24#1:62\n24#1:63,2\n*E\n"})
public final class KeyboardStateKt {
    @o
    @NotNull
    public static final n7<KeyboardState> keyboardAsState(@Nullable c0 c0Var, int i10) {
        boolean z10;
        c0Var.E(-1867236611);
        c0Var.E(-137398301);
        Object objI0 = c0Var.i0();
        if (objI0 == c0.f35327a.a()) {
            objI0 = d7.g(null, null, 2, null);
            c0Var.Y(objI0);
        }
        n3 n3Var = (n3) objI0;
        c0Var.A();
        d dVar = (d) c0Var.W(q1.m());
        v6.a aVar = v6.f16495a;
        int iC = b8.p(aVar, c0Var, 8).c(dVar);
        int iC2 = b7.j(b8.p(aVar, c0Var, 8), b8.v(aVar, c0Var, 8)).c(dVar);
        boolean z11 = iC > 0;
        boolean zAreEqual = Intrinsics.areEqual(b8.q(aVar, c0Var, 8), b8.s(aVar, c0Var, 8));
        boolean z12 = !zAreEqual;
        float fS7 = dVar.S7(h.r(2));
        if (z11) {
            if (!zAreEqual) {
                KeyboardState keyboardStateKeyboardAsState$lambda$1 = keyboardAsState$lambda$1(n3Var);
                if ((keyboardStateKeyboardAsState$lambda$1 != null ? keyboardStateKeyboardAsState$lambda$1.getBottomDiff() : 0) - iC >= fS7) {
                    z10 = true;
                }
            }
            z10 = false;
        } else {
            z10 = true;
        }
        KeyboardState keyboardState = new KeyboardState(z12, iC, z11, z10, iC2);
        n3Var.setValue(keyboardState);
        n7<KeyboardState> n7VarW = w6.w(keyboardState, c0Var, 0);
        c0Var.A();
        return n7VarW;
    }

    private static final KeyboardState keyboardAsState$lambda$1(n3<KeyboardState> n3Var) {
        return n3Var.getValue();
    }
}
