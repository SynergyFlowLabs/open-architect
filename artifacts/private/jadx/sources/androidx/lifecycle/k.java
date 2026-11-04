package androidx.lifecycle;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public abstract class k<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Executor f52413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final w0<T> f52414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final w0<T> f52415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f52416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f52417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oj.f
    @NotNull
    public final Runnable f52418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oj.f
    @NotNull
    public final Runnable f52419g;

    public static final class a extends w0<T> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ k<T> f52420m;

        a(k<T> kVar) {
            this.f52420m = kVar;
        }

        @Override // androidx.lifecycle.w0
        protected void m() {
            this.f52420m.e().execute(this.f52420m.f52418f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oj.j
    public k() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @androidx.annotation.l1
    public static /* synthetic */ void g() {
    }

    @androidx.annotation.l1
    public static /* synthetic */ void i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(k kVar) {
        boolean zH = kVar.h().h();
        if (kVar.f52416d.compareAndSet(false, true) && zH) {
            kVar.f52413a.execute(kVar.f52418f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(k kVar) {
        do {
            boolean z10 = false;
            if (kVar.f52417e.compareAndSet(false, true)) {
                Object objC = null;
                boolean z11 = false;
                while (kVar.f52416d.compareAndSet(true, false)) {
                    try {
                        objC = kVar.c();
                        z11 = true;
                    } catch (Throwable th2) {
                        kVar.f52417e.set(false);
                        throw th2;
                    }
                }
                if (z11) {
                    kVar.h().o(objC);
                }
                kVar.f52417e.set(false);
                z10 = z11;
            }
            if (!z10) {
                return;
            }
        } while (kVar.f52416d.get());
    }

    @androidx.annotation.m1
    protected abstract T c();

    @NotNull
    public final AtomicBoolean d() {
        return this.f52417e;
    }

    @NotNull
    public final Executor e() {
        return this.f52413a;
    }

    @NotNull
    public final AtomicBoolean f() {
        return this.f52416d;
    }

    @NotNull
    public w0<T> h() {
        return this.f52415c;
    }

    public void j() {
        androidx.arch.core.executor.c.h().b(this.f52419g);
    }

    @oj.j
    public k(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f52413a = executor;
        a aVar = new a(this);
        this.f52414b = aVar;
        this.f52415c = aVar;
        int i10 = 0 >> 1;
        this.f52416d = new AtomicBoolean(true);
        this.f52417e = new AtomicBoolean(false);
        this.f52418f = new Runnable() { // from class: androidx.lifecycle.i
            @Override // java.lang.Runnable
            public final void run() {
                k.l(this.f52359a);
            }
        };
        this.f52419g = new Runnable() { // from class: androidx.lifecycle.j
            @Override // java.lang.Runnable
            public final void run() {
                k.k(this.f52369a);
            }
        };
    }

    public /* synthetic */ k(Executor executor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? androidx.arch.core.executor.c.g() : executor);
    }
}
