package com.google.vr.cardboard;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes5.dex */
public class f {
    public static boolean a(Context context) {
        return b(context) != null;
    }

    public static Activity b(Context context) {
        Context baseContext;
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper) || (baseContext = ((ContextWrapper) context).getBaseContext()) == context) {
                return null;
            }
            context = baseContext;
        }
        return null;
    }

    public static ComponentName c(Context context) {
        if (context instanceof z) {
            return ((z) context).b();
        }
        Activity activityB = b(context);
        if (activityB != null) {
            return activityB.getComponentName();
        }
        return null;
    }
}
