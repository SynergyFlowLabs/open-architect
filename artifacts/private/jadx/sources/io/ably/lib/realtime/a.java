package io.ably.lib.realtime;

import io.ably.lib.types.e0;
import io.ably.lib.types.i0;
import io.ably.lib.types.j0;
import io.ably.lib.types.n;
import io.ably.lib.types.r;
import io.ably.lib.util.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class a extends io.ably.lib.rest.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f287531l = "io.ably.lib.realtime.a";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h f287532i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f287533j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final mg.b f287534k;

    public interface b extends i0<String, io.ably.lib.realtime.b> {
        io.ably.lib.realtime.b b(String str, io.ably.lib.types.l lVar) throws io.ably.lib.types.a;

        void c(String str);

        io.ably.lib.realtime.b get(String str);
    }

    private class c extends io.ably.lib.util.h<String, io.ably.lib.realtime.b> implements b, io.ably.lib.transport.b.g {
        private c() {
        }

        private void f() {
            this.f288234a.clear();
        }

        @Override // io.ably.lib.transport.b.g
        public void a(e0 e0Var) {
            io.ably.lib.realtime.b bVar;
            String str = e0Var.f287960f;
            synchronized (this) {
                try {
                    bVar = a.this.f287533j.containsKey(str) ? a.this.f287533j.get(str) : null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (bVar == null) {
                io.ably.lib.util.k.d(a.f287531l, "Received channel message for non-existent channel");
            } else {
                bVar.Y(e0Var);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.ably.lib.realtime.a.b
        public io.ably.lib.realtime.b b(String str, io.ably.lib.types.l lVar) throws io.ably.lib.types.a {
            a aVar = a.this;
            io.ably.lib.realtime.b bVar = new io.ably.lib.realtime.b(aVar, str, lVar, aVar.f287534k);
            io.ably.lib.realtime.b bVar2 = (io.ably.lib.realtime.b) this.f288234a.putIfAbsent((K) str, (V) bVar);
            if (bVar2 == null) {
                return bVar;
            }
            if (lVar == null) {
                return bVar2;
            }
            if (bVar2.y0(lVar)) {
                throw io.ably.lib.types.a.a(new r("Channels.get() cannot be used to set channel options that would cause the channel to reattach. Please, use Channel.setOptions() instead.", 40000, 400));
            }
            bVar2.r0(lVar);
            return bVar2;
        }

        @Override // io.ably.lib.realtime.a.b
        public void c(String str) {
            io.ably.lib.realtime.b bVar = (io.ably.lib.realtime.b) this.f288234a.remove(str);
            if (bVar != null) {
                bVar.W();
                try {
                    bVar.H();
                } catch (io.ably.lib.types.a e10) {
                    io.ably.lib.util.k.e(a.f287531l, "Unexpected exception detaching channel; channelName = " + str, e10);
                }
            }
            if (a.this.f287534k != null) {
                a.this.f287534k.b(str);
            }
        }

        @Override // io.ably.lib.transport.b.g
        public void d(r rVar, boolean z10) {
            Iterator it = this.f288234a.values().iterator();
            while (it.hasNext()) {
                ((io.ably.lib.realtime.b) it.next()).x0(rVar, z10);
            }
        }

        @Override // io.ably.lib.transport.b.g
        public void e(List<io.ably.lib.transport.b.s> list) {
            HashMap map = new HashMap();
            for (io.ably.lib.transport.b.s sVar : list) {
                String str = sVar.f287815a.f287960f;
                if (!map.containsKey(str)) {
                    map.put(str, new ArrayList());
                }
                ((List) map.get(str)).add(sVar);
            }
            for (io.ably.lib.realtime.b bVar : this.f288234a.values()) {
                if (bVar.f287538e.n()) {
                    io.ably.lib.util.k.b(a.f287531l, "reAttach(); channel = " + bVar.f287536c);
                    bVar.F0((List) map.get(bVar.f287536c));
                }
            }
        }

        @Override // io.ably.lib.realtime.a.b
        public io.ably.lib.realtime.b get(String str) {
            try {
                return b(str, null);
            } catch (io.ably.lib.types.a unused) {
                return null;
            }
        }
    }

    public a(String str) throws io.ably.lib.types.a {
        this(new n(str));
    }

    public void Y() {
        this.f287532i.l();
    }

    @Override // io.ably.lib.rest.a
    protected void a(r rVar) {
        this.f287532i.f287618i.b0(rVar);
    }

    @Override // io.ably.lib.rest.a
    protected void b(String str, boolean z10) throws io.ably.lib.types.a {
        this.f287532i.f287618i.c0(str, z10);
    }

    @Override // io.ably.lib.rest.a
    protected void c(String str, io.ably.lib.rest.d.f fVar) {
        this.f287532i.f287618i.d0(str, fVar);
    }

    @Override // io.ably.lib.rest.a, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (Exception e10) {
            io.ably.lib.util.k.e(f287531l, "There was an exception releasing client instance base resources.", e10);
        }
        this.f287532i.k();
        mg.b bVar = this.f287534k;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    protected Map<String, String> d0() {
        HashMap map = new HashMap();
        for (io.ably.lib.realtime.b bVar : this.f287533j.values()) {
            if (bVar.f287538e == e.attached) {
                map.put(bVar.f287536c, bVar.f287540g.f288112b);
            }
        }
        return map;
    }

    protected void f0(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            io.ably.lib.realtime.b bVar = this.f287533j.get(key);
            if (bVar != null) {
                bVar.f287540g.f288112b = value;
            }
        }
    }

    public a(n nVar) throws io.ably.lib.types.a {
        j0 j0VarA;
        super(nVar);
        c cVar = new c();
        this.f287533j = cVar;
        mg.b bVarB = mg.e.b(this);
        this.f287534k = bVarB;
        h hVar = new h(this, cVar, this.f287681h, bVarB);
        this.f287532i = hVar;
        if (!q.a(nVar.f288128x) && (j0VarA = j0.a(nVar.f288128x)) != null) {
            f0(j0VarA.c());
            hVar.f287618i.f287792w = j0VarA.e();
        }
        if (nVar.f288124t) {
            hVar.l();
        }
    }
}
