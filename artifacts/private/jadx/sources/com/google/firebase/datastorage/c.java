package com.google.firebase.datastorage;

import androidx.datastore.preferences.core.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class c {
    public static final <T> T a(@NotNull f fVar, @NotNull f.a<T> key, T t10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        T t11 = (T) fVar.c(key);
        return t11 == null ? t10 : t11;
    }
}
