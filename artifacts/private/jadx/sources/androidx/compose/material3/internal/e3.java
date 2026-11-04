package androidx.compose.material3.internal;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public abstract class e3 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f28817a = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public e3() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(f3.f28872a);
        return this;
    }

    public e3(@Nullable String str) {
        super(str);
    }

    public /* synthetic */ e3(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
