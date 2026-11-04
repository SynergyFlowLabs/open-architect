package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class o2 extends h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f315989c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(@NotNull SerialDescriptor primitive) {
        super(primitive, null);
        Intrinsics.checkNotNullParameter(primitive, "primitive");
        this.f315989c = primitive.getSerialName() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getSerialName() {
        return this.f315989c;
    }
}
