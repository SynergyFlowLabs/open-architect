package androidx.compose.foundation.layout;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class y0 implements Iterator<androidx.compose.ui.layout.z0>, qj.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f16544f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<Integer, z2, List<androidx.compose.ui.layout.z0>> f16546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<androidx.compose.ui.layout.z0> f16547c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16549e;

    /* JADX WARN: Multi-variable type inference failed */
    public y0(int i10, @NotNull Function2<? super Integer, ? super z2, ? extends List<? extends androidx.compose.ui.layout.z0>> function2) {
        this.f16545a = i10;
        this.f16546b = function2;
    }

    public static /* synthetic */ androidx.compose.ui.layout.z0 d(y0 y0Var, z2 z2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z2Var = new z2(0, 0, 0.0f, 0.0f, 15, null);
        }
        return y0Var.c(z2Var);
    }

    @NotNull
    public final List<androidx.compose.ui.layout.z0> b() {
        return this.f16547c;
    }

    @NotNull
    public final androidx.compose.ui.layout.z0 c(@NotNull z2 z2Var) {
        if (this.f16549e < b().size()) {
            androidx.compose.ui.layout.z0 z0Var = b().get(this.f16549e);
            this.f16549e++;
            return z0Var;
        }
        int i10 = this.f16548d;
        if (i10 >= this.f16545a) {
            throw new IndexOutOfBoundsException("No item returned at index call. Index: " + this.f16548d);
        }
        List<androidx.compose.ui.layout.z0> listInvoke = this.f16546b.invoke(Integer.valueOf(i10), z2Var);
        this.f16548d++;
        if (listInvoke.isEmpty()) {
            return next();
        }
        androidx.compose.ui.layout.z0 z0Var2 = (androidx.compose.ui.layout.z0) CollectionsKt.first((List) listInvoke);
        this.f16547c.addAll(listInvoke);
        this.f16549e++;
        return z0Var2;
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.layout.z0 next() {
        return d(this, null, 1, null);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f16549e < b().size() || this.f16548d < this.f16545a;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
