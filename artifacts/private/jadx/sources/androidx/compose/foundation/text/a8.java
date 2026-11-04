package androidx.compose.foundation.text;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class a8 implements androidx.compose.ui.text.input.m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.input.m0 f18767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f18769d;

    public a8(@NotNull androidx.compose.ui.text.input.m0 m0Var, int i10, int i11) {
        this.f18767b = m0Var;
        this.f18768c = i10;
        this.f18769d = i11;
    }

    @Override // androidx.compose.ui.text.input.m0
    public int a(int i10) {
        int iA = this.f18767b.a(i10);
        if (i10 >= 0 && i10 <= this.f18769d) {
            b8.h(iA, this.f18768c, i10);
        }
        return iA;
    }

    @Override // androidx.compose.ui.text.input.m0
    public int b(int i10) {
        int iB = this.f18767b.b(i10);
        if (i10 >= 0 && i10 <= this.f18768c) {
            b8.g(iB, this.f18769d, i10);
        }
        return iB;
    }
}
