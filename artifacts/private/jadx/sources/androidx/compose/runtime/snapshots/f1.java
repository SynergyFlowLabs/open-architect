package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSnapshotStateSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/StateSetIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,253:1\n243#1,2:254\n1#2:256\n1#2:257\n*S KotlinDebug\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/StateSetIterator\n*L\n226#1:254,2\n226#1:256\n*E\n"})
public final class f1<T> implements Iterator<T>, qj.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f36480f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SnapshotStateSet<T> f36481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Iterator<T> f36482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private T f36483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private T f36484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36485e;

    /* JADX WARN: Multi-variable type inference failed */
    public f1(@NotNull SnapshotStateSet<T> snapshotStateSet, @NotNull Iterator<? extends T> it) {
        this.f36481a = snapshotStateSet;
        this.f36482b = it;
        this.f36485e = s0.e(snapshotStateSet);
        b();
    }

    private final void b() {
        this.f36483c = this.f36484d;
        this.f36484d = this.f36482b.hasNext() ? this.f36482b.next() : null;
    }

    public static /* synthetic */ void g() {
    }

    private final <T> T i(Function0<? extends T> function0) {
        m();
        T tInvoke = function0.invoke();
        this.f36485e = s0.e(this.f36481a);
        return tInvoke;
    }

    private final void m() {
        if (s0.e(this.f36481a) != this.f36485e) {
            throw new ConcurrentModificationException();
        }
    }

    @Nullable
    public final T c() {
        return this.f36483c;
    }

    @NotNull
    public final Iterator<T> d() {
        return this.f36482b;
    }

    public final int e() {
        return this.f36485e;
    }

    @Nullable
    public final T f() {
        return this.f36484d;
    }

    @NotNull
    public final SnapshotStateSet<T> h() {
        return this.f36481a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36484d != null;
    }

    public final void j(@Nullable T t10) {
        this.f36483c = t10;
    }

    public final void k(int i10) {
        this.f36485e = i10;
    }

    public final void l(@Nullable T t10) {
        this.f36484d = t10;
    }

    @Override // java.util.Iterator
    public T next() {
        m();
        b();
        T t10 = this.f36483c;
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public void remove() {
        m();
        T t10 = this.f36483c;
        if (t10 == null) {
            throw new IllegalStateException();
        }
        this.f36481a.remove(t10);
        this.f36483c = null;
        Unit unit = Unit.f312394a;
        this.f36485e = s0.e(this.f36481a);
    }
}
