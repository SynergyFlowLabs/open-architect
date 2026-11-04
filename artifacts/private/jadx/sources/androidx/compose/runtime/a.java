package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public abstract class a<T> implements i<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f35288d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f35289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList<T> f35290b = m7.d(null, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private T f35291c;

    public a(T t10) {
        this.f35289a = t10;
        this.f35291c = t10;
    }

    @Override // androidx.compose.runtime.i
    public T a() {
        return this.f35291c;
    }

    @Override // androidx.compose.runtime.i
    public final void clear() {
        m7.b(this.f35290b);
        t(this.f35289a);
        r();
    }

    @Override // androidx.compose.runtime.i
    public void n(T t10) {
        m7.n(this.f35290b, a());
        t(t10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.i
    public void o() {
        t(m7.m(this.f35290b));
    }

    public final T p() {
        return this.f35289a;
    }

    protected final void q(@NotNull List<T> list, int i10, int i11, int i12) {
        int i13 = i10 > i11 ? i11 : i11 - i12;
        if (i12 != 1) {
            List<T> listSubList = list.subList(i10, i12 + i10);
            List mutableList = CollectionsKt.toMutableList((Collection) listSubList);
            listSubList.clear();
            list.addAll(i13, mutableList);
            return;
        }
        if (i10 == i11 + 1 || i10 == i11 - 1) {
            list.set(i10, list.set(i11, list.get(i10)));
        } else {
            list.add(i13, list.remove(i10));
        }
    }

    protected abstract void r();

    protected final void s(@NotNull List<T> list, int i10, int i11) {
        if (i11 == 1) {
            list.remove(i10);
        } else {
            list.subList(i10, i11 + i10).clear();
        }
    }

    protected void t(T t10) {
        this.f35291c = t10;
    }
}
