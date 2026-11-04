package com.google.android.gms.auth.api;

import android.os.Bundle;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class h implements com.google.android.gms.common.api.a.d.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f105426d = new h(new g());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f105427a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f105428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final String f105429c;

    public h(g gVar) {
        this.f105428b = gVar.f105424a.booleanValue();
        this.f105429c = gVar.f105425b;
    }

    static /* bridge */ /* synthetic */ String b(h hVar) {
        String str = hVar.f105427a;
        return null;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", this.f105428b);
        bundle.putString("log_session_id", this.f105429c);
        return bundle;
    }

    public final boolean equals(@p0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        String str = hVar.f105427a;
        int i10 = 2 ^ 0;
        return u.b(null, null) && this.f105428b == hVar.f105428b && u.b(this.f105429c, hVar.f105429c);
    }

    public final int hashCode() {
        return u.c(null, Boolean.valueOf(this.f105428b), this.f105429c);
    }
}
