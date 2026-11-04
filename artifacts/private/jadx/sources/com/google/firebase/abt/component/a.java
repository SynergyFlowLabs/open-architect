package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.b0;
import androidx.annotation.l1;
import com.google.firebase.abt.d;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @b0("this")
    private final Map<String, d> f120442a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f120443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z8.b<com.google.firebase.analytics.connector.a> f120444c;

    @l1(otherwise = 3)
    protected a(Context context, z8.b<com.google.firebase.analytics.connector.a> bVar) {
        this.f120443b = context;
        this.f120444c = bVar;
    }

    @l1
    protected d a(String str) {
        return new d(this.f120443b, this.f120444c, str);
    }

    public synchronized d b(String str) {
        try {
            if (!this.f120442a.containsKey(str)) {
                this.f120442a.put(str, a(str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f120442a.get(str);
    }
}
