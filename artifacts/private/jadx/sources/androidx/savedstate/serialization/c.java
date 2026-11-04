package androidx.savedstate.serialization;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final class c extends kotlinx.serialization.encoding.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final c f75167d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final kotlinx.serialization.modules.f f75168e = kotlinx.serialization.modules.h.a();

    private c() {
    }

    @Override // kotlinx.serialization.encoding.d
    public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return -1;
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.d
    @NotNull
    public kotlinx.serialization.modules.f getSerializersModule() {
        return f75168e;
    }
}
