package com.google.vr.ndk.base;

import android.content.Context;
import android.os.AsyncTask;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import com.google.vr.vrcore.logging.api.VREventParcelable;

/* JADX INFO: loaded from: classes5.dex */
class h0 extends com.google.vr.ndk.base.a implements View.OnTouchListener {

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    static final String f127085p2 = "SdkDaydreamTouchListener";
    private final boolean H1;
    private final com.google.vr.cardboard.a0 Z;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final x f127086p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final GvrApi f127087p1;

    class b extends AsyncTask<Void, Void, com.google.vr.sdk.proto.nano.b.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Display f127088a;

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.google.vr.sdk.proto.nano.b.a doInBackground(Void... voidArr) {
            return h0.this.Z.c();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(com.google.vr.sdk.proto.nano.b.a aVar) {
            com.google.vr.cardboard.b bVar = new com.google.vr.cardboard.b();
            h0.this.s(com.google.vr.cardboard.g.e(this.f127088a, aVar), aVar, bVar.b(this.f127088a));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Void... voidArr) {
        }
    }

    class c extends AsyncTask<Void, Void, com.google.vr.sdk.proto.nano.a.c> {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.google.vr.sdk.proto.nano.a.c doInBackground(Void... voidArr) {
            return h0.this.Z.d();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(com.google.vr.sdk.proto.nano.a.c cVar) {
            h0.this.l(cVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Void... voidArr) {
        }
    }

    public h0(x xVar) {
        this.f127086p0 = xVar;
        GvrApi gvrApiM = xVar.m();
        this.f127087p1 = gvrApiM;
        this.H1 = (gvrApiM.z().f119289h.intValue() == 1 || gvrApiM.z().f119295n.booleanValue()) ? false : true;
        Context context = xVar.getContext();
        this.Z = com.google.vr.cardboard.b0.a(context);
        b bVar = new b();
        bVar.f127088a = com.google.vr.cardboard.g.c(context);
        bVar.execute(new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(DisplayMetrics displayMetrics, com.google.vr.sdk.proto.nano.b.a aVar, com.google.vr.cardboard.b.a aVar2) {
        f(displayMetrics, aVar, aVar2);
        t();
    }

    @Override // com.google.vr.ndk.base.a
    protected boolean g() {
        return this.H1;
    }

    @Override // com.google.vr.ndk.base.a
    protected void h(int i10, com.google.common.logging.nano.a.C1088a c1088a) {
        if (this.f127086p0.o() == null || this.f127086p0.o().t() == null) {
            return;
        }
        try {
            this.f127086p0.o().t().o6(new VREventParcelable(2012, c1088a));
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.vr.ndk.base.a
    protected void n(float f10, float f11, float f12) {
        this.f127087p1.f0(f10, f11, 0.0f);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return e(motionEvent, 0.0f, 0.0f);
    }

    public void t() {
        new c().execute(new Void[0]);
    }

    public void u() {
        this.Z.close();
    }

    h0(com.google.vr.cardboard.a0 a0Var, DisplayMetrics displayMetrics, com.google.vr.sdk.proto.nano.b.a aVar, com.google.vr.cardboard.b.a aVar2, GvrApi gvrApi, x xVar, boolean z10) {
        this.H1 = z10;
        this.Z = a0Var;
        this.f127087p1 = gvrApi;
        this.f127086p0 = xVar;
        s(displayMetrics, aVar, aVar2);
    }
}
