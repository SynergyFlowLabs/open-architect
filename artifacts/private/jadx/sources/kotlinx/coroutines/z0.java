package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f315732a = kotlinx.coroutines.internal.c1.f("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final c1 f315733b = c();

    @NotNull
    public static final c1 a() {
        return f315733b;
    }

    @kotlin.a1
    public static /* synthetic */ void b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final c1 c() {
        if (!f315732a) {
            return y0.f315719h;
        }
        a3 a3VarE = l1.e();
        return (kotlinx.coroutines.internal.l0.d(a3VarE) || !(a3VarE instanceof c1)) ? y0.f315719h : (c1) a3VarE;
    }
}
