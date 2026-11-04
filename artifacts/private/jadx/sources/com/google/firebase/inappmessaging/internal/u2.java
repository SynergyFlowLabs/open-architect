package com.google.firebase.inappmessaging.internal;

import android.os.Bundle;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public class u2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map<com.google.firebase.inappmessaging.r.b, com.google.firebase.inappmessaging.z> f122951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map<com.google.firebase.inappmessaging.r.a, com.google.firebase.inappmessaging.g> f122952i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f122953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.h f122954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.firebase.installations.k f122955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.inappmessaging.internal.time.a f122956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.firebase.analytics.connector.a f122957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f122958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d8.b
    private final Executor f122959g;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f122960a;

        static {
            int[] iArr = new int[MessageType.values().length];
            f122960a = iArr;
            try {
                iArr[MessageType.CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f122960a[MessageType.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f122960a[MessageType.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f122960a[MessageType.IMAGE_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface b {
        void a(byte[] bArr);
    }

    static {
        HashMap map = new HashMap();
        f122951h = map;
        HashMap map2 = new HashMap();
        f122952i = map2;
        map.put(com.google.firebase.inappmessaging.r.b.UNSPECIFIED_RENDER_ERROR, com.google.firebase.inappmessaging.z.UNSPECIFIED_RENDER_ERROR);
        map.put(com.google.firebase.inappmessaging.r.b.IMAGE_FETCH_ERROR, com.google.firebase.inappmessaging.z.IMAGE_FETCH_ERROR);
        map.put(com.google.firebase.inappmessaging.r.b.IMAGE_DISPLAY_ERROR, com.google.firebase.inappmessaging.z.IMAGE_DISPLAY_ERROR);
        map.put(com.google.firebase.inappmessaging.r.b.IMAGE_UNSUPPORTED_FORMAT, com.google.firebase.inappmessaging.z.IMAGE_UNSUPPORTED_FORMAT);
        map2.put(com.google.firebase.inappmessaging.r.a.AUTO, com.google.firebase.inappmessaging.g.AUTO);
        map2.put(com.google.firebase.inappmessaging.r.a.CLICK, com.google.firebase.inappmessaging.g.CLICK);
        map2.put(com.google.firebase.inappmessaging.r.a.SWIPE, com.google.firebase.inappmessaging.g.SWIPE);
        map2.put(com.google.firebase.inappmessaging.r.a.UNKNOWN_DISMISS_TYPE, com.google.firebase.inappmessaging.g.UNKNOWN_DISMISS_TYPE);
    }

    public u2(b bVar, com.google.firebase.analytics.connector.a aVar, com.google.firebase.h hVar, com.google.firebase.installations.k kVar, com.google.firebase.inappmessaging.internal.time.a aVar2, w wVar, @d8.b Executor executor) {
        this.f122953a = bVar;
        this.f122957e = aVar;
        this.f122954b = hVar;
        this.f122955c = kVar;
        this.f122956d = aVar2;
        this.f122958f = wVar;
        this.f122959g = executor;
    }

    private com.google.firebase.inappmessaging.b.C1149b f(com.google.firebase.inappmessaging.model.i iVar, String str) {
        return com.google.firebase.inappmessaging.b.Mm().jm("21.0.2").lm(this.f122954b.s().m()).am(iVar.f().a()).cm(com.google.firebase.inappmessaging.d.jm().Sl(this.f122954b.s().j()).Ql(str)).em(this.f122956d.a());
    }

    private com.google.firebase.inappmessaging.b g(com.google.firebase.inappmessaging.model.i iVar, String str, com.google.firebase.inappmessaging.g gVar) {
        return f(iVar, str).fm(gVar).build();
    }

    private com.google.firebase.inappmessaging.b h(com.google.firebase.inappmessaging.model.i iVar, String str, com.google.firebase.inappmessaging.h hVar) {
        return f(iVar, str).hm(hVar).build();
    }

    private com.google.firebase.inappmessaging.b i(com.google.firebase.inappmessaging.model.i iVar, String str, com.google.firebase.inappmessaging.z zVar) {
        return f(iVar, str).nm(zVar).build();
    }

    private boolean j(com.google.firebase.inappmessaging.model.i iVar) {
        boolean zL;
        int i10 = a.f122960a[iVar.l().ordinal()];
        if (i10 == 1) {
            com.google.firebase.inappmessaging.model.f fVar = (com.google.firebase.inappmessaging.model.f) iVar;
            return (l(fVar.q()) || l(fVar.r())) ? false : true;
        }
        if (i10 == 2) {
            zL = l(((com.google.firebase.inappmessaging.model.j) iVar).a());
        } else if (i10 == 3) {
            zL = l(((com.google.firebase.inappmessaging.model.c) iVar).a());
        } else {
            if (i10 != 4) {
                p2.b("Unable to determine if impression should be counted as conversion.");
                return false;
            }
            zL = l(((com.google.firebase.inappmessaging.model.h) iVar).a());
        }
        return !zL;
    }

    private boolean k(com.google.firebase.inappmessaging.model.i iVar) {
        return iVar.f().c();
    }

    private boolean l(@fj.h com.google.firebase.inappmessaging.model.a aVar) {
        return (aVar == null || aVar.b() == null || aVar.b().isEmpty()) ? false : true;
    }

    private void n(com.google.firebase.inappmessaging.model.i iVar, String str, boolean z10) {
        String strA = iVar.f().a();
        Bundle bundleE = e(iVar.f().b(), strA);
        p2.a("Sending event=" + str + " params=" + bundleE);
        com.google.firebase.analytics.connector.a aVar = this.f122957e;
        if (aVar == null) {
            p2.d("Unable to log event: analytics library is missing");
            return;
        }
        aVar.a("fiam", str, bundleE);
        if (z10) {
            this.f122957e.b("fiam", com.google.firebase.messaging.e.f.f123547q, "fiam:" + strA);
        }
    }

    Bundle e(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("_nmid", str2);
        bundle.putString(com.google.firebase.messaging.e.f.f123537g, str);
        try {
            bundle.putInt(com.google.firebase.messaging.e.f.f123539i, (int) (this.f122956d.a() / 1000));
            return bundle;
        } catch (NumberFormatException e10) {
            p2.d("Error while parsing use_device_time in FIAM event: " + e10.getMessage());
            return bundle;
        }
    }

    void m(final com.google.firebase.inappmessaging.model.i iVar, final com.google.firebase.inappmessaging.r.a aVar) {
        if (!k(iVar)) {
            this.f122955c.getId().k(this.f122959g, new com.google.android.gms.tasks.g() { // from class: com.google.firebase.inappmessaging.internal.t2
                @Override // com.google.android.gms.tasks.g
                public final void b(Object obj) {
                    u2 u2Var = this.f122942a;
                    u2Var.f122953a.a(u2Var.g(iVar, (String) obj, u2.f122952i.get(aVar)).H0());
                }
            });
            n(iVar, "fiam_dismiss", false);
        }
        this.f122958f.q(iVar);
    }

    void o(final com.google.firebase.inappmessaging.model.i iVar) {
        if (!k(iVar)) {
            this.f122955c.getId().k(this.f122959g, new com.google.android.gms.tasks.g() { // from class: com.google.firebase.inappmessaging.internal.q2
                @Override // com.google.android.gms.tasks.g
                public final void b(Object obj) {
                    u2 u2Var = this.f122913a;
                    u2Var.f122953a.a(u2Var.h(iVar, (String) obj, com.google.firebase.inappmessaging.h.IMPRESSION_EVENT_TYPE).H0());
                }
            });
            n(iVar, "fiam_impression", j(iVar));
        }
        this.f122958f.o(iVar);
    }

    void p(final com.google.firebase.inappmessaging.model.i iVar, com.google.firebase.inappmessaging.model.a aVar) {
        if (!k(iVar)) {
            this.f122955c.getId().k(this.f122959g, new com.google.android.gms.tasks.g() { // from class: com.google.firebase.inappmessaging.internal.s2
                @Override // com.google.android.gms.tasks.g
                public final void b(Object obj) {
                    u2 u2Var = this.f122934a;
                    u2Var.f122953a.a(u2Var.h(iVar, (String) obj, com.google.firebase.inappmessaging.h.CLICK_EVENT_TYPE).H0());
                }
            });
            n(iVar, "fiam_action", true);
        }
        this.f122958f.p(iVar, aVar);
    }

    void q(final com.google.firebase.inappmessaging.model.i iVar, final com.google.firebase.inappmessaging.r.b bVar) {
        if (!k(iVar)) {
            this.f122955c.getId().k(this.f122959g, new com.google.android.gms.tasks.g() { // from class: com.google.firebase.inappmessaging.internal.r2
                @Override // com.google.android.gms.tasks.g
                public final void b(Object obj) {
                    u2 u2Var = this.f122923a;
                    u2Var.f122953a.a(u2Var.i(iVar, (String) obj, u2.f122951h.get(bVar)).H0());
                }
            });
        }
        this.f122958f.m(iVar, bVar);
    }
}
