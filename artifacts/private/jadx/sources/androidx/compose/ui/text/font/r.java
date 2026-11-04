package androidx.compose.ui.text.font;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class r implements d1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41696c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final x.b f41697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f41698b = new Object();

    public r(@NotNull x.b bVar) {
        this.f41697a = bVar;
    }

    @Override // androidx.compose.ui.text.font.d1
    @Nullable
    public Object a(@NotNull x xVar, @NotNull kotlin.coroutines.d<Object> dVar) {
        return this.f41697a.a(xVar);
    }

    @Override // androidx.compose.ui.text.font.d1
    @NotNull
    public Object b(@NotNull x xVar) {
        return this.f41697a.a(xVar);
    }

    @NotNull
    public final x.b c() {
        return this.f41697a;
    }

    @Override // androidx.compose.ui.text.font.d1
    @NotNull
    public Object getCacheKey() {
        return this.f41698b;
    }
}
