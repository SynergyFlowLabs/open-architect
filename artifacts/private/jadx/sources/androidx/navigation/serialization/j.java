package androidx.navigation.serialization;

import androidx.annotation.b1;
import androidx.navigation.d3;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.d0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class j<T> extends kotlinx.serialization.encoding.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final KSerializer<T> f71287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, d3<Object>> f71288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.serialization.modules.f f71289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<String, List<String>> f71290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f71291e;

    /* JADX WARN: Multi-variable type inference failed */
    public j(@NotNull KSerializer<T> serializer, @NotNull Map<String, ? extends d3<Object>> typeMap) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        this.f71287a = serializer;
        this.f71288b = typeMap;
        this.f71289c = kotlinx.serialization.modules.h.a();
        this.f71290d = new LinkedHashMap();
        this.f71291e = -1;
    }

    private final void i(Object obj) {
        String elementName = this.f71287a.getDescriptor().getElementName(this.f71291e);
        d3<Object> d3Var = this.f71288b.get(elementName);
        if (d3Var != null) {
            this.f71290d.put(elementName, d3Var instanceof androidx.navigation.q ? ((androidx.navigation.q) d3Var).b(obj) : CollectionsKt.listOf(d3Var.serializeAsValue(obj)));
            return;
        }
        throw new IllegalStateException(("Cannot find NavType for argument " + elementName + ". Please provide NavType through typeMap.").toString());
    }

    @Override // kotlinx.serialization.encoding.b
    public boolean encodeElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f71291e = i10;
        return true;
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    @NotNull
    public Encoder encodeInline(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (p.v(descriptor)) {
            this.f71291e = 0;
        }
        return super.encodeInline(descriptor);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        i(null);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public <T> void encodeSerializableValue(@NotNull d0<? super T> serializer, T t10) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        i(t10);
    }

    @Override // kotlinx.serialization.encoding.b
    public void encodeValue(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        i(value);
    }

    @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.e
    @NotNull
    public kotlinx.serialization.modules.f getSerializersModule() {
        return this.f71289c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Map<String, List<String>> h(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        super.encodeSerializableValue(this.f71287a, value);
        return MapsKt.toMap(this.f71290d);
    }
}
