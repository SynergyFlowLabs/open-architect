package io.ably.lib.realtime;

import com.facebook.internal.z0;
import io.ably.lib.types.a0;
import io.ably.lib.types.b0;
import io.ably.lib.types.c0;
import io.ably.lib.types.e0;
import io.ably.lib.types.p;
import io.ably.lib.types.q;
import io.ably.lib.types.r;
import io.ably.lib.types.u;
import io.ably.lib.types.v;
import io.ably.lib.types.w;
import io.ably.lib.types.x;
import io.ably.lib.types.y;
import io.ably.lib.util.o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class c extends io.ably.lib.util.g<io.ably.lib.realtime.d, io.ably.lib.realtime.f> {
    private static final String C = "untilAttach";
    private static final String D = "fromSerial";
    private final p A;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f287536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io.ably.lib.realtime.l f287537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public io.ably.lib.realtime.e f287538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f287539f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final mg.b f287543j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final io.ably.lib.realtime.m f287544k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private h f287545l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private j f287546m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f287547n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Timer f287548o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Timer f287549p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final io.ably.lib.realtime.a f287552s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final String f287553t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    io.ably.lib.types.l f287554u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Map<String, String> f287555v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Set<io.ably.lib.types.k> f287556w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f287557x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f287558y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f287559z;
    static r B = new r("Channel not attached", 400, 90001);
    private static final String E = io.ably.lib.realtime.b.class.getName();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public io.ably.lib.types.m f287540g = new io.ably.lib.types.m();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f287541h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f287542i = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private m f287550q = new m(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private HashMap<String, m> f287551r = new HashMap<>();

    class a implements io.ably.lib.realtime.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.ably.lib.realtime.g f287560a;

        a(io.ably.lib.realtime.g gVar) {
            this.f287560a = gVar;
        }

        @Override // io.ably.lib.realtime.g
        public void a(r rVar) {
            c.this.G();
            c.D(this.f287560a, rVar);
        }

        @Override // io.ably.lib.realtime.g
        public void onSuccess() {
            c.this.G();
            c.E(this.f287560a);
        }
    }

    class b extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Timer f287562a;

        b(Timer timer) {
            this.f287562a = timer;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            String str = String.format(Locale.ROOT, "Attach timed out for channel %s", c.this.f287536c);
            io.ably.lib.util.k.k(c.E, str);
            synchronized (c.this) {
                try {
                    if (c.this.f287548o != this.f287562a) {
                        return;
                    }
                    c.this.f287548o = null;
                    c cVar = c.this;
                    if (cVar.f287538e == io.ably.lib.realtime.e.attaching) {
                        cVar.x0(new r(str, 90007), true);
                        c.this.h0();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: io.ably.lib.realtime.c$c, reason: collision with other inner class name */
    class C1939c extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Timer f287564a;

        C1939c(Timer timer) {
            this.f287564a = timer;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            synchronized (c.this) {
                try {
                    if (this.f287564a != c.this.f287549p) {
                        return;
                    }
                    c.this.f287549p = null;
                    c cVar = c.this;
                    if (cVar.f287538e == io.ably.lib.realtime.e.suspended) {
                        try {
                            cVar.B(null);
                        } catch (io.ably.lib.types.a e10) {
                            io.ably.lib.util.k.e(c.E, "Reattach channel failed; channel = " + c.this.f287536c, e10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    class d implements io.ably.lib.realtime.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.ably.lib.realtime.g f287566a;

        d(io.ably.lib.realtime.g gVar) {
            this.f287566a = gVar;
        }

        @Override // io.ably.lib.realtime.g
        public void a(r rVar) {
            c.this.G();
            c.D(this.f287566a, rVar);
        }

        @Override // io.ably.lib.realtime.g
        public void onSuccess() {
            c.this.G();
            c.E(this.f287566a);
        }
    }

    class e extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Timer f287568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ io.ably.lib.realtime.g f287569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ io.ably.lib.realtime.e f287570c;

        e(Timer timer, io.ably.lib.realtime.g gVar, io.ably.lib.realtime.e eVar) {
            this.f287568a = timer;
            this.f287569b = gVar;
            this.f287570c = eVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            synchronized (c.this) {
                try {
                    if (this.f287568a != c.this.f287548o) {
                        return;
                    }
                    c.this.f287548o = null;
                    if (c.this.f287538e == io.ably.lib.realtime.e.detaching) {
                        r rVar = new r("Detach operation timed out", 90007);
                        c.D(this.f287569b, rVar);
                        c.this.u0(this.f287570c, rVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    class f implements io.ably.lib.realtime.g {
        f() {
        }

        @Override // io.ably.lib.realtime.g
        public void a(r rVar) {
            c.this.f287559z = false;
        }

        @Override // io.ably.lib.realtime.g
        public void onSuccess() {
            c.this.f287559z = false;
        }
    }

    static /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f287573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f287574b;

        static {
            int[] iArr = new int[e0.a.values().length];
            f287574b = iArr;
            try {
                iArr[e0.a.attached.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f287574b[e0.a.detach.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f287574b[e0.a.detached.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f287574b[e0.a.message.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f287574b[e0.a.sync.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f287574b[e0.a.presence.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f287574b[e0.a.error.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f287574b[e0.a.annotation.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[io.ably.lib.realtime.e.values().length];
            f287573a = iArr2;
            try {
                iArr2[io.ably.lib.realtime.e.attaching.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f287573a[io.ably.lib.realtime.e.detaching.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f287573a[io.ably.lib.realtime.e.attached.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f287573a[io.ably.lib.realtime.e.failed.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f287573a[io.ably.lib.realtime.e.initialized.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f287573a[io.ably.lib.realtime.e.detached.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f287573a[io.ably.lib.realtime.e.suspended.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    private static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f287575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.ably.lib.realtime.g f287576b;

        /* synthetic */ h(boolean z10, io.ably.lib.realtime.g gVar, a aVar) {
            this(z10, gVar);
        }

        private h(boolean z10, io.ably.lib.realtime.g gVar) {
            this.f287575a = z10;
            this.f287576b = gVar;
        }
    }

    private class i implements io.ably.lib.realtime.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private io.ably.lib.realtime.g f287577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.ably.lib.realtime.e f287578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.ably.lib.realtime.e f287579c;

        i(io.ably.lib.realtime.g gVar, io.ably.lib.realtime.e eVar, io.ably.lib.realtime.e eVar2) {
            this.f287577a = gVar;
            this.f287578b = eVar;
            this.f287579c = eVar2;
        }

        @Override // io.ably.lib.realtime.f
        public void b(io.ably.lib.realtime.f.a aVar) {
            if (aVar.f287603b.equals(this.f287578b)) {
                c.this.d(this);
                this.f287577a.onSuccess();
            } else if (aVar.f287603b.equals(this.f287579c)) {
                c.this.d(this);
                this.f287577a.a(c.this.f287539f);
            }
        }
    }

    private static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.ably.lib.realtime.g f287581a;

        /* synthetic */ j(io.ably.lib.realtime.g gVar, a aVar) {
            this(gVar);
        }

        private j(io.ably.lib.realtime.g gVar) {
            this.f287581a = gVar;
        }
    }

    private static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        io.ably.lib.transport.b.s f287582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        r f287583b;

        k(io.ably.lib.transport.b.s sVar, r rVar) {
            this.f287582a = sVar;
            this.f287583b = rVar;
        }
    }

    public interface l {
        void e(u uVar);
    }

    private static class m extends io.ably.lib.util.l<l> implements l {
        private m() {
            super(new l[0]);
        }

        @Override // io.ably.lib.realtime.c.l
        public void e(u uVar) {
            Iterator<l> it = i().iterator();
            while (it.hasNext()) {
                try {
                    it.next().e(uVar);
                } catch (Throwable th2) {
                    io.ably.lib.util.k.e(c.E, "Unexpected exception calling listener", th2);
                }
            }
        }

        /* synthetic */ m(a aVar) {
            this();
        }
    }

    c(io.ably.lib.realtime.a aVar, String str, io.ably.lib.types.l lVar, @Nullable mg.b bVar) throws io.ably.lib.types.a {
        io.ably.lib.util.k.k(E, "RealtimeChannel(); channel = " + str);
        this.f287552s = aVar;
        this.f287536c = str;
        this.f287553t = "/channels/" + io.ably.lib.http.m.f(str);
        r0(lVar);
        this.f287537d = new io.ably.lib.realtime.l((io.ably.lib.realtime.b) this);
        this.f287547n = false;
        this.f287538e = io.ably.lib.realtime.e.initialized;
        this.A = new p();
        this.f287543j = bVar;
        if (bVar != null) {
            bVar.c(str);
        }
        this.f287544k = new io.ably.lib.realtime.m(this, new io.ably.lib.rest.i(str, aVar.f287675b, aVar.f287674a, lVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        C(false, gVar, null);
    }

    private synchronized void C(boolean z10, io.ably.lib.realtime.g gVar, r rVar) {
        try {
            F();
            try {
                Timer timer = new Timer();
                this.f287548o = timer;
                try {
                    z(z10, new a(gVar), rVar);
                } catch (io.ably.lib.types.a e10) {
                    this.f287548o = null;
                    D(gVar, e10.f287918a);
                }
                Timer timer2 = this.f287548o;
                if (timer2 == null) {
                    return;
                }
                timer2.schedule(new b(timer), io.ably.lib.transport.c.f287855s);
            } catch (Throwable th2) {
                D(gVar, r.e(th2));
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(io.ably.lib.realtime.g gVar, r rVar) {
        if (gVar != null) {
            try {
                gVar.a(rVar);
            } catch (Throwable th2) {
                io.ably.lib.util.k.e(E, "Unexpected exception calling CompletionListener", th2);
            }
        }
    }

    private void D0(String str, l lVar) throws io.ably.lib.types.a {
        m mVar = this.f287551r.get(str);
        if (mVar == null) {
            mVar = new m(null);
            this.f287551r.put(str, mVar);
        }
        mVar.g(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void E(io.ably.lib.realtime.g gVar) {
        if (gVar != null) {
            try {
                gVar.onSuccess();
            } catch (Throwable th2) {
                io.ably.lib.util.k.e(E, "Unexpected exception calling CompletionListener", th2);
            }
        }
    }

    private void F() {
        if (this.f287542i) {
            throw new IllegalStateException("Unable to perform any operation on released channel");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void G() {
        try {
            Timer[] timerArr = {this.f287548o, this.f287549p};
            this.f287549p = null;
            this.f287548o = null;
            for (int i10 = 0; i10 < 2; i10++) {
                Timer timer = timerArr[i10];
                if (timer != null) {
                    timer.cancel();
                    timer.purge();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void J(io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        io.ably.lib.util.k.k(E, "detach(); channel = " + this.f287536c);
        int i10 = g.f287573a[this.f287538e.ordinal()];
        a aVar = null;
        boolean z10 = false ^ false;
        if (i10 == 1) {
            this.f287546m = new j(gVar, aVar);
            return;
        }
        if (i10 == 2) {
            if (gVar != null) {
                f(new i(gVar, io.ably.lib.realtime.e.detached, io.ably.lib.realtime.e.failed));
                return;
            }
            return;
        }
        if (i10 == 4) {
            r rVar = this.f287539f;
            if (rVar == null) {
                rVar = new r("Channel state is failed", 90000);
            }
            D(gVar, rVar);
            return;
        }
        if (i10 == 5 || i10 == 6) {
            E(gVar);
            return;
        }
        if (i10 == 7) {
            u0(io.ably.lib.realtime.e.detached, null);
            E(gVar);
        } else {
            io.ably.lib.transport.b bVar = this.f287552s.f287532i.f287618i;
            if (!bVar.X()) {
                throw io.ably.lib.types.a.a(bVar.U());
            }
            j0(gVar);
        }
    }

    private synchronized void K(io.ably.lib.realtime.g gVar) {
        d dVar;
        try {
            io.ably.lib.realtime.e eVar = this.f287538e;
            try {
                Timer timer = new Timer();
                boolean z10 = this.f287542i;
                this.f287548o = z10 ? null : timer;
                if (z10) {
                    dVar = null;
                } else {
                    try {
                        dVar = new d(gVar);
                    } catch (io.ably.lib.types.a e10) {
                        this.f287548o = null;
                        D(gVar, e10.f287918a);
                    }
                }
                J(dVar);
                Timer timer2 = this.f287548o;
                if (timer2 == null) {
                    return;
                }
                timer2.schedule(new e(timer, gVar, eVar), io.ably.lib.transport.c.f287855s);
            } catch (Throwable th2) {
                D(gVar, r.e(th2));
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private void K0(String str, l lVar) {
        m mVar = this.f287551r.get(str);
        if (mVar != null) {
            mVar.k(lVar);
            if (mVar.j()) {
                this.f287551r.remove(str);
            }
        }
    }

    private io.ably.lib.http.d.f<u> V(io.ably.lib.http.f fVar, b0[] b0VarArr) {
        try {
            return new io.ably.lib.http.d(fVar, this.f287553t + "/history", io.ably.lib.http.m.d(this.f287552s.f287674a.f288125u), i0((io.ably.lib.realtime.b) this, b0VarArr), y.h(this.f287554u)).h();
        } catch (io.ably.lib.types.a e10) {
            return new io.ably.lib.http.d.f.b(e10);
        }
    }

    private void Z(e0 e0Var) {
        String str;
        String str2 = E;
        io.ably.lib.util.k.k(str2, "onMessage(); channel = " + this.f287536c);
        u[] uVarArr = e0Var.f287965k;
        u uVar = uVarArr[0];
        u uVar2 = uVarArr[uVarArr.length - 1];
        x xVar = uVar.f288182t;
        q qVarC = xVar == null ? null : xVar.c();
        if (qVarC != null && !qVarC.b().equals(this.f287557x)) {
            io.ably.lib.util.k.d(str2, String.format(Locale.ROOT, "Delta message decode failure - previous message not available. Message id = %s, channel = %s", uVar.f288017a, this.f287536c));
            z0();
            return;
        }
        int i10 = 0;
        while (i10 < uVarArr.length) {
            u uVar3 = uVarArr[i10];
            if (uVar3.f288020d == null) {
                uVar3.f288020d = e0Var.f287962h;
            }
            if (uVar3.f288018b == 0) {
                uVar3.f288018b = e0Var.f287964j;
            }
            if (uVar3.f288017a == null) {
                uVar3.f288017a = e0Var.f287959e + AbstractJsonLexerKt.COLON + i10;
            }
            if (uVar3.f288184w == null && (str = uVar3.X) != null && uVar3.Y == v.MESSAGE_CREATE) {
                uVar3.f288184w = str;
            }
            if (uVar3.Z == null && uVar3.Y == v.MESSAGE_CREATE) {
                uVar3.Z = Long.valueOf(uVar3.f288018b);
            }
            try {
                if (uVar3.f288022f != null) {
                    uVar3.c(this.f287554u, this.A);
                }
            } catch (w e10) {
                r rVar = e10.f287918a;
                if (rVar.f288156a == 40018) {
                    io.ably.lib.util.k.d(E, String.format(Locale.ROOT, "Delta message decode failure - %s. Message id = %s, channel = %s", rVar.f288158c, uVar3.f288017a, this.f287536c));
                    z0();
                    while (true) {
                        i10++;
                        if (i10 >= uVarArr.length) {
                            return;
                        }
                        String str3 = uVarArr[i10].f288017a;
                        if (str3 == null) {
                            str3 = e0Var.f287959e + AbstractJsonLexerKt.COLON + i10;
                        }
                        io.ably.lib.util.k.k(E, String.format(Locale.ROOT, "Delta recovery in progress - message skipped. Message id = %s, channel = %s", str3, this.f287536c));
                    }
                } else {
                    io.ably.lib.util.k.d(E, String.format(Locale.ROOT, "Message decode failure - %s. Message id = %s, channel = %s", rVar.f288158c, uVar3.f288017a, this.f287536c));
                }
            }
            m mVar = this.f287551r.get(uVar3.f288181s);
            if (mVar != null) {
                mVar.e(uVar3);
            }
            i10++;
        }
        this.f287557x = uVar2.f288017a;
        this.f287558y = e0Var.f287961g;
        for (u uVar4 : uVarArr) {
            this.f287550q.e(uVar4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void h0() {
        try {
            Timer timer = new Timer();
            this.f287549p = timer;
            int i10 = this.f287541h + 1;
            this.f287541h = i10;
            this.f287549p.schedule(new C1939c(timer), o.c(this.f287552s.f287674a.M, i10));
        } catch (Throwable unused) {
        }
    }

    static b0[] i0(io.ably.lib.realtime.b bVar, b0[] b0VarArr) throws io.ably.lib.types.a {
        if (b0VarArr == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (b0 b0Var : b0VarArr) {
            if (!C.equals(b0Var.f287931a)) {
                hashSet.add(b0Var);
            } else if (z0.P.equalsIgnoreCase(b0Var.f287932b)) {
                if (bVar.f287538e != io.ably.lib.realtime.e.attached) {
                    throw io.ably.lib.types.a.a(new r("option untilAttach requires the channel to be attached", 40000, 400));
                }
                hashSet.add(new b0(D, bVar.f287540g.f288111a));
            } else if (!"false".equalsIgnoreCase(b0Var.f287932b)) {
                throw io.ably.lib.types.a.a(new r("option untilAttach is invalid. \"true\" or \"false\" expected", 40000, 400));
            }
        }
        return (b0[]) hashSet.toArray(new b0[hashSet.size()]);
    }

    private void j0(io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        e0 e0Var = new e0(e0.a.detach, this.f287536c);
        if (gVar != null) {
            f(new i(gVar, io.ably.lib.realtime.e.detached, io.ably.lib.realtime.e.failed));
        }
        this.f287547n = false;
        if (this.f287542i) {
            p0(null);
        } else {
            u0(io.ably.lib.realtime.e.detaching, null);
        }
        this.f287552s.f287532i.f287618i.r0(e0Var, true, null);
    }

    private void l0(e0 e0Var) {
        G();
        this.f287540g.f288111a = e0Var.f287961g;
        this.f287555v = e0Var.f287969o;
        this.f287556w = io.ably.lib.types.k.n(e0Var.f287956b);
        this.f287547n = true;
        io.ably.lib.realtime.e eVar = this.f287538e;
        if (eVar == io.ably.lib.realtime.e.detaching || eVar == io.ably.lib.realtime.e.detached) {
            io.ably.lib.util.k.k(E, "setAttached(): channel is in detaching state, as per RTL5k sending detach message!");
            try {
                j0(null);
                return;
            } catch (io.ably.lib.types.a e10) {
                io.ably.lib.util.k.e(E, e10.getMessage(), e10);
                return;
            }
        }
        mg.b bVar = this.f287543j;
        if (bVar != null) {
            try {
                bVar.d(this.f287536c, io.ably.lib.realtime.e.attached, e0Var.d(e0.d.has_objects));
            } catch (Throwable th2) {
                io.ably.lib.util.k.e(E, "Unexpected exception in liveObjectsPlugin.handle", th2);
            }
        }
        io.ably.lib.realtime.e eVar2 = this.f287538e;
        io.ably.lib.realtime.e eVar3 = io.ably.lib.realtime.e.attached;
        if (eVar2 != eVar3) {
            this.f287537d.A(e0Var.d(e0.d.has_presence));
            v0(eVar3, e0Var.f287958d, e0Var.d(e0.d.resumed));
            return;
        }
        io.ably.lib.util.k.k(E, String.format(Locale.ROOT, "Server initiated attach for channel %s", this.f287536c));
        if (e0Var.d(e0.d.resumed)) {
            return;
        }
        this.f287537d.A(e0Var.d(e0.d.has_presence));
        M(e0Var.f287958d, false);
    }

    private void p0(r rVar) {
        G();
        io.ably.lib.util.k.k(E, "setDetached(); channel = " + this.f287536c);
        this.f287537d.B(rVar);
        u0(io.ably.lib.realtime.e.detached, rVar);
    }

    private void q0(r rVar) {
        G();
        io.ably.lib.util.k.k(E, "setFailed(); channel = " + this.f287536c);
        this.f287537d.B(rVar);
        this.f287547n = false;
        u0(io.ably.lib.realtime.e.failed, rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(io.ably.lib.realtime.e eVar, r rVar) {
        w0(eVar, rVar, false, true);
    }

    private void v0(io.ably.lib.realtime.e eVar, r rVar, boolean z10) {
        w0(eVar, rVar, z10, true);
    }

    private void w0(io.ably.lib.realtime.e eVar, r rVar, boolean z10, boolean z11) {
        io.ably.lib.realtime.f.a aVar;
        io.ably.lib.util.k.k(E, "setState(): channel = " + this.f287536c + "; setting " + eVar);
        synchronized (this) {
            aVar = new io.ably.lib.realtime.f.a(eVar, this.f287538e, rVar, z10);
            this.f287538e = aVar.f287603b;
            this.f287539f = aVar.f287605d;
        }
        mg.b bVar = this.f287543j;
        if (bVar != null && eVar != io.ably.lib.realtime.e.attached) {
            try {
                bVar.d(this.f287536c, eVar, false);
            } catch (Throwable th2) {
                io.ably.lib.util.k.e(E, "Unexpected exception in liveObjectsPlugin.handle", th2);
            }
        }
        if (eVar != io.ably.lib.realtime.e.attaching && eVar != io.ably.lib.realtime.e.suspended) {
            this.f287541h = 0;
        }
        io.ably.lib.realtime.e eVar2 = io.ably.lib.realtime.e.detached;
        if (eVar == eVar2 || eVar == io.ably.lib.realtime.e.suspended || eVar == io.ably.lib.realtime.e.failed) {
            this.f287540g.f288112b = null;
        }
        if (z11) {
            L(eVar, aVar);
        }
        if (eVar == eVar2 && this.f287545l != null) {
            io.ably.lib.util.k.k(E, "Pending attach request after detach- now reattaching channel:" + this.f287536c);
            h hVar = this.f287545l;
            y(hVar.f287575a, hVar.f287576b);
            this.f287545l = null;
            return;
        }
        if (eVar != io.ably.lib.realtime.e.attached || this.f287546m == null) {
            return;
        }
        io.ably.lib.util.k.k(E, "Pending detach request after attach. Now detaching channel:" + this.f287536c);
        try {
            I(this.f287546m.f287581a);
            this.f287546m = null;
        } catch (io.ably.lib.types.a e10) {
            io.ably.lib.util.k.e(E, "Channel failed to detach after attach:" + this.f287536c, e10);
        }
    }

    private void z(boolean z10, io.ably.lib.realtime.g gVar, r rVar) throws io.ably.lib.types.a {
        String str = E;
        io.ably.lib.util.k.k(str, "attach(); channel = " + this.f287536c);
        a aVar = null;
        if (!z10) {
            int i10 = g.f287573a[this.f287538e.ordinal()];
            if (i10 == 1) {
                if (gVar != null) {
                    f(new i(gVar, io.ably.lib.realtime.e.attached, io.ably.lib.realtime.e.failed));
                    return;
                }
                return;
            } else {
                if (i10 == 2) {
                    this.f287545l = new h(z10, gVar, aVar);
                    return;
                }
                int i11 = 7 | 3;
                if (i10 == 3) {
                    E(gVar);
                    return;
                } else {
                    int i12 = i11 >> 4;
                    if (i10 == 4) {
                        this.f287539f = null;
                    }
                }
            }
        }
        io.ably.lib.transport.b bVar = this.f287552s.f287532i.f287618i;
        if (!bVar.X()) {
            throw io.ably.lib.types.a.a(bVar.U());
        }
        io.ably.lib.realtime.j jVar = bVar.R().f287818a;
        if (jVar == io.ably.lib.realtime.j.connecting || jVar == io.ably.lib.realtime.j.disconnected) {
            if (gVar != null) {
                f(new i(gVar, io.ably.lib.realtime.e.attached, io.ably.lib.realtime.e.failed));
            }
            u0(io.ably.lib.realtime.e.attaching, rVar);
            return;
        }
        io.ably.lib.util.k.k(str, "attach(); channel = " + this.f287536c + "; sending ATTACH request");
        e0 e0Var = new e0(e0.a.attach, this.f287536c);
        io.ably.lib.types.l lVar = this.f287554u;
        if (lVar != null) {
            if (lVar.f()) {
                e0Var.f287969o = io.ably.lib.util.d.a(this.f287554u.f288105a);
            }
            if (this.f287554u.e()) {
                e0Var.g(this.f287554u.d());
            }
        }
        e0Var.f287961g = this.f287540g.f288112b;
        if (this.f287559z) {
            io.ably.lib.util.k.k(str, "attach(); message decode recovery in progress, setting last message channelserial");
            e0Var.f287961g = this.f287558y;
        }
        if (gVar != null) {
            f(new i(gVar, io.ably.lib.realtime.e.attached, io.ably.lib.realtime.e.failed));
        }
        if (this.f287547n) {
            e0Var.f(e0.d.attach_resume);
        }
        u0(io.ably.lib.realtime.e.attaching, rVar);
        bVar.r0(e0Var, true, null);
    }

    private void z0() {
        if (this.f287559z) {
            return;
        }
        io.ably.lib.util.k.m(E, "Starting delta decode failure recovery process");
        this.f287559z = true;
        y(true, new f());
    }

    protected boolean A() {
        io.ably.lib.types.l lVar = this.f287554u;
        return lVar == null || lVar.f288109e;
    }

    public synchronized void A0(l lVar) throws io.ably.lib.types.a {
        try {
            io.ably.lib.util.k.k(E, "subscribe(); channel = " + this.f287536c);
            this.f287550q.g(lVar);
            if (A()) {
                w();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void B0(String str, l lVar) throws io.ably.lib.types.a {
        try {
            io.ably.lib.util.k.k(E, "subscribe(); channel = " + this.f287536c + "; event = " + str);
            D0(str, lVar);
            if (A()) {
                w();
            }
        } finally {
        }
    }

    public synchronized void C0(String[] strArr, l lVar) throws io.ably.lib.types.a {
        try {
            io.ably.lib.util.k.k(E, "subscribe(); channel = " + this.f287536c + "; (multiple events)");
            for (String str : strArr) {
                D0(str, lVar);
            }
            if (A()) {
                w();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Deprecated
    public void E0() throws io.ably.lib.types.a {
        io.ably.lib.util.k.m(E, "sync() method is intended only for internal testing purpose as per RTP19");
    }

    synchronized void F0(List<io.ably.lib.transport.b.s> list) {
        try {
            this.f287538e = io.ably.lib.realtime.e.attaching;
            if (list != null) {
                for (io.ably.lib.transport.b.s sVar : list) {
                    c0[] c0VarArr = sVar.f287815a.f287966l;
                    if (c0VarArr != null && c0VarArr.length > 0) {
                        for (c0 c0Var : c0VarArr) {
                            this.f287537d.c(c0Var, sVar.f287816b);
                        }
                    }
                }
            }
        } finally {
        }
    }

    public synchronized void G0() {
        try {
            io.ably.lib.util.k.k(E, "unsubscribe(); channel = " + this.f287536c);
            this.f287550q.h();
            this.f287551r.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void H() throws io.ably.lib.types.a {
        I(null);
    }

    public synchronized void H0(l lVar) {
        try {
            io.ably.lib.util.k.k(E, "unsubscribe(); channel = " + this.f287536c);
            this.f287550q.k(lVar);
            Iterator<m> it = this.f287551r.values().iterator();
            while (it.hasNext()) {
                it.next().k(lVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void I(io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        G();
        K(gVar);
    }

    public synchronized void I0(String str, l lVar) {
        io.ably.lib.util.k.k(E, "unsubscribe(); channel = " + this.f287536c + "; event = " + str);
        K0(str, lVar);
    }

    public synchronized void J0(String[] strArr, l lVar) {
        try {
            io.ably.lib.util.k.k(E, "unsubscribe(); channel = " + this.f287536c + "; (multiple events)");
            for (String str : strArr) {
                K0(str, lVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void L(io.ably.lib.realtime.e eVar, io.ably.lib.realtime.f.a aVar) {
        super.b(eVar.l(), aVar);
    }

    void M(r rVar, boolean z10) {
        if (this.f287538e == io.ably.lib.realtime.e.attached) {
            b(io.ably.lib.realtime.d.update, io.ably.lib.realtime.f.a.a(rVar, z10));
        }
    }

    public io.ably.lib.types.k[] N() {
        Set<io.ably.lib.types.k> set = this.f287556w;
        return set == null ? new io.ably.lib.types.k[0] : (io.ably.lib.types.k[]) set.toArray(new io.ably.lib.types.k[set.size()]);
    }

    public mg.i O() throws io.ably.lib.types.a {
        mg.b bVar = this.f287543j;
        if (bVar != null) {
            return bVar.c(this.f287536c);
        }
        throw io.ably.lib.types.a.a(new r("LiveObjects plugin hasn't been installed, add runtimeOnly('io.ably:liveobjects:<ably-version>') to your dependency tree", 400, 40019));
    }

    public io.ably.lib.types.l P() {
        return this.f287554u;
    }

    public Map<String, String> Q() {
        return io.ably.lib.util.d.a(this.f287555v);
    }

    a0<u> R(io.ably.lib.http.f fVar, b0[] b0VarArr) throws io.ably.lib.types.a {
        return V(fVar, b0VarArr).b();
    }

    public a0<u> S(b0[] b0VarArr) throws io.ably.lib.types.a {
        return V(this.f287552s.f287675b, b0VarArr).b();
    }

    void T(io.ably.lib.http.f fVar, b0[] b0VarArr, io.ably.lib.types.i<io.ably.lib.types.f<u>> iVar) {
        V(fVar, b0VarArr).a(iVar);
    }

    public void U(b0[] b0VarArr, io.ably.lib.types.i<io.ably.lib.types.f<u>> iVar) {
        T(this.f287552s.f287675b, b0VarArr, iVar);
    }

    public synchronized void W() {
        try {
            this.f287542i = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void X(io.ably.lib.realtime.e eVar, io.ably.lib.realtime.f fVar) {
        super.g(eVar.l(), fVar);
    }

    void Y(e0 e0Var) {
        e0.a aVar;
        if (!io.ably.lib.util.q.a(e0Var.f287961g) && ((aVar = e0Var.f287955a) == e0.a.message || aVar == e0.a.presence || aVar == e0.a.attached)) {
            io.ably.lib.util.k.k(E, String.format(Locale.ROOT, "Setting channel serial for channelName - %s, previous - %s, current - %s", this.f287536c, this.f287540g.f288112b, e0Var.f287961g));
            this.f287540g.f288112b = e0Var.f287961g;
        }
        switch (g.f287574b[e0Var.f287955a.ordinal()]) {
            case 1:
                l0(e0Var);
                break;
            case 2:
            case 3:
                int i10 = g.f287573a[this.f287538e.ordinal()];
                if (i10 == 1) {
                    io.ably.lib.util.k.k(E, String.format(Locale.ROOT, "Server initiated detach for channel %s whilst attaching; moving to suspended", this.f287536c));
                    x0(e0Var.f287958d, true);
                    h0();
                } else if (i10 == 2) {
                    r rVar = e0Var.f287958d;
                    if (rVar == null) {
                        rVar = B;
                    }
                    p0(rVar);
                } else if (i10 == 3 || i10 == 7) {
                    io.ably.lib.util.k.k(E, String.format(Locale.ROOT, "Server initiated detach for channel %s; attempting reattach", this.f287536c));
                    int i11 = 6 << 0;
                    C(true, null, e0Var.f287958d);
                }
                break;
            case 4:
                if (this.f287538e == io.ably.lib.realtime.e.attached) {
                    Z(e0Var);
                } else {
                    String str = this.f287559z ? "Delta recovery in progress - message skipped." : "Message skipped on a channel that is not ATTACHED.";
                    for (u uVar : e0Var.f287965k) {
                        io.ably.lib.util.k.k(E, String.format(str + " Message id = %s, channel = %s", uVar.f288017a, this.f287536c));
                    }
                }
                break;
            case 5:
                this.f287537d.E(e0Var);
                break;
            case 6:
                this.f287537d.D(e0Var);
                break;
            case 7:
                q0(e0Var.f287958d);
                break;
            case 8:
                this.f287544k.o(e0Var);
                break;
            default:
                io.ably.lib.util.k.d(E, "onChannelMessage(): Unexpected message action (" + e0Var.f287955a + ")");
                break;
        }
    }

    public void a0(io.ably.lib.realtime.e eVar, io.ably.lib.realtime.f fVar) {
        super.i(eVar.l(), fVar);
    }

    public void b0(u uVar) throws io.ably.lib.types.a {
        c0(uVar, null);
    }

    public void c0(u uVar, io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        io.ably.lib.util.k.k(E, "publish(Message); channel = " + this.f287536c + "; event = " + uVar.f288181s);
        g0(new u[]{uVar}, gVar);
    }

    public void d0(String str, Object obj) throws io.ably.lib.types.a {
        e0(str, obj, null);
    }

    public void e0(String str, Object obj, io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        io.ably.lib.util.k.k(E, "publish(String, Object); channel = " + this.f287536c + "; event = " + str);
        g0(new u[]{new u(str, obj)}, gVar);
    }

    public void f0(u[] uVarArr) throws io.ably.lib.types.a {
        g0(uVarArr, null);
    }

    public synchronized void g0(u[] uVarArr, io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        try {
            io.ably.lib.util.k.k(E, "publish(Message[]); channel = " + this.f287536c);
            io.ably.lib.transport.b bVar = this.f287552s.f287532i.f287618i;
            io.ably.lib.transport.b.u uVarR = bVar.R();
            boolean z10 = this.f287552s.f287674a.f288126v;
            if (!bVar.X() || (uVarR.f287820c && !z10)) {
                throw io.ably.lib.types.a.a(uVarR.f287819b);
            }
            boolean z11 = uVarR.f287821d;
            try {
                for (u uVar : uVarArr) {
                    this.f287552s.f287677d.h(uVar, true, z11);
                    uVar.d(this.f287554u);
                }
                e0 e0Var = new e0(e0.a.message, this.f287536c);
                e0Var.f287965k = uVarArr;
                int i10 = g.f287573a[this.f287538e.ordinal()];
                if (i10 == 4 || i10 == 7) {
                    throw io.ably.lib.types.a.a(new r("Unable to publish in failed or suspended state", 400, 40000));
                }
                bVar.r0(e0Var, z10, gVar);
            } catch (io.ably.lib.types.a e10) {
                D(gVar, e10.f287918a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void k0(e0 e0Var, io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        io.ably.lib.realtime.a aVar = this.f287552s;
        aVar.f287532i.f287618i.r0(e0Var, aVar.f287674a.f288126v, gVar);
    }

    public void m0() {
        if (this.f287538e.n()) {
            y(true, null);
        }
    }

    public void n0(r rVar) {
        G();
        io.ably.lib.realtime.e eVar = this.f287538e;
        if (eVar == io.ably.lib.realtime.e.attached || eVar == io.ably.lib.realtime.e.attaching) {
            p0(rVar);
        }
    }

    public void o0(r rVar) {
        G();
        io.ably.lib.realtime.e eVar = this.f287538e;
        if (eVar == io.ably.lib.realtime.e.attached || eVar == io.ably.lib.realtime.e.attaching) {
            q0(rVar);
        }
    }

    public void r0(io.ably.lib.types.l lVar) throws io.ably.lib.types.a {
        s0(lVar, null);
    }

    public void s0(io.ably.lib.types.l lVar, io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        this.f287554u = lVar;
        if (y0(lVar)) {
            y(true, gVar);
        } else {
            E(gVar);
        }
    }

    public synchronized void t0() {
        try {
            G();
            u0(io.ably.lib.realtime.e.initialized, null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.ably.lib.util.g
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void a(io.ably.lib.realtime.f fVar, io.ably.lib.realtime.d dVar, Object... objArr) {
        try {
            fVar.b((io.ably.lib.realtime.f.a) objArr[0]);
        } catch (Throwable th2) {
            io.ably.lib.util.k.e(E, "Unexpected exception calling ChannelStateListener", th2);
        }
    }

    public void w() throws io.ably.lib.types.a {
        x(null);
    }

    public void x(io.ably.lib.realtime.g gVar) throws io.ably.lib.types.a {
        y(false, gVar);
    }

    public synchronized void x0(r rVar, boolean z10) {
        try {
            G();
            io.ably.lib.realtime.e eVar = this.f287538e;
            if (eVar == io.ably.lib.realtime.e.attached || eVar == io.ably.lib.realtime.e.attaching) {
                io.ably.lib.util.k.k(E, "setSuspended(); channel = " + this.f287536c);
                this.f287537d.C(rVar);
                w0(io.ably.lib.realtime.e.suspended, rVar, false, z10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    void y(boolean z10, io.ably.lib.realtime.g gVar) {
        G();
        C(z10, gVar, null);
    }

    boolean y0(io.ably.lib.types.l lVar) {
        io.ably.lib.realtime.e eVar = this.f287538e;
        if (eVar == io.ably.lib.realtime.e.attached || eVar == io.ably.lib.realtime.e.attaching) {
            return lVar.e() || lVar.f();
        }
        return false;
    }
}
