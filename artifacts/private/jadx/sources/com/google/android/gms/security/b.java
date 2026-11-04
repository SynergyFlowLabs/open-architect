package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.h;
import com.google.android.gms.common.i;

/* JADX INFO: loaded from: classes4.dex */
final class b extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f110913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.InterfaceC0975a f110914b;

    b(Context context, a.InterfaceC0975a interfaceC0975a) {
        this.f110913a = context;
        this.f110914b = interfaceC0975a;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Integer numValueOf;
        try {
            a.a(this.f110913a);
            return 0;
        } catch (h e10) {
            numValueOf = Integer.valueOf(e10.f106420a);
            return numValueOf;
        } catch (i e11) {
            numValueOf = Integer.valueOf(e11.b());
            return numValueOf;
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.f110914b.b();
            return;
        }
        this.f110914b.a(num.intValue(), a.f110909b.e(this.f110913a, num.intValue(), "pi"));
    }
}
