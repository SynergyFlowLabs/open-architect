package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m0 extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47545b = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.core.app.unusedapprestrictions.b.AbstractBinderC0378b f47546a = new a();

    class a extends androidx.core.app.unusedapprestrictions.b.AbstractBinderC0378b {
        a() {
        }

        @Override // androidx.core.app.unusedapprestrictions.b
        public void Zc(@androidx.annotation.p0 androidx.core.app.unusedapprestrictions.a aVar) throws RemoteException {
            if (aVar == null) {
                return;
            }
            m0.this.a(new l0(aVar));
        }
    }

    protected abstract void a(@NonNull l0 l0Var);

    @Override // android.app.Service
    @androidx.annotation.p0
    public IBinder onBind(@androidx.annotation.p0 Intent intent) {
        return this.f47546a;
    }
}
