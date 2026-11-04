package com.planner5d.library.services.bitmaploader;

import android.content.Context;
import androidx.annotation.m1;
import com.planner5d.library.services.utility.e0;
import com.planner5d.library.services.w;
import java.io.File;
import java.net.URL;

/* JADX INFO: loaded from: classes10.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f224162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f224163b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f224164c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f224165d = new Object();

    public g(Context context) {
        this.f224162a = context;
    }

    @m1
    private File c(String filename) {
        File fileA = a();
        if (fileA == null) {
            return null;
        }
        return new File(fileA, e0.h(filename, "MD5"));
    }

    @m1
    public File a() {
        synchronized (this.f224165d) {
            try {
                if (!this.f224164c) {
                    File fileA = w.f229889a.a(this.f224162a, io.sentry.protocol.d.b.f306176b);
                    if (fileA == null || (!fileA.isDirectory() && !fileA.mkdirs())) {
                        fileA = null;
                    }
                    this.f224163b = fileA;
                    this.f224164c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f224163b;
    }

    @m1
    public File b(int source, String uri, int width, int height) {
        if (width <= 0 || height <= 0) {
            return null;
        }
        return c(source + ":" + width + "x" + height + ":" + uri);
    }

    @m1
    public File d(URL url) {
        return c(url.toString());
    }
}
