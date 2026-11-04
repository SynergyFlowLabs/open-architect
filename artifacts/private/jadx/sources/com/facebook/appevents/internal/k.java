package com.facebook.appevents.internal;

import android.os.AsyncTask;
import androidx.annotation.l1;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends AsyncTask<String, Void, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f99051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final File f99052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f99053c;

    public interface a {
        void a(@NotNull File file);
    }

    public k(@NotNull String uriStr, @NotNull File destFile, @NotNull a onSuccess) {
        Intrinsics.checkNotNullParameter(uriStr, "uriStr");
        Intrinsics.checkNotNullParameter(destFile, "destFile");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        this.f99051a = uriStr;
        this.f99052b = destFile;
        this.f99053c = onSuccess;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Boolean] */
    @l1(otherwise = 4)
    @NotNull
    public Boolean a(@NotNull String... args) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(args, "args");
                try {
                    URL url = new URL(this.f99051a);
                    int contentLength = ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection())).getContentLength();
                    DataInputStream dataInputStream = new DataInputStream(FirebasePerfUrlConnection.openStream(url));
                    byte[] bArr = new byte[contentLength];
                    dataInputStream.readFully(bArr);
                    dataInputStream.close();
                    DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f99052b));
                    dataOutputStream.write(bArr);
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    this = Boolean.TRUE;
                    return this;
                } catch (Exception unused) {
                    this = Boolean.FALSE;
                    return this;
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
                return null;
            }
        } catch (Throwable th3) {
            com.facebook.internal.instrument.crashshield.b.c(th3, this);
            return null;
        }
    }

    protected void b(boolean z10) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            if (!com.facebook.internal.instrument.crashshield.b.e(this) && z10) {
                try {
                    this.f99053c.a(this.f99052b);
                } catch (Throwable th2) {
                    com.facebook.internal.instrument.crashshield.b.c(th2, this);
                }
            }
        } catch (Throwable th3) {
            com.facebook.internal.instrument.crashshield.b.c(th3, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Boolean] */
    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Boolean doInBackground(String[] strArr) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return null;
            }
            try {
                this = a(strArr);
                return this;
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
                return null;
            }
        } catch (Throwable th3) {
            com.facebook.internal.instrument.crashshield.b.c(th3, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
            try {
                if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
                    try {
                        b(bool.booleanValue());
                    } catch (Throwable th2) {
                        com.facebook.internal.instrument.crashshield.b.c(th2, this);
                    }
                }
            } catch (Throwable th3) {
                com.facebook.internal.instrument.crashshield.b.c(th3, this);
            }
        }
    }
}
