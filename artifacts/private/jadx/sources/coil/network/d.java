package coil.network;

import coil.util.l;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f87586c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final d0 f87587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final c f87588b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean d(String str) {
            return StringsKt.N1("Content-Length", str, true) || StringsKt.N1(com.google.common.net.d.f119476b0, str, true) || StringsKt.N1("Content-Type", str, true);
        }

        private final boolean e(String str) {
            return (StringsKt.N1(com.google.common.net.d.f119523o, str, true) || StringsKt.N1(com.google.common.net.d.f119542u0, str, true) || StringsKt.N1("Proxy-Authenticate", str, true) || StringsKt.N1("Proxy-Authorization", str, true) || StringsKt.N1(com.google.common.net.d.M, str, true) || StringsKt.N1("Trailers", str, true) || StringsKt.N1(com.google.common.net.d.M0, str, true) || StringsKt.N1(com.google.common.net.d.N, str, true)) ? false : true;
        }

        @NotNull
        public final u a(@NotNull u uVar, @NotNull u uVar2) {
            u.a aVar = new u.a();
            int size = uVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strN = uVar.n(i10);
                String strW = uVar.w(i10);
                boolean z10 = !false;
                if ((!StringsKt.N1(com.google.common.net.d.f119495g, strN, true) || !StringsKt.u2(strW, "1", false, 2, null)) && (d(strN) || !e(strN) || uVar2.k(strN) == null)) {
                    aVar.h(strN, strW);
                }
            }
            int size2 = uVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strN2 = uVar2.n(i11);
                if (!d(strN2) && e(strN2)) {
                    aVar.h(strN2, uVar2.w(i11));
                }
            }
            return aVar.i();
        }

        public final boolean b(@NotNull d0 d0Var, @NotNull c cVar) {
            return (d0Var.g().s() || cVar.e().s() || Intrinsics.areEqual(cVar.h().k(com.google.common.net.d.N0), "*")) ? false : true;
        }

        public final boolean c(@NotNull d0 d0Var, @NotNull f0 f0Var) {
            return (d0Var.g().s() || f0Var.t().s() || Intrinsics.areEqual(f0Var.Y().k(com.google.common.net.d.N0), "*")) ? false : true;
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final d0 f87589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final c f87590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private Date f87591c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private String f87592d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private Date f87593e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private String f87594f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private Date f87595g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f87596h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f87597i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        private String f87598j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f87599k;

        public b(@NotNull d0 d0Var, @Nullable c cVar) {
            this.f87589a = d0Var;
            this.f87590b = cVar;
            this.f87599k = -1;
            if (cVar != null) {
                this.f87596h = cVar.i();
                this.f87597i = cVar.g();
                u uVarH = cVar.h();
                int size = uVarH.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strN = uVarH.n(i10);
                    if (StringsKt.N1(strN, com.google.common.net.d.f119483d, true)) {
                        this.f87591c = uVarH.l(com.google.common.net.d.f119483d);
                        this.f87592d = uVarH.w(i10);
                    } else if (StringsKt.N1(strN, com.google.common.net.d.f119530q0, true)) {
                        this.f87595g = uVarH.l(com.google.common.net.d.f119530q0);
                    } else if (StringsKt.N1(strN, com.google.common.net.d.f119533r0, true)) {
                        this.f87593e = uVarH.l(com.google.common.net.d.f119533r0);
                        this.f87594f = uVarH.w(i10);
                    } else if (StringsKt.N1(strN, com.google.common.net.d.f119527p0, true)) {
                        this.f87598j = uVarH.w(i10);
                    } else if (StringsKt.N1(strN, com.google.common.net.d.Y, true)) {
                        this.f87599k = l.I(uVarH.w(i10), -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.f87591c;
            long jMax = date != null ? Math.max(0L, this.f87597i - date.getTime()) : 0L;
            int i10 = this.f87599k;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            return jMax + (this.f87597i - this.f87596h) + (coil.util.d0.f87819a.b() - this.f87597i);
        }

        private final long c() {
            c cVar = this.f87590b;
            Intrinsics.checkNotNull(cVar);
            okhttp3.d dVarE = cVar.e();
            if (dVarE.n() != -1) {
                return TimeUnit.SECONDS.toMillis(dVarE.n());
            }
            Date date = this.f87595g;
            if (date != null) {
                Date date2 = this.f87591c;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f87597i);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f87593e != null && this.f87589a.q().O() == null) {
                Date date3 = this.f87591c;
                long time2 = date3 != null ? date3.getTime() : this.f87596h;
                Date date4 = this.f87593e;
                Intrinsics.checkNotNull(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / ((long) 10);
                }
            }
            return 0L;
        }

        private final boolean d(d0 d0Var) {
            return (d0Var.i(com.google.common.net.d.f119556z) == null && d0Var.i(com.google.common.net.d.A) == null) ? false : true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final d b() {
            String str;
            c cVar = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            Object[] objArr12 = 0;
            if (this.f87590b == null) {
                return new d(this.f87589a, cVar, objArr12 == true ? 1 : 0);
            }
            if (this.f87589a.l() && !this.f87590b.j()) {
                return new d(this.f87589a, objArr11 == true ? 1 : 0, objArr10 == true ? 1 : 0);
            }
            okhttp3.d dVarE = this.f87590b.e();
            if (!d.f87586c.b(this.f87589a, this.f87590b)) {
                return new d(this.f87589a, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0);
            }
            okhttp3.d dVarG = this.f87589a.g();
            if (dVarG.r() || d(this.f87589a)) {
                return new d(this.f87589a, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
            }
            long jA = a();
            long jC = c();
            if (dVarG.n() != -1) {
                jC = Math.min(jC, TimeUnit.SECONDS.toMillis(dVarG.n()));
            }
            long millis = 0;
            long millis2 = dVarG.p() != -1 ? TimeUnit.SECONDS.toMillis(dVarG.p()) : 0L;
            if (!dVarE.q() && dVarG.o() != -1) {
                millis = TimeUnit.SECONDS.toMillis(dVarG.o());
            }
            if (!dVarE.r() && jA + millis2 < jC + millis) {
                return new d(objArr7 == true ? 1 : 0, this.f87590b, objArr6 == true ? 1 : 0);
            }
            String str2 = this.f87598j;
            if (str2 != null) {
                Intrinsics.checkNotNull(str2);
                str = com.google.common.net.d.A;
            } else {
                Date date = this.f87593e;
                str = com.google.common.net.d.f119556z;
                if (date != null) {
                    str2 = this.f87594f;
                    Intrinsics.checkNotNull(str2);
                } else {
                    if (this.f87591c == null) {
                        return new d(this.f87589a, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0);
                    }
                    str2 = this.f87592d;
                    Intrinsics.checkNotNull(str2);
                }
            }
            return new d(this.f87589a.n().a(str, str2).b(), this.f87590b, objArr5 == true ? 1 : 0);
        }
    }

    public /* synthetic */ d(d0 d0Var, c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(d0Var, cVar);
    }

    @Nullable
    public final c a() {
        return this.f87588b;
    }

    @Nullable
    public final d0 b() {
        return this.f87587a;
    }

    private d(d0 d0Var, c cVar) {
        this.f87587a = d0Var;
        this.f87588b = cVar;
    }
}
