package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@k8.a
@u7.d
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f121574a = Charset.forName("UTF-8");

    @u7.d
    public static abstract class a {

        /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.f0$a$a, reason: collision with other inner class name */
        @u7.d
        public static abstract class AbstractC1129a {

            /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.f0$a$a$a, reason: collision with other inner class name */
            @u7.d.a
            public static abstract class AbstractC1130a {
                @NonNull
                public abstract AbstractC1129a a();

                @NonNull
                public abstract AbstractC1130a b(@NonNull String str);

                @NonNull
                public abstract AbstractC1130a c(@NonNull String str);

                @NonNull
                public abstract AbstractC1130a d(@NonNull String str);
            }

            @NonNull
            public static AbstractC1130a a() {
                return new com.google.firebase.crashlytics.internal.model.d.b();
            }

            @NonNull
            public abstract String b();

            @NonNull
            public abstract String c();

            @NonNull
            public abstract String d();
        }

        @u7.d.a
        public static abstract class b {
            @NonNull
            public abstract a a();

            @NonNull
            public abstract b b(@p0 List<AbstractC1129a> list);

            @NonNull
            public abstract b c(@NonNull int i10);

            @NonNull
            public abstract b d(@NonNull int i10);

            @NonNull
            public abstract b e(@NonNull String str);

            @NonNull
            public abstract b f(@NonNull long j10);

            @NonNull
            public abstract b g(@NonNull int i10);

            @NonNull
            public abstract b h(@NonNull long j10);

            @NonNull
            public abstract b i(@NonNull long j10);

            @NonNull
            public abstract b j(@p0 String str);
        }

        @NonNull
        public static b a() {
            return new com.google.firebase.crashlytics.internal.model.c.b();
        }

        @p0
        public abstract List<AbstractC1129a> b();

        @NonNull
        public abstract int c();

        @NonNull
        public abstract int d();

        @NonNull
        public abstract String e();

        @NonNull
        public abstract long f();

        @NonNull
        public abstract int g();

        @NonNull
        public abstract long h();

        @NonNull
        public abstract long i();

        @p0
        public abstract String j();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
        public static final int S1 = 5;
        public static final int T1 = 6;
        public static final int U1 = 9;
        public static final int V1 = 0;
        public static final int W1 = 1;
        public static final int X1 = 7;
    }

    @u7.d.a
    public static abstract class c {
        @NonNull
        public abstract f0 a();

        @NonNull
        public abstract c b(a aVar);

        @NonNull
        public abstract c c(@p0 String str);

        @NonNull
        public abstract c d(@NonNull String str);

        @NonNull
        public abstract c e(@NonNull String str);

        @NonNull
        public abstract c f(@p0 String str);

        @NonNull
        public abstract c g(@p0 String str);

        @NonNull
        public abstract c h(@NonNull String str);

        @NonNull
        public abstract c i(@NonNull String str);

        @NonNull
        public abstract c j(e eVar);

        @NonNull
        public abstract c k(int i10);

        @NonNull
        public abstract c l(@NonNull String str);

        @NonNull
        public abstract c m(@NonNull f fVar);
    }

    @u7.d
    public static abstract class d {

        @u7.d.a
        public static abstract class a {
            @NonNull
            public abstract d a();

            @NonNull
            public abstract a b(@NonNull String str);

            @NonNull
            public abstract a c(@NonNull String str);
        }

        @NonNull
        public static a a() {
            return new com.google.firebase.crashlytics.internal.model.e.b();
        }

        @NonNull
        public abstract String b();

        @NonNull
        public abstract String c();
    }

    @u7.d
    public static abstract class e {

        @u7.d.a
        public static abstract class a {
            public abstract e a();

            public abstract a b(List<b> list);

            public abstract a c(String str);
        }

        @u7.d
        public static abstract class b {

            @u7.d.a
            public static abstract class a {
                public abstract b a();

                public abstract a b(byte[] bArr);

                public abstract a c(String str);
            }

            @NonNull
            public static a a() {
                return new com.google.firebase.crashlytics.internal.model.g.b();
            }

            @NonNull
            public abstract byte[] b();

            @NonNull
            public abstract String c();
        }

        @NonNull
        public static a a() {
            return new com.google.firebase.crashlytics.internal.model.f.b();
        }

        @NonNull
        public abstract List<b> b();

        @p0
        public abstract String c();

        abstract a d();
    }

    @u7.d
    public static abstract class f {

        @u7.d
        public static abstract class a {

            /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.f0$f$a$a, reason: collision with other inner class name */
            @u7.d.a
            public static abstract class AbstractC1131a {
                @NonNull
                public abstract a a();

                @NonNull
                public abstract AbstractC1131a b(@p0 String str);

                @NonNull
                public abstract AbstractC1131a c(@p0 String str);

                @NonNull
                public abstract AbstractC1131a d(@NonNull String str);

                @NonNull
                public abstract AbstractC1131a e(@NonNull String str);

                @NonNull
                public abstract AbstractC1131a f(@NonNull String str);

                @NonNull
                public abstract AbstractC1131a g(@NonNull b bVar);

                @NonNull
                public abstract AbstractC1131a h(@NonNull String str);
            }

            @u7.d
            public static abstract class b {

                /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.f0$f$a$b$a, reason: collision with other inner class name */
                @u7.d.a
                public static abstract class AbstractC1132a {
                    @NonNull
                    public abstract b a();

                    @NonNull
                    public abstract AbstractC1132a b(@NonNull String str);
                }

                @NonNull
                public static AbstractC1132a a() {
                    return new j.b();
                }

                @NonNull
                public abstract String b();

                @NonNull
                protected abstract AbstractC1132a c();
            }

            @NonNull
            public static AbstractC1131a a() {
                return new i.b();
            }

            @p0
            public abstract String b();

            @p0
            public abstract String c();

            @p0
            public abstract String d();

            @NonNull
            public abstract String e();

            @p0
            public abstract String f();

            @p0
            public abstract b g();

            @NonNull
            public abstract String h();

            @NonNull
            protected abstract AbstractC1131a i();

            @NonNull
            a j(@NonNull String str) {
                b bVarG = g();
                return i().g((bVarG != null ? bVarG.c() : b.a()).b(str).a()).a();
            }
        }

        @u7.d.a
        public static abstract class b {
            @NonNull
            public abstract f a();

            @NonNull
            public abstract b b(@NonNull a aVar);

            @NonNull
            public abstract b c(@p0 String str);

            @NonNull
            public abstract b d(boolean z10);

            @NonNull
            public abstract b e(@NonNull c cVar);

            @NonNull
            public abstract b f(@NonNull Long l10);

            @NonNull
            public abstract b g(@NonNull List<d> list);

            @NonNull
            public abstract b h(@NonNull String str);

            @NonNull
            public abstract b i(int i10);

            @NonNull
            public abstract b j(@NonNull String str);

            @NonNull
            public b k(@NonNull byte[] bArr) {
                return j(new String(bArr, f0.f121574a));
            }

            @NonNull
            public abstract b l(@NonNull e eVar);

            @NonNull
            public abstract b m(long j10);

            @NonNull
            public abstract b n(@NonNull AbstractC1146f abstractC1146f);
        }

        @u7.d
        public static abstract class c {

            @u7.d.a
            public static abstract class a {
                @NonNull
                public abstract c a();

                @NonNull
                public abstract a b(int i10);

                @NonNull
                public abstract a c(int i10);

                @NonNull
                public abstract a d(long j10);

                @NonNull
                public abstract a e(@NonNull String str);

                @NonNull
                public abstract a f(@NonNull String str);

                @NonNull
                public abstract a g(@NonNull String str);

                @NonNull
                public abstract a h(long j10);

                @NonNull
                public abstract a i(boolean z10);

                @NonNull
                public abstract a j(int i10);
            }

            @NonNull
            public static a a() {
                return new k.b();
            }

            @NonNull
            public abstract int b();

            public abstract int c();

            public abstract long d();

            @NonNull
            public abstract String e();

            @NonNull
            public abstract String f();

            @NonNull
            public abstract String g();

            public abstract long h();

            public abstract int i();

            public abstract boolean j();
        }

        @u7.d
        public static abstract class d {

            @u7.d
            public static abstract class a {

                /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$a$a, reason: collision with other inner class name */
                @u7.d.a
                public static abstract class AbstractC1133a {
                    @NonNull
                    public abstract a a();

                    @NonNull
                    public abstract AbstractC1133a b(@p0 List<c> list);

                    @NonNull
                    public abstract AbstractC1133a c(@p0 Boolean bool);

                    @NonNull
                    public abstract AbstractC1133a d(@p0 c cVar);

                    @NonNull
                    public abstract AbstractC1133a e(@NonNull List<d> list);

                    @NonNull
                    public abstract AbstractC1133a f(@NonNull b bVar);

                    @NonNull
                    public abstract AbstractC1133a g(@NonNull List<d> list);

                    @NonNull
                    public abstract AbstractC1133a h(int i10);
                }

                @u7.d
                public static abstract class b {

                    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$a$b$a, reason: collision with other inner class name */
                    @u7.d
                    public static abstract class AbstractC1134a {

                        /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$a$b$a$a, reason: collision with other inner class name */
                        @u7.d.a
                        public static abstract class AbstractC1135a {
                            @NonNull
                            public abstract AbstractC1134a a();

                            @NonNull
                            public abstract AbstractC1135a b(long j10);

                            @NonNull
                            public abstract AbstractC1135a c(@NonNull String str);

                            @NonNull
                            public abstract AbstractC1135a d(long j10);

                            @NonNull
                            public abstract AbstractC1135a e(@p0 String str);

                            @NonNull
                            public AbstractC1135a f(@NonNull byte[] bArr) {
                                return e(new String(bArr, f0.f121574a));
                            }
                        }

                        @NonNull
                        public static AbstractC1135a a() {
                            return new o.b();
                        }

                        @NonNull
                        public abstract long b();

                        @NonNull
                        public abstract String c();

                        public abstract long d();

                        @k8.a.b
                        @p0
                        public abstract String e();

                        @k8.a.InterfaceC2244a(name = "uuid")
                        @p0
                        public byte[] f() {
                            String strE = e();
                            if (strE != null) {
                                return strE.getBytes(f0.f121574a);
                            }
                            return null;
                        }
                    }

                    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$a$b$b, reason: collision with other inner class name */
                    @u7.d.a
                    public static abstract class AbstractC1136b {
                        @NonNull
                        public abstract b a();

                        @NonNull
                        public abstract AbstractC1136b b(@NonNull a aVar);

                        @NonNull
                        public abstract AbstractC1136b c(@NonNull List<AbstractC1134a> list);

                        @NonNull
                        public abstract AbstractC1136b d(@NonNull c cVar);

                        @NonNull
                        public abstract AbstractC1136b e(@NonNull AbstractC1138d abstractC1138d);

                        @NonNull
                        public abstract AbstractC1136b f(@NonNull List<e> list);
                    }

                    @u7.d
                    public static abstract class c {

                        /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$a$b$c$a, reason: collision with other inner class name */
                        @u7.d.a
                        public static abstract class AbstractC1137a {
                            @NonNull
                            public abstract c a();

                            @NonNull
                            public abstract AbstractC1137a b(@NonNull c cVar);

                            @NonNull
                            public abstract AbstractC1137a c(@NonNull List<e.AbstractC1141b> list);

                            @NonNull
                            public abstract AbstractC1137a d(int i10);

                            @NonNull
                            public abstract AbstractC1137a e(@NonNull String str);

                            @NonNull
                            public abstract AbstractC1137a f(@NonNull String str);
                        }

                        @NonNull
                        public static AbstractC1137a a() {
                            return new p.b();
                        }

                        @p0
                        public abstract c b();

                        @NonNull
                        public abstract List<e.AbstractC1141b> c();

                        public abstract int d();

                        @p0
                        public abstract String e();

                        @NonNull
                        public abstract String f();
                    }

                    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$a$b$d, reason: collision with other inner class name */
                    @u7.d
                    public static abstract class AbstractC1138d {

                        /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$a$b$d$a, reason: collision with other inner class name */
                        @u7.d.a
                        public static abstract class AbstractC1139a {
                            @NonNull
                            public abstract AbstractC1138d a();

                            @NonNull
                            public abstract AbstractC1139a b(long j10);

                            @NonNull
                            public abstract AbstractC1139a c(@NonNull String str);

                            @NonNull
                            public abstract AbstractC1139a d(@NonNull String str);
                        }

                        @NonNull
                        public static AbstractC1139a a() {
                            return new q.b();
                        }

                        @NonNull
                        public abstract long b();

                        @NonNull
                        public abstract String c();

                        @NonNull
                        public abstract String d();
                    }

                    @u7.d
                    public static abstract class e {

                        /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$a$b$e$a, reason: collision with other inner class name */
                        @u7.d.a
                        public static abstract class AbstractC1140a {
                            @NonNull
                            public abstract e a();

                            @NonNull
                            public abstract AbstractC1140a b(@NonNull List<AbstractC1141b> list);

                            @NonNull
                            public abstract AbstractC1140a c(int i10);

                            @NonNull
                            public abstract AbstractC1140a d(@NonNull String str);
                        }

                        /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$a$b$e$b, reason: collision with other inner class name */
                        @u7.d
                        public static abstract class AbstractC1141b {

                            /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$a$b$e$b$a, reason: collision with other inner class name */
                            @u7.d.a
                            public static abstract class AbstractC1142a {
                                @NonNull
                                public abstract AbstractC1141b a();

                                @NonNull
                                public abstract AbstractC1142a b(@NonNull String str);

                                @NonNull
                                public abstract AbstractC1142a c(int i10);

                                @NonNull
                                public abstract AbstractC1142a d(long j10);

                                @NonNull
                                public abstract AbstractC1142a e(long j10);

                                @NonNull
                                public abstract AbstractC1142a f(@NonNull String str);
                            }

                            @NonNull
                            public static AbstractC1142a a() {
                                return new s.b();
                            }

                            @p0
                            public abstract String b();

                            public abstract int c();

                            public abstract long d();

                            public abstract long e();

                            @NonNull
                            public abstract String f();
                        }

                        @NonNull
                        public static AbstractC1140a a() {
                            return new r.b();
                        }

                        @NonNull
                        public abstract List<AbstractC1141b> b();

                        public abstract int c();

                        @NonNull
                        public abstract String d();
                    }

                    @NonNull
                    public static AbstractC1136b a() {
                        return new n.b();
                    }

                    @p0
                    public abstract a b();

                    @NonNull
                    public abstract List<AbstractC1134a> c();

                    @p0
                    public abstract c d();

                    @NonNull
                    public abstract AbstractC1138d e();

                    @p0
                    public abstract List<e> f();
                }

                @u7.d
                public static abstract class c {

                    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$a$c$a, reason: collision with other inner class name */
                    @u7.d.a
                    public static abstract class AbstractC1143a {
                        @NonNull
                        public abstract c a();

                        @NonNull
                        public abstract AbstractC1143a b(boolean z10);

                        @NonNull
                        public abstract AbstractC1143a c(int i10);

                        @NonNull
                        public abstract AbstractC1143a d(int i10);

                        @NonNull
                        public abstract AbstractC1143a e(@NonNull String str);
                    }

                    @NonNull
                    public static AbstractC1143a a() {
                        return new t.b();
                    }

                    public abstract int b();

                    public abstract int c();

                    @NonNull
                    public abstract String d();

                    public abstract boolean e();
                }

                @NonNull
                public static AbstractC1133a a() {
                    return new m.b();
                }

                @p0
                public abstract List<c> b();

                @p0
                public abstract Boolean c();

                @p0
                public abstract c d();

                @p0
                public abstract List<d> e();

                @NonNull
                public abstract b f();

                @p0
                public abstract List<d> g();

                public abstract int h();

                @NonNull
                public abstract AbstractC1133a i();
            }

            @u7.d.a
            public static abstract class b {
                @NonNull
                public abstract d a();

                @NonNull
                public abstract b b(@NonNull a aVar);

                @NonNull
                public abstract b c(@NonNull c cVar);

                @NonNull
                public abstract b d(@NonNull AbstractC1144d abstractC1144d);

                @NonNull
                public abstract b e(@NonNull AbstractC1145f abstractC1145f);

                @NonNull
                public abstract b f(long j10);

                @NonNull
                public abstract b g(@NonNull String str);
            }

            @u7.d
            public static abstract class c {

                @u7.d.a
                public static abstract class a {
                    @NonNull
                    public abstract c a();

                    @NonNull
                    public abstract a b(Double d10);

                    @NonNull
                    public abstract a c(int i10);

                    @NonNull
                    public abstract a d(long j10);

                    @NonNull
                    public abstract a e(int i10);

                    @NonNull
                    public abstract a f(boolean z10);

                    @NonNull
                    public abstract a g(long j10);
                }

                @NonNull
                public static a a() {
                    return new u.b();
                }

                @p0
                public abstract Double b();

                public abstract int c();

                public abstract long d();

                public abstract int e();

                public abstract long f();

                public abstract boolean g();
            }

            /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$d, reason: collision with other inner class name */
            @u7.d
            public static abstract class AbstractC1144d {

                /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$d$a */
                @u7.d.a
                public static abstract class a {
                    @NonNull
                    public abstract AbstractC1144d a();

                    @NonNull
                    public abstract a b(@NonNull String str);
                }

                @NonNull
                public static a a() {
                    return new v.b();
                }

                @NonNull
                public abstract String b();
            }

            @u7.d
            public static abstract class e {

                @u7.d.a
                public static abstract class a {
                    @NonNull
                    public abstract e a();

                    @NonNull
                    public abstract a b(@NonNull String str);

                    @NonNull
                    public abstract a c(@NonNull String str);

                    @NonNull
                    public abstract a d(@NonNull b bVar);

                    @NonNull
                    public abstract a e(@NonNull long j10);
                }

                @u7.d
                public static abstract class b {

                    @u7.d.a
                    public static abstract class a {
                        @NonNull
                        public abstract b a();

                        @NonNull
                        public abstract a b(@NonNull String str);

                        @NonNull
                        public abstract a c(@NonNull String str);
                    }

                    public static a a() {
                        return new x.b();
                    }

                    @NonNull
                    public abstract String b();

                    @NonNull
                    public abstract String c();
                }

                @NonNull
                public static a a() {
                    return new w.b();
                }

                @NonNull
                public abstract String b();

                @NonNull
                public abstract String c();

                @NonNull
                public abstract b d();

                @NonNull
                public abstract long e();
            }

            /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$f, reason: collision with other inner class name */
            @u7.d
            public static abstract class AbstractC1145f {

                /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.f0$f$d$f$a */
                @u7.d.a
                public static abstract class a {
                    @NonNull
                    public abstract AbstractC1145f a();

                    @NonNull
                    public abstract a b(@NonNull List<e> list);
                }

                @NonNull
                public static a a() {
                    return new y.b();
                }

                @NonNull
                @k8.a.InterfaceC2244a(name = "assignments")
                public abstract List<e> b();
            }

            @NonNull
            public static b a() {
                return new l.b();
            }

            @NonNull
            public abstract a b();

            @NonNull
            public abstract c c();

            @p0
            public abstract AbstractC1144d d();

            @p0
            public abstract AbstractC1145f e();

            public abstract long f();

            @NonNull
            public abstract String g();

            @NonNull
            public abstract b h();
        }

        @u7.d
        public static abstract class e {

            @u7.d.a
            public static abstract class a {
                @NonNull
                public abstract e a();

                @NonNull
                public abstract a b(@NonNull String str);

                @NonNull
                public abstract a c(boolean z10);

                @NonNull
                public abstract a d(int i10);

                @NonNull
                public abstract a e(@NonNull String str);
            }

            @NonNull
            public static a a() {
                return new z.b();
            }

            @NonNull
            public abstract String b();

            public abstract int c();

            @NonNull
            public abstract String d();

            public abstract boolean e();
        }

        /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.f0$f$f, reason: collision with other inner class name */
        @u7.d
        public static abstract class AbstractC1146f {

            /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.f0$f$f$a */
            @u7.d.a
            public static abstract class a {
                @NonNull
                public abstract AbstractC1146f a();

                @NonNull
                public abstract a b(@NonNull String str);
            }

            @NonNull
            public static a a() {
                return new a0.b();
            }

            @NonNull
            public abstract String b();
        }

        @NonNull
        public static b a() {
            return new h.b().d(false);
        }

        @NonNull
        public abstract a b();

        @p0
        public abstract String c();

        @p0
        public abstract c d();

        @p0
        public abstract Long e();

        @p0
        public abstract List<d> f();

        @NonNull
        public abstract String g();

        public abstract int h();

        @NonNull
        @k8.a.b
        public abstract String i();

        @NonNull
        @k8.a.InterfaceC2244a(name = "identifier")
        public byte[] j() {
            return i().getBytes(f0.f121574a);
        }

        @p0
        public abstract e k();

        public abstract long l();

        @p0
        public abstract AbstractC1146f m();

        public abstract boolean n();

        @NonNull
        public abstract b o();

        @NonNull
        f p(@p0 String str) {
            return o().c(str).a();
        }

        @NonNull
        f q(@NonNull List<d> list) {
            return o().g(list).a();
        }

        @NonNull
        f r(@NonNull String str) {
            return o().b(b().j(str)).a();
        }

        @NonNull
        f s(long j10, boolean z10, @p0 String str) {
            b bVarO = o();
            bVarO.f(Long.valueOf(j10));
            bVarO.d(z10);
            if (str != null) {
                bVarO.n(AbstractC1146f.a().b(str).a());
            }
            return bVarO.a();
        }
    }

    public enum g {
        INCOMPLETE,
        JAVA,
        NATIVE
    }

    @NonNull
    public static c b() {
        return new com.google.firebase.crashlytics.internal.model.b.C1128b();
    }

    @p0
    public abstract a c();

    @p0
    public abstract String d();

    @NonNull
    public abstract String e();

    @NonNull
    public abstract String f();

    @p0
    public abstract String g();

    @p0
    public abstract String h();

    @NonNull
    public abstract String i();

    @NonNull
    public abstract String j();

    @p0
    public abstract e k();

    public abstract int l();

    @NonNull
    public abstract String m();

    @p0
    public abstract f n();

    @k8.a.b
    public g o() {
        if (n() != null) {
            return g.JAVA;
        }
        return k() != null ? g.NATIVE : g.INCOMPLETE;
    }

    @NonNull
    protected abstract c p();

    @NonNull
    public f0 q(@p0 String str) {
        c cVarC = p().c(str);
        if (n() != null) {
            cVarC.m(n().p(str));
        }
        return cVarC.a();
    }

    @NonNull
    public f0 r(a aVar) {
        return aVar == null ? this : p().b(aVar).a();
    }

    @NonNull
    public f0 s(@NonNull List<f.d> list) {
        if (n() != null) {
            return p().m(n().q(list)).a();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    @NonNull
    public f0 t(@p0 String str) {
        return p().f(str).a();
    }

    @NonNull
    public f0 u(@p0 String str) {
        return p().g(str).a();
    }

    @NonNull
    public f0 v(@NonNull e eVar) {
        return p().m(null).j(eVar).a();
    }

    @NonNull
    public f0 w(@NonNull String str) {
        c cVarP = p();
        e eVarK = k();
        if (eVarK != null) {
            cVarP.j(eVarK.d().c(str).a());
        }
        f fVarN = n();
        if (fVarN != null) {
            cVarP.m(fVarN.r(str));
        }
        return cVarP.a();
    }

    @NonNull
    public f0 x(long j10, boolean z10, @p0 String str) {
        c cVarP = p();
        if (n() != null) {
            cVarP.m(n().s(j10, z10, str));
        }
        return cVarP.a();
    }
}
