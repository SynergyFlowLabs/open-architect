package fd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.payments.a f275115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final b f275116b;

    public c(@NotNull com.planner5d.library.model.payments.a order, @Nullable b bVar) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.f275115a = order;
        this.f275116b = bVar;
    }

    @NotNull
    public final com.planner5d.library.model.payments.a a() {
        return this.f275115a;
    }

    @Nullable
    public final b b() {
        return this.f275116b;
    }
}
