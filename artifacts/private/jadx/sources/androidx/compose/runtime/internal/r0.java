package androidx.compose.runtime.internal;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public abstract class r0 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f36095a = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public r0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(s0.f36110a);
        return this;
    }

    public r0(@Nullable String str) {
        super(str);
    }

    public /* synthetic */ r0(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
