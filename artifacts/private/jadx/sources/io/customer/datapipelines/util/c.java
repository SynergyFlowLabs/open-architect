package io.customer.datapipelines.util;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f288347a = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Function0 function0) {
        function0.invoke();
    }

    public final void b(@NotNull final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f288347a.post(new Runnable() { // from class: io.customer.datapipelines.util.b
            @Override // java.lang.Runnable
            public final void run() {
                c.c(block);
            }
        });
    }
}
