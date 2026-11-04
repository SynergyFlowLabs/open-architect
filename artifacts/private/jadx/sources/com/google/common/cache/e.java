package com.google.common.cache;

import com.google.common.base.j0;
import com.google.common.base.o0;
import com.google.common.base.r0;
import com.google.common.collect.l6;
import com.google.common.collect.n6;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.c
@com.google.common.cache.i
public final class e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final o0 f116784o = o0.h(AbstractJsonLexerKt.COMMA).q();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final o0 f116785p = o0.h('=').q();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final n6<String, m> f116786q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.google.common.annotations.e
    @fj.a
    Integer f116787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.google.common.annotations.e
    @fj.a
    Long f116788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.google.common.annotations.e
    @fj.a
    Long f116789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @com.google.common.annotations.e
    @fj.a
    Integer f116790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @com.google.common.annotations.e
    @fj.a
    com.google.common.cache.n.t f116791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @com.google.common.annotations.e
    @fj.a
    com.google.common.cache.n.t f116792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @com.google.common.annotations.e
    @fj.a
    Boolean f116793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.google.common.annotations.e
    long f116794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @com.google.common.annotations.e
    @fj.a
    TimeUnit f116795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @com.google.common.annotations.e
    long f116796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @com.google.common.annotations.e
    @fj.a
    TimeUnit f116797k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @com.google.common.annotations.e
    long f116798l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @com.google.common.annotations.e
    @fj.a
    TimeUnit f116799m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f116800n;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116801a;

        static {
            int[] iArr = new int[com.google.common.cache.n.t.values().length];
            f116801a = iArr;
            try {
                iArr[com.google.common.cache.n.t.f116949c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116801a[com.google.common.cache.n.t.f116948b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static class b extends d {
        b() {
        }

        @Override // com.google.common.cache.e.d
        protected void b(e spec, long duration, TimeUnit unit) {
            j0.e(spec.f116797k == null, "expireAfterAccess already set");
            spec.f116796j = duration;
            spec.f116797k = unit;
        }
    }

    static class c extends f {
        c() {
        }

        @Override // com.google.common.cache.e.f
        protected void b(e spec, int value) {
            Integer num = spec.f116790d;
            j0.u(num == null, "concurrency level was already set to %s", num);
            spec.f116790d = Integer.valueOf(value);
        }
    }

    static abstract class d implements m {
        d() {
        }

        @Override // com.google.common.cache.e.m
        public void a(e spec, String key, @fj.a String value) {
            TimeUnit timeUnit;
            if (r0.d(value)) {
                throw new IllegalArgumentException("value of key " + key + " omitted");
            }
            try {
                char cCharAt = value.charAt(value.length() - 1);
                if (cCharAt == 'd') {
                    timeUnit = TimeUnit.DAYS;
                } else if (cCharAt == 'h') {
                    timeUnit = TimeUnit.HOURS;
                } else if (cCharAt == 'm') {
                    timeUnit = TimeUnit.MINUTES;
                } else {
                    if (cCharAt != 's') {
                        throw new IllegalArgumentException(e.d("key %s invalid unit: was %s, must end with one of [dhms]", key, value));
                    }
                    timeUnit = TimeUnit.SECONDS;
                }
                b(spec, Long.parseLong(value.substring(0, value.length() - 1)), timeUnit);
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(e.d("key %s value set to %s, must be integer", key, value));
            }
        }

        protected abstract void b(e spec, long duration, TimeUnit unit);
    }

    /* JADX INFO: renamed from: com.google.common.cache.e$e, reason: collision with other inner class name */
    static class C1050e extends f {
        C1050e() {
        }

        @Override // com.google.common.cache.e.f
        protected void b(e spec, int value) {
            Integer num = spec.f116787a;
            j0.u(num == null, "initial capacity was already set to %s", num);
            spec.f116787a = Integer.valueOf(value);
        }
    }

    static abstract class f implements m {
        f() {
        }

        @Override // com.google.common.cache.e.m
        public void a(e spec, String key, String value) {
            if (!r0.d(value)) {
                try {
                    b(spec, Integer.parseInt(value));
                } catch (NumberFormatException e10) {
                    throw new IllegalArgumentException(e.d("key %s value set to %s, must be integer", key, value), e10);
                }
            } else {
                throw new IllegalArgumentException("value of key " + key + " omitted");
            }
        }

        protected abstract void b(e spec, int value);
    }

    static class g implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.common.cache.n.t f116802a;

        public g(com.google.common.cache.n.t strength) {
            this.f116802a = strength;
        }

        @Override // com.google.common.cache.e.m
        public void a(e spec, String key, @fj.a String value) {
            j0.u(value == null, "key %s does not take values", key);
            com.google.common.cache.n.t tVar = spec.f116791e;
            j0.y(tVar == null, "%s was already set to %s", key, tVar);
            spec.f116791e = this.f116802a;
        }
    }

    static abstract class h implements m {
        h() {
        }

        @Override // com.google.common.cache.e.m
        public void a(e spec, String key, String value) {
            if (!r0.d(value)) {
                try {
                    b(spec, Long.parseLong(value));
                } catch (NumberFormatException e10) {
                    throw new IllegalArgumentException(e.d("key %s value set to %s, must be integer", key, value), e10);
                }
            } else {
                throw new IllegalArgumentException("value of key " + key + " omitted");
            }
        }

        protected abstract void b(e spec, long value);
    }

    static class i extends h {
        i() {
        }

        @Override // com.google.common.cache.e.h
        protected void b(e spec, long value) {
            Long l10 = spec.f116788b;
            j0.u(l10 == null, "maximum size was already set to %s", l10);
            Long l11 = spec.f116789c;
            j0.u(l11 == null, "maximum weight was already set to %s", l11);
            spec.f116788b = Long.valueOf(value);
        }
    }

    static class j extends h {
        j() {
        }

        @Override // com.google.common.cache.e.h
        protected void b(e spec, long value) {
            Long l10 = spec.f116789c;
            j0.u(l10 == null, "maximum weight was already set to %s", l10);
            Long l11 = spec.f116788b;
            j0.u(l11 == null, "maximum size was already set to %s", l11);
            spec.f116789c = Long.valueOf(value);
        }
    }

    static class k implements m {
        k() {
        }

        @Override // com.google.common.cache.e.m
        public void a(e spec, String key, @fj.a String value) {
            j0.e(value == null, "recordStats does not take values");
            j0.e(spec.f116793g == null, "recordStats already set");
            spec.f116793g = Boolean.TRUE;
        }
    }

    static class l extends d {
        l() {
        }

        @Override // com.google.common.cache.e.d
        protected void b(e spec, long duration, TimeUnit unit) {
            j0.e(spec.f116799m == null, "refreshAfterWrite already set");
            spec.f116798l = duration;
            spec.f116799m = unit;
        }
    }

    private interface m {
        void a(e spec, String key, @fj.a String value);
    }

    static class n implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.common.cache.n.t f116803a;

        public n(com.google.common.cache.n.t strength) {
            this.f116803a = strength;
        }

        @Override // com.google.common.cache.e.m
        public void a(e spec, String key, @fj.a String value) {
            j0.u(value == null, "key %s does not take values", key);
            com.google.common.cache.n.t tVar = spec.f116792f;
            j0.y(tVar == null, "%s was already set to %s", key, tVar);
            spec.f116792f = this.f116803a;
        }
    }

    static class o extends d {
        o() {
        }

        @Override // com.google.common.cache.e.d
        protected void b(e spec, long duration, TimeUnit unit) {
            j0.e(spec.f116795i == null, "expireAfterWrite already set");
            spec.f116794h = duration;
            spec.f116795i = unit;
        }
    }

    static {
        n6.b bVarI = n6.b().i("initialCapacity", new C1050e()).i("maximumSize", new i()).i("maximumWeight", new j()).i("concurrencyLevel", new c());
        com.google.common.cache.n.t tVar = com.google.common.cache.n.t.f116949c;
        f116786q = bVarI.i("weakKeys", new g(tVar)).i("softValues", new n(com.google.common.cache.n.t.f116948b)).i("weakValues", new n(tVar)).i("recordStats", new k()).i("expireAfterAccess", new b()).i("expireAfterWrite", new o()).i("refreshAfterWrite", new l()).i("refreshInterval", new l()).d();
    }

    private e(String specification) {
        this.f116800n = specification;
    }

    public static e b() {
        return e("maximumSize=0");
    }

    @fj.a
    private static Long c(long duration, @fj.a TimeUnit unit) {
        if (unit == null) {
            return null;
        }
        return Long.valueOf(unit.toNanos(duration));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String format, Object... args) {
        return String.format(Locale.ROOT, format, args);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e e(String cacheBuilderSpecification) {
        e eVar = new e(cacheBuilderSpecification);
        if (!cacheBuilderSpecification.isEmpty()) {
            for (String str : f116784o.n(cacheBuilderSpecification)) {
                l6 l6VarV = l6.v(f116785p.n(str));
                j0.e(!l6VarV.isEmpty(), "blank key-value pair");
                j0.u(l6VarV.size() <= 2, "key-value pair %s with more than one equals sign", str);
                String str2 = (String) l6VarV.get(0);
                m mVar = f116786q.get(str2);
                j0.u(mVar != null, "unknown key %s", str2);
                mVar.a(eVar, str2, l6VarV.size() == 1 ? null : (String) l6VarV.get(1));
            }
        }
        return eVar;
    }

    public boolean equals(@fj.a Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return com.google.common.base.d0.a(this.f116787a, eVar.f116787a) && com.google.common.base.d0.a(this.f116788b, eVar.f116788b) && com.google.common.base.d0.a(this.f116789c, eVar.f116789c) && com.google.common.base.d0.a(this.f116790d, eVar.f116790d) && com.google.common.base.d0.a(this.f116791e, eVar.f116791e) && com.google.common.base.d0.a(this.f116792f, eVar.f116792f) && com.google.common.base.d0.a(this.f116793g, eVar.f116793g) && com.google.common.base.d0.a(c(this.f116794h, this.f116795i), c(eVar.f116794h, eVar.f116795i)) && com.google.common.base.d0.a(c(this.f116796j, this.f116797k), c(eVar.f116796j, eVar.f116797k)) && com.google.common.base.d0.a(c(this.f116798l, this.f116799m), c(eVar.f116798l, eVar.f116799m));
    }

    com.google.common.cache.d<Object, Object> f() {
        com.google.common.cache.d<Object, Object> dVarF = com.google.common.cache.d.F();
        Integer num = this.f116787a;
        if (num != null) {
            dVarF.z(num.intValue());
        }
        Long l10 = this.f116788b;
        if (l10 != null) {
            dVarF.D(l10.longValue());
        }
        Long l11 = this.f116789c;
        if (l11 != null) {
            dVarF.E(l11.longValue());
        }
        Integer num2 = this.f116790d;
        if (num2 != null) {
            dVarF.e(num2.intValue());
        }
        com.google.common.cache.n.t tVar = this.f116791e;
        if (tVar != null) {
            if (a.f116801a[tVar.ordinal()] != 1) {
                throw new AssertionError();
            }
            dVarF.Q();
        }
        com.google.common.cache.n.t tVar2 = this.f116792f;
        if (tVar2 != null) {
            int i10 = a.f116801a[tVar2.ordinal()];
            if (i10 == 1) {
                dVarF.R();
            } else {
                if (i10 != 2) {
                    throw new AssertionError();
                }
                dVarF.M();
            }
        }
        Boolean bool = this.f116793g;
        if (bool != null && bool.booleanValue()) {
            dVarF.G();
        }
        TimeUnit timeUnit = this.f116795i;
        if (timeUnit != null) {
            dVarF.h(this.f116794h, timeUnit);
        }
        TimeUnit timeUnit2 = this.f116797k;
        if (timeUnit2 != null) {
            dVarF.f(this.f116796j, timeUnit2);
        }
        TimeUnit timeUnit3 = this.f116799m;
        if (timeUnit3 != null) {
            dVarF.H(this.f116798l, timeUnit3);
        }
        return dVarF;
    }

    public String g() {
        return this.f116800n;
    }

    public int hashCode() {
        return com.google.common.base.d0.b(this.f116787a, this.f116788b, this.f116789c, this.f116790d, this.f116791e, this.f116792f, this.f116793g, c(this.f116794h, this.f116795i), c(this.f116796j, this.f116797k), c(this.f116798l, this.f116799m));
    }

    public String toString() {
        return com.google.common.base.b0.c(this).s(g()).toString();
    }
}
