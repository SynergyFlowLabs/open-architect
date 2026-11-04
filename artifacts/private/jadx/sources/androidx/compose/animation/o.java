package androidx.compose.animation;

import androidx.compose.animation.core.l3;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@i0
@SourceDebugExtension({"SMAP\nBoundsAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoundsAnimation.kt\nandroidx/compose/animation/BoundsAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,103:1\n85#2:104\n117#2,2:105\n85#2:107\n117#2,2:108\n85#2:110\n117#2,2:111\n*S KotlinDebug\n*F\n+ 1 BoundsAnimation.kt\nandroidx/compose/animation/BoundsAnimation\n*L\n39#1:104\n39#1:105,2\n54#1:107\n54#1:108,2\n69#1:110\n69#1:111,2\n*E\n"})
public final class o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f13677g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a1 f13678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l3<Boolean> f13679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n3 f13680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final n3 f13681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private androidx.compose.animation.core.y0<n0.j> f13682e = p.f13694a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final n3 f13683f = d7.g(null, null, 2, null);

    static final class a extends kotlin.jvm.internal.l0 implements Function1<l3.b<Boolean>, androidx.compose.animation.core.y0<n0.j>> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.animation.core.y0<n0.j> invoke(l3.b<Boolean> bVar) {
            return o.this.c();
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<Boolean, n0.j> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n0.j f13686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0.j f13687c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n0.j jVar, n0.j jVar2) {
            super(1);
            this.f13686b = jVar;
            this.f13687c = jVar2;
        }

        public final n0.j c(boolean z10) {
            return z10 == o.this.g().y().booleanValue() ? this.f13686b : this.f13687c;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ n0.j invoke(Boolean bool) {
            return c(bool.booleanValue());
        }
    }

    public o(@NotNull a1 a1Var, @NotNull l3<Boolean> l3Var, @NotNull l3<Boolean>.a<n0.j, androidx.compose.animation.core.v> aVar, @NotNull s sVar) {
        this.f13678a = a1Var;
        this.f13679b = l3Var;
        this.f13680c = d7.g(aVar, null, 2, null);
        this.f13681d = d7.g(sVar, null, 2, null);
    }

    private final s e() {
        return (s) this.f13681d.getValue();
    }

    private final void k(l3<Boolean>.a<n0.j, androidx.compose.animation.core.v> aVar) {
        this.f13680c.setValue(aVar);
    }

    private final void n(s sVar) {
        this.f13681d.setValue(sVar);
    }

    public final void a(@NotNull n0.j jVar, @NotNull n0.j jVar2) {
        if (this.f13678a.I()) {
            if (d() == null) {
                this.f13682e = e().a(jVar, jVar2);
            }
            m(b().a(new a(), new b(jVar2, jVar)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final l3<Boolean>.a<n0.j, androidx.compose.animation.core.v> b() {
        return (l3.a) this.f13680c.getValue();
    }

    @NotNull
    public final androidx.compose.animation.core.y0<n0.j> c() {
        return this.f13682e;
    }

    @Nullable
    public final n7<n0.j> d() {
        return (n7) this.f13683f.getValue();
    }

    public final boolean f() {
        return this.f13679b.y().booleanValue();
    }

    @NotNull
    public final l3<Boolean> g() {
        return this.f13679b;
    }

    @NotNull
    public final a1 h() {
        return this.f13678a;
    }

    @Nullable
    public final n0.j i() {
        n7<n0.j> n7VarD;
        if (!this.f13678a.I() || (n7VarD = d()) == null) {
            return null;
        }
        return n7VarD.getValue();
    }

    public final boolean j() {
        l3 l3VarU = this.f13679b;
        while (l3VarU.u() != null) {
            l3VarU = l3VarU.u();
            Intrinsics.checkNotNull(l3VarU);
        }
        return !Intrinsics.areEqual(l3VarU.p(), l3VarU.y());
    }

    public final void l(@NotNull androidx.compose.animation.core.y0<n0.j> y0Var) {
        this.f13682e = y0Var;
    }

    public final void m(@Nullable n7<n0.j> n7Var) {
        this.f13683f.setValue(n7Var);
    }

    public final void o(@NotNull l3<Boolean>.a<n0.j, androidx.compose.animation.core.v> aVar, @NotNull s sVar) {
        if (!Intrinsics.areEqual(b(), aVar)) {
            k(aVar);
            m(null);
            this.f13682e = p.f13694a;
        }
        n(sVar);
    }
}
