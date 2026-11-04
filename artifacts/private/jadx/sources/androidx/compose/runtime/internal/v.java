package androidx.compose.runtime.internal;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.q4;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
public final class v implements c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f36137f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f36139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Object f36140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private q4 f36141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private List<q4> f36142e;

    /* synthetic */ class a extends kotlin.jvm.internal.a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
        a(Object obj) {
            super(2, obj, v.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            ((v) this.receiver).M(c0Var, i10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    public v(int i10, boolean z10, @Nullable Object obj) {
        this.f36138a = i10;
        this.f36139b = z10;
        this.f36140c = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A0(v vVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        vVar.a0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, c0Var, t4.a(i10) | 1);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B0(v vVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        vVar.b0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, c0Var, t4.a(i10) | 1);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C0(v vVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        vVar.c0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, c0Var, i10 | 1, i10);
        return Unit.f312394a;
    }

    private final void D0(androidx.compose.runtime.c0 c0Var) {
        q4 q4VarF0;
        if (!this.f36139b || (q4VarF0 = c0Var.f0()) == null) {
            return;
        }
        c0Var.z(q4VarF0);
        if (w.f(this.f36141d, q4VarF0)) {
            this.f36141d = q4VarF0;
            return;
        }
        List<q4> list = this.f36142e;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.f36142e = arrayList;
            arrayList.add(q4VarF0);
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (w.f(list.get(i10), q4VarF0)) {
                list.set(i10, q4VarF0);
                return;
            }
        }
        list.add(q4VarF0);
    }

    private final void E0() {
        if (this.f36139b) {
            q4 q4Var = this.f36141d;
            if (q4Var != null) {
                q4Var.invalidate();
                this.f36141d = null;
            }
            List<q4> list = this.f36142e;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).invalidate();
                }
                list.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(v vVar, Object obj, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        vVar.P(obj, c0Var, t4.a(i10) | 1);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m0(v vVar, Object obj, Object obj2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        vVar.Q(obj, obj2, c0Var, t4.a(i10) | 1);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n0(v vVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        vVar.d0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, c0Var, t4.a(i10) | 1, t4.a(i11));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o0(v vVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        vVar.e0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, c0Var, t4.a(i10) | 1, t4.a(i11));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(v vVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        vVar.f0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, c0Var, t4.a(i10) | 1, t4.a(i11));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q0(v vVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        vVar.g0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, c0Var, t4.a(i10) | 1, t4.a(i11));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(v vVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        vVar.h0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, c0Var, t4.a(i10) | 1, t4.a(i11));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s0(v vVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        vVar.i0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, c0Var, t4.a(i10) | 1, t4.a(i11));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t0(v vVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        vVar.j0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, c0Var, t4.a(i10) | 1, t4.a(i11));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u0(v vVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        vVar.k0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, c0Var, t4.a(i10) | 1, t4.a(i11));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v0(v vVar, Object obj, Object obj2, Object obj3, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        vVar.T(obj, obj2, obj3, c0Var, t4.a(i10) | 1);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w0(v vVar, Object obj, Object obj2, Object obj3, Object obj4, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        vVar.W(obj, obj2, obj3, obj4, c0Var, t4.a(i10) | 1);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x0(v vVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        vVar.X(obj, obj2, obj3, obj4, obj5, c0Var, t4.a(i10) | 1);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y0(v vVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        vVar.Y(obj, obj2, obj3, obj4, obj5, obj6, c0Var, t4.a(i10) | 1);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z0(v vVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        vVar.Z(obj, obj2, obj3, obj4, obj5, obj6, obj7, c0Var, t4.a(i10) | 1);
        return Unit.f312394a;
    }

    @Override // pj.s
    public /* bridge */ /* synthetic */ Object D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, androidx.compose.runtime.c0 c0Var, Integer num) {
        return Y(obj, obj2, obj3, obj4, obj5, obj6, c0Var, num.intValue());
    }

    public final void F0(@NotNull Object obj) {
        if (!Intrinsics.areEqual(this.f36140c, obj)) {
            boolean z10 = this.f36140c == null;
            this.f36140c = obj;
            if (!z10) {
                E0();
            }
        }
    }

    @Override // pj.q
    public /* bridge */ /* synthetic */ Object H(Object obj, Object obj2, Object obj3, Object obj4, androidx.compose.runtime.c0 c0Var, Integer num) {
        return W(obj, obj2, obj3, obj4, c0Var, num.intValue());
    }

    @Override // pj.e
    public /* bridge */ /* synthetic */ Object I(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, androidx.compose.runtime.c0 c0Var, Integer num, Integer num2) {
        return d0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, c0Var, num.intValue(), num2.intValue());
    }

    public final int K() {
        return this.f36138a;
    }

    @Override // pj.h
    public /* bridge */ /* synthetic */ Object L(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, androidx.compose.runtime.c0 c0Var, Integer num, Integer num2) {
        return g0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, c0Var, num.intValue(), num2.intValue());
    }

    @Nullable
    public Object M(@NotNull androidx.compose.runtime.c0 c0Var, int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(this.f36138a);
        D0(c0VarR);
        int iD = i10 | (c0VarR.D(this) ? w.d(0) : w.g(0));
        Object obj = this.f36140c;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function2) r1.q(obj, 2)).invoke(c0VarR, Integer.valueOf(iD));
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new a(this));
        }
        return objInvoke;
    }

    @Override // pj.r
    public /* bridge */ /* synthetic */ Object N(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, androidx.compose.runtime.c0 c0Var, Integer num) {
        return X(obj, obj2, obj3, obj4, obj5, c0Var, num.intValue());
    }

    @Override // pj.f
    public /* bridge */ /* synthetic */ Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, androidx.compose.runtime.c0 c0Var, Integer num, Integer num2) {
        return e0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, c0Var, num.intValue(), num2.intValue());
    }

    @Nullable
    public Object P(@Nullable final Object obj, @NotNull androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(this.f36138a);
        D0(c0VarR);
        int iD = c0VarR.D(this) ? w.d(1) : w.g(1);
        Object obj2 = this.f36140c;
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((pj.n) r1.q(obj2, 3)).invoke(obj, c0VarR, Integer.valueOf(iD | i10));
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.runtime.internal.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return v.l0(this.f36111a, obj, i10, (androidx.compose.runtime.c0) obj3, ((Integer) obj4).intValue());
                }
            });
        }
        return objInvoke;
    }

    @Nullable
    public Object Q(@Nullable final Object obj, @Nullable final Object obj2, @NotNull androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(this.f36138a);
        D0(c0VarR);
        int iD = c0VarR.D(this) ? w.d(2) : w.g(2);
        Object obj3 = this.f36140c;
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((pj.o) r1.q(obj3, 4)).invoke(obj, obj2, c0VarR, Integer.valueOf(iD | i10));
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.runtime.internal.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return v.m0(this.f36062a, obj, obj2, i10, (androidx.compose.runtime.c0) obj4, ((Integer) obj5).intValue());
                }
            });
        }
        return objInvoke;
    }

    @Override // pj.i
    public /* bridge */ /* synthetic */ Object R(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, androidx.compose.runtime.c0 c0Var, Integer num, Integer num2) {
        return h0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, c0Var, num.intValue(), num2.intValue());
    }

    @Nullable
    public Object T(@Nullable final Object obj, @Nullable final Object obj2, @Nullable final Object obj3, @NotNull androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(this.f36138a);
        D0(c0VarR);
        int iD = c0VarR.D(this) ? w.d(3) : w.g(3);
        Object obj4 = this.f36140c;
        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((pj.p) r1.q(obj4, 5)).invoke(obj, obj2, obj3, c0VarR, Integer.valueOf(iD | i10));
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.runtime.internal.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return v.v0(this.f36071a, obj, obj2, obj3, i10, (androidx.compose.runtime.c0) obj5, ((Integer) obj6).intValue());
                }
            });
        }
        return objInvoke;
    }

    @Override // pj.t
    public /* bridge */ /* synthetic */ Object U(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, androidx.compose.runtime.c0 c0Var, Integer num) {
        return Z(obj, obj2, obj3, obj4, obj5, obj6, obj7, c0Var, num.intValue());
    }

    @Override // pj.a
    public /* bridge */ /* synthetic */ Object V(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, androidx.compose.runtime.c0 c0Var, Integer num) {
        return a0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, c0Var, num.intValue());
    }

    @Nullable
    public Object W(@Nullable final Object obj, @Nullable final Object obj2, @Nullable final Object obj3, @Nullable final Object obj4, @NotNull androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(this.f36138a);
        D0(c0VarR);
        int iD = c0VarR.D(this) ? w.d(4) : w.g(4);
        Object obj5 = this.f36140c;
        Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objH = ((pj.q) r1.q(obj5, 6)).H(obj, obj2, obj3, obj4, c0VarR, Integer.valueOf(iD | i10));
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.runtime.internal.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    return v.w0(this.f35970a, obj, obj2, obj3, obj4, i10, (androidx.compose.runtime.c0) obj6, ((Integer) obj7).intValue());
                }
            });
        }
        return objH;
    }

    @Nullable
    public Object X(@Nullable final Object obj, @Nullable final Object obj2, @Nullable final Object obj3, @Nullable final Object obj4, @Nullable final Object obj5, @NotNull androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(this.f36138a);
        D0(c0VarR);
        int iD = c0VarR.D(this) ? w.d(5) : w.g(5);
        Object obj6 = this.f36140c;
        Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objN = ((pj.r) r1.q(obj6, 7)).N(obj, obj2, obj3, obj4, obj5, c0VarR, Integer.valueOf(i10 | iD));
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.runtime.internal.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj7, Object obj8) {
                    return v.x0(this.f36126a, obj, obj2, obj3, obj4, obj5, i10, (androidx.compose.runtime.c0) obj7, ((Integer) obj8).intValue());
                }
            });
        }
        return objN;
    }

    @Nullable
    public Object Y(@Nullable final Object obj, @Nullable final Object obj2, @Nullable final Object obj3, @Nullable final Object obj4, @Nullable final Object obj5, @Nullable final Object obj6, @NotNull androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(this.f36138a);
        D0(c0VarR);
        int iD = c0VarR.D(this) ? w.d(6) : w.g(6);
        Object obj7 = this.f36140c;
        Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objD = ((pj.s) r1.q(obj7, 8)).D(obj, obj2, obj3, obj4, obj5, obj6, c0VarR, Integer.valueOf(i10 | iD));
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.runtime.internal.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj8, Object obj9) {
                    return v.y0(this.f36006a, obj, obj2, obj3, obj4, obj5, obj6, i10, (androidx.compose.runtime.c0) obj8, ((Integer) obj9).intValue());
                }
            });
        }
        return objD;
    }

    @Nullable
    public Object Z(@Nullable final Object obj, @Nullable final Object obj2, @Nullable final Object obj3, @Nullable final Object obj4, @Nullable final Object obj5, @Nullable final Object obj6, @Nullable final Object obj7, @NotNull androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(this.f36138a);
        D0(c0VarR);
        int iD = c0VarR.D(this) ? w.d(7) : w.g(7);
        Object obj8 = this.f36140c;
        Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Function9<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objU = ((pj.t) r1.q(obj8, 9)).U(obj, obj2, obj3, obj4, obj5, obj6, obj7, c0VarR, Integer.valueOf(i10 | iD));
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.runtime.internal.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj9, Object obj10) {
                    return v.z0(this.f35976a, obj, obj2, obj3, obj4, obj5, obj6, obj7, i10, (androidx.compose.runtime.c0) obj9, ((Integer) obj10).intValue());
                }
            });
        }
        return objU;
    }

    @Nullable
    public Object a0(@Nullable final Object obj, @Nullable final Object obj2, @Nullable final Object obj3, @Nullable final Object obj4, @Nullable final Object obj5, @Nullable final Object obj6, @Nullable final Object obj7, @Nullable final Object obj8, @NotNull androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(this.f36138a);
        D0(c0VarR);
        int iD = c0VarR.D(this) ? w.d(8) : w.g(8);
        Object obj9 = this.f36140c;
        Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Function10<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objV = ((pj.a) r1.q(obj9, 10)).V(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, c0VarR, Integer.valueOf(i10 | iD));
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.runtime.internal.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj10, Object obj11) {
                    return v.A0(this.f36029a, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, i10, (androidx.compose.runtime.c0) obj10, ((Integer) obj11).intValue());
                }
            });
        }
        return objV;
    }

    @Nullable
    public Object b0(@Nullable final Object obj, @Nullable final Object obj2, @Nullable final Object obj3, @Nullable final Object obj4, @Nullable final Object obj5, @Nullable final Object obj6, @Nullable final Object obj7, @Nullable final Object obj8, @Nullable final Object obj9, @NotNull androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(this.f36138a);
        D0(c0VarR);
        int iD = c0VarR.D(this) ? w.d(9) : w.g(9);
        Object obj10 = this.f36140c;
        Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Function11<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objG = ((pj.b) r1.q(obj10, 11)).g(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, c0VarR, Integer.valueOf(i10 | iD));
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.runtime.internal.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj11, Object obj12) {
                    return v.B0(this.f35928a, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, i10, (androidx.compose.runtime.c0) obj11, ((Integer) obj12).intValue());
                }
            });
        }
        return objG;
    }

    @Nullable
    public Object c0(@Nullable final Object obj, @Nullable final Object obj2, @Nullable final Object obj3, @Nullable final Object obj4, @Nullable final Object obj5, @Nullable final Object obj6, @Nullable final Object obj7, @Nullable final Object obj8, @Nullable final Object obj9, @Nullable final Object obj10, @NotNull androidx.compose.runtime.c0 c0Var, final int i10, int i11) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(this.f36138a);
        D0(c0VarR);
        int iD = c0VarR.D(this) ? w.d(10) : w.g(10);
        Object obj11 = this.f36140c;
        Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.Function13<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object objL = ((pj.d) r1.q(obj11, 13)).l(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, c0VarR, Integer.valueOf(i10), Integer.valueOf(i11 | iD));
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.runtime.internal.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj12, Object obj13) {
                    return v.C0(this.f35939a, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, i10, (androidx.compose.runtime.c0) obj12, ((Integer) obj13).intValue());
                }
            });
        }
        return objL;
    }

    @Nullable
    public Object d0(@Nullable final Object obj, @Nullable final Object obj2, @Nullable final Object obj3, @Nullable final Object obj4, @Nullable final Object obj5, @Nullable final Object obj6, @Nullable final Object obj7, @Nullable final Object obj8, @Nullable final Object obj9, @Nullable final Object obj10, @Nullable final Object obj11, @NotNull androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(this.f36138a);
        D0(c0VarR);
        int iD = c0VarR.D(this) ? w.d(11) : w.g(11);
        Object obj12 = this.f36140c;
        Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Function14<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object objI = ((pj.e) r1.q(obj12, 14)).I(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, c0VarR, Integer.valueOf(i10), Integer.valueOf(i11 | iD));
        s5 s5VarT = c0VarR.T();
        if (s5VarT == null) {
            return objI;
        }
        s5VarT.a(new Function2() { // from class: androidx.compose.runtime.internal.s
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj13, Object obj14) {
                return v.n0(this.f36096a, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, i10, i11, (androidx.compose.runtime.c0) obj13, ((Integer) obj14).intValue());
            }
        });
        return objI;
    }

    @Nullable
    public Object e0(@Nullable final Object obj, @Nullable final Object obj2, @Nullable final Object obj3, @Nullable final Object obj4, @Nullable final Object obj5, @Nullable final Object obj6, @Nullable final Object obj7, @Nullable final Object obj8, @Nullable final Object obj9, @Nullable final Object obj10, @Nullable final Object obj11, @Nullable final Object obj12, @NotNull androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(this.f36138a);
        D0(c0VarR);
        int iD = c0VarR.D(this) ? w.d(12) : w.g(12);
        Object obj13 = this.f36140c;
        Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.Function15<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object objO = ((pj.f) r1.q(obj13, 15)).O(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, c0VarR, Integer.valueOf(i10), Integer.valueOf(i11 | iD));
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.runtime.internal.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj14, Object obj15) {
                    return v.o0(this.f36014a, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, i10, i11, (androidx.compose.runtime.c0) obj14, ((Integer) obj15).intValue());
                }
            });
        }
        return objO;
    }

    @Nullable
    public Object f0(@Nullable final Object obj, @Nullable final Object obj2, @Nullable final Object obj3, @Nullable final Object obj4, @Nullable final Object obj5, @Nullable final Object obj6, @Nullable final Object obj7, @Nullable final Object obj8, @Nullable final Object obj9, @Nullable final Object obj10, @Nullable final Object obj11, @Nullable final Object obj12, @Nullable final Object obj13, @NotNull androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(this.f36138a);
        D0(c0VarR);
        int iD = c0VarR.D(this) ? w.d(13) : w.g(13);
        Object obj14 = this.f36140c;
        Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Function16<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"p13\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object objR = ((pj.g) r1.q(obj14, 16)).r(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, c0VarR, Integer.valueOf(i10), Integer.valueOf(i11 | iD));
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.runtime.internal.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj15, Object obj16) {
                    return v.p0(this.f35893a, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, i10, i11, (androidx.compose.runtime.c0) obj15, ((Integer) obj16).intValue());
                }
            });
        }
        return objR;
    }

    @Override // pj.b
    public /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, androidx.compose.runtime.c0 c0Var, Integer num) {
        return b0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, c0Var, num.intValue());
    }

    @Nullable
    public Object g0(@Nullable final Object obj, @Nullable final Object obj2, @Nullable final Object obj3, @Nullable final Object obj4, @Nullable final Object obj5, @Nullable final Object obj6, @Nullable final Object obj7, @Nullable final Object obj8, @Nullable final Object obj9, @Nullable final Object obj10, @Nullable final Object obj11, @Nullable final Object obj12, @Nullable final Object obj13, @Nullable final Object obj14, @NotNull androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(this.f36138a);
        D0(c0VarR);
        int iD = c0VarR.D(this) ? w.d(14) : w.g(14);
        Object obj15 = this.f36140c;
        Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.Function17<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"p13\")] kotlin.Any?, @[ParameterName(name = \"p14\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object objL = ((pj.h) r1.q(obj15, 17)).L(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, c0VarR, Integer.valueOf(i10), Integer.valueOf(i11 | iD));
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.runtime.internal.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj16, Object obj17) {
                    return v.q0(this.f35910a, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, i10, i11, (androidx.compose.runtime.c0) obj16, ((Integer) obj17).intValue());
                }
            });
        }
        return objL;
    }

    @Nullable
    public Object h0(@Nullable final Object obj, @Nullable final Object obj2, @Nullable final Object obj3, @Nullable final Object obj4, @Nullable final Object obj5, @Nullable final Object obj6, @Nullable final Object obj7, @Nullable final Object obj8, @Nullable final Object obj9, @Nullable final Object obj10, @Nullable final Object obj11, @Nullable final Object obj12, @Nullable final Object obj13, @Nullable final Object obj14, @Nullable final Object obj15, @NotNull androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(this.f36138a);
        D0(c0VarR);
        int iD = c0VarR.D(this) ? w.d(15) : w.g(15);
        Object obj16 = this.f36140c;
        Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Function18<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"p13\")] kotlin.Any?, @[ParameterName(name = \"p14\")] kotlin.Any?, @[ParameterName(name = \"p15\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object objR = ((pj.i) r1.q(obj16, 18)).R(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, c0VarR, Integer.valueOf(i10), Integer.valueOf(i11 | iD));
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.runtime.internal.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj17, Object obj18) {
                    return v.r0(this.f36041a, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, i10, i11, (androidx.compose.runtime.c0) obj17, ((Integer) obj18).intValue());
                }
            });
        }
        return objR;
    }

    @Nullable
    public Object i0(@Nullable final Object obj, @Nullable final Object obj2, @Nullable final Object obj3, @Nullable final Object obj4, @Nullable final Object obj5, @Nullable final Object obj6, @Nullable final Object obj7, @Nullable final Object obj8, @Nullable final Object obj9, @Nullable final Object obj10, @Nullable final Object obj11, @Nullable final Object obj12, @Nullable final Object obj13, @Nullable final Object obj14, @Nullable final Object obj15, @Nullable final Object obj16, @NotNull androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(this.f36138a);
        D0(c0VarR);
        int iD = c0VarR.D(this) ? w.d(16) : w.g(16);
        Object obj17 = this.f36140c;
        Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type kotlin.Function19<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"p13\")] kotlin.Any?, @[ParameterName(name = \"p14\")] kotlin.Any?, @[ParameterName(name = \"p15\")] kotlin.Any?, @[ParameterName(name = \"p16\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object objQ = ((pj.j) r1.q(obj17, 19)).q(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, c0VarR, Integer.valueOf(i10), Integer.valueOf(i11 | iD));
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.runtime.internal.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj18, Object obj19) {
                    return v.s0(this.f35951a, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, i10, i11, (androidx.compose.runtime.c0) obj18, ((Integer) obj19).intValue());
                }
            });
        }
        return objQ;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
        return M(c0Var, num.intValue());
    }

    @Override // pj.k
    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, androidx.compose.runtime.c0 c0Var, Integer num, Integer num2) {
        return j0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, c0Var, num.intValue(), num2.intValue());
    }

    @Nullable
    public Object j0(@Nullable final Object obj, @Nullable final Object obj2, @Nullable final Object obj3, @Nullable final Object obj4, @Nullable final Object obj5, @Nullable final Object obj6, @Nullable final Object obj7, @Nullable final Object obj8, @Nullable final Object obj9, @Nullable final Object obj10, @Nullable final Object obj11, @Nullable final Object obj12, @Nullable final Object obj13, @Nullable final Object obj14, @Nullable final Object obj15, @Nullable final Object obj16, @Nullable final Object obj17, @NotNull androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(this.f36138a);
        D0(c0VarR);
        int iD = c0VarR.D(this) ? w.d(17) : w.g(17);
        Object obj18 = this.f36140c;
        Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Function20<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"p13\")] kotlin.Any?, @[ParameterName(name = \"p14\")] kotlin.Any?, @[ParameterName(name = \"p15\")] kotlin.Any?, @[ParameterName(name = \"p16\")] kotlin.Any?, @[ParameterName(name = \"p17\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object objJ = ((pj.k) r1.q(obj18, 20)).j(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, c0VarR, Integer.valueOf(i10), Integer.valueOf(i11 | iD));
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.runtime.internal.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj19, Object obj20) {
                    return v.t0(this.f35987a, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, i10, i11, (androidx.compose.runtime.c0) obj19, ((Integer) obj20).intValue());
                }
            });
        }
        return objJ;
    }

    @Nullable
    public Object k0(@Nullable final Object obj, @Nullable final Object obj2, @Nullable final Object obj3, @Nullable final Object obj4, @Nullable final Object obj5, @Nullable final Object obj6, @Nullable final Object obj7, @Nullable final Object obj8, @Nullable final Object obj9, @Nullable final Object obj10, @Nullable final Object obj11, @Nullable final Object obj12, @Nullable final Object obj13, @Nullable final Object obj14, @Nullable final Object obj15, @Nullable final Object obj16, @Nullable final Object obj17, @Nullable final Object obj18, @NotNull androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(this.f36138a);
        D0(c0VarR);
        int iD = c0VarR.D(this) ? w.d(18) : w.g(18);
        Object obj19 = this.f36140c;
        Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.Function21<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"p13\")] kotlin.Any?, @[ParameterName(name = \"p14\")] kotlin.Any?, @[ParameterName(name = \"p15\")] kotlin.Any?, @[ParameterName(name = \"p16\")] kotlin.Any?, @[ParameterName(name = \"p17\")] kotlin.Any?, @[ParameterName(name = \"p18\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object objT = ((pj.l) r1.q(obj19, 21)).t(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, c0VarR, Integer.valueOf(i10), Integer.valueOf(i11 | iD));
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.runtime.internal.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj20, Object obj21) {
                    return v.u0(this.f36076a, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, i10, i11, (androidx.compose.runtime.c0) obj20, ((Integer) obj21).intValue());
                }
            });
        }
        return objT;
    }

    @Override // pj.d
    public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, androidx.compose.runtime.c0 c0Var, Integer num, Integer num2) {
        return c0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, c0Var, num.intValue(), num2.intValue());
    }

    @Override // pj.j
    public /* bridge */ /* synthetic */ Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, androidx.compose.runtime.c0 c0Var, Integer num, Integer num2) {
        return i0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, c0Var, num.intValue(), num2.intValue());
    }

    @Override // pj.g
    public /* bridge */ /* synthetic */ Object r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, androidx.compose.runtime.c0 c0Var, Integer num, Integer num2) {
        return f0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, c0Var, num.intValue(), num2.intValue());
    }

    @Override // pj.l
    public /* bridge */ /* synthetic */ Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, androidx.compose.runtime.c0 c0Var, Integer num, Integer num2) {
        return k0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, c0Var, num.intValue(), num2.intValue());
    }

    @Override // pj.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, androidx.compose.runtime.c0 c0Var, Integer num) {
        return P(obj, c0Var, num.intValue());
    }

    @Override // pj.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, androidx.compose.runtime.c0 c0Var, Integer num) {
        return Q(obj, obj2, c0Var, num.intValue());
    }

    @Override // pj.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, androidx.compose.runtime.c0 c0Var, Integer num) {
        return T(obj, obj2, obj3, c0Var, num.intValue());
    }
}
