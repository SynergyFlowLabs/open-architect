package com.jakewharton.retrofit2.converter.kotlinx.serialization;

import java.io.IOException;
import java.lang.reflect.Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.d0;
import kotlinx.serialization.m0;
import kotlinx.serialization.r0;
import okhttp3.e0;
import okhttp3.g0;
import okhttp3.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e {

    public static final class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final kotlinx.serialization.a f131152a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull kotlinx.serialization.a format) {
            super(null);
            Intrinsics.checkNotNullParameter(format, "format");
            this.f131152a = format;
        }

        @Override // com.jakewharton.retrofit2.converter.kotlinx.serialization.e
        public <T> T a(@NotNull kotlinx.serialization.e<? extends T> loader, @NotNull g0 body) throws IOException {
            Intrinsics.checkNotNullParameter(loader, "loader");
            Intrinsics.checkNotNullParameter(body, "body");
            byte[] bArrBytes = body.bytes();
            Intrinsics.checkNotNullExpressionValue(bArrBytes, "body.bytes()");
            return (T) b().b(loader, bArrBytes);
        }

        @Override // com.jakewharton.retrofit2.converter.kotlinx.serialization.e
        @NotNull
        public <T> e0 d(@NotNull x contentType, @NotNull d0<? super T> saver, T t10) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(saver, "saver");
            e0 e0VarCreate = e0.create(contentType, b().a(saver, t10));
            Intrinsics.checkNotNullExpressionValue(e0VarCreate, "create(contentType, bytes)");
            return e0VarCreate;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.jakewharton.retrofit2.converter.kotlinx.serialization.e
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public kotlinx.serialization.a b() {
            return this.f131152a;
        }
    }

    public static final class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final r0 f131153a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull r0 format) {
            super(null);
            Intrinsics.checkNotNullParameter(format, "format");
            this.f131153a = format;
        }

        @Override // com.jakewharton.retrofit2.converter.kotlinx.serialization.e
        public <T> T a(@NotNull kotlinx.serialization.e<? extends T> loader, @NotNull g0 body) throws IOException {
            Intrinsics.checkNotNullParameter(loader, "loader");
            Intrinsics.checkNotNullParameter(body, "body");
            String strString = body.string();
            Intrinsics.checkNotNullExpressionValue(strString, "body.string()");
            return (T) b().decodeFromString(loader, strString);
        }

        @Override // com.jakewharton.retrofit2.converter.kotlinx.serialization.e
        @NotNull
        public <T> e0 d(@NotNull x contentType, @NotNull d0<? super T> saver, T t10) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(saver, "saver");
            e0 e0VarCreate = e0.create(contentType, b().encodeToString(saver, t10));
            Intrinsics.checkNotNullExpressionValue(e0VarCreate, "create(contentType, string)");
            return e0VarCreate;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.jakewharton.retrofit2.converter.kotlinx.serialization.e
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public r0 b() {
            return this.f131153a;
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract <T> T a(@NotNull kotlinx.serialization.e<? extends T> eVar, @NotNull g0 g0Var);

    @NotNull
    protected abstract kotlinx.serialization.x b();

    @NotNull
    public final KSerializer<Object> c(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return m0.m(b().getSerializersModule(), type);
    }

    @NotNull
    public abstract <T> e0 d(@NotNull x xVar, @NotNull d0<? super T> d0Var, T t10);

    private e() {
    }
}
