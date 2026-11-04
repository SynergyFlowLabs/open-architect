package androidx.compose.runtime.tooling;

import androidx.compose.runtime.internal.w0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class s extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36695b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<c> f36696a;

    public s(@NotNull List<c> list) {
        this.f36696a = list;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    @Nullable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Composition stack when thrown:");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        d.a(sb2, this.f36696a);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
