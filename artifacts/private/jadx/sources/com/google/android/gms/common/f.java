package com.google.android.gms.common;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.a2;
import com.google.android.gms.common.api.internal.b2;
import com.google.android.gms.common.api.internal.h2;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class f extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public static final String f106403i = "com.google.android.gms";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private String f106406g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f106404j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final f f106405k = new f();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f106402h = g.f106410a;

    @NonNull
    public static final Task N(@NonNull com.google.android.gms.common.api.m mVar, @NonNull com.google.android.gms.common.api.m... mVarArr) {
        com.google.android.gms.common.internal.w.s(mVar, "Requested API must not be null.");
        for (com.google.android.gms.common.api.m mVar2 : mVarArr) {
            com.google.android.gms.common.internal.w.s(mVar2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(mVarArr.length + 1);
        arrayList.add(mVar);
        arrayList.addAll(Arrays.asList(mVarArr));
        return com.google.android.gms.common.api.internal.i.w().z(arrayList);
    }

    @NonNull
    public static f x() {
        return f106405k;
    }

    public boolean A(@NonNull Activity activity, int i10, int i11) {
        return B(activity, i10, i11, null);
    }

    public boolean B(@NonNull Activity activity, int i10, int i11, @androidx.annotation.p0 DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogT = t(activity, i10, i11, onCancelListener);
        if (dialogT == null) {
            return false;
        }
        I(activity, dialogT, j.f106698l, onCancelListener);
        return true;
    }

    public boolean C(@NonNull Activity activity, int i10, @NonNull androidx.activity.result.h<IntentSenderRequest> hVar, @androidx.annotation.p0 DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogF = F(activity, i10, null, onCancelListener, new y(this, activity, i10, hVar));
        if (dialogF == null) {
            return false;
        }
        I(activity, dialogF, j.f106698l, onCancelListener);
        return true;
    }

    public void D(@NonNull Context context, int i10) {
        J(context, i10, null, g(context, i10, 0, "n"));
    }

    public void E(@NonNull Context context, @NonNull ConnectionResult connectionResult) {
        J(context, connectionResult.O1(), null, w(context, connectionResult));
    }

    @androidx.annotation.p0
    final Dialog F(@NonNull Context context, int i10, @androidx.annotation.p0 com.google.android.gms.common.internal.p0 p0Var, @androidx.annotation.p0 DialogInterface.OnCancelListener onCancelListener, @androidx.annotation.p0 DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder;
        AlertDialog.Builder builder2 = null;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder2 == null) {
            builder2 = builder;
            builder2 = new AlertDialog.Builder(context);
        }
        builder2 = builder;
        builder2.setMessage(com.google.android.gms.common.internal.l0.c(context, i10));
        if (onCancelListener != null) {
            builder2.setOnCancelListener(onCancelListener);
        }
        String strB = com.google.android.gms.common.internal.l0.b(context, i10);
        DialogInterface.OnClickListener onClickListener2 = p0Var;
        if (strB != null) {
            if (p0Var == null) {
                onClickListener2 = onClickListener;
            }
            builder2.setPositiveButton(strB, onClickListener2);
        }
        String strF = com.google.android.gms.common.internal.l0.f(context, i10);
        if (strF != null) {
            builder2.setTitle(strF);
        }
        String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10));
        new IllegalArgumentException();
        return builder2.create();
    }

    @NonNull
    public final Dialog G(@NonNull Activity activity, @NonNull DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.google.android.gms.common.internal.l0.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        I(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    @androidx.annotation.p0
    public final b2 H(Context context, a2 a2Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme(io.sentry.protocol.z.b.f306542i);
        b2 b2Var = new b2(a2Var);
        androidx.core.content.d.w(context, b2Var, intentFilter, 2);
        b2Var.a(context);
        if (n(context, "com.google.android.gms")) {
            return b2Var;
        }
        a2Var.a();
        b2Var.b();
        return null;
    }

    final void I(Activity activity, Dialog dialog, String str, @androidx.annotation.p0 DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.s) {
                u.B(dialog, onCancelListener).show(((androidx.fragment.app.s) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        c.b(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @e.b(20)
    final void J(Context context, int i10, @androidx.annotation.p0 String str, @androidx.annotation.p0 PendingIntent pendingIntent) {
        int i11;
        String str2;
        String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null);
        new IllegalArgumentException();
        if (i10 == 18) {
            K(context);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String strE = com.google.android.gms.common.internal.l0.e(context, i10);
        String strD = com.google.android.gms.common.internal.l0.d(context, i10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) com.google.android.gms.common.internal.w.r(context.getSystemService("notification"));
        androidx.core.app.w.n nVarZ0 = new androidx.core.app.w.n(context).e0(true).C(true).O(strE).z0(new androidx.core.app.w.l().A(strD));
        boolean zM = com.google.android.gms.common.util.l.m(context);
        int i12 = 2 & 2;
        int i13 = R.drawable.stat_sys_warning;
        if (zM) {
            com.google.android.gms.common.internal.w.x(com.google.android.gms.common.util.v.i());
            int i14 = context.getApplicationInfo().icon;
            if (i14 != 0) {
                i13 = i14;
            }
            nVarZ0.t0(i13).k0(2);
            if (com.google.android.gms.common.util.l.n(context)) {
                nVarZ0.a(f6.a.c.f275036a, resources.getString(f6.a.e.f275080o), pendingIntent);
            } else {
                nVarZ0.M(pendingIntent);
            }
        } else {
            nVarZ0.t0(R.drawable.stat_sys_warning).B0(resources.getString(f6.a.e.f275073h)).H0(System.currentTimeMillis()).M(pendingIntent).N(strD);
        }
        if (com.google.android.gms.common.util.v.n()) {
            com.google.android.gms.common.internal.w.x(com.google.android.gms.common.util.v.n());
            synchronized (f106404j) {
                str2 = this.f106406g;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(f6.a.e.f275072g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            nVarZ0.G(str2);
        }
        Notification notificationH = nVarZ0.h();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            k.f106711h.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationH);
    }

    final void K(Context context) {
        new z(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean L(@NonNull Activity activity, @NonNull com.google.android.gms.common.api.internal.n nVar, int i10, int i11, @androidx.annotation.p0 DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogF = F(activity, i10, com.google.android.gms.common.internal.p0.d(nVar, e(activity, i10, "d"), 2), onCancelListener, null);
        if (dialogF == null) {
            int i12 = 5 >> 0;
            return false;
        }
        I(activity, dialogF, j.f106698l, onCancelListener);
        return true;
    }

    public final boolean M(@NonNull Context context, @NonNull ConnectionResult connectionResult, int i10) {
        PendingIntent pendingIntentW;
        if (com.google.android.gms.common.wrappers.b.a(context) || (pendingIntentW = w(context, connectionResult)) == null) {
            return false;
        }
        J(context, connectionResult.O1(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentW, i10, true), com.google.android.gms.internal.base.l.f107948a | androidx.media3.common.j.W0));
        return true;
    }

    @Override // com.google.android.gms.common.g
    @com.google.android.gms.common.internal.a0
    @g6.a
    public int c(@NonNull Context context) {
        return super.c(context);
    }

    @Override // com.google.android.gms.common.g
    @androidx.annotation.p0
    @com.google.android.gms.common.internal.a0
    @g6.a
    public Intent e(@androidx.annotation.p0 Context context, int i10, @androidx.annotation.p0 String str) {
        return super.e(context, i10, str);
    }

    @Override // com.google.android.gms.common.g
    @androidx.annotation.p0
    public PendingIntent f(@NonNull Context context, int i10, int i11) {
        return super.f(context, i10, i11);
    }

    @Override // com.google.android.gms.common.g
    @NonNull
    public final String h(int i10) {
        return super.h(i10);
    }

    @Override // com.google.android.gms.common.g
    @com.google.android.gms.common.internal.n
    public int j(@NonNull Context context) {
        return super.j(context);
    }

    @Override // com.google.android.gms.common.g
    @com.google.android.gms.common.internal.a0
    @g6.a
    public int k(@NonNull Context context, int i10) {
        return super.k(context, i10);
    }

    @Override // com.google.android.gms.common.g
    public final boolean o(int i10) {
        return super.o(i10);
    }

    @NonNull
    public Task<Void> q(@NonNull com.google.android.gms.common.api.k<?> kVar, @NonNull com.google.android.gms.common.api.k<?>... kVarArr) {
        return N(kVar, kVarArr).v(new com.google.android.gms.tasks.k() { // from class: com.google.android.gms.common.x
            @Override // com.google.android.gms.tasks.k
            public final Task a(Object obj) {
                int i10 = f.f106402h;
                return com.google.android.gms.tasks.n.g(null);
            }
        });
    }

    @NonNull
    public Task<Void> r(@NonNull com.google.android.gms.common.api.m<?> mVar, @NonNull com.google.android.gms.common.api.m<?>... mVarArr) {
        return N(mVar, mVarArr).v(new com.google.android.gms.tasks.k() { // from class: com.google.android.gms.common.w
            @Override // com.google.android.gms.tasks.k
            public final Task a(Object obj) {
                int i10 = f.f106402h;
                return com.google.android.gms.tasks.n.g(null);
            }
        });
    }

    @androidx.annotation.p0
    public Dialog s(@NonNull Activity activity, int i10, int i11) {
        return t(activity, i10, i11, null);
    }

    @androidx.annotation.p0
    public Dialog t(@NonNull Activity activity, int i10, int i11, @androidx.annotation.p0 DialogInterface.OnCancelListener onCancelListener) {
        return F(activity, i10, com.google.android.gms.common.internal.p0.b(activity, e(activity, i10, "d"), i11), onCancelListener, null);
    }

    @androidx.annotation.p0
    public Dialog u(@NonNull Fragment fragment, int i10, int i11) {
        return v(fragment, i10, i11, null);
    }

    @androidx.annotation.p0
    public Dialog v(@NonNull Fragment fragment, int i10, int i11, @androidx.annotation.p0 DialogInterface.OnCancelListener onCancelListener) {
        return F(fragment.requireContext(), i10, com.google.android.gms.common.internal.p0.c(fragment, e(fragment.requireContext(), i10, "d"), i11), onCancelListener, null);
    }

    @androidx.annotation.p0
    public PendingIntent w(@NonNull Context context, @NonNull ConnectionResult connectionResult) {
        return connectionResult.e2() ? connectionResult.b2() : f(context, connectionResult.O1(), 0);
    }

    @NonNull
    @androidx.annotation.l0
    public Task<Void> y(@NonNull Activity activity) {
        int i10 = f106402h;
        com.google.android.gms.common.internal.w.k("makeGooglePlayServicesAvailable must be called from the main thread");
        int iK = k(activity, i10);
        if (iK == 0) {
            return com.google.android.gms.tasks.n.g(null);
        }
        h2 h2VarU = h2.u(activity);
        h2VarU.t(new ConnectionResult(iK, null), 0);
        return h2VarU.v();
    }

    @e.b(26)
    public void z(@NonNull Context context, @NonNull String str) {
        if (com.google.android.gms.common.util.v.n()) {
            com.google.android.gms.common.internal.w.r(((NotificationManager) com.google.android.gms.common.internal.w.r(context.getSystemService("notification"))).getNotificationChannel(str));
        }
        synchronized (f106404j) {
            try {
                this.f106406g = str;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
