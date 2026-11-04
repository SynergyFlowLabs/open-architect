package kotlinx.coroutines.tasks;

import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
final class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f315645a = new a();

    private a() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        runnable.run();
    }
}
