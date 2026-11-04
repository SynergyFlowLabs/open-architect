package com.google.firebase.inappmessaging.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.common.base.j0;
import com.google.firebase.inappmessaging.internal.p2;
import com.google.firebase.inappmessaging.x;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@ij.f
public class k {

    class a extends i {
        a(e eVar, MessageType messageType, Map map) {
            super(eVar, messageType, map);
        }

        @Override // com.google.firebase.inappmessaging.model.i
        public com.google.firebase.inappmessaging.model.a a() {
            return null;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f123107a;

        static {
            int[] iArr = new int[x.j.b.values().length];
            f123107a = iArr;
            try {
                iArr[x.j.b.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f123107a[x.j.b.IMAGE_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f123107a[x.j.b.MODAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f123107a[x.j.b.CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @ij.a
    k() {
    }

    private static com.google.firebase.inappmessaging.model.a.b a(x.b bVar) {
        com.google.firebase.inappmessaging.model.a.b bVarA = com.google.firebase.inappmessaging.model.a.a();
        if (!TextUtils.isEmpty(bVar.Sj())) {
            bVarA.b(bVar.Sj());
        }
        return bVarA;
    }

    private static com.google.firebase.inappmessaging.model.a b(x.b bVar, x.f fVar) {
        com.google.firebase.inappmessaging.model.a.b bVarA = a(bVar);
        if (!fVar.equals(x.f.im())) {
            d.b bVarA2 = d.a();
            if (!TextUtils.isEmpty(fVar.h9())) {
                bVarA2.b(fVar.h9());
            }
            if (fVar.T3()) {
                n.b bVarA3 = n.a();
                x.p text = fVar.getText();
                if (!TextUtils.isEmpty(text.getText())) {
                    bVarA3.d(text.getText());
                }
                if (!TextUtils.isEmpty(text.ra())) {
                    bVarA3.b(text.ra());
                }
                bVarA2.d(bVarA3.a());
            }
            bVarA.d(bVarA2.a());
        }
        return bVarA.a();
    }

    private static d c(x.f fVar) {
        d.b bVarA = d.a();
        if (!TextUtils.isEmpty(fVar.h9())) {
            bVarA.b(fVar.h9());
        }
        if (fVar.T3()) {
            bVarA.d(e(fVar.getText()));
        }
        return bVarA.a();
    }

    public static i d(@NonNull x.j jVar, @NonNull String str, @NonNull String str2, boolean z10, @p0 Map<String, String> map) {
        j0.F(jVar, "FirebaseInAppMessaging content cannot be null.");
        j0.F(str, "FirebaseInAppMessaging campaign id cannot be null.");
        j0.F(str2, "FirebaseInAppMessaging campaign name cannot be null.");
        p2.a("Decoding message: " + jVar.toString());
        e eVar = new e(str, str2, z10);
        int i10 = b.f123107a[jVar.fh().ordinal()];
        if (i10 == 1) {
            return f(jVar.kh()).a(eVar, map);
        }
        if (i10 == 2) {
            return h(jVar.ec()).a(eVar, map);
        }
        if (i10 != 3) {
            return i10 != 4 ? new a(new e(str, str2, z10), MessageType.UNSUPPORTED, map) : g(jVar.pa()).a(eVar, map);
        }
        return i(jVar.ai()).a(eVar, map);
    }

    private static n e(x.p pVar) {
        n.b bVarA = n.a();
        if (!TextUtils.isEmpty(pVar.ra())) {
            bVarA.b(pVar.ra());
        }
        if (!TextUtils.isEmpty(pVar.getText())) {
            bVarA.d(pVar.getText());
        }
        return bVarA.a();
    }

    @NonNull
    private static c.b f(x.d dVar) {
        c.b bVarN = c.n();
        if (!TextUtils.isEmpty(dVar.S0())) {
            bVarN.c(dVar.S0());
        }
        if (!TextUtils.isEmpty(dVar.E0())) {
            bVarN.e(g.a().c(dVar.E0()).a());
        }
        if (dVar.M1()) {
            bVarN.b(a(dVar.k0()).a());
        }
        if (dVar.hasBody()) {
            bVarN.d(e(dVar.getBody()));
        }
        if (dVar.j1()) {
            bVarN.f(e(dVar.getTitle()));
        }
        return bVarN;
    }

    @NonNull
    private static f.b g(x.h hVar) {
        f.b bVarN = f.n();
        if (hVar.j1()) {
            bVarN.h(e(hVar.getTitle()));
        }
        if (hVar.hasBody()) {
            bVarN.c(e(hVar.getBody()));
        }
        if (!TextUtils.isEmpty(hVar.S0())) {
            bVarN.b(hVar.S0());
        }
        if (hVar.uh() || hVar.fc()) {
            bVarN.f(b(hVar.Ne(), hVar.H8()));
        }
        if (hVar.dl() || hVar.Bj()) {
            bVarN.g(b(hVar.ff(), hVar.Lj()));
        }
        if (!TextUtils.isEmpty(hVar.Ea())) {
            bVarN.e(g.a().c(hVar.Ea()).a());
        }
        if (!TextUtils.isEmpty(hVar.Yi())) {
            bVarN.d(g.a().c(hVar.Yi()).a());
        }
        return bVarN;
    }

    @NonNull
    private static h.b h(x.l lVar) {
        h.b bVarN = h.n();
        if (!TextUtils.isEmpty(lVar.E0())) {
            bVarN.c(g.a().c(lVar.E0()).a());
        }
        if (lVar.M1()) {
            bVarN.b(a(lVar.k0()).a());
        }
        return bVarN;
    }

    @NonNull
    private static j.b i(x.n nVar) {
        j.b bVarN = j.n();
        if (!TextUtils.isEmpty(nVar.S0())) {
            bVarN.c(nVar.S0());
        }
        if (!TextUtils.isEmpty(nVar.E0())) {
            bVarN.e(g.a().c(nVar.E0()).a());
        }
        if (nVar.M1()) {
            bVarN.b(b(nVar.k0(), nVar.yh()));
        }
        if (nVar.hasBody()) {
            bVarN.d(e(nVar.getBody()));
        }
        if (nVar.j1()) {
            bVarN.f(e(nVar.getTitle()));
        }
        return bVarN;
    }
}
