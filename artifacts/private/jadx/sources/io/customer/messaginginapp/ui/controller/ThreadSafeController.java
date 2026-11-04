package io.customer.messaginginapp.ui.controller;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ThreadSafeController {
    public static /* synthetic */ kotlin.properties.f threadSafe$default(ThreadSafeController threadSafeController, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: threadSafe");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return threadSafeController.threadSafe(obj);
    }

    public static /* synthetic */ kotlin.properties.f threadSafeWithNotification$default(ThreadSafeController threadSafeController, Object obj, Function2 function2, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: threadSafeWithNotification");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return threadSafeController.threadSafeWithNotification(obj, function2);
    }

    @NotNull
    protected final <T> kotlin.properties.f<Object, T> threadSafe(@Nullable T t10) {
        return new VolatileProperty(t10);
    }

    @NotNull
    protected final <T> kotlin.properties.f<Object, T> threadSafeWithNotification(@Nullable T t10, @NotNull Function2<? super T, ? super T, Unit> onChange) {
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        return new VolatilePropertyWithNotification(t10, onChange);
    }
}
