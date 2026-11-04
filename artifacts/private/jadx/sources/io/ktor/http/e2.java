package io.ktor.http;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public enum e2 {
    Bytes("bytes"),
    None("none");


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f295840e = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f295841a;

    e2(String str) {
        this.f295841a = str;
    }

    @NotNull
    public static kotlin.enums.a<e2> l() {
        return f295840e;
    }

    @NotNull
    public final String n() {
        return this.f295841a;
    }
}
