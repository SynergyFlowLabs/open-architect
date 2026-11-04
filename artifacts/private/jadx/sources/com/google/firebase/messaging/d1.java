package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f123463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f123464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f123465c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f123467e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("internalQueue")
    @androidx.annotation.l1
    final ArrayDeque<String> f123466d = new ArrayDeque<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.b0("internalQueue")
    private boolean f123468f = false;

    private d1(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        int i10 = 7 & 0;
        this.f123463a = sharedPreferences;
        this.f123464b = str;
        this.f123465c = str2;
        this.f123467e = executor;
    }

    @androidx.annotation.b0("internalQueue")
    private String e(String str) {
        f(str != null);
        return str;
    }

    @androidx.annotation.b0("internalQueue")
    private boolean f(boolean z10) {
        if (z10 && !this.f123468f) {
            s();
        }
        return z10;
    }

    @androidx.annotation.m1
    static d1 j(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        d1 d1Var = new d1(sharedPreferences, str, str2, executor);
        d1Var.k();
        return d1Var;
    }

    @androidx.annotation.m1
    private void k() {
        synchronized (this.f123466d) {
            try {
                this.f123466d.clear();
                String string = this.f123463a.getString(this.f123464b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f123465c)) {
                    String[] strArrSplit = string.split(this.f123465c, -1);
                    int length = strArrSplit.length;
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f123466d.add(str);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.m1
    public void r() {
        synchronized (this.f123466d) {
            try {
                this.f123463a.edit().putString(this.f123464b, o()).commit();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void s() {
        this.f123467e.execute(new Runnable() { // from class: com.google.firebase.messaging.c1
            @Override // java.lang.Runnable
            public final void run() {
                this.f123449a.r();
            }
        });
    }

    public boolean b(@NonNull String str) {
        boolean zF;
        if (TextUtils.isEmpty(str) || str.contains(this.f123465c)) {
            return false;
        }
        synchronized (this.f123466d) {
            zF = f(this.f123466d.add(str));
        }
        return zF;
    }

    @androidx.annotation.b0("internalQueue")
    public void c() {
        this.f123468f = true;
    }

    @androidx.annotation.l1
    void d() {
        synchronized (this.f123466d) {
            try {
                c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void g() {
        synchronized (this.f123466d) {
            try {
                this.f123466d.clear();
                f(true);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.b0("internalQueue")
    public void h() {
        this.f123468f = false;
        s();
    }

    @androidx.annotation.l1
    void i() {
        synchronized (this.f123466d) {
            try {
                h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.p0
    public String l() {
        String strPeek;
        synchronized (this.f123466d) {
            strPeek = this.f123466d.peek();
        }
        return strPeek;
    }

    public String m() {
        String strE;
        synchronized (this.f123466d) {
            try {
                strE = e(this.f123466d.remove());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return strE;
    }

    public boolean n(@androidx.annotation.p0 Object obj) {
        boolean zF;
        synchronized (this.f123466d) {
            try {
                zF = f(this.f123466d.remove(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zF;
    }

    @NonNull
    @androidx.annotation.b0("internalQueue")
    public String o() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f123466d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f123465c);
        }
        return sb2.toString();
    }

    @androidx.annotation.l1
    public String p() {
        String strO;
        synchronized (this.f123466d) {
            try {
                strO = o();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return strO;
    }

    public int q() {
        int size;
        synchronized (this.f123466d) {
            try {
                size = this.f123466d.size();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return size;
    }

    @NonNull
    public List<String> t() {
        ArrayList arrayList;
        synchronized (this.f123466d) {
            try {
                arrayList = new ArrayList(this.f123466d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }
}
