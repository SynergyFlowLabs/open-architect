package io.reactivex.android.plugins;

import dj.o;
import io.reactivex.exceptions.b;
import io.reactivex.j0;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile o<Callable<j0>, j0> f298641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile o<j0, j0> f298642b;

    private a() {
        throw new AssertionError("No instances.");
    }

    static <T, R> R a(o<T, R> oVar, T t10) {
        try {
            return oVar.apply(t10);
        } catch (Throwable th2) {
            throw b.a(th2);
        }
    }

    static j0 b(o<Callable<j0>, j0> oVar, Callable<j0> callable) {
        j0 j0Var = (j0) a(oVar, callable);
        if (j0Var != null) {
            return j0Var;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    static j0 c(Callable<j0> callable) {
        try {
            j0 j0VarCall = callable.call();
            if (j0VarCall != null) {
                return j0VarCall;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th2) {
            throw b.a(th2);
        }
    }

    public static o<Callable<j0>, j0> d() {
        return f298641a;
    }

    public static o<j0, j0> e() {
        return f298642b;
    }

    public static j0 f(Callable<j0> callable) {
        if (callable == null) {
            throw new NullPointerException("scheduler == null");
        }
        o<Callable<j0>, j0> oVar = f298641a;
        return oVar == null ? c(callable) : b(oVar, callable);
    }

    public static j0 g(j0 j0Var) {
        if (j0Var == null) {
            throw new NullPointerException("scheduler == null");
        }
        o<j0, j0> oVar = f298642b;
        return oVar == null ? j0Var : (j0) a(oVar, j0Var);
    }

    public static void h() {
        i(null);
        j(null);
    }

    public static void i(o<Callable<j0>, j0> oVar) {
        f298641a = oVar;
    }

    public static void j(o<j0, j0> oVar) {
        f298642b = oVar;
    }
}
