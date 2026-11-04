package s0;

import androidx.compose.runtime.internal.w0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public abstract class c extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f366833a = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(d.f366834a);
        return this;
    }

    public c(@Nullable String str) {
        super(str);
    }

    public /* synthetic */ c(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
