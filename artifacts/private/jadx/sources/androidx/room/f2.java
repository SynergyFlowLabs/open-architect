package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public final class f2 implements w3.g, w3.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f74820j = 15;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f74821k = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f74823m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f74824n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f74825o = 3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f74826s = 4;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f74827t = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.l1
    private final int f74828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private volatile String f74829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public final long[] f74830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public final double[] f74831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    @NotNull
    public final String[] f74832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oj.f
    @NotNull
    public final byte[][] f74833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final int[] f74834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f74835h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final b f74819i = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final TreeMap<Integer, f2> f74822l = new TreeMap<>();

    @Retention(RetentionPolicy.SOURCE)
    @jj.e(jj.a.SOURCE)
    public @interface a {
    }

    public static final class b {

        public static final class a implements w3.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ f2 f74836a;

            a(f2 f2Var) {
                this.f74836a = f2Var;
            }

            @Override // w3.f
            public void G6(int i10, long j10) {
                this.f74836a.G6(i10, j10);
            }

            @Override // w3.f
            public void H5(int i10, @NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this.f74836a.H5(i10, value);
            }

            @Override // w3.f
            public void J7(int i10) {
                this.f74836a.J7(i10);
            }

            @Override // w3.f
            public void Q6(int i10, @NotNull byte[] value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this.f74836a.Q6(i10, value);
            }

            @Override // w3.f
            public void Ve() {
                this.f74836a.Ve();
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f74836a.close();
            }

            @Override // w3.f
            public void s9(int i10, double d10) {
                this.f74836a.s9(i10, d10);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @androidx.annotation.l1
        public static /* synthetic */ void c() {
        }

        @androidx.annotation.l1
        public static /* synthetic */ void d() {
        }

        @androidx.annotation.l1
        public static /* synthetic */ void e() {
        }

        @oj.n
        @NotNull
        public final f2 a(@NotNull String query, int i10) {
            Intrinsics.checkNotNullParameter(query, "query");
            TreeMap<Integer, f2> treeMap = f2.f74822l;
            synchronized (treeMap) {
                Map.Entry<Integer, f2> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
                if (entryCeilingEntry == null) {
                    Unit unit = Unit.f312394a;
                    f2 f2Var = new f2(i10, null);
                    f2Var.o(query, i10);
                    return f2Var;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                f2 sqliteQuery = entryCeilingEntry.getValue();
                sqliteQuery.o(query, i10);
                Intrinsics.checkNotNullExpressionValue(sqliteQuery, "sqliteQuery");
                return sqliteQuery;
            }
        }

        @oj.n
        @NotNull
        public final f2 b(@NotNull w3.g supportSQLiteQuery) {
            Intrinsics.checkNotNullParameter(supportSQLiteQuery, "supportSQLiteQuery");
            f2 f2VarA = a(supportSQLiteQuery.b(), supportSQLiteQuery.a());
            supportSQLiteQuery.c(new a(f2VarA));
            return f2VarA;
        }

        public final void f() {
            TreeMap<Integer, f2> treeMap = f2.f74822l;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i10;
            }
        }

        private b() {
        }
    }

    public /* synthetic */ f2(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    @oj.n
    @NotNull
    public static final f2 d(@NotNull String str, int i10) {
        return f74819i.a(str, i10);
    }

    @oj.n
    @NotNull
    public static final f2 f(@NotNull w3.g gVar) {
        return f74819i.b(gVar);
    }

    private static /* synthetic */ void g() {
    }

    @androidx.annotation.l1
    public static /* synthetic */ void h() {
    }

    @androidx.annotation.l1
    public static /* synthetic */ void j() {
    }

    @androidx.annotation.l1
    public static /* synthetic */ void l() {
    }

    @androidx.annotation.l1
    public static /* synthetic */ void m() {
    }

    @Override // w3.f
    public void G6(int i10, long j10) {
        this.f74834g[i10] = 2;
        this.f74830c[i10] = j10;
    }

    @Override // w3.f
    public void H5(int i10, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f74834g[i10] = 4;
        this.f74832e[i10] = value;
    }

    public final int He() {
        return this.f74828a;
    }

    @Override // w3.f
    public void J7(int i10) {
        this.f74834g[i10] = 1;
    }

    @Override // w3.f
    public void Q6(int i10, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f74834g[i10] = 5;
        this.f74833f[i10] = value;
    }

    @Override // w3.f
    public void Ve() {
        Arrays.fill(this.f74834g, 1);
        Arrays.fill(this.f74832e, (Object) null);
        Arrays.fill(this.f74833f, (Object) null);
        this.f74829b = null;
    }

    @Override // w3.g
    public int a() {
        return this.f74835h;
    }

    @Override // w3.g
    @NotNull
    public String b() {
        String str = this.f74829b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // w3.g
    public void c(@NotNull w3.f statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int iA = a();
        if (1 > iA) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.f74834g[i10];
            if (i11 == 1) {
                statement.J7(i10);
            } else if (i11 == 2) {
                statement.G6(i10, this.f74830c[i10]);
            } else if (i11 == 3) {
                statement.s9(i10, this.f74831d[i10]);
            } else if (i11 == 4) {
                String str = this.f74832e[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.H5(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.f74833f[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.Q6(i10, bArr);
            }
            if (i10 == iA) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void e(@NotNull f2 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iA = other.a() + 1;
        System.arraycopy(other.f74834g, 0, this.f74834g, 0, iA);
        System.arraycopy(other.f74830c, 0, this.f74830c, 0, iA);
        System.arraycopy(other.f74832e, 0, this.f74832e, 0, iA);
        System.arraycopy(other.f74833f, 0, this.f74833f, 0, iA);
        System.arraycopy(other.f74831d, 0, this.f74831d, 0, iA);
    }

    public final void o(@NotNull String query, int i10) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f74829b = query;
        this.f74835h = i10;
    }

    public final void release() {
        TreeMap<Integer, f2> treeMap = f74822l;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f74828a), this);
            f74819i.f();
            Unit unit = Unit.f312394a;
        }
    }

    @Override // w3.f
    public void s9(int i10, double d10) {
        this.f74834g[i10] = 3;
        this.f74831d[i10] = d10;
    }

    private f2(int i10) {
        this.f74828a = i10;
        int i11 = i10 + 1;
        this.f74834g = new int[i11];
        this.f74830c = new long[i11];
        this.f74831d = new double[i11];
        this.f74832e = new String[i11];
        this.f74833f = new byte[i11][];
    }
}
