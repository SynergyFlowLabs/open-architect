package ui;

import java.io.EOFException;
import kotlin.b1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.c0;
import kotlinx.io.g0;
import kotlinx.io.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final c0 f381262a = new kotlinx.io.b();

    @NotNull
    public static final c0 a(@NotNull byte[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        kotlinx.io.b bVar = new kotlinx.io.b();
        bVar.write(array, i10, i11 + i10);
        return bVar;
    }

    @kotlin.l(message = "Use Source instead", replaceWith = @b1(expression = "Source", imports = {"kotlinx.io.Source"}))
    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ c0 c(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return a(bArr, i10, i11);
    }

    @kotlin.l(message = "Use Buffer instead", replaceWith = @b1(expression = "Buffer()", imports = {"kotlinx.io.Buffer"}))
    @NotNull
    public static final kotlinx.io.b d() {
        return new kotlinx.io.b();
    }

    @kotlin.l(message = "Use Buffer instead", replaceWith = @b1(expression = "Buffer()", imports = {"kotlinx.io.Buffer"}))
    @NotNull
    public static final kotlinx.io.b e(@NotNull io.ktor.utils.io.pool.h<?> pool) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        return new kotlinx.io.b();
    }

    @kotlin.l(message = "Use peek() or buffer.copy() instead, depending on your use case.", replaceWith = @b1(expression = "peek()", imports = {"kotlinx.io.Source"}))
    @NotNull
    public static final c0 f(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return c0Var.peek();
    }

    public static final long g(@NotNull c0 c0Var, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        c0Var.request(j10);
        long jMin = Math.min(j10, j(c0Var));
        c0Var.n().skip(jMin);
        return jMin;
    }

    public static /* synthetic */ long h(c0 c0Var, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return g(c0Var, j10);
    }

    @NotNull
    public static final c0 i() {
        return f381262a;
    }

    public static final long j(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return c0Var.n().j();
    }

    public static /* synthetic */ void k(c0 c0Var) {
    }

    public static final <T> T l(@NotNull x xVar, @NotNull Function1<? super c0, ? extends T> function) throws Exception {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(function, "function");
        c0 c0VarPeek = xVar.n().peek();
        try {
            T tInvoke = function.invoke(c0VarPeek);
            kotlin.jdk7.a.c(c0VarPeek, null);
            return tInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jdk7.a.c(c0VarPeek, th2);
                throw th3;
            }
        }
    }

    public static final <T> T m(@NotNull c0 c0Var, @NotNull Function1<? super c0, ? extends T> function) throws Exception {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(function, "function");
        c0 c0VarPeek = c0Var.n().peek();
        try {
            T tInvoke = function.invoke(c0VarPeek);
            kotlin.jdk7.a.c(c0VarPeek, null);
            return tInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jdk7.a.c(c0VarPeek, th2);
                throw th3;
            }
        }
    }

    public static final int n(@NotNull c0 c0Var, @NotNull kotlinx.io.b out) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        long j10 = c0Var.n().j();
        out.la(c0Var);
        return (int) j10;
    }

    public static final void o(@NotNull c0 c0Var, @NotNull byte[] out, int i10, int i11) throws EOFException {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        g0.o(c0Var, out, i10, i11 + i10);
    }

    public static /* synthetic */ void p(c0 c0Var, byte[] bArr, int i10, int i11, int i12, Object obj) throws EOFException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length - i10;
        }
        o(c0Var, bArr, i10, i11);
    }

    public static final short q(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return g0.n(c0Var.n());
    }

    @kotlin.l(message = "Use close instead", replaceWith = @b1(expression = "this.close()", imports = {}))
    public static final void r(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        c0Var.close();
    }

    public static final void s(@NotNull c0 c0Var, @NotNull Function1<? super kotlinx.io.b, Boolean> block) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        while (!c0Var.y1() && block.invoke(c0Var.n()).booleanValue()) {
        }
    }
}
