package com.jakewharton.retrofit2.converter.kotlinx.serialization;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.r0;
import oj.i;
import okhttp3.x;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes5.dex */
@i(name = "KotlinSerializationConverterFactory")
public final class c {
    @i(name = "create")
    @NotNull
    public static final Converter.Factory a(@NotNull kotlinx.serialization.a aVar, @NotNull x contentType) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        return new b(contentType, new e.a(aVar));
    }

    @i(name = "create")
    @NotNull
    public static final Converter.Factory b(@NotNull r0 r0Var, @NotNull x contentType) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        return new b(contentType, new e.b(r0Var));
    }
}
