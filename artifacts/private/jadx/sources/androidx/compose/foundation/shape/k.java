package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.f2;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.graphics.u;
import androidx.compose.ui.unit.w;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public final class k implements q3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f18742b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final pj.n<k2, n0.n, w, Unit> f18743a;

    /* JADX WARN: Multi-variable type inference failed */
    public k(@NotNull pj.n<? super k2, ? super n0.n, ? super w, Unit> nVar) {
        this.f18743a = nVar;
    }

    @Override // androidx.compose.ui.graphics.q3
    @NotNull
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public f2 mo0createOutlinePq9zytI(long j10, @NotNull w wVar, @NotNull androidx.compose.ui.unit.d dVar) {
        k2 k2VarA = u.a();
        this.f18743a.invoke(k2VarA, n0.n.c(j10), wVar);
        k2VarA.close();
        return new f2.a(k2VarA);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        k kVar = obj instanceof k ? (k) obj : null;
        return (kVar != null ? kVar.f18743a : null) == this.f18743a;
    }

    public int hashCode() {
        return this.f18743a.hashCode();
    }
}
