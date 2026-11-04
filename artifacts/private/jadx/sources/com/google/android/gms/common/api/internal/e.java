package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class e {

    @g6.a
    public interface b<R> {
        @g6.a
        void a(@NonNull R r10);

        @g6.a
        void b(@NonNull Status status);
    }

    @g6.a
    public static abstract class a<R extends com.google.android.gms.common.api.v, A extends com.google.android.gms.common.api.a.b> extends BasePendingResult<R> implements b<R> {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @g6.a
        private final com.google.android.gms.common.api.a.c<A> f106001r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @androidx.annotation.p0
        @g6.a
        private final com.google.android.gms.common.api.a<?> f106002s;

        @g6.a
        @Deprecated
        protected a(@NonNull com.google.android.gms.common.api.a.c<A> cVar, @NonNull com.google.android.gms.common.api.l lVar) {
            super((com.google.android.gms.common.api.l) com.google.android.gms.common.internal.w.s(lVar, "GoogleApiClient must not be null"));
            this.f106001r = (com.google.android.gms.common.api.a.c) com.google.android.gms.common.internal.w.r(cVar);
            this.f106002s = null;
        }

        @g6.a
        private void B(@NonNull RemoteException remoteException) {
            b(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
        }

        @g6.a
        public final void A(@NonNull A a10) throws DeadObjectException {
            try {
                w(a10);
            } catch (DeadObjectException e10) {
                B(e10);
                throw e10;
            } catch (RemoteException e11) {
                B(e11);
            }
        }

        @g6.a
        public /* bridge */ /* synthetic */ void a(@NonNull Object obj) {
            super.o((com.google.android.gms.common.api.v) obj);
        }

        @Override // com.google.android.gms.common.api.internal.e.b
        @g6.a
        public final void b(@NonNull Status status) {
            com.google.android.gms.common.internal.w.b(!status.q2(), "Failed result must not be success");
            R rK = k(status);
            o(rK);
            z(rK);
        }

        @g6.a
        protected abstract void w(@NonNull A a10) throws RemoteException;

        @androidx.annotation.p0
        @g6.a
        public final com.google.android.gms.common.api.a<?> x() {
            return this.f106002s;
        }

        @NonNull
        @g6.a
        public final com.google.android.gms.common.api.a.c<A> y() {
            return this.f106001r;
        }

        @g6.a
        protected void z(@NonNull R r10) {
        }

        @g6.a
        protected a(@NonNull com.google.android.gms.common.api.a<?> aVar, @NonNull com.google.android.gms.common.api.l lVar) {
            super((com.google.android.gms.common.api.l) com.google.android.gms.common.internal.w.s(lVar, "GoogleApiClient must not be null"));
            com.google.android.gms.common.internal.w.s(aVar, "Api must not be null");
            this.f106001r = aVar.b();
            this.f106002s = aVar;
        }

        @androidx.annotation.l1
        @g6.a
        protected a(@NonNull BasePendingResult.a<R> aVar) {
            super(aVar);
            this.f106001r = new com.google.android.gms.common.api.a.c<>();
            this.f106002s = null;
        }
    }
}
