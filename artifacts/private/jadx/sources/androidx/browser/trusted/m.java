package androidx.browser.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.support.customtabs.trusted.a f11979a;

    private m(@NonNull android.support.customtabs.trusted.a aVar) {
        this.f11979a = aVar;
    }

    @p0
    static m a(@p0 IBinder iBinder) {
        android.support.customtabs.trusted.a aVarI = iBinder == null ? null : android.support.customtabs.trusted.a.b.i(iBinder);
        if (aVarI == null) {
            return null;
        }
        return new m(aVarI);
    }

    public void b(@NonNull String str, @NonNull Bundle bundle) throws RemoteException {
        this.f11979a.Ye(str, bundle);
    }
}
