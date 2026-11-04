package io.ktor.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f296812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f296813b;

    public u(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f296812a = content;
        int length = content.length();
        int lowerCase = 0;
        for (int i10 = 0; i10 < length; i10++) {
            lowerCase = (lowerCase * 31) + Character.toLowerCase(content.charAt(i10));
        }
        this.f296813b = lowerCase;
    }

    @NotNull
    public final String a() {
        return this.f296812a;
    }

    public boolean equals(@Nullable Object obj) {
        String str;
        u uVar = obj instanceof u ? (u) obj : null;
        return (uVar == null || (str = uVar.f296812a) == null || !StringsKt.N1(str, this.f296812a, true)) ? false : true;
    }

    public int hashCode() {
        return this.f296813b;
    }

    @NotNull
    public String toString() {
        return this.f296812a;
    }
}
