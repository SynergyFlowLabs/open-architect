package androidx.arch.core.executor;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile c f11699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private static final Executor f11700d = new Executor() { // from class: androidx.arch.core.executor.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.h().d(runnable);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private static final Executor f11701e = new Executor() { // from class: androidx.arch.core.executor.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.h().a(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private e f11702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final e f11703b;

    private c() {
        d dVar = new d();
        this.f11703b = dVar;
        this.f11702a = dVar;
    }

    @NonNull
    public static Executor g() {
        return f11701e;
    }

    @NonNull
    public static c h() {
        if (f11699c != null) {
            return f11699c;
        }
        synchronized (c.class) {
            try {
                if (f11699c == null) {
                    f11699c = new c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f11699c;
    }

    @NonNull
    public static Executor i() {
        return f11700d;
    }

    @Override // androidx.arch.core.executor.e
    public void a(@NonNull Runnable runnable) {
        this.f11702a.a(runnable);
    }

    @Override // androidx.arch.core.executor.e
    public boolean c() {
        return this.f11702a.c();
    }

    @Override // androidx.arch.core.executor.e
    public void d(@NonNull Runnable runnable) {
        this.f11702a.d(runnable);
    }

    public void j(@p0 e eVar) {
        if (eVar == null) {
            eVar = this.f11703b;
        }
        this.f11702a = eVar;
    }
}
