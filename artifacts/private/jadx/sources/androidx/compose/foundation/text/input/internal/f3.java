package androidx.compose.foundation.text.input.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface f3 {
    void b(@NotNull Function1<? super androidx.compose.foundation.text.input.j, Unit> function1);

    boolean beginBatchEdit();

    long e(long j10);

    boolean endBatchEdit();

    long f(long j10);
}
