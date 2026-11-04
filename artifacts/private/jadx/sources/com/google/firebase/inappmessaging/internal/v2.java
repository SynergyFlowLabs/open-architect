package com.google.firebase.inappmessaging.internal;

/* JADX INFO: loaded from: classes5.dex */
public class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f122973a;

    public interface a {
        void a(String str);
    }

    public void a(a aVar) {
        this.f122973a = null;
    }

    public void b(a aVar) {
        this.f122973a = aVar;
    }

    public void c(String str) {
        p2.a("Programmatically trigger: " + str);
        this.f122973a.a(str);
    }
}
