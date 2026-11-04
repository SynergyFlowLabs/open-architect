package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.b4;
import androidx.compose.ui.semantics.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nInputTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputTransformation.kt\nandroidx/compose/foundation/text/input/FilterChain\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,243:1\n1#2:244\n*E\n"})
final class b implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f19395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final c f19396c;

    public b(@NotNull c cVar, @NotNull c cVar2) {
        this.f19395b = cVar;
        this.f19396c = cVar2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f19395b, bVar.f19395b) && Intrinsics.areEqual(this.f19396c, bVar.f19396c) && Intrinsics.areEqual(r0(), bVar.r0());
    }

    public int hashCode() {
        int iHashCode = ((this.f19395b.hashCode() * 31) + this.f19396c.hashCode()) * 32;
        b4 b4VarR0 = r0();
        return iHashCode + (b4VarR0 != null ? b4VarR0.hashCode() : 0);
    }

    @Override // androidx.compose.foundation.text.input.c
    public void p0(@NotNull e0 e0Var) {
        this.f19395b.p0(e0Var);
        this.f19396c.p0(e0Var);
    }

    @Override // androidx.compose.foundation.text.input.c
    public void q0(@NotNull j jVar) {
        this.f19395b.q0(jVar);
        this.f19396c.q0(jVar);
    }

    @Override // androidx.compose.foundation.text.input.c
    @Nullable
    public b4 r0() {
        b4 b4VarK;
        b4 b4VarR0 = this.f19396c.r0();
        if (b4VarR0 != null && (b4VarK = b4VarR0.k(this.f19395b.r0())) != null) {
            return b4VarK;
        }
        return this.f19395b.r0();
    }

    @NotNull
    public String toString() {
        return this.f19395b + ".then(" + this.f19396c + ')';
    }
}
