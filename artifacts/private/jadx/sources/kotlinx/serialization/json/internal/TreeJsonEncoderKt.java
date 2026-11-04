package kotlinx.serialization.json.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.j1;
import kotlinx.serialization.d0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class TreeJsonEncoderKt {

    @NotNull
    public static final String PRIMITIVE_TAG = "primitive";

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T extends JsonElement> T cast(JsonElement value, String serialName, Function0<String> path) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
        if (value != 0) {
            return value;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected ");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        sb2.append(j1.d(JsonElement.class).Q());
        sb2.append(", but had ");
        sb2.append(j1.d(value.getClass()).Q());
        sb2.append(" as the serialized body of ");
        sb2.append(serialName);
        sb2.append(" at element: ");
        sb2.append(path.invoke());
        throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), value.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getRequiresTopLevelTag(SerialDescriptor serialDescriptor) {
        return (serialDescriptor.getKind() instanceof e) || serialDescriptor.getKind() == l.b.f315860a;
    }

    @JsonFriendModuleApi
    @NotNull
    public static final <T> JsonElement writeJson(@NotNull Json json, T t10, @NotNull d0<? super T> serializer) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        final i1.h hVar = new i1.h();
        new JsonTreeEncoder(json, new Function1() { // from class: kotlinx.serialization.json.internal.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TreeJsonEncoderKt.writeJson$lambda$0(hVar, (JsonElement) obj);
            }
        }).encodeSerializableValue(serializer, t10);
        T t11 = hVar.f312751a;
        if (t11 != null) {
            return (JsonElement) t11;
        }
        Intrinsics.throwUninitializedPropertyAccessException("result");
        int i10 = 3 << 0;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit writeJson$lambda$0(i1.h hVar, JsonElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        hVar.f312751a = it;
        return Unit.f312394a;
    }
}
