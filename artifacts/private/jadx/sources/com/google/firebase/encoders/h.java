package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public interface h {
    @NonNull
    h add(double d10) throws IOException;

    @NonNull
    h add(int i10) throws IOException;

    @NonNull
    h add(long j10) throws IOException;

    @NonNull
    h b(@p0 String str) throws IOException;

    @NonNull
    h c(boolean z10) throws IOException;

    @NonNull
    h e(float f10) throws IOException;

    @NonNull
    h x(@NonNull byte[] bArr) throws IOException;
}
