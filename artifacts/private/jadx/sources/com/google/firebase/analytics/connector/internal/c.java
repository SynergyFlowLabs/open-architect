package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.u8;
import com.google.common.collect.l6;
import com.google.common.collect.z6;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final z6 f120715a = z6.O("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", FirebaseAnalytics.c.f120621g, "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l6 f120716b = l6.O("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final l6 f120717c = l6.K("auto", "app", "am");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final l6 f120718d = l6.J("_r", "_dbg");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final l6 f120719e = new l6.a().b(u8.f110583a).b(u8.f110584b).e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final l6 f120720f = l6.J("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f120721g = 0;

    public static boolean a(String str) {
        return !f120717c.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(String str, Bundle bundle) {
        if (f120716b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        l6 l6Var = f120718d;
        int size = l6Var.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zContainsKey = bundle.containsKey((String) l6Var.get(i10));
            i10++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str) {
        return !f120715a.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals(com.google.firebase.abt.d.a.Q1);
        }
        if (com.google.firebase.messaging.e.f.f123547q.equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f120719e.contains(str2)) {
            return false;
        }
        l6 l6Var = f120720f;
        int size = l6Var.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zMatches = str2.matches((String) l6Var.get(i10));
            i10++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean e(String str, String str2, Bundle bundle) {
        byte b10;
        if (!com.google.firebase.messaging.e.f.f123542l.equals(str2)) {
            return true;
        }
        if (!a(str) || bundle == null) {
            return false;
        }
        l6 l6Var = f120718d;
        int size = l6Var.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zContainsKey = bundle.containsKey((String) l6Var.get(i10));
            i10++;
            if (zContainsKey) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                if (iHashCode == 3142703 && str.equals("fiam")) {
                    b10 = 2;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("fdl")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (str.equals("fcm")) {
            b10 = 0;
        } else {
            b10 = -1;
        }
        if (b10 == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        if (b10 == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        if (b10 != 2) {
            return false;
        }
        bundle.putString("_cis", "fiam_integration");
        return true;
    }
}
