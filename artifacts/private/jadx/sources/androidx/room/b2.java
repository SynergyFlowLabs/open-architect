package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRoomDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1548:1\n215#2,2:1549\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase\n*L\n261#1:1549,2\n*E\n"})
public abstract class b2 {

    @NotNull
    public static final c Companion = new c(null);

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;

    @Nullable
    private androidx.room.d autoCloser;

    @NotNull
    private final Map<String, Object> backingFieldMap;
    private w3.e internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;

    @oj.f
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @Nullable
    protected List<? extends b> mCallbacks;

    @oj.f
    @Nullable
    protected volatile w3.d mDatabase;

    @NotNull
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;

    @NotNull
    private final l0 invalidationTracker = createInvalidationTracker();

    @NotNull
    private Map<Class<? extends androidx.room.migration.a>, androidx.room.migration.a> autoMigrationSpecs = new LinkedHashMap();

    @NotNull
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    @NotNull
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    @SourceDebugExtension({"SMAP\nRoomDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1548:1\n1#2:1549\n*E\n"})
    public static class a<T extends b2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Context f74653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Class<T> f74654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final String f74655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final List<b> f74656d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private f f74657e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private g f74658f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private Executor f74659g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private final List<Object> f74660h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private List<androidx.room.migration.a> f74661i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        private Executor f74662j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        private Executor f74663k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        private w3.e.c f74664l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f74665m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        private d f74666n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @Nullable
        private Intent f74667o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f74668p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f74669q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private long f74670r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        private TimeUnit f74671s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @NotNull
        private final e f74672t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @NotNull
        private Set<Integer> f74673u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Nullable
        private Set<Integer> f74674v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @Nullable
        private String f74675w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        @Nullable
        private File f74676x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        @Nullable
        private Callable<InputStream> f74677y;

        public a(@NotNull Context context, @NotNull Class<T> klass, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(klass, "klass");
            this.f74653a = context;
            this.f74654b = klass;
            this.f74655c = str;
            this.f74656d = new ArrayList();
            this.f74660h = new ArrayList();
            this.f74661i = new ArrayList();
            this.f74666n = d.AUTOMATIC;
            this.f74668p = true;
            this.f74670r = -1L;
            this.f74672t = new e();
            this.f74673u = new LinkedHashSet();
        }

        @NotNull
        public a<T> a(@NotNull androidx.room.migration.a autoMigrationSpec) {
            Intrinsics.checkNotNullParameter(autoMigrationSpec, "autoMigrationSpec");
            this.f74661i.add(autoMigrationSpec);
            return this;
        }

        @NotNull
        public a<T> b(@NotNull b callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f74656d.add(callback);
            return this;
        }

        @NotNull
        public a<T> c(@NotNull androidx.room.migration.b... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            if (this.f74674v == null) {
                this.f74674v = new HashSet();
            }
            for (androidx.room.migration.b bVar : migrations) {
                Set<Integer> set = this.f74674v;
                Intrinsics.checkNotNull(set);
                set.add(Integer.valueOf(bVar.f75010a));
                Set<Integer> set2 = this.f74674v;
                Intrinsics.checkNotNull(set2);
                set2.add(Integer.valueOf(bVar.f75011b));
            }
            this.f74672t.c((androidx.room.migration.b[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        @NotNull
        public a<T> d(@NotNull Object typeConverter) {
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            this.f74660h.add(typeConverter);
            return this;
        }

        @NotNull
        public a<T> e() {
            this.f74665m = true;
            return this;
        }

        @NotNull
        public T f() {
            w3.e.c m1Var;
            Executor executor = this.f74662j;
            if (executor == null && this.f74663k == null) {
                Executor executorG = androidx.arch.core.executor.c.g();
                this.f74663k = executorG;
                this.f74662j = executorG;
            } else if (executor != null && this.f74663k == null) {
                this.f74663k = executor;
            } else if (executor == null) {
                this.f74662j = this.f74663k;
            }
            Set<Integer> set = this.f74674v;
            if (set != null) {
                Intrinsics.checkNotNull(set);
                Iterator<Integer> it = set.iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    if (this.f74673u.contains(Integer.valueOf(iIntValue))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + iIntValue).toString());
                    }
                }
            }
            w3.e.c l2Var = this.f74664l;
            if (l2Var == null) {
                l2Var = new androidx.sqlite.db.framework.f();
            }
            if (l2Var != null) {
                if (this.f74670r > 0) {
                    if (this.f74655c == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j10 = this.f74670r;
                    TimeUnit timeUnit = this.f74671s;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Executor executor2 = this.f74662j;
                    if (executor2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    l2Var = new androidx.room.f(l2Var, new androidx.room.d(j10, timeUnit, executor2));
                }
                String str = this.f74675w;
                if (str != null || this.f74676x != null || this.f74677y != null) {
                    if (this.f74655c == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    int i10 = str == null ? 0 : 1;
                    File file = this.f74676x;
                    int i11 = file == null ? 0 : 1;
                    Callable<InputStream> callable = this.f74677y;
                    if (i10 + i11 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    l2Var = new l2(str, file, callable, l2Var);
                }
            } else {
                l2Var = null;
            }
            if (l2Var == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            g gVar = this.f74658f;
            if (gVar != null) {
                Executor executor3 = this.f74659g;
                if (executor3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (gVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                m1Var = new m1(l2Var, executor3, gVar);
            } else {
                m1Var = l2Var;
            }
            Context context = this.f74653a;
            String str2 = this.f74655c;
            e eVar = this.f74672t;
            List<b> list = this.f74656d;
            boolean z10 = this.f74665m;
            d dVarN = this.f74666n.n(context);
            Executor executor4 = this.f74662j;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor5 = this.f74663k;
            if (executor5 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            n nVar = new n(context, str2, m1Var, eVar, list, z10, dVarN, executor4, executor5, this.f74667o, this.f74668p, this.f74669q, this.f74673u, this.f74675w, this.f74676x, this.f74677y, this.f74657e, (List<? extends Object>) this.f74660h, this.f74661i);
            T t10 = (T) a2.b(this.f74654b, "_Impl");
            t10.init(nVar);
            return t10;
        }

        @NotNull
        public a<T> g(@NotNull String databaseFilePath) {
            Intrinsics.checkNotNullParameter(databaseFilePath, "databaseFilePath");
            this.f74675w = databaseFilePath;
            return this;
        }

        @e.a({"BuilderSetStyle"})
        @NotNull
        public a<T> h(@NotNull String databaseFilePath, @NotNull f callback) {
            Intrinsics.checkNotNullParameter(databaseFilePath, "databaseFilePath");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f74657e = callback;
            this.f74675w = databaseFilePath;
            return this;
        }

        @NotNull
        public a<T> i(@NotNull File databaseFile) {
            Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
            this.f74676x = databaseFile;
            return this;
        }

        @e.a({"BuilderSetStyle", "StreamFiles"})
        @NotNull
        public a<T> j(@NotNull File databaseFile, @NotNull f callback) {
            Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f74657e = callback;
            this.f74676x = databaseFile;
            return this;
        }

        @e.a({"BuilderSetStyle"})
        @NotNull
        public a<T> k(@NotNull Callable<InputStream> inputStreamCallable) {
            Intrinsics.checkNotNullParameter(inputStreamCallable, "inputStreamCallable");
            this.f74677y = inputStreamCallable;
            return this;
        }

        @e.a({"BuilderSetStyle", "LambdaLast"})
        @NotNull
        public a<T> l(@NotNull Callable<InputStream> inputStreamCallable, @NotNull f callback) {
            Intrinsics.checkNotNullParameter(inputStreamCallable, "inputStreamCallable");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f74657e = callback;
            this.f74677y = inputStreamCallable;
            return this;
        }

        @NotNull
        public a<T> m() {
            this.f74667o = this.f74655c != null ? new Intent(this.f74653a, (Class<?>) MultiInstanceInvalidationService.class) : null;
            return this;
        }

        @NotNull
        public a<T> n() {
            this.f74668p = false;
            this.f74669q = true;
            return this;
        }

        @NotNull
        public a<T> o(@NotNull int... startVersions) {
            Intrinsics.checkNotNullParameter(startVersions, "startVersions");
            for (int i10 : startVersions) {
                this.f74673u.add(Integer.valueOf(i10));
            }
            return this;
        }

        @NotNull
        public a<T> p() {
            this.f74668p = true;
            this.f74669q = true;
            return this;
        }

        @NotNull
        public a<T> q(@Nullable w3.e.c cVar) {
            this.f74664l = cVar;
            return this;
        }

        @z
        @NotNull
        public a<T> r(@androidx.annotation.g0(from = 0) long j10, @NotNull TimeUnit autoCloseTimeUnit) {
            Intrinsics.checkNotNullParameter(autoCloseTimeUnit, "autoCloseTimeUnit");
            if (j10 < 0) {
                throw new IllegalArgumentException("autoCloseTimeout must be >= 0");
            }
            this.f74670r = j10;
            this.f74671s = autoCloseTimeUnit;
            return this;
        }

        @NotNull
        public a<T> s(@NotNull d journalMode) {
            Intrinsics.checkNotNullParameter(journalMode, "journalMode");
            this.f74666n = journalMode;
            return this;
        }

        @z
        @NotNull
        public a<T> t(@NotNull Intent invalidationServiceIntent) {
            Intrinsics.checkNotNullParameter(invalidationServiceIntent, "invalidationServiceIntent");
            if (this.f74655c == null) {
                invalidationServiceIntent = null;
            }
            this.f74667o = invalidationServiceIntent;
            return this;
        }

        @NotNull
        public a<T> u(@NotNull g queryCallback, @NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.f74658f = queryCallback;
            this.f74659g = executor;
            return this;
        }

        @NotNull
        public a<T> v(@NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.f74662j = executor;
            return this;
        }

        @NotNull
        public a<T> w(@NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.f74663k = executor;
            return this;
        }
    }

    public static abstract class b {
        public void a(@NotNull w3.d db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public void b(@NotNull w3.d db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public void c(@NotNull w3.d db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean l(ActivityManager activityManager) {
            return w3.c.b.b(activityManager);
        }

        @NotNull
        public final d n(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || l(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase$MigrationContainer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1548:1\n13579#2,2:1549\n1855#3,2:1551\n361#4,7:1553\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase$MigrationContainer\n*L\n1371#1:1549,2\n1381#1:1551,2\n1387#1:1553,7\n*E\n"})
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Map<Integer, TreeMap<Integer, androidx.room.migration.b>> f74682a = new LinkedHashMap();

        private final void a(androidx.room.migration.b bVar) {
            int i10 = bVar.f75010a;
            int i11 = bVar.f75011b;
            Map<Integer, TreeMap<Integer, androidx.room.migration.b>> map = this.f74682a;
            Integer numValueOf = Integer.valueOf(i10);
            TreeMap<Integer, androidx.room.migration.b> treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(numValueOf, treeMap);
            }
            TreeMap<Integer, androidx.room.migration.b> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i11))) {
                Objects.toString(treeMap2.get(Integer.valueOf(i11)));
                bVar.toString();
            }
            treeMap2.put(Integer.valueOf(i11), bVar);
        }

        private final List<androidx.room.migration.b> f(List<androidx.room.migration.b> list, boolean z10, int i10, int i11) {
            boolean z11;
            do {
                if (z10) {
                    if (i10 >= i11) {
                        return list;
                    }
                } else if (i10 <= i11) {
                    return list;
                }
                TreeMap<Integer, androidx.room.migration.b> treeMap = this.f74682a.get(Integer.valueOf(i10));
                int i12 = 3 >> 0;
                if (treeMap != null) {
                    Iterator<Integer> it = (z10 ? treeMap.descendingKeySet() : treeMap.keySet()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z11 = false;
                            break;
                        }
                        Integer targetVersion = it.next();
                        if (!z10) {
                            Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                            int iIntValue = targetVersion.intValue();
                            if (i11 <= iIntValue && iIntValue < i10) {
                                androidx.room.migration.b bVar = treeMap.get(targetVersion);
                                Intrinsics.checkNotNull(bVar);
                                list.add(bVar);
                                i10 = targetVersion.intValue();
                                z11 = true;
                                int i13 = 2 ^ 1;
                                break;
                                break;
                            }
                        } else {
                            int i14 = i10 + 1;
                            Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                            int iIntValue2 = targetVersion.intValue();
                            if (i14 <= iIntValue2 && iIntValue2 <= i11) {
                                androidx.room.migration.b bVar2 = treeMap.get(targetVersion);
                                Intrinsics.checkNotNull(bVar2);
                                list.add(bVar2);
                                i10 = targetVersion.intValue();
                                z11 = true;
                                int i15 = 2 ^ 1;
                                break;
                            }
                        }
                    }
                } else {
                    return null;
                }
            } while (z11);
            return null;
        }

        public void b(@NotNull List<? extends androidx.room.migration.b> migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            Iterator<T> it = migrations.iterator();
            while (it.hasNext()) {
                a((androidx.room.migration.b) it.next());
            }
        }

        public void c(@NotNull androidx.room.migration.b... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (androidx.room.migration.b bVar : migrations) {
                a(bVar);
            }
        }

        public final boolean d(int i10, int i11) {
            Map<Integer, Map<Integer, androidx.room.migration.b>> mapG = g();
            if (!mapG.containsKey(Integer.valueOf(i10))) {
                return false;
            }
            Map<Integer, androidx.room.migration.b> mapEmptyMap = mapG.get(Integer.valueOf(i10));
            if (mapEmptyMap == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            return mapEmptyMap.containsKey(Integer.valueOf(i11));
        }

        @Nullable
        public List<androidx.room.migration.b> e(int i10, int i11) {
            if (i10 == i11) {
                return CollectionsKt.emptyList();
            }
            return f(new ArrayList(), i11 > i10, i10, i11);
        }

        @NotNull
        public Map<Integer, Map<Integer, androidx.room.migration.b>> g() {
            return this.f74682a;
        }
    }

    public static abstract class f {
        public void a(@NotNull w3.d db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }
    }

    public interface g {
        void a(@NotNull String str, @NotNull List<? extends Object> list);
    }

    static final class h extends kotlin.jvm.internal.l0 implements Function1<w3.d, Object> {
        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull w3.d it) {
            Intrinsics.checkNotNullParameter(it, "it");
            b2.this.a();
            return null;
        }
    }

    static final class i extends kotlin.jvm.internal.l0 implements Function1<w3.d, Object> {
        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull w3.d it) {
            Intrinsics.checkNotNullParameter(it, "it");
            b2.this.b();
            return null;
        }
    }

    public b2() {
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = mapSynchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        assertNotMainThread();
        w3.d writableDatabase = getOpenHelper().getWritableDatabase();
        getInvalidationTracker().C(writableDatabase);
        if (writableDatabase.Ge()) {
            writableDatabase.j3();
        } else {
            writableDatabase.Q1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        getOpenHelper().getWritableDatabase().Ea();
        if (inTransaction()) {
            return;
        }
        getInvalidationTracker().r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T c(Class<T> cls, w3.e eVar) {
        if (cls.isInstance(eVar)) {
            return eVar;
        }
        if (eVar instanceof p) {
            return (T) c(cls, ((p) eVar).e());
        }
        return null;
    }

    @kotlin.l(message = "Will be hidden in a future release.")
    protected static /* synthetic */ void getMCallbacks$annotations() {
    }

    @kotlin.l(message = "Will be hidden in the next release.")
    protected static /* synthetic */ void getMDatabase$annotations() {
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }

    public static /* synthetic */ Cursor query$default(b2 b2Var, w3.g gVar, CancellationSignal cancellationSignal, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i10 & 2) != 0) {
            cancellationSignal = null;
        }
        return b2Var.query(gVar, cancellationSignal);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @kotlin.l(message = "beginTransaction() is deprecated", replaceWith = @kotlin.b1(expression = "runInTransaction(Runnable)", imports = {}))
    public void beginTransaction() {
        assertNotMainThread();
        androidx.room.d dVar = this.autoCloser;
        if (dVar == null) {
            a();
        } else {
            dVar.g(new h());
        }
    }

    @androidx.annotation.m1
    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            Intrinsics.checkNotNullExpressionValue(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                getInvalidationTracker().z();
                getOpenHelper().close();
                writeLock.unlock();
            } catch (Throwable th2) {
                writeLock.unlock();
                throw th2;
            }
        }
    }

    @NotNull
    public w3.i compileStatement(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().uc(sql);
    }

    @NotNull
    protected abstract l0 createInvalidationTracker();

    @NotNull
    protected abstract w3.e createOpenHelper(@NotNull n nVar);

    @kotlin.l(message = "endTransaction() is deprecated", replaceWith = @kotlin.b1(expression = "runInTransaction(Runnable)", imports = {}))
    public void endTransaction() {
        androidx.room.d dVar = this.autoCloser;
        if (dVar == null) {
            b();
        } else {
            dVar.g(new i());
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    protected final Map<Class<? extends androidx.room.migration.a>, androidx.room.migration.a> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    @oj.o
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public List<androidx.room.migration.b> getAutoMigrations(@NotNull Map<Class<? extends androidx.room.migration.a>, androidx.room.migration.a> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return CollectionsKt.emptyList();
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    @NotNull
    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock lock = this.readWriteLock.readLock();
        Intrinsics.checkNotNullExpressionValue(lock, "readWriteLock.readLock()");
        return lock;
    }

    @NotNull
    public l0 getInvalidationTracker() {
        return this.invalidationTracker;
    }

    @NotNull
    public w3.e getOpenHelper() {
        w3.e eVar = this.internalOpenHelper;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalOpenHelper");
            eVar = null;
        }
        return eVar;
    }

    @NotNull
    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
        return null;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public Set<Class<? extends androidx.room.migration.a>> getRequiredAutoMigrationSpecs() {
        return SetsKt.emptySet();
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return MapsKt.emptyMap();
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    @NotNull
    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
        int i10 = 7 | 0;
        return null;
    }

    @Nullable
    public <T> T getTypeConverter(@NotNull Class<T> klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        return (T) this.typeConverters.get(klass);
    }

    public boolean inTransaction() {
        return getOpenHelper().getWritableDatabase().pe();
    }

    @androidx.annotation.i
    public void init(@NotNull n configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.internalOpenHelper = createOpenHelper(configuration);
        Set<Class<? extends androidx.room.migration.a>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends androidx.room.migration.a>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i10 = -1;
            if (it.hasNext()) {
                Class<? extends androidx.room.migration.a> next = it.next();
                int size = configuration.f75031s.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = size - 1;
                        if (next.isAssignableFrom(configuration.f75031s.get(size).getClass())) {
                            bitSet.set(size);
                            i10 = size;
                            break;
                        } else if (i11 < 0) {
                            break;
                        } else {
                            size = i11;
                        }
                    }
                }
                if (i10 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.autoMigrationSpecs.put(next, configuration.f75031s.get(i10));
            } else {
                int size2 = configuration.f75031s.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i12 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i12 < 0) {
                            break;
                        } else {
                            size2 = i12;
                        }
                    }
                }
                for (androidx.room.migration.b bVar : getAutoMigrations(this.autoMigrationSpecs)) {
                    if (!configuration.f75016d.d(bVar.f75010a, bVar.f75011b)) {
                        configuration.f75016d.c(bVar);
                    }
                }
                k2 k2Var = (k2) c(k2.class, getOpenHelper());
                if (k2Var != null) {
                    k2Var.d(configuration);
                }
                androidx.room.e eVar = (androidx.room.e) c(androidx.room.e.class, getOpenHelper());
                if (eVar != null) {
                    this.autoCloser = eVar.f74751b;
                    getInvalidationTracker().v(eVar.f74751b);
                }
                boolean z10 = configuration.f75019g == d.WRITE_AHEAD_LOGGING;
                getOpenHelper().setWriteAheadLoggingEnabled(z10);
                this.mCallbacks = configuration.f75017e;
                this.internalQueryExecutor = configuration.f75020h;
                this.internalTransactionExecutor = new r2(configuration.f75021i);
                this.allowMainThreadQueries = configuration.f75018f;
                this.writeAheadLoggingEnabled = z10;
                if (configuration.f75022j != null) {
                    if (configuration.f75014b == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    getInvalidationTracker().x(configuration.f75013a, configuration.f75014b, configuration.f75022j);
                }
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : requiredTypeConverters.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = configuration.f75030r.size() - 1;
                        if (size3 < 0) {
                            size3 = -1;
                            break;
                        }
                        while (true) {
                            int i13 = size3 - 1;
                            if (cls.isAssignableFrom(configuration.f75030r.get(size3).getClass())) {
                                bitSet2.set(size3);
                                break;
                            } else {
                                if (i13 < 0) {
                                    size3 = -1;
                                    break;
                                }
                                size3 = i13;
                            }
                        }
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.typeConverters.put(cls, configuration.f75030r.get(size3));
                    }
                }
                int size4 = configuration.f75030r.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i14 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + configuration.f75030r.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i14 < 0) {
                        return;
                    } else {
                        size4 = i14;
                    }
                }
            }
        }
    }

    protected void internalInitInvalidationTracker(@NotNull w3.d db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        getInvalidationTracker().o(db2);
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        Boolean boolValueOf;
        boolean zIsOpen;
        androidx.room.d dVar = this.autoCloser;
        if (dVar == null) {
            w3.d dVar2 = this.mDatabase;
            if (dVar2 != null) {
                zIsOpen = dVar2.isOpen();
            } else {
                boolValueOf = null;
            }
            return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
        }
        zIsOpen = dVar.p();
        boolValueOf = Boolean.valueOf(zIsOpen);
        return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final boolean isOpenInternal() {
        w3.d dVar = this.mDatabase;
        return dVar != null && dVar.isOpen();
    }

    @oj.j
    @NotNull
    public final Cursor query(@NotNull w3.g query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return query$default(this, query, null, 2, null);
    }

    public void runInTransaction(@NotNull Runnable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        beginTransaction();
        try {
            body.run();
            setTransactionSuccessful();
            endTransaction();
        } catch (Throwable th2) {
            endTransaction();
            throw th2;
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    protected final void setAutoMigrationSpecs(@NotNull Map<Class<? extends androidx.room.migration.a>, androidx.room.migration.a> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    @kotlin.l(message = "setTransactionSuccessful() is deprecated", replaceWith = @kotlin.b1(expression = "runInTransaction(Runnable)", imports = {}))
    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().W9();
    }

    @NotNull
    public Cursor query(@NotNull String query, @Nullable Object[] objArr) {
        Intrinsics.checkNotNullParameter(query, "query");
        return getOpenHelper().getWritableDatabase().qf(new w3.b(query, objArr));
    }

    @oj.j
    @NotNull
    public Cursor query(@NotNull w3.g query, @Nullable CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return cancellationSignal != null ? getOpenHelper().getWritableDatabase().u4(query, cancellationSignal) : getOpenHelper().getWritableDatabase().qf(query);
    }

    public <V> V runInTransaction(@NotNull Callable<V> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        beginTransaction();
        try {
            V vCall = body.call();
            setTransactionSuccessful();
            return vCall;
        } finally {
            endTransaction();
        }
    }
}
