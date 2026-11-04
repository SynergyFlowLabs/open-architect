package com.google.firebase.perf.util;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes5.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final URL f124252a;

    public l(URL url) {
        this.f124252a = url;
    }

    public URLConnection a() throws IOException {
        return this.f124252a.openConnection();
    }

    public String toString() {
        return this.f124252a.toString();
    }
}
