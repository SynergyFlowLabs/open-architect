package com.facebook.login;

import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f0 f100476a = new f0();

    private f0() {
    }

    @oj.n
    public static final boolean a(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return !(StringsKt.q3(str, ' ', 0, false, 6, null) >= 0);
    }
}
