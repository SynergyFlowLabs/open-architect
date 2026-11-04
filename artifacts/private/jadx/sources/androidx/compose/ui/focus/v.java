package androidx.compose.ui.focus;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class v implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f37462b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<s, Unit> f37463a;

    /* JADX WARN: Multi-variable type inference failed */
    public v(@NotNull Function1<? super s, Unit> function1) {
        this.f37463a = function1;
    }

    @Override // androidx.compose.ui.focus.f0
    public void a(@NotNull z zVar) {
        this.f37463a.invoke(new s(zVar));
    }

    @NotNull
    public final Function1<s, Unit> b() {
        return this.f37463a;
    }
}
