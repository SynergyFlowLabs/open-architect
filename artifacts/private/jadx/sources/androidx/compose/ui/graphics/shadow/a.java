package androidx.compose.ui.graphics.shadow;

import androidx.collection.k2;
import androidx.compose.ui.graphics.d3;
import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.unit.w;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import n0.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidShadowContext.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidShadowContext.android.kt\nandroidx/compose/ui/graphics/shadow/AndroidShadowContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n"})
final class a implements i, f, h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private k2<C0289a, e> f38192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private k2<C0289a, g> f38193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private C0289a f38194e;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.shadow.a$a, reason: collision with other inner class name */
    public static final class C0289a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private q3 f38195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f38196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private w f38197c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f38198d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private j f38199e;

        public /* synthetic */ C0289a(q3 q3Var, long j10, w wVar, float f10, j jVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(q3Var, j10, wVar, f10, jVar);
        }

        public static /* synthetic */ C0289a g(C0289a c0289a, q3 q3Var, long j10, w wVar, float f10, j jVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                q3Var = c0289a.f38195a;
            }
            if ((i10 & 2) != 0) {
                j10 = c0289a.f38196b;
            }
            if ((i10 & 4) != 0) {
                wVar = c0289a.f38197c;
            }
            if ((i10 & 8) != 0) {
                f10 = c0289a.f38198d;
            }
            if ((i10 & 16) != 0) {
                jVar = c0289a.f38199e;
            }
            j jVar2 = jVar;
            w wVar2 = wVar;
            return c0289a.f(q3Var, j10, wVar2, f10, jVar2);
        }

        @NotNull
        public final q3 a() {
            return this.f38195a;
        }

        public final long b() {
            return this.f38196b;
        }

        @NotNull
        public final w c() {
            return this.f38197c;
        }

        public final float d() {
            return this.f38198d;
        }

        @Nullable
        public final j e() {
            return this.f38199e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0289a)) {
                return false;
            }
            C0289a c0289a = (C0289a) obj;
            return Intrinsics.areEqual(this.f38195a, c0289a.f38195a) && n.k(this.f38196b, c0289a.f38196b) && this.f38197c == c0289a.f38197c && Float.compare(this.f38198d, c0289a.f38198d) == 0 && Intrinsics.areEqual(this.f38199e, c0289a.f38199e);
        }

        @NotNull
        public final C0289a f(@NotNull q3 q3Var, long j10, @NotNull w wVar, float f10, @Nullable j jVar) {
            return new C0289a(q3Var, j10, wVar, f10, jVar, null);
        }

        public final float h() {
            return this.f38198d;
        }

        public int hashCode() {
            int iHashCode = ((((((this.f38195a.hashCode() * 31) + n.u(this.f38196b)) * 31) + this.f38197c.hashCode()) * 31) + Float.hashCode(this.f38198d)) * 31;
            j jVar = this.f38199e;
            return iHashCode + (jVar == null ? 0 : jVar.hashCode());
        }

        @NotNull
        public final w i() {
            return this.f38197c;
        }

        @Nullable
        public final j j() {
            return this.f38199e;
        }

        @NotNull
        public final q3 k() {
            return this.f38195a;
        }

        public final long l() {
            return this.f38196b;
        }

        public final void m(float f10) {
            this.f38198d = f10;
        }

        public final void n(@NotNull w wVar) {
            this.f38197c = wVar;
        }

        public final void o(@Nullable j jVar) {
            this.f38199e = jVar;
        }

        public final void p(@NotNull q3 q3Var) {
            this.f38195a = q3Var;
        }

        public final void q(long j10) {
            this.f38196b = j10;
        }

        @NotNull
        public String toString() {
            return "ShadowKey(shape=" + this.f38195a + ", size=" + ((Object) n.x(this.f38196b)) + ", layoutDirection=" + this.f38197c + ", density=" + this.f38198d + ", shadow=" + this.f38199e + ')';
        }

        private C0289a(q3 q3Var, long j10, w wVar, float f10, j jVar) {
            this.f38195a = q3Var;
            this.f38196b = j10;
            this.f38197c = wVar;
            this.f38198d = f10;
            this.f38199e = jVar;
        }

        public /* synthetic */ C0289a(q3 q3Var, long j10, w wVar, float f10, j jVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? d3.a() : q3Var, (i10 & 2) != 0 ? n.f332724b.c() : j10, (i10 & 4) != 0 ? w.Ltr : wVar, (i10 & 8) != 0 ? 1.0f : f10, (i10 & 16) != 0 ? null : jVar, null);
        }
    }

    private final k2<C0289a, e> f() {
        k2<C0289a, e> k2Var = this.f38192c;
        if (k2Var != null) {
            return k2Var;
        }
        k2<C0289a, e> k2Var2 = new k2<>(0, 1, null);
        this.f38192c = k2Var2;
        return k2Var2;
    }

    private final k2<C0289a, g> g() {
        k2<C0289a, g> k2Var = this.f38193d;
        if (k2Var != null) {
            return k2Var;
        }
        k2<C0289a, g> k2Var2 = new k2<>(0, 1, null);
        this.f38193d = k2Var2;
        return k2Var2;
    }

    private final C0289a h() {
        C0289a c0289a = this.f38194e;
        if (c0289a != null) {
            return c0289a;
        }
        C0289a c0289a2 = new C0289a(null, 0L, null, 0.0f, null, 31, null);
        this.f38194e = c0289a2;
        return c0289a2;
    }

    @Override // androidx.compose.ui.graphics.shadow.k
    public void a() {
        synchronized (this) {
            try {
                k2<C0289a, e> k2Var = this.f38192c;
                if (k2Var != null) {
                    k2Var.K();
                }
                k2<C0289a, g> k2Var2 = this.f38193d;
                if (k2Var2 != null) {
                    k2Var2.K();
                }
                this.f38194e = null;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.ui.graphics.shadow.h
    @NotNull
    public g b(@NotNull q3 q3Var, long j10, @NotNull w wVar, @NotNull androidx.compose.ui.unit.d dVar, @NotNull j jVar) {
        g gVarP;
        synchronized (this) {
            C0289a c0289aH = h();
            c0289aH.p(q3Var);
            c0289aH.q(j10);
            c0289aH.n(wVar);
            c0289aH.m(dVar.getDensity());
            c0289aH.o(jVar);
            gVarP = g().p(c0289aH);
            if (gVarP == null) {
                g gVar = new g(jVar, q3Var.mo0createOutlinePq9zytI(j10, wVar, dVar));
                g().q0(C0289a.g(c0289aH, null, 0L, null, 0.0f, null, 31, null), gVar);
                gVarP = gVar;
            }
        }
        return gVarP;
    }

    @Override // androidx.compose.ui.graphics.shadow.k
    @NotNull
    public DropShadowPainter c(@NotNull q3 q3Var, @NotNull j jVar) {
        return new DropShadowPainter(q3Var, jVar, this);
    }

    @Override // androidx.compose.ui.graphics.shadow.f
    @NotNull
    public e d(@NotNull q3 q3Var, long j10, @NotNull w wVar, @NotNull androidx.compose.ui.unit.d dVar, @NotNull j jVar) {
        e eVarP;
        synchronized (this) {
            C0289a c0289aH = h();
            c0289aH.p(q3Var);
            c0289aH.q(j10);
            c0289aH.n(wVar);
            c0289aH.m(dVar.getDensity());
            c0289aH.o(jVar.a());
            eVarP = f().p(c0289aH);
            if (eVarP == null) {
                e eVar = new e(jVar, q3Var.mo0createOutlinePq9zytI(j10, wVar, dVar));
                f().q0(C0289a.g(c0289aH, null, 0L, null, 0.0f, null, 31, null), eVar);
                eVarP = eVar;
            }
        }
        return eVarP;
    }

    @Override // androidx.compose.ui.graphics.shadow.k
    @NotNull
    public InnerShadowPainter e(@NotNull q3 q3Var, @NotNull j jVar) {
        return new InnerShadowPainter(q3Var, jVar, this);
    }
}
