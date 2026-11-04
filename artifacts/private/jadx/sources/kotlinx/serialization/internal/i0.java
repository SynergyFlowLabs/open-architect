package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
@SourceDebugExtension({"SMAP\nEnums.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumDescriptor\n+ 2 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n16#2:149\n160#3:150\n1803#4,3:151\n*S KotlinDebug\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumDescriptor\n*L\n28#1:149\n46#1:150\n46#1:151,3\n*E\n"})
public final class i0 extends PluginGeneratedSerialDescriptor {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final kotlinx.serialization.descriptors.l f315937m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f315938n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(@NotNull final String name, final int i10) {
        super(name, null, i10, 2, null);
        Intrinsics.checkNotNullParameter(name, "name");
        this.f315937m = kotlinx.serialization.descriptors.l.b.f315860a;
        this.f315938n = kotlin.g0.c(new Function0() { // from class: kotlinx.serialization.internal.h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i0.t(i10, name, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor[] t(int i10, String str, i0 i0Var) {
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            serialDescriptorArr[i11] = kotlinx.serialization.descriptors.k.i(str + '.' + i0Var.getElementName(i11), kotlinx.serialization.descriptors.m.d.f315864a, new SerialDescriptor[0], null, 8, null);
        }
        return serialDescriptorArr;
    }

    private final SerialDescriptor[] u() {
        return (SerialDescriptor[]) this.f315938n.getValue();
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        return serialDescriptor.getKind() == kotlinx.serialization.descriptors.l.b.f315860a && Intrinsics.areEqual(getSerialName(), serialDescriptor.getSerialName()) && Intrinsics.areEqual(f2.a(this), f2.a(serialDescriptor));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor getElementDescriptor(int i10) {
        return u()[i10];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public kotlinx.serialization.descriptors.l getKind() {
        return this.f315937m;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        int iHashCode = getSerialName().hashCode();
        Iterator<String> it = kotlinx.serialization.descriptors.h.b(this).iterator();
        int iHashCode2 = 1;
        while (it.hasNext()) {
            int i10 = iHashCode2 * 31;
            String next = it.next();
            iHashCode2 = i10 + (next != null ? next.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    @NotNull
    public String toString() {
        int i10 = 3 | 0;
        return CollectionsKt.joinToString$default(kotlinx.serialization.descriptors.h.b(this), ", ", getSerialName() + '(', ")", 0, null, null, 56, null);
    }
}
