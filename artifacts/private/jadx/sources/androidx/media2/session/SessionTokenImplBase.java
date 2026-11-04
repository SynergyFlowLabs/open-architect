package androidx.media2.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes2.dex */
final class SessionTokenImplBase implements SessionToken.SessionTokenImpl {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f58707q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f58708r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    String f58709s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    String f58710t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    IBinder f58711u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    ComponentName f58712v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Bundle f58713w;

    SessionTokenImplBase(@NonNull ComponentName componentName, int i10, int i11) {
        if (componentName == null) {
            throw new NullPointerException("serviceComponent shouldn't be null");
        }
        this.f58712v = componentName;
        this.f58709s = componentName.getPackageName();
        this.f58710t = componentName.getClassName();
        this.f58707q = i10;
        this.f58708r = i11;
        this.f58711u = null;
        this.f58713w = null;
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    public int a() {
        return this.f58707q;
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    public int c() {
        return this.f58708r;
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    @p0
    public String d5() {
        return this.f58710t;
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    public Object e5() {
        return this.f58711u;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SessionTokenImplBase)) {
            return false;
        }
        SessionTokenImplBase sessionTokenImplBase = (SessionTokenImplBase) obj;
        if (this.f58707q != sessionTokenImplBase.f58707q || !TextUtils.equals(this.f58709s, sessionTokenImplBase.f58709s) || !TextUtils.equals(this.f58710t, sessionTokenImplBase.f58710t) || this.f58708r != sessionTokenImplBase.f58708r || !androidx.core.util.o.a(this.f58711u, sessionTokenImplBase.f58711u)) {
            return false;
        }
        int i10 = 3 & 1;
        return true;
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    @b1({b1.a.LIBRARY})
    public ComponentName f5() {
        return this.f58712v;
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    public boolean g5() {
        return false;
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    @p0
    public Bundle getExtras() {
        return this.f58713w;
    }

    @Override // androidx.media2.session.SessionToken.SessionTokenImpl
    @NonNull
    public String getPackageName() {
        return this.f58709s;
    }

    public int hashCode() {
        return androidx.core.util.o.b(Integer.valueOf(this.f58708r), Integer.valueOf(this.f58707q), this.f58709s, this.f58710t);
    }

    public String toString() {
        return "SessionToken {pkg=" + this.f58709s + " type=" + this.f58708r + " service=" + this.f58710t + " IMediaSession=" + this.f58711u + " extras=" + this.f58713w + "}";
    }

    SessionTokenImplBase(int i10, int i11, String str, c cVar, Bundle bundle) {
        this.f58707q = i10;
        this.f58708r = i11;
        this.f58709s = str;
        this.f58710t = null;
        this.f58712v = null;
        this.f58711u = cVar.asBinder();
        this.f58713w = bundle;
    }

    SessionTokenImplBase() {
    }
}
