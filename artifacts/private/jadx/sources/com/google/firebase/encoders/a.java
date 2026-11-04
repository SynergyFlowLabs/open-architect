package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes5.dex */
public interface a {
    @NonNull
    String a(@NonNull Object obj);

    void b(@NonNull Object obj, @NonNull Writer writer) throws IOException;
}
