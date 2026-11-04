package androidx.compose.ui.scrollcapture;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n3;
import androidx.compose.ui.graphics.c3;
import androidx.compose.ui.layout.h0;
import androidx.compose.ui.semantics.x;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.t;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
@androidx.annotation.w0(31)
@SourceDebugExtension({"SMAP\nScrollCapture.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollCapture.android.kt\nandroidx/compose/ui/scrollcapture/ScrollCapture\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n85#2:233\n117#2,2:234\n1107#3:236\n1085#3,2:237\n563#4:239\n516#4:240\n44#4:241\n472#4:242\n1#5:243\n*S KotlinDebug\n*F\n+ 1 ScrollCapture.android.kt\nandroidx/compose/ui/scrollcapture/ScrollCapture\n*L\n50#1:233\n50#1:234,2\n76#1:236\n76#1:237,2\n85#1:239\n85#1:240\n85#1:241\n85#1:242\n*E\n"})
public final class k implements androidx.compose.ui.scrollcapture.c.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f41045b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n3 f41046a = d7.g(Boolean.FALSE, null, 2, null);

    /* synthetic */ class a extends kotlin.jvm.internal.a implements Function1<l, Unit> {
        a(Object obj) {
            super(1, obj, androidx.compose.runtime.collection.d.class, "add", "add(Ljava/lang/Object;)Z", 8);
        }

        public final void c(l lVar) {
            ((androidx.compose.runtime.collection.d) this.receiver).d(lVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(l lVar) {
            c(lVar);
            return Unit.f312394a;
        }
    }

    static final class b extends l0 implements Function1<l, Comparable<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f41047a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> invoke(l lVar) {
            return Integer.valueOf(lVar.b());
        }
    }

    static final class c extends l0 implements Function1<l, Comparable<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f41048a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> invoke(l lVar) {
            return Integer.valueOf(lVar.d().r());
        }
    }

    private final void e(boolean z10) {
        this.f41046a.setValue(Boolean.valueOf(z10));
    }

    @Override // androidx.compose.ui.scrollcapture.c.a
    public void a() {
        e(false);
    }

    @Override // androidx.compose.ui.scrollcapture.c.a
    public void b() {
        e(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        return ((Boolean) this.f41046a.getValue()).booleanValue();
    }

    public final void d(@NotNull View view, @NotNull x xVar, @NotNull CoroutineContext coroutineContext, @NotNull Consumer<ScrollCaptureTarget> consumer) {
        androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d(new l[16], 0);
        m.f(xVar.e(), 0, new a(dVar), 2, null);
        dVar.A0(kotlin.comparisons.a.h(b.f41047a, c.f41048a));
        l lVar = (l) (dVar.R() != 0 ? dVar.f35552a[dVar.R() - 1] : null);
        if (lVar == null) {
            return;
        }
        androidx.compose.ui.scrollcapture.c cVar = new androidx.compose.ui.scrollcapture.c(lVar.c(), lVar.d(), t0.a(coroutineContext), this, view);
        n0.j jVarB = h0.b(lVar.a());
        long jE = lVar.d().E();
        ScrollCaptureTarget scrollCaptureTargetA = j.a(view, c3.a(t.e(jVarB)), new Point(q.n(jE), q.p(jE)), h.a(cVar));
        scrollCaptureTargetA.setScrollBounds(c3.a(lVar.d()));
        consumer.accept(scrollCaptureTargetA);
    }
}
