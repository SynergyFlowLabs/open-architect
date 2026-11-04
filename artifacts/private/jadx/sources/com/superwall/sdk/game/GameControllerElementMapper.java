package com.superwall.sdk.game;

import com.planner5d.library.engine.input.f;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class GameControllerElementMapper {

    @NotNull
    public static final GameControllerElementMapper INSTANCE = new GameControllerElementMapper();

    private GameControllerElementMapper() {
    }

    @NotNull
    public final String mapToButtonName(int i10) {
        if (i10 == 96) {
            return "A Button";
        }
        if (i10 == 97) {
            return "B Button";
        }
        if (i10 == 99) {
            return "X Button";
        }
        if (i10 == 100) {
            return "Y Button";
        }
        switch (i10) {
            case 19:
            case 20:
            case 21:
            case 22:
                return "Direction Pad";
            default:
                switch (i10) {
                    case 102:
                        return "L1 Button";
                    case f.b.f160733u1 /* 103 */:
                        return "R1 Button";
                    case 104:
                        return "L2 Button";
                    case 105:
                        return "R2 Button";
                    case f.b.f160742x1 /* 106 */:
                        return "Left Thumbstick";
                    case f.b.f160745y1 /* 107 */:
                        return "Right Thumbstick";
                    case 108:
                        return "Menu Button";
                    case 109:
                        return "Options Button";
                    default:
                        boolean z10 = false | false;
                        Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.gameControllerManager, "Unknown button: " + i10, null, null, 24, null);
                        return "Unknown Button";
                }
        }
    }
}
