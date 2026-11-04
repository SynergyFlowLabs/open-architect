package com.google.firebase.inappmessaging.internal;

import android.app.Application;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
@gj.d
public class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f123007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f123008b;

    public y2(Application application, String str) {
        this.f123007a = application;
        this.f123008b = str;
    }

    public static /* synthetic */ Object a(y2 y2Var, com.google.protobuf.a aVar) {
        synchronized (y2Var) {
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = y2Var.f123007a.openFileOutput(y2Var.f123008b, 0);
                try {
                    fileOutputStreamOpenFileOutput.write(aVar.H0());
                    fileOutputStreamOpenFileOutput.close();
                } catch (Throwable th2) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return aVar;
    }

    public static /* synthetic */ com.google.protobuf.a b(y2 y2Var, com.google.protobuf.f3 f3Var) {
        com.google.protobuf.a aVar;
        synchronized (y2Var) {
            try {
                FileInputStream fileInputStreamOpenFileInput = y2Var.f123007a.openFileInput(y2Var.f123008b);
                try {
                    aVar = (com.google.protobuf.a) f3Var.d(fileInputStreamOpenFileInput);
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                } catch (Throwable th2) {
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (com.google.protobuf.t1 | FileNotFoundException e10) {
                p2.c("Recoverable exception while reading cache: " + e10.getMessage());
                return null;
            }
        }
        return aVar;
    }

    public <T extends com.google.protobuf.a> io.reactivex.s<T> c(final com.google.protobuf.f3<T> f3Var) {
        return io.reactivex.s.n0(new Callable() { // from class: com.google.firebase.inappmessaging.internal.x2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return y2.b(this.f122996a, f3Var);
            }
        });
    }

    public io.reactivex.c d(final com.google.protobuf.a aVar) {
        return io.reactivex.c.T(new Callable() { // from class: com.google.firebase.inappmessaging.internal.w2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return y2.a(this.f122985a, aVar);
            }
        });
    }
}
