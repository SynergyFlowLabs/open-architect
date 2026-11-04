package androidx.compose.ui.platform;

import androidx.compose.runtime.s5;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPlatformTextInputModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputModifierNode.kt\nandroidx/compose/ui/platform/PlatformTextInputModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,252:1\n1#2:253\n75#3:254\n1282#4,6:255\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputModifierNode.kt\nandroidx/compose/ui/platform/PlatformTextInputModifierNodeKt\n*L\n157#1:254\n163#1:255,6\n*E\n"})
public final class l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.m4<j1> f40644a = androidx.compose.runtime.a1.m(b.f40648a);

    static final class a extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i3 f40645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f40646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f40647c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(i3 i3Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f40645a = i3Var;
            this.f40646b = function2;
            this.f40647c = i10;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            l3.a(this.f40645a, this.f40646b, c0Var, androidx.compose.runtime.t4.a(this.f40647c | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function0<j1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f40648a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j1 invoke() {
            return null;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", i = {}, l = {136}, m = "establishTextInputSession", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f40649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f40650b;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40649a = obj;
            this.f40650b |= Integer.MIN_VALUE;
            return l3.c(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", i = {}, l = {184, 186}, m = "interceptedTextInputSession", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f40651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f40652b;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40651a = obj;
            this.f40652b |= Integer.MIN_VALUE;
            return l3.d(null, null, null, this);
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.ui.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final void a(@NotNull i3 i3Var, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1892278287);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c0VarR.D(i3Var) : c0VarR.k0(i3Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1892278287, i11, -1, "androidx.compose.ui.platform.InterceptPlatformTextInput (PlatformTextInputModifierNode.kt:155)");
            }
            androidx.compose.runtime.m4<j1> m4Var = f40644a;
            j1 j1Var = (j1) c0VarR.W(m4Var);
            boolean zD = c0VarR.D(j1Var);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new j1(i3Var, j1Var);
                c0VarR.Y(objI0);
            }
            j1 j1Var2 = (j1) objI0;
            j1Var2.e(i3Var);
            androidx.compose.runtime.a1.e(m4Var.f(j1Var2), function2, c0VarR, (i11 & com.planner5d.library.engine.input.f.b.B) | androidx.compose.runtime.n4.f36267i);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new a(i3Var, function2, i10));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public static final Object c(@NotNull k3 k3Var, @NotNull Function2<? super n3, ? super kotlin.coroutines.d<?>, ? extends Object> function2, @NotNull kotlin.coroutines.d<?> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f40650b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f40650b = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f40649a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f40650b;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (!k3Var.w().a9()) {
                throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
            }
            androidx.compose.ui.node.x1 x1VarV = androidx.compose.ui.node.k.v(k3Var);
            j1 j1Var = (j1) androidx.compose.ui.node.k.u(k3Var).m().a(f40644a);
            cVar.f40650b = 1;
            if (d(x1VarV, j1Var, function2, cVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        throw new kotlin.a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r7.d(r6, r8, r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(androidx.compose.ui.node.x1 r6, androidx.compose.ui.platform.j1 r7, kotlin.jvm.functions.Function2<? super androidx.compose.ui.platform.n3, ? super kotlin.coroutines.d<?>, ? extends java.lang.Object> r8, kotlin.coroutines.d<?> r9) {
        /*
            r5 = 4
            boolean r0 = r9 instanceof androidx.compose.ui.platform.l3.d
            r5 = 7
            if (r0 == 0) goto L18
            r0 = r9
            r0 = r9
            r5 = 3
            androidx.compose.ui.platform.l3$d r0 = (androidx.compose.ui.platform.l3.d) r0
            r5 = 5
            int r1 = r0.f40652b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f40652b = r1
            goto L1e
        L18:
            androidx.compose.ui.platform.l3$d r0 = new androidx.compose.ui.platform.l3$d
            r5 = 0
            r0.<init>(r9)
        L1e:
            r5 = 7
            java.lang.Object r9 = r0.f40651a
            r5 = 5
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r5 = 3
            int r2 = r0.f40652b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            r5 = 4
            if (r2 == r4) goto L42
            r5 = 4
            if (r2 == r3) goto L3e
            r5 = 4
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "o se utknev/ai c/rhfs eoob/i/l tm/e/r ocet/or/lnewu"
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            kotlin.ResultKt.m(r9)
            goto L68
        L42:
            kotlin.ResultKt.m(r9)
            goto L58
        L46:
            r5 = 1
            kotlin.ResultKt.m(r9)
            if (r7 != 0) goto L5f
            r0.f40652b = r4
            r5 = 6
            java.lang.Object r6 = r6.O(r8, r0)
            r5 = 6
            if (r6 != r1) goto L58
            r5 = 1
            goto L67
        L58:
            kotlin.a0 r6 = new kotlin.a0
            r5 = 6
            r6.<init>()
            throw r6
        L5f:
            r0.f40652b = r3
            java.lang.Object r6 = r7.d(r6, r8, r0)
            if (r6 != r1) goto L68
        L67:
            return r1
        L68:
            kotlin.a0 r6 = new kotlin.a0
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.l3.d(androidx.compose.ui.node.x1, androidx.compose.ui.platform.j1, kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
    }
}
