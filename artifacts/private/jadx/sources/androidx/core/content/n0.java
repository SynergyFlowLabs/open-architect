package androidx.core.content;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.l1;

/* JADX INFO: loaded from: classes2.dex */
class n0 implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    androidx.concurrent.futures.e<Integer> f47551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f47552c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l1
    @androidx.annotation.p0
    androidx.core.app.unusedapprestrictions.b f47550a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f47553d = false;

    class a extends androidx.core.app.unusedapprestrictions.a.b {
        a() {
        }

        @Override // androidx.core.app.unusedapprestrictions.a
        public void Ab(boolean z10, boolean z11) throws RemoteException {
            if (!z10) {
                n0.this.f47551b.E(0);
            } else if (z11) {
                n0.this.f47551b.E(3);
            } else {
                n0.this.f47551b.E(2);
            }
        }
    }

    n0(@NonNull Context context) {
        this.f47552c = context;
    }

    private androidx.core.app.unusedapprestrictions.a c() {
        return new a();
    }

    public void a(@NonNull androidx.concurrent.futures.e<Integer> eVar) {
        if (this.f47553d) {
            throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
        }
        this.f47553d = true;
        this.f47551b = eVar;
        this.f47552c.bindService(new Intent(m0.f47545b).setPackage(h0.b(this.f47552c.getPackageManager())), this, 1);
    }

    public void b() {
        if (!this.f47553d) {
            throw new IllegalStateException("bindService must be called before unbind");
        }
        this.f47553d = false;
        this.f47552c.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        androidx.core.app.unusedapprestrictions.b bVarI = androidx.core.app.unusedapprestrictions.b.AbstractBinderC0378b.i(iBinder);
        this.f47550a = bVarI;
        try {
            bVarI.Zc(c());
        } catch (RemoteException unused) {
            this.f47551b.E(0);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f47550a = null;
    }
}
