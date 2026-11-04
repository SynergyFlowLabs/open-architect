package io.intercom.android.sdk.m5.navigation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomTransitionsKt {

    @NotNull
    private static final Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> slideUpEnterTransition = new Function1() { // from class: io.intercom.android.sdk.m5.navigation.h1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return IntercomTransitionsKt.slideUpEnterTransition$lambda$0((androidx.compose.animation.i) obj);
        }
    };

    @NotNull
    private static final Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> slideDownExitTransition = new Function1() { // from class: io.intercom.android.sdk.m5.navigation.i1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return IntercomTransitionsKt.slideDownExitTransition$lambda$1((androidx.compose.animation.i) obj);
        }
    };

    @NotNull
    public static final Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> getSlideDownExitTransition() {
        return slideDownExitTransition;
    }

    @NotNull
    public static final Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> getSlideUpEnterTransition() {
        return slideUpEnterTransition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.f0 slideDownExitTransition$lambda$1(androidx.compose.animation.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return androidx.compose.animation.i.b(iVar, androidx.compose.animation.i.a.f13518b.a(), androidx.compose.animation.core.p.t(300, 0, null, 6, null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.d0 slideUpEnterTransition$lambda$0(androidx.compose.animation.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return androidx.compose.animation.i.d(iVar, androidx.compose.animation.i.a.f13518b.f(), androidx.compose.animation.core.p.t(300, 0, null, 6, null), null, 4, null);
    }
}
