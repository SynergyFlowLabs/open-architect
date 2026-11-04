package androidx.room;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,840:1\n215#2,2:841\n11335#3:843\n11670#3,3:844\n13579#3,2:847\n13579#3,2:849\n13674#3,3:855\n37#4,2:851\n1855#5,2:853\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker\n*L\n102#1:841,2\n250#1:843\n250#1:844,3\n271#1:847,2\n287#1:849,2\n491#1:855,3\n294#1:851,2\n467#1:853,2\n*E\n"})
public class l0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final a f74959q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private static final String[] f74960r = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final String f74961s = "room_table_modification_log";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private static final String f74962t = "table_id";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private static final String f74963u = "invalidated";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private static final String f74964v = "CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final String f74965w = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public static final String f74966x = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b2 f74967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f74968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, Set<String>> f74969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<String, Integer> f74970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String[] f74971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private androidx.room.d f74972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @NotNull
    private final AtomicBoolean f74973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f74974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private volatile w3.i f74975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final b f74976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final j0 f74977k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.b0("observerMap")
    @NotNull
    private final androidx.arch.core.internal.b<c, d> f74978l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private r0 f74979m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final Object f74980n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final Object f74981o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @oj.f
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @NotNull
    public final Runnable f74982p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @androidx.annotation.l1
        public static /* synthetic */ void b() {
        }

        @androidx.annotation.l1
        public static /* synthetic */ void c() {
        }

        public final void a(@NotNull w3.d database) {
            Intrinsics.checkNotNullParameter(database, "database");
            if (database.Ge()) {
                database.j3();
            } else {
                database.Q1();
            }
        }

        @NotNull
        public final String d(@NotNull String tableName, @NotNull String triggerType) {
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            Intrinsics.checkNotNullParameter(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObservedTableTracker\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,840:1\n13600#2,2:841\n13600#2,2:843\n13684#2,3:845\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObservedTableTracker\n*L\n711#1:841,2\n729#1:843,2\n765#1:845,3\n*E\n"})
    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final a f74983e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f74984f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f74985g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f74986h = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final long[] f74987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final boolean[] f74988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final int[] f74989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f74990d;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(int i10) {
            this.f74987a = new long[i10];
            this.f74988b = new boolean[i10];
            this.f74989c = new int[i10];
        }

        public final boolean a() {
            return this.f74990d;
        }

        @NotNull
        public final long[] b() {
            return this.f74987a;
        }

        @androidx.annotation.l1
        @oj.i(name = "getTablesToSync")
        @Nullable
        public final int[] c() {
            synchronized (this) {
                try {
                    if (!this.f74990d) {
                        return null;
                    }
                    long[] jArr = this.f74987a;
                    int length = jArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        int i12 = i11 + 1;
                        int i13 = 1;
                        boolean z10 = jArr[i10] > 0;
                        boolean[] zArr = this.f74988b;
                        if (z10 != zArr[i11]) {
                            int[] iArr = this.f74989c;
                            if (!z10) {
                                i13 = 2;
                            }
                            iArr[i11] = i13;
                        } else {
                            this.f74989c[i11] = 0;
                        }
                        zArr[i11] = z10;
                        i10++;
                        i11 = i12;
                    }
                    this.f74990d = false;
                    return (int[]) this.f74989c.clone();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final boolean d(@NotNull int... tableIds) {
            boolean z10;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : tableIds) {
                        long[] jArr = this.f74987a;
                        long j10 = jArr[i10];
                        jArr[i10] = 1 + j10;
                        if (j10 == 0) {
                            z10 = true;
                            this.f74990d = true;
                        }
                    }
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z10;
        }

        public final boolean e(@NotNull int... tableIds) {
            boolean z10;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : tableIds) {
                        long[] jArr = this.f74987a;
                        long j10 = jArr[i10];
                        jArr[i10] = j10 - 1;
                        if (j10 == 1) {
                            z10 = true;
                            this.f74990d = true;
                        }
                    }
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z10;
        }

        public final void f() {
            synchronized (this) {
                try {
                    Arrays.fill(this.f74988b, false);
                    this.f74990d = true;
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void g(boolean z10) {
            this.f74990d = z10;
        }
    }

    @SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$Observer\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,840:1\n37#2,2:841\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$Observer\n*L\n670#1:841,2\n*E\n"})
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String[] f74991a;

        public c(@NotNull String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            this.f74991a = tables;
        }

        @NotNull
        public final String[] a() {
            return this.f74991a;
        }

        public boolean b() {
            return false;
        }

        public abstract void c(@NotNull Set<String> set);

        /* JADX WARN: Illegal instructions before constructor call */
        protected c(@NotNull String firstTable, @NotNull String... rest) {
            Intrinsics.checkNotNullParameter(firstTable, "firstTable");
            Intrinsics.checkNotNullParameter(rest, "rest");
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            CollectionsKt.addAll(listCreateListBuilder, rest);
            listCreateListBuilder.add(firstTable);
            this((String[]) CollectionsKt.build(listCreateListBuilder).toArray(new String[0]));
        }
    }

    @SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObserverWrapper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,840:1\n13674#2,3:841\n12744#2,2:844\n13579#2:846\n13579#2,2:847\n13580#2:849\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObserverWrapper\n*L\n612#1:841,3\n634#1:844,2\n640#1:846\n641#1:847,2\n640#1:849\n*E\n"})
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final c f74992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final int[] f74993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final String[] f74994c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final Set<String> f74995d;

        public d(@NotNull c observer, @NotNull int[] tableIds, @NotNull String[] tableNames) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            Intrinsics.checkNotNullParameter(tableNames, "tableNames");
            this.f74992a = observer;
            this.f74993b = tableIds;
            this.f74994c = tableNames;
            this.f74995d = !(tableNames.length == 0) ? SetsKt.setOf(tableNames[0]) : SetsKt.emptySet();
            if (tableIds.length != tableNames.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        @NotNull
        public final c a() {
            return this.f74992a;
        }

        @NotNull
        public final int[] b() {
            return this.f74993b;
        }

        public final void c(@NotNull Set<Integer> invalidatedTablesIds) {
            Set<String> setEmptySet;
            Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.f74993b;
            int length = iArr.length;
            if (length != 0) {
                int i10 = 0;
                if (length != 1) {
                    Set setCreateSetBuilder = SetsKt.createSetBuilder();
                    int[] iArr2 = this.f74993b;
                    int length2 = iArr2.length;
                    int i11 = 0;
                    while (i10 < length2) {
                        int i12 = i11 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i10]))) {
                            setCreateSetBuilder.add(this.f74994c[i11]);
                        }
                        i10++;
                        i11 = i12;
                    }
                    setEmptySet = SetsKt.build(setCreateSetBuilder);
                } else {
                    setEmptySet = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.f74995d : SetsKt.emptySet();
                }
            } else {
                setEmptySet = SetsKt.emptySet();
            }
            if (!setEmptySet.isEmpty()) {
                this.f74992a.c(setEmptySet);
            }
        }

        public final void d(@NotNull String[] tables) {
            Set<String> setEmptySet;
            Intrinsics.checkNotNullParameter(tables, "tables");
            int length = this.f74994c.length;
            if (length == 0) {
                setEmptySet = SetsKt.emptySet();
            } else if (length == 1) {
                int length2 = tables.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        setEmptySet = SetsKt.emptySet();
                        break;
                    } else {
                        if (StringsKt.N1(tables[i10], this.f74994c[0], true)) {
                            setEmptySet = this.f74995d;
                            break;
                        }
                        i10++;
                    }
                }
            } else {
                Set setCreateSetBuilder = SetsKt.createSetBuilder();
                for (String str : tables) {
                    for (String str2 : this.f74994c) {
                        if (StringsKt.N1(str2, str, true)) {
                            setCreateSetBuilder.add(str2);
                        }
                    }
                }
                setEmptySet = SetsKt.build(setCreateSetBuilder);
            }
            if (setEmptySet.isEmpty()) {
                return;
            }
            this.f74992a.c(setEmptySet);
        }
    }

    public static final class e extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final l0 f74996b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final WeakReference<c> f74997c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull l0 tracker, @NotNull c delegate) {
            super(delegate.a());
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f74996b = tracker;
            this.f74997c = new WeakReference<>(delegate);
        }

        @Override // androidx.room.l0.c
        public void c(@NotNull Set<String> tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            c cVar = this.f74997c.get();
            if (cVar == null) {
                this.f74996b.t(this);
            } else {
                cVar.c(tables);
            }
        }

        @NotNull
        public final WeakReference<c> d() {
            return this.f74997c;
        }

        @NotNull
        public final l0 e() {
            return this.f74996b;
        }
    }

    @SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$refreshRunnable$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n1#1,840:1\n1855#2,2:841\n145#3,7:843\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$refreshRunnable$1\n*L\n399#1:841,2\n408#1:843,7\n*E\n"})
    public static final class f implements Runnable {
        f() {
        }

        private final Set<Integer> a() throws IOException {
            l0 l0Var = l0.this;
            Set setCreateSetBuilder = SetsKt.createSetBuilder();
            Cursor cursorQuery$default = b2.query$default(l0Var.i(), new w3.b(l0.f74966x), null, 2, null);
            while (cursorQuery$default.moveToNext()) {
                try {
                    setCreateSetBuilder.add(Integer.valueOf(cursorQuery$default.getInt(0)));
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.io.c.a(cursorQuery$default, th2);
                        throw th3;
                    }
                }
            }
            Unit unit = Unit.f312394a;
            kotlin.io.c.a(cursorQuery$default, null);
            Set<Integer> setBuild = SetsKt.build(setCreateSetBuilder);
            if (setBuild.isEmpty()) {
                return setBuild;
            }
            if (l0.this.h() == null) {
                throw new IllegalStateException("Required value was null.");
            }
            w3.i iVarH = l0.this.h();
            if (iVarH == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            iVarH.j2();
            return setBuild;
        }

        @Override // java.lang.Runnable
        public void run() {
            Set<Integer> setEmptySet;
            androidx.room.d dVar;
            Lock closeLock$room_runtime_release = l0.this.i().getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                try {
                    if (!l0.this.g()) {
                        closeLock$room_runtime_release.unlock();
                        androidx.room.d dVar2 = l0.this.f74972f;
                        if (dVar2 != null) {
                            dVar2.e();
                            return;
                        }
                        return;
                    }
                    if (!l0.this.k().compareAndSet(true, false)) {
                        closeLock$room_runtime_release.unlock();
                        androidx.room.d dVar3 = l0.this.f74972f;
                        if (dVar3 != null) {
                            dVar3.e();
                            return;
                        }
                        return;
                    }
                    if (l0.this.i().inTransaction()) {
                        closeLock$room_runtime_release.unlock();
                        androidx.room.d dVar4 = l0.this.f74972f;
                        if (dVar4 != null) {
                            dVar4.e();
                            return;
                        }
                        return;
                    }
                    w3.d writableDatabase = l0.this.i().getOpenHelper().getWritableDatabase();
                    writableDatabase.j3();
                    try {
                        setEmptySet = a();
                        writableDatabase.W9();
                        writableDatabase.Ea();
                        closeLock$room_runtime_release.unlock();
                        dVar = l0.this.f74972f;
                        if (dVar != null) {
                            dVar.e();
                        }
                        if (setEmptySet.isEmpty()) {
                            return;
                        }
                        androidx.arch.core.internal.b<c, d> bVarJ = l0.this.j();
                        l0 l0Var = l0.this;
                        synchronized (bVarJ) {
                            try {
                                Iterator<Map.Entry<K, V>> it = l0Var.j().iterator();
                                while (it.hasNext()) {
                                    ((d) ((Map.Entry) it.next()).getValue()).c(setEmptySet);
                                }
                                Unit unit = Unit.f312394a;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        writableDatabase.Ea();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    closeLock$room_runtime_release.unlock();
                    androidx.room.d dVar5 = l0.this.f74972f;
                    if (dVar5 != null) {
                        dVar5.e();
                    }
                    throw th4;
                }
            } catch (SQLiteException unused) {
                setEmptySet = SetsKt.emptySet();
                closeLock$room_runtime_release.unlock();
                dVar = l0.this.f74972f;
                if (dVar != null) {
                }
            } catch (IllegalStateException unused2) {
                setEmptySet = SetsKt.emptySet();
                closeLock$room_runtime_release.unlock();
                dVar = l0.this.f74972f;
                if (dVar != null) {
                }
            }
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public l0(@NotNull b2 database, @NotNull Map<String, String> shadowTablesMap, @NotNull Map<String, Set<String>> viewTables, @NotNull String... tableNames) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f74967a = database;
        this.f74968b = shadowTablesMap;
        this.f74969c = viewTables;
        this.f74973g = new AtomicBoolean(false);
        this.f74976j = new b(tableNames.length);
        this.f74977k = new j0(database);
        this.f74978l = new androidx.arch.core.internal.b<>();
        this.f74980n = new Object();
        this.f74981o = new Object();
        this.f74970d = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = tableNames[i10];
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase2 = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.f74970d.put(lowerCase2, Integer.valueOf(i10));
            String str2 = this.f74968b.get(tableNames[i10]);
            if (str2 != null) {
                Intrinsics.checkNotNullExpressionValue(US, "US");
                lowerCase = str2.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr[i10] = lowerCase2;
        }
        this.f74971e = strArr;
        for (Map.Entry<String, String> entry : this.f74968b.entrySet()) {
            String value = entry.getValue();
            Locale US2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US2, "US");
            String lowerCase3 = value.toLowerCase(US2);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.f74970d.containsKey(lowerCase3)) {
                String key = entry.getKey();
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase4 = key.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                Map<String, Integer> map = this.f74970d;
                map.put(lowerCase4, (Integer) MapsKt.getValue(map, lowerCase3));
            }
        }
        this.f74982p = new f();
    }

    private final void A(w3.d dVar, int i10) {
        String str = this.f74971e[i10];
        for (String str2 : f74960r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f74959q.d(str, str2);
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            dVar.X8(str3);
        }
    }

    private final String[] D(String[] strArr) {
        String[] strArrU = u(strArr);
        for (String str : strArrU) {
            Map<String, Integer> map = this.f74970d;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!map.containsKey(lowerCase)) {
                throw new IllegalArgumentException(("There is no table with name " + str).toString());
            }
        }
        return strArrU;
    }

    @androidx.annotation.l1
    public static /* synthetic */ void l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        synchronized (this.f74981o) {
            try {
                this.f74974h = false;
                this.f74976j.f();
                w3.i iVar = this.f74975i;
                if (iVar != null) {
                    iVar.close();
                    Unit unit = Unit.f312394a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final String[] u(String[] strArr) {
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        for (String str : strArr) {
            Map<String, Set<String>> map = this.f74969c;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.f74969c;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map2.get(lowerCase2);
                Intrinsics.checkNotNull(set);
                setCreateSetBuilder.addAll(set);
            } else {
                setCreateSetBuilder.add(str);
            }
        }
        return (String[]) SetsKt.build(setCreateSetBuilder).toArray(new String[0]);
    }

    private final void y(w3.d dVar, int i10) {
        dVar.X8("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f74971e[i10];
        for (String str2 : f74960r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f74959q.d(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE " + f74961s + " SET " + f74963u + " = 1 WHERE " + f74962t + " = " + i10 + " AND " + f74963u + " = 0; END";
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            dVar.X8(str3);
        }
    }

    public final void B() {
        if (this.f74967a.isOpenInternal()) {
            C(this.f74967a.getOpenHelper().getWritableDatabase());
        }
    }

    public final void C(@NotNull w3.d database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.pe()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.f74967a.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.f74980n) {
                    try {
                        int[] iArrC = this.f74976j.c();
                        if (iArrC != null) {
                            f74959q.a(database);
                            try {
                                int length = iArrC.length;
                                int i10 = 0;
                                int i11 = 0;
                                while (i10 < length) {
                                    int i12 = iArrC[i10];
                                    int i13 = i11 + 1;
                                    if (i12 == 1) {
                                        y(database, i11);
                                    } else if (i12 == 2) {
                                        A(database, i11);
                                    }
                                    i10++;
                                    i11 = i13;
                                }
                                database.W9();
                                database.Ea();
                                Unit unit = Unit.f312394a;
                            } catch (Throwable th2) {
                                database.Ea();
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                closeLock$room_runtime_release.unlock();
            } catch (Throwable th4) {
                closeLock$room_runtime_release.unlock();
                throw th4;
            }
        } catch (SQLiteException | IllegalStateException unused) {
        }
    }

    @e.a({"RestrictedApi"})
    @androidx.annotation.m1
    public void c(@NotNull c observer) {
        d dVarM;
        Intrinsics.checkNotNullParameter(observer, "observer");
        String[] strArrU = u(observer.a());
        ArrayList arrayList = new ArrayList(strArrU.length);
        for (String str : strArrU) {
            Map<String, Integer> map = this.f74970d;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(num);
        }
        int[] intArray = CollectionsKt.toIntArray(arrayList);
        d dVar = new d(observer, intArray, strArrU);
        synchronized (this.f74978l) {
            try {
                dVarM = this.f74978l.m(observer, dVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (dVarM == null && this.f74976j.d(Arrays.copyOf(intArray, intArray.length))) {
            B();
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void d(@NotNull c observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        c(new e(this, observer));
    }

    @kotlin.l(message = "Use [createLiveData(String[], boolean, Callable)]")
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @NotNull
    public <T> androidx.lifecycle.w0<T> e(@NotNull String[] tableNames, @NotNull Callable<T> computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return f(tableNames, false, computeFunction);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @NotNull
    public <T> androidx.lifecycle.w0<T> f(@NotNull String[] tableNames, boolean z10, @NotNull Callable<T> computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return this.f74977k.a(D(tableNames), z10, computeFunction);
    }

    public final boolean g() {
        if (!this.f74967a.isOpenInternal()) {
            return false;
        }
        if (!this.f74974h) {
            this.f74967a.getOpenHelper().getWritableDatabase();
        }
        return this.f74974h;
    }

    @Nullable
    public final w3.i h() {
        return this.f74975i;
    }

    @NotNull
    public final b2 i() {
        return this.f74967a;
    }

    @NotNull
    public final androidx.arch.core.internal.b<c, d> j() {
        return this.f74978l;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @NotNull
    public final AtomicBoolean k() {
        return this.f74973g;
    }

    @NotNull
    public final Map<String, Integer> m() {
        return this.f74970d;
    }

    @NotNull
    public final String[] n() {
        return this.f74971e;
    }

    public final void o(@NotNull w3.d database) {
        Intrinsics.checkNotNullParameter(database, "database");
        synchronized (this.f74981o) {
            if (this.f74974h) {
                return;
            }
            database.X8("PRAGMA temp_store = MEMORY;");
            database.X8("PRAGMA recursive_triggers='ON';");
            database.X8(f74964v);
            C(database);
            this.f74975i = database.uc(f74965w);
            this.f74974h = true;
            Unit unit = Unit.f312394a;
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public final void p(@NotNull String... tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        synchronized (this.f74978l) {
            try {
                Iterator<Map.Entry<K, V>> it = this.f74978l.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Intrinsics.checkNotNullExpressionValue(entry, "(observer, wrapper)");
                    c cVar = (c) entry.getKey();
                    d dVar = (d) entry.getValue();
                    if (!cVar.b()) {
                        dVar.d(tables);
                    }
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void r() {
        if (this.f74973g.compareAndSet(false, true)) {
            androidx.room.d dVar = this.f74972f;
            if (dVar != null) {
                dVar.n();
            }
            this.f74967a.getQueryExecutor().execute(this.f74982p);
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.m1
    public void s() {
        androidx.room.d dVar = this.f74972f;
        if (dVar != null) {
            dVar.n();
        }
        B();
        this.f74982p.run();
    }

    @e.a({"RestrictedApi"})
    @androidx.annotation.m1
    public void t(@NotNull c observer) {
        d dVarN;
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.f74978l) {
            dVarN = this.f74978l.n(observer);
        }
        if (dVarN != null) {
            b bVar = this.f74976j;
            int[] iArrB = dVarN.b();
            if (bVar.e(Arrays.copyOf(iArrB, iArrB.length))) {
                B();
            }
        }
    }

    public final void v(@NotNull androidx.room.d autoCloser) {
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f74972f = autoCloser;
        autoCloser.q(new Runnable() { // from class: androidx.room.k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f74946a.q();
            }
        });
    }

    public final void w(@Nullable w3.i iVar) {
        this.f74975i = iVar;
    }

    public final void x(@NotNull Context context, @NotNull String name, @NotNull Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        this.f74979m = new r0(context, name, serviceIntent, this, this.f74967a.getQueryExecutor());
    }

    public final void z() {
        r0 r0Var = this.f74979m;
        if (r0Var != null) {
            r0Var.s();
        }
        this.f74979m = null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public l0(@NotNull b2 database, @NotNull String... tableNames) {
        this(database, MapsKt.emptyMap(), MapsKt.emptyMap(), (String[]) Arrays.copyOf(tableNames, tableNames.length));
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
    }
}
