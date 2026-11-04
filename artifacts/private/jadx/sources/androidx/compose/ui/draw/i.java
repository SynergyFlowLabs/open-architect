package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.o1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,475:1\n1#2:476\n*E\n"})
public final class i implements androidx.compose.ui.unit.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f37290e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private f f37291a = r.f37307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private o f37292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.drawscope.c f37293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Function0<? extends o1> f37294d;

    static final class a extends l0 implements Function1<androidx.compose.ui.graphics.drawscope.c, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.graphics.drawscope.f, Unit> f37295a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1) {
            super(1);
            this.f37295a = function1;
        }

        public final void c(androidx.compose.ui.graphics.drawscope.c cVar) {
            this.f37295a.invoke(cVar);
            cVar.E4();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.drawscope.c cVar) {
            c(cVar);
            return Unit.f312394a;
        }
    }

    static final class b extends l0 implements Function1<androidx.compose.ui.graphics.drawscope.f, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.graphics.drawscope.c, Unit> f37296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.drawscope.c f37297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.d f37298c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.w f37299d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.d f37300e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.w f37301f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super androidx.compose.ui.graphics.drawscope.c, Unit> function1, androidx.compose.ui.graphics.drawscope.c cVar, androidx.compose.ui.unit.d dVar, androidx.compose.ui.unit.w wVar, androidx.compose.ui.unit.d dVar2, androidx.compose.ui.unit.w wVar2) {
            super(1);
            this.f37296a = function1;
            this.f37297b = cVar;
            this.f37298c = dVar;
            this.f37299d = wVar;
            this.f37300e = dVar2;
            this.f37301f = wVar2;
        }

        public final void c(androidx.compose.ui.graphics.drawscope.f fVar) {
            androidx.compose.ui.graphics.drawscope.d dVarZ3;
            androidx.compose.ui.unit.d dVar;
            androidx.compose.ui.unit.w wVar;
            androidx.compose.ui.graphics.drawscope.d dVarZ4 = fVar.Z3();
            androidx.compose.ui.unit.d dVar2 = this.f37298c;
            androidx.compose.ui.unit.w wVar2 = this.f37299d;
            dVarZ4.e(dVar2);
            dVarZ4.b(wVar2);
            try {
                this.f37296a.invoke(this.f37297b);
                dVarZ3 = fVar.Z3();
                dVar = this.f37300e;
                wVar = this.f37301f;
            } finally {
                dVarZ3 = fVar.Z3();
                dVar = this.f37300e;
                wVar = this.f37301f;
                dVarZ3.e(dVar);
                dVarZ3.b(wVar);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            c(fVar);
            return Unit.f312394a;
        }
    }

    public static /* synthetic */ void U(i iVar, androidx.compose.ui.graphics.layer.c cVar, androidx.compose.ui.unit.d dVar, androidx.compose.ui.unit.w wVar, long j10, Function1 function1, int i10, Object obj) {
        androidx.compose.ui.unit.d dVar2 = dVar;
        if ((i10 & 1) != 0) {
            dVar2 = iVar;
        }
        if ((i10 & 2) != 0) {
            wVar = iVar.getLayoutDirection();
        }
        if ((i10 & 4) != 0) {
            j10 = androidx.compose.ui.unit.v.g(iVar.d());
        }
        iVar.P(cVar, dVar2, wVar, j10, function1);
    }

    @Nullable
    public final Function0<o1> I() {
        return this.f37294d;
    }

    @NotNull
    public final androidx.compose.ui.graphics.layer.c J() {
        Function0<? extends o1> function0 = this.f37294d;
        Intrinsics.checkNotNull(function0);
        return function0.invoke().b();
    }

    @NotNull
    public final androidx.compose.ui.graphics.shadow.k K() {
        Function0<? extends o1> function0 = this.f37294d;
        Intrinsics.checkNotNull(function0);
        return function0.invoke().a();
    }

    @NotNull
    public final o M(@NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1) {
        return N(new a(function1));
    }

    @NotNull
    public final o N(@NotNull Function1<? super androidx.compose.ui.graphics.drawscope.c, Unit> function1) {
        o oVar = new o(function1);
        this.f37292b = oVar;
        return oVar;
    }

    public final void P(@NotNull androidx.compose.ui.graphics.layer.c cVar, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar, long j10, @NotNull Function1<? super androidx.compose.ui.graphics.drawscope.c, Unit> function1) {
        androidx.compose.ui.graphics.drawscope.c cVar2 = this.f37293c;
        Intrinsics.checkNotNull(cVar2);
        cVar2.H3(cVar, j10, new b(function1, cVar2, dVar, wVar, cVar2.Z3().getDensity(), cVar2.Z3().getLayoutDirection()));
    }

    public final void V(@NotNull f fVar) {
        this.f37291a = fVar;
    }

    public final void W(@Nullable androidx.compose.ui.graphics.drawscope.c cVar) {
        this.f37293c = cVar;
    }

    public final void X(@Nullable o oVar) {
        this.f37292b = oVar;
    }

    public final void Z(@Nullable Function0<? extends o1> function0) {
        this.f37294d = function0;
    }

    @NotNull
    public final f c() {
        return this.f37291a;
    }

    public final long d() {
        return this.f37291a.d();
    }

    @Override // androidx.compose.ui.unit.d
    public float getDensity() {
        return this.f37291a.getDensity().getDensity();
    }

    @NotNull
    public final androidx.compose.ui.unit.w getLayoutDirection() {
        return this.f37291a.getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.n
    public float m0() {
        return this.f37291a.getDensity().m0();
    }

    @Nullable
    public final androidx.compose.ui.graphics.drawscope.c w() {
        return this.f37293c;
    }

    @Nullable
    public final o x() {
        return this.f37292b;
    }
}
