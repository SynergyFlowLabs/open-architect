package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n3;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.graphics.u1;
import com.rabbitmq.client.k0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,645:1\n85#2:646\n117#2,2:647\n85#2:649\n117#2,2:650\n635#3:652\n57#4:653\n61#4:656\n57#4:659\n61#4:662\n57#4:666\n61#4:669\n60#5:654\n70#5:657\n60#5:660\n70#5:663\n80#5:665\n60#5:667\n70#5:670\n22#6:655\n22#6:658\n22#6:661\n22#6:668\n22#6:671\n30#7:664\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n*L\n121#1:646\n121#1:647,2\n127#1:649\n127#1:650,2\n142#1:652\n161#1:653\n162#1:656\n165#1:659\n165#1:662\n192#1:666\n193#1:669\n161#1:654\n162#1:657\n165#1:660\n165#1:663\n165#1:665\n192#1:667\n193#1:670\n161#1:655\n162#1:658\n165#1:661\n192#1:668\n193#1:671\n165#1:664\n*E\n"})
public final class n extends l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f38517o = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.vector.c f38518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private String f38519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f38520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.vector.a f38521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private Function0<Unit> f38522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final n3 f38523h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private r0 f38524i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final n3 f38525j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f38526k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f38527l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f38528m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.graphics.drawscope.f, Unit> f38529n;

    static final class a extends l0 implements Function1<l, Unit> {
        a() {
            super(1);
        }

        public final void c(l lVar) {
            n.this.h();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(l lVar) {
            c(lVar);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent$drawVectorBlock$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,645:1\n1#2:646\n172#3:647\n249#3,14:648\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent$drawVectorBlock$1\n*L\n136#1:647\n136#1:648,14\n*E\n"})
    static final class b extends l0 implements Function1<androidx.compose.ui.graphics.drawscope.f, Unit> {
        b() {
            super(1);
        }

        public final void c(androidx.compose.ui.graphics.drawscope.f fVar) {
            androidx.compose.ui.graphics.vector.c cVarN = n.this.n();
            n nVar = n.this;
            float f10 = nVar.f38527l;
            float f11 = nVar.f38528m;
            long jE = n0.g.f332700b.e();
            androidx.compose.ui.graphics.drawscope.d dVarZ3 = fVar.Z3();
            long jD = dVarZ3.d();
            dVarZ3.f().save();
            try {
                dVarZ3.i().g(f10, f11, jE);
                cVarN.a(fVar);
            } finally {
                dVarZ3.f().B();
                dVarZ3.g(jD);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            c(fVar);
            return Unit.f312394a;
        }
    }

    static final class c extends l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f38532a = new c();

        c() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }
    }

    public n(@NotNull androidx.compose.ui.graphics.vector.c cVar) {
        super(null);
        this.f38518c = cVar;
        cVar.d(new a());
        this.f38519d = "";
        this.f38520e = true;
        this.f38521f = new androidx.compose.ui.graphics.vector.a();
        this.f38522g = c.f38532a;
        this.f38523h = d7.g(null, null, 2, null);
        n0.n.a aVar = n0.n.f332724b;
        this.f38525j = d7.g(n0.n.c(aVar.c()), null, 2, null);
        this.f38526k = aVar.a();
        this.f38527l = 1.0f;
        this.f38528m = 1.0f;
        this.f38529n = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        this.f38520e = true;
        this.f38522g.invoke();
    }

    @Override // androidx.compose.ui.graphics.vector.l
    public void a(@NotNull androidx.compose.ui.graphics.drawscope.f fVar) {
        i(fVar, 1.0f, null);
    }

    public final void i(@NotNull androidx.compose.ui.graphics.drawscope.f fVar, float f10, @Nullable r0 r0Var) {
        androidx.compose.ui.graphics.drawscope.f fVar2;
        int iA = (this.f38518c.s() && this.f38518c.n() != 16 && s.j(k()) && s.j(r0Var)) ? u1.f38249b.a() : u1.f38249b.b();
        if (!this.f38520e && n0.n.k(this.f38526k, fVar.d()) && u1.i(iA, j())) {
            fVar2 = fVar;
        } else {
            this.f38524i = u1.i(iA, u1.f38249b.a()) ? r0.a.d(r0.f38151b, s.k(this.f38518c.n()), 0, 2, null) : null;
            this.f38527l = Float.intBitsToFloat((int) (fVar.d() >> 32)) / Float.intBitsToFloat((int) (o() >> 32));
            this.f38528m = Float.intBitsToFloat((int) (fVar.d() & k0.f265952a)) / Float.intBitsToFloat((int) (o() & k0.f265952a));
            fVar2 = fVar;
            this.f38521f.b(iA, androidx.compose.ui.unit.u.e((((long) ((int) Math.ceil(Float.intBitsToFloat((int) (fVar.d() & k0.f265952a))))) & k0.f265952a) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (fVar.d() >> 32))))) << 32)), fVar2, fVar.getLayoutDirection(), this.f38529n);
            this.f38520e = false;
            this.f38526k = fVar2.d();
        }
        if (r0Var == null) {
            r0Var = k() != null ? k() : this.f38524i;
        }
        this.f38521f.c(fVar2, f10, r0Var);
    }

    public final int j() {
        t1 t1VarE = this.f38521f.e();
        return t1VarE != null ? t1VarE.d() : u1.f38249b.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final r0 k() {
        return (r0) this.f38523h.getValue();
    }

    @NotNull
    public final Function0<Unit> l() {
        return this.f38522g;
    }

    @NotNull
    public final String m() {
        return this.f38519d;
    }

    @NotNull
    public final androidx.compose.ui.graphics.vector.c n() {
        return this.f38518c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long o() {
        return ((n0.n) this.f38525j.getValue()).y();
    }

    public final void p(@Nullable r0 r0Var) {
        this.f38523h.setValue(r0Var);
    }

    public final void q(@NotNull Function0<Unit> function0) {
        this.f38522g = function0;
    }

    public final void r(@NotNull String str) {
        this.f38519d = str;
    }

    public final void s(long j10) {
        this.f38525j.setValue(n0.n.c(j10));
    }

    @NotNull
    public String toString() {
        String str = "Params: \tname: " + this.f38519d + "\n\tviewportWidth: " + Float.intBitsToFloat((int) (o() >> 32)) + "\n\tviewportHeight: " + Float.intBitsToFloat((int) (o() & k0.f265952a)) + "\n";
        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        return str;
    }
}
