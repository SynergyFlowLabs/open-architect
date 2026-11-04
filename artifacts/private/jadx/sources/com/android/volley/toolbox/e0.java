package com.android.volley.toolbox;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f89526a = "volley";

    class a implements j.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private File f89527a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f89528b;

        a(Context context) {
            this.f89528b = context;
        }

        @Override // com.android.volley.toolbox.j.d
        public File get() {
            if (this.f89527a == null) {
                this.f89527a = new File(this.f89528b.getCacheDir(), e0.f89526a);
            }
            return this.f89527a;
        }
    }

    @NonNull
    public static com.android.volley.t a(Context context) {
        return c(context, null);
    }

    @NonNull
    private static com.android.volley.t b(Context context, com.android.volley.l lVar) {
        com.android.volley.t tVar = new com.android.volley.t(new j(new a(context.getApplicationContext())), lVar);
        tVar.o();
        return tVar;
    }

    @NonNull
    public static com.android.volley.t c(Context context, e eVar) {
        return b(context, eVar == null ? new g((e) new p()) : new g(eVar));
    }

    @NonNull
    @Deprecated
    public static com.android.volley.t d(Context context, o oVar) {
        return oVar == null ? c(context, null) : b(context, new g(oVar));
    }
}
