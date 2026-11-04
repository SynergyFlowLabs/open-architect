package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.e3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2", f = "PressDownGesture.kt", i = {0, 1, 1}, l = {31, 37}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down"}, s = {"L$0", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nPressDownGesture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PressDownGesture.kt\nandroidx/compose/foundation/text/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,47:1\n103#2:48\n35#2,5:49\n104#2:54\n*S KotlinDebug\n*F\n+ 1 PressDownGesture.kt\nandroidx/compose/foundation/text/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2\n*L\n38#1:48\n38#1:49,5\n38#1:54\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f19807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f19808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f19809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f19810d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f19811e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f fVar, Function0<Unit> function0, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f19810d = fVar;
            this.f19811e = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f19810d, this.f19811e, dVar);
            aVar.f19809c = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
        
            if (r14 == r0) goto L20;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0076 -> B:21:0x0079). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                r12 = 4
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r13.f19808b
                r2 = 4
                r2 = 2
                r12 = 4
                r3 = 1
                if (r1 == 0) goto L35
                r12 = 2
                if (r1 == r3) goto L2a
                if (r1 != r2) goto L21
                java.lang.Object r1 = r13.f19807a
                r12 = 4
                androidx.compose.ui.input.pointer.c0 r1 = (androidx.compose.ui.input.pointer.c0) r1
                java.lang.Object r4 = r13.f19809c
                r12 = 7
                androidx.compose.ui.input.pointer.c r4 = (androidx.compose.ui.input.pointer.c) r4
                kotlin.ResultKt.m(r14)
                r7 = r13
                goto L79
            L21:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r12 = 3
                r13.<init>(r14)
                throw r13
            L2a:
                r12 = 2
                java.lang.Object r1 = r13.f19809c
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                kotlin.ResultKt.m(r14)
                r7 = r13
                r12 = 5
                goto L54
            L35:
                r12 = 6
                kotlin.ResultKt.m(r14)
                java.lang.Object r14 = r13.f19809c
                r4 = r14
                androidx.compose.ui.input.pointer.c r4 = (androidx.compose.ui.input.pointer.c) r4
                r13.f19809c = r4
                r12 = 6
                r13.f19808b = r3
                r5 = 0
                r12 = r5
                r6 = 0
                r8 = 2
                r9 = 0
                r7 = r13
                r12 = 0
                java.lang.Object r14 = androidx.compose.foundation.gestures.c5.g(r4, r5, r6, r7, r8, r9)
                r12 = 0
                if (r14 != r0) goto L53
                r12 = 2
                goto L78
            L53:
                r1 = r4
            L54:
                androidx.compose.ui.input.pointer.c0 r14 = (androidx.compose.ui.input.pointer.c0) r14
                androidx.compose.foundation.text.input.internal.selection.f r13 = r7.f19810d
                long r4 = r14.u()
                r12 = 1
                r13.a(r4)
                kotlin.jvm.functions.Function0<kotlin.Unit> r13 = r7.f19811e
                r12 = 6
                if (r13 == 0) goto Lb6
                r4 = r1
                r4 = r1
                r1 = r14
            L68:
                r12 = 2
                r7.f19809c = r4
                r7.f19807a = r1
                r7.f19808b = r2
                r13 = 0
                r12 = 5
                java.lang.Object r14 = androidx.compose.ui.input.pointer.c.d1(r4, r13, r7, r3, r13)
                r12 = 6
                if (r14 != r0) goto L79
            L78:
                return r0
            L79:
                r12 = 0
                androidx.compose.ui.input.pointer.q r14 = (androidx.compose.ui.input.pointer.q) r14
                java.util.List r13 = r14.e()
                r14 = r13
                java.util.Collection r14 = (java.util.Collection) r14
                int r14 = r14.size()
                r12 = 5
                r5 = 0
            L89:
                if (r5 >= r14) goto Lb0
                r12 = 2
                java.lang.Object r6 = r13.get(r5)
                r12 = 5
                androidx.compose.ui.input.pointer.c0 r6 = (androidx.compose.ui.input.pointer.c0) r6
                r12 = 5
                long r8 = r6.s()
                r12 = 5
                long r10 = r1.s()
                boolean r8 = androidx.compose.ui.input.pointer.b0.d(r8, r10)
                if (r8 == 0) goto Lac
                boolean r6 = r6.w()
                r12 = 4
                if (r6 == 0) goto Lac
                r12 = 6
                goto L68
            Lac:
                r12 = 7
                int r5 = r5 + 1
                goto L89
            Lb0:
                r12 = 7
                kotlin.jvm.functions.Function0<kotlin.Unit> r13 = r7.f19811e
                r13.invoke()
            Lb6:
                kotlin.Unit r13 = kotlin.Unit.f312394a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @Nullable
    public static final Object a(@NotNull androidx.compose.ui.input.pointer.l0 l0Var, @NotNull f fVar, @Nullable Function0<Unit> function0, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objE = e3.e(l0Var, new a(fVar, function0, null), dVar);
        return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
    }

    public static /* synthetic */ Object b(androidx.compose.ui.input.pointer.l0 l0Var, f fVar, Function0 function0, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        return a(l0Var, fVar, function0, dVar);
    }
}
