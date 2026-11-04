package ti;

import java.nio.charset.MalformedInputException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class c extends MalformedInputException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f381051a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull String message) {
        super(0);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f381051a = message;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    @Nullable
    public String getMessage() {
        return this.f381051a;
    }
}
