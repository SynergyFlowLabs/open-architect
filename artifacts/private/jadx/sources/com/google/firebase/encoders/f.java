package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public interface f {
    @NonNull
    f a(@NonNull d dVar) throws IOException;

    @NonNull
    @Deprecated
    f d(@NonNull String str, @p0 Object obj) throws IOException;

    @NonNull
    f f(@NonNull d dVar, boolean z10) throws IOException;

    @NonNull
    f g(@NonNull d dVar, long j10) throws IOException;

    @NonNull
    f h(@NonNull d dVar, int i10) throws IOException;

    @NonNull
    f i(@NonNull d dVar, float f10) throws IOException;

    @NonNull
    f j(@NonNull d dVar, double d10) throws IOException;

    @NonNull
    @Deprecated
    f k(@NonNull String str, boolean z10) throws IOException;

    @NonNull
    @Deprecated
    f l(@NonNull String str, double d10) throws IOException;

    @NonNull
    @Deprecated
    f m(@NonNull String str, long j10) throws IOException;

    @NonNull
    @Deprecated
    f n(@NonNull String str, int i10) throws IOException;

    @NonNull
    f o(@NonNull d dVar, @p0 Object obj) throws IOException;

    @NonNull
    f p(@p0 Object obj) throws IOException;

    @NonNull
    f q(@NonNull String str) throws IOException;
}
