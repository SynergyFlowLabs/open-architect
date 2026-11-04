package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.k7;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@k7
@e.a({"BanParcelableUsage"})
@SourceDebugExtension({"SMAP\nSnapshotStateSet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateSet.android.kt\nandroidx/compose/runtime/snapshots/SnapshotStateSet\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/SnapshotStateSetKt\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n2474#2:143\n2474#2:153\n2364#2,2:164\n1893#2:166\n2366#2,4:167\n2474#2:187\n2364#2,2:198\n1893#2:200\n2366#2,4:201\n2364#2,2:214\n1893#2:216\n2366#2,2:218\n2369#2:224\n2474#2:236\n2364#2,2:247\n1893#2:249\n2366#2,4:250\n2474#2:270\n2364#2,2:281\n1893#2:283\n2366#2,4:284\n2474#2:296\n137#3,6:144\n143#3:151\n112#3:152\n144#3,9:154\n108#3:163\n153#3,6:172\n137#3,6:178\n143#3:185\n112#3:186\n144#3,9:188\n108#3:197\n153#3,6:206\n162#3:212\n108#3:213\n163#3,4:220\n168#3:226\n137#3,6:227\n143#3:234\n112#3:235\n144#3,9:237\n108#3:246\n153#3,6:255\n137#3,6:261\n143#3:268\n112#3:269\n144#3,9:271\n108#3:280\n153#3,6:289\n112#3:295\n33#4:150\n33#4:184\n33#4:217\n33#4:233\n33#4:267\n1#5:171\n1#5:205\n1#5:225\n1#5:254\n1#5:288\n*S KotlinDebug\n*F\n+ 1 SnapshotStateSet.android.kt\nandroidx/compose/runtime/snapshots/SnapshotStateSet\n*L\n77#1:143\n81#1:153\n81#1:164,2\n81#1:166\n81#1:167,4\n83#1:187\n83#1:198,2\n83#1:200\n83#1:201,4\n87#1:214,2\n87#1:216\n87#1:218,2\n87#1:224\n89#1:236\n89#1:247,2\n89#1:249\n89#1:250,4\n91#1:270\n91#1:281,2\n91#1:283\n91#1:284,4\n105#1:296\n81#1:144,6\n81#1:151\n81#1:152\n81#1:154,9\n81#1:163\n81#1:172,6\n83#1:178,6\n83#1:185\n83#1:186\n83#1:188,9\n83#1:197\n83#1:206,6\n87#1:212\n87#1:213\n87#1:220,4\n87#1:226\n89#1:227,6\n89#1:234\n89#1:235\n89#1:237,9\n89#1:246\n89#1:255,6\n91#1:261,6\n91#1:268\n91#1:269\n91#1:271,9\n91#1:280\n91#1:289,6\n105#1:295\n81#1:150\n83#1:184\n87#1:217\n89#1:233\n91#1:267\n81#1:171\n83#1:205\n87#1:225\n89#1:254\n91#1:288\n*E\n"})
public final class SnapshotStateSet<T> implements Parcelable, c1, Set<T>, RandomAccess, qj.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f36439c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private e1 f36440a = s0.j(this, androidx.compose.runtime.external.kotlinx.collections.immutable.a.K());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f36438b = new b(null);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<SnapshotStateSet<Object>> CREATOR = new a();

    @SourceDebugExtension({"SMAP\nSnapshotStateSet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateSet.android.kt\nandroidx/compose/runtime/snapshots/SnapshotStateSet$Companion$CREATOR$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n1#2:143\n*E\n"})
    public static final class a implements Parcelable.ClassLoaderCreator<SnapshotStateSet<Object>> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SnapshotStateSet<Object> createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SnapshotStateSet<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            SnapshotStateSet<Object> snapshotStateSet = new SnapshotStateSet<>();
            if (classLoader == null) {
                classLoader = SnapshotStateSet.class.getClassLoader();
            }
            int i10 = parcel.readInt();
            for (int i11 = 0; i11 < i10; i11++) {
                snapshotStateSet.add(parcel.readValue(classLoader));
            }
            return snapshotStateSet;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SnapshotStateSet<Object>[] newArray(int i10) {
            return new SnapshotStateSet[i10];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void a() {
        }

        private b() {
        }
    }

    public static /* synthetic */ void k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(Collection collection, Set set) {
        return set.retainAll(CollectionsKt.toSet(collection));
    }

    @Override // androidx.compose.runtime.snapshots.c1
    @NotNull
    public e1 A() {
        return this.f36440a;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(T t10) {
        int iK;
        androidx.compose.runtime.external.kotlinx.collections.immutable.i<T> iVarL;
        m mVarF;
        boolean zB;
        do {
            synchronized (s0.f36588a) {
                e1 e1VarA = A();
                Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                g1 g1Var = (g1) b0.L((g1) e1VarA);
                iK = g1Var.k();
                iVarL = g1Var.l();
                Unit unit = Unit.f312394a;
            }
            Intrinsics.checkNotNull(iVarL);
            androidx.compose.runtime.external.kotlinx.collections.immutable.i<T> iVarAdd = iVarL.add(t10);
            if (Intrinsics.areEqual(iVarAdd, iVarL)) {
                return false;
            }
            e1 e1VarA2 = A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            g1 g1Var2 = (g1) e1VarA2;
            synchronized (b0.Q()) {
                mVarF = m.f36535e.f();
                zB = s0.b((g1) b0.A0(g1Var2, this, mVarF), iK, iVarAdd);
            }
            b0.c0(mVarF, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends T> collection) {
        int iK;
        androidx.compose.runtime.external.kotlinx.collections.immutable.i<T> iVarL;
        m mVarF;
        boolean zB;
        do {
            synchronized (s0.f36588a) {
                try {
                    e1 e1VarA = A();
                    Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                    g1 g1Var = (g1) b0.L((g1) e1VarA);
                    iK = g1Var.k();
                    iVarL = g1Var.l();
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Intrinsics.checkNotNull(iVarL);
            androidx.compose.runtime.external.kotlinx.collections.immutable.i<T> iVarAddAll = iVarL.addAll(collection);
            if (Intrinsics.areEqual(iVarAddAll, iVarL)) {
                return false;
            }
            e1 e1VarA2 = A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            g1 g1Var2 = (g1) e1VarA2;
            synchronized (b0.Q()) {
                mVarF = m.f36535e.f();
                zB = s0.b((g1) b0.A0(g1Var2, this, mVarF), iK, iVarAddAll);
            }
            b0.c0(mVarF, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        m mVarF;
        e1 e1VarA = A();
        Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
        g1 g1Var = (g1) e1VarA;
        synchronized (b0.Q()) {
            try {
                mVarF = m.f36535e.f();
                g1 g1Var2 = (g1) b0.A0(g1Var, this, mVarF);
                synchronized (s0.f36588a) {
                    try {
                        g1Var2.n(androidx.compose.runtime.external.kotlinx.collections.immutable.a.K());
                        g1Var2.m(g1Var2.k() + 1);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        b0.c0(mVarF, this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return s0.f(this).l().contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        return s0.f(this).l().containsAll(collection);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @oj.i(name = "getDebuggerDisplayValue")
    @NotNull
    public final Set<T> i() {
        e1 e1VarA = A();
        Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
        return ((g1) b0.L((g1) e1VarA)).l();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return s0.f(this).l().isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new f1(this, s0.f(this).l().iterator());
    }

    public int l() {
        return s0.f(this).l().size();
    }

    @NotNull
    public final Set<T> n() {
        return s0.f(this).l();
    }

    @Override // androidx.compose.runtime.snapshots.c1
    public void p(@NotNull e1 e1Var) {
        e1Var.i(A());
        Intrinsics.checkNotNull(e1Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        this.f36440a = (g1) e1Var;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        int iK;
        androidx.compose.runtime.external.kotlinx.collections.immutable.i<T> iVarL;
        m mVarF;
        boolean zB;
        do {
            synchronized (s0.f36588a) {
                try {
                    e1 e1VarA = A();
                    Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                    g1 g1Var = (g1) b0.L((g1) e1VarA);
                    iK = g1Var.k();
                    iVarL = g1Var.l();
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Intrinsics.checkNotNull(iVarL);
            androidx.compose.runtime.external.kotlinx.collections.immutable.i<T> iVarRemove = iVarL.remove(obj);
            if (Intrinsics.areEqual(iVarRemove, iVarL)) {
                return false;
            }
            e1 e1VarA2 = A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            g1 g1Var2 = (g1) e1VarA2;
            synchronized (b0.Q()) {
                try {
                    mVarF = m.f36535e.f();
                    zB = s0.b((g1) b0.A0(g1Var2, this, mVarF), iK, iVarRemove);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            b0.c0(mVarF, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@NotNull Collection<?> collection) {
        int iK;
        androidx.compose.runtime.external.kotlinx.collections.immutable.i<T> iVarL;
        m mVarF;
        boolean zB;
        do {
            synchronized (s0.f36588a) {
                try {
                    e1 e1VarA = A();
                    Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                    g1 g1Var = (g1) b0.L((g1) e1VarA);
                    iK = g1Var.k();
                    iVarL = g1Var.l();
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Intrinsics.checkNotNull(iVarL);
            androidx.compose.runtime.external.kotlinx.collections.immutable.i<T> iVarRemoveAll = iVarL.removeAll((Collection<? extends T>) collection);
            if (Intrinsics.areEqual(iVarRemoveAll, iVarL)) {
                return false;
            }
            e1 e1VarA2 = A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            g1 g1Var2 = (g1) e1VarA2;
            synchronized (b0.Q()) {
                mVarF = m.f36535e.f();
                zB = s0.b((g1) b0.A0(g1Var2, this, mVarF), iK, iVarRemoveAll);
            }
            b0.c0(mVarF, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@NotNull final Collection<?> collection) {
        return s0.i(this, new Function1() { // from class: androidx.compose.runtime.snapshots.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SnapshotStateSet.m(collection, (Set) obj));
            }
        });
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return l();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    @NotNull
    public String toString() {
        e1 e1VarA = A();
        Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return "SnapshotStateSet(value=" + ((g1) b0.L((g1) e1VarA)).l() + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        Set<T> setN = n();
        parcel.writeInt(size());
        Iterator<T> it = setN.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.v.b(this, tArr);
    }
}
