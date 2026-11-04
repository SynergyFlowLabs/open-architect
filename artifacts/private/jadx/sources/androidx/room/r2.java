package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nTransactionExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionExecutor.kt\nandroidx/room/TransactionExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
public final class r2 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Executor f75068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<Runnable> f75069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Runnable f75070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f75071d;

    public r2(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f75068a = executor;
        this.f75069b = new ArrayDeque<>();
        this.f75071d = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Runnable command, r2 this$0) {
        Intrinsics.checkNotNullParameter(command, "$command");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            command.run();
        } finally {
            this$0.c();
        }
    }

    public final void c() {
        synchronized (this.f75071d) {
            try {
                Runnable runnablePoll = this.f75069b.poll();
                Runnable runnable = runnablePoll;
                this.f75070c = runnable;
                if (runnablePoll != null) {
                    this.f75068a.execute(runnable);
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull final Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        synchronized (this.f75071d) {
            try {
                this.f75069b.offer(new Runnable() { // from class: androidx.room.q2
                    @Override // java.lang.Runnable
                    public final void run() {
                        r2.b(command, this);
                    }
                });
                if (this.f75070c == null) {
                    c();
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
