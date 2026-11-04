package com.devtodev.core.data.metrics.simple;

import android.content.Context;
import com.devtodev.core.data.metrics.Metric;
import com.devtodev.core.data.metrics.MetricConsts;
import com.devtodev.core.utils.a;
import com.google.firebase.remoteconfig.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class ApplicationInfo extends Metric {
    private static final long serialVersionUID = 3534202138558134410L;

    public ApplicationInfo(Context context) {
        super("ApplicationInfo", MetricConsts.ApplicationInfo);
        addParameter("bundleId", context.getPackageName());
        addParameter("codeVersion", Integer.valueOf(a.a(context)));
        addParameter(e0.b.f124458s2, a.b(context));
        String strC = a.c(context);
        if (strC != null) {
            addParameter("installationSource", strC);
        }
    }
}
