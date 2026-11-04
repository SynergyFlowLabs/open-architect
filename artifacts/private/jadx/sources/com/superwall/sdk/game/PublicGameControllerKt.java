package com.superwall.sdk.game;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.misc.MainThreadKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class PublicGameControllerKt {
    public static final void dispatchKeyEvent(@NotNull Superwall superwall, @NotNull final KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(superwall, "<this>");
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        MainThreadKt.runOnUiThread(new Function0() { // from class: com.superwall.sdk.game.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PublicGameControllerKt.dispatchKeyEvent$lambda$0(keyEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dispatchKeyEvent$lambda$0(KeyEvent keyEvent) {
        GameControllerManager.Companion.getShared().dispatchKeyEvent(keyEvent);
        return Unit.f312394a;
    }

    public static final void dispatchMotionEvent(@NotNull Superwall superwall, @NotNull final MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(superwall, "<this>");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        MainThreadKt.runOnUiThread(new Function0() { // from class: com.superwall.sdk.game.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PublicGameControllerKt.dispatchMotionEvent$lambda$1(motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dispatchMotionEvent$lambda$1(MotionEvent motionEvent) {
        GameControllerManager.Companion.getShared().dispatchMotionEvent(motionEvent);
        return Unit.f312394a;
    }
}
