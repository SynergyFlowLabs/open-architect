package com.rabbitmq.client;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f264830a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f264831b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f264832c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f264833d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f264834e = 4096;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f264835f = 206;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f264836g = 200;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f264837h = 311;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f264838i = 312;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f264839j = 313;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f264840k = 403;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f264841l = 404;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f264842m = 405;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f264843n = 406;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f264844o = 320;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f264845p = 402;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f264846q = 501;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f264847r = 502;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f264848s = 503;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f264849t = 504;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f264850u = 505;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f264851v = 506;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f264852w = 530;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f264853x = 540;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f264854y = 541;

    /* JADX INFO: renamed from: com.rabbitmq.client.a$a, reason: collision with other inner class name */
    public static class C1753a {

        /* JADX INFO: renamed from: com.rabbitmq.client.a$a$a, reason: collision with other inner class name */
        public interface InterfaceC1754a extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$a$a$a, reason: collision with other inner class name */
            public static final class C1755a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private String f264855a = "/data";

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private boolean f264856b = false;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f264857c = true;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private boolean f264858d = true;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private boolean f264859e = true;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private boolean f264860f = true;

                public C1755a a() {
                    return b(true);
                }

                public C1755a b(boolean z10) {
                    this.f264858d = z10;
                    return this;
                }

                public InterfaceC1754a c() {
                    return new com.rabbitmq.client.impl.k.a.C1835a(this.f264855a, this.f264856b, this.f264857c, this.f264858d, this.f264859e, this.f264860f);
                }

                public C1755a d() {
                    return e(true);
                }

                public C1755a e(boolean z10) {
                    this.f264856b = z10;
                    return this;
                }

                public C1755a f() {
                    return g(true);
                }

                public C1755a g(boolean z10) {
                    this.f264857c = z10;
                    return this;
                }

                public C1755a h() {
                    return i(true);
                }

                public C1755a i(boolean z10) {
                    this.f264860f = z10;
                    return this;
                }

                public C1755a j(String str) {
                    this.f264855a = str;
                    return this;
                }

                public C1755a k() {
                    return l(true);
                }

                public C1755a l(boolean z10) {
                    this.f264859e = z10;
                    return this;
                }
            }

            boolean K();

            boolean R();

            String getRealm();

            boolean l();

            boolean o();

            boolean q();
        }

        /* JADX INFO: renamed from: com.rabbitmq.client.a$a$b */
        public interface b extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$a$b$a, reason: collision with other inner class name */
            public static final class C1756a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f264861a = 1;

                public b a() {
                    return new com.rabbitmq.client.impl.k.a.b(this.f264861a);
                }

                public C1756a b(int i10) {
                    this.f264861a = i10;
                    return this;
                }
            }

            int a();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: com.rabbitmq.client.a$b$a, reason: collision with other inner class name */
        public interface InterfaceC1757a extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$b$a$a, reason: collision with other inner class name */
            public static final class C1758a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private long f264862a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private boolean f264863b = false;

                public InterfaceC1757a a() {
                    return new com.rabbitmq.client.impl.k.b.a(this.f264862a, this.f264863b);
                }

                public C1758a b(long j10) {
                    this.f264862a = j10;
                    return this;
                }

                public C1758a c() {
                    return d(true);
                }

                public C1758a d(boolean z10) {
                    this.f264863b = z10;
                    return this;
                }
            }

            long i();

            boolean w();
        }

        /* JADX INFO: renamed from: com.rabbitmq.client.a$b$b, reason: collision with other inner class name */
        public interface InterfaceC1759b extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$b$b$a, reason: collision with other inner class name */
            public static final class C1760a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private String f264864a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private boolean f264865b = false;

                public InterfaceC1759b a() {
                    return new com.rabbitmq.client.impl.k.b.C1836b(this.f264864a, this.f264865b);
                }

                public C1760a b(String str) {
                    this.f264864a = str;
                    return this;
                }

                public C1760a c() {
                    return d(true);
                }

                public C1760a d(boolean z10) {
                    this.f264865b = z10;
                    return this;
                }
            }

            boolean b();

            String h();
        }

        public interface c extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$b$c$a, reason: collision with other inner class name */
            public static final class C1761a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private String f264866a;

                public c a() {
                    return new com.rabbitmq.client.impl.k.b.c(this.f264866a);
                }

                public C1761a b(String str) {
                    this.f264866a = str;
                    return this;
                }
            }

            String h();
        }

        public interface d extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$b$d$a, reason: collision with other inner class name */
            public static final class C1762a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f264867a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private String f264868b = "";

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private String f264869c = "";

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private boolean f264870d = false;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private boolean f264871e = false;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private boolean f264872f = false;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private boolean f264873g = false;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private Map<String, Object> f264874h = null;

                public C1762a a(Map<String, Object> map) {
                    this.f264874h = map;
                    return this;
                }

                public d b() {
                    return new com.rabbitmq.client.impl.k.b.d(this.f264867a, this.f264868b, this.f264869c, this.f264870d, this.f264871e, this.f264872f, this.f264873g, this.f264874h);
                }

                public C1762a c(String str) {
                    this.f264869c = str;
                    return this;
                }

                public C1762a d() {
                    return e(true);
                }

                public C1762a e(boolean z10) {
                    this.f264872f = z10;
                    return this;
                }

                public C1762a f() {
                    return g(true);
                }

                public C1762a g(boolean z10) {
                    this.f264871e = z10;
                    return this;
                }

                public C1762a h() {
                    return i(true);
                }

                public C1762a i(boolean z10) {
                    this.f264870d = z10;
                    return this;
                }

                public C1762a j() {
                    return k(true);
                }

                public C1762a k(boolean z10) {
                    this.f264873g = z10;
                    return this;
                }

                public C1762a l(String str) {
                    this.f264868b = str;
                    return this;
                }

                public C1762a m(int i10) {
                    this.f264867a = i10;
                    return this;
                }
            }

            boolean L();

            int a();

            boolean b();

            Map<String, Object> d();

            String e();

            String h();

            boolean o();

            boolean t();
        }

        public interface e extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$b$e$a, reason: collision with other inner class name */
            public static final class C1763a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private String f264875a;

                public e a() {
                    return new com.rabbitmq.client.impl.k.b.e(this.f264875a);
                }

                public C1763a b(String str) {
                    this.f264875a = str;
                    return this;
                }
            }

            String h();
        }

        public interface f extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$b$f$a, reason: collision with other inner class name */
            public static final class C1764a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private String f264876a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private long f264877b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f264878c = false;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private String f264879d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private String f264880e;

                public f a() {
                    return new com.rabbitmq.client.impl.k.b.f(this.f264876a, this.f264877b, this.f264878c, this.f264879d, this.f264880e);
                }

                public C1764a b(String str) {
                    this.f264876a = str;
                    return this;
                }

                public C1764a c(long j10) {
                    this.f264877b = j10;
                    return this;
                }

                public C1764a d(String str) {
                    this.f264879d = str;
                    return this;
                }

                public C1764a e() {
                    return f(true);
                }

                public C1764a f(boolean z10) {
                    this.f264878c = z10;
                    return this;
                }

                public C1764a g(String str) {
                    this.f264880e = str;
                    return this;
                }
            }

            String f();

            String g();

            String h();

            long i();

            boolean s();
        }

        public interface g extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$b$g$a, reason: collision with other inner class name */
            public static final class C1765a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f264881a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private String f264882b = "";

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f264883c = false;

                public g a() {
                    return new com.rabbitmq.client.impl.k.b.g(this.f264881a, this.f264882b, this.f264883c);
                }

                public C1765a b() {
                    return c(true);
                }

                public C1765a c(boolean z10) {
                    this.f264883c = z10;
                    return this;
                }

                public C1765a d(String str) {
                    this.f264882b = str;
                    return this;
                }

                public C1765a e(int i10) {
                    this.f264881a = i10;
                    return this;
                }
            }

            int a();

            String e();

            boolean t();
        }

        public interface h extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$b$h$a, reason: collision with other inner class name */
            public static final class C1766a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private String f264884a = "";

                public h a() {
                    return new com.rabbitmq.client.impl.k.b.h(this.f264884a);
                }

                public C1766a b(String str) {
                    this.f264884a = str;
                    return this;
                }
            }

            String y();
        }

        public interface i extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$b$i$a, reason: collision with other inner class name */
            public static final class C1767a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private long f264885a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private boolean f264886b = false;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private String f264887c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private String f264888d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private int f264889e;

                public i a() {
                    return new com.rabbitmq.client.impl.k.b.i(this.f264885a, this.f264886b, this.f264887c, this.f264888d, this.f264889e);
                }

                public C1767a b(long j10) {
                    this.f264885a = j10;
                    return this;
                }

                public C1767a c(String str) {
                    this.f264887c = str;
                    return this;
                }

                public C1767a d(int i10) {
                    this.f264889e = i10;
                    return this;
                }

                public C1767a e() {
                    return f(true);
                }

                public C1767a f(boolean z10) {
                    this.f264886b = z10;
                    return this;
                }

                public C1767a g(String str) {
                    this.f264888d = str;
                    return this;
                }
            }

            String f();

            String g();

            long i();

            int k();

            boolean s();
        }

        public interface j extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$b$j$a, reason: collision with other inner class name */
            public static final class C1768a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private long f264890a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private boolean f264891b = false;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f264892c = true;

                public j a() {
                    return new com.rabbitmq.client.impl.k.b.j(this.f264890a, this.f264891b, this.f264892c);
                }

                public C1768a b(long j10) {
                    this.f264890a = j10;
                    return this;
                }

                public C1768a c() {
                    return d(true);
                }

                public C1768a d(boolean z10) {
                    this.f264891b = z10;
                    return this;
                }

                public C1768a e() {
                    return f(true);
                }

                public C1768a f(boolean z10) {
                    this.f264892c = z10;
                    return this;
                }
            }

            long i();

            boolean j();

            boolean w();
        }

        public interface k extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$b$k$a, reason: collision with other inner class name */
            public static final class C1769a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f264893a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private String f264894b = "";

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private String f264895c = "";

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private boolean f264896d = false;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private boolean f264897e = false;

                public k a() {
                    return new com.rabbitmq.client.impl.k.b.C1837k(this.f264893a, this.f264894b, this.f264895c, this.f264896d, this.f264897e);
                }

                public C1769a b(String str) {
                    this.f264894b = str;
                    return this;
                }

                public C1769a c() {
                    return d(true);
                }

                public C1769a d(boolean z10) {
                    this.f264897e = z10;
                    return this;
                }

                public C1769a e() {
                    return f(true);
                }

                public C1769a f(boolean z10) {
                    this.f264896d = z10;
                    return this;
                }

                public C1769a g(String str) {
                    this.f264895c = str;
                    return this;
                }

                public C1769a h(int i10) {
                    this.f264893a = i10;
                    return this;
                }
            }

            boolean B();

            int a();

            String f();

            String g();

            boolean x();
        }

        public interface l extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$b$l$a, reason: collision with other inner class name */
            public static final class C1770a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f264898a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f264899b = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f264900c = false;

                public l a() {
                    return new com.rabbitmq.client.impl.k.b.l(this.f264898a, this.f264899b, this.f264900c);
                }

                public C1770a b() {
                    return c(true);
                }

                public C1770a c(boolean z10) {
                    this.f264900c = z10;
                    return this;
                }

                public C1770a d(int i10) {
                    this.f264899b = i10;
                    return this;
                }

                public C1770a e(int i10) {
                    this.f264898a = i10;
                    return this;
                }
            }

            int C();

            int D();

            boolean T();
        }

        public interface m extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$b$m$a, reason: collision with other inner class name */
            public static final class C1771a {
                public m a() {
                    return new com.rabbitmq.client.impl.k.b.m();
                }
            }
        }

        public interface n extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$b$n$a, reason: collision with other inner class name */
            public static final class C1772a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private boolean f264901a = false;

                public n a() {
                    return new com.rabbitmq.client.impl.k.b.n(this.f264901a);
                }

                public C1772a b() {
                    return c(true);
                }

                public C1772a c(boolean z10) {
                    this.f264901a = z10;
                    return this;
                }
            }

            boolean j();
        }

        public interface o extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$b$o$a, reason: collision with other inner class name */
            public static final class C1773a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private boolean f264902a = false;

                public o a() {
                    return new com.rabbitmq.client.impl.k.b.o(this.f264902a);
                }

                public C1773a b() {
                    return c(true);
                }

                public C1773a c(boolean z10) {
                    this.f264902a = z10;
                    return this;
                }
            }

            boolean j();
        }

        public interface p extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$b$p$a, reason: collision with other inner class name */
            public static final class C1774a {
                public p a() {
                    return new com.rabbitmq.client.impl.k.b.p();
                }
            }
        }

        public interface q extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$b$q$a, reason: collision with other inner class name */
            public static final class C1775a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private long f264903a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private boolean f264904b = true;

                public q a() {
                    return new com.rabbitmq.client.impl.k.b.q(this.f264903a, this.f264904b);
                }

                public C1775a b(long j10) {
                    this.f264903a = j10;
                    return this;
                }

                public C1775a c() {
                    return d(true);
                }

                public C1775a d(boolean z10) {
                    this.f264904b = z10;
                    return this;
                }
            }

            long i();

            boolean j();
        }

        public interface r extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$b$r$a, reason: collision with other inner class name */
            public static final class C1776a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f264905a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private String f264906b = "";

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private String f264907c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private String f264908d;

                public r a() {
                    return new com.rabbitmq.client.impl.k.b.r(this.f264905a, this.f264906b, this.f264907c, this.f264908d);
                }

                public C1776a b(String str) {
                    this.f264907c = str;
                    return this;
                }

                public C1776a c(int i10) {
                    this.f264905a = i10;
                    return this;
                }

                public C1776a d(String str) {
                    this.f264906b = str;
                    return this;
                }

                public C1776a e(String str) {
                    this.f264908d = str;
                    return this;
                }
            }

            String f();

            String g();

            String m();

            int n();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: com.rabbitmq.client.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC1778a extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$d$a$a, reason: collision with other inner class name */
            public static final class C1779a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f264937a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private String f264938b = "";

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f264939c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private int f264940d;

                public InterfaceC1778a a() {
                    return new com.rabbitmq.client.impl.k.c.a(this.f264937a, this.f264938b, this.f264939c, this.f264940d);
                }

                public C1779a b(int i10) {
                    this.f264939c = i10;
                    return this;
                }

                public C1779a c(int i10) {
                    this.f264940d = i10;
                    return this;
                }

                public C1779a d(int i10) {
                    this.f264937a = i10;
                    return this;
                }

                public C1779a e(String str) {
                    this.f264938b = str;
                    return this;
                }
            }

            String m();

            int n();

            int o1();

            int p1();
        }

        public interface b extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$d$b$a, reason: collision with other inner class name */
            public static final class C1780a {
                public b a() {
                    return new com.rabbitmq.client.impl.k.c.b();
                }
            }
        }

        public interface c extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$d$c$a, reason: collision with other inner class name */
            public static final class C1781a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private boolean f264941a;

                public C1781a a() {
                    return b(true);
                }

                public C1781a b(boolean z10) {
                    this.f264941a = z10;
                    return this;
                }

                public c c() {
                    return new com.rabbitmq.client.impl.k.c.C1838c(this.f264941a);
                }
            }

            boolean l();
        }

        /* JADX INFO: renamed from: com.rabbitmq.client.a$d$d, reason: collision with other inner class name */
        public interface InterfaceC1782d extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$d$d$a, reason: collision with other inner class name */
            public static final class C1783a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private boolean f264942a;

                public C1783a a() {
                    return b(true);
                }

                public C1783a b(boolean z10) {
                    this.f264942a = z10;
                    return this;
                }

                public InterfaceC1782d c() {
                    return new com.rabbitmq.client.impl.k.c.d(this.f264942a);
                }
            }

            boolean l();
        }

        public interface e extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$d$e$a, reason: collision with other inner class name */
            public static final class C1784a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private String f264943a = "";

                public e a() {
                    return new com.rabbitmq.client.impl.k.c.e(this.f264943a);
                }

                public C1784a b(String str) {
                    this.f264943a = str;
                    return this;
                }
            }

            String I();
        }

        public interface f extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$d$f$a, reason: collision with other inner class name */
            public static final class C1785a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private k0 f264944a = com.rabbitmq.client.impl.x0.a("");

                public f a() {
                    return new com.rabbitmq.client.impl.k.c.f(this.f264944a);
                }

                public C1785a b(k0 k0Var) {
                    this.f264944a = k0Var;
                    return this;
                }

                public C1785a c(String str) {
                    return b(com.rabbitmq.client.impl.x0.a(str));
                }
            }

            k0 M();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: com.rabbitmq.client.a$e$a, reason: collision with other inner class name */
        public interface InterfaceC1786a extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$e$a$a, reason: collision with other inner class name */
            public static final class C1787a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private boolean f264945a = false;

                public InterfaceC1786a a() {
                    return new com.rabbitmq.client.impl.k.d.a(this.f264945a);
                }

                public C1787a b() {
                    return c(true);
                }

                public C1787a c(boolean z10) {
                    this.f264945a = z10;
                    return this;
                }
            }

            boolean b();
        }

        public interface b extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$e$b$a, reason: collision with other inner class name */
            public static final class C1788a {
                public b a() {
                    return new com.rabbitmq.client.impl.k.d.b();
                }
            }
        }
    }

    public static class f {

        /* JADX INFO: renamed from: com.rabbitmq.client.a$f$a, reason: collision with other inner class name */
        public interface InterfaceC1789a extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$f$a$a, reason: collision with other inner class name */
            public static final class C1790a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private String f264946a = "";

                public InterfaceC1789a a() {
                    return new com.rabbitmq.client.impl.k.e.a(this.f264946a);
                }

                public C1790a b(String str) {
                    this.f264946a = str;
                    return this;
                }
            }

            String u0();
        }

        public interface b extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$f$b$a, reason: collision with other inner class name */
            public static final class C1791a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f264947a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private String f264948b = "";

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f264949c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private int f264950d;

                public b a() {
                    return new com.rabbitmq.client.impl.k.e.b(this.f264947a, this.f264948b, this.f264949c, this.f264950d);
                }

                public C1791a b(int i10) {
                    this.f264949c = i10;
                    return this;
                }

                public C1791a c(int i10) {
                    this.f264950d = i10;
                    return this;
                }

                public C1791a d(int i10) {
                    this.f264947a = i10;
                    return this;
                }

                public C1791a e(String str) {
                    this.f264948b = str;
                    return this;
                }
            }

            String m();

            int n();

            int o1();

            int p1();
        }

        public interface c extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$f$c$a, reason: collision with other inner class name */
            public static final class C1792a {
                public c a() {
                    return new com.rabbitmq.client.impl.k.e.c();
                }
            }
        }

        public interface d extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$f$d$a, reason: collision with other inner class name */
            public static final class C1793a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private String f264951a = "/";

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private String f264952b = "";

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f264953c = false;

                public d a() {
                    return new com.rabbitmq.client.impl.k.e.d(this.f264951a, this.f264952b, this.f264953c);
                }

                public C1793a b(String str) {
                    this.f264952b = str;
                    return this;
                }

                public C1793a c() {
                    return d(true);
                }

                public C1793a d(boolean z10) {
                    this.f264953c = z10;
                    return this;
                }

                public C1793a e(String str) {
                    this.f264951a = str;
                    return this;
                }
            }

            boolean A();

            String G();

            String p();
        }

        public interface e extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$f$e$a, reason: collision with other inner class name */
            public static final class C1794a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private String f264954a = "";

                public e a() {
                    return new com.rabbitmq.client.impl.k.e.C1839e(this.f264954a);
                }

                public C1794a b(String str) {
                    this.f264954a = str;
                    return this;
                }
            }

            String V();
        }

        /* JADX INFO: renamed from: com.rabbitmq.client.a$f$f, reason: collision with other inner class name */
        public interface InterfaceC1795f extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$f$f$a, reason: collision with other inner class name */
            public static final class C1796a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private k0 f264955a;

                public InterfaceC1795f a() {
                    return new com.rabbitmq.client.impl.k.e.f(this.f264955a);
                }

                public C1796a b(k0 k0Var) {
                    this.f264955a = k0Var;
                    return this;
                }

                public C1796a c(String str) {
                    return b(com.rabbitmq.client.impl.x0.a(str));
                }
            }

            k0 E();
        }

        public interface g extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$f$g$a, reason: collision with other inner class name */
            public static final class C1797a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private k0 f264956a;

                public g a() {
                    return new com.rabbitmq.client.impl.k.e.g(this.f264956a);
                }

                public C1797a b(k0 k0Var) {
                    this.f264956a = k0Var;
                    return this;
                }

                public C1797a c(String str) {
                    return b(com.rabbitmq.client.impl.x0.a(str));
                }
            }

            k0 N();
        }

        public interface h extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$f$h$a, reason: collision with other inner class name */
            public static final class C1798a {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private Map<String, Object> f264959c;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f264957a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f264958b = 9;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private k0 f264960d = com.rabbitmq.client.impl.x0.a("PLAIN");

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private k0 f264961e = com.rabbitmq.client.impl.x0.a("en_US");

                public h a() {
                    return new com.rabbitmq.client.impl.k.e.h(this.f264957a, this.f264958b, this.f264959c, this.f264960d, this.f264961e);
                }

                public C1798a b(k0 k0Var) {
                    this.f264961e = k0Var;
                    return this;
                }

                public C1798a c(String str) {
                    return b(com.rabbitmq.client.impl.x0.a(str));
                }

                public C1798a d(k0 k0Var) {
                    this.f264960d = k0Var;
                    return this;
                }

                public C1798a e(String str) {
                    return d(com.rabbitmq.client.impl.x0.a(str));
                }

                public C1798a f(Map<String, Object> map) {
                    this.f264959c = map;
                    return this;
                }

                public C1798a g(int i10) {
                    this.f264957a = i10;
                    return this;
                }

                public C1798a h(int i10) {
                    this.f264958b = i10;
                    return this;
                }
            }

            Map<String, Object> S0();

            k0 T0();

            int U0();

            int V0();

            k0 W0();
        }

        public interface i extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$f$i$a, reason: collision with other inner class name */
            public static final class C1799a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private Map<String, Object> f264962a;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private k0 f264964c;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private String f264963b = "PLAIN";

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private String f264965d = "en_US";

                public i a() {
                    return new com.rabbitmq.client.impl.k.e.i(this.f264962a, this.f264963b, this.f264964c, this.f264965d);
                }

                public C1799a b(Map<String, Object> map) {
                    this.f264962a = map;
                    return this;
                }

                public C1799a c(String str) {
                    this.f264965d = str;
                    return this;
                }

                public C1799a d(String str) {
                    this.f264963b = str;
                    return this;
                }

                public C1799a e(k0 k0Var) {
                    this.f264964c = k0Var;
                    return this;
                }

                public C1799a f(String str) {
                    return e(com.rabbitmq.client.impl.x0.a(str));
                }
            }

            k0 N();

            Map<String, Object> X0();

            String Y0();

            String getLocale();
        }

        public interface j extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$f$j$a, reason: collision with other inner class name */
            public static final class C1800a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f264966a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f264967b = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f264968c = 0;

                public j a() {
                    return new com.rabbitmq.client.impl.k.e.j(this.f264966a, this.f264967b, this.f264968c);
                }

                public C1800a b(int i10) {
                    this.f264966a = i10;
                    return this;
                }

                public C1800a c(int i10) {
                    this.f264967b = i10;
                    return this;
                }

                public C1800a d(int i10) {
                    this.f264968c = i10;
                    return this;
                }
            }

            int O();

            int U();

            int m0();
        }

        public interface k extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$f$k$a, reason: collision with other inner class name */
            public static final class C1801a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f264969a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f264970b = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f264971c = 0;

                public k a() {
                    return new com.rabbitmq.client.impl.k.e.C1840k(this.f264969a, this.f264970b, this.f264971c);
                }

                public C1801a b(int i10) {
                    this.f264969a = i10;
                    return this;
                }

                public C1801a c(int i10) {
                    this.f264970b = i10;
                    return this;
                }

                public C1801a d(int i10) {
                    this.f264971c = i10;
                    return this;
                }
            }

            int O();

            int U();

            int m0();
        }

        public interface l extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$f$l$a, reason: collision with other inner class name */
            public static final class C1802a {
                public l a() {
                    return new com.rabbitmq.client.impl.k.e.l();
                }
            }
        }

        public interface m extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$f$m$a, reason: collision with other inner class name */
            public static final class C1803a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private k0 f264972a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private String f264973b;

                public m a() {
                    return new com.rabbitmq.client.impl.k.e.m(this.f264972a, this.f264973b);
                }

                public C1803a b(k0 k0Var) {
                    this.f264972a = k0Var;
                    return this;
                }

                public C1803a c(String str) {
                    return b(com.rabbitmq.client.impl.x0.a(str));
                }

                public C1803a d(String str) {
                    this.f264973b = str;
                    return this;
                }
            }

            k0 F();

            String u0();
        }

        public interface n extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$f$n$a, reason: collision with other inner class name */
            public static final class C1804a {
                public n a() {
                    return new com.rabbitmq.client.impl.k.e.n();
                }
            }
        }
    }

    public static class g {

        /* JADX INFO: renamed from: com.rabbitmq.client.a$g$a, reason: collision with other inner class name */
        public interface InterfaceC1805a extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$g$a$a, reason: collision with other inner class name */
            public static final class C1806a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private String f264975b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private String f264976c;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f264974a = 0;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private String f264977d = "";

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private boolean f264978e = false;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private Map<String, Object> f264979f = null;

                public C1806a a(Map<String, Object> map) {
                    this.f264979f = map;
                    return this;
                }

                public InterfaceC1805a b() {
                    return new com.rabbitmq.client.impl.k.g.a(this.f264974a, this.f264975b, this.f264976c, this.f264977d, this.f264978e, this.f264979f);
                }

                public C1806a c(String str) {
                    this.f264975b = str;
                    return this;
                }

                public C1806a d() {
                    return e(true);
                }

                public C1806a e(boolean z10) {
                    this.f264978e = z10;
                    return this;
                }

                public C1806a f(String str) {
                    this.f264977d = str;
                    return this;
                }

                public C1806a g(String str) {
                    this.f264976c = str;
                    return this;
                }

                public C1806a h(int i10) {
                    this.f264974a = i10;
                    return this;
                }
            }

            String P();

            int a();

            boolean b();

            Map<String, Object> d();

            String g();

            String q1();
        }

        public interface b extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$g$b$a, reason: collision with other inner class name */
            public static final class C1807a {
                public b a() {
                    return new com.rabbitmq.client.impl.k.g.b();
                }
            }
        }

        public interface c extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$g$c$a, reason: collision with other inner class name */
            public static final class C1808a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private String f264981b;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f264980a = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private String f264982c = com.google.android.gms.fido.fido2.api.common.b.f107262q1;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private boolean f264983d = false;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private boolean f264984e = false;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private boolean f264985f = false;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private boolean f264986g = false;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private boolean f264987h = false;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private Map<String, Object> f264988i = null;

                public C1808a a(Map<String, Object> map) {
                    this.f264988i = map;
                    return this;
                }

                public C1808a b() {
                    return c(true);
                }

                public C1808a c(boolean z10) {
                    this.f264985f = z10;
                    return this;
                }

                public c d() {
                    return new com.rabbitmq.client.impl.k.g.c(this.f264980a, this.f264981b, this.f264982c, this.f264983d, this.f264984e, this.f264985f, this.f264986g, this.f264987h, this.f264988i);
                }

                public C1808a e() {
                    return f(true);
                }

                public C1808a f(boolean z10) {
                    this.f264984e = z10;
                    return this;
                }

                public C1808a g(String str) {
                    this.f264981b = str;
                    return this;
                }

                public C1808a h() {
                    return i(true);
                }

                public C1808a i(boolean z10) {
                    this.f264986g = z10;
                    return this;
                }

                public C1808a j() {
                    return k(true);
                }

                public C1808a k(boolean z10) {
                    this.f264987h = z10;
                    return this;
                }

                public C1808a l() {
                    return m(true);
                }

                public C1808a m(boolean z10) {
                    this.f264983d = z10;
                    return this;
                }

                public C1808a n(int i10) {
                    this.f264980a = i10;
                    return this;
                }

                public C1808a o(String str) {
                    this.f264982c = str;
                    return this;
                }
            }

            boolean S();

            int a();

            boolean b();

            String c();

            Map<String, Object> d();

            String f();

            boolean q();

            boolean r();

            boolean u();
        }

        public interface d extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$g$d$a, reason: collision with other inner class name */
            public static final class C1809a {
                public d a() {
                    return new com.rabbitmq.client.impl.k.g.d();
                }
            }
        }

        public interface e extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$g$e$a, reason: collision with other inner class name */
            public static final class C1810a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private String f264990b;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f264989a = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f264991c = false;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private boolean f264992d = false;

                public e a() {
                    return new com.rabbitmq.client.impl.k.g.e(this.f264989a, this.f264990b, this.f264991c, this.f264992d);
                }

                public C1810a b(String str) {
                    this.f264990b = str;
                    return this;
                }

                public C1810a c() {
                    return d(true);
                }

                public C1810a d(boolean z10) {
                    this.f264991c = z10;
                    return this;
                }

                public C1810a e() {
                    return f(true);
                }

                public C1810a f(boolean z10) {
                    this.f264992d = z10;
                    return this;
                }

                public C1810a g(int i10) {
                    this.f264989a = i10;
                    return this;
                }
            }

            int a();

            boolean b();

            String f();

            boolean v();
        }

        public interface f extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$g$f$a, reason: collision with other inner class name */
            public static final class C1811a {
                public f a() {
                    return new com.rabbitmq.client.impl.k.g.f();
                }
            }
        }

        /* JADX INFO: renamed from: com.rabbitmq.client.a$g$g, reason: collision with other inner class name */
        public interface InterfaceC1812g extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$g$g$a, reason: collision with other inner class name */
            public static final class C1813a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private String f264994b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private String f264995c;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f264993a = 0;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private String f264996d = "";

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private boolean f264997e = false;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private Map<String, Object> f264998f = null;

                public C1813a a(Map<String, Object> map) {
                    this.f264998f = map;
                    return this;
                }

                public InterfaceC1812g b() {
                    return new com.rabbitmq.client.impl.k.g.C1841g(this.f264993a, this.f264994b, this.f264995c, this.f264996d, this.f264997e, this.f264998f);
                }

                public C1813a c(String str) {
                    this.f264994b = str;
                    return this;
                }

                public C1813a d() {
                    return e(true);
                }

                public C1813a e(boolean z10) {
                    this.f264997e = z10;
                    return this;
                }

                public C1813a f(String str) {
                    this.f264996d = str;
                    return this;
                }

                public C1813a g(String str) {
                    this.f264995c = str;
                    return this;
                }

                public C1813a h(int i10) {
                    this.f264993a = i10;
                    return this;
                }
            }

            String P();

            int a();

            boolean b();

            Map<String, Object> d();

            String g();

            String q1();
        }

        public interface h extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$g$h$a, reason: collision with other inner class name */
            public static final class C1814a {
                public h a() {
                    return new com.rabbitmq.client.impl.k.g.h();
                }
            }
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f264999a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f265000b = 9;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f265001c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f265002d = 5672;
    }

    public static class i {

        /* JADX INFO: renamed from: com.rabbitmq.client.a$i$a, reason: collision with other inner class name */
        public interface InterfaceC1815a extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$i$a$a, reason: collision with other inner class name */
            public static final class C1816a {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private String f265005c;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f265003a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private String f265004b = "";

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private String f265006d = "";

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private boolean f265007e = false;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private Map<String, Object> f265008f = null;

                public C1816a a(Map<String, Object> map) {
                    this.f265008f = map;
                    return this;
                }

                public InterfaceC1815a b() {
                    return new com.rabbitmq.client.impl.k.i.a(this.f265003a, this.f265004b, this.f265005c, this.f265006d, this.f265007e, this.f265008f);
                }

                public C1816a c(String str) {
                    this.f265005c = str;
                    return this;
                }

                public C1816a d() {
                    return e(true);
                }

                public C1816a e(boolean z10) {
                    this.f265007e = z10;
                    return this;
                }

                public C1816a f(String str) {
                    this.f265004b = str;
                    return this;
                }

                public C1816a g(String str) {
                    this.f265006d = str;
                    return this;
                }

                public C1816a h(int i10) {
                    this.f265003a = i10;
                    return this;
                }
            }

            int a();

            boolean b();

            Map<String, Object> d();

            String e();

            String f();

            String g();
        }

        public interface b extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$i$b$a, reason: collision with other inner class name */
            public static final class C1817a {
                public b a() {
                    return new com.rabbitmq.client.impl.k.i.b();
                }
            }
        }

        public interface c extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$i$c$a, reason: collision with other inner class name */
            public static final class C1818a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f265009a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private String f265010b = "";

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f265011c = false;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private boolean f265012d = false;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private boolean f265013e = false;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private boolean f265014f = false;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private boolean f265015g = false;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private Map<String, Object> f265016h = null;

                public C1818a a(Map<String, Object> map) {
                    this.f265016h = map;
                    return this;
                }

                public C1818a b() {
                    return c(true);
                }

                public C1818a c(boolean z10) {
                    this.f265014f = z10;
                    return this;
                }

                public c d() {
                    return new com.rabbitmq.client.impl.k.i.c(this.f265009a, this.f265010b, this.f265011c, this.f265012d, this.f265013e, this.f265014f, this.f265015g, this.f265016h);
                }

                public C1818a e() {
                    return f(true);
                }

                public C1818a f(boolean z10) {
                    this.f265012d = z10;
                    return this;
                }

                public C1818a g() {
                    return h(true);
                }

                public C1818a h(boolean z10) {
                    this.f265013e = z10;
                    return this;
                }

                public C1818a i() {
                    return j(true);
                }

                public C1818a j(boolean z10) {
                    this.f265015g = z10;
                    return this;
                }

                public C1818a k() {
                    return l(true);
                }

                public C1818a l(boolean z10) {
                    this.f265011c = z10;
                    return this;
                }

                public C1818a m(String str) {
                    this.f265010b = str;
                    return this;
                }

                public C1818a n(int i10) {
                    this.f265009a = i10;
                    return this;
                }
            }

            int a();

            boolean b();

            Map<String, Object> d();

            String e();

            boolean o();

            boolean q();

            boolean r();

            boolean u();
        }

        public interface d extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$i$d$a, reason: collision with other inner class name */
            public static final class C1819a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private String f265017a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f265018b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f265019c;

                public d a() {
                    return new com.rabbitmq.client.impl.k.i.d(this.f265017a, this.f265018b, this.f265019c);
                }

                public C1819a b(int i10) {
                    this.f265019c = i10;
                    return this;
                }

                public C1819a c(int i10) {
                    this.f265018b = i10;
                    return this;
                }

                public C1819a d(String str) {
                    this.f265017a = str;
                    return this;
                }
            }

            int Q();

            String e();

            int k();
        }

        public interface e extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$i$e$a, reason: collision with other inner class name */
            public static final class C1820a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f265020a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private String f265021b = "";

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f265022c = false;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private boolean f265023d = false;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private boolean f265024e = false;

                public e a() {
                    return new com.rabbitmq.client.impl.k.i.e(this.f265020a, this.f265021b, this.f265022c, this.f265023d, this.f265024e);
                }

                public C1820a b() {
                    return c(true);
                }

                public C1820a c(boolean z10) {
                    this.f265023d = z10;
                    return this;
                }

                public C1820a d() {
                    return e(true);
                }

                public C1820a e(boolean z10) {
                    this.f265022c = z10;
                    return this;
                }

                public C1820a f() {
                    return g(true);
                }

                public C1820a g(boolean z10) {
                    this.f265024e = z10;
                    return this;
                }

                public C1820a h(String str) {
                    this.f265021b = str;
                    return this;
                }

                public C1820a i(int i10) {
                    this.f265020a = i10;
                    return this;
                }
            }

            boolean H();

            int a();

            boolean b();

            String e();

            boolean v();
        }

        public interface f extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$i$f$a, reason: collision with other inner class name */
            public static final class C1821a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f265025a;

                public f a() {
                    return new com.rabbitmq.client.impl.k.i.f(this.f265025a);
                }

                public C1821a b(int i10) {
                    this.f265025a = i10;
                    return this;
                }
            }

            int k();
        }

        public interface g extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$i$g$a, reason: collision with other inner class name */
            public static final class C1822a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f265026a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private String f265027b = "";

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f265028c = false;

                public g a() {
                    return new com.rabbitmq.client.impl.k.i.g(this.f265026a, this.f265027b, this.f265028c);
                }

                public C1822a b() {
                    return c(true);
                }

                public C1822a c(boolean z10) {
                    this.f265028c = z10;
                    return this;
                }

                public C1822a d(String str) {
                    this.f265027b = str;
                    return this;
                }

                public C1822a e(int i10) {
                    this.f265026a = i10;
                    return this;
                }
            }

            int a();

            boolean b();

            String e();
        }

        public interface h extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$i$h$a, reason: collision with other inner class name */
            public static final class C1823a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f265029a;

                public h a() {
                    return new com.rabbitmq.client.impl.k.i.h(this.f265029a);
                }

                public C1823a b(int i10) {
                    this.f265029a = i10;
                    return this;
                }
            }

            int k();
        }

        /* JADX INFO: renamed from: com.rabbitmq.client.a$i$i, reason: collision with other inner class name */
        public interface InterfaceC1824i extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$i$i$a, reason: collision with other inner class name */
            public static final class C1825a {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private String f265032c;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f265030a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private String f265031b = "";

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private String f265033d = "";

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private Map<String, Object> f265034e = null;

                public C1825a a(Map<String, Object> map) {
                    this.f265034e = map;
                    return this;
                }

                public InterfaceC1824i b() {
                    return new com.rabbitmq.client.impl.k.i.C1842i(this.f265030a, this.f265031b, this.f265032c, this.f265033d, this.f265034e);
                }

                public C1825a c(String str) {
                    this.f265032c = str;
                    return this;
                }

                public C1825a d(String str) {
                    this.f265031b = str;
                    return this;
                }

                public C1825a e(String str) {
                    this.f265033d = str;
                    return this;
                }

                public C1825a f(int i10) {
                    this.f265030a = i10;
                    return this;
                }
            }

            int a();

            Map<String, Object> d();

            String e();

            String f();

            String g();
        }

        public interface j extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$i$j$a, reason: collision with other inner class name */
            public static final class C1826a {
                public j a() {
                    return new com.rabbitmq.client.impl.k.i.j();
                }
            }
        }
    }

    public static class j {

        /* JADX INFO: renamed from: com.rabbitmq.client.a$j$a, reason: collision with other inner class name */
        public interface InterfaceC1827a extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$j$a$a, reason: collision with other inner class name */
            public static final class C1828a {
                public InterfaceC1827a a() {
                    return new com.rabbitmq.client.impl.k.j.a();
                }
            }
        }

        public interface b extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$j$b$a, reason: collision with other inner class name */
            public static final class C1829a {
                public b a() {
                    return new com.rabbitmq.client.impl.k.j.b();
                }
            }
        }

        public interface c extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$j$c$a, reason: collision with other inner class name */
            public static final class C1830a {
                public c a() {
                    return new com.rabbitmq.client.impl.k.j.c();
                }
            }
        }

        public interface d extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$j$d$a, reason: collision with other inner class name */
            public static final class C1831a {
                public d a() {
                    return new com.rabbitmq.client.impl.k.j.d();
                }
            }
        }

        public interface e extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$j$e$a, reason: collision with other inner class name */
            public static final class C1832a {
                public e a() {
                    return new com.rabbitmq.client.impl.k.j.e();
                }
            }
        }

        public interface f extends o0 {

            /* JADX INFO: renamed from: com.rabbitmq.client.a$j$f$a, reason: collision with other inner class name */
            public static final class C1833a {
                public f a() {
                    return new com.rabbitmq.client.impl.k.j.f();
                }
            }
        }
    }

    public static class c extends com.rabbitmq.client.impl.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f264909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f264910c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Map<String, Object> f264911d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f264912e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f264913f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f264914g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f264915h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f264916i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f264917j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Date f264918k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f264919l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f264920m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f264921n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f264922o;

        /* JADX INFO: renamed from: com.rabbitmq.client.a$c$a, reason: collision with other inner class name */
        public static final class C1777a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f264923a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f264924b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Map<String, Object> f264925c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Integer f264926d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Integer f264927e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private String f264928f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private String f264929g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private String f264930h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private String f264931i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private Date f264932j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private String f264933k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private String f264934l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private String f264935m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private String f264936n;

            public C1777a a(String str) {
                this.f264935m = str;
                return this;
            }

            public c b() {
                return new c(this.f264923a, this.f264924b, this.f264925c, this.f264926d, this.f264927e, this.f264928f, this.f264929g, this.f264930h, this.f264931i, this.f264932j, this.f264933k, this.f264934l, this.f264935m, this.f264936n);
            }

            public C1777a c(String str) {
                this.f264936n = str;
                return this;
            }

            public C1777a d(String str) {
                this.f264924b = str;
                return this;
            }

            public C1777a e(String str) {
                this.f264923a = str;
                return this;
            }

            public C1777a f(String str) {
                this.f264928f = str;
                return this;
            }

            public C1777a g(Integer num) {
                this.f264926d = num;
                return this;
            }

            public C1777a h(String str) {
                this.f264930h = str;
                return this;
            }

            public C1777a i(Map<String, Object> map) {
                this.f264925c = map;
                return this;
            }

            public C1777a j(String str) {
                this.f264931i = str;
                return this;
            }

            public C1777a k(Integer num) {
                this.f264927e = num;
                return this;
            }

            public C1777a l(String str) {
                this.f264929g = str;
                return this;
            }

            public C1777a m(Date date) {
                this.f264932j = date;
                return this;
            }

            public C1777a n(String str) {
                this.f264933k = str;
                return this;
            }

            public C1777a o(String str) {
                this.f264934l = str;
                return this;
            }
        }

        public c(String str, String str2, Map<String, Object> map, Integer num, Integer num2, String str3, String str4, String str5, String str6, Date date, String str7, String str8, String str9, String str10) {
            this.f264909b = str;
            this.f264910c = str2;
            this.f264911d = map == null ? null : Collections.unmodifiableMap(new HashMap(map));
            this.f264912e = num;
            this.f264913f = num2;
            this.f264914g = str3;
            this.f264915h = str4;
            this.f264916i = str5;
            this.f264917j = str6;
            this.f264918k = date;
            this.f264919l = str7;
            this.f264920m = str8;
            this.f264921n = str9;
            this.f264922o = str10;
        }

        @Override // com.rabbitmq.client.f
        public Map<String, Object> O() {
            return this.f264911d;
        }

        @Override // com.rabbitmq.client.w
        public String Pb() {
            return "basic";
        }

        @Override // com.rabbitmq.client.f
        public Date S1() {
            return this.f264918k;
        }

        @Override // com.rabbitmq.client.f
        public String a() {
            return this.f264915h;
        }

        @Override // com.rabbitmq.client.f
        public String b() {
            return this.f264916i;
        }

        @Override // com.rabbitmq.client.f
        public String c() {
            return this.f264919l;
        }

        @Override // com.rabbitmq.client.f
        public String d() {
            return this.f264921n;
        }

        @Override // com.rabbitmq.client.f
        public Integer e() {
            return this.f264912e;
        }

        @Override // com.rabbitmq.client.f
        public Integer e1() {
            return this.f264913f;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        
            if (r6.f264909b != null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
        
            if (r6.f264910c != null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x007c, code lost:
        
            if (r6.f264913f != null) goto L50;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 314
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.rabbitmq.client.a.c.equals(java.lang.Object):boolean");
        }

        @Override // com.rabbitmq.client.f
        public String f() {
            return this.f264914g;
        }

        @Override // com.rabbitmq.client.f
        public String g() {
            return this.f264917j;
        }

        @Override // com.rabbitmq.client.f
        public String getContentEncoding() {
            return this.f264910c;
        }

        @Override // com.rabbitmq.client.f
        public String getContentType() {
            return this.f264909b;
        }

        @Override // com.rabbitmq.client.f
        public String getUserId() {
            return this.f264920m;
        }

        public int hashCode() {
            String str = this.f264909b;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f264910c;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Map<String, Object> map = this.f264911d;
            int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
            Integer num = this.f264912e;
            int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 31;
            Integer num2 = this.f264913f;
            int iHashCode5 = (iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
            String str3 = this.f264914g;
            int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f264915h;
            int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f264916i;
            int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.f264917j;
            int iHashCode9 = (iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
            Date date = this.f264918k;
            int iHashCode10 = (iHashCode9 + (date != null ? date.hashCode() : 0)) * 31;
            String str7 = this.f264919l;
            int iHashCode11 = (iHashCode10 + (str7 != null ? str7.hashCode() : 0)) * 31;
            String str8 = this.f264920m;
            int iHashCode12 = (iHashCode11 + (str8 != null ? str8.hashCode() : 0)) * 31;
            String str9 = this.f264921n;
            int iHashCode13 = (iHashCode12 + (str9 != null ? str9.hashCode() : 0)) * 31;
            String str10 = this.f264922o;
            return iHashCode13 + (str10 != null ? str10.hashCode() : 0);
        }

        @Override // com.rabbitmq.client.impl.j, com.rabbitmq.client.w
        public void i9(StringBuilder sb2) {
            sb2.append("(content-type=");
            sb2.append(this.f264909b);
            sb2.append(", content-encoding=");
            sb2.append(this.f264910c);
            sb2.append(", headers=");
            sb2.append(this.f264911d);
            sb2.append(", delivery-mode=");
            sb2.append(this.f264912e);
            sb2.append(", priority=");
            sb2.append(this.f264913f);
            sb2.append(", correlation-id=");
            sb2.append(this.f264914g);
            sb2.append(", reply-to=");
            sb2.append(this.f264915h);
            sb2.append(", expiration=");
            sb2.append(this.f264916i);
            sb2.append(", message-id=");
            sb2.append(this.f264917j);
            sb2.append(", timestamp=");
            sb2.append(this.f264918k);
            sb2.append(", type=");
            sb2.append(this.f264919l);
            sb2.append(", user-id=");
            sb2.append(this.f264920m);
            sb2.append(", app-id=");
            sb2.append(this.f264921n);
            sb2.append(", cluster-id=");
            sb2.append(this.f264922o);
            sb2.append(")");
        }

        @Override // com.rabbitmq.client.impl.j
        public void j(com.rabbitmq.client.impl.c0 c0Var) throws IOException {
            c0Var.i(this.f264909b != null);
            c0Var.i(this.f264910c != null);
            c0Var.i(this.f264911d != null);
            c0Var.i(this.f264912e != null);
            c0Var.i(this.f264913f != null);
            c0Var.i(this.f264914g != null);
            c0Var.i(this.f264915h != null);
            c0Var.i(this.f264916i != null);
            c0Var.i(this.f264917j != null);
            c0Var.i(this.f264918k != null);
            c0Var.i(this.f264919l != null);
            c0Var.i(this.f264920m != null);
            c0Var.i(this.f264921n != null);
            c0Var.i(this.f264922o != null);
            c0Var.b();
            String str = this.f264909b;
            if (str != null) {
                c0Var.k(str);
            }
            String str2 = this.f264910c;
            if (str2 != null) {
                c0Var.k(str2);
            }
            Map<String, Object> map = this.f264911d;
            if (map != null) {
                c0Var.l(map);
            }
            Integer num = this.f264912e;
            if (num != null) {
                c0Var.h(num);
            }
            Integer num2 = this.f264913f;
            if (num2 != null) {
                c0Var.h(num2);
            }
            String str3 = this.f264914g;
            if (str3 != null) {
                c0Var.k(str3);
            }
            String str4 = this.f264915h;
            if (str4 != null) {
                c0Var.k(str4);
            }
            String str5 = this.f264916i;
            if (str5 != null) {
                c0Var.k(str5);
            }
            String str6 = this.f264917j;
            if (str6 != null) {
                c0Var.k(str6);
            }
            Date date = this.f264918k;
            if (date != null) {
                c0Var.m(date);
            }
            String str7 = this.f264919l;
            if (str7 != null) {
                c0Var.k(str7);
            }
            String str8 = this.f264920m;
            if (str8 != null) {
                c0Var.k(str8);
            }
            String str9 = this.f264921n;
            if (str9 != null) {
                c0Var.k(str9);
            }
            String str10 = this.f264922o;
            if (str10 != null) {
                c0Var.k(str10);
            }
        }

        public C1777a l() {
            return new C1777a().e(this.f264909b).d(this.f264910c).i(this.f264911d).g(this.f264912e).k(this.f264913f).f(this.f264914g).l(this.f264915h).h(this.f264916i).j(this.f264917j).m(this.f264918k).n(this.f264919l).o(this.f264920m).a(this.f264921n).c(this.f264922o);
        }

        public String n() {
            return this.f264922o;
        }

        @Override // com.rabbitmq.client.w
        public int o1() {
            return 60;
        }

        public c(DataInputStream dataInputStream) throws IOException {
            super(dataInputStream);
            com.rabbitmq.client.impl.b0 b0Var = new com.rabbitmq.client.impl.b0(dataInputStream);
            boolean zH = b0Var.h();
            boolean zH2 = b0Var.h();
            boolean zH3 = b0Var.h();
            boolean zH4 = b0Var.h();
            boolean zH5 = b0Var.h();
            boolean zH6 = b0Var.h();
            boolean zH7 = b0Var.h();
            boolean zH8 = b0Var.h();
            boolean zH9 = b0Var.h();
            boolean zH10 = b0Var.h();
            boolean zH11 = b0Var.h();
            boolean zH12 = b0Var.h();
            boolean zH13 = b0Var.h();
            boolean zH14 = b0Var.h();
            b0Var.a();
            this.f264909b = zH ? b0Var.j() : null;
            this.f264910c = zH2 ? b0Var.j() : null;
            this.f264911d = zH3 ? b0Var.k() : null;
            this.f264912e = zH4 ? Integer.valueOf(b0Var.g()) : null;
            this.f264913f = zH5 ? Integer.valueOf(b0Var.g()) : null;
            this.f264914g = zH6 ? b0Var.j() : null;
            this.f264915h = zH7 ? b0Var.j() : null;
            this.f264916i = zH8 ? b0Var.j() : null;
            this.f264917j = zH9 ? b0Var.j() : null;
            this.f264918k = zH10 ? b0Var.l() : null;
            this.f264919l = zH11 ? b0Var.j() : null;
            this.f264920m = zH12 ? b0Var.j() : null;
            this.f264921n = zH13 ? b0Var.j() : null;
            this.f264922o = zH14 ? b0Var.j() : null;
        }

        public c() {
        }
    }
}
