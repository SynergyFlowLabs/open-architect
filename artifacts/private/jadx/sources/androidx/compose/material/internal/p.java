package androidx.compose.material.internal;

import androidx.compose.runtime.internal.w0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public abstract class p extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f23221a = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public p() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(q.f23222a);
        return this;
    }

    public p(@Nullable String str) {
        super(str);
    }

    public /* synthetic */ p(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
