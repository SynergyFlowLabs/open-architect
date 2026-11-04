package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import androidx.compose.ui.layout.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextContextMenuToolbarHandlerModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextContextMenuToolbarHandlerModifier.kt\nandroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,233:1\n85#2:234\n*S KotlinDebug\n*F\n+ 1 TextContextMenuToolbarHandlerModifier.kt\nandroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerNode\n*L\n157#1:234\n*E\n"})
public final class n extends androidx.compose.ui.node.m implements androidx.compose.ui.node.h, androidx.compose.foundation.text.contextmenu.provider.j {

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f19001p2 = 8;

    @Nullable
    private Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> X;

    @Nullable
    private Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> Y;

    @NotNull
    private Function1<? super g0, n0.j> Z;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    private p2 f19002p0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private o f19004w;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private final n7 f19003p1 = w6.e(new Function0() { // from class: androidx.compose.foundation.text.contextmenu.modifier.m
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return n.H9(this.f19000a);
        }
    });

    @NotNull
    private n0.j H1 = n0.j.f332705e.a();

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode$show$1", f = "TextContextMenuToolbarHandlerModifier.kt", i = {}, l = {182, 183, 185, 185}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f19005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f19006b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.contextmenu.provider.k f19008d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.foundation.text.contextmenu.provider.k kVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f19008d = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n.this.new a(this.f19008d, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x006c  */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
        
            if (r8.invoke(r7) == r0) goto L39;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                r6 = 3
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f19006b
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L3b
                if (r1 == r5) goto L37
                if (r1 == r4) goto L2e
                r6 = 1
                if (r1 == r3) goto L29
                if (r1 == r2) goto L20
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r6 = 3
                r7.<init>(r8)
                r6 = 3
                throw r7
            L20:
                r6 = 5
                java.lang.Object r7 = r7.f19005a
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                kotlin.ResultKt.m(r8)
                goto L8e
            L29:
                kotlin.ResultKt.m(r8)
                r6 = 5
                goto L76
            L2e:
                r6 = 7
                kotlin.ResultKt.m(r8)     // Catch: java.lang.Throwable -> L34
                r6 = 6
                goto L62
            L34:
                r8 = move-exception
                r6 = 1
                goto L7a
            L37:
                kotlin.ResultKt.m(r8)     // Catch: java.lang.Throwable -> L34
                goto L53
            L3b:
                r6 = 7
                kotlin.ResultKt.m(r8)
                androidx.compose.foundation.text.contextmenu.modifier.n r8 = androidx.compose.foundation.text.contextmenu.modifier.n.this     // Catch: java.lang.Throwable -> L34
                r6 = 3
                kotlin.jvm.functions.Function1 r8 = r8.L9()     // Catch: java.lang.Throwable -> L34
                r6 = 3
                if (r8 == 0) goto L53
                r7.f19006b = r5     // Catch: java.lang.Throwable -> L34
                java.lang.Object r8 = r8.invoke(r7)     // Catch: java.lang.Throwable -> L34
                r6 = 5
                if (r8 != r0) goto L53
                goto L8c
            L53:
                androidx.compose.foundation.text.contextmenu.provider.k r8 = r7.f19008d     // Catch: java.lang.Throwable -> L34
                androidx.compose.foundation.text.contextmenu.modifier.n r1 = androidx.compose.foundation.text.contextmenu.modifier.n.this     // Catch: java.lang.Throwable -> L34
                r7.f19006b = r4     // Catch: java.lang.Throwable -> L34
                java.lang.Object r8 = r8.a(r1, r7)     // Catch: java.lang.Throwable -> L34
                r6 = 4
                if (r8 != r0) goto L62
                r6 = 0
                goto L8c
            L62:
                androidx.compose.foundation.text.contextmenu.modifier.n r8 = androidx.compose.foundation.text.contextmenu.modifier.n.this
                r6 = 4
                kotlin.jvm.functions.Function1 r8 = r8.K9()
                r6 = 3
                if (r8 == 0) goto L76
                r7.f19006b = r3
                java.lang.Object r7 = r8.invoke(r7)
                r6 = 0
                if (r7 != r0) goto L76
                goto L8c
            L76:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                r6 = 6
                return r7
            L7a:
                androidx.compose.foundation.text.contextmenu.modifier.n r1 = androidx.compose.foundation.text.contextmenu.modifier.n.this
                kotlin.jvm.functions.Function1 r1 = r1.K9()
                if (r1 == 0) goto L8f
                r7.f19005a = r8
                r7.f19006b = r2
                java.lang.Object r7 = r1.invoke(r7)
                if (r7 != r0) goto L8d
            L8c:
                return r0
            L8d:
                r7 = r8
            L8e:
                r8 = r7
            L8f:
                r6 = 3
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.contextmenu.modifier.n.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public n(@NotNull o oVar, @Nullable Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, @Nullable Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull Function1<? super g0, n0.j> function3) {
        this.f19004w = oVar;
        this.X = function1;
        this.Y = function2;
        this.Z = function3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0.c H9(n nVar) {
        return nVar.a9() ? j.d(nVar) : b0.c.f77482b.a();
    }

    private final b0.c J9() {
        return (b0.c) this.f19003p1.getValue();
    }

    @NotNull
    public final Function1<g0, n0.j> I9() {
        return this.Z;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.j
    @NotNull
    public b0.c K() {
        return J9();
    }

    @Nullable
    public final Function1<kotlin.coroutines.d<? super Unit>, Object> K9() {
        return this.Y;
    }

    @Nullable
    public final Function1<kotlin.coroutines.d<? super Unit>, Object> L9() {
        return this.X;
    }

    @NotNull
    public final o M9() {
        return this.f19004w;
    }

    public final void N9() {
        p2 p2Var = this.f19002p0;
        if (p2Var == null) {
            return;
        }
        p2.a.b(p2Var, null, 1, null);
        this.f19002p0 = null;
    }

    public final void O9(@NotNull Function1<? super g0, n0.j> function1) {
        this.Z = function1;
    }

    public final void P9(@Nullable Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1) {
        this.Y = function1;
    }

    public final void Q9(@Nullable Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1) {
        this.X = function1;
    }

    public final void R9(@NotNull o oVar) {
        this.f19004w = oVar;
    }

    public final void S9() {
        if (a9()) {
            p2 p2Var = this.f19002p0;
            if (p2Var != null && p2Var.isActive()) {
                return;
            }
            androidx.compose.foundation.text.contextmenu.provider.k kVar = (androidx.compose.foundation.text.contextmenu.provider.k) androidx.compose.ui.node.i.a(this, androidx.compose.foundation.text.contextmenu.provider.n.f());
            if (kVar != null) {
                int i10 = 3 >> 0;
                this.f19002p0 = kotlinx.coroutines.k.f(Q8(), null, u0.UNDISPATCHED, new a(kVar, null), 1, null);
            }
        }
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        super.e9();
        this.f19004w.d(this);
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        this.f19004w.d(null);
        super.f9();
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.j
    @NotNull
    public n0.j h8(@NotNull g0 g0Var) {
        n0.j jVarInvoke;
        if (a9() && (jVarInvoke = this.Z.invoke(g0Var)) != null) {
            this.H1 = jVarInvoke;
            return jVarInvoke;
        }
        return this.H1;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.j
    public long n4(@NotNull g0 g0Var) {
        return h8(g0Var).E();
    }
}
