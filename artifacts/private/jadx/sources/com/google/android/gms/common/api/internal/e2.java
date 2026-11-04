package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public interface e2 {
    ConnectionResult l();

    boolean m(x xVar);

    e.a n(@NonNull e.a aVar);

    e.a o(@NonNull e.a aVar);

    void p();

    void q();

    void r();

    void s();

    void t(String str, @androidx.annotation.p0 FileDescriptor fileDescriptor, PrintWriter printWriter, @androidx.annotation.p0 String[] strArr);

    @androidx.annotation.p0
    ConnectionResult u(@NonNull com.google.android.gms.common.api.a aVar);

    boolean v();

    ConnectionResult w(long j10, TimeUnit timeUnit);

    boolean x();
}
