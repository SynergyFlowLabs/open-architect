package rb;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f362243a;

    public c() {
        this(0.0f, 1, null);
    }

    @Override // rb.a
    public boolean a(@NotNull qb.a item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getSize().f180484c >= this.f362243a;
    }

    public c(float f10) {
        this.f362243a = f10;
    }

    public /* synthetic */ c(float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 3.0f : f10);
    }
}
