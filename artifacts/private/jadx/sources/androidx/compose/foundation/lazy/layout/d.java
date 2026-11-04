package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nAwaitFirstLayoutModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AwaitFirstLayoutModifier.kt\nandroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,55:1\n318#2,11:56\n35#3,5:67\n*S KotlinDebug\n*F\n+ 1 AwaitFirstLayoutModifier.kt\nandroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier\n*L\n37#1:56,11\n50#1:67,5\n*E\n"})
public final class d implements androidx.compose.ui.layout.p1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f17351c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f17352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<kotlin.coroutines.d<Unit>> f17353b = new ArrayList();

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", f = "AwaitFirstLayoutModifier.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160729t0}, m = "waitForFirstLayout", n = {"continuation"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f17354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f17355b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f17357d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17355b = obj;
            this.f17357d |= Integer.MIN_VALUE;
            return d.this.b(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object, kotlinx.coroutines.p] */
    @Nullable
    public final Object b(@NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        a aVar;
        kotlin.jvm.internal.i1.h hVar;
        Throwable th2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f17357d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f17357d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f17355b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f17357d;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (!this.f17352a) {
                kotlin.jvm.internal.i1.h hVar2 = new kotlin.jvm.internal.i1.h();
                try {
                    aVar.f17354a = hVar2;
                    aVar.f17357d = 1;
                    ?? pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(aVar), 1);
                    pVar.p0();
                    hVar2.f312751a = pVar;
                    this.f17353b.add(pVar);
                    Object objU = pVar.u();
                    if (objU == kotlin.coroutines.intrinsics.b.l()) {
                        kotlin.coroutines.jvm.internal.h.c(aVar);
                    }
                    if (objU == objL) {
                        return objL;
                    }
                    hVar = hVar2;
                    List<kotlin.coroutines.d<Unit>> list = this.f17353b;
                    kotlin.jvm.internal.r1.a(list).remove(hVar.f312751a);
                } catch (Throwable th3) {
                    hVar = hVar2;
                    th2 = th3;
                    List<kotlin.coroutines.d<Unit>> list2 = this.f17353b;
                    kotlin.jvm.internal.r1.a(list2).remove(hVar.f312751a);
                    throw th2;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (kotlin.jvm.internal.i1.h) aVar.f17354a;
            try {
                ResultKt.m(obj);
                List<kotlin.coroutines.d<Unit>> list3 = this.f17353b;
                kotlin.jvm.internal.r1.a(list3).remove(hVar.f312751a);
            } catch (Throwable th4) {
                th2 = th4;
                List<kotlin.coroutines.d<Unit>> list4 = this.f17353b;
                kotlin.jvm.internal.r1.a(list4).remove(hVar.f312751a);
                throw th2;
            }
        }
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.layout.p1
    public void n0(@NotNull androidx.compose.ui.layout.g0 g0Var) {
        if (this.f17352a) {
            return;
        }
        this.f17352a = true;
        List<kotlin.coroutines.d<Unit>> list = this.f17353b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            kotlin.coroutines.d<Unit> dVar = list.get(i10);
            Result.a aVar = Result.Companion;
            dVar.resumeWith(Result.m785constructorimpl(Unit.f312394a));
        }
        this.f17353b.clear();
    }
}
