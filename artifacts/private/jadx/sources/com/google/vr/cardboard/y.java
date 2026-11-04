package com.google.vr.cardboard;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u f126972a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static AlertDialog.Builder f126973b;

    class a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f126974a;

        a(Context context) {
            this.f126974a = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            try {
                this.f126974a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/daydream?p=daydream_help_menu")));
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(this.f126974a, s.f.f126902q, 1).show();
                dialogInterface.cancel();
            }
        }
    }

    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    class c implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f126975a;

        c(Runnable runnable) {
            this.f126975a = runnable;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            this.f126975a.run();
        }
    }

    class d implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f126976a;

        d(Context context) {
            this.f126976a = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            try {
                this.f126976a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://google.com/cardboard/cfg")));
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(this.f126976a, s.f.f126902q, 1).show();
            }
        }
    }

    private static AlertDialog.Builder a(Context context) {
        AlertDialog.Builder builder = f126973b;
        return builder != null ? builder : new AlertDialog.Builder(context, s.g.f126909a);
    }

    public static void b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent();
        intent.setAction("com.google.vrtoolkit.cardboard.CONFIGURE");
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        Integer numValueOf = null;
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            String str = resolveInfo.activityInfo.packageName;
            if (q.a(str)) {
                int i10 = resolveInfo.priority;
                if (q.b(context, str)) {
                    i10++;
                }
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(i10);
                } else if (i10 > numValueOf.intValue()) {
                    numValueOf = Integer.valueOf(i10);
                    arrayList.clear();
                } else if (i10 >= numValueOf.intValue()) {
                }
                Intent intent2 = new Intent(intent);
                intent2.setClassName(str, resolveInfo.activityInfo.name);
                arrayList.add(intent2);
            }
        }
        if (!b0.c(context)) {
            f126972a.a(context);
        }
        if (arrayList.isEmpty()) {
            e(context);
            return;
        }
        if (arrayList.size() == 1) {
            intent = (Intent) arrayList.get(0);
        }
        context.startActivity(intent);
    }

    public static AlertDialog c(Context context, int i10, int i11, Runnable runnable) {
        a aVar = new a(context);
        AlertDialog.Builder builderA = a(context);
        builderA.setTitle(i10).setMessage(i11).setCancelable(false).setPositiveButton(s.f.f126889d, aVar).setNegativeButton(s.f.f126888c, new b());
        if (runnable != null) {
            builderA.setOnCancelListener(new c(runnable));
        }
        AlertDialog alertDialogCreate = builderA.create();
        alertDialogCreate.setCanceledOnTouchOutside(false);
        return d(context, alertDialogCreate);
    }

    private static AlertDialog d(Context context, AlertDialog alertDialog) {
        alertDialog.getWindow().setFlags(8, 8);
        alertDialog.show();
        Activity activityB = f.b(context);
        if (activityB != null) {
            alertDialog.getWindow().getDecorView().setSystemUiVisibility(activityB.getWindow().getDecorView().getSystemUiVisibility());
        }
        alertDialog.getWindow().clearFlags(8);
        return alertDialog;
    }

    private static void e(Context context) {
        d dVar = new d(context);
        AlertDialog.Builder builderA = a(context);
        int i10 = 5 ^ 0;
        builderA.setTitle(s.f.f126892g).setMessage(s.f.f126891f).setPositiveButton(s.f.f126899n, dVar).setNegativeButton(s.f.f126887b, (DialogInterface.OnClickListener) null);
        d(context, builderA.create());
    }
}
