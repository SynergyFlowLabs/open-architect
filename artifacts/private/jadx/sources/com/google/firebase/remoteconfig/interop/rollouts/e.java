package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.NonNull;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@u7.d
public abstract class e {
    @NonNull
    public static e a(@NonNull Set<d> set) {
        return new c(set);
    }

    @NonNull
    public abstract Set<d> b();
}
