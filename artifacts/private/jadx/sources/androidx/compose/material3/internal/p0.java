package androidx.compose.material3.internal;

import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.w6;
import androidx.media3.exoplayer.a5;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBasicEdgeToEdgeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicEdgeToEdgeDialog.kt\nandroidx/compose/material3/internal/BasicEdgeToEdgeDialogKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,122:1\n1282#2,6:123\n1282#2,6:129\n85#3:135\n*S KotlinDebug\n*F\n+ 1 BasicEdgeToEdgeDialog.kt\nandroidx/compose/material3/internal/BasicEdgeToEdgeDialogKt\n*L\n78#1:123,6\n97#1:129,6\n93#1:135\n*E\n"})
public final class p0 {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1", f = "BasicEdgeToEdgeDialog.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.i<? extends androidx.activity.d>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h3 f29058c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n7<Function0<Unit>> f29059d;

        /* JADX INFO: renamed from: androidx.compose.material3.internal.p0$a$a, reason: collision with other inner class name */
        static final class C0230a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h3 f29060a;

            C0230a(h3 h3Var) {
                this.f29060a = h3Var;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(androidx.activity.d dVar, kotlin.coroutines.d<? super Unit> dVar2) {
                n3 n3Var;
                i3 i3Var = (i3) this.f29060a;
                float fC = dVar.c();
                float fD = dVar.d();
                float fA = dVar.a();
                int iB = dVar.b();
                if (iB != 0) {
                    n3Var = iB != 1 ? n3.None : n3.Right;
                } else {
                    n3Var = n3.Left;
                }
                i3Var.a(new j0.b(fC, fD, fA, n3Var));
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h3 h3Var, n7<? extends Function0<Unit>> n7Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f29058c = h3Var;
            this.f29059d = n7Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f29058c, this.f29059d, dVar);
            aVar.f29057b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f29056a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.flow.i iVar = (kotlinx.coroutines.flow.i) this.f29057b;
                    C0230a c0230a = new C0230a(this.f29058c);
                    this.f29056a = 1;
                    if (iVar.collect(c0230a, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                ((i3) this.f29058c).a(j0.a.f28960a);
                p0.c(this.f29059d).invoke();
                return Unit.f312394a;
            } catch (CancellationException e10) {
                ((i3) this.f29058c).a(j0.c.f28967a);
                throw e10;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.flow.i<androidx.activity.d> iVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(iVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @androidx.compose.runtime.o
    public static final void b(@NotNull final h3 h3Var, boolean z10, @NotNull final Function0<Unit> function0, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(698755635);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c0VarR.D(h3Var) : c0VarR.k0(h3Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.G(z10) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i12 |= c0VarR.k0(function0) ? 256 : 128;
        }
        boolean z11 = true;
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            if (i13 != 0) {
                z10 = true;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(698755635, i12, -1, "androidx.compose.material3.internal.PredictiveBackStateHandler (BasicEdgeToEdgeDialog.kt:90)");
            }
            n7 n7VarW = w6.w(function0, c0VarR, (i12 >> 6) & 14);
            c0VarR.m0(1489276985, h3Var);
            Intrinsics.checkNotNull(h3Var, "null cannot be cast to non-null type androidx.compose.material3.internal.PredictiveBackStateImpl");
            boolean z12 = z10 && !(((i3) h3Var).getValue() instanceof j0.a);
            if ((i12 & 14) != 4 && ((i12 & 8) == 0 || !c0VarR.k0(h3Var))) {
                z11 = false;
            }
            boolean zD = c0VarR.D(n7VarW) | z11;
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new a(h3Var, n7VarW, null);
                c0VarR.Y(objI0);
            }
            n0.e(z12, (Function2) objI0, c0VarR, 0, 0);
            c0VarR.v0();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        final boolean z13 = z10;
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.o0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return p0.d(h3Var, z13, function0, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0<Unit> c(n7<? extends Function0<Unit>> n7Var) {
        return n7Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(h3 h3Var, boolean z10, Function0 function0, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        b(h3Var, z10, function0, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final h3 f(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1883443352, i10, -1, "androidx.compose.material3.internal.rememberPredictiveBackState (BasicEdgeToEdgeDialog.kt:77)");
        }
        Object objI0 = c0Var.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new i3();
            c0Var.Y(objI0);
        }
        i3 i3Var = (i3) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return i3Var;
    }
}
