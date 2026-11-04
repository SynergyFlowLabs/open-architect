package com.google.firebase.platforminfo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile d f124411b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<f> f124412a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar;
        d dVar2 = f124411b;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (d.class) {
            try {
                dVar = f124411b;
                if (dVar == null) {
                    dVar = new d();
                    f124411b = dVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    Set<f> b() {
        Set<f> setUnmodifiableSet;
        synchronized (this.f124412a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f124412a);
        }
        return setUnmodifiableSet;
    }

    public void c(String str, String str2) {
        synchronized (this.f124412a) {
            try {
                this.f124412a.add(f.a(str, str2));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
