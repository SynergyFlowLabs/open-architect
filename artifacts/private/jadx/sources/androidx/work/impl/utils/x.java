package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.l1;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class x implements androidx.work.impl.utils.taskexecutor.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f77278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private Runnable f77279c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque<a> f77277a = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f77280d = new Object();

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final x f77281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Runnable f77282b;

        a(@NonNull x serialExecutor, @NonNull Runnable runnable) {
            this.f77281a = serialExecutor;
            this.f77282b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f77282b.run();
                synchronized (this.f77281a.f77280d) {
                    this.f77281a.b();
                }
            } catch (Throwable th2) {
                synchronized (this.f77281a.f77280d) {
                    try {
                        this.f77281a.b();
                        throw th2;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
    }

    public x(@NonNull Executor executor) {
        this.f77278b = executor;
    }

    @Override // androidx.work.impl.utils.taskexecutor.a
    public boolean B1() {
        boolean z10;
        synchronized (this.f77280d) {
            try {
                z10 = !this.f77277a.isEmpty();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @NonNull
    @l1
    public Executor a() {
        return this.f77278b;
    }

    @androidx.annotation.b0("mLock")
    void b() {
        a aVarPoll = this.f77277a.poll();
        this.f77279c = aVarPoll;
        if (aVarPoll != null) {
            this.f77278b.execute(aVarPoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable command) {
        synchronized (this.f77280d) {
            try {
                this.f77277a.add(new a(this, command));
                if (this.f77279c == null) {
                    b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
