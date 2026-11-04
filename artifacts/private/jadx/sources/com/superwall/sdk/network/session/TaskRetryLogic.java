package com.superwall.sdk.network.session;

import kotlin.random.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class TaskRetryLogic {

    @NotNull
    public static final TaskRetryLogic INSTANCE = new TaskRetryLogic();

    private TaskRetryLogic() {
    }

    @Nullable
    public final Long delay(int i10, int i11) {
        if (i10 > i11) {
            return null;
        }
        return Long.valueOf((long) ((Math.pow(5.0d, (((double) i10) / ((double) i11)) + 1.0d) + f.f312895a.j(0.0d, 1.0d)) * ((double) 1000)));
    }
}
