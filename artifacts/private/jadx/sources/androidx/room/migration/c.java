package androidx.room.migration;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final class c extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<w3.d, Unit> f75012c;

    /* JADX WARN: Multi-variable type inference failed */
    public c(int i10, int i11, @NotNull Function1<? super w3.d, Unit> function1) {
        super(i10, i11);
        this.f75012c = function1;
    }

    @Override // androidx.room.migration.b
    public void a(@NotNull w3.d dVar) {
        this.f75012c.invoke(dVar);
    }

    @NotNull
    public final Function1<w3.d, Unit> b() {
        return this.f75012c;
    }
}
