package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.q3;
import androidx.compose.foundation.lazy.layout.j2;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResultKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,297:1\n134#2,2:298\n35#2,3:300\n39#2:307\n136#2:308\n59#3:303\n54#3:305\n59#3:309\n54#3:311\n90#4:304\n85#4:306\n90#4:310\n85#4:312\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResultKt\n*L\n280#1:298,2\n280#1:300,3\n280#1:307\n280#1:308\n282#1:303\n284#1:305\n293#1:309\n295#1:311\n282#1:304\n284#1:306\n293#1:310\n295#1:312\n*E\n"})
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final int[] f17955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final k0 f17956b;

    public static final class a implements androidx.compose.ui.layout.b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f17957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f17958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<androidx.compose.ui.layout.a, Integer> f17959c = MapsKt.emptyMap();

        a() {
        }

        public static /* synthetic */ void a() {
        }

        @Override // androidx.compose.ui.layout.b1
        public int getHeight() {
            return this.f17958b;
        }

        @Override // androidx.compose.ui.layout.b1
        public int getWidth() {
            return this.f17957a;
        }

        @Override // androidx.compose.ui.layout.b1
        public Map<androidx.compose.ui.layout.a, Integer> x() {
            return this.f17959c;
        }

        @Override // androidx.compose.ui.layout.b1
        public void y() {
        }
    }

    static {
        int[] iArr = new int[0];
        f17955a = iArr;
        f17956b = new k0(iArr, iArr, 0.0f, new a(), 0.0f, false, false, false, new v0(iArr, iArr), new w0(new j2()), androidx.compose.ui.unit.f.b(1.0f, 0.0f, 2, null), 0, CollectionsKt.emptyList(), androidx.compose.ui.unit.u.f42720b.a(), 0, 0, 0, 0, 0, kotlinx.coroutines.t0.a(kotlin.coroutines.h.f312451a), null);
    }

    @Nullable
    public static final q b(@NotNull c0 c0Var, final int i10) {
        if (c0Var.h().isEmpty()) {
            return null;
        }
        int index = ((q) CollectionsKt.first((List) c0Var.h())).getIndex();
        if (i10 > ((q) CollectionsKt.last((List) c0Var.h())).getIndex() || index > i10) {
            return null;
        }
        return (q) CollectionsKt.getOrNull(c0Var.h(), CollectionsKt.binarySearch$default(c0Var.h(), 0, 0, new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(m0.c(i10, (q) obj));
            }
        }, 3, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(int i10, q qVar) {
        return qVar.getIndex() - i10;
    }

    @NotNull
    public static final k0 d() {
        return f17956b;
    }

    public static final int e(@NotNull c0 c0Var) {
        return (int) (c0Var.getOrientation() == q3.Vertical ? c0Var.a() & com.rabbitmq.client.k0.f265952a : c0Var.a() >> 32);
    }

    public static final int f(@NotNull c0 c0Var) {
        List<q> listH = c0Var.h();
        if (listH.isEmpty()) {
            return 0;
        }
        int size = listH.size();
        int iA = 0;
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = listH.get(i10);
            iA += (int) (c0Var.getOrientation() == q3.Vertical ? qVar.a() & com.rabbitmq.client.k0.f265952a : qVar.a() >> 32);
        }
        return (iA / listH.size()) + c0Var.g();
    }
}
