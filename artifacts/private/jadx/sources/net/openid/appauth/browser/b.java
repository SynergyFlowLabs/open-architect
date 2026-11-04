package net.openid.appauth.browser;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<d> f332830a;

    public b(d... dVarArr) {
        this.f332830a = Arrays.asList(dVarArr);
    }

    @Override // net.openid.appauth.browser.d
    public boolean a(@NonNull c cVar) {
        Iterator<d> it = this.f332830a.iterator();
        while (it.hasNext()) {
            if (it.next().a(cVar)) {
                return false;
            }
        }
        return true;
    }
}
