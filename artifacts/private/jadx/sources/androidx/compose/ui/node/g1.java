package androidx.compose.ui.node;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMutableVectorWithMutationTracking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,52:1\n1#2:53\n424#3,8:54\n472#3:62\n*S KotlinDebug\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n*L\n46#1:54,8\n50#1:62\n*E\n"})
public final class g1<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39761c = androidx.compose.runtime.collection.d.f35551d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<T> f39762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f39763b;

    public g1(@NotNull androidx.compose.runtime.collection.d<T> dVar, @NotNull Function0<Unit> function0) {
        this.f39762a = dVar;
        this.f39763b = function0;
    }

    public final void a(int i10, T t10) {
        this.f39762a.c(i10, t10);
        this.f39763b.invoke();
    }

    @NotNull
    public final List<T> b() {
        return h().q();
    }

    public final void c() {
        this.f39762a.r();
        this.f39763b.invoke();
    }

    public final void d(@NotNull Function1<? super T, Unit> function1) {
        androidx.compose.runtime.collection.d<T> dVarH = h();
        T[] tArr = dVarH.f35552a;
        int iR = dVarH.R();
        for (int i10 = 0; i10 < iR; i10++) {
            function1.invoke(tArr[i10]);
        }
    }

    public final T e(int i10) {
        return h().f35552a[i10];
    }

    @NotNull
    public final Function0<Unit> f() {
        return this.f39763b;
    }

    public final int g() {
        return h().R();
    }

    @NotNull
    public final androidx.compose.runtime.collection.d<T> h() {
        return this.f39762a;
    }

    public final T i(int i10) {
        T tR0 = this.f39762a.r0(i10);
        this.f39763b.invoke();
        return tR0;
    }
}
