package kotlinx.serialization.json;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q0;
import kotlinx.serialization.m0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class JsonKt {

    @NotNull
    private static final String defaultDiscriminator = "type";

    @NotNull
    private static final String defaultIndent = "    ";

    @NotNull
    public static final Json Json(@NotNull Json from, @NotNull Function1<? super JsonBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        JsonBuilder jsonBuilder = new JsonBuilder(from);
        builderAction.invoke(jsonBuilder);
        return new JsonImpl(jsonBuilder.build$kotlinx_serialization_json(), jsonBuilder.getSerializersModule());
    }

    public static /* synthetic */ Json Json$default(Json json, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            json = Json.Default;
        }
        return Json(json, function1);
    }

    public static final /* synthetic */ <T> T decodeFromJsonElement(Json json, JsonElement json2) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(json2, "json");
        kotlinx.serialization.modules.f serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        int i10 = 0 >> 0;
        return (T) json.decodeFromJsonElement(m0.o(serializersModule, null), json2);
    }

    public static final /* synthetic */ <T> JsonElement encodeToJsonElement(Json json, T t10) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        kotlinx.serialization.modules.f serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        return json.encodeToJsonElement(m0.o(serializersModule, null), t10);
    }
}
