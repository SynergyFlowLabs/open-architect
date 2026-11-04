package androidx.compose.runtime.internal;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.q4;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
@SourceDebugExtension({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,181:1\n37#2,2:182\n37#2,2:184\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n*L\n114#1:182,2\n122#1:184,2\n*E\n"})
public final class z implements x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f36154g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f36156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Object f36158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private q4 f36159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private List<q4> f36160f;

    public z(int i10, boolean z10, int i11) {
        this.f36155a = i10;
        this.f36156b = z10;
        this.f36157c = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Object[] objArr, int i10, z zVar, androidx.compose.runtime.c0 c0Var, int i11) {
        Object[] array = ArraysKt.slice(objArr, kotlin.ranges.r.W1(0, i10)).toArray(new Object[0]);
        Object obj = objArr[i10 + 1];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int iA = t4.a(((Integer) obj).intValue());
        int length = (objArr.length - i10) - 2;
        Object[] objArr2 = new Object[length];
        for (int i12 = 0; i12 < length; i12++) {
            Object obj2 = objArr[i10 + 2 + i12];
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
            objArr2[i12] = Integer.valueOf(t4.a(((Integer) obj2).intValue()));
        }
        p1 p1Var = new p1(4);
        p1Var.b(array);
        p1Var.a(c0Var);
        p1Var.a(Integer.valueOf(iA | 1));
        p1Var.b(objArr2);
        zVar.S(p1Var.d(new Object[p1Var.c()]));
        return Unit.f312394a;
    }

    private final int i(int i10) {
        int i11 = i10 - 2;
        for (int i12 = 1; i12 * 10 < i11; i12++) {
            i11--;
        }
        return i11;
    }

    private final void k(androidx.compose.runtime.c0 c0Var) {
        q4 q4VarF0;
        if (!this.f36156b || (q4VarF0 = c0Var.f0()) == null) {
            return;
        }
        c0Var.z(q4VarF0);
        if (w.f(this.f36159e, q4VarF0)) {
            this.f36159e = q4VarF0;
            return;
        }
        List<q4> list = this.f36160f;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.f36160f = arrayList;
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

    private final void m() {
        if (this.f36156b) {
            q4 q4Var = this.f36159e;
            if (q4Var != null) {
                q4Var.invalidate();
                this.f36159e = null;
            }
            List<q4> list = this.f36160f;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).invalidate();
                }
                list.clear();
            }
        }
    }

    @Override // pj.u
    @Nullable
    public Object S(@NotNull final Object... objArr) {
        final int i10 = i(objArr.length);
        Object obj = objArr[i10];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.Composer");
        Object[] array = ArraysKt.slice(objArr, kotlin.ranges.r.W1(0, objArr.length - 1)).toArray(new Object[0]);
        Object obj2 = objArr[objArr.length - 1];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        androidx.compose.runtime.c0 c0VarR = ((androidx.compose.runtime.c0) obj).R(this.f36155a);
        k(c0VarR);
        int iD = iIntValue | (c0VarR.D(this) ? w.d(i10) : w.g(i10));
        Object obj3 = this.f36158d;
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        p1 p1Var = new p1(2);
        p1Var.b(array);
        p1Var.a(Integer.valueOf(iD));
        Object objS = ((pj.u) obj3).S(p1Var.d(new Object[p1Var.c()]));
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.runtime.internal.y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return z.f(objArr, i10, this, (androidx.compose.runtime.c0) obj4, ((Integer) obj5).intValue());
                }
            });
        }
        return objS;
    }

    public final int d() {
        return this.f36155a;
    }

    @Override // pj.u, kotlin.jvm.internal.d0
    public int getArity() {
        return this.f36157c;
    }

    public final void n(@NotNull Object obj) {
        if (Intrinsics.areEqual(obj, this.f36158d)) {
            return;
        }
        boolean z10 = this.f36158d == null;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        this.f36158d = (pj.u) obj;
        if (z10) {
            return;
        }
        m();
    }
}
