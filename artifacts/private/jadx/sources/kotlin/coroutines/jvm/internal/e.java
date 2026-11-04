package kotlin.coroutines.jvm.internal;

import kotlin.e1;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@e1(version = "1.3")
public interface e {
    @Nullable
    e getCallerFrame();

    @Nullable
    StackTraceElement getStackTraceElement();
}
