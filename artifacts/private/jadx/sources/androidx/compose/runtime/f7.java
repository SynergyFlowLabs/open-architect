package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SourceInformationGroupDataIterator\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4061:1\n3878#2:4062\n3878#2:4063\n34#3,5:4064\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SourceInformationGroupDataIterator\n*L\n3509#1:4062\n3515#1:4063\n3522#1:4064,5\n*E\n"})
final class f7 implements Iterable<Object>, Iterator<Object>, qj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w5 f35792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f35794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f35795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final j f35796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f35797f;

    public f7(@NotNull w5 w5Var, int i10, @NotNull l2 l2Var) {
        this.f35792a = w5Var;
        int i11 = w5Var.D()[(i10 * 5) + 4];
        this.f35793b = i11;
        this.f35794c = l2Var.g();
        int iF = l2Var.f();
        if (iF <= 0) {
            int i12 = i10 + 1;
            iF = (i12 < w5Var.F() ? w5Var.D()[(i12 * 5) + 4] : w5Var.e2()) - i11;
        }
        this.f35795d = iF;
        j jVar = new j();
        ArrayList<Object> arrayListH = l2Var.h();
        if (arrayListH != null) {
            int size = arrayListH.size();
            for (int i13 = 0; i13 < size; i13++) {
                Object obj = arrayListH.get(i13);
                if (obj instanceof l2) {
                    l2 l2Var2 = (l2) obj;
                    jVar.g(l2Var2.g(), l2Var2.f());
                }
            }
        }
        this.f35796e = jVar;
        this.f35797f = jVar.d(this.f35794c);
    }

    @NotNull
    public final w5 c() {
        return this.f35792a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f35797f < this.f35795d;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Object> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    @Nullable
    public Object next() {
        int i10 = this.f35795d;
        int i11 = this.f35797f;
        Object obj = (i11 < 0 || i11 >= i10) ? null : this.f35792a.G()[this.f35793b + this.f35797f];
        this.f35797f = this.f35796e.d(this.f35797f + 1);
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
