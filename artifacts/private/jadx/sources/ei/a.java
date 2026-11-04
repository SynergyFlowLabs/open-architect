package ei;

import java.net.ConnectException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends ConnectException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Throwable f274885a;

    public /* synthetic */ a(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }

    @Override // java.lang.Throwable
    @Nullable
    public Throwable getCause() {
        return this.f274885a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull String message, @Nullable Throwable th2) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f274885a = th2;
    }
}
