package androidx.compose.foundation.internal;

import androidx.compose.runtime.internal.w0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public abstract class h extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f15699a = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public h() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(i.f15700a);
        return this;
    }

    public h(@Nullable String str) {
        super(str);
    }

    public /* synthetic */ h(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
