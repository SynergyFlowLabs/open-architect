package io.reactivex.internal.operators.mixed;

import io.reactivex.i0;
import io.reactivex.internal.operators.maybe.n1;
import io.reactivex.internal.operators.single.v0;
import io.reactivex.q0;
import io.reactivex.y;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
final class r {
    private r() {
        throw new IllegalStateException("No instances!");
    }

    static <T> boolean a(Object obj, dj.o<? super T, ? extends io.reactivex.i> oVar, io.reactivex.f fVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            a0.b bVar = (Object) ((Callable) obj).call();
            io.reactivex.i iVar = bVar != null ? (io.reactivex.i) io.reactivex.internal.functions.b.g(oVar.apply(bVar), "The mapper returned a null CompletableSource") : null;
            if (iVar == null) {
                io.reactivex.internal.disposables.e.b(fVar);
            } else {
                iVar.b(fVar);
            }
            return true;
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.disposables.e.e(th2, fVar);
            return true;
        }
    }

    static <T, R> boolean b(Object obj, dj.o<? super T, ? extends y<? extends R>> oVar, i0<? super R> i0Var) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            a0.b bVar = (Object) ((Callable) obj).call();
            y yVar = bVar != null ? (y) io.reactivex.internal.functions.b.g(oVar.apply(bVar), "The mapper returned a null MaybeSource") : null;
            if (yVar == null) {
                io.reactivex.internal.disposables.e.d(i0Var);
            } else {
                yVar.a(n1.h8(i0Var));
            }
            return true;
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.disposables.e.l(th2, i0Var);
            return true;
        }
    }

    static <T, R> boolean c(Object obj, dj.o<? super T, ? extends q0<? extends R>> oVar, i0<? super R> i0Var) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            a0.b bVar = (Object) ((Callable) obj).call();
            q0 q0Var = bVar != null ? (q0) io.reactivex.internal.functions.b.g(oVar.apply(bVar), "The mapper returned a null SingleSource") : null;
            if (q0Var == null) {
                io.reactivex.internal.disposables.e.d(i0Var);
            } else {
                q0Var.f(v0.h8(i0Var));
            }
            return true;
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.disposables.e.l(th2, i0Var);
            return true;
        }
    }
}
