package androidx.compose.foundation.text.contextmenu.gestures;

import androidx.compose.foundation.gestures.e3;
import androidx.compose.ui.input.pointer.c;
import androidx.compose.ui.input.pointer.l0;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import n0.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRightClickGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RightClickGestures.kt\nandroidx/compose/foundation/text/contextmenu/gestures/RightClickGesturesKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,51:1\n88#2:52\n35#2,5:53\n89#2:58\n*S KotlinDebug\n*F\n+ 1 RightClickGestures.kt\nandroidx/compose/foundation/text/contextmenu/gestures/RightClickGesturesKt\n*L\n46#1:52\n46#1:53,5\n46#1:58\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.gestures.a$a, reason: collision with other inner class name */
    @f(c = "androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt", f = "RightClickGestures.kt", i = {0}, l = {45}, m = "awaitFirstRightClickDown", n = {"$this$awaitFirstRightClickDown"}, s = {"L$0"})
    static final class C0124a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f18826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f18827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f18828c;

        C0124a(kotlin.coroutines.d<? super C0124a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f18827b = obj;
            this.f18828c |= Integer.MIN_VALUE;
            return a.b(null, this);
        }
    }

    @f(c = "androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$onRightClickDown$2", f = "RightClickGestures.kt", i = {0}, l = {32, 35}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
    static final class b extends k implements Function2<c, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f18830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<g, Unit> f18831c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super g, Unit> function1, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f18831c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f18831c, dVar);
            bVar.f18830b = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
        
            if (r9 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r8.f18829a
                r2 = 4
                r2 = 2
                r3 = 6
                r3 = 1
                r7 = 2
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L15
                kotlin.ResultKt.m(r9)
                goto L61
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                r7 = 4
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L1e:
                r7 = 6
                java.lang.Object r1 = r8.f18830b
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                kotlin.ResultKt.m(r9)
                goto L3f
            L27:
                kotlin.ResultKt.m(r9)
                r7 = 2
                java.lang.Object r9 = r8.f18830b
                r1 = r9
                r1 = r9
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                r8.f18830b = r1
                r7 = 5
                r8.f18829a = r3
                r7 = 0
                java.lang.Object r9 = androidx.compose.foundation.text.contextmenu.gestures.a.a(r1, r8)
                r7 = 0
                if (r9 != r0) goto L3f
                goto L5f
            L3f:
                androidx.compose.ui.input.pointer.c0 r9 = (androidx.compose.ui.input.pointer.c0) r9
                r7 = 1
                r9.a()
                r7 = 6
                kotlin.jvm.functions.Function1<n0.g, kotlin.Unit> r4 = r8.f18831c
                long r5 = r9.u()
                n0.g r9 = n0.g.d(r5)
                r4.invoke(r9)
                r9 = 0
                r8.f18830b = r9
                r8.f18829a = r2
                java.lang.Object r9 = androidx.compose.foundation.gestures.c5.D(r1, r9, r8, r3, r9)
                r7 = 1
                if (r9 != r0) goto L61
            L5f:
                r7 = 6
                return r0
            L61:
                androidx.compose.ui.input.pointer.c0 r9 = (androidx.compose.ui.input.pointer.c0) r9
                if (r9 == 0) goto L68
                r9.a()
            L68:
                kotlin.Unit r8 = kotlin.Unit.f312394a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.contextmenu.gestures.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x007e A[LOOP:0: B:22:0x006e->B:26:0x007e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0051 -> B:19:0x0054). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(androidx.compose.ui.input.pointer.c r9, kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.text.contextmenu.gestures.a.C0124a
            r8 = 1
            if (r0 == 0) goto L17
            r0 = r10
            androidx.compose.foundation.text.contextmenu.gestures.a$a r0 = (androidx.compose.foundation.text.contextmenu.gestures.a.C0124a) r0
            r8 = 6
            int r1 = r0.f18828c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 3
            r3 = r1 & r2
            r8 = 3
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f18828c = r1
            goto L1d
        L17:
            r8 = 2
            androidx.compose.foundation.text.contextmenu.gestures.a$a r0 = new androidx.compose.foundation.text.contextmenu.gestures.a$a
            r0.<init>(r10)
        L1d:
            java.lang.Object r10 = r0.f18827b
            r8 = 7
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f18828c
            r3 = 1
            if (r2 == 0) goto L42
            r8 = 3
            if (r2 != r3) goto L35
            r8 = 2
            java.lang.Object r9 = r0.f18826a
            androidx.compose.ui.input.pointer.c r9 = (androidx.compose.ui.input.pointer.c) r9
            kotlin.ResultKt.m(r10)
            goto L54
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r8 = 5
            java.lang.String r10 = "los c /trk  o/ei//cabo/utul/herstif e/m/ne vwreoone"
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r8 = 1
            r9.<init>(r10)
            r8 = 7
            throw r9
        L42:
            r8 = 4
            kotlin.ResultKt.m(r10)
        L46:
            r0.f18826a = r9
            r0.f18828c = r3
            r8 = 0
            r10 = 0
            r8 = 6
            java.lang.Object r10 = androidx.compose.ui.input.pointer.c.d1(r9, r10, r0, r3, r10)
            if (r10 != r1) goto L54
            return r1
        L54:
            androidx.compose.ui.input.pointer.q r10 = (androidx.compose.ui.input.pointer.q) r10
            int r2 = r10.d()
            boolean r2 = androidx.compose.ui.input.pointer.v.q(r2)
            r8 = 0
            if (r2 == 0) goto L46
            java.util.List r2 = r10.e()
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
            r6 = r5
        L6e:
            if (r6 >= r4) goto L82
            java.lang.Object r7 = r2.get(r6)
            r8 = 6
            androidx.compose.ui.input.pointer.c0 r7 = (androidx.compose.ui.input.pointer.c0) r7
            boolean r7 = androidx.compose.ui.input.pointer.r.b(r7)
            if (r7 != 0) goto L7e
            goto L46
        L7e:
            r8 = 4
            int r6 = r6 + 1
            goto L6e
        L82:
            r8 = 4
            java.util.List r9 = r10.e()
            java.lang.Object r9 = r9.get(r5)
            r8 = 7
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.contextmenu.gestures.a.b(androidx.compose.ui.input.pointer.c, kotlin.coroutines.d):java.lang.Object");
    }

    @Nullable
    public static final Object c(@NotNull l0 l0Var, @NotNull Function1<? super g, Unit> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objE = e3.e(l0Var, new b(function1, null), dVar);
        return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
    }
}
