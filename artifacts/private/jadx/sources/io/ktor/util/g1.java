package io.ktor.util;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g1 f296599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f296600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f296601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f296602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f296603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f296604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f296605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final boolean f296606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final boolean f296607i;

    static {
        g1 g1Var = new g1();
        f296599a = g1Var;
        f1 f1VarA = h1.a(g1Var);
        boolean z10 = false;
        f296600b = !(f1VarA instanceof f1.a) ? !((f1VarA instanceof f1.e) && ((f1.e) f1VarA).d() == f1.b.Browser) : ((f1.a) f1VarA).d() != f1.b.Browser;
        f1 f1VarA2 = h1.a(g1Var);
        if (f1VarA2 instanceof f1.a) {
            if (((f1.a) f1VarA2).d() == f1.b.Node) {
                z10 = true;
            }
        } else if ((f1VarA2 instanceof f1.e) && ((f1.e) f1VarA2).d() == f1.b.Node) {
            z10 = true;
        }
        f296601c = z10;
        f296602d = h1.a(g1Var) instanceof f1.a;
        f296603e = h1.a(g1Var) instanceof f1.e;
        f296604f = Intrinsics.areEqual(h1.a(g1Var), f1.c.f296593a);
        f296605g = Intrinsics.areEqual(h1.a(g1Var), f1.d.f296594a);
        f296606h = h1.b(g1Var);
        f296607i = true;
    }

    private g1() {
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "New memory model is now enabled by default. The property will be removed in the future.", replaceWith = @kotlin.b1(expression = com.facebook.internal.z0.P, imports = {}))
    public static /* synthetic */ void g() {
    }

    public final boolean a() {
        return f296600b;
    }

    public final boolean b() {
        return f296606h;
    }

    public final boolean c() {
        return f296602d;
    }

    public final boolean d() {
        return f296604f;
    }

    public final boolean e() {
        return f296605g;
    }

    public final boolean f() {
        return f296607i;
    }

    public final boolean h() {
        return f296601c;
    }

    public final boolean i() {
        return f296603e;
    }
}
