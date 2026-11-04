package androidx.compose.runtime;

import java.util.Iterator;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/DataIterator\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4061:1\n3878#2:4062\n3878#2:4063\n1#3:4064\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/DataIterator\n*L\n3491#1:4062\n3493#1:4063\n*E\n"})
final class m1 implements Iterable<Object>, Iterator<Object>, qj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w5 f36251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36254d;

    public m1(@NotNull w5 w5Var, int i10) {
        this.f36251a = w5Var;
        int i11 = w5Var.D()[(i10 * 5) + 4];
        this.f36252b = i11;
        int i12 = i10 + 1;
        this.f36253c = i12 < w5Var.F() ? w5Var.D()[(i12 * 5) + 4] : w5Var.e2();
        this.f36254d = i11;
    }

    public final int c() {
        return this.f36253c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36254d < this.f36253c;
    }

    public final int i() {
        return this.f36254d;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Object> iterator() {
        return this;
    }

    public final int k() {
        return this.f36252b;
    }

    @NotNull
    public final w5 l() {
        return this.f36251a;
    }

    public final void m(int i10) {
        this.f36254d = i10;
    }

    @Override // java.util.Iterator
    @Nullable
    public Object next() {
        int i10 = this.f36254d;
        Object obj = (i10 < 0 || i10 >= this.f36251a.G().length) ? null : this.f36251a.G()[this.f36254d];
        this.f36254d++;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
