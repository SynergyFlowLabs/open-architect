package okhttp3.internal.cache;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import jk.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f333947c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final d0 f333948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final f0 f333949b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0049  */
        public final boolean a(@NotNull f0 response, @NotNull d0 request) {
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(request, "request");
            int iE = response.E();
            if (iE != 200 && iE != 410 && iE != 414 && iE != 501 && iE != 203 && iE != 204) {
                if (iE == 307) {
                    if (f0.T(response, com.google.common.net.d.f119530q0, null, 2, null) == null && response.t().n() == -1 && !response.t().m() && !response.t().l()) {
                        return false;
                    }
                } else if (iE != 308 && iE != 404 && iE != 405) {
                    switch (iE) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            if (f0.T(response, com.google.common.net.d.f119530q0, null, 2, null) == null) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (response.t().s() || request.g().s()) ? false : true;
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f333950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final d0 f333951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final f0 f333952c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private Date f333953d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private String f333954e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private Date f333955f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private String f333956g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private Date f333957h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f333958i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f333959j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        private String f333960k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f333961l;

        public b(long j10, @NotNull d0 request, @Nullable f0 f0Var) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f333950a = j10;
            this.f333951b = request;
            this.f333952c = f0Var;
            this.f333961l = -1;
            if (f0Var != null) {
                this.f333958i = f0Var.y0();
                this.f333959j = f0Var.w0();
                u uVarY = f0Var.Y();
                int size = uVarY.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strN = uVarY.n(i10);
                    String strW = uVarY.w(i10);
                    if (StringsKt.N1(strN, com.google.common.net.d.f119483d, true)) {
                        this.f333953d = okhttp3.internal.http.c.a(strW);
                        this.f333954e = strW;
                    } else if (StringsKt.N1(strN, com.google.common.net.d.f119530q0, true)) {
                        this.f333957h = okhttp3.internal.http.c.a(strW);
                    } else if (StringsKt.N1(strN, com.google.common.net.d.f119533r0, true)) {
                        this.f333955f = okhttp3.internal.http.c.a(strW);
                        this.f333956g = strW;
                    } else if (StringsKt.N1(strN, com.google.common.net.d.f119527p0, true)) {
                        this.f333960k = strW;
                    } else if (StringsKt.N1(strN, com.google.common.net.d.Y, true)) {
                        this.f333961l = f.k0(strW, -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.f333953d;
            long jMax = date != null ? Math.max(0L, this.f333959j - date.getTime()) : 0L;
            int i10 = this.f333961l;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            long j10 = this.f333959j;
            return jMax + (j10 - this.f333958i) + (this.f333950a - j10);
        }

        private final c c() {
            String str;
            if (this.f333952c == null) {
                return new c(this.f333951b, null);
            }
            if ((!this.f333951b.l() || this.f333952c.I() != null) && c.f333947c.a(this.f333952c, this.f333951b)) {
                okhttp3.d dVarG = this.f333951b.g();
                if (dVarG.r() || f(this.f333951b)) {
                    return new c(this.f333951b, null);
                }
                okhttp3.d dVarT = this.f333952c.t();
                long jA = a();
                long jD = d();
                if (dVarG.n() != -1) {
                    jD = Math.min(jD, TimeUnit.SECONDS.toMillis(dVarG.n()));
                }
                long millis = 0;
                long millis2 = dVarG.p() != -1 ? TimeUnit.SECONDS.toMillis(dVarG.p()) : 0L;
                if (!dVarT.q() && dVarG.o() != -1) {
                    millis = TimeUnit.SECONDS.toMillis(dVarG.o());
                }
                if (!dVarT.r()) {
                    long j10 = millis2 + jA;
                    if (j10 < millis + jD) {
                        f0.a aVarJ0 = this.f333952c.j0();
                        if (j10 >= jD) {
                            aVarJ0.a(com.google.common.net.d.f119495g, "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (jA > 86400000 && g()) {
                            aVarJ0.a(com.google.common.net.d.f119495g, "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new c(null, aVarJ0.c());
                    }
                }
                String str2 = this.f333960k;
                if (str2 != null) {
                    str = com.google.common.net.d.A;
                } else {
                    if (this.f333955f != null) {
                        str2 = this.f333956g;
                    } else {
                        if (this.f333953d == null) {
                            return new c(this.f333951b, null);
                        }
                        str2 = this.f333954e;
                    }
                    str = com.google.common.net.d.f119556z;
                }
                u.a aVarS = this.f333951b.k().s();
                Intrinsics.checkNotNull(str2);
                aVarS.g(str, str2);
                return new c(this.f333951b.n().o(aVarS.i()).b(), this.f333952c);
            }
            return new c(this.f333951b, null);
        }

        private final long d() {
            f0 f0Var = this.f333952c;
            Intrinsics.checkNotNull(f0Var);
            okhttp3.d dVarT = f0Var.t();
            if (dVarT.n() != -1) {
                return TimeUnit.SECONDS.toMillis(dVarT.n());
            }
            Date date = this.f333957h;
            if (date != null) {
                Date date2 = this.f333953d;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f333959j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f333955f != null && this.f333952c.x0().q().O() == null) {
                Date date3 = this.f333953d;
                long time2 = date3 != null ? date3.getTime() : this.f333958i;
                Date date4 = this.f333955f;
                Intrinsics.checkNotNull(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / ((long) 10);
                }
            }
            return 0L;
        }

        private final boolean f(d0 d0Var) {
            if (d0Var.i(com.google.common.net.d.f119556z) == null && d0Var.i(com.google.common.net.d.A) == null) {
                return false;
            }
            return true;
        }

        private final boolean g() {
            f0 f0Var = this.f333952c;
            Intrinsics.checkNotNull(f0Var);
            return f0Var.t().n() == -1 && this.f333957h == null;
        }

        @NotNull
        public final c b() {
            c cVarC = c();
            return (cVarC.b() == null || !this.f333951b.g().u()) ? cVarC : new c(null, null);
        }

        @NotNull
        public final d0 e() {
            return this.f333951b;
        }
    }

    public c(@Nullable d0 d0Var, @Nullable f0 f0Var) {
        this.f333948a = d0Var;
        this.f333949b = f0Var;
    }

    @Nullable
    public final f0 a() {
        return this.f333949b;
    }

    @Nullable
    public final d0 b() {
        return this.f333948a;
    }
}
