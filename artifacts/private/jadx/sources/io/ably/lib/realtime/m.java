package io.ably.lib.realtime;

import androidx.media2.session.SessionCommand;
import io.ably.lib.types.a0;
import io.ably.lib.types.b0;
import io.ably.lib.types.e0;
import io.ably.lib.types.r;
import io.ably.lib.types.u;
import io.ably.lib.types.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
public class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f287669e = "io.ably.lib.realtime.m";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.ably.lib.realtime.c f287670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.ably.lib.rest.i f287671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f287672c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, c> f287673d = new HashMap();

    public interface b {
        void f(io.ably.lib.types.b bVar);
    }

    private static class c extends io.ably.lib.util.l<b> implements b {
        private c() {
            super(new b[0]);
        }

        @Override // io.ably.lib.realtime.m.b
        public void f(io.ably.lib.types.b bVar) {
            Iterator<b> it = i().iterator();
            while (it.hasNext()) {
                try {
                    it.next().f(bVar);
                } catch (Exception e10) {
                    io.ably.lib.util.k.e(m.f287669e, e10.getMessage(), e10);
                }
            }
        }
    }

    public m(io.ably.lib.realtime.c cVar, io.ably.lib.rest.i iVar) {
        this.f287670a = cVar;
        this.f287671b = iVar;
    }

    private void A(String str) throws io.ably.lib.types.a {
        if (str == null) {
            throw io.ably.lib.types.a.a(new r("Message serial can not be empty", 400, SessionCommand.f58655d0));
        }
    }

    private void b(List<io.ably.lib.types.b> list) {
        for (io.ably.lib.types.b bVar : list) {
            this.f287672c.f(bVar);
            String str = bVar.f287930w;
            if (str == null) {
                str = "";
            }
            c cVar = this.f287673d.get(str);
            if (cVar != null) {
                cVar.f(bVar);
            }
        }
    }

    private void t(String str, io.ably.lib.types.b bVar, g gVar) throws io.ably.lib.types.a {
        if (bVar.f287930w == null) {
            throw io.ably.lib.types.a.a(new r("Annotation type must be specified", 400, 40000));
        }
        bVar.f287929v = str;
        try {
            bVar.d(this.f287670a.f287554u);
            io.ably.lib.util.k.k(f287669e, String.format("RealtimeAnnotations.sendAnnotation(): channelName = %s, sending annotation with messageSerial = %s, type = %s, action = %s", this.f287670a.f287536c, str, bVar.f287930w, bVar.f287927s.name()));
            e0 e0Var = new e0();
            e0Var.f287955a = e0.a.annotation;
            io.ably.lib.realtime.c cVar = this.f287670a;
            e0Var.f287960f = cVar.f287536c;
            e0Var.f287970p = new io.ably.lib.types.b[]{bVar};
            cVar.k0(e0Var, gVar);
        } catch (w e10) {
            throw io.ably.lib.types.a.c(e10);
        }
    }

    private void w(String str, b bVar) {
        if (str == null) {
            str = "";
        }
        c cVar = this.f287673d.get(str);
        if (cVar == null) {
            cVar = new c();
            this.f287673d.put(str, cVar);
        }
        cVar.g(bVar);
    }

    private void z(String str, b bVar) {
        c cVar = this.f287673d.get(str);
        if (cVar != null) {
            cVar.k(bVar);
            if (cVar.j()) {
                this.f287673d.remove(str);
            }
        }
    }

    public void c(u uVar, io.ably.lib.types.b bVar) throws io.ably.lib.types.a {
        e(uVar.f288184w, bVar);
    }

    public void d(u uVar, io.ably.lib.types.b bVar, g gVar) throws io.ably.lib.types.a {
        f(uVar.f288184w, bVar, gVar);
    }

    public void e(String str, io.ably.lib.types.b bVar) throws io.ably.lib.types.a {
        f(str, bVar, null);
    }

    public void f(String str, io.ably.lib.types.b bVar, g gVar) throws io.ably.lib.types.a {
        io.ably.lib.util.k.k(f287669e, String.format("delete(MsgSerial, Annotation); channel = %s", this.f287670a.f287536c));
        bVar.f287927s = io.ably.lib.types.c.ANNOTATION_DELETE;
        t(str, bVar, gVar);
    }

    public a0<io.ably.lib.types.b> g(u uVar) throws io.ably.lib.types.a {
        return i(uVar.f288184w);
    }

    public a0<io.ably.lib.types.b> h(u uVar, b0[] b0VarArr) throws io.ably.lib.types.a {
        return j(uVar.f288184w, b0VarArr);
    }

    public a0<io.ably.lib.types.b> i(String str) throws io.ably.lib.types.a {
        return this.f287671b.j(str, null);
    }

    public a0<io.ably.lib.types.b> j(String str, b0[] b0VarArr) throws io.ably.lib.types.a {
        return this.f287671b.j(str, b0VarArr);
    }

    public void k(u uVar, io.ably.lib.types.i<io.ably.lib.types.f<io.ably.lib.types.b>> iVar) throws io.ably.lib.types.a {
        m(uVar.f288184w, iVar);
    }

    public void l(u uVar, b0[] b0VarArr, io.ably.lib.types.i<io.ably.lib.types.f<io.ably.lib.types.b>> iVar) throws io.ably.lib.types.a {
        n(uVar.f288184w, b0VarArr, iVar);
    }

    public void m(String str, io.ably.lib.types.i<io.ably.lib.types.f<io.ably.lib.types.b>> iVar) throws io.ably.lib.types.a {
        this.f287671b.n(str, null, iVar);
    }

    public void n(String str, b0[] b0VarArr, io.ably.lib.types.i<io.ably.lib.types.f<io.ably.lib.types.b>> iVar) throws io.ably.lib.types.a {
        this.f287671b.n(str, b0VarArr, iVar);
    }

    public void o(e0 e0Var) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            io.ably.lib.types.b[] bVarArr = e0Var.f287970p;
            if (i10 >= bVarArr.length) {
                b(arrayList);
                return;
            }
            io.ably.lib.types.b bVar = bVarArr[i10];
            try {
                if (bVar.f288022f != null) {
                    bVar.b(this.f287670a.f287554u);
                }
            } catch (w e10) {
                io.ably.lib.util.k.d(f287669e, String.format(Locale.ROOT, "%s on channel %s", e10.f287918a.f288158c, this.f287670a.f287536c));
            }
            if (bVar.f288020d == null) {
                bVar.f288020d = e0Var.f287962h;
            }
            if (bVar.f288018b == 0) {
                bVar.f288018b = e0Var.f287964j;
            }
            if (bVar.f288017a == null) {
                bVar.f288017a = e0Var.f287959e + AbstractJsonLexerKt.COLON + i10;
            }
            arrayList.add(bVar);
            i10++;
        }
    }

    public void p(u uVar, io.ably.lib.types.b bVar) throws io.ably.lib.types.a {
        r(uVar.f288184w, bVar);
    }

    public void q(u uVar, io.ably.lib.types.b bVar, g gVar) throws io.ably.lib.types.a {
        s(uVar.f288184w, bVar, gVar);
    }

    public void r(String str, io.ably.lib.types.b bVar) throws io.ably.lib.types.a {
        s(str, bVar, null);
    }

    public void s(String str, io.ably.lib.types.b bVar, g gVar) throws io.ably.lib.types.a {
        io.ably.lib.util.k.k(f287669e, String.format("publish(MsgSerial, Annotation); channel = %s", this.f287670a.f287536c));
        A(str);
        bVar.f287927s = io.ably.lib.types.c.ANNOTATION_CREATE;
        t(str, bVar, gVar);
    }

    public synchronized void u(b bVar) throws io.ably.lib.types.a {
        io.ably.lib.util.k.k(f287669e, String.format("subscribe(); annotations in channel = %s", this.f287670a.f287536c));
        this.f287672c.g(bVar);
        if (this.f287670a.A()) {
            this.f287670a.w();
        }
    }

    public synchronized void v(String str, b bVar) throws io.ably.lib.types.a {
        io.ably.lib.util.k.k(f287669e, String.format("subscribe(); annotations in channel = %s; single type = %s", this.f287670a.f287536c, str));
        w(str, bVar);
        if (this.f287670a.A()) {
            this.f287670a.w();
        }
    }

    public synchronized void x(b bVar) {
        io.ably.lib.util.k.k(f287669e, String.format("unsubscribe(); annotations in channel = %s", this.f287670a.f287536c));
        this.f287672c.k(bVar);
        Iterator<c> it = this.f287673d.values().iterator();
        while (it.hasNext()) {
            it.next().k(bVar);
        }
    }

    public synchronized void y(String str, b bVar) {
        try {
            io.ably.lib.util.k.k(f287669e, String.format("unsubscribe(); annotations in channel = %s; single type = %s", this.f287670a.f287536c, str));
            z(str, bVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
