package androidx.compose.foundation.lazy.layout;

import androidx.collection.b3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyLayoutPrefetchState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchMetrics\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,982:1\n683#2:983\n1#3:984\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchMetrics\n*L\n357#1:983\n357#1:984\n*E\n"})
public final class r2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f17571d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.collection.k2<Object, c> f17572a = b3.u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Object f17573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private c f17574c;

    @NotNull
    public final c a(@Nullable Object obj) {
        c cVar = this.f17574c;
        if (this.f17573b == obj && cVar != null) {
            return cVar;
        }
        androidx.collection.k2<Object, c> k2Var = this.f17572a;
        c cVarP = k2Var.p(obj);
        if (cVarP == null) {
            cVarP = new c();
            k2Var.q0(obj, cVarP);
        }
        c cVar2 = cVarP;
        this.f17573b = obj;
        this.f17574c = cVar2;
        return cVar2;
    }
}
