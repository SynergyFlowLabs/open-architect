package com.rabbitmq.client.impl;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tag;
import io.micrometer.core.instrument.Tags;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;

/* JADX INFO: loaded from: classes13.dex */
public class c1 extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicLong f265138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicLong f265139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Counter f265140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Counter f265141h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Counter f265142i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Counter f265143j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Counter f265144k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Counter f265145l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Counter f265146m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Counter f265147n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f265148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f265149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f265150c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f265151d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f265152e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f265153f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f265154g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f265155h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f265156i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f265157j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ b[] f265158k;

        static enum a extends b {
            a(String str, int i10) {
                super(str, i10);
            }

            @Override // com.rabbitmq.client.impl.c1.b
            Object c(MeterRegistry meterRegistry, String str, Iterable<Tag> iterable) {
                return meterRegistry.counter(str + ".unrouted_published", iterable);
            }
        }

        /* JADX INFO: renamed from: com.rabbitmq.client.impl.c1$b$b, reason: collision with other inner class name */
        static enum C1834b extends b {
            C1834b(String str, int i10) {
                super(str, i10);
            }

            @Override // com.rabbitmq.client.impl.c1.b
            Object c(MeterRegistry meterRegistry, String str, Iterable<Tag> iterable) {
                return meterRegistry.gauge(str + ".connections", iterable, new AtomicLong(0L));
            }
        }

        static enum c extends b {
            c(String str, int i10) {
                super(str, i10);
            }

            @Override // com.rabbitmq.client.impl.c1.b
            Object c(MeterRegistry meterRegistry, String str, Iterable<Tag> iterable) {
                return meterRegistry.gauge(str + ".channels", iterable, new AtomicLong(0L));
            }
        }

        static enum d extends b {
            d(String str, int i10) {
                super(str, i10);
            }

            @Override // com.rabbitmq.client.impl.c1.b
            Object c(MeterRegistry meterRegistry, String str, Iterable<Tag> iterable) {
                return meterRegistry.counter(str + ".published", iterable);
            }
        }

        static enum e extends b {
            e(String str, int i10) {
                super(str, i10);
            }

            @Override // com.rabbitmq.client.impl.c1.b
            Object c(MeterRegistry meterRegistry, String str, Iterable<Tag> iterable) {
                return meterRegistry.counter(str + ".consumed", iterable);
            }
        }

        static enum f extends b {
            f(String str, int i10) {
                super(str, i10);
            }

            @Override // com.rabbitmq.client.impl.c1.b
            Object c(MeterRegistry meterRegistry, String str, Iterable<Tag> iterable) {
                return meterRegistry.counter(str + ".acknowledged", iterable);
            }
        }

        static enum g extends b {
            g(String str, int i10) {
                super(str, i10);
            }

            @Override // com.rabbitmq.client.impl.c1.b
            Object c(MeterRegistry meterRegistry, String str, Iterable<Tag> iterable) {
                return meterRegistry.counter(str + ".rejected", iterable);
            }
        }

        static enum h extends b {
            h(String str, int i10) {
                super(str, i10);
            }

            @Override // com.rabbitmq.client.impl.c1.b
            Object c(MeterRegistry meterRegistry, String str, Iterable<Tag> iterable) {
                return meterRegistry.counter(str + ".failed_to_publish", iterable);
            }
        }

        static enum i extends b {
            i(String str, int i10) {
                super(str, i10);
            }

            @Override // com.rabbitmq.client.impl.c1.b
            Object c(MeterRegistry meterRegistry, String str, Iterable<Tag> iterable) {
                return meterRegistry.counter(str + ".acknowledged_published", iterable);
            }
        }

        static enum j extends b {
            j(String str, int i10) {
                super(str, i10);
            }

            @Override // com.rabbitmq.client.impl.c1.b
            Object c(MeterRegistry meterRegistry, String str, Iterable<Tag> iterable) {
                return meterRegistry.counter(str + ".not_acknowledged_published", iterable);
            }
        }

        static {
            C1834b c1834b = new C1834b("CONNECTIONS", 0);
            f265148a = c1834b;
            c cVar = new c("CHANNELS", 1);
            f265149b = cVar;
            d dVar = new d("PUBLISHED_MESSAGES", 2);
            f265150c = dVar;
            e eVar = new e("CONSUMED_MESSAGES", 3);
            f265151d = eVar;
            f fVar = new f("ACKNOWLEDGED_MESSAGES", 4);
            f265152e = fVar;
            g gVar = new g("REJECTED_MESSAGES", 5);
            f265153f = gVar;
            h hVar = new h("FAILED_TO_PUBLISH_MESSAGES", 6);
            f265154g = hVar;
            i iVar = new i("ACKED_PUBLISHED_MESSAGES", 7);
            f265155h = iVar;
            j jVar = new j("NACKED_PUBLISHED_MESSAGES", 8);
            f265156i = jVar;
            a aVar = new a("UNROUTED_PUBLISHED_MESSAGES", 9);
            f265157j = aVar;
            f265158k = new b[]{c1834b, cVar, dVar, eVar, fVar, gVar, hVar, iVar, jVar, aVar};
        }

        private b(String str, int i10) {
            super(str, i10);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f265158k.clone();
        }

        @Deprecated
        Object b(MeterRegistry meterRegistry, String str) {
            return c(meterRegistry, str, Collections.EMPTY_LIST);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Object c(MeterRegistry meterRegistry, String str, Iterable<Tag> iterable);
    }

    public c1(MeterRegistry meterRegistry) {
        this(meterRegistry, "rabbitmq");
    }

    @Override // com.rabbitmq.client.impl.q
    protected void A(com.rabbitmq.client.p pVar) {
        this.f265138e.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.rabbitmq.client.impl.q
    public void B() {
        this.f265146m.increment();
    }

    @Override // com.rabbitmq.client.impl.q
    protected void C() {
        this.f265145l.increment();
    }

    @Override // com.rabbitmq.client.impl.q
    protected void D() {
        this.f265142i.increment();
    }

    @Override // com.rabbitmq.client.impl.q
    protected void E() {
        this.f265141h.increment();
    }

    @Override // com.rabbitmq.client.impl.q
    protected void F() {
        this.f265143j.increment();
    }

    @Override // com.rabbitmq.client.impl.q
    protected void G() {
        this.f265140g.increment();
    }

    @Override // com.rabbitmq.client.impl.q
    protected void H() {
        this.f265144k.increment();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.rabbitmq.client.impl.q
    public void I() {
        this.f265147n.increment();
    }

    public Counter L() {
        return this.f265142i;
    }

    public Counter M() {
        return this.f265146m;
    }

    public AtomicLong N() {
        return this.f265139f;
    }

    public AtomicLong O() {
        return this.f265138e;
    }

    public Counter P() {
        return this.f265145l;
    }

    public Counter Q() {
        return this.f265141h;
    }

    public Counter R() {
        return this.f265143j;
    }

    public Counter S() {
        return this.f265140g;
    }

    public Counter T() {
        return this.f265147n;
    }

    public Counter U() {
        return this.f265144k;
    }

    @Override // com.rabbitmq.client.impl.q
    protected void x(com.rabbitmq.client.k kVar) {
        this.f265139f.decrementAndGet();
    }

    @Override // com.rabbitmq.client.impl.q
    protected void y(com.rabbitmq.client.p pVar) {
        this.f265138e.decrementAndGet();
    }

    @Override // com.rabbitmq.client.impl.q
    protected void z(com.rabbitmq.client.k kVar) {
        this.f265139f.incrementAndGet();
    }

    public c1(MeterRegistry meterRegistry, String str) {
        this(meterRegistry, str, Collections.EMPTY_LIST);
    }

    public c1(MeterRegistry meterRegistry, String str, String... strArr) {
        this(meterRegistry, str, (Iterable<Tag>) Tags.of(strArr));
    }

    public c1(final MeterRegistry meterRegistry, final String str, final Iterable<Tag> iterable) {
        this((Function<b, Object>) new Function() { // from class: com.rabbitmq.client.impl.b1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((c1.b) obj).c(meterRegistry, str, iterable);
            }
        });
    }

    public c1(Function<b, Object> function) {
        this.f265138e = (AtomicLong) function.apply(b.f265148a);
        this.f265139f = (AtomicLong) function.apply(b.f265149b);
        this.f265140g = (Counter) function.apply(b.f265150c);
        this.f265145l = (Counter) function.apply(b.f265151d);
        this.f265146m = (Counter) function.apply(b.f265152e);
        this.f265147n = (Counter) function.apply(b.f265153f);
        this.f265141h = (Counter) function.apply(b.f265154g);
        this.f265142i = (Counter) function.apply(b.f265155h);
        this.f265143j = (Counter) function.apply(b.f265156i);
        this.f265144k = (Counter) function.apply(b.f265157j);
    }
}
