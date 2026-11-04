package androidx.media3.exoplayer.upstream;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.p0;
import androidx.media3.common.b4;
import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.w;
import androidx.media3.datasource.x;
import androidx.media3.exoplayer.trackselection.c0;
import com.google.common.base.a0;
import com.google.common.collect.l6;
import com.google.common.collect.m6;
import com.google.common.collect.n6;
import com.google.common.collect.nb;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f65992f = "d";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f65993g = "h";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f65994h = "s";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f65995i = "v";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f65996j = "l";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f65997k = "i";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f65998l = "a";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f65999m = "v";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f66000n = "av";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f66001o = "m";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a0 f66002p = a0.p(",");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f66003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f66004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f66005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f66006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f66007e;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f66008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f66009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f66010c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        public final String f66011d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final l6<String> f66012e;

        public static final class a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @p0
            private String f66016d;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f66013a = androidx.media3.common.j.f60676f;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f66014b = androidx.media3.common.j.f60676f;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private long f66015c = -9223372036854775807L;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private l6<String> f66017e = l6.F();

            public b f() {
                return new b(this);
            }

            @z7.a
            public a g(int i10) {
                androidx.media3.common.util.a.a(i10 >= 0 || i10 == -2147483647);
                this.f66013a = i10;
                return this;
            }

            @z7.a
            public a h(List<String> list) {
                this.f66017e = l6.w(list);
                return this;
            }

            @z7.a
            public a i(long j10) {
                androidx.media3.common.util.a.a(j10 >= 0 || j10 == -9223372036854775807L);
                this.f66015c = j10;
                return this;
            }

            @z7.a
            public a j(@p0 String str) {
                this.f66016d = str;
                return this;
            }

            @z7.a
            public a k(int i10) {
                androidx.media3.common.util.a.a(i10 >= 0 || i10 == -2147483647);
                this.f66014b = i10;
                return this;
            }
        }

        public void a(com.google.common.collect.s<String, String> sVar) {
            ArrayList arrayList = new ArrayList();
            if (this.f66008a != -2147483647) {
                arrayList.add("br=" + this.f66008a);
            }
            if (this.f66009b != -2147483647) {
                arrayList.add("tb=" + this.f66009b);
            }
            if (this.f66010c != -9223372036854775807L) {
                arrayList.add("d=" + this.f66010c);
            }
            if (!TextUtils.isEmpty(this.f66011d)) {
                arrayList.add("ot=" + this.f66011d);
            }
            arrayList.addAll(this.f66012e);
            if (arrayList.isEmpty()) {
                return;
            }
            sVar.v(androidx.media3.exoplayer.upstream.f.f65966f, arrayList);
        }

        private b(a aVar) {
            this.f66008a = aVar.f66013a;
            this.f66009b = aVar.f66014b;
            this.f66010c = aVar.f66015c;
            this.f66011d = aVar.f66016d;
            this.f66012e = aVar.f66017e;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f66018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f66019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f66020c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f66021d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        public final String f66022e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        public final String f66023f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final l6<String> f66024g;

        public static final class a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f66028d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @p0
            private String f66029e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @p0
            private String f66030f;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f66025a = -9223372036854775807L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f66026b = -2147483647L;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private long f66027c = -9223372036854775807L;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private l6<String> f66031g = l6.F();

            public c h() {
                return new c(this);
            }

            @z7.a
            public a i(long j10) {
                if (j10 == -9223372036854775807L) {
                    this.f66025a = j10;
                    return this;
                }
                if (j10 < 0) {
                    throw new IllegalArgumentException();
                }
                this.f66025a = ((j10 + 50) / 100) * 100;
                return this;
            }

            @z7.a
            public a j(List<String> list) {
                this.f66031g = l6.w(list);
                return this;
            }

            @z7.a
            public a k(long j10) {
                if (j10 == -9223372036854775807L) {
                    this.f66027c = j10;
                    return this;
                }
                if (j10 < 0) {
                    throw new IllegalArgumentException();
                }
                this.f66027c = ((j10 + 50) / 100) * 100;
                return this;
            }

            @z7.a
            public a l(long j10) {
                if (j10 == -2147483647L) {
                    this.f66026b = j10;
                    return this;
                }
                if (j10 < 0) {
                    throw new IllegalArgumentException();
                }
                this.f66026b = ((j10 + 50) / 100) * 100;
                return this;
            }

            @z7.a
            public a m(@p0 String str) {
                this.f66029e = str == null ? null : Uri.encode(str);
                return this;
            }

            @z7.a
            public a n(@p0 String str) {
                this.f66030f = str;
                return this;
            }

            @z7.a
            public a o(boolean z10) {
                this.f66028d = z10;
                return this;
            }
        }

        public void a(com.google.common.collect.s<String, String> sVar) {
            ArrayList arrayList = new ArrayList();
            if (this.f66018a != -9223372036854775807L) {
                arrayList.add("bl=" + this.f66018a);
            }
            if (this.f66019b != -2147483647L) {
                arrayList.add("mtp=" + this.f66019b);
            }
            if (this.f66020c != -9223372036854775807L) {
                arrayList.add("dl=" + this.f66020c);
            }
            if (this.f66021d) {
                arrayList.add(androidx.media3.exoplayer.upstream.f.f65986z);
            }
            if (!TextUtils.isEmpty(this.f66022e)) {
                arrayList.add(k1.S("%s=\"%s\"", androidx.media3.exoplayer.upstream.f.A, this.f66022e));
            }
            if (!TextUtils.isEmpty(this.f66023f)) {
                arrayList.add(k1.S("%s=\"%s\"", androidx.media3.exoplayer.upstream.f.B, this.f66023f));
            }
            arrayList.addAll(this.f66024g);
            if (!arrayList.isEmpty()) {
                sVar.v(androidx.media3.exoplayer.upstream.f.f65967g, arrayList);
            }
        }

        private c(a aVar) {
            this.f66018a = aVar.f66025a;
            this.f66019b = aVar.f66026b;
            this.f66020c = aVar.f66027c;
            this.f66021d = aVar.f66028d;
            this.f66022e = aVar.f66029e;
            this.f66023f = aVar.f66030f;
            this.f66024g = aVar.f66031g;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f66032g = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        public final String f66033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        public final String f66034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        public final String f66035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        public final String f66036d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f66037e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final l6<String> f66038f;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @p0
            private String f66039a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @p0
            private String f66040b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @p0
            private String f66041c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @p0
            private String f66042d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private float f66043e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private l6<String> f66044f = l6.F();

            public d g() {
                return new d(this);
            }

            @z7.a
            public a h(@p0 String str) {
                androidx.media3.common.util.a.a(str == null || str.length() <= 64);
                this.f66039a = str;
                return this;
            }

            @z7.a
            public a i(List<String> list) {
                this.f66044f = l6.w(list);
                return this;
            }

            @z7.a
            public a j(float f10) {
                androidx.media3.common.util.a.a(f10 > 0.0f || f10 == -3.4028235E38f);
                this.f66043e = f10;
                return this;
            }

            @z7.a
            public a k(@p0 String str) {
                androidx.media3.common.util.a.a(str == null || str.length() <= 64);
                this.f66040b = str;
                return this;
            }

            @z7.a
            public a l(@p0 String str) {
                this.f66042d = str;
                return this;
            }

            @z7.a
            public a m(@p0 String str) {
                this.f66041c = str;
                return this;
            }
        }

        public void a(com.google.common.collect.s<String, String> sVar) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.f66033a)) {
                arrayList.add(k1.S("%s=\"%s\"", androidx.media3.exoplayer.upstream.f.f65973m, this.f66033a));
            }
            if (!TextUtils.isEmpty(this.f66034b)) {
                arrayList.add(k1.S("%s=\"%s\"", "sid", this.f66034b));
            }
            if (!TextUtils.isEmpty(this.f66035c)) {
                arrayList.add("sf=" + this.f66035c);
            }
            if (!TextUtils.isEmpty(this.f66036d)) {
                arrayList.add("st=" + this.f66036d);
            }
            float f10 = this.f66037e;
            if (f10 != -3.4028235E38f && f10 != 1.0f) {
                arrayList.add(k1.S("%s=%.2f", "pr", Float.valueOf(f10)));
            }
            arrayList.addAll(this.f66038f);
            if (arrayList.isEmpty()) {
                return;
            }
            sVar.v(androidx.media3.exoplayer.upstream.f.f65968h, arrayList);
        }

        private d(a aVar) {
            this.f66033a = aVar.f66039a;
            this.f66034b = aVar.f66040b;
            this.f66035c = aVar.f66041c;
            this.f66036d = aVar.f66042d;
            this.f66037e = aVar.f66043e;
            this.f66038f = aVar.f66044f;
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f66045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f66046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l6<String> f66047c;

        public static final class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f66049b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f66048a = androidx.media3.common.j.f60676f;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private l6<String> f66050c = l6.F();

            public e d() {
                return new e(this);
            }

            @z7.a
            public a e(boolean z10) {
                this.f66049b = z10;
                return this;
            }

            @z7.a
            public a f(List<String> list) {
                this.f66050c = l6.w(list);
                return this;
            }

            @z7.a
            public a g(int i10) {
                androidx.media3.common.util.a.a(i10 >= 0 || i10 == -2147483647);
                if (i10 != -2147483647) {
                    i10 = ((i10 + 50) / 100) * 100;
                }
                this.f66048a = i10;
                return this;
            }
        }

        public void a(com.google.common.collect.s<String, String> sVar) {
            ArrayList arrayList = new ArrayList();
            if (this.f66045a != -2147483647) {
                arrayList.add("rtp=" + this.f66045a);
            }
            if (this.f66046b) {
                arrayList.add("bs");
            }
            arrayList.addAll(this.f66047c);
            if (!arrayList.isEmpty()) {
                sVar.v(androidx.media3.exoplayer.upstream.f.f65969i, arrayList);
            }
        }

        private e(a aVar) {
            this.f66045a = aVar.f66048a;
            this.f66046b = aVar.f66049b;
            this.f66047c = aVar.f66050c;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final Pattern f66051m = Pattern.compile(".*-.*");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media3.exoplayer.upstream.f f66052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f66053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private c0 f66054c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private Boolean f66057f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f66058g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f66059h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @p0
        private String f66061j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @p0
        private String f66062k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @p0
        private String f66063l;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f66055d = -9223372036854775807L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f66056e = -3.4028235E38f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f66060i = -9223372036854775807L;

        public f(androidx.media3.exoplayer.upstream.f fVar, String str) {
            this.f66052a = fVar;
            this.f66053b = str;
        }

        @p0
        private static String b(w wVar) {
            String strC = s0.c(wVar.f61757k);
            String strP = s0.p(wVar.f61757k);
            if (strC != null && strP != null) {
                return h.f66000n;
            }
            int iM = s0.m(wVar.f61761o);
            if (iM == -1) {
                iM = s0.m(wVar.f61760n);
            }
            if (iM == 1) {
                return h.f65998l;
            }
            if (iM == 2) {
                return "v";
            }
            return null;
        }

        private static boolean c(@p0 String str) {
            return Objects.equals(str, h.f66001o);
        }

        private static boolean d(@p0 String str) {
            return Objects.equals(str, h.f65998l) || Objects.equals(str, "v") || Objects.equals(str, h.f66000n);
        }

        private void o(List<String> list) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                androidx.media3.common.util.a.i(f66051m.matcher(k1.l2(it.next(), "=")[0]).matches());
            }
        }

        public h a() {
            int iQ;
            int iC;
            int iQ2;
            boolean zC = c(this.f66061j);
            if (!zC) {
                androidx.media3.common.util.a.l(this.f66054c, "Track selection must be set");
            }
            if (this.f66061j == null) {
                this.f66061j = b(((c0) androidx.media3.common.util.a.g(this.f66054c)).k());
            }
            boolean zD = d(this.f66061j);
            if (zD) {
                androidx.media3.common.util.a.j(this.f66055d != -9223372036854775807L, "Buffered duration must be set");
                androidx.media3.common.util.a.j(this.f66060i != -9223372036854775807L, "Chunk duration must be set");
            }
            m6<String, String> m6VarB = this.f66052a.f65989c.b();
            nb<String> it = m6VarB.keySet().iterator();
            while (it.hasNext()) {
                o(m6VarB.x(it.next()));
            }
            long jR = -2147483647L;
            if (zC) {
                iQ = androidx.media3.common.j.f60676f;
                iC = -2147483647;
                iQ2 = -2147483647;
            } else {
                c0 c0Var = (c0) androidx.media3.common.util.a.g(this.f66054c);
                int iMax = c0Var.k().f61756j;
                iQ = k1.q(iMax, 1000);
                b4 b4VarG = c0Var.g();
                for (int i10 = 0; i10 < b4VarG.f60459a; i10++) {
                    iMax = Math.max(iMax, b4VarG.c(i10).f61756j);
                }
                iQ2 = k1.q(iMax, 1000);
                jR = c0Var.p() != -2147483647L ? k1.r(c0Var.p(), 1000L) : -2147483647L;
                iC = this.f66052a.f65989c.c(iQ);
            }
            b.a aVar = new b.a();
            if (this.f66052a.a()) {
                aVar.g(iQ);
            }
            if (this.f66052a.q()) {
                aVar.k(iQ2);
            }
            if (zD && this.f66052a.j()) {
                aVar.i(k1.A2(this.f66060i));
            }
            if (this.f66052a.k()) {
                aVar.j(this.f66061j);
            }
            if (m6VarB.containsKey(androidx.media3.exoplayer.upstream.f.f65966f)) {
                aVar.h(m6VarB.x(androidx.media3.exoplayer.upstream.f.f65966f));
            }
            c.a aVar2 = new c.a();
            if (zD) {
                if (this.f66052a.b()) {
                    aVar2.i(k1.A2(this.f66055d));
                }
                if (this.f66052a.e()) {
                    aVar2.k(k1.A2((long) (this.f66055d / this.f66056e)));
                }
            }
            if (this.f66052a.g()) {
                aVar2.l(jR);
            }
            if (this.f66052a.n()) {
                aVar2.o(this.f66058g || this.f66059h);
            }
            if (this.f66052a.h()) {
                aVar2.m(this.f66062k);
            }
            if (this.f66052a.i()) {
                aVar2.n(this.f66063l);
            }
            if (m6VarB.containsKey(androidx.media3.exoplayer.upstream.f.f65967g)) {
                aVar2.j(m6VarB.x(androidx.media3.exoplayer.upstream.f.f65967g));
            }
            d.a aVar3 = new d.a();
            if (this.f66052a.d()) {
                aVar3.h(this.f66052a.f65988b);
            }
            if (this.f66052a.m()) {
                aVar3.k(this.f66052a.f65987a);
            }
            if (this.f66052a.p()) {
                aVar3.m(this.f66053b);
            }
            if (this.f66057f != null && this.f66052a.o()) {
                aVar3.l(((Boolean) androidx.media3.common.util.a.g(this.f66057f)).booleanValue() ? h.f65996j : "v");
            }
            if (this.f66052a.l()) {
                aVar3.j(this.f66056e);
            }
            if (m6VarB.containsKey(androidx.media3.exoplayer.upstream.f.f65968h)) {
                aVar3.i(m6VarB.x(androidx.media3.exoplayer.upstream.f.f65968h));
            }
            e.a aVar4 = new e.a();
            if (this.f66052a.f()) {
                aVar4.g(iC);
            }
            if (this.f66052a.c()) {
                aVar4.e(this.f66058g);
            }
            if (m6VarB.containsKey(androidx.media3.exoplayer.upstream.f.f65969i)) {
                aVar4.f(m6VarB.x(androidx.media3.exoplayer.upstream.f.f65969i));
            }
            return new h(aVar.f(), aVar2.h(), aVar3.g(), aVar4.d(), this.f66052a.f65990d);
        }

        @z7.a
        public f e(long j10) {
            androidx.media3.common.util.a.a(j10 >= 0);
            this.f66055d = j10;
            return this;
        }

        @z7.a
        public f f(long j10) {
            androidx.media3.common.util.a.a(j10 >= 0);
            this.f66060i = j10;
            return this;
        }

        @z7.a
        public f g(boolean z10) {
            this.f66058g = z10;
            return this;
        }

        @z7.a
        public f h(boolean z10) {
            this.f66059h = z10;
            return this;
        }

        @z7.a
        public f i(boolean z10) {
            this.f66057f = Boolean.valueOf(z10);
            return this;
        }

        @z7.a
        public f j(@p0 String str) {
            this.f66062k = str;
            return this;
        }

        @z7.a
        public f k(@p0 String str) {
            this.f66063l = str;
            return this;
        }

        @z7.a
        public f l(@p0 String str) {
            this.f66061j = str;
            return this;
        }

        @z7.a
        public f m(float f10) {
            androidx.media3.common.util.a.a(f10 == -3.4028235E38f || f10 > 0.0f);
            this.f66056e = f10;
            return this;
        }

        @z7.a
        public f n(c0 c0Var) {
            this.f66054c = c0Var;
            return this;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.upstream.h$h, reason: collision with other inner class name */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0597h {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface i {
    }

    public x a(x xVar) {
        com.google.common.collect.s<String, String> sVarJ = com.google.common.collect.s.J();
        this.f66003a.a(sVarJ);
        this.f66004b.a(sVarJ);
        this.f66005c.a(sVarJ);
        this.f66006d.a(sVarJ);
        if (this.f66007e != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = sVarJ.l().values().iterator();
            while (it.hasNext()) {
                arrayList.addAll((Collection) it.next());
            }
            Collections.sort(arrayList);
            return xVar.a().j(xVar.f62594a.buildUpon().appendQueryParameter(androidx.media3.exoplayer.upstream.f.f65970j, f66002p.k(arrayList)).build()).a();
        }
        n6.b bVarB = n6.b();
        for (String str : sVarJ.keySet()) {
            List listX = sVarJ.x((Object) str);
            Collections.sort(listX);
            bVarB.i(str, f66002p.k(listX));
        }
        return xVar.g(bVarB.d());
    }

    private h(b bVar, c cVar, d dVar, e eVar, int i10) {
        this.f66003a = bVar;
        this.f66004b = cVar;
        this.f66005c = dVar;
        this.f66006d = eVar;
        this.f66007e = i10;
    }
}
