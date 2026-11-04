package com.devtodev.core.data.metrics.simple;

import android.content.Context;
import com.devtodev.core.data.metrics.Metric;
import com.devtodev.core.data.metrics.MetricConsts;
import com.devtodev.core.logic.SDKClient;
import com.devtodev.core.utils.e;
import com.devtodev.core.utils.log.CoreLog;
import com.segment.analytics.kotlin.android.plugins.a;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class UserInfo extends Metric {
    private static final long serialVersionUID = 3534202138558134410L;

    public UserInfo(Context context, String str, long j10) {
        super("User Info", MetricConsts.UserInfo);
        Locale locale = context.getResources().getConfiguration().locale;
        addParameter("locale", locale == null ? "" : locale.toString());
        a(context);
        b(context);
        a();
        if (str != null && !str.equals("")) {
            addParameter("crossUid", str);
        }
        if (j10 > 0) {
            addParameter("registered", Long.valueOf(j10));
        }
    }

    private void a(Context context) {
        try {
            String strA = e.a(context);
            if (strA.equals("")) {
                return;
            }
            addParameter("carrier", strA);
        } catch (Exception e10) {
            CoreLog.e("DevToDev", String.format("Get carrier name failed, message %s", e10.getMessage()), e10);
        }
    }

    private void b(Context context) {
        try {
            int iD = e.d(context);
            if (iD != 0) {
                addParameter("networkOperator", Integer.valueOf(iD));
            }
        } catch (Exception e10) {
            CoreLog.e("DevToDev", String.format("Get network operator failed, message %s", e10.getMessage()), e10);
        }
    }

    private void a() {
        try {
            addParameter(a.f266537j, System.getProperty("http.agent"));
        } catch (Exception e10) {
            CoreLog.e("DevToDev", String.format("Get user agent failed, message %s", e10.getMessage()), e10);
        }
    }

    public UserInfo(Context context) {
        this(context, SDKClient.getInstance().getUserUdid(), 0L);
    }
}
