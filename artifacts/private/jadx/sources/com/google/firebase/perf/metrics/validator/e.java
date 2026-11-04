package com.google.firebase.perf.metrics.validator;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.firebase.perf.v1.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e {
    @NonNull
    private static List<e> a(@NonNull s sVar, @NonNull Context context) {
        ArrayList arrayList = new ArrayList();
        if (sVar.Di()) {
            arrayList.add(new d(sVar.Hi()));
        }
        if (sVar.Sf()) {
            arrayList.add(new c(sVar.u9(), context));
        }
        if (sVar.pd()) {
            arrayList.add(new a(sVar.X8()));
        }
        if (sVar.re()) {
            arrayList.add(new b(sVar.ed()));
        }
        return arrayList;
    }

    public static boolean b(@NonNull s sVar, @NonNull Context context) {
        List<e> listA = a(sVar, context);
        if (listA.isEmpty()) {
            com.google.firebase.perf.logging.a.e().a("No validators found for PerfMetric.");
            return false;
        }
        Iterator<e> it = listA.iterator();
        while (it.hasNext()) {
            if (!it.next().c()) {
                return false;
            }
        }
        return true;
    }

    public static void d(@NonNull String str, @NonNull String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Attribute key must not be null or empty");
        }
        if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        }
        if (str.length() > 40) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute key length must not exceed %d characters", 40));
        }
        if (str2.length() > 100) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute value length must not exceed %d characters", 100));
        }
        if (!str.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
            throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
        }
    }

    @p0
    public static String e(@p0 String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (com.google.firebase.perf.util.b.a aVar : com.google.firebase.perf.util.b.a.values()) {
            if (aVar.toString().equals(str)) {
                return null;
            }
        }
        return "Metric name must not start with '_'";
    }

    @p0
    public static String f(@p0 String str) {
        if (str == null) {
            return "Trace name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Trace name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (com.google.firebase.perf.util.b.EnumC1180b enumC1180b : com.google.firebase.perf.util.b.EnumC1180b.values()) {
            if (enumC1180b.toString().equals(str)) {
                return null;
            }
        }
        if (str.startsWith(com.google.firebase.perf.util.b.f124203p)) {
            return null;
        }
        return "Trace name must not start with '_'";
    }

    public abstract boolean c();
}
