package androidx.compose.ui.text.platform;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class v implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private n7<Boolean> f42112a;

    public static final class a extends androidx.emoji2.text.f.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n3<Boolean> f42113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f42114b;

        a(n3<Boolean> n3Var, v vVar) {
            this.f42113a = n3Var;
            this.f42114b = vVar;
        }

        @Override // androidx.emoji2.text.f.g
        public void a(Throwable th2) {
            this.f42114b.f42112a = z.f42119a;
        }

        @Override // androidx.emoji2.text.f.g
        public void b() {
            this.f42113a.setValue(Boolean.TRUE);
            this.f42114b.f42112a = new a0(true);
        }
    }

    public v() {
        this.f42112a = androidx.emoji2.text.f.q() ? c() : null;
    }

    private final n7<Boolean> c() {
        androidx.emoji2.text.f fVarC = androidx.emoji2.text.f.c();
        if (fVarC.i() == 1) {
            return new a0(true);
        }
        n3 n3VarG = d7.g(Boolean.FALSE, null, 2, null);
        fVarC.B(new a(n3VarG, this));
        return n3VarG;
    }

    @Override // androidx.compose.ui.text.platform.y
    @NotNull
    public n7<Boolean> a() {
        n7<Boolean> n7Var = this.f42112a;
        if (n7Var != null) {
            Intrinsics.checkNotNull(n7Var);
            return n7Var;
        }
        if (!androidx.emoji2.text.f.q()) {
            return z.f42119a;
        }
        n7<Boolean> n7VarC = c();
        this.f42112a = n7VarC;
        Intrinsics.checkNotNull(n7VarC);
        return n7VarC;
    }
}
