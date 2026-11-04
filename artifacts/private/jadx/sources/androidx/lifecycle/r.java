package androidx.lifecycle;

import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.a3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nDispatchQueue.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchQueue.jvm.kt\nandroidx/lifecycle/DispatchQueue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f52492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f52493c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f52491a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Queue<Runnable> f52494d = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(r rVar, Runnable runnable) {
        rVar.f(runnable);
    }

    @androidx.annotation.l0
    private final void f(Runnable runnable) {
        if (!this.f52494d.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables");
        }
        e();
    }

    @androidx.annotation.l0
    public final boolean b() {
        return this.f52492b || !this.f52491a;
    }

    @androidx.annotation.d
    public final void c(@NotNull CoroutineContext context, @NotNull final Runnable runnable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        a3 a3VarR0 = kotlinx.coroutines.l1.e().R0();
        if (a3VarR0.N(context) || b()) {
            a3VarR0.h(context, new Runnable() { // from class: androidx.lifecycle.q
                @Override // java.lang.Runnable
                public final void run() {
                    r.d(this.f52464a, runnable);
                }
            });
        } else {
            f(runnable);
        }
    }

    @androidx.annotation.l0
    public final void e() {
        if (this.f52493c) {
            return;
        }
        try {
            this.f52493c = true;
            while (!this.f52494d.isEmpty() && b()) {
                Runnable runnablePoll = this.f52494d.poll();
                if (runnablePoll != null) {
                    runnablePoll.run();
                }
            }
            this.f52493c = false;
        } catch (Throwable th2) {
            this.f52493c = false;
            throw th2;
        }
    }

    @androidx.annotation.l0
    public final void g() {
        this.f52492b = true;
        e();
    }

    @androidx.annotation.l0
    public final void h() {
        this.f52491a = true;
    }

    @androidx.annotation.l0
    public final void i() {
        if (this.f52491a) {
            if (this.f52492b) {
                throw new IllegalStateException("Cannot resume a finished dispatcher");
            }
            this.f52491a = false;
            e();
        }
    }
}
