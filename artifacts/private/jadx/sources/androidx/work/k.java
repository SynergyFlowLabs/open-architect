package androidx.work;

import androidx.annotation.b1;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public enum k implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return "DirectExecutor";
    }
}
