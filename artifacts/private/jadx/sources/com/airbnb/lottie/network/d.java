package com.airbnb.lottie.network;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface d extends Closeable {
    @NonNull
    InputStream Ia() throws IOException;

    @p0
    String error();

    boolean isSuccessful();

    @p0
    String oa();
}
