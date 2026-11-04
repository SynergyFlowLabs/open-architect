package androidx.media2.session;

import android.os.Bundle;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes2.dex */
class ConnectionRequest implements androidx.versionedparcelable.h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f58481q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    String f58482r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f58483s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Bundle f58484t;

    ConnectionRequest() {
    }

    public Bundle d() {
        return this.f58484t;
    }

    public int f() {
        return this.f58483s;
    }

    public int g() {
        return this.f58481q;
    }

    public String getPackageName() {
        return this.f58482r;
    }

    ConnectionRequest(String str, int i10, @p0 Bundle bundle) {
        this.f58481q = 0;
        this.f58482r = str;
        this.f58483s = i10;
        this.f58484t = bundle;
    }
}
