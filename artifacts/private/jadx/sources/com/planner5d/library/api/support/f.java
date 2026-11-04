package com.planner5d.library.api.support;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.e0;
import okhttp3.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements Converter<JSONObject, e0> {

    public static final class a extends Converter.Factory {
        @Override // retrofit2.Converter.Factory
        @Nullable
        public Converter<?, e0> requestBodyConverter(@NotNull Type type, @NotNull Annotation[] parameterAnnotations, @NotNull Annotation[] methodAnnotations, @NotNull Retrofit retrofit) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(parameterAnnotations, "parameterAnnotations");
            Intrinsics.checkNotNullParameter(methodAnnotations, "methodAnnotations");
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            boolean zAreEqual = Intrinsics.areEqual(type, JSONObject.class);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (zAreEqual) {
                return new f(defaultConstructorMarker);
            }
            return null;
        }
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // retrofit2.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e0 convert(@NotNull JSONObject value) throws IOException {
        Intrinsics.checkNotNullParameter(value, "value");
        e0.a aVar = e0.Companion;
        String string = value.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return aVar.b(string, x.f334808e.d("application/json"));
    }

    private f() {
    }
}
