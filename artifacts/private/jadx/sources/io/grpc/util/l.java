package io.grpc.util;

import com.google.common.base.j0;
import com.google.common.collect.g5;
import com.google.common.collect.l6;
import com.google.common.collect.z6;
import io.grpc.c3;
import io.grpc.d0;
import io.grpc.internal.e3;
import io.grpc.internal.n3;
import io.grpc.o1;
import io.grpc.t0;
import io.grpc.u;
import io.grpc.v;
import io.grpc.v1;
import io.grpc.y2;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
@t0
public final class l extends o1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final io.grpc.a.c<b> f291063p = io.grpc.a.c.a("addressTrackerKey");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @com.google.common.annotations.e
    final c f291064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c3 f291065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final o1.f f291066i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.grpc.util.h f291067j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private n3 f291068k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ScheduledExecutorService f291069l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c3.d f291070m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Long f291071n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final io.grpc.h f291072o;

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g f291073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile a f291074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f291075c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f291076d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f291077e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Set<i> f291078f = new HashSet();

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            AtomicLong f291079a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            AtomicLong f291080b;

            private a() {
                this.f291079a = new AtomicLong();
                this.f291080b = new AtomicLong();
            }

            void a() {
                this.f291079a.set(0L);
                this.f291080b.set(0L);
            }
        }

        b(g gVar) {
            this.f291074b = new a();
            this.f291075c = new a();
            this.f291073a = gVar;
        }

        @com.google.common.annotations.e
        long b() {
            return this.f291074b.f291079a.get() + this.f291074b.f291080b.get();
        }

        boolean c(i iVar) {
            if (p() && !iVar.p()) {
                iVar.o();
            } else if (!p() && iVar.p()) {
                iVar.r();
            }
            iVar.q(this);
            return this.f291078f.add(iVar);
        }

        boolean d(i iVar) {
            return this.f291078f.contains(iVar);
        }

        void e() {
            int i10 = this.f291077e;
            this.f291077e = i10 == 0 ? 0 : i10 - 1;
        }

        void f(long j10) {
            this.f291076d = Long.valueOf(j10);
            this.f291077e++;
            Iterator<i> it = this.f291078f.iterator();
            while (it.hasNext()) {
                it.next().o();
            }
        }

        double g() {
            return this.f291075c.f291080b.get() / i();
        }

        @com.google.common.annotations.e
        Set<i> h() {
            return z6.A(this.f291078f);
        }

        long i() {
            return this.f291075c.f291079a.get() + this.f291075c.f291080b.get();
        }

        void j(boolean z10) {
            g gVar = this.f291073a;
            if (gVar.f291093e == null && gVar.f291094f == null) {
                return;
            }
            if (z10) {
                this.f291074b.f291079a.getAndIncrement();
            } else {
                this.f291074b.f291080b.getAndIncrement();
            }
        }

        public boolean k(long j10) {
            return j10 > this.f291076d.longValue() + Math.min(this.f291073a.f291090b.longValue() * ((long) this.f291077e), Math.max(this.f291073a.f291090b.longValue(), this.f291073a.f291091c.longValue()));
        }

        boolean l(i iVar) {
            iVar.n();
            return this.f291078f.remove(iVar);
        }

        void m() {
            this.f291074b.a();
            this.f291075c.a();
        }

        void n() {
            this.f291077e = 0;
        }

        void o(g gVar) {
            this.f291073a = gVar;
        }

        boolean p() {
            return this.f291076d != null;
        }

        double q() {
            return this.f291075c.f291079a.get() / i();
        }

        void r() {
            this.f291075c.a();
            a aVar = this.f291074b;
            this.f291074b = this.f291075c;
            this.f291075c = aVar;
        }

        void s() {
            j0.h0(this.f291076d != null, "not currently ejected");
            this.f291076d = null;
            Iterator<i> it = this.f291078f.iterator();
            while (it.hasNext()) {
                it.next().r();
            }
        }

        public String toString() {
            return "AddressTracker{subchannels=" + this.f291078f + AbstractJsonLexerKt.END_OBJ;
        }
    }

    static class c extends g5<SocketAddress, b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<SocketAddress, b> f291081a = new HashMap();

        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.g5, com.google.common.collect.m5
        /* JADX INFO: renamed from: L0 */
        public Map<SocketAddress, b> i1() {
            return this.f291081a;
        }

        void c1() {
            for (b bVar : this.f291081a.values()) {
                if (bVar.p()) {
                    bVar.s();
                }
                bVar.n();
            }
        }

        double f1() {
            if (this.f291081a.isEmpty()) {
                return 0.0d;
            }
            Iterator<b> it = this.f291081a.values().iterator();
            int i10 = 0;
            int i11 = 0;
            while (it.hasNext()) {
                i11++;
                if (it.next().p()) {
                    i10++;
                }
            }
            return (((double) i10) / ((double) i11)) * 100.0d;
        }

        void i1(Long l10) {
            for (b bVar : this.f291081a.values()) {
                if (!bVar.p()) {
                    bVar.e();
                }
                if (bVar.p() && bVar.k(l10.longValue())) {
                    bVar.s();
                }
            }
        }

        void k1(g gVar, Collection<SocketAddress> collection) {
            for (SocketAddress socketAddress : collection) {
                if (!this.f291081a.containsKey(socketAddress)) {
                    this.f291081a.put(socketAddress, new b(gVar));
                }
            }
        }

        void m1() {
            Iterator<b> it = this.f291081a.values().iterator();
            while (it.hasNext()) {
                it.next().m();
            }
        }

        void n1() {
            Iterator<b> it = this.f291081a.values().iterator();
            while (it.hasNext()) {
                it.next().r();
            }
        }

        void q1(g gVar) {
            Iterator<b> it = this.f291081a.values().iterator();
            while (it.hasNext()) {
                it.next().o(gVar);
            }
        }
    }

    class d extends io.grpc.util.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private o1.f f291082a;

        d(o1.f fVar) {
            this.f291082a = new io.grpc.util.i(fVar);
        }

        @Override // io.grpc.util.f, io.grpc.o1.f
        public o1.j f(o1.b bVar) {
            i iVar = l.this.new i(bVar, this.f291082a);
            List<d0> listA = bVar.a();
            if (l.n(listA) && l.this.f291064g.containsKey(listA.get(0).a().get(0))) {
                b bVar2 = l.this.f291064g.get(listA.get(0).a().get(0));
                bVar2.c(iVar);
                if (bVar2.f291076d != null) {
                    iVar.o();
                }
            }
            return iVar;
        }

        @Override // io.grpc.util.f, io.grpc.o1.f
        public void q(u uVar, o1.k kVar) {
            this.f291082a.q(uVar, l.this.new h(kVar));
        }

        @Override // io.grpc.util.f
        protected o1.f t() {
            return this.f291082a;
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g f291084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.grpc.h f291085b;

        e(g gVar, io.grpc.h hVar) {
            this.f291084a = gVar;
            this.f291085b = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = l.this;
            lVar.f291071n = Long.valueOf(lVar.f291068k.a());
            l.this.f291064g.n1();
            for (j jVar : j.a(this.f291084a, this.f291085b)) {
                l lVar2 = l.this;
                jVar.b(lVar2.f291064g, lVar2.f291071n.longValue());
            }
            l lVar3 = l.this;
            lVar3.f291064g.i1(lVar3.f291071n);
        }
    }

    static class f implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f291087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.grpc.h f291088b;

        f(g gVar, io.grpc.h hVar) {
            this.f291087a = gVar;
            this.f291088b = hVar;
        }

        @Override // io.grpc.util.l.j
        public void b(c cVar, long j10) {
            List<b> listO = l.o(cVar, this.f291087a.f291094f.f291106d.intValue());
            if (listO.size() >= this.f291087a.f291094f.f291105c.intValue() && listO.size() != 0) {
                for (b bVar : listO) {
                    if (cVar.f1() >= this.f291087a.f291092d.intValue()) {
                        break;
                    }
                    if (bVar.i() >= this.f291087a.f291094f.f291106d.intValue()) {
                        if (bVar.g() > ((double) this.f291087a.f291094f.f291103a.intValue()) / 100.0d) {
                            this.f291088b.b(io.grpc.h.a.DEBUG, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", bVar, Double.valueOf(bVar.g()));
                            if (new Random().nextInt(100) < this.f291087a.f291094f.f291104b.intValue()) {
                                bVar.f(j10);
                            }
                        }
                    }
                }
            }
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f291089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f291090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Long f291091c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f291092d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c f291093e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final b f291094f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final e3.b f291095g;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Long f291096a = Long.valueOf(okhttp3.internal.connection.f.f334128w);

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Long f291097b = 30000000000L;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Long f291098c = 300000000000L;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Integer f291099d = 10;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            c f291100e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            b f291101f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            e3.b f291102g;

            public g a() {
                j0.g0(this.f291102g != null);
                return new g(this.f291096a, this.f291097b, this.f291098c, this.f291099d, this.f291100e, this.f291101f, this.f291102g);
            }

            public a b(Long l10) {
                j0.d(l10 != null);
                this.f291097b = l10;
                return this;
            }

            public a c(e3.b bVar) {
                j0.g0(bVar != null);
                this.f291102g = bVar;
                return this;
            }

            public a d(b bVar) {
                this.f291101f = bVar;
                return this;
            }

            public a e(Long l10) {
                j0.d(l10 != null);
                this.f291096a = l10;
                return this;
            }

            public a f(Integer num) {
                j0.d(num != null);
                this.f291099d = num;
                return this;
            }

            public a g(Long l10) {
                j0.d(l10 != null);
                this.f291098c = l10;
                return this;
            }

            public a h(c cVar) {
                this.f291100e = cVar;
                return this;
            }
        }

        public static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f291103a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Integer f291104b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Integer f291105c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Integer f291106d;

            public static class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Integer f291107a = 85;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Integer f291108b = 100;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Integer f291109c = 5;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Integer f291110d = 50;

                public b a() {
                    return new b(this.f291107a, this.f291108b, this.f291109c, this.f291110d);
                }

                public a b(Integer num) {
                    boolean z10 = false;
                    j0.d(num != null);
                    if (num.intValue() >= 0 && num.intValue() <= 100) {
                        z10 = true;
                    }
                    j0.d(z10);
                    this.f291108b = num;
                    return this;
                }

                public a c(Integer num) {
                    j0.d(num != null);
                    j0.d(num.intValue() >= 0);
                    this.f291109c = num;
                    return this;
                }

                public a d(Integer num) {
                    j0.d(num != null);
                    j0.d(num.intValue() >= 0);
                    this.f291110d = num;
                    return this;
                }

                public a e(Integer num) {
                    boolean z10 = false;
                    j0.d(num != null);
                    if (num.intValue() >= 0 && num.intValue() <= 100) {
                        z10 = true;
                    }
                    j0.d(z10);
                    this.f291107a = num;
                    return this;
                }
            }

            b(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f291103a = num;
                this.f291104b = num2;
                this.f291105c = num3;
                this.f291106d = num4;
            }
        }

        public static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f291111a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Integer f291112b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Integer f291113c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Integer f291114d;

            public static final class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Integer f291115a = 1900;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Integer f291116b = 100;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Integer f291117c = 5;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Integer f291118d = 100;

                public c a() {
                    return new c(this.f291115a, this.f291116b, this.f291117c, this.f291118d);
                }

                public a b(Integer num) {
                    boolean z10 = false;
                    j0.d(num != null);
                    if (num.intValue() >= 0 && num.intValue() <= 100) {
                        z10 = true;
                    }
                    j0.d(z10);
                    this.f291116b = num;
                    return this;
                }

                public a c(Integer num) {
                    j0.d(num != null);
                    j0.d(num.intValue() >= 0);
                    this.f291117c = num;
                    return this;
                }

                public a d(Integer num) {
                    j0.d(num != null);
                    j0.d(num.intValue() >= 0);
                    this.f291118d = num;
                    return this;
                }

                public a e(Integer num) {
                    j0.d(num != null);
                    this.f291115a = num;
                    return this;
                }
            }

            c(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f291111a = num;
                this.f291112b = num2;
                this.f291113c = num3;
                this.f291114d = num4;
            }
        }

        boolean a() {
            if (this.f291093e == null && this.f291094f == null) {
                return false;
            }
            return true;
        }

        private g(Long l10, Long l11, Long l12, Integer num, c cVar, b bVar, e3.b bVar2) {
            this.f291089a = l10;
            this.f291090b = l11;
            this.f291091c = l12;
            this.f291092d = num;
            this.f291093e = cVar;
            this.f291094f = bVar;
            this.f291095g = bVar2;
        }
    }

    class h extends o1.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o1.k f291119a;

        class a extends io.grpc.n.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final b f291121a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @fj.h
            private final io.grpc.n.a f291122b;

            /* JADX INFO: renamed from: io.grpc.util.l$h$a$a, reason: collision with other inner class name */
            class C1993a extends io.grpc.util.d {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ io.grpc.n f291124b;

                C1993a(io.grpc.n nVar) {
                    this.f291124b = nVar;
                }

                @Override // io.grpc.util.d, io.grpc.b3
                public void i(y2 y2Var) {
                    a.this.f291121a.j(y2Var.r());
                    o().i(y2Var);
                }

                @Override // io.grpc.util.d
                protected io.grpc.n o() {
                    return this.f291124b;
                }
            }

            class b extends io.grpc.n {
                b() {
                }

                @Override // io.grpc.b3
                public void i(y2 y2Var) {
                    a.this.f291121a.j(y2Var.r());
                }
            }

            a(@fj.h b bVar, io.grpc.n.a aVar) {
                this.f291121a = bVar;
                this.f291122b = aVar;
            }

            @Override // io.grpc.n.a
            public io.grpc.n a(io.grpc.n.b bVar, v1 v1Var) {
                io.grpc.n.a aVar = this.f291122b;
                return aVar != null ? new C1993a(aVar.a(bVar, v1Var)) : new b();
            }
        }

        h(o1.k kVar) {
            this.f291119a = kVar;
        }

        @Override // io.grpc.o1.k
        public o1.g a(o1.h hVar) {
            o1.g gVarA = this.f291119a.a(hVar);
            o1.j jVarC = gVarA.c();
            return jVarC != null ? o1.g.i(jVarC, new a((b) jVarC.d().b(l.f291063p), gVarA.b())) : gVarA;
        }
    }

    class i extends io.grpc.util.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o1.j f291127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f291128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f291129c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private v f291130d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private o1.l f291131e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final io.grpc.h f291132f;

        class a implements o1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final o1.l f291134a;

            a(o1.l lVar) {
                this.f291134a = lVar;
            }

            @Override // io.grpc.o1.l
            public void a(v vVar) {
                i.this.f291130d = vVar;
                if (!i.this.f291129c) {
                    this.f291134a.a(vVar);
                }
            }
        }

        i(o1.b bVar, o1.f fVar) {
            o1.b.C1979b<o1.l> c1979b = o1.f290192c;
            o1.l lVar = (o1.l) bVar.c(c1979b);
            if (lVar != null) {
                this.f291131e = lVar;
                this.f291127a = fVar.f(bVar.e().b(c1979b, new a(lVar)).c());
            } else {
                this.f291127a = fVar.f(bVar);
            }
            this.f291132f = this.f291127a.e();
        }

        @Override // io.grpc.util.g, io.grpc.o1.j
        public io.grpc.a d() {
            return this.f291128b != null ? this.f291127a.d().g().d(l.f291063p, this.f291128b).a() : this.f291127a.d();
        }

        @Override // io.grpc.util.g, io.grpc.o1.j
        public void h() {
            b bVar = this.f291128b;
            if (bVar != null) {
                bVar.l(this);
            }
            super.h();
        }

        @Override // io.grpc.util.g, io.grpc.o1.j
        public void i(o1.l lVar) {
            if (this.f291131e != null) {
                super.i(lVar);
            } else {
                this.f291131e = lVar;
                super.i(new a(lVar));
            }
        }

        @Override // io.grpc.util.g, io.grpc.o1.j
        public void j(List<d0> list) {
            if (l.n(c()) && l.n(list)) {
                if (l.this.f291064g.containsValue(this.f291128b)) {
                    this.f291128b.l(this);
                }
                SocketAddress socketAddress = list.get(0).a().get(0);
                if (l.this.f291064g.containsKey(socketAddress)) {
                    l.this.f291064g.get(socketAddress).c(this);
                }
            } else if (!l.n(c()) || l.n(list)) {
                if (!l.n(c()) && l.n(list)) {
                    SocketAddress socketAddress2 = list.get(0).a().get(0);
                    if (l.this.f291064g.containsKey(socketAddress2)) {
                        l.this.f291064g.get(socketAddress2).c(this);
                    }
                }
            } else if (l.this.f291064g.containsKey(b().a().get(0))) {
                b bVar = l.this.f291064g.get(b().a().get(0));
                bVar.l(this);
                bVar.m();
            }
            this.f291127a.j(list);
        }

        @Override // io.grpc.util.g
        protected o1.j k() {
            return this.f291127a;
        }

        void n() {
            this.f291128b = null;
        }

        void o() {
            this.f291129c = true;
            this.f291131e.a(v.b(y2.f291465t));
            this.f291132f.b(io.grpc.h.a.INFO, "Subchannel ejected: {0}", this);
        }

        boolean p() {
            return this.f291129c;
        }

        void q(b bVar) {
            this.f291128b = bVar;
        }

        void r() {
            this.f291129c = false;
            v vVar = this.f291130d;
            if (vVar != null) {
                this.f291131e.a(vVar);
                this.f291132f.b(io.grpc.h.a.INFO, "Subchannel unejected: {0}", this);
            }
        }

        @Override // io.grpc.util.g
        public String toString() {
            return "OutlierDetectionSubchannel{addresses=" + this.f291127a.c() + AbstractJsonLexerKt.END_OBJ;
        }
    }

    interface j {
        @fj.h
        static List<j> a(g gVar, io.grpc.h hVar) {
            l6.a aVarS = l6.s();
            if (gVar.f291093e != null) {
                aVarS.a(new k(gVar, hVar));
            }
            if (gVar.f291094f != null) {
                aVarS.a(new f(gVar, hVar));
            }
            return aVarS.e();
        }

        void b(c cVar, long j10);
    }

    static class k implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f291136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.grpc.h f291137b;

        k(g gVar, io.grpc.h hVar) {
            j0.e(gVar.f291093e != null, "success rate ejection config is null");
            this.f291136a = gVar;
            this.f291137b = hVar;
        }

        @com.google.common.annotations.e
        static double c(Collection<Double> collection) {
            Iterator<Double> it = collection.iterator();
            double dDoubleValue = 0.0d;
            while (it.hasNext()) {
                dDoubleValue += it.next().doubleValue();
            }
            return dDoubleValue / ((double) collection.size());
        }

        @com.google.common.annotations.e
        static double d(Collection<Double> collection, double d10) {
            Iterator<Double> it = collection.iterator();
            double d11 = 0.0d;
            while (it.hasNext()) {
                double dDoubleValue = it.next().doubleValue() - d10;
                d11 += dDoubleValue * dDoubleValue;
            }
            return Math.sqrt(d11 / ((double) collection.size()));
        }

        @Override // io.grpc.util.l.j
        public void b(c cVar, long j10) {
            List<b> listO = l.o(cVar, this.f291136a.f291093e.f291114d.intValue());
            if (listO.size() < this.f291136a.f291093e.f291113c.intValue() || listO.size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = listO.iterator();
            while (it.hasNext()) {
                arrayList.add(Double.valueOf(((b) it.next()).q()));
            }
            double dC = c(arrayList);
            double d10 = d(arrayList, dC);
            double dIntValue = dC - (((double) (this.f291136a.f291093e.f291111a.intValue() / 1000.0f)) * d10);
            for (b bVar : listO) {
                if (cVar.f1() >= this.f291136a.f291092d.intValue()) {
                    return;
                }
                if (bVar.q() < dIntValue) {
                    this.f291137b.b(io.grpc.h.a.DEBUG, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", bVar, Double.valueOf(bVar.q()), Double.valueOf(dC), Double.valueOf(d10), Double.valueOf(dIntValue));
                    if (new Random().nextInt(100) < this.f291136a.f291093e.f291112b.intValue()) {
                        bVar.f(j10);
                    }
                }
            }
        }
    }

    public l(o1.f fVar, n3 n3Var) {
        io.grpc.h hVarI = fVar.i();
        this.f291072o = hVarI;
        d dVar = new d((o1.f) j0.F(fVar, "helper"));
        this.f291066i = dVar;
        this.f291067j = new io.grpc.util.h(dVar);
        this.f291064g = new c();
        this.f291065h = (c3) j0.F(fVar.m(), "syncContext");
        this.f291069l = (ScheduledExecutorService) j0.F(fVar.l(), "timeService");
        this.f291068k = n3Var;
        hVarI.a(io.grpc.h.a.DEBUG, "OutlierDetection lb created.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n(List<d0> list) {
        Iterator<d0> it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().a().size();
            if (size > 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<b> o(c cVar, int i10) {
        ArrayList arrayList = new ArrayList();
        for (b bVar : cVar.values()) {
            if (bVar.i() >= i10) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // io.grpc.o1
    public y2 a(o1.i iVar) {
        this.f291072o.b(io.grpc.h.a.DEBUG, "Received resolution result: {0}", iVar);
        g gVar = (g) iVar.c();
        ArrayList arrayList = new ArrayList();
        Iterator<d0> it = iVar.a().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().a());
        }
        this.f291064g.keySet().retainAll(arrayList);
        this.f291064g.q1(gVar);
        this.f291064g.k1(gVar, arrayList);
        this.f291067j.t(gVar.f291095g.b());
        if (gVar.a()) {
            Long lValueOf = this.f291071n == null ? gVar.f291089a : Long.valueOf(Math.max(0L, gVar.f291089a.longValue() - (this.f291068k.a() - this.f291071n.longValue())));
            c3.d dVar = this.f291070m;
            if (dVar != null) {
                dVar.a();
                this.f291064g.m1();
            }
            this.f291070m = this.f291065h.d(new e(gVar, this.f291072o), lValueOf.longValue(), gVar.f291089a.longValue(), TimeUnit.NANOSECONDS, this.f291069l);
        } else {
            c3.d dVar2 = this.f291070m;
            if (dVar2 != null) {
                dVar2.a();
                this.f291071n = null;
                this.f291064g.c1();
            }
        }
        this.f291067j.d(iVar.e().d(gVar.f291095g.a()).a());
        return y2.f291450e;
    }

    @Override // io.grpc.o1
    public void c(y2 y2Var) {
        this.f291067j.c(y2Var);
    }

    @Override // io.grpc.o1
    public void g() {
        this.f291067j.g();
    }
}
