package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCollectionDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionDescriptors.kt\nkotlinx/serialization/internal/MapLikeDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
public abstract class n1 implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f315978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final SerialDescriptor f315979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final SerialDescriptor f315980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f315981d;

    public /* synthetic */ n1(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, serialDescriptor, serialDescriptor2);
    }

    @NotNull
    public final SerialDescriptor a() {
        return this.f315979b;
    }

    @NotNull
    public final SerialDescriptor e() {
        return this.f315980c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return Intrinsics.areEqual(getSerialName(), n1Var.getSerialName()) && Intrinsics.areEqual(this.f315979b, n1Var.f315979b) && Intrinsics.areEqual(this.f315980c, n1Var.f315980c);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getElementAnnotations(int i10) {
        if (i10 >= 0) {
            return CollectionsKt.emptyList();
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + getSerialName() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor getElementDescriptor(int i10) {
        if (i10 >= 0) {
            int i11 = i10 % 2;
            if (i11 == 0) {
                return this.f315979b;
            }
            if (i11 == 1) {
                return this.f315980c;
            }
            throw new IllegalStateException("Unreached");
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + getSerialName() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer intOrNull = StringsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getElementName(int i10) {
        return String.valueOf(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.f315981d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public kotlinx.serialization.descriptors.l getKind() {
        return kotlinx.serialization.descriptors.m.c.f315863a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getSerialName() {
        return this.f315978a;
    }

    public int hashCode() {
        return (((getSerialName().hashCode() * 31) + this.f315979b.hashCode()) * 31) + this.f315980c.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + getSerialName() + " expects only non-negative indices").toString());
    }

    @NotNull
    public String toString() {
        return getSerialName() + '(' + this.f315979b + ", " + this.f315980c + ')';
    }

    private n1(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.f315978a = str;
        this.f315979b = serialDescriptor;
        this.f315980c = serialDescriptor2;
        this.f315981d = 2;
    }
}
