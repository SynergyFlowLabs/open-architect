package com.google.firebase.crashlytics.internal;

import android.content.Context;
import androidx.annotation.p0;
import androidx.constraintlayout.core.motion.utils.v;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f121241c = "Unity";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f121242d = "Flutter";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f121243e = "com.google.firebase.crashlytics.unity_version";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f121244f = "flutter_assets/NOTICES.Z";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f121245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private b f121246b = null;

    private class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private final String f121247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private final String f121248b;

        private b() {
            int iQ = com.google.firebase.crashlytics.internal.common.i.q(f.this.f121245a, f.f121243e, v.b.f43988e);
            if (iQ == 0) {
                if (!f.this.c(f.f121244f)) {
                    this.f121247a = null;
                    this.f121248b = null;
                    return;
                } else {
                    this.f121247a = f.f121242d;
                    this.f121248b = null;
                    g.f().k("Development platform is: Flutter");
                    return;
                }
            }
            this.f121247a = "Unity";
            String string = f.this.f121245a.getResources().getString(iQ);
            this.f121248b = string;
            g.f().k("Unity Editor version is: " + string);
        }
    }

    public f(Context context) {
        this.f121245a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        if (this.f121245a.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.f121245a.getAssets().open(str);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.f121246b == null) {
            this.f121246b = new b();
        }
        return this.f121246b;
    }

    public static boolean g(Context context) {
        return com.google.firebase.crashlytics.internal.common.i.q(context, f121243e, v.b.f43988e) != 0;
    }

    @p0
    public String d() {
        return f().f121247a;
    }

    @p0
    public String e() {
        return f().f121248b;
    }
}
