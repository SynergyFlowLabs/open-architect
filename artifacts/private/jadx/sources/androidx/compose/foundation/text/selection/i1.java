package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.k5;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,451:1\n35#2,5:452\n35#2,5:457\n35#2,5:462\n35#2,5:467\n35#2,5:472\n35#2,5:477\n35#2,5:482\n88#2:487\n35#2,5:488\n89#2:493\n88#2:494\n35#2,5:495\n89#2:500\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt\n*L\n136#1:452,5\n166#1:457,5\n192#1:462,5\n249#1:467,5\n330#1:472,5\n365#1:477,5\n394#1:482,5\n433#1:487\n433#1:488,5\n433#1:493\n450#1:494\n450#1:495,5\n450#1:500\n*E\n"})
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f21108a = 8675309;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0}, l = {432}, m = "awaitDown", n = {"$this$awaitDown"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f21109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f21110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f21111c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21110b = obj;
            this.f21111c |= Integer.MIN_VALUE;
            return i1.o(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 1, 1, 1}, l = {159, 184}, m = "mouseSelection", n = {"$this$mouseSelection", "observer", "$this$mouseSelection", "observer", "dragConsumed"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f21112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f21113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f21114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f21115d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21116e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21115d = obj;
            this.f21116e |= Integer.MIN_VALUE;
            return i1.r(null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 1, 1, 1}, l = {358, 386}, m = "mouseSelectionBtf2", n = {"$this$mouseSelectionBtf2", "observer", "$this$mouseSelectionBtf2", "observer", "dragConsumed"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f21117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f21118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f21119c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f21120d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21121e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21120d = obj;
            this.f21121e |= Integer.MIN_VALUE;
            return i1.u(null, null, null, null, this);
        }
    }

    static final class d implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f21122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k5 f21123b;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", f = "SelectionGestures.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160745y1, 113, 115}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
        @SourceDebugExtension({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGestureInput$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,451:1\n88#2:452\n35#2,5:453\n89#2:458\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGestureInput$1$1\n*L\n111#1:452\n111#1:453,5\n111#1:458\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f21124a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f21125b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ r f21126c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ l f21127d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ k5 f21128e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, l lVar, k5 k5Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f21126c = rVar;
                this.f21127d = lVar;
                this.f21128e = k5Var;
                int i10 = 2 | 2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f21126c, this.f21127d, this.f21128e, dVar);
                aVar.f21125b = obj;
                return aVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
            
                if (androidx.compose.foundation.text.selection.i1.z(r1, r3, r11, r10) == r0) goto L34;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r9 = 1
                    int r1 = r10.f21124a
                    r2 = 5
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    r9 = 0
                    if (r1 == 0) goto L30
                    r9 = 7
                    if (r1 == r4) goto L27
                    if (r1 == r3) goto L21
                    if (r1 != r2) goto L16
                    goto L21
                L16:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    r9 = 1
                    java.lang.String r11 = "sfsr el/  voa//ieieuoh//etbeckecmro/rnt toiwl/  o/u"
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L21:
                    r9 = 4
                    kotlin.ResultKt.m(r11)
                    goto Laa
                L27:
                    java.lang.Object r1 = r10.f21125b
                    r9 = 3
                    androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                    kotlin.ResultKt.m(r11)
                    goto L46
                L30:
                    kotlin.ResultKt.m(r11)
                    java.lang.Object r11 = r10.f21125b
                    r1 = r11
                    r1 = r11
                    androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                    r9 = 6
                    r10.f21125b = r1
                    r9 = 0
                    r10.f21124a = r4
                    java.lang.Object r11 = androidx.compose.foundation.text.selection.i1.h(r1, r10)
                    if (r11 != r0) goto L46
                    goto La9
                L46:
                    androidx.compose.ui.input.pointer.q r11 = (androidx.compose.ui.input.pointer.q) r11
                    boolean r4 = androidx.compose.foundation.text.selection.i1.q(r11)
                    r5 = 0
                    r9 = 3
                    if (r4 == 0) goto L93
                    r9 = 2
                    int r4 = r11.d()
                    r9 = 7
                    boolean r4 = androidx.compose.ui.input.pointer.v.o(r4)
                    r9 = 5
                    if (r4 == 0) goto L93
                    r9 = 3
                    java.util.List r4 = r11.e()
                    r6 = r4
                    java.util.Collection r6 = (java.util.Collection) r6
                    int r6 = r6.size()
                    r7 = 0
                L6a:
                    r9 = 4
                    if (r7 >= r6) goto L7f
                    java.lang.Object r8 = r4.get(r7)
                    androidx.compose.ui.input.pointer.c0 r8 = (androidx.compose.ui.input.pointer.c0) r8
                    r9 = 4
                    boolean r8 = r8.F()
                    if (r8 == 0) goto L7b
                    goto L93
                L7b:
                    r9 = 3
                    int r7 = r7 + 1
                    goto L6a
                L7f:
                    r9 = 7
                    androidx.compose.foundation.text.selection.r r2 = r10.f21126c
                    r9 = 2
                    androidx.compose.foundation.text.selection.l r4 = r10.f21127d
                    r10.f21125b = r5
                    r9 = 3
                    r10.f21124a = r3
                    java.lang.Object r10 = androidx.compose.foundation.text.selection.i1.j(r1, r2, r4, r11, r10)
                    r9 = 0
                    if (r10 != r0) goto Laa
                    r9 = 1
                    goto La9
                L93:
                    boolean r3 = androidx.compose.foundation.text.selection.i1.q(r11)
                    r9 = 1
                    if (r3 != 0) goto Laa
                    r9 = 7
                    androidx.compose.foundation.text.k5 r3 = r10.f21128e
                    r9 = 4
                    r10.f21125b = r5
                    r10.f21124a = r2
                    r9 = 3
                    java.lang.Object r10 = androidx.compose.foundation.text.selection.i1.l(r1, r3, r11, r10)
                    if (r10 != r0) goto Laa
                La9:
                    return r0
                Laa:
                    r9 = 6
                    kotlin.Unit r10 = kotlin.Unit.f312394a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.i1.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        d(r rVar, k5 k5Var) {
            this.f21122a = rVar;
            this.f21123b = k5Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            Object objE = androidx.compose.foundation.gestures.e3.e(l0Var, new a(this.f21122a, new l(l0Var.getViewConfiguration()), this.f21123b, null), dVar);
            return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGesturePointerInputBtf2$2", f = "SelectionGestures.kt", i = {0}, l = {210, 218, 221, 222}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,451:1\n88#2:452\n35#2,5:453\n89#2:458\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2\n*L\n216#1:452\n216#1:453,5\n216#1:458\n*E\n"})
    static final class e extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f21130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f21131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r f21132d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ k5 f21133e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(l lVar, r rVar, k5 k5Var, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f21131c = lVar;
            this.f21132d = rVar;
            this.f21133e = k5Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = new e(this.f21131c, this.f21132d, this.f21133e, dVar);
            eVar.f21130b = obj;
            return eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
        
            if (androidx.compose.foundation.text.selection.i1.u(r1, r2, r3, r14, r13) == r0) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
        
            if (androidx.compose.foundation.text.selection.i1.B(r1, r2, r14, r13) == r0) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
        
            if (androidx.compose.foundation.text.selection.i1.D(r1, r3, r14, r13) == r0) goto L39;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r13.f21129a
                r2 = 4
                r12 = 4
                r3 = 3
                r12 = 5
                r4 = 2
                r12 = 7
                r5 = 1
                r12 = 2
                if (r1 == 0) goto L30
                if (r1 == r5) goto L28
                if (r1 == r4) goto L23
                r12 = 5
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1a
                goto L23
            L1a:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r12 = 3
                r13.<init>(r14)
                throw r13
            L23:
                kotlin.ResultKt.m(r14)
                goto Lc4
            L28:
                java.lang.Object r1 = r13.f21130b
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                kotlin.ResultKt.m(r14)
                goto L48
            L30:
                r12 = 2
                kotlin.ResultKt.m(r14)
                java.lang.Object r14 = r13.f21130b
                r1 = r14
                r12 = 0
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                r13.f21130b = r1
                r13.f21129a = r5
                r12 = 6
                java.lang.Object r14 = androidx.compose.foundation.text.selection.i1.h(r1, r13)
                r12 = 2
                if (r14 != r0) goto L48
                r12 = 3
                goto Lc3
            L48:
                r12 = 1
                androidx.compose.ui.input.pointer.q r14 = (androidx.compose.ui.input.pointer.q) r14
                r12 = 4
                androidx.compose.foundation.text.selection.l r6 = r13.f21131c
                r6.g(r14)
                boolean r6 = androidx.compose.foundation.text.selection.i1.q(r14)
                r12 = 2
                r7 = 0
                if (r6 == 0) goto L98
                int r8 = r14.d()
                r12 = 1
                boolean r8 = androidx.compose.ui.input.pointer.v.o(r8)
                if (r8 == 0) goto L98
                java.util.List r8 = r14.e()
                r9 = r8
                java.util.Collection r9 = (java.util.Collection) r9
                int r9 = r9.size()
                r12 = 3
                r10 = 0
            L71:
                if (r10 >= r9) goto L87
                r12 = 7
                java.lang.Object r11 = r8.get(r10)
                androidx.compose.ui.input.pointer.c0 r11 = (androidx.compose.ui.input.pointer.c0) r11
                r12 = 3
                boolean r11 = r11.F()
                if (r11 == 0) goto L83
                r12 = 1
                goto L98
            L83:
                int r10 = r10 + 1
                r12 = 7
                goto L71
            L87:
                androidx.compose.foundation.text.selection.r r2 = r13.f21132d
                androidx.compose.foundation.text.selection.l r3 = r13.f21131c
                r13.f21130b = r7
                r12 = 6
                r13.f21129a = r4
                java.lang.Object r13 = androidx.compose.foundation.text.selection.i1.k(r1, r2, r3, r14, r13)
                r12 = 0
                if (r13 != r0) goto Lc4
                goto Lc3
            L98:
                r12 = 6
                if (r6 != 0) goto Lc4
                androidx.compose.foundation.text.selection.l r4 = r13.f21131c
                r12 = 4
                int r4 = r4.a()
                r12 = 4
                if (r4 != r5) goto Lb6
                androidx.compose.foundation.text.k5 r2 = r13.f21133e
                r12 = 7
                r13.f21130b = r7
                r12 = 5
                r13.f21129a = r3
                r12 = 2
                java.lang.Object r13 = androidx.compose.foundation.text.selection.i1.m(r1, r2, r14, r13)
                r12 = 5
                if (r13 != r0) goto Lc4
                goto Lc3
            Lb6:
                androidx.compose.foundation.text.k5 r3 = r13.f21133e
                r13.f21130b = r7
                r13.f21129a = r2
                java.lang.Object r13 = androidx.compose.foundation.text.selection.i1.n(r1, r3, r14, r13)
                r12 = 4
                if (r13 != r0) goto Lc4
            Lc3:
                return r0
            Lc4:
                kotlin.Unit r13 = kotlin.Unit.f312394a
                r12 = 6
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.i1.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 0, 1, 1}, l = {okhttp3.internal.ws.g.f334652s, 130}, m = "touchSelection", n = {"$this$touchSelection", "observer", "firstDown", "$this$touchSelection", "observer"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f21134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f21135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f21136c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f21137d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21138e;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21137d = obj;
            this.f21138e |= Integer.MIN_VALUE;
            return i1.z(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 0, 1, 1}, l = {239, com.planner5d.library.engine.input.f.b.M1}, m = "touchSelectionFirstPress", n = {"$this$touchSelectionFirstPress", "observer", "firstDown", "$this$touchSelectionFirstPress", "observer"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f21139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f21140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f21141c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f21142d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21143e;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21142d = obj;
            this.f21143e |= Integer.MIN_VALUE;
            return i1.B(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {282, 323}, m = "touchSelectionSubsequentPress", n = {"$this$touchSelectionSubsequentPress", "observer", "firstDown", "overSlop", "pointerId", "$this$touchSelectionSubsequentPress", "observer"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1"})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f21144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f21145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f21146c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f21147d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f21148e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f21149f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f21150g;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21149f = obj;
            this.f21150g |= Integer.MIN_VALUE;
            return i1.D(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", f = "SelectionGestures.kt", i = {0}, l = {284}, m = "invokeSuspend", n = {"$this$withTimeoutOrNull"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,451:1\n273#2:452\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1\n*L\n290#1:452\n*E\n"})
    static final class i extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super o>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f21152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f21153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.g f21154d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(long j10, kotlin.jvm.internal.i1.g gVar, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f21153c = j10;
            this.f21154d = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(kotlin.jvm.internal.i1.g gVar, androidx.compose.ui.input.pointer.c0 c0Var, n0.g gVar2) {
            c0Var.a();
            gVar.f312750a = gVar2.B();
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            i iVar = new i(this.f21153c, this.f21154d, dVar);
            iVar.f21152b = obj;
            return iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            androidx.compose.ui.input.pointer.c cVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f21151a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.ui.input.pointer.c cVar2 = (androidx.compose.ui.input.pointer.c) this.f21152b;
                long j10 = this.f21153c;
                final kotlin.jvm.internal.i1.g gVar = this.f21154d;
                Function2 function2 = new Function2() { // from class: androidx.compose.foundation.text.selection.j1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return i1.i.n(gVar, (androidx.compose.ui.input.pointer.c0) obj2, (n0.g) obj3);
                    }
                };
                this.f21152b = cVar2;
                this.f21151a = 1;
                Object objF = androidx.compose.foundation.gestures.x1.F(cVar2, j10, function2, this);
                if (objF == objL) {
                    return objL;
                }
                cVar = cVar2;
                obj = objF;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (androidx.compose.ui.input.pointer.c) this.f21152b;
                ResultKt.m(obj);
            }
            if (((androidx.compose.ui.input.pointer.c0) obj) != null && (this.f21154d.f312750a & 9223372034707292159L) != n0.d.f332689d) {
                return o.Drag;
            }
            androidx.compose.ui.input.pointer.c0 c0Var = (androidx.compose.ui.input.pointer.c0) CollectionsKt.first((List) cVar.J6().e());
            if (!androidx.compose.ui.input.pointer.r.e(c0Var)) {
                return o.Cancel;
            }
            c0Var.a();
            return o.Up;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super o> dVar) {
            return ((i) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class j implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f21155a;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160703k1}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f21156a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f21157b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<Boolean, Unit> f21158c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super Boolean, Unit> function1, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f21158c = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f21158c, dVar);
                aVar.f21157b = obj;
                return aVar;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x003c A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003a -> B:12:0x003d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x003c
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    r4 = 3
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r5.f21156a
                    r2 = 4
                    r2 = 1
                    r4 = 0
                    if (r1 == 0) goto L23
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r5.f21157b
                    r4 = 4
                    androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                    kotlin.ResultKt.m(r6)
                    goto L3d
                L17:
                    r4 = 3
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = " nswvlobt/i//eoieh/erle/rt/oinr euoo c/fcst   ku/em"
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    r4 = 3
                    throw r5
                L23:
                    r4 = 6
                    kotlin.ResultKt.m(r6)
                    r4 = 5
                    java.lang.Object r6 = r5.f21157b
                    androidx.compose.ui.input.pointer.c r6 = (androidx.compose.ui.input.pointer.c) r6
                    r1 = r6
                    r1 = r6
                L2e:
                    androidx.compose.ui.input.pointer.s r6 = androidx.compose.ui.input.pointer.s.Initial
                    r5.f21157b = r1
                    r4 = 6
                    r5.f21156a = r2
                    r4 = 6
                    java.lang.Object r6 = r1.I6(r6, r5)
                    if (r6 != r0) goto L3d
                    return r0
                L3d:
                    androidx.compose.ui.input.pointer.q r6 = (androidx.compose.ui.input.pointer.q) r6
                    r4 = 0
                    kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r3 = r5.f21158c
                    boolean r6 = androidx.compose.foundation.text.selection.i1.q(r6)
                    r6 = r6 ^ r2
                    r4 = 7
                    java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)
                    r4 = 6
                    r3.invoke(r6)
                    goto L2e
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.i1.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        j(Function1<? super Boolean, Unit> function1) {
            this.f21155a = function1;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            Object objG5 = l0Var.g5(new a(this.f21155a, null), dVar);
            return objG5 == kotlin.coroutines.intrinsics.b.l() ? objG5 : Unit.f312394a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(k5 k5Var, androidx.compose.ui.input.pointer.c0 c0Var) {
        k5Var.c(androidx.compose.ui.input.pointer.r.k(c0Var));
        c0Var.a();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b9, code lost:
    
        if (r12 == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(androidx.compose.ui.input.pointer.c r9, final androidx.compose.foundation.text.k5 r10, androidx.compose.ui.input.pointer.q r11, kotlin.coroutines.d<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.i1.B(androidx.compose.ui.input.pointer.c, androidx.compose.foundation.text.k5, androidx.compose.ui.input.pointer.q, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(k5 k5Var, androidx.compose.ui.input.pointer.c0 c0Var) {
        k5Var.c(androidx.compose.ui.input.pointer.r.k(c0Var));
        c0Var.a();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e1, code lost:
    
        if (r15 == r1) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D(androidx.compose.ui.input.pointer.c r12, final androidx.compose.foundation.text.k5 r13, androidx.compose.ui.input.pointer.q r14, kotlin.coroutines.d<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.i1.D(androidx.compose.ui.input.pointer.c, androidx.compose.foundation.text.k5, androidx.compose.ui.input.pointer.q, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(k5 k5Var, androidx.compose.ui.input.pointer.c0 c0Var) {
        k5Var.c(androidx.compose.ui.input.pointer.r.k(c0Var));
        c0Var.a();
        return Unit.f312394a;
    }

    @NotNull
    public static final androidx.compose.ui.a0 F(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super Boolean, Unit> function1) {
        return androidx.compose.ui.input.pointer.w0.e(a0Var, Integer.valueOf(f21108a), new j(function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[LOOP:0: B:20:0x005f->B:24:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004a -> B:19:0x004e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object o(androidx.compose.ui.input.pointer.c r8, kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.q> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.text.selection.i1.a
            r7 = 3
            if (r0 == 0) goto L16
            r0 = r9
            r7 = 2
            androidx.compose.foundation.text.selection.i1$a r0 = (androidx.compose.foundation.text.selection.i1.a) r0
            r7 = 5
            int r1 = r0.f21111c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f21111c = r1
            goto L1b
        L16:
            androidx.compose.foundation.text.selection.i1$a r0 = new androidx.compose.foundation.text.selection.i1$a
            r0.<init>(r9)
        L1b:
            r7 = 4
            java.lang.Object r9 = r0.f21110b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f21111c
            r3 = 1
            r7 = r3
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.f21109a
            androidx.compose.ui.input.pointer.c r8 = (androidx.compose.ui.input.pointer.c) r8
            kotlin.ResultKt.m(r9)
            r7 = 3
            goto L4e
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            r7 = 0
            throw r8
        L3c:
            kotlin.ResultKt.m(r9)
        L3f:
            androidx.compose.ui.input.pointer.s r9 = androidx.compose.ui.input.pointer.s.Main
            r0.f21109a = r8
            r0.f21111c = r3
            java.lang.Object r9 = r8.I6(r9, r0)
            r7 = 3
            if (r9 != r1) goto L4e
            r7 = 0
            return r1
        L4e:
            androidx.compose.ui.input.pointer.q r9 = (androidx.compose.ui.input.pointer.q) r9
            r7 = 2
            java.util.List r2 = r9.e()
            r4 = r2
            r7 = 3
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 7
            r5 = 0
        L5f:
            if (r5 >= r4) goto L74
            r7 = 7
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.input.pointer.c0 r6 = (androidx.compose.ui.input.pointer.c0) r6
            boolean r6 = androidx.compose.ui.input.pointer.r.c(r6)
            if (r6 != 0) goto L70
            r7 = 3
            goto L3f
        L70:
            int r5 = r5 + 1
            r7 = 1
            goto L5f
        L74:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.i1.o(androidx.compose.ui.input.pointer.c, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(androidx.compose.ui.platform.o4 o4Var, androidx.compose.ui.input.pointer.c0 c0Var, androidx.compose.ui.input.pointer.c0 c0Var2) {
        return n0.g.m(n0.g.v(c0Var.u(), c0Var2.u())) < androidx.compose.foundation.gestures.x1.r0(o4Var, c0Var.C());
    }

    public static final boolean q(@NotNull androidx.compose.ui.input.pointer.q qVar) {
        List<androidx.compose.ui.input.pointer.c0> listE = qVar.e();
        int size = listE.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!androidx.compose.ui.input.pointer.r0.i(listE.get(i10).C(), androidx.compose.ui.input.pointer.r0.f39113b.b())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x009a  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:54:0x014c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0158  */
    /* JADX WARN: Code duplicated, block: B:63:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object r(androidx.compose.ui.input.pointer.c cVar, final r rVar, l lVar, androidx.compose.ui.input.pointer.q qVar, kotlin.coroutines.d<? super Unit> dVar) {
        b bVar;
        final n0 n0VarM;
        androidx.compose.ui.input.pointer.c cVar2;
        kotlin.jvm.internal.i1.a aVar;
        List<androidx.compose.ui.input.pointer.c0> listE;
        int size;
        androidx.compose.ui.input.pointer.c0 c0Var;
        List<androidx.compose.ui.input.pointer.c0> listE2;
        int size2;
        androidx.compose.ui.input.pointer.c0 c0Var2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f21116e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f21116e = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objO0 = bVar.f21115d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f21116e;
        int i12 = 0;
        if (i11 == 0) {
            ResultKt.m(objO0);
            lVar.g(qVar);
            androidx.compose.ui.input.pointer.c0 c0Var3 = qVar.e().get(0);
            if (!p4.G(qVar)) {
                int iA = lVar.a();
                if (iA != 1) {
                    n0VarM = iA != 2 ? n0.f21271a.n() : n0.f21271a.o();
                } else {
                    n0VarM = n0.f21271a.m();
                }
                if (rVar.b(c0Var3.u(), n0VarM, lVar.a())) {
                    final kotlin.jvm.internal.i1.a aVar2 = new kotlin.jvm.internal.i1.a();
                    aVar2.f312744a = !Intrinsics.areEqual(n0VarM, n0.f21271a.m());
                    long jS = c0Var3.s();
                    Function1 function1 = new Function1() { // from class: androidx.compose.foundation.text.selection.g1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return i1.t(rVar, n0VarM, aVar2, (androidx.compose.ui.input.pointer.c0) obj);
                        }
                    };
                    bVar.f21112a = cVar;
                    bVar.f21113b = rVar;
                    bVar.f21114c = aVar2;
                    bVar.f21116e = 2;
                    objO0 = androidx.compose.foundation.gestures.x1.o0(cVar, jS, function1, bVar);
                    if (objO0 != objL) {
                        cVar2 = cVar;
                        aVar = aVar2;
                        if (((Boolean) objO0).booleanValue()) {
                            listE2 = cVar2.J6().e();
                            size2 = listE2.size();
                            while (i12 < size2) {
                                c0Var2 = listE2.get(i12);
                                if (androidx.compose.ui.input.pointer.r.d(c0Var2)) {
                                    c0Var2.a();
                                }
                                i12++;
                            }
                        }
                        rVar.c();
                    }
                    return objL;
                }
            } else if (rVar.e(c0Var3.u())) {
                long jS2 = c0Var3.s();
                Function1 function2 = new Function1() { // from class: androidx.compose.foundation.text.selection.f1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return i1.s(rVar, (androidx.compose.ui.input.pointer.c0) obj);
                    }
                };
                bVar.f21112a = cVar;
                bVar.f21113b = rVar;
                bVar.f21116e = 1;
                objO0 = androidx.compose.foundation.gestures.x1.o0(cVar, jS2, function2, bVar);
                if (objO0 == objL) {
                    return objL;
                }
                if (((Boolean) objO0).booleanValue()) {
                    listE = cVar.J6().e();
                    size = listE.size();
                    while (i12 < size) {
                        c0Var = listE.get(i12);
                        if (androidx.compose.ui.input.pointer.r.d(c0Var)) {
                            c0Var.a();
                        }
                        i12++;
                    }
                }
                rVar.c();
            }
        } else if (i11 == 1) {
            rVar = (r) bVar.f21113b;
            cVar = (androidx.compose.ui.input.pointer.c) bVar.f21112a;
            ResultKt.m(objO0);
            if (((Boolean) objO0).booleanValue()) {
                listE = cVar.J6().e();
                size = listE.size();
                while (i12 < size) {
                    c0Var = listE.get(i12);
                    if (androidx.compose.ui.input.pointer.r.d(c0Var)) {
                        c0Var.a();
                    }
                    i12++;
                }
            }
            rVar.c();
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (kotlin.jvm.internal.i1.a) bVar.f21114c;
            rVar = (r) bVar.f21113b;
            cVar2 = (androidx.compose.ui.input.pointer.c) bVar.f21112a;
            ResultKt.m(objO0);
            if (((Boolean) objO0).booleanValue() && aVar.f312744a) {
                listE2 = cVar2.J6().e();
                size2 = listE2.size();
                while (i12 < size2) {
                    c0Var2 = listE2.get(i12);
                    if (androidx.compose.ui.input.pointer.r.d(c0Var2)) {
                        c0Var2.a();
                    }
                    i12++;
                }
            }
            rVar.c();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(r rVar, androidx.compose.ui.input.pointer.c0 c0Var) {
        if (rVar.d(c0Var.u())) {
            c0Var.a();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(r rVar, n0 n0Var, kotlin.jvm.internal.i1.a aVar, androidx.compose.ui.input.pointer.c0 c0Var) {
        if (rVar.a(c0Var.u(), n0Var)) {
            c0Var.a();
            aVar.f312744a = true;
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00ac A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:20:0x005e, B:31:0x00a2, B:33:0x00ac, B:35:0x00bf, B:37:0x00cc, B:28:0x0085), top: B:71:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:20:0x005e, B:31:0x00a2, B:33:0x00ac, B:35:0x00bf, B:37:0x00cc, B:28:0x0085), top: B:71:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #0 {all -> 0x0064, blocks: (B:20:0x005e, B:31:0x00a2, B:33:0x00ac, B:35:0x00bf, B:37:0x00cc, B:28:0x0085), top: B:71:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0166 A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:13:0x0040, B:55:0x0142, B:57:0x014b, B:59:0x0151, B:62:0x0166, B:64:0x0172, B:50:0x010c), top: B:71:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0172 A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #1 {all -> 0x0046, blocks: (B:13:0x0040, B:55:0x0142, B:57:0x014b, B:59:0x0151, B:62:0x0166, B:64:0x0172, B:50:0x010c), top: B:71:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object u(androidx.compose.ui.input.pointer.c cVar, final r rVar, l lVar, androidx.compose.ui.input.pointer.q qVar, kotlin.coroutines.d<? super Unit> dVar) {
        c cVar2;
        final n0 n0VarM;
        androidx.compose.ui.input.pointer.c cVar3;
        kotlin.jvm.internal.i1.a aVar;
        List<androidx.compose.ui.input.pointer.c0> listE;
        int size;
        androidx.compose.ui.input.pointer.c0 c0Var;
        List<androidx.compose.ui.input.pointer.c0> listE2;
        int size2;
        androidx.compose.ui.input.pointer.c0 c0Var2;
        if (dVar instanceof c) {
            cVar2 = (c) dVar;
            int i10 = cVar2.f21121e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f21121e = i10 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(dVar);
            }
        } else {
            cVar2 = new c(dVar);
        }
        Object objO0 = cVar2.f21120d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar2.f21121e;
        int i12 = 0;
        try {
            try {
                if (i11 == 0) {
                    ResultKt.m(objO0);
                    androidx.compose.ui.input.pointer.c0 c0Var3 = qVar.e().get(0);
                    if (!p4.G(qVar)) {
                        int iA = lVar.a();
                        if (iA != 1) {
                            n0VarM = iA != 2 ? n0.f21271a.n() : n0.f21271a.o();
                        } else {
                            n0VarM = n0.f21271a.m();
                        }
                        if (rVar.b(c0Var3.u(), n0VarM, lVar.a())) {
                            c0Var3.a();
                            final kotlin.jvm.internal.i1.a aVar2 = new kotlin.jvm.internal.i1.a();
                            aVar2.f312744a = !Intrinsics.areEqual(n0VarM, n0.f21271a.m());
                            long jS = c0Var3.s();
                            Function1 function1 = new Function1() { // from class: androidx.compose.foundation.text.selection.d1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return i1.w(rVar, n0VarM, aVar2, (androidx.compose.ui.input.pointer.c0) obj);
                                }
                            };
                            cVar2.f21117a = cVar;
                            cVar2.f21118b = rVar;
                            cVar2.f21119c = aVar2;
                            cVar2.f21121e = 2;
                            objO0 = androidx.compose.foundation.gestures.x1.o0(cVar, jS, function1, cVar2);
                            if (objO0 != objL) {
                                cVar3 = cVar;
                                aVar = aVar2;
                                if (((Boolean) objO0).booleanValue()) {
                                    listE2 = cVar3.J6().e();
                                    size2 = listE2.size();
                                    while (i12 < size2) {
                                        c0Var2 = listE2.get(i12);
                                        if (androidx.compose.ui.input.pointer.r.d(c0Var2)) {
                                            c0Var2.a();
                                        }
                                        i12++;
                                    }
                                }
                                rVar.c();
                            }
                            return objL;
                        }
                    } else if (rVar.e(c0Var3.u())) {
                        c0Var3.a();
                        long jS2 = c0Var3.s();
                        Function1 function2 = new Function1() { // from class: androidx.compose.foundation.text.selection.c1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return i1.v(rVar, (androidx.compose.ui.input.pointer.c0) obj);
                            }
                        };
                        cVar2.f21117a = cVar;
                        cVar2.f21118b = rVar;
                        cVar2.f21121e = 1;
                        objO0 = androidx.compose.foundation.gestures.x1.o0(cVar, jS2, function2, cVar2);
                        if (objO0 == objL) {
                            return objL;
                        }
                        if (((Boolean) objO0).booleanValue()) {
                            listE = cVar.J6().e();
                            size = listE.size();
                            while (i12 < size) {
                                c0Var = listE.get(i12);
                                if (androidx.compose.ui.input.pointer.r.d(c0Var)) {
                                    c0Var.a();
                                }
                                i12++;
                            }
                        }
                        rVar.c();
                    }
                } else if (i11 == 1) {
                    rVar = (r) cVar2.f21118b;
                    cVar = (androidx.compose.ui.input.pointer.c) cVar2.f21117a;
                    ResultKt.m(objO0);
                    if (((Boolean) objO0).booleanValue()) {
                        listE = cVar.J6().e();
                        size = listE.size();
                        while (i12 < size) {
                            c0Var = listE.get(i12);
                            if (androidx.compose.ui.input.pointer.r.d(c0Var)) {
                                c0Var.a();
                            }
                            i12++;
                        }
                    }
                    rVar.c();
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (kotlin.jvm.internal.i1.a) cVar2.f21119c;
                    rVar = (r) cVar2.f21118b;
                    cVar3 = (androidx.compose.ui.input.pointer.c) cVar2.f21117a;
                    ResultKt.m(objO0);
                    if (((Boolean) objO0).booleanValue() && aVar.f312744a) {
                        listE2 = cVar3.J6().e();
                        size2 = listE2.size();
                        while (i12 < size2) {
                            c0Var2 = listE2.get(i12);
                            if (androidx.compose.ui.input.pointer.r.d(c0Var2)) {
                                c0Var2.a();
                            }
                            i12++;
                        }
                    }
                    rVar.c();
                }
                return Unit.f312394a;
            } catch (Throwable th2) {
                rVar.c();
                throw th2;
            }
        } catch (Throwable th3) {
            rVar.c();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(r rVar, androidx.compose.ui.input.pointer.c0 c0Var) {
        if (rVar.d(c0Var.u())) {
            c0Var.a();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(r rVar, n0 n0Var, kotlin.jvm.internal.i1.a aVar, androidx.compose.ui.input.pointer.c0 c0Var) {
        if (rVar.a(c0Var.u(), n0Var)) {
            c0Var.a();
            aVar.f312744a = true;
        }
        return Unit.f312394a;
    }

    @NotNull
    public static final androidx.compose.ui.a0 x(@NotNull androidx.compose.ui.a0 a0Var, @NotNull r rVar, @NotNull k5 k5Var) {
        return androidx.compose.ui.input.pointer.w0.f(a0Var, rVar, k5Var, new d(rVar, k5Var));
    }

    @Nullable
    public static final Object y(@NotNull androidx.compose.ui.input.pointer.l0 l0Var, @NotNull r rVar, @NotNull k5 k5Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objE = androidx.compose.foundation.gestures.e3.e(l0Var, new e(new l(l0Var.getViewConfiguration()), rVar, k5Var, null), dVar);
        return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
    
        if (r12 == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(androidx.compose.ui.input.pointer.c r9, final androidx.compose.foundation.text.k5 r10, androidx.compose.ui.input.pointer.q r11, kotlin.coroutines.d<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.i1.z(androidx.compose.ui.input.pointer.c, androidx.compose.foundation.text.k5, androidx.compose.ui.input.pointer.q, kotlin.coroutines.d):java.lang.Object");
    }
}
