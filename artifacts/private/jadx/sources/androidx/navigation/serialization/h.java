package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.lifecycle.l1;
import androidx.navigation.d3;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRouteDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteDecoder.kt\nandroidx/navigation/serialization/RouteDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
public final class h extends kotlinx.serialization.encoding.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final a f71283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f71284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private String f71285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final kotlinx.serialization.modules.f f71286g;

    public h(@NotNull Bundle bundle, @NotNull Map<String, ? extends d3<?>> typeMap) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        this.f71284e = -1;
        this.f71285f = "";
        this.f71286g = kotlinx.serialization.modules.k.a();
        this.f71283d = new q(bundle, typeMap);
    }

    public static /* synthetic */ void k() {
    }

    private final Object l() {
        Object objB = this.f71283d.b(this.f71285f);
        if (objB != null) {
            return objB;
        }
        throw new IllegalStateException(("Unexpected null value for non-nullable argument " + this.f71285f).toString());
    }

    @Override // kotlinx.serialization.encoding.d
    public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
        String elementName;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i10 = this.f71284e;
        do {
            i10++;
            if (i10 >= descriptor.getElementsCount()) {
                return -1;
            }
            elementName = descriptor.getElementName(i10);
        } while (!this.f71283d.a(elementName));
        this.f71284e = i10;
        this.f71285f = elementName;
        return i10;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    @NotNull
    public Decoder decodeInline(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (p.v(descriptor)) {
            this.f71285f = descriptor.getElementName(0);
            this.f71284e = 0;
        }
        return super.decodeInline(descriptor);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return this.f71283d.b(this.f71285f) != null;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    @Nullable
    public Void decodeNull() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public <T> T decodeSerializableValue(@NotNull kotlinx.serialization.e<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) l();
    }

    @Override // kotlinx.serialization.encoding.a
    @NotNull
    public Object decodeValue() {
        return l();
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.d
    @NotNull
    public kotlinx.serialization.modules.f getSerializersModule() {
        return this.f71286g;
    }

    public final <T> T j(@NotNull kotlinx.serialization.e<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) super.decodeSerializableValue(deserializer);
    }

    public h(@NotNull l1 handle, @NotNull Map<String, ? extends d3<?>> typeMap) {
        Intrinsics.checkNotNullParameter(handle, "handle");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        this.f71284e = -1;
        this.f71285f = "";
        this.f71286g = kotlinx.serialization.modules.k.a();
        this.f71283d = new r(handle, typeMap);
    }
}
