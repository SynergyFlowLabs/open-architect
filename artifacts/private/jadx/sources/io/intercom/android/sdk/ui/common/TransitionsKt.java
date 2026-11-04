package io.intercom.android.sdk.ui.common;

import androidx.compose.animation.b0;
import androidx.compose.animation.core.p;
import androidx.compose.animation.d0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class TransitionsKt {
    @NotNull
    public static final d0 floatingButtonEnterTransition(final int i10) {
        int i11 = 4 | 4;
        return b0.u(null, 0.8f, 0L, 5, null).c(b0.H(p.r(0.75f, 500.0f, null, 4, null), new Function1() { // from class: io.intercom.android.sdk.ui.common.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(TransitionsKt.floatingButtonEnterTransition$lambda$0(i10, ((Integer) obj).intValue()));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int floatingButtonEnterTransition$lambda$0(int i10, int i11) {
        return i11 + i10;
    }
}
