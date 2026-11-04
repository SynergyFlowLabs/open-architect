package androidx.compose.ui.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class f0 extends androidx.compose.ui.a0.d {
    public static final int X = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private d0 f39320s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.node.j.a f39321t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.spatial.h f39322v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.spatial.h, Unit> f39323w = new a();

    static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.spatial.h, Unit> {
        a() {
            super(1);
        }

        public final void c(androidx.compose.ui.spatial.h hVar) {
            f0.this.x9().b(hVar);
            f0.this.C9(hVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.spatial.h hVar) {
            c(hVar);
            return Unit.f312394a;
        }
    }

    public f0(@NotNull d0 d0Var) {
        this.f39320s = d0Var;
    }

    public final void A9(@Nullable androidx.compose.ui.node.j.a aVar) {
        this.f39321t = aVar;
    }

    public final void B9(@NotNull d0 d0Var) {
        this.f39320s = d0Var;
    }

    public final void C9(@Nullable androidx.compose.ui.spatial.h hVar) {
        this.f39322v = hVar;
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        androidx.compose.ui.node.j.a aVar = this.f39321t;
        if (aVar != null) {
            aVar.a();
        }
        this.f39321t = s1.c(this, 0L, 0L, this.f39323w);
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        androidx.compose.ui.node.j.a aVar = this.f39321t;
        if (aVar != null) {
            aVar.a();
        }
        this.f39320s.b(null);
    }

    public final void v9() {
        this.f39320s.b(this.f39322v);
    }

    @Nullable
    public final androidx.compose.ui.node.j.a w9() {
        return this.f39321t;
    }

    @NotNull
    public final d0 x9() {
        return this.f39320s;
    }

    @Nullable
    public final androidx.compose.ui.spatial.h y9() {
        return this.f39322v;
    }

    @NotNull
    public final Function1<androidx.compose.ui.spatial.h, Unit> z9() {
        return this.f39323w;
    }
}
