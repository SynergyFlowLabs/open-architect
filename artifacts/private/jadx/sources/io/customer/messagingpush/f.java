package io.customer.messagingpush;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface f {

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void a(f fVar, String str, String str2, String str3, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackMetric");
            }
            if ((i10 & 8) != 0) {
                function1 = null;
            }
            fVar.a(str, str2, str3, function1);
        }
    }

    void a(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Function1<? super Result<Unit>, Unit> function1);
}
