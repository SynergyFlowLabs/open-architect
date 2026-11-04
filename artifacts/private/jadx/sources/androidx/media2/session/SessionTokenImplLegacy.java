package androidx.media2.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.versionedparcelable.CustomVersionedParcelable;

/* JADX INFO: loaded from: classes2.dex */
final class SessionTokenImplLegacy extends CustomVersionedParcelable implements SessionToken.SessionTokenImpl {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MediaSessionCompat.Token f58714q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Bundle f58715r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f58716s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f58717t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    ComponentName f58718u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    String f58719v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Bundle f58720w;

    SessionTokenImplLegacy(MediaSessionCompat.Token token, String str, int i10, Bundle bundle) {
        if (token == null) {
            throw new NullPointerException("token shouldn't be null");
        }
        if (str == null) {
            throw new NullPointerException("packageName shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName shouldn't be empty");
        }
        this.f58714q = token;
        this.f58716s = i10;
        this.f58719v = str;
        this.f58718u = null;
        this.f58717t = 100;
        this.f58720w = bundle;
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    public int a() {
        return this.f58716s;
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    public int c() {
        return this.f58717t != 101 ? 0 : 2;
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void d() {
        this.f58714q = MediaSessionCompat.Token.a(this.f58715r);
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    @p0
    public String d5() {
        ComponentName componentName = this.f58718u;
        if (componentName == null) {
            return null;
        }
        return componentName.getClassName();
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    public Object e5() {
        return this.f58714q;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SessionTokenImplLegacy)) {
            return false;
        }
        SessionTokenImplLegacy sessionTokenImplLegacy = (SessionTokenImplLegacy) obj;
        int i10 = this.f58717t;
        if (i10 != sessionTokenImplLegacy.f58717t) {
            return false;
        }
        if (i10 == 100) {
            return androidx.core.util.o.a(this.f58714q, sessionTokenImplLegacy.f58714q);
        }
        if (i10 != 101) {
            return false;
        }
        return androidx.core.util.o.a(this.f58718u, sessionTokenImplLegacy.f58718u);
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void f(boolean z10) {
        MediaSessionCompat.Token token = this.f58714q;
        if (token == null) {
            this.f58715r = null;
            return;
        }
        synchronized (token) {
            androidx.versionedparcelable.h hVarF = this.f58714q.f();
            this.f58714q.i(null);
            this.f58715r = this.f58714q.j();
            this.f58714q.i(hVarF);
        }
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    public ComponentName f5() {
        return this.f58718u;
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    public boolean g5() {
        return true;
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    @p0
    public Bundle getExtras() {
        return this.f58720w;
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    @NonNull
    public String getPackageName() {
        return this.f58719v;
    }

    public int hashCode() {
        return androidx.core.util.o.b(Integer.valueOf(this.f58717t), this.f58718u, this.f58714q);
    }

    public String toString() {
        return "SessionToken {legacyToken=" + this.f58714q + "}";
    }

    SessionTokenImplLegacy(ComponentName componentName, int i10) {
        if (componentName != null) {
            this.f58714q = null;
            this.f58716s = i10;
            this.f58717t = 101;
            this.f58719v = componentName.getPackageName();
            this.f58718u = componentName;
            this.f58720w = null;
            return;
        }
        throw new NullPointerException("serviceComponent shouldn't be null");
    }

    SessionTokenImplLegacy() {
    }
}
