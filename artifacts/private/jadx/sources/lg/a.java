package lg;

import io.ably.lib.http.i;
import io.ably.lib.transport.e;
import io.ably.lib.types.e0;
import io.ably.lib.types.n;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class a extends n {
    public b T;
    public InterfaceC2328a U;
    public e.b V;

    /* JADX INFO: renamed from: lg.a$a, reason: collision with other inner class name */
    public interface InterfaceC2328a {
        void a(String str, String str2, i.d dVar);

        i.d b(String str, io.ably.lib.network.n nVar, String str2, Map<String, List<String>> map, i.c cVar);

        void c(String str, String str2, Throwable th2);
    }

    public interface b {
        void a(e0 e0Var);

        void b(e0 e0Var);

        void c(String str);

        void d(String str);
    }

    public a() {
        this.P = true;
    }

    @Override // io.ably.lib.types.n
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a f() {
        a aVar = new a();
        aVar.T = this.T;
        aVar.U = this.U;
        aVar.V = this.V;
        aVar.f288115k = this.f288115k;
        aVar.f288116l = this.f288116l;
        aVar.f288117m = this.f288117m;
        aVar.f288118n = this.f288118n;
        aVar.f288120p = this.f288120p;
        aVar.f288121q = this.f288121q;
        aVar.f288122r = this.f288122r;
        aVar.f288123s = this.f288123s;
        aVar.f288124t = this.f288124t;
        aVar.f288125u = this.f288125u;
        aVar.f288126v = this.f288126v;
        aVar.f288127w = this.f288127w;
        aVar.f288128x = this.f288128x;
        aVar.f288129y = this.f288129y;
        aVar.f288130z = this.f288130z;
        aVar.A = this.A;
        aVar.B = this.B;
        aVar.C = this.C;
        aVar.D = this.D;
        aVar.E = this.E;
        aVar.F = this.F;
        aVar.G = this.G;
        aVar.I = this.I;
        aVar.J = this.J;
        aVar.K = this.K;
        aVar.L = this.L;
        aVar.M = this.M;
        aVar.O = this.O;
        aVar.P = this.P;
        aVar.Q = this.Q;
        aVar.R = this.R;
        aVar.f287711a = this.f287711a;
        aVar.f287712b = this.f287712b;
        aVar.f287713c = this.f287713c;
        aVar.f287714d = this.f287714d;
        aVar.f287715e = this.f287715e;
        aVar.f287716f = this.f287716f;
        aVar.f287717g = this.f287717g;
        aVar.f287718h = this.f287718h;
        aVar.f287719i = this.f287719i;
        aVar.f287720j = this.f287720j;
        return aVar;
    }

    public a(String str) throws io.ably.lib.types.a {
        super(str);
        this.P = true;
    }
}
