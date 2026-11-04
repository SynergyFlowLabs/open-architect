package com.sdk.growthbook.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.z;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r f266515a = new r();

    @SourceDebugExtension({"SMAP\nConstants.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constants.kt\ncom/sdk/growthbook/utils/RangeSerializer$GBBucketRangeListSerializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,345:1\n1563#2:346\n1634#2,3:347\n1563#2:350\n1634#2,3:351\n*S KotlinDebug\n*F\n+ 1 Constants.kt\ncom/sdk/growthbook/utils/RangeSerializer$GBBucketRangeListSerializer\n*L\n259#1:346\n259#1:347,3\n272#1:350\n272#1:351,3\n*E\n"})
    public static final class a implements KSerializer<List<? extends Pair<? extends Float, ? extends Float>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f266516a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final SerialDescriptor f266517b;

        static {
            z zVar = z.f312833a;
            f266517b = hk.a.i(hk.a.n(hk.a.G(zVar), hk.a.G(zVar))).getDescriptor();
        }

        private a() {
        }

        @Override // kotlinx.serialization.e
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<Pair<Float, Float>> deserialize(@NotNull Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            JsonArray jsonArray = (JsonArray) decoder.decodeSerializableValue(JsonArray.Companion.serializer());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(jsonArray, 10));
            for (JsonElement jsonElement : jsonArray) {
                Float floatOrNull = JsonElementKt.getFloatOrNull(JsonElementKt.getJsonPrimitive(JsonElementKt.getJsonArray(jsonElement).get(0)));
                Float floatOrNull2 = JsonElementKt.getFloatOrNull(JsonElementKt.getJsonPrimitive(JsonElementKt.getJsonArray(jsonElement).get(1)));
                if (floatOrNull == null || floatOrNull2 == null) {
                    throw new IllegalArgumentException("Invalid range format");
                }
                arrayList.add(TuplesKt.to(floatOrNull, floatOrNull2));
            }
            return arrayList;
        }

        @Override // kotlinx.serialization.d0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(@NotNull Encoder encoder, @NotNull List<Pair<Float, Float>> value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            List<Pair<Float, Float>> list = value;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                arrayList.add(new JsonArray(CollectionsKt.listOf((Object[]) new JsonPrimitive[]{JsonElementKt.JsonPrimitive((Number) pair.getFirst()), JsonElementKt.JsonPrimitive((Number) pair.getSecond())})));
            }
            encoder.encodeSerializableValue(JsonArray.Companion.serializer(), new JsonArray(arrayList));
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
        @NotNull
        public SerialDescriptor getDescriptor() {
            return f266517b;
        }
    }

    public static final class b implements KSerializer<Pair<? extends Float, ? extends Float>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f266518a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final SerialDescriptor f266519b;

        static {
            z zVar = z.f312833a;
            f266519b = hk.a.n(hk.a.G(zVar), hk.a.G(zVar)).getDescriptor();
        }

        private b() {
        }

        @Override // kotlinx.serialization.e
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Pair<Float, Float> deserialize(@NotNull Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            JsonArray jsonArray = (JsonArray) decoder.decodeSerializableValue(JsonArray.Companion.serializer());
            Float floatOrNull = JsonElementKt.getFloatOrNull(JsonElementKt.getJsonPrimitive(jsonArray.get(0)));
            Float floatOrNull2 = JsonElementKt.getFloatOrNull(JsonElementKt.getJsonPrimitive(jsonArray.get(1)));
            if (floatOrNull == null || floatOrNull2 == null) {
                throw new IllegalArgumentException("Invalid range format");
            }
            return TuplesKt.to(floatOrNull, floatOrNull2);
        }

        @Override // kotlinx.serialization.d0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(@NotNull Encoder encoder, @NotNull Pair<Float, Float> value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(JsonArray.Companion.serializer(), new JsonArray(CollectionsKt.listOf((Object[]) new JsonPrimitive[]{JsonElementKt.JsonPrimitive(value.getFirst()), JsonElementKt.JsonPrimitive(value.getSecond())})));
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
        @NotNull
        public SerialDescriptor getDescriptor() {
            return f266519b;
        }
    }

    private r() {
    }
}
