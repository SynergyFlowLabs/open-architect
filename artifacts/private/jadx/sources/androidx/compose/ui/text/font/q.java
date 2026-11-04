package androidx.compose.ui.text.font;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class q implements d1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f41686d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final x.b f41687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f41688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f41689c = new Object();

    public q(@NotNull x.b bVar, @NotNull Context context) {
        this.f41687a = bVar;
        this.f41688b = context;
    }

    @Override // androidx.compose.ui.text.font.d1
    @Nullable
    public Object a(@NotNull x xVar, @NotNull kotlin.coroutines.d<Object> dVar) {
        if (!(xVar instanceof d)) {
            return this.f41687a.a(xVar);
        }
        d dVar2 = (d) xVar;
        return dVar2.d().b(this.f41688b, dVar2, dVar);
    }

    @Override // androidx.compose.ui.text.font.d1
    @Nullable
    public Object b(@NotNull x xVar) {
        if (!(xVar instanceof d)) {
            return this.f41687a.a(xVar);
        }
        d dVar = (d) xVar;
        return dVar.d().a(this.f41688b, dVar);
    }

    @NotNull
    public final x.b c() {
        return this.f41687a;
    }

    @Override // androidx.compose.ui.text.font.d1
    @NotNull
    public Object getCacheKey() {
        return this.f41689c;
    }
}
