package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/CompositionDataImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,5012:1\n1#2:5013\n*E\n"})
public final class r0 implements androidx.compose.runtime.tooling.f, androidx.compose.runtime.tooling.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36330b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final o0 f36331a;

    public r0(@NotNull o0 o0Var) {
        this.f36331a = o0Var;
    }

    private final p0 d(o0 o0Var) {
        s0 s0Var = o0Var instanceof s0 ? (s0) o0Var : null;
        if (s0Var != null) {
            return s0Var.J();
        }
        return null;
    }

    private final o0 e(o0 o0Var) {
        p0 p0VarD = d(o0Var);
        if (p0VarD != null) {
            return p0VarD.i();
        }
        return null;
    }

    private final w5 f() {
        o0 o0Var = this.f36331a;
        Intrinsics.checkNotNull(o0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        return ((s0) o0Var).f0();
    }

    private final w5 g(o0 o0Var) {
        s0 s0Var = o0Var instanceof s0 ? (s0) o0Var : null;
        if (s0Var != null) {
            return s0Var.f0();
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.n
    @Nullable
    public androidx.compose.runtime.tooling.m a() {
        w5 w5VarG;
        p0 p0VarD;
        Integer numE;
        o0 o0VarE = e(this.f36331a);
        if (o0VarE == null || (w5VarG = g(o0VarE)) == null || (p0VarD = d(this.f36331a)) == null || (numE = androidx.compose.runtime.tooling.b.e(w5VarG, p0VarD)) == null) {
            return null;
        }
        return y5.z(w5VarG, numE.intValue());
    }

    @NotNull
    public final o0 b() {
        return this.f36331a;
    }

    @Override // androidx.compose.runtime.tooling.f
    @Nullable
    public androidx.compose.runtime.tooling.m c(@NotNull Object obj) {
        return f().c(obj);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof r0) && Intrinsics.areEqual(this.f36331a, ((r0) obj).f36331a);
    }

    @Override // androidx.compose.runtime.tooling.n
    @NotNull
    public androidx.compose.runtime.tooling.f getData() {
        return this;
    }

    @Override // androidx.compose.runtime.tooling.n
    @Nullable
    public androidx.compose.runtime.tooling.n getParent() {
        o0 o0VarE = e(this.f36331a);
        if (o0VarE != null) {
            return new r0(o0VarE);
        }
        return null;
    }

    public int hashCode() {
        return this.f36331a.hashCode() * 31;
    }

    @Override // androidx.compose.runtime.tooling.f
    @NotNull
    public Iterable<androidx.compose.runtime.tooling.m> i() {
        return f().i();
    }

    @Override // androidx.compose.runtime.tooling.f
    public boolean isEmpty() {
        return f().isEmpty();
    }
}
