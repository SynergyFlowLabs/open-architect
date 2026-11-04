package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nContentInViewNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 10 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 11 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 12 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,471:1\n51#2,4:472\n51#2,4:488\n318#3,11:476\n1#4:487\n61#5:492\n57#5:495\n61#5:515\n57#5:522\n57#5:533\n61#5:536\n70#6:493\n60#6:496\n60#6:510\n70#6:513\n70#6:516\n53#6,3:519\n60#6:523\n53#6,3:526\n85#6:530\n90#6:532\n60#6:534\n70#6:537\n22#7:494\n22#7:497\n22#7:511\n22#7:514\n22#7:517\n22#7:524\n22#7:535\n22#7:538\n108#8:498\n109#8:507\n448#9,8:499\n150#10:508\n65#10:509\n69#10:512\n30#11:518\n30#11:525\n54#12:529\n59#12:531\n*S KotlinDebug\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode\n*L\n119#1:472,4\n203#1:488,4\n135#1:476,11\n345#1:492\n351#1:495\n410#1:515\n420#1:522\n435#1:533\n436#1:536\n345#1:493\n351#1:496\n395#1:510\n396#1:513\n410#1:516\n403#1:519,3\n420#1:523\n414#1:526,3\n429#1:530\n430#1:532\n435#1:534\n436#1:537\n345#1:494\n351#1:497\n395#1:511\n396#1:514\n410#1:517\n420#1:524\n435#1:535\n436#1:538\n359#1:498\n359#1:507\n359#1:499,8\n385#1:508\n395#1:509\n396#1:512\n403#1:518\n414#1:525\n429#1:529\n430#1:531\n*E\n"})
public final class p0 extends androidx.compose.ui.a0.d implements androidx.compose.foundation.relocation.h, androidx.compose.ui.node.h, androidx.compose.ui.node.f0 {

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final int f14923g3 = 8;
    private final boolean X;

    @Nullable
    private androidx.compose.ui.layout.g0 Z;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f14924p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f14925p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f14926p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private q3 f14927s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final z4 f14928t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f14929v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private m0 f14930w;

    @NotNull
    private final l0 Y = new l0();
    private long H1 = androidx.compose.ui.unit.u.f42720b.a();

    @androidx.compose.runtime.internal.w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nContentInViewNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode$Request\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,471:1\n1#2:472\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f14931c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Function0<n0.j> f14932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.n<Unit> f14933b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function0<n0.j> function0, @NotNull kotlinx.coroutines.n<? super Unit> nVar) {
            this.f14932a = function0;
            this.f14933b = nVar;
        }

        @NotNull
        public final kotlinx.coroutines.n<Unit> a() {
            return this.f14933b;
        }

        @NotNull
        public final Function0<n0.j> b() {
            return this.f14932a;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x005b  */
        @NotNull
        public String toString() {
            String str;
            kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f14933b.getContext().get(kotlinx.coroutines.r0.f315206b);
            String strT = r0Var != null ? r0Var.T() : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Request@");
            String string = Integer.toString(hashCode(), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            sb2.append(string);
            if (strT != null) {
                str = AbstractJsonLexerKt.BEGIN_LIST + strT + "](";
                if (str == null) {
                    str = "(";
                }
            } else {
                str = "(";
            }
            sb2.append(str);
            sb2.append("currentBounds()=");
            sb2.append(this.f14932a.invoke());
            sb2.append(", continuation=");
            sb2.append(this.f14933b);
            sb2.append(')');
            return sb2.toString();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14934a;

        static {
            int[] iArr = new int[q3.values().length];
            try {
                iArr[q3.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q3.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14934a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", i = {}, l = {215}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14936b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ y5 f14938d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ m0 f14939e;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", i = {}, l = {221}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nContentInViewNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode$launchAnimation$2$1\n+ 2 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,471:1\n120#2:472\n121#2,2:474\n124#2,4:477\n519#3:473\n44#3:476\n*S KotlinDebug\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode$launchAnimation$2$1\n*L\n269#1:472\n269#1:474,2\n269#1:477,4\n269#1:473\n269#1:476\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<o3, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f14940a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f14941b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ y5 f14942c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ p0 f14943d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ m0 f14944e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.p2 f14945f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y5 y5Var, p0 p0Var, m0 m0Var, kotlinx.coroutines.p2 p2Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f14942c = y5Var;
                this.f14943d = p0Var;
                this.f14944e = m0Var;
                this.f14945f = p2Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit s(p0 p0Var, y5 y5Var, kotlinx.coroutines.p2 p2Var, o3 o3Var, float f10) {
                float f11 = p0Var.f14929v ? 1.0f : -1.0f;
                z4 z4Var = p0Var.f14928t;
                float fK = f11 * z4Var.K(z4Var.B(o3Var.b(z4Var.B(z4Var.L(f11 * f10)), androidx.compose.ui.input.nestedscroll.f.f38949b.h())));
                if (Math.abs(fK) < Math.abs(f10)) {
                    int i10 = 0 >> 0;
                    kotlinx.coroutines.u2.j(p2Var, "Scroll animation cancelled because scroll was not consumed (" + fK + " < " + f10 + ')', null, 2, null);
                }
                return Unit.f312394a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit v(p0 p0Var, y5 y5Var, m0 m0Var) {
                boolean z10;
                p0 p0Var2;
                boolean zN9;
                l0 l0Var = p0Var.Y;
                while (true) {
                    z10 = true;
                    if (l0Var.f14798a.R() == 0) {
                        p0Var2 = p0Var;
                        break;
                    }
                    n0.j jVarInvoke = ((a) l0Var.f14798a.Y()).b().invoke();
                    if (jVarInvoke == null) {
                        p0Var2 = p0Var;
                        zN9 = true;
                    } else {
                        p0Var2 = p0Var;
                        zN9 = p0.N9(p0Var2, jVarInvoke, 0L, 1, null);
                    }
                    if (!zN9) {
                        break;
                    }
                    kotlinx.coroutines.n<Unit> nVarA = ((a) l0Var.f14798a.r0(l0Var.f14798a.R() - 1)).a();
                    Unit unit = Unit.f312394a;
                    Result.a aVar = Result.Companion;
                    nVarA.resumeWith(Result.m785constructorimpl(unit));
                    p0Var = p0Var2;
                }
                if (p0Var2.f14924p0) {
                    n0.j jVarK9 = p0Var2.K9();
                    if (jVarK9 == null || !p0.N9(p0Var2, jVarK9, 0L, 1, null)) {
                        z10 = false;
                    }
                    if (z10) {
                        p0Var2.f14924p0 = false;
                    }
                }
                y5Var.h(p0Var2.F9(m0Var));
                return Unit.f312394a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f14942c, this.f14943d, this.f14944e, this.f14945f, dVar);
                aVar.f14941b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f14940a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    final o3 o3Var = (o3) this.f14941b;
                    this.f14942c.h(this.f14943d.F9(this.f14944e));
                    final y5 y5Var = this.f14942c;
                    final p0 p0Var = this.f14943d;
                    final kotlinx.coroutines.p2 p2Var = this.f14945f;
                    Function1<? super Float, Unit> function1 = new Function1() { // from class: androidx.compose.foundation.gestures.q0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return p0.c.a.s(p0Var, y5Var, p2Var, o3Var, ((Float) obj2).floatValue());
                        }
                    };
                    final p0 p0Var2 = this.f14943d;
                    final y5 y5Var2 = this.f14942c;
                    final m0 m0Var = this.f14944e;
                    Function0<Unit> function0 = new Function0() { // from class: androidx.compose.foundation.gestures.r0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p0.c.a.v(p0Var2, y5Var2, m0Var);
                        }
                    };
                    this.f14940a = 1;
                    if (y5Var.d(function1, function0, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o3 o3Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(o3Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y5 y5Var, m0 m0Var, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f14938d = y5Var;
            this.f14939e = m0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = p0.this.new c(this.f14938d, this.f14939e, dVar);
            cVar.f14936b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14935a;
            try {
                try {
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        kotlinx.coroutines.p2 p2VarA = kotlinx.coroutines.s2.A(((kotlinx.coroutines.s0) this.f14936b).getCoroutineContext());
                        p0.this.f14926p2 = true;
                        z4 z4Var = p0.this.f14928t;
                        androidx.compose.foundation.q3 q3Var = androidx.compose.foundation.q3.Default;
                        a aVar = new a(this.f14938d, p0.this, this.f14939e, p2VarA, null);
                        this.f14935a = 1;
                        if (z4Var.C(q3Var, aVar, this) == objL) {
                            return objL;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                    p0.this.Y.i();
                    p0.this.f14926p2 = false;
                    p0.this.Y.c(null);
                    p0.this.f14924p0 = false;
                    return Unit.f312394a;
                } catch (CancellationException e10) {
                    throw e10;
                }
            } catch (Throwable th2) {
                p0.this.f14926p2 = false;
                p0.this.Y.c(null);
                p0.this.f14924p0 = false;
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public p0(@NotNull q3 q3Var, @NotNull z4 z4Var, boolean z10, @Nullable m0 m0Var) {
        this.f14927s = q3Var;
        this.f14928t = z4Var;
        this.f14929v = z10;
        this.f14930w = m0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float F9(m0 m0Var) {
        if (androidx.compose.ui.unit.u.h(this.H1, androidx.compose.ui.unit.u.f42720b.a())) {
            return 0.0f;
        }
        n0.j jVarJ9 = J9();
        if (jVarJ9 == null) {
            jVarJ9 = this.f14924p0 ? K9() : null;
            if (jVarJ9 == null) {
                return 0.0f;
            }
        }
        long jH = androidx.compose.ui.unit.v.h(this.H1);
        int i10 = b.f14934a[this.f14927s.ordinal()];
        if (i10 == 1) {
            return m0Var.b(jVarJ9.B(), jVarJ9.j() - jVarJ9.B(), Float.intBitsToFloat((int) (jH & com.rabbitmq.client.k0.f265952a)));
        }
        if (i10 == 2) {
            return m0Var.b(jVarJ9.t(), jVarJ9.x() - jVarJ9.t(), Float.intBitsToFloat((int) (jH >> 32)));
        }
        throw new kotlin.k0();
    }

    private final int G9(long j10, long j11) {
        int i10 = b.f14934a[this.f14927s.ordinal()];
        if (i10 == 1) {
            return Intrinsics.compare((int) (j10 & com.rabbitmq.client.k0.f265952a), (int) (j11 & com.rabbitmq.client.k0.f265952a));
        }
        if (i10 == 2) {
            return Intrinsics.compare((int) (j10 >> 32), (int) (j11 >> 32));
        }
        throw new kotlin.k0();
    }

    private final int H9(long j10, long j11) {
        int i10 = b.f14934a[this.f14927s.ordinal()];
        if (i10 == 1) {
            return Float.compare(Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)), Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a)));
        }
        if (i10 == 2) {
            return Float.compare(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)));
        }
        throw new kotlin.k0();
    }

    private final n0.j I9(n0.j jVar, long j10) {
        return jVar.T(n0.g.g(Q9(jVar, j10) ^ (-9223372034707292160L)));
    }

    private final n0.j J9() {
        androidx.compose.runtime.collection.d dVar = this.Y.f14798a;
        int iR = dVar.R() - 1;
        Object[] objArr = dVar.f35552a;
        n0.j jVar = null;
        if (iR < objArr.length) {
            while (iR >= 0) {
                n0.j jVarInvoke = ((a) objArr[iR]).b().invoke();
                if (jVarInvoke != null) {
                    if (H9(jVarInvoke.z(), androidx.compose.ui.unit.v.h(this.H1)) > 0) {
                        return jVar == null ? jVarInvoke : jVar;
                    }
                    jVar = jVarInvoke;
                }
                iR--;
            }
        }
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n0.j K9() {
        if (!a9()) {
            return null;
        }
        androidx.compose.ui.layout.g0 g0VarS = androidx.compose.ui.node.k.s(this);
        androidx.compose.ui.layout.g0 g0Var = this.Z;
        if (g0Var != null) {
            if (!g0Var.I()) {
                g0Var = null;
            }
            if (g0Var != null) {
                return g0VarS.e0(g0Var, false);
            }
        }
        return null;
    }

    private final boolean M9(n0.j jVar, long j10) {
        long jQ9 = Q9(jVar, j10);
        return Math.abs(Float.intBitsToFloat((int) (jQ9 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jQ9 & com.rabbitmq.client.k0.f265952a))) <= 0.5f;
    }

    static /* synthetic */ boolean N9(p0 p0Var, n0.j jVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = p0Var.H1;
        }
        return p0Var.M9(jVar, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O9() {
        m0 m0VarR9 = R9();
        if (this.f14926p2) {
            androidx.compose.foundation.internal.e.i("launchAnimation called when previous animation was running");
        }
        kotlinx.coroutines.k.f(Q8(), null, kotlinx.coroutines.u0.UNDISPATCHED, new c(new y5(R9().a()), m0VarR9, null), 1, null);
    }

    private final long Q9(n0.j jVar, long j10) {
        long jH = androidx.compose.ui.unit.v.h(j10);
        int i10 = b.f14934a[this.f14927s.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new kotlin.k0();
            }
            return n0.g.g((((long) Float.floatToRawIntBits(R9().b(jVar.t(), jVar.x() - jVar.t(), Float.intBitsToFloat((int) (jH >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
        }
        float fB = R9().b(jVar.B(), jVar.j() - jVar.B(), Float.intBitsToFloat((int) (jH & com.rabbitmq.client.k0.f265952a)));
        return n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fB)) & com.rabbitmq.client.k0.f265952a));
    }

    private final m0 R9() {
        m0 m0Var = this.f14930w;
        return m0Var == null ? (m0) androidx.compose.ui.node.i.a(this, o0.c()) : m0Var;
    }

    public final long L9() {
        return this.H1;
    }

    @Override // androidx.compose.foundation.relocation.h
    @NotNull
    public n0.j O2(@NotNull n0.j jVar) {
        if (androidx.compose.ui.unit.u.h(this.H1, androidx.compose.ui.unit.u.f42720b.a())) {
            androidx.compose.foundation.internal.e.i("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return I9(jVar, this.H1);
    }

    public final void P9(@Nullable androidx.compose.ui.layout.g0 g0Var) {
        n0.j jVarK9;
        this.Z = g0Var;
        if (this.f14925p1 && (jVarK9 = K9()) != null && !M9(jVarK9, this.H1)) {
            this.f14924p0 = true;
            O9();
        }
        this.f14925p1 = false;
    }

    public final void S9(@NotNull q3 q3Var, boolean z10, @Nullable m0 m0Var) {
        this.f14927s = q3Var;
        this.f14929v = z10;
        this.f14930w = m0Var;
    }

    @Override // androidx.compose.foundation.relocation.h
    @Nullable
    public Object T7(@NotNull Function0<n0.j> function0, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        n0.j jVarInvoke = function0.invoke();
        if (jVarInvoke == null || N9(this, jVarInvoke, 0L, 1, null)) {
            return Unit.f312394a;
        }
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        if (this.Y.d(new a(function0, pVar)) && !this.f14926p2) {
            O9();
        }
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return this.X;
    }

    @Override // androidx.compose.ui.node.f0
    public void c0(long j10) {
        n0.j jVarK9;
        long j11 = this.H1;
        this.H1 = j10;
        if (G9(j10, j11) >= 0 || this.f14926p2 || this.f14924p0 || (jVarK9 = K9()) == null || !M9(jVarK9, j11)) {
            return;
        }
        this.f14925p1 = true;
    }
}
