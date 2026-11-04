package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,590:1\n1#2:591\n*E\n"})
public final class hb {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f23030d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f23031e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.o<Float> f23032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f23033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final u<ib> f23034c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ib d(androidx.compose.runtime.saveable.g0 g0Var, hb hbVar) {
            return hbVar.l();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hb e(androidx.compose.ui.unit.d dVar, Function1 function1, androidx.compose.animation.core.o oVar, boolean z10, ib ibVar) {
            return new hb(ibVar, dVar, function1, oVar, z10);
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<hb, ?> c(@NotNull final androidx.compose.animation.core.o<Float> oVar, @NotNull final Function1<? super ib, Boolean> function1, final boolean z10, @NotNull final androidx.compose.ui.unit.d dVar) {
            return androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.material.fb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return hb.a.d((androidx.compose.runtime.saveable.g0) obj, (hb) obj2);
                }
            }, new Function1() { // from class: androidx.compose.material.gb
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return hb.a.e(dVar, function1, oVar, z10, (ib) obj);
                }
            });
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23035a;

        static {
            int[] iArr = new int[ib.values().length];
            try {
                int i10 = 6 ^ 1;
                iArr[ib.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f23035a = iArr;
        }
    }

    public hb(@NotNull ib ibVar, @NotNull final androidx.compose.ui.unit.d dVar, @NotNull Function1<? super ib, Boolean> function1, @NotNull androidx.compose.animation.core.o<Float> oVar, boolean z10) {
        this.f23032a = oVar;
        this.f23033b = z10;
        this.f23034c = new u<>(ibVar, new Function1() { // from class: androidx.compose.material.cb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(hb.e(dVar, ((Float) obj).floatValue()));
            }
        }, new Function0() { // from class: androidx.compose.material.db
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(hb.f(dVar));
            }
        }, oVar, function1);
        if (z10 && ibVar == ib.HalfExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(ib ibVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(androidx.compose.ui.unit.d dVar, float f10) {
        return dVar.S7(ab.f21995a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(androidx.compose.ui.unit.d dVar) {
        return dVar.S7(ab.f21996b);
    }

    public static /* synthetic */ Object h(hb hbVar, ib ibVar, float f10, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = hbVar.f23034c.B();
        }
        return hbVar.g(ibVar, f10, dVar);
    }

    @u7
    @kotlin.l(message = "Please use the progress function to query progress explicitly between targets.", replaceWith = @kotlin.b1(expression = "progress(from = , to = )", imports = {}))
    public static /* synthetic */ void o() {
    }

    @Nullable
    public final Object g(@NotNull ib ibVar, float f10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objF = k.f(this.f23034c, ibVar, f10, dVar);
        return objF == kotlin.coroutines.intrinsics.b.l() ? objF : Unit.f312394a;
    }

    @Nullable
    public final Object i(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH;
        w5<ib> w5VarU = this.f23034c.u();
        ib ibVar = ib.Expanded;
        if (w5VarU.d(ibVar) && (objH = h(this, ibVar, 0.0f, dVar, 2, null)) == kotlin.coroutines.intrinsics.b.l()) {
            return objH;
        }
        return Unit.f312394a;
    }

    @NotNull
    public final u<ib> j() {
        return this.f23034c;
    }

    @NotNull
    public final androidx.compose.animation.core.o<Float> k() {
        return this.f23032a;
    }

    @NotNull
    public final ib l() {
        return this.f23034c.y();
    }

    public final boolean m() {
        return this.f23034c.u().d(ib.HalfExpanded);
    }

    @androidx.annotation.x(from = 0.0d, to = 1.0d)
    public final float n() {
        return this.f23034c.E();
    }

    @NotNull
    public final ib p() {
        return this.f23034c.F();
    }

    @Nullable
    public final Object q(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH;
        return (m() && (objH = h(this, ib.HalfExpanded, 0.0f, dVar, 2, null)) == kotlin.coroutines.intrinsics.b.l()) ? objH : Unit.f312394a;
    }

    @Nullable
    public final Object r(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = h(this, ib.Hidden, 0.0f, dVar, 2, null);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    public final boolean s() {
        return this.f23033b;
    }

    public final boolean t() {
        return this.f23034c.y() != ib.Hidden;
    }

    @androidx.annotation.x(from = 0.0d, to = 1.0d)
    public final float u(@NotNull ib ibVar, @NotNull ib ibVar2) {
        float fC = this.f23034c.u().c(ibVar);
        float fC2 = this.f23034c.u().c(ibVar2);
        float fH = (kotlin.ranges.r.H(this.f23034c.C(), Math.min(fC, fC2), Math.max(fC, fC2)) - fC) / (fC2 - fC);
        if (Float.isNaN(fH)) {
            return 1.0f;
        }
        return Math.abs(fH);
    }

    public final float v() {
        return this.f23034c.K();
    }

    @Nullable
    public final Object w(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        w5<ib> w5VarU = this.f23034c.u();
        ib ibVar = ib.Expanded;
        boolean zD = w5VarU.d(ibVar);
        if (b.f23035a[l().ordinal()] == 1) {
            if (m()) {
                ibVar = ib.HalfExpanded;
            }
        } else if (!zD) {
            ibVar = ib.Hidden;
        }
        Object objH = h(this, ibVar, 0.0f, dVar, 2, null);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Nullable
    public final Object x(@NotNull ib ibVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objK = k.k(this.f23034c, ibVar, dVar);
        return objK == kotlin.coroutines.intrinsics.b.l() ? objK : Unit.f312394a;
    }

    public /* synthetic */ hb(ib ibVar, androidx.compose.ui.unit.d dVar, Function1 function1, androidx.compose.animation.core.o oVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(ibVar, dVar, (i10 & 4) != 0 ? new Function1() { // from class: androidx.compose.material.eb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(hb.d((ib) obj));
            }
        } : function1, (i10 & 8) != 0 ? la.f23669a.a() : oVar, (i10 & 16) != 0 ? false : z10);
    }
}
