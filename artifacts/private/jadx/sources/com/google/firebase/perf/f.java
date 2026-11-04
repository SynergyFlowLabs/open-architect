package com.google.firebase.perf;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface f {

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public static final int f123925k2 = 5;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public static final int f123926l2 = 40;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public static final int f123927m2 = 100;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public static final int f123928n2 = 100;

    @p0
    String getAttribute(@NonNull String str);

    @NonNull
    Map<String, String> getAttributes();

    void putAttribute(@NonNull String str, @NonNull String str2);

    void removeAttribute(@NonNull String str);
}
