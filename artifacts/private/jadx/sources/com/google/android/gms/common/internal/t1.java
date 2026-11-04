package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
final class t1 extends com.google.android.gms.internal.common.x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f106649b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(f fVar, Looper looper) {
        super(looper);
        this.f106649b = fVar;
    }

    private static final void a(Message message) {
        u1 u1Var = (u1) message.obj;
        u1Var.b();
        u1Var.e();
    }

    private static final boolean b(Message message) {
        int i10 = message.what;
        if (i10 != 2 && i10 != 1) {
            int i11 = 0 | 7;
            if (i10 != 7) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f106649b.f106529j3.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !this.f106649b.A()) || message.what == 5)) && !this.f106649b.f()) {
            a(message);
            return;
        }
        int i11 = message.what;
        int i12 = 0 >> 0;
        if (i11 == 4) {
            this.f106649b.f106523g3 = new ConnectionResult(message.arg2);
            if (f.q0(this.f106649b)) {
                f fVar = this.f106649b;
                if (!fVar.f106525h3) {
                    fVar.r0(3, null);
                    return;
                }
            }
            f fVar2 = this.f106649b;
            ConnectionResult connectionResult = fVar2.f106523g3 != null ? fVar2.f106523g3 : new ConnectionResult(8);
            this.f106649b.f106538s.a(connectionResult);
            this.f106649b.U(connectionResult);
            return;
        }
        if (i11 == 5) {
            f fVar3 = this.f106649b;
            ConnectionResult connectionResult2 = fVar3.f106523g3 != null ? fVar3.f106523g3 : new ConnectionResult(8);
            this.f106649b.f106538s.a(connectionResult2);
            this.f106649b.U(connectionResult2);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f106649b.f106538s.a(connectionResult3);
            this.f106649b.U(connectionResult3);
            return;
        }
        if (i11 == 6) {
            this.f106649b.r0(5, null);
            f fVar4 = this.f106649b;
            if (fVar4.Y != null) {
                fVar4.Y.k(message.arg2);
            }
            this.f106649b.V(message.arg2);
            f.p0(this.f106649b, 5, 1, null);
            return;
        }
        if (i11 == 2 && !this.f106649b.isConnected()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((u1) message.obj).c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
