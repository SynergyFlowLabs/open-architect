package androidx.compose.ui.platform;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nWeakCache.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeakCache.android.kt\nandroidx/compose/ui/platform/WeakCache\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,76:1\n1107#2:77\n1085#2,2:78\n643#3,2:80\n519#3:82\n44#3:83\n*S KotlinDebug\n*F\n+ 1 WeakCache.android.kt\nandroidx/compose/ui/platform/WeakCache\n*L\n29#1:77\n29#1:78,2\n38#1:80,2\n48#1:82\n49#1:83\n*E\n"})
public final class v4<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f40916c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<Reference<T>> f40917a = new androidx.compose.runtime.collection.d<>(new Reference[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ReferenceQueue<T> f40918b = new ReferenceQueue<>();

    private final void a() {
        Reference<? extends T> referencePoll;
        do {
            referencePoll = this.f40918b.poll();
            if (referencePoll != null) {
                this.f40917a.n0(referencePoll);
            }
        } while (referencePoll != null);
    }

    public final int b() {
        a();
        return this.f40917a.R();
    }

    @Nullable
    public final T c() {
        a();
        while (this.f40917a.R() != 0) {
            androidx.compose.runtime.collection.d<Reference<T>> dVar = this.f40917a;
            T t10 = dVar.r0(dVar.R() - 1).get();
            if (t10 != null) {
                return t10;
            }
        }
        return null;
    }

    public final void d(T t10) {
        a();
        this.f40917a.d(new WeakReference(t10, this.f40918b));
    }
}
