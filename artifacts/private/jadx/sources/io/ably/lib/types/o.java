package io.ably.lib.types;

import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class o {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f288133j = "io.ably.lib.types.o";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f288134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f288135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f288136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f288137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f288138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f288139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f288140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f288141h = Long.valueOf(io.ably.lib.transport.c.f287858v);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Long f288142i = Long.valueOf(io.ably.lib.transport.c.f287860x);

    o() {
    }

    static o a(org.msgpack.core.o oVar) throws IOException {
        return new o().b(oVar);
    }

    o b(org.msgpack.core.o oVar) throws IOException {
        int iB1 = oVar.b1();
        for (int i10 = 0; i10 < iB1; i10++) {
            String strIntern = oVar.h1().intern();
            if (!oVar.d().equals(org.msgpack.core.c.f339230f)) {
                strIntern.getClass();
                switch (strIntern) {
                    case "maxIdleInterval":
                        this.f288141h = Long.valueOf(oVar.U0());
                        break;
                    case "maxFrameSize":
                        this.f288140g = Long.valueOf(oVar.U0());
                        break;
                    case "connectionKey":
                        this.f288135b = oVar.h1();
                        break;
                    case "clientId":
                        this.f288134a = oVar.h1();
                        break;
                    case "maxInboundRate":
                        this.f288138e = Long.valueOf(oVar.U0());
                        break;
                    case "serverId":
                        this.f288136c = oVar.h1();
                        break;
                    case "maxMessageSize":
                        this.f288137d = oVar.T0();
                        break;
                    case "connectionStateTtl":
                        this.f288142i = Long.valueOf(oVar.U0());
                        break;
                    case "maxOutboundRate":
                        this.f288139f = Long.valueOf(oVar.U0());
                        break;
                    default:
                        io.ably.lib.util.k.k(f288133j, "Unexpected field: " + strIntern);
                        oVar.a9();
                        break;
                }
            } else {
                oVar.d1();
            }
        }
        return this;
    }
}
