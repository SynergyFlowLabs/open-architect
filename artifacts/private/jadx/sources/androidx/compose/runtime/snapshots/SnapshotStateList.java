package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.f4;
import androidx.compose.runtime.k7;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@k7
@e.a({"BanParcelableUsage"})
@SourceDebugExtension({"SMAP\nSnapshotStateList.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.android.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 4 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateListKt\n+ 5 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,188:1\n34#2,4:189\n2474#3:193\n2474#3:206\n2364#3,2:217\n1893#3:219\n2366#3,4:220\n2474#3:245\n2364#3,2:256\n1893#3:258\n2366#3,4:259\n2474#3:283\n2364#3,2:294\n1893#3:296\n2366#3,4:297\n2364#3,2:310\n1893#3:312\n2366#3,2:314\n2369#3:321\n2474#3:336\n2364#3,2:347\n1893#3:349\n2366#3,4:350\n2474#3:373\n2364#3,2:384\n1893#3:386\n2366#3,4:387\n2474#3:413\n2364#3,2:424\n1893#3:426\n2366#3,4:427\n2474#3:450\n2364#3,2:461\n1893#3:463\n2366#3,4:464\n2474#3:484\n2364#3,2:495\n1893#3:497\n2366#3,4:498\n2474#3:514\n2364#3,2:525\n1893#3:527\n2366#3,4:528\n2474#3:537\n160#4,9:194\n169#4:204\n115#4:205\n170#4,9:207\n111#4:216\n179#4,6:225\n142#4,5:231\n163#4,6:236\n169#4:243\n115#4:244\n170#4,9:246\n111#4:255\n179#4,6:264\n147#4:270\n160#4,9:271\n169#4:281\n115#4:282\n170#4,9:284\n111#4:293\n179#4,6:302\n151#4:308\n111#4:309\n152#4,5:316\n158#4:323\n160#4,9:324\n169#4:334\n115#4:335\n170#4,9:337\n111#4:346\n179#4,6:355\n160#4,9:361\n169#4:371\n115#4:372\n170#4,9:374\n111#4:383\n179#4,6:392\n142#4,5:399\n163#4,6:404\n169#4:411\n115#4:412\n170#4,9:414\n111#4:423\n179#4,6:432\n147#4:438\n146#4:440\n163#4,6:441\n169#4:448\n115#4:449\n170#4,9:451\n111#4:460\n179#4,6:469\n147#4:475\n121#4,5:476\n126#4:482\n115#4:483\n127#4,9:485\n111#4:494\n137#4,3:503\n121#4,5:506\n126#4:512\n115#4:513\n127#4,9:515\n111#4:524\n137#4,3:533\n115#4:536\n33#5:203\n33#5:242\n33#5:280\n33#5:313\n33#5:333\n33#5:370\n33#5:410\n33#5:447\n33#5:481\n33#5:511\n1#6:224\n1#6:263\n1#6:301\n1#6:322\n1#6:354\n1#6:391\n1#6:398\n1#6:431\n1#6:439\n1#6:468\n1#6:502\n1#6:532\n1#6:538\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.android.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n*L\n95#1:189,4\n103#1:193\n107#1:206\n107#1:217,2\n107#1:219\n107#1:220,4\n109#1:245\n109#1:256,2\n109#1:258\n109#1:259,4\n115#1:283\n115#1:294,2\n115#1:296\n115#1:297,4\n119#1:310,2\n119#1:312\n119#1:314,2\n119#1:321\n121#1:336\n121#1:347,2\n121#1:349\n121#1:350,4\n123#1:373\n123#1:384,2\n123#1:386\n123#1:387,4\n127#1:413\n127#1:424,2\n127#1:426\n127#1:427,4\n134#1:450\n134#1:461,2\n134#1:463\n134#1:464,4\n137#1:484\n137#1:495,2\n137#1:497\n137#1:498,4\n142#1:514\n142#1:525,2\n142#1:527\n142#1:528,4\n152#1:537\n107#1:194,9\n107#1:204\n107#1:205\n107#1:207,9\n107#1:216\n107#1:225,6\n109#1:231,5\n109#1:236,6\n109#1:243\n109#1:244\n109#1:246,9\n109#1:255\n109#1:264,6\n109#1:270\n115#1:271,9\n115#1:281\n115#1:282\n115#1:284,9\n115#1:293\n115#1:302,6\n119#1:308\n119#1:309\n119#1:316,5\n119#1:323\n121#1:324,9\n121#1:334\n121#1:335\n121#1:337,9\n121#1:346\n121#1:355,6\n123#1:361,9\n123#1:371\n123#1:372\n123#1:374,9\n123#1:383\n123#1:392,6\n127#1:399,5\n127#1:404,6\n127#1:411\n127#1:412\n127#1:414,9\n127#1:423\n127#1:432,6\n127#1:438\n134#1:440\n134#1:441,6\n134#1:448\n134#1:449\n134#1:451,9\n134#1:460\n134#1:469,6\n134#1:475\n137#1:476,5\n137#1:482\n137#1:483\n137#1:485,9\n137#1:494\n137#1:503,3\n142#1:506,5\n142#1:512\n142#1:513\n142#1:515,9\n142#1:524\n142#1:533,3\n152#1:536\n107#1:203\n109#1:242\n115#1:280\n119#1:313\n121#1:333\n123#1:370\n127#1:410\n134#1:447\n137#1:481\n142#1:511\n107#1:224\n109#1:263\n115#1:301\n119#1:322\n121#1:354\n123#1:391\n127#1:431\n134#1:468\n137#1:502\n142#1:532\n*E\n"})
public final class SnapshotStateList<T> implements Parcelable, c1, List<T>, RandomAccess, qj.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f36436c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private e1 f36437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f36435b = new b(null);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new a();

    public static final class a implements Parcelable.ClassLoaderCreator<SnapshotStateList<Object>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object d(Parcel parcel, ClassLoader classLoader, int i10) {
            return parcel.readValue(classLoader);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SnapshotStateList<Object> createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SnapshotStateList<Object> createFromParcel(final Parcel parcel, final ClassLoader classLoader) {
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            return k0.a(parcel.readInt(), new Function1() { // from class: androidx.compose.runtime.snapshots.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SnapshotStateList.a.d(parcel, classLoader, ((Integer) obj).intValue());
                }
            });
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SnapshotStateList<Object>[] newArray(int i10) {
            return new SnapshotStateList[i10];
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

    public SnapshotStateList(@NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVar) {
        this.f36437a = k0.q(this, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(int i10, Collection collection, List list) {
        return list.addAll(i10, collection);
    }

    public static /* synthetic */ void m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w(Collection collection, List list) {
        return list.retainAll(collection);
    }

    @Override // androidx.compose.runtime.snapshots.c1
    @NotNull
    public e1 A() {
        return this.f36437a;
    }

    public final int B(@NotNull Collection<? extends T> collection, int i10, int i11) {
        int iL;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVarK;
        m mVarF;
        boolean zF;
        int size = size();
        do {
            synchronized (k0.f36525a) {
                e1 e1VarA = A();
                Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                x0 x0Var = (x0) b0.L((x0) e1VarA);
                iL = x0Var.l();
                gVarK = x0Var.k();
                Unit unit = Unit.f312394a;
            }
            Intrinsics.checkNotNull(gVarK);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g.a<T> aVarBuilder = gVarK.builder();
            aVarBuilder.subList(i10, i11).retainAll(collection);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVarBuild = aVarBuilder.build();
            if (Intrinsics.areEqual(gVarBuild, gVarK)) {
                break;
            }
            e1 e1VarA2 = A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            x0 x0Var2 = (x0) e1VarA2;
            synchronized (b0.Q()) {
                try {
                    mVarF = m.f36535e.f();
                    zF = k0.f((x0) b0.A0(x0Var2, this, mVarF), iL, gVarBuild, true);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            b0.c0(mVarF, this);
        } while (!zF);
        return size - size();
    }

    @NotNull
    public final List<T> C() {
        return k0.j(this).k();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t10) {
        int iL;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVarK;
        m mVarF;
        boolean zF;
        do {
            synchronized (k0.f36525a) {
                try {
                    e1 e1VarA = A();
                    Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                    x0 x0Var = (x0) b0.L((x0) e1VarA);
                    iL = x0Var.l();
                    gVarK = x0Var.k();
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Intrinsics.checkNotNull(gVarK);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVarAdd = gVarK.add(t10);
            if (Intrinsics.areEqual(gVarAdd, gVarK)) {
                return false;
            }
            e1 e1VarA2 = A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            x0 x0Var2 = (x0) e1VarA2;
            synchronized (b0.Q()) {
                try {
                    mVarF = m.f36535e.f();
                    zF = k0.f((x0) b0.A0(x0Var2, this, mVarF), iL, gVarAdd, true);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            b0.c0(mVarF, this);
        } while (!zF);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(final int i10, @NotNull final Collection<? extends T> collection) {
        return k0.p(this, new Function1() { // from class: androidx.compose.runtime.snapshots.i0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SnapshotStateList.k(i10, collection, (List) obj));
            }
        });
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        m mVarF;
        e1 e1VarA = A();
        Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        x0 x0Var = (x0) e1VarA;
        synchronized (b0.Q()) {
            mVarF = m.f36535e.f();
            x0 x0Var2 = (x0) b0.A0(x0Var, this, mVarF);
            synchronized (k0.f36525a) {
                x0Var2.n(androidx.compose.runtime.external.kotlinx.collections.immutable.a.G());
                x0Var2.o(x0Var2.l() + 1);
                x0Var2.p(x0Var2.m() + 1);
            }
        }
        b0.c0(mVarF, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return k0.j(this).k().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        return k0.j(this).k().containsAll(collection);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public T get(int i10) {
        return k0.j(this).k().get(i10);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return k0.j(this).k().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return k0.j(this).k().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return listIterator();
    }

    @oj.i(name = "getDebuggerDisplayValue")
    @NotNull
    public final List<T> l() {
        e1 e1VarA = A();
        Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((x0) b0.L((x0) e1VarA)).k();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return k0.j(this).k().lastIndexOf(obj);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        return new w0(this, 0);
    }

    public int n() {
        return k0.j(this).k().size();
    }

    @Override // androidx.compose.runtime.snapshots.c1
    public void p(@NotNull e1 e1Var) {
        e1Var.i(A());
        Intrinsics.checkNotNull(e1Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.f36437a = (x0) e1Var;
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i10) {
        return u(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@NotNull Collection<?> collection) {
        int iL;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVarK;
        m mVarF;
        boolean zF;
        do {
            synchronized (k0.f36525a) {
                try {
                    e1 e1VarA = A();
                    Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                    x0 x0Var = (x0) b0.L((x0) e1VarA);
                    iL = x0Var.l();
                    gVarK = x0Var.k();
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Intrinsics.checkNotNull(gVarK);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVarRemoveAll = gVarK.removeAll((Collection<? extends T>) collection);
            if (Intrinsics.areEqual(gVarRemoveAll, gVarK)) {
                return false;
            }
            e1 e1VarA2 = A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            x0 x0Var2 = (x0) e1VarA2;
            synchronized (b0.Q()) {
                mVarF = m.f36535e.f();
                zF = k0.f((x0) b0.A0(x0Var2, this, mVarF), iL, gVarRemoveAll, true);
            }
            b0.c0(mVarF, this);
        } while (!zF);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@NotNull final Collection<?> collection) {
        return k0.p(this, new Function1() { // from class: androidx.compose.runtime.snapshots.h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SnapshotStateList.w(collection, (List) obj));
            }
        });
    }

    @Override // java.util.List
    public T set(int i10, T t10) {
        int iL;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVarK;
        m mVarF;
        boolean zF;
        T t11 = get(i10);
        do {
            synchronized (k0.f36525a) {
                try {
                    e1 e1VarA = A();
                    Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                    x0 x0Var = (x0) b0.L((x0) e1VarA);
                    iL = x0Var.l();
                    gVarK = x0Var.k();
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Intrinsics.checkNotNull(gVarK);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVar = gVarK.set(i10, t10);
            if (Intrinsics.areEqual(gVar, gVarK)) {
                return t11;
            }
            e1 e1VarA2 = A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            x0 x0Var2 = (x0) e1VarA2;
            synchronized (b0.Q()) {
                try {
                    mVarF = m.f36535e.f();
                    zF = k0.f((x0) b0.A0(x0Var2, this, mVarF), iL, gVar, false);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            b0.c0(mVarF, this);
        } while (!zF);
        return t11;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return n();
    }

    @Override // java.util.List
    @NotNull
    public List<T> subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= size())) {
            f4.d("fromIndex or toIndex are out of bounds");
        }
        return new h1(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    @NotNull
    public String toString() {
        e1 e1VarA = A();
        Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((x0) b0.L((x0) e1VarA)).k() + ")@" + hashCode();
    }

    public T u(int i10) {
        int iL;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVarK;
        m mVarF;
        boolean zF;
        T t10 = get(i10);
        do {
            synchronized (k0.f36525a) {
                e1 e1VarA = A();
                Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                x0 x0Var = (x0) b0.L((x0) e1VarA);
                iL = x0Var.l();
                gVarK = x0Var.k();
                Unit unit = Unit.f312394a;
            }
            Intrinsics.checkNotNull(gVarK);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVarL3 = gVarK.l3(i10);
            if (Intrinsics.areEqual(gVarL3, gVarK)) {
                return t10;
            }
            e1 e1VarA2 = A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            x0 x0Var2 = (x0) e1VarA2;
            synchronized (b0.Q()) {
                try {
                    mVarF = m.f36535e.f();
                    zF = k0.f((x0) b0.A0(x0Var2, this, mVarF), iL, gVarL3, true);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            b0.c0(mVarF, this);
        } while (!zF);
        return t10;
    }

    public final void v(int i10, int i11) {
        int iL;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVarK;
        m mVarF;
        boolean zF;
        do {
            synchronized (k0.f36525a) {
                try {
                    e1 e1VarA = A();
                    Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                    x0 x0Var = (x0) b0.L((x0) e1VarA);
                    iL = x0Var.l();
                    gVarK = x0Var.k();
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Intrinsics.checkNotNull(gVarK);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g.a<T> aVarBuilder = gVarK.builder();
            aVarBuilder.subList(i10, i11).clear();
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVarBuild = aVarBuilder.build();
            if (Intrinsics.areEqual(gVarBuild, gVarK)) {
                break;
            }
            e1 e1VarA2 = A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            x0 x0Var2 = (x0) e1VarA2;
            synchronized (b0.Q()) {
                mVarF = m.f36535e.f();
                zF = k0.f((x0) b0.A0(x0Var2, this, mVarF), iL, gVarBuild, true);
            }
            b0.c0(mVarF, this);
        } while (!zF);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        List<T> listC = C();
        int size = listC.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeValue(listC.get(i11));
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends T> collection) {
        int iL;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVarK;
        m mVarF;
        boolean zF;
        do {
            synchronized (k0.f36525a) {
                e1 e1VarA = A();
                Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                x0 x0Var = (x0) b0.L((x0) e1VarA);
                iL = x0Var.l();
                gVarK = x0Var.k();
                Unit unit = Unit.f312394a;
            }
            Intrinsics.checkNotNull(gVarK);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVarAddAll = gVarK.addAll(collection);
            if (Intrinsics.areEqual(gVarAddAll, gVarK)) {
                return false;
            }
            e1 e1VarA2 = A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            x0 x0Var2 = (x0) e1VarA2;
            synchronized (b0.Q()) {
                mVarF = m.f36535e.f();
                zF = k0.f((x0) b0.A0(x0Var2, this, mVarF), iL, gVarAddAll, true);
            }
            b0.c0(mVarF, this);
        } while (!zF);
        return true;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator(int i10) {
        return new w0(this, i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int iL;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVarK;
        m mVarF;
        boolean zF;
        do {
            synchronized (k0.f36525a) {
                e1 e1VarA = A();
                Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                x0 x0Var = (x0) b0.L((x0) e1VarA);
                iL = x0Var.l();
                gVarK = x0Var.k();
                Unit unit = Unit.f312394a;
            }
            Intrinsics.checkNotNull(gVarK);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVarRemove = gVarK.remove(obj);
            if (Intrinsics.areEqual(gVarRemove, gVarK)) {
                return false;
            }
            e1 e1VarA2 = A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            x0 x0Var2 = (x0) e1VarA2;
            synchronized (b0.Q()) {
                mVarF = m.f36535e.f();
                zF = k0.f((x0) b0.A0(x0Var2, this, mVarF), iL, gVarRemove, true);
            }
            b0.c0(mVarF, this);
        } while (!zF);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.v.b(this, tArr);
    }

    public SnapshotStateList() {
        this(androidx.compose.runtime.external.kotlinx.collections.immutable.a.G());
    }

    @Override // java.util.List
    public void add(int i10, T t10) {
        int iL;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVarK;
        m mVarF;
        boolean zF;
        do {
            synchronized (k0.f36525a) {
                try {
                    e1 e1VarA = A();
                    Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                    x0 x0Var = (x0) b0.L((x0) e1VarA);
                    iL = x0Var.l();
                    gVarK = x0Var.k();
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Intrinsics.checkNotNull(gVarK);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVarAdd = gVarK.add(i10, t10);
            if (Intrinsics.areEqual(gVarAdd, gVarK)) {
                return;
            }
            e1 e1VarA2 = A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            x0 x0Var2 = (x0) e1VarA2;
            synchronized (b0.Q()) {
                mVarF = m.f36535e.f();
                zF = k0.f((x0) b0.A0(x0Var2, this, mVarF), iL, gVarAdd, true);
            }
            b0.c0(mVarF, this);
        } while (!zF);
    }
}
