package androidx.work.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f76874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f76875b = "androidx.work.workdb";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String[] f76876c;

    static {
        String strI = androidx.work.v.i("WrkDbPathHelper");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"WrkDbPathHelper\")");
        f76874a = strI;
        f76876c = new String[]{"-journal", "-shm", "-wal"};
    }
}
