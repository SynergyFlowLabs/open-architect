package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.window.core.d
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private static volatile s f76333d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f76335f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final j f76336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private Set<? extends m> f76337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f76332c = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final ReentrantLock f76334e = new ReentrantLock();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final s a() {
            if (s.f76333d == null) {
                ReentrantLock reentrantLock = s.f76334e;
                reentrantLock.lock();
                try {
                    if (s.f76333d == null) {
                        a aVar = s.f76332c;
                        s.f76333d = new s(null);
                    }
                    Unit unit = Unit.f312394a;
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            s sVar = s.f76333d;
            Intrinsics.checkNotNull(sVar);
            return sVar;
        }

        @oj.n
        public final void b(@NotNull Context context, int i10) {
            Intrinsics.checkNotNullParameter(context, "context");
            Set<m> setG = new y().g(context, i10);
            s sVarA = a();
            if (setG == null) {
                setG = SetsKt.emptySet();
            }
            sVarA.m(setG);
        }

        private a() {
        }
    }

    public /* synthetic */ s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @oj.n
    @NotNull
    public static final s g() {
        return f76332c.a();
    }

    @oj.n
    public static final void i(@NotNull Context context, int i10) {
        f76332c.b(context, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(Set<? extends m> set) {
        this.f76337b = set;
        this.f76336a.a(set);
    }

    public final void e(@NotNull Activity activity, @NotNull Executor executor, @NotNull androidx.core.util.e<List<t>> consumer) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.f76336a.c(activity, executor, consumer);
    }

    public final void f() {
        this.f76336a.a(this.f76337b);
    }

    @NotNull
    public final Set<m> h() {
        return CollectionsKt.toSet(this.f76336a.b());
    }

    public final boolean j() {
        return this.f76336a.e();
    }

    public final void k(@NotNull m rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        this.f76336a.g(rule);
    }

    public final void l(@NotNull androidx.core.util.e<List<t>> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.f76336a.d(consumer);
    }

    public final void n(@NotNull m rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        this.f76336a.f(rule);
    }

    private s() {
        this.f76336a = p.f76313e.a();
        this.f76337b = SetsKt.emptySet();
    }
}
