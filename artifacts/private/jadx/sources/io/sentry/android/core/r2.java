package io.sentry.android.core;

import io.sentry.e6;
import io.sentry.f8;
import io.sentry.q9;
import io.sentry.s3;
import io.sentry.u3;
import java.util.Comparator;
import java.util.Date;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public class r2 implements io.sentry.c1, io.sentry.android.core.internal.util.b0.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f304480h = 3600;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f304481i = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final f8 f304482j = new f8(new Date(0), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f304483a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.core.internal.util.b0 f304485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private volatile String f304486d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    protected final io.sentry.util.a f304484b = new io.sentry.util.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final SortedSet<io.sentry.p1> f304487e = new TreeSet(new Comparator() { // from class: io.sentry.android.core.q2
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return r2.f((io.sentry.p1) obj, (io.sentry.p1) obj2);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final ConcurrentSkipListSet<a> f304488f = new ConcurrentSkipListSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f304489g = 16666666;

    private static class a implements Comparable<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f304490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f304491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f304492c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f304493d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f304494e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f304495f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f304496g;

        a(long j10) {
            this(j10, j10, 0L, 0L, false, false, 0L);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NotNull a aVar) {
            return Long.compare(this.f304491b, aVar.f304491b);
        }

        a(long j10, long j11, long j12, long j13, boolean z10, boolean z11, long j14) {
            this.f304490a = j10;
            this.f304491b = j11;
            this.f304492c = j12;
            this.f304493d = j13;
            this.f304494e = z10;
            this.f304495f = z11;
            this.f304496g = j14;
        }
    }

    public r2(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull io.sentry.android.core.internal.util.b0 b0Var) {
        this.f304485c = b0Var;
        this.f304483a = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    public static /* synthetic */ int f(io.sentry.p1 p1Var, io.sentry.p1 p1Var2) {
        if (p1Var == p1Var2) {
            return 0;
        }
        int iCompareTo = p1Var.Q().compareTo(p1Var2.Q());
        return iCompareTo != 0 ? iCompareTo : p1Var.m().m().toString().compareTo(p1Var2.m().m().toString());
    }

    private static int g(@NotNull i2 i2Var, long j10, long j11, long j12) {
        long jMax = Math.max(0L, j11 - j12);
        if (!io.sentry.android.core.internal.util.b0.j(jMax, j10)) {
            return 0;
        }
        i2Var.a(jMax, Math.max(0L, jMax - j10), true, io.sentry.android.core.internal.util.b0.i(jMax));
        return 1;
    }

    private void h(@NotNull io.sentry.p1 p1Var) {
        io.sentry.m1 m1VarA = this.f304484b.a();
        try {
            if (!this.f304487e.remove(p1Var)) {
                if (m1VarA != null) {
                    m1VarA.close();
                    return;
                }
                return;
            }
            e6 e6VarN = p1Var.N();
            if (e6VarN == null) {
                if (m1VarA != null) {
                    m1VarA.close();
                    return;
                }
                return;
            }
            long j10 = j(p1Var.Q());
            long j11 = j(e6VarN);
            long j12 = j11 - j10;
            long j13 = 0;
            if (j12 <= 0) {
                if (m1VarA != null) {
                    m1VarA.close();
                    return;
                }
                return;
            }
            i2 i2Var = new i2();
            long j14 = this.f304489g;
            if (!this.f304488f.isEmpty()) {
                for (a aVar : this.f304488f.tailSet(new a(j10))) {
                    if (aVar.f304490a > j11) {
                        break;
                    }
                    if (aVar.f304490a >= j10 && aVar.f304491b <= j11) {
                        i2Var.a(aVar.f304492c, aVar.f304493d, aVar.f304494e, aVar.f304495f);
                    } else if ((j10 > aVar.f304490a && j10 < aVar.f304491b) || (j11 > aVar.f304490a && j11 < aVar.f304491b)) {
                        long jMin = Math.min(aVar.f304493d - Math.max(j13, Math.max(j13, j10 - aVar.f304490a) - aVar.f304496g), j12);
                        long jMin2 = Math.min(j11, aVar.f304491b) - Math.max(j10, aVar.f304490a);
                        i2Var.a(jMin2, jMin, io.sentry.android.core.internal.util.b0.j(jMin2, aVar.f304496g), io.sentry.android.core.internal.util.b0.i(jMin2));
                    }
                    j14 = aVar.f304496g;
                    j13 = 0;
                }
            }
            long j15 = j14;
            int iJ = i2Var.j();
            long jH = this.f304485c.h();
            if (jH != -1) {
                iJ = iJ + g(i2Var, j15, j11, jH) + i(i2Var, j15, j12);
            }
            double dI = (i2Var.i() + i2Var.g()) / 1.0E9d;
            p1Var.B(q9.f306599l, Integer.valueOf(iJ));
            p1Var.B(q9.f306600m, Integer.valueOf(i2Var.h()));
            p1Var.B(q9.f306601n, Integer.valueOf(i2Var.f()));
            p1Var.B(q9.f306602o, Double.valueOf(dI));
            if (p1Var instanceof io.sentry.r1) {
                p1Var.y(io.sentry.protocol.i.f306305f, Integer.valueOf(iJ));
                p1Var.y(io.sentry.protocol.i.f306306g, Integer.valueOf(i2Var.h()));
                p1Var.y(io.sentry.protocol.i.f306307h, Integer.valueOf(i2Var.f()));
                p1Var.y(io.sentry.protocol.i.f306308i, Double.valueOf(dI));
            }
            if (m1VarA != null) {
                m1VarA.close();
            }
        } catch (Throwable th2) {
            if (m1VarA == null) {
                throw th2;
            }
            try {
                m1VarA.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    private static int i(@NotNull i2 i2Var, long j10, long j11) {
        long jK = j11 - i2Var.k();
        if (jK > 0) {
            return (int) Math.ceil(jK / j10);
        }
        return 0;
    }

    private static long j(@NotNull e6 e6Var) {
        if (e6Var instanceof f8) {
            return e6Var.c(f304482j);
        }
        return System.nanoTime() - (io.sentry.p.i(System.currentTimeMillis()) - e6Var.k());
    }

    @Override // io.sentry.c1
    public void a(@NotNull io.sentry.p1 p1Var) {
        if (this.f304483a && !(p1Var instanceof s3) && !(p1Var instanceof u3)) {
            io.sentry.m1 m1VarA = this.f304484b.a();
            try {
                if (!this.f304487e.contains(p1Var)) {
                    if (m1VarA != null) {
                        m1VarA.close();
                        return;
                    }
                    return;
                }
                if (m1VarA != null) {
                    m1VarA.close();
                }
                h(p1Var);
                io.sentry.m1 m1VarA2 = this.f304484b.a();
                try {
                    if (this.f304487e.isEmpty()) {
                        clear();
                    } else {
                        this.f304488f.headSet(new a(j(this.f304487e.first().Q()))).clear();
                    }
                    if (m1VarA2 != null) {
                        m1VarA2.close();
                    }
                } catch (Throwable th2) {
                    if (m1VarA2 != null) {
                        try {
                            m1VarA2.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (m1VarA != null) {
                    try {
                        m1VarA.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        }
    }

    @Override // io.sentry.c1
    public void b(@NotNull io.sentry.p1 p1Var) {
        if (this.f304483a) {
            if ((p1Var instanceof s3) || (p1Var instanceof u3)) {
                return;
            }
            io.sentry.m1 m1VarA = this.f304484b.a();
            try {
                this.f304487e.add(p1Var);
                if (this.f304486d == null) {
                    this.f304486d = this.f304485c.l(this);
                }
                if (m1VarA != null) {
                    m1VarA.close();
                }
            } catch (Throwable th2) {
                if (m1VarA != null) {
                    try {
                        m1VarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // io.sentry.c1
    public void clear() {
        io.sentry.m1 m1VarA = this.f304484b.a();
        try {
            if (this.f304486d != null) {
                this.f304485c.m(this.f304486d);
                this.f304486d = null;
            }
            this.f304488f.clear();
            this.f304487e.clear();
            if (m1VarA != null) {
                m1VarA.close();
            }
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.android.core.internal.util.b0.c
    public void e(long j10, long j11, long j12, long j13, boolean z10, boolean z11, float f10) {
        if (this.f304488f.size() > f304480h) {
            return;
        }
        long j14 = (long) (f304481i / ((double) f10));
        this.f304489g = j14;
        if (z10 || z11) {
            this.f304488f.add(new a(j10, j11, j12, j13, z10, z11, j14));
        }
    }
}
