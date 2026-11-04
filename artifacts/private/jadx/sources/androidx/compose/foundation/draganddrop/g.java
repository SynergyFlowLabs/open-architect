package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.gestures.c5;
import androidx.compose.runtime.o2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@o2
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f14153a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Function2<n, kotlin.coroutines.d<? super Unit>, Object> f14154b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f14155c = 0;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1", f = "AndroidDragAndDropSource.android.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<n, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14157b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(n nVar, n0.g gVar) {
            nVar.G(gVar.B());
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f14157b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14156a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final n nVar = (n) this.f14157b;
                Function1 function1 = new Function1() { // from class: androidx.compose.foundation.draganddrop.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return g.a.n(nVar, (n0.g) obj2);
                    }
                };
                this.f14156a = 1;
                int i11 = 2 << 0;
                if (c5.p(nVar, null, function1, null, null, this, 13, null) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(n nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    private g() {
    }

    @NotNull
    public final Function2<n, kotlin.coroutines.d<? super Unit>, Object> a() {
        return f14154b;
    }
}
