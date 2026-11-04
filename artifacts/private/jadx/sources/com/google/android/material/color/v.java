package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import androidx.annotation.w0;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@w0(api = 30)
class v implements l {

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final v f112303a = new v();

        private b() {
        }
    }

    static l k() {
        return b.f112303a;
    }

    @Override // com.google.android.material.color.l
    @NonNull
    public Context a(Context context, Map<Integer, Integer> map) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, r6.a.n.f361322na);
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        return x.a(contextThemeWrapper, map) ? contextThemeWrapper : context;
    }

    @Override // com.google.android.material.color.l
    public boolean b(Context context, Map<Integer, Integer> map) {
        if (!x.a(context, map)) {
            return false;
        }
        y.a(context, r6.a.n.f361322na);
        return true;
    }

    private v() {
    }
}
