package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.b2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@b2
final class v extends androidx.compose.ui.node.m {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private Function2<? super m, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> f14176w;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter$2", f = "LegacyDragAndDropSourceWithDefaultPainter.android.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<m, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14178b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = v.this.new a(dVar);
            aVar.f14178b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14177a;
            if (i10 == 0) {
                ResultKt.m(obj);
                m mVar = (m) this.f14178b;
                Function2<m, kotlin.coroutines.d<? super Unit>, Object> function2I9 = v.this.I9();
                this.f14177a = 1;
                if (function2I9.invoke(mVar, this) == objL) {
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
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m mVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(mVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* synthetic */ class b extends g0 implements Function1<androidx.compose.ui.draw.i, androidx.compose.ui.draw.o> {
        b(Object obj) {
            super(1, obj, e.class, "cachePicture", "cachePicture(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.draw.o invoke(androidx.compose.ui.draw.i iVar) {
            return ((e) this.receiver).c(iVar);
        }
    }

    public v(@NotNull Function2<? super m, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        this.f14176w = function2;
        final e eVar = new e();
        v9(androidx.compose.ui.draw.n.a(new b(eVar)));
        v9(new t(new Function1() { // from class: androidx.compose.foundation.draganddrop.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.H9(eVar, (androidx.compose.ui.graphics.drawscope.f) obj);
            }
        }, new a(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H9(e eVar, androidx.compose.ui.graphics.drawscope.f fVar) {
        eVar.f(fVar);
        return Unit.f312394a;
    }

    @NotNull
    public final Function2<m, kotlin.coroutines.d<? super Unit>, Object> I9() {
        return this.f14176w;
    }

    public final void J9(@NotNull Function2<? super m, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        this.f14176w = function2;
    }
}
