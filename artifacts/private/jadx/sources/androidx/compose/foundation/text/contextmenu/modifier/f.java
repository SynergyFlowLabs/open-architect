package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.runtime.n3;
import androidx.compose.runtime.w6;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.l0;
import androidx.compose.ui.input.pointer.w0;
import androidx.compose.ui.node.v;
import kotlin.Unit;
import kotlin.a0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextContextMenuGesturesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextContextMenuGesturesModifier.kt\nandroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,124:1\n85#2:125\n117#2,2:126\n*S KotlinDebug\n*F\n+ 1 TextContextMenuGesturesModifier.kt\nandroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureNode\n*L\n88#1:125\n88#1:126,2\n*E\n"})
final class f extends androidx.compose.ui.node.m implements androidx.compose.ui.node.h, v {

    @NotNull
    private static final c Y = new c(null);

    @NotNull
    private static final String Z = "Tried to open context menu before the anchor was placed.";

    @NotNull
    private final n3 X = w6.k(null, w6.o());

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> f18986w;

    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.f$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0125a extends g0 implements Function1<n0.g, Unit> {
            C0125a(Object obj) {
                super(1, obj, f.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0);
            }

            public final void X(long j10) {
                ((f) this.receiver).L9(j10);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(n0.g gVar) {
                X(gVar.B());
                return Unit.f312394a;
            }
        }

        a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            Object objC = androidx.compose.foundation.text.contextmenu.gestures.a.c(l0Var, new C0125a(f.this), dVar);
            return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nTextContextMenuGesturesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextContextMenuGesturesModifier.kt\nandroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureNode$ClickTextContextMenuDataProvider\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,124:1\n72#2,5:125\n*S KotlinDebug\n*F\n+ 1 TextContextMenuGesturesModifier.kt\nandroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureNode$ClickTextContextMenuDataProvider\n*L\n114#1:125,5\n*E\n"})
    private final class b implements androidx.compose.foundation.text.contextmenu.provider.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f18988a;

        public /* synthetic */ b(f fVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10);
        }

        @Override // androidx.compose.foundation.text.contextmenu.provider.j
        @NotNull
        public b0.c K() {
            return j.d(f.this);
        }

        @Override // androidx.compose.foundation.text.contextmenu.provider.j
        @NotNull
        public n0.j h8(@NotNull androidx.compose.ui.layout.g0 g0Var) {
            return n0.k.c(n4(g0Var), n0.n.f332724b.c());
        }

        @Override // androidx.compose.foundation.text.contextmenu.provider.j
        public long n4(@NotNull androidx.compose.ui.layout.g0 g0Var) {
            androidx.compose.ui.layout.g0 g0VarJ9 = f.this.J9();
            if (g0VarJ9 != null) {
                return g0Var.r0(g0VarJ9, this.f18988a);
            }
            androidx.compose.foundation.internal.e.j(f.Z);
            throw new a0();
        }

        private b(long j10) {
            this.f18988a = j10;
        }
    }

    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$tryShowContextMenu$1", f = "TextContextMenuGesturesModifier.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160742x1, com.planner5d.library.engine.input.f.b.f160745y1}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18990a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.contextmenu.provider.k f18992c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f18993d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.foundation.text.contextmenu.provider.k kVar, b bVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f18992c = kVar;
            this.f18993d = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new d(this.f18992c, this.f18993d, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        
            if (r6.a(r1, r5) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r4 = 7
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r4 = 6
                int r1 = r5.f18990a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                r4 = 2
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L15
                kotlin.ResultKt.m(r6)
                goto L48
            L15:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r4 = 7
                r5.<init>(r6)
                r4 = 0
                throw r5
            L1f:
                r4 = 7
                kotlin.ResultKt.m(r6)
                goto L39
            L24:
                kotlin.ResultKt.m(r6)
                androidx.compose.foundation.text.contextmenu.modifier.f r6 = androidx.compose.foundation.text.contextmenu.modifier.f.this
                kotlin.jvm.functions.Function1 r6 = androidx.compose.foundation.text.contextmenu.modifier.f.H9(r6)
                if (r6 == 0) goto L39
                r5.f18990a = r3
                java.lang.Object r6 = r6.invoke(r5)
                if (r6 != r0) goto L39
                r4 = 5
                goto L47
            L39:
                androidx.compose.foundation.text.contextmenu.provider.k r6 = r5.f18992c
                androidx.compose.foundation.text.contextmenu.modifier.f$b r1 = r5.f18993d
                r5.f18990a = r2
                r4 = 6
                java.lang.Object r5 = r6.a(r1, r5)
                r4 = 6
                if (r5 != r0) goto L48
            L47:
                return r0
            L48:
                r4 = 1
                kotlin.Unit r5 = kotlin.Unit.f312394a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.contextmenu.modifier.f.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public f(@Nullable Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1) {
        this.f18986w = function1;
        v9(w0.a(new a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.layout.g0 J9() {
        return (androidx.compose.ui.layout.g0) this.X.getValue();
    }

    private final void K9(androidx.compose.ui.layout.g0 g0Var) {
        this.X.setValue(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L9(long j10) {
        androidx.compose.foundation.text.contextmenu.provider.k kVar = (androidx.compose.foundation.text.contextmenu.provider.k) androidx.compose.ui.node.i.a(this, androidx.compose.foundation.text.contextmenu.provider.n.e());
        if (kVar == null) {
            return;
        }
        kotlinx.coroutines.k.f(Q8(), null, null, new d(kVar, new b(this, j10, null), null), 3, null);
    }

    public final void M9(@Nullable Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1) {
        this.f18986w = function1;
    }

    @Override // androidx.compose.ui.node.v
    public void n0(@NotNull androidx.compose.ui.layout.g0 g0Var) {
        K9(g0Var);
    }
}
