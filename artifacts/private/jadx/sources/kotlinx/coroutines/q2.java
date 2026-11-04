package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class q2 extends CancellationException implements h0<q2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final transient p2 f315205a;

    public q2(@NotNull String str, @Nullable Throwable th2, @NotNull p2 p2Var) {
        super(str);
        this.f315205a = p2Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    @Override // kotlinx.coroutines.h0
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public q2 b() {
        return null;
    }

    @NotNull
    public final p2 c() {
        p2 p2Var = this.f315205a;
        if (p2Var == null) {
            p2Var = c3.f313552a;
        }
        return p2Var;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return Intrinsics.areEqual(q2Var.getMessage(), getMessage()) && Intrinsics.areEqual(q2Var.c(), c()) && Intrinsics.areEqual(q2Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        Intrinsics.checkNotNull(message);
        int iHashCode = message.hashCode() * 31;
        p2 p2VarC = c();
        int iHashCode2 = (iHashCode + (p2VarC != null ? p2VarC.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return super.toString() + "; job=" + c();
    }
}
