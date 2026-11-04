package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@u7.d
public abstract class c {
    @NonNull
    public static c a(@NonNull Set<String> set) {
        return new a(set);
    }

    @NonNull
    public abstract Set<String> b();
}
