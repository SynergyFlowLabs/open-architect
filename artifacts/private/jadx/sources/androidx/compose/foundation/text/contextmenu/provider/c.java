package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.foundation.s3;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.layout.g0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.p;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nBasicTextContextMenuProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextContextMenuProvider.kt\nandroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,160:1\n85#2:161\n117#2,2:162\n*S KotlinDebug\n*F\n+ 1 BasicTextContextMenuProvider.kt\nandroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider\n*L\n123#1:161\n123#1:162,2\n*E\n"})
public final class c implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f19018d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p<b0.g, j, Function0<? extends g0>, c0, Integer, Unit> f19019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final s3 f19020b = new s3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n3 f19021c = d7.g(null, null, 2, null);

    private final class a implements b0.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final j f19022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.channels.p<Unit> f19023b = s.d(0, null, null, 7, null);

        public a(j jVar) {
            this.f19022a = jVar;
        }

        @Nullable
        public final Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
            Object objJ = this.f19023b.j(dVar);
            return objJ == kotlin.coroutines.intrinsics.b.l() ? objJ : Unit.f312394a;
        }

        @NotNull
        public final j b() {
            return this.f19022a;
        }

        @Override // b0.g
        public void close() {
            this.f19023b.p(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$showTextContextMenu$2", f = "BasicTextContextMenuProvider.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19025a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f19027c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
            this.f19027c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return c.this.new b(this.f19027c, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Unit] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f19025a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    c.this.j(this.f19027c);
                    a aVar = this.f19027c;
                    this.f19025a = 1;
                    if (aVar.a(this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                c.this.j(null);
                this = Unit.f312394a;
                return this;
            } catch (Throwable th2) {
                c.this.j(null);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull p<? super b0.g, ? super j, ? super Function0<? extends g0>, ? super c0, ? super Integer, Unit> pVar) {
        this.f19019a = pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(c cVar, Function0 function0, int i10, c0 c0Var, int i11) {
        cVar.d(function0, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(c cVar, Function0 function0, int i10, c0 c0Var, int i11) {
        cVar.d(function0, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final a i() {
        return (a) this.f19021c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(a aVar) {
        this.f19021c.setValue(aVar);
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.k
    @Nullable
    public Object a(@NotNull j jVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objE = s3.e(this.f19020b, null, new b(new a(jVar), null), dVar, 1, null);
        return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
    }

    @androidx.compose.runtime.o
    public final void d(@NotNull final Function0<? extends g0> function0, @Nullable c0 c0Var, final int i10) {
        int i11;
        final Function0<? extends g0> function1;
        c0 c0VarR = c0Var.R(723898654);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(this) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (m0.l0()) {
                m0.A0(723898654, i11, -1, "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.ContextMenu (BasicTextContextMenuProvider.kt:137)");
            }
            a aVarI = i();
            if (aVarI == null) {
                if (m0.l0()) {
                    m0.z0();
                }
                s5 s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.contextmenu.provider.a
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return c.e(this.f19012a, function0, i10, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function1 = function0;
            this.f19019a.invoke(aVarI, aVarI.b(), function1, c0VarR, Integer.valueOf((i11 << 6) & 896));
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            function1 = function0;
            c0VarR.u();
        }
        s5 s5VarT2 = c0VarR.T();
        if (s5VarT2 != null) {
            s5VarT2.a(new Function2() { // from class: androidx.compose.foundation.text.contextmenu.provider.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return c.f(this.f19015a, function1, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void h() {
        a aVarI = i();
        if (aVarI != null) {
            aVarI.close();
        }
    }
}
