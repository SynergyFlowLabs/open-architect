package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@u7
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class r5 extends xh<s5> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final a f24624s = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f24625t = 0;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s5 d(androidx.compose.runtime.saveable.g0 g0Var, r5 r5Var) {
            return r5Var.t();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r5 e(Function1 function1, s5 s5Var) {
            return new r5(s5Var, function1);
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<r5, s5> c(@NotNull final Function1<? super s5, Boolean> function1) {
            return androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.material.p5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r5.a.d((androidx.compose.runtime.saveable.g0) obj, (r5) obj2);
                }
            }, new Function1() { // from class: androidx.compose.material.q5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return r5.a.e(function1, (s5) obj);
                }
            });
        }

        private a() {
        }
    }

    public /* synthetic */ r5(s5 s5Var, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(s5Var, (i10 & 2) != 0 ? new Function1() { // from class: androidx.compose.material.o5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(r5.Z((s5) obj));
            }
        } : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Z(s5 s5Var) {
        return true;
    }

    @Nullable
    public final Object a0(@NotNull n5 n5Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objN = xh.n(this, n5Var == n5.StartToEnd ? s5.DismissedToEnd : s5.DismissedToStart, null, dVar, 2, null);
        return objN == kotlin.coroutines.intrinsics.b.l() ? objN : Unit.f312394a;
    }

    @Nullable
    public final n5 b0() {
        if (z().getValue().floatValue() == 0.0f) {
            return null;
        }
        return z().getValue().floatValue() > 0.0f ? n5.StartToEnd : n5.EndToStart;
    }

    public final boolean c0(@NotNull n5 n5Var) {
        return t() == (n5Var == n5.StartToEnd ? s5.DismissedToEnd : s5.DismissedToStart);
    }

    @Nullable
    public final Object d0(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objN = xh.n(this, s5.Default, null, dVar, 2, null);
        return objN == kotlin.coroutines.intrinsics.b.l() ? objN : Unit.f312394a;
    }

    public r5(@NotNull s5 s5Var, @NotNull Function1<? super s5, Boolean> function1) {
        super(s5Var, null, function1, 2, null);
    }
}
