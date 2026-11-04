package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 7 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1799:1\n1#2:1800\n57#3:1801\n61#3:1806\n60#4:1802\n85#4:1805\n70#4:1807\n90#4:1810\n53#4,3:1812\n22#5:1803\n22#5:1808\n54#6:1804\n59#6:1809\n33#7:1811\n88#8:1815\n35#8,5:1816\n89#8:1821\n103#8:1822\n35#8,5:1823\n104#8:1828\n103#8:1829\n35#8,5:1830\n104#8:1835\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableNode\n*L\n975#1:1801\n976#1:1806\n975#1:1802\n975#1:1805\n976#1:1807\n976#1:1810\n977#1:1812,3\n975#1:1803\n976#1:1808\n975#1:1804\n976#1:1809\n977#1:1811\n1003#1:1815\n1003#1:1816,5\n1003#1:1821\n1015#1:1822\n1015#1:1823,5\n1015#1:1828\n1027#1:1829\n1027#1:1830,5\n1027#1:1835\n*E\n"})
public class k1 extends c {

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public static final int f15747w3 = 8;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private final boolean f15748u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.input.pointer.c0 f15749v3;

    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: androidx.compose.foundation.k1$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.ClickableNode$createPointerInputNodeIfNeeded$1$1", f = "Clickable.kt", i = {}, l = {959}, m = "invokeSuspend", n = {}, s = {})
        static final class C0096a extends kotlin.coroutines.jvm.internal.o implements pj.n<androidx.compose.foundation.gestures.r3, n0.g, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f15751a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f15752b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ long f15753c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ k1 f15754d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0096a(k1 k1Var, kotlin.coroutines.d<? super C0096a> dVar) {
                super(3, dVar);
                this.f15754d = k1Var;
            }

            @Override // pj.n
            public /* bridge */ /* synthetic */ Object invoke(androidx.compose.foundation.gestures.r3 r3Var, n0.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                return k(r3Var, gVar.B(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f15751a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.foundation.gestures.r3 r3Var = (androidx.compose.foundation.gestures.r3) this.f15752b;
                    long j10 = this.f15753c;
                    if (this.f15754d.X9()) {
                        k1 k1Var = this.f15754d;
                        this.f15751a = 1;
                        if (k1Var.Z9(r3Var, j10, this) == objL) {
                            return objL;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            public final Object k(androidx.compose.foundation.gestures.r3 r3Var, long j10, kotlin.coroutines.d<? super Unit> dVar) {
                C0096a c0096a = new C0096a(this.f15754d, dVar);
                c0096a.f15752b = r3Var;
                c0096a.f15753c = j10;
                return c0096a.invokeSuspend(Unit.f312394a);
            }
        }

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(k1 k1Var, n0.g gVar) {
            if (k1Var.X9()) {
                k1Var.Y9().invoke();
            }
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            C0096a c0096a = new C0096a(k1.this, null);
            final k1 k1Var = k1.this;
            Object objM = androidx.compose.foundation.gestures.c5.m(l0Var, c0096a, new Function1() { // from class: androidx.compose.foundation.j1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1.a.b(k1Var, (n0.g) obj);
                }
            }, dVar);
            return objM == kotlin.coroutines.intrinsics.b.l() ? objM : Unit.f312394a;
        }
    }

    public /* synthetic */ k1(androidx.compose.foundation.interaction.j jVar, z2 z2Var, boolean z10, boolean z11, String str, androidx.compose.ui.semantics.j jVar2, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, z2Var, z10, z11, str, jVar2, function0);
    }

    private final long na(long j10) {
        long jK4 = androidx.compose.ui.node.k.q(this).k4(((androidx.compose.ui.platform.o4) androidx.compose.ui.node.i.a(this, androidx.compose.ui.platform.q1.D())).l());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jK4 >> 32)) - ((int) (j10 >> 32))) / 2.0f;
        return n0.n.f((((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jK4 & com.rabbitmq.client.k0.f265952a)) - ((int) (j10 & com.rabbitmq.client.k0.f265952a))) / 2.0f)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fMax) << 32));
    }

    private static /* synthetic */ void oa() {
    }

    @Override // androidx.compose.foundation.c
    @Nullable
    public androidx.compose.ui.input.pointer.y0 S9() {
        if (this.f15748u3) {
            return androidx.compose.ui.input.pointer.w0.a(new a());
        }
        return null;
    }

    @Override // androidx.compose.foundation.c
    protected final boolean fa(@NotNull KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.c
    protected final boolean ga(@NotNull KeyEvent keyEvent) {
        Y9().invoke();
        return true;
    }

    @Override // androidx.compose.foundation.c, androidx.compose.ui.node.d2
    public void p3() {
        super.p3();
        if (this.f15749v3 != null) {
            this.f15749v3 = null;
            aa();
        }
    }

    @Override // androidx.compose.foundation.c, androidx.compose.ui.node.d2
    public void p5(@NotNull androidx.compose.ui.input.pointer.q qVar, @NotNull androidx.compose.ui.input.pointer.s sVar, long j10) {
        super.p5(qVar, sVar, j10);
        if (!this.f15748u3) {
            int i10 = 0;
            if (sVar == androidx.compose.ui.input.pointer.s.Main) {
                androidx.compose.ui.input.pointer.c0 c0Var = this.f15749v3;
                if (c0Var != null) {
                    List<androidx.compose.ui.input.pointer.c0> listE = qVar.e();
                    int size = listE.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        if (!androidx.compose.ui.input.pointer.r.d(listE.get(i11))) {
                            long jNa = na(j10);
                            List<androidx.compose.ui.input.pointer.c0> listE2 = qVar.e();
                            int size2 = listE2.size();
                            while (i10 < size2) {
                                androidx.compose.ui.input.pointer.c0 c0Var2 = listE2.get(i10);
                                if (c0Var2.F() || androidx.compose.ui.input.pointer.r.j(c0Var2, j10, jNa)) {
                                    this.f15749v3 = null;
                                    aa();
                                    return;
                                }
                                i10++;
                            }
                            return;
                        }
                    }
                    qVar.e().get(0).a();
                    if (X9()) {
                        ba(c0Var.u());
                        Y9().invoke();
                    }
                    this.f15749v3 = null;
                    return;
                }
                int i12 = (3 & 2) | 1;
                if (androidx.compose.foundation.gestures.c5.v(qVar, true, false, 2, null)) {
                    androidx.compose.ui.input.pointer.c0 c0Var3 = qVar.e().get(0);
                    c0Var3.a();
                    this.f15749v3 = c0Var3;
                    if (X9()) {
                        ca(c0Var3.u());
                    }
                }
            } else if (sVar == androidx.compose.ui.input.pointer.s.Final && this.f15749v3 != null) {
                List<androidx.compose.ui.input.pointer.c0> listE3 = qVar.e();
                int size3 = listE3.size();
                while (i10 < size3) {
                    androidx.compose.ui.input.pointer.c0 c0Var4 = listE3.get(i10);
                    if (c0Var4.F() && !Intrinsics.areEqual(c0Var4, this.f15749v3)) {
                        this.f15749v3 = null;
                        aa();
                        return;
                    }
                    i10++;
                }
            }
        }
    }

    public final void pa(@Nullable androidx.compose.foundation.interaction.j jVar, @Nullable z2 z2Var, boolean z10, boolean z11, @Nullable String str, @Nullable androidx.compose.ui.semantics.j jVar2, @NotNull Function0<Unit> function0) {
        ma(jVar, z2Var, z10, z11, str, jVar2, function0);
    }

    private k1(androidx.compose.foundation.interaction.j jVar, z2 z2Var, boolean z10, boolean z11, String str, androidx.compose.ui.semantics.j jVar2, Function0<Unit> function0) {
        super(jVar, z2Var, z10, z11, str, jVar2, function0, null);
        this.f15748u3 = (s1.f18598c && s1.f18607l) ? false : true;
    }
}
