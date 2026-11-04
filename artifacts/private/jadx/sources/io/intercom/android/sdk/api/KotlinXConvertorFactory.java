package io.intercom.android.sdk.api;

import androidx.compose.runtime.internal.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import okhttp3.x;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class KotlinXConvertorFactory {
    public static final int $stable = 0;

    @NotNull
    public static final KotlinXConvertorFactory INSTANCE = new KotlinXConvertorFactory();

    private KotlinXConvertorFactory() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getConvertorFactory$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setLenient(true);
        Json.setIgnoreUnknownKeys(true);
        return Unit.f312394a;
    }

    @NotNull
    public final Converter.Factory getConvertorFactory() {
        int i10 = 2 | 0;
        return com.jakewharton.retrofit2.converter.kotlinx.serialization.c.b(JsonKt.Json$default(null, new Function1() { // from class: io.intercom.android.sdk.api.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KotlinXConvertorFactory.getConvertorFactory$lambda$0((JsonBuilder) obj);
            }
        }, 1, null), x.f334808e.c("application/json"));
    }
}
