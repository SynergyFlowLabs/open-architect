package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nOnDemandAllocatingPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPoolKt\n*L\n1#1,103:1\n37#1:104\n37#1:105\n28#1,10:106\n37#1:126\n1557#2:116\n1628#2,2:117\n1630#2:121\n1557#2:122\n1628#2,3:123\n97#3,2:119\n*S KotlinDebug\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n*L\n31#1:104\n50#1:105\n72#1:106,10\n88#1:126\n73#1:116\n73#1:117,2\n73#1:121\n87#1:122\n87#1:123,3\n75#1:119,2\n*E\n"})
public final class p0<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f315112d = AtomicIntegerFieldUpdater.newUpdater(p0.class, "controlState$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f315113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<Integer, T> f315114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f315115c;
    private volatile /* synthetic */ int controlState$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public p0(int i10, @NotNull Function1<? super Integer, ? extends T> function1) {
        this.f315113a = i10;
        this.f315114b = function1;
        this.f315115c = new AtomicReferenceArray(i10);
    }

    private final /* synthetic */ int c() {
        return this.controlState$volatile;
    }

    private final /* synthetic */ AtomicReferenceArray e() {
        return this.f315115c;
    }

    private final boolean f(int i10) {
        return (Integer.MIN_VALUE & i10) != 0;
    }

    private final /* synthetic */ void g(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, Function1<? super Integer, Unit> function1) {
        while (true) {
            function1.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void h(int i10) {
        this.controlState$volatile = i10;
    }

    private final int j() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f315112d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & Integer.MIN_VALUE) != 0) {
                return 0;
            }
        } while (!f315112d.compareAndSet(this, i10, Integer.MIN_VALUE | i10));
        return i10;
    }

    public final boolean a() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f315112d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((Integer.MIN_VALUE & i10) != 0) {
                return false;
            }
            if (i10 >= this.f315113a) {
                return true;
            }
        } while (!f315112d.compareAndSet(this, i10, i10 + 1));
        e().set(i10, this.f315114b.invoke(Integer.valueOf(i10)));
        return true;
    }

    @NotNull
    public final List<T> b() {
        int i10;
        Object andSet;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f315112d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & Integer.MIN_VALUE) != 0) {
                i10 = 0;
                break;
            }
        } while (!f315112d.compareAndSet(this, i10, Integer.MIN_VALUE | i10));
        IntRange intRangeW1 = kotlin.ranges.r.W1(0, i10);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeW1, 10));
        Iterator<Integer> it = intRangeW1.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            do {
                andSet = e().getAndSet(iNextInt, null);
            } while (andSet == null);
            arrayList.add(andSet);
        }
        return arrayList;
    }

    @NotNull
    public final String i() {
        int i10 = f315112d.get(this);
        IntRange intRangeW1 = kotlin.ranges.r.W1(0, Integer.MAX_VALUE & i10);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeW1, 10));
        Iterator<Integer> it = intRangeW1.iterator();
        while (it.hasNext()) {
            arrayList.add(e().get(((IntIterator) it).nextInt()));
        }
        return arrayList.toString() + ((i10 & Integer.MIN_VALUE) != 0 ? "[closed]" : "");
    }

    @NotNull
    public String toString() {
        return "OnDemandAllocatingPool(" + i() + ')';
    }
}
