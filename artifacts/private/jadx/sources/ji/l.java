package ji;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends IllegalArgumentException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f307449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Throwable f307450b;

    public /* synthetic */ l(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }

    @Override // java.lang.Throwable
    @Nullable
    public Throwable getCause() {
        return this.f307450b;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.f307449a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull String message, @Nullable Throwable th2) {
        super(message, th2);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f307449a = message;
        this.f307450b = th2;
    }
}
