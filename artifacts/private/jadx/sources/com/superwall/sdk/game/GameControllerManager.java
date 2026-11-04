package com.superwall.sdk.game;

import android.view.KeyEvent;
import android.view.MotionEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class GameControllerManager {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static GameControllerManager shared = new GameControllerManager();

    @Nullable
    private GameControllerDelegate delegate;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final GameControllerManager getShared() {
            return GameControllerManager.shared;
        }

        public final void setShared(@NotNull GameControllerManager gameControllerManager) {
            Intrinsics.checkNotNullParameter(gameControllerManager, "<set-?>");
            GameControllerManager.shared = gameControllerManager;
        }

        private Companion() {
        }
    }

    private final void valueChanged(String str, float f10, float f11, float f12, boolean z10) {
        GameControllerEvent gameControllerEvent = new GameControllerEvent((String) null, str, f10, f11, f12, z10, 1, (DefaultConstructorMarker) null);
        GameControllerDelegate gameControllerDelegate = this.delegate;
        if (gameControllerDelegate != null) {
            gameControllerDelegate.gameControllerEventOccured(gameControllerEvent);
        }
    }

    static /* synthetic */ void valueChanged$default(GameControllerManager gameControllerManager, String str, float f10, float f11, float f12, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        gameControllerManager.valueChanged(str, f10, f11, f12, z10);
    }

    public final void clearDelegate(@NotNull GameControllerDelegate delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        if (Intrinsics.areEqual(this.delegate, delegate)) {
            this.delegate = null;
        }
    }

    public final boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String strMapToButtonName = GameControllerElementMapper.INSTANCE.mapToButtonName(event.getKeyCode());
        if (event.getAction() == 0 && event.getRepeatCount() == 0) {
            valueChanged$default(this, strMapToButtonName, 1.0f, 0.0f, 0.0f, false, 28, null);
        } else if (event.getAction() == 1) {
            valueChanged$default(this, strMapToButtonName, 0.0f, 0.0f, 0.0f, false, 28, null);
        }
        return true;
    }

    public final boolean dispatchMotionEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 2) {
            valueChanged("Right Thumbstick", 1.0f, event.getAxisValue(0), event.getAxisValue(1), true);
        }
        return true;
    }

    public final void setDelegate(@NotNull GameControllerDelegate delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }
}
