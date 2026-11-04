package kotlinx.serialization.json.internal;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes13.dex */
/* synthetic */ class JsonElementMarker$origin$1 extends g0 implements Function2<SerialDescriptor, Integer, Boolean> {
    JsonElementMarker$origin$1(Object obj) {
        super(2, obj, JsonElementMarker.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    public final Boolean invoke(SerialDescriptor p10, int i10) {
        Intrinsics.checkNotNullParameter(p10, "p0");
        return Boolean.valueOf(((JsonElementMarker) this.receiver).readIfAbsent(p10, i10));
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Boolean invoke(SerialDescriptor serialDescriptor, Integer num) {
        return invoke(serialDescriptor, num.intValue());
    }
}
