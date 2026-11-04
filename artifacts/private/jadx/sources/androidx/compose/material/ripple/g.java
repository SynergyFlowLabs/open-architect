package androidx.compose.material.ripple;

import androidx.collection.k2;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.x0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nCommonRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleNode\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,173:1\n357#2,4:174\n329#2,6:178\n339#2,3:185\n342#2,9:189\n361#2:198\n357#2,4:199\n329#2,6:203\n339#2,3:210\n342#2,2:214\n345#2,6:217\n361#2:223\n1399#3:184\n1270#3:188\n1399#3:209\n1270#3:213\n1#4:216\n*S KotlinDebug\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleNode\n*L\n75#1:174,4\n75#1:178,6\n75#1:185,3\n75#1:189,9\n75#1:198\n98#1:199,4\n98#1:203,6\n98#1:210,3\n98#1:214,2\n98#1:217,6\n98#1:223\n75#1:184\n75#1:188\n98#1:209\n98#1:213\n*E\n"})
public final class g extends RippleNode {

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final int f24758h3 = 8;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private final k2<androidx.compose.foundation.interaction.l.b, m> f24759g3;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.CommonRippleNode$addRipple$2", f = "CommonRipple.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160705l0}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f24761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f24762c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.l.b f24763d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m mVar, g gVar, androidx.compose.foundation.interaction.l.b bVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f24761b = mVar;
            this.f24762c = gVar;
            this.f24763d = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f24761b, this.f24762c, this.f24763d, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Unit] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f24760a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    m mVar = this.f24761b;
                    this.f24760a = 1;
                    if (mVar.f(this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                this.f24762c.f24759g3.l0(this.f24763d);
                androidx.compose.ui.node.u.a(this.f24762c);
                this = Unit.f312394a;
                return this;
            } catch (Throwable th2) {
                this.f24762c.f24759g3.l0(this.f24763d);
                androidx.compose.ui.node.u.a(this.f24762c);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ g(androidx.compose.foundation.interaction.h hVar, boolean z10, float f10, x0 x0Var, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, z10, f10, x0Var, function0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x004e A[LOOP:0: B:5:0x0013->B:15:0x004e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0051 A[EDGE_INSN: B:23:0x0051->B:16:0x0051 BREAK  A[LOOP:0: B:5:0x0013->B:15:0x004e], SYNTHETIC] */
    @Override // androidx.compose.material.ripple.RippleNode
    public void A9(@NotNull androidx.compose.foundation.interaction.l.b bVar, long j10, float f10) {
        k2<androidx.compose.foundation.interaction.l.b, m> k2Var = this.f24759g3;
        Object[] objArr = k2Var.f12131b;
        Object[] objArr2 = k2Var.f12132c;
        long[] jArr = k2Var.f12130a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j11 = jArr[i10];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j11) < 128) {
                            int i13 = (i10 << 3) + i12;
                            ((m) objArr2[i13]).j();
                        }
                        j11 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        m mVar = new m(C9() ? n0.g.d(bVar.a()) : null, f10, C9(), null);
        this.f24759g3.q0(bVar, mVar);
        kotlinx.coroutines.k.f(Q8(), null, null, new a(mVar, this, bVar, null), 3, null);
        androidx.compose.ui.node.u.a(this);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void B9(@NotNull androidx.compose.ui.graphics.drawscope.f fVar) {
        float f10;
        int i10;
        int i11;
        float fD = D9().invoke().d();
        if (fD == 0.0f) {
            return;
        }
        k2<androidx.compose.foundation.interaction.l.b, m> k2Var = this.f24759g3;
        Object[] objArr = k2Var.f12131b;
        Object[] objArr2 = k2Var.f12132c;
        long[] jArr = k2Var.f12130a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j10 = jArr[i12];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i12 - length)) >>> 31);
                long j11 = j10;
                int i15 = 0;
                while (i15 < i14) {
                    if ((j11 & 255) < 128) {
                        int i16 = (i12 << 3) + i15;
                        i10 = i15;
                        i11 = i14;
                        ((m) objArr2[i16]).g(fVar, q0.w(E9(), fD, 0.0f, 0.0f, 0.0f, 14, null));
                    } else {
                        i10 = i15;
                        i11 = i14;
                    }
                    j11 >>= i13;
                    i15 = i10 + 1;
                    fD = fD;
                    i14 = i11;
                    i13 = i13;
                }
                int i17 = i14;
                f10 = fD;
                if (i17 != i13) {
                    return;
                }
            } else {
                f10 = fD;
            }
            if (i12 == length) {
                return;
            }
            i12++;
            fD = f10;
        }
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void I9(@NotNull androidx.compose.foundation.interaction.l.b bVar) {
        m mVarP = this.f24759g3.p(bVar);
        if (mVarP != null) {
            mVarP.j();
        }
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        this.f24759g3.K();
    }

    private g(androidx.compose.foundation.interaction.h hVar, boolean z10, float f10, x0 x0Var, Function0<l> function0) {
        super(hVar, z10, f10, x0Var, function0, null);
        this.f24759g3 = new k2<>(0, 1, null);
    }
}
