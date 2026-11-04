package androidx.compose.ui.layout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class o implements c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f39456a;

    public o(int i10) {
        this.f39456a = i10;
    }

    @Override // androidx.compose.ui.layout.c3
    public void a(@NotNull c3.a aVar) {
        int size = aVar.size();
        int i10 = this.f39456a;
        if (size > i10) {
            aVar.s(i10);
        }
    }

    @Override // androidx.compose.ui.layout.c3
    public boolean b(@Nullable Object obj, @Nullable Object obj2) {
        return true;
    }
}
