package com.superwall.sdk.misc;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class MainThreadKt {
    public static final void runOnUiThread(@NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            action.invoke();
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.superwall.sdk.misc.c
                @Override // java.lang.Runnable
                public final void run() {
                    action.invoke();
                }
            });
        }
    }
}
