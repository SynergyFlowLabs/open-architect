package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
final class c implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SerialDescriptor f315826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public final kotlin.reflect.d<?> f315827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f315828c;

    public c(@NotNull SerialDescriptor original, @NotNull kotlin.reflect.d<?> kClass) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        this.f315826a = original;
        this.f315827b = kClass;
        this.f315828c = original.getSerialName() + b0.f313280e + kClass.Q() + b0.f313281f;
    }

    public boolean equals(@Nullable Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && Intrinsics.areEqual(this.f315826a, cVar.f315826a) && Intrinsics.areEqual(cVar.f315827b, this.f315827b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getAnnotations() {
        return this.f315826a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getElementAnnotations(int i10) {
        return this.f315826a.getElementAnnotations(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor getElementDescriptor(int i10) {
        return this.f315826a.getElementDescriptor(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f315826a.getElementIndex(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getElementName(int i10) {
        return this.f315826a.getElementName(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.f315826a.getElementsCount();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public l getKind() {
        return this.f315826a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getSerialName() {
        return this.f315828c;
    }

    public int hashCode() {
        return (this.f315827b.hashCode() * 31) + getSerialName().hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int i10) {
        return this.f315826a.isElementOptional(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.f315826a.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return this.f315826a.isNullable();
    }

    @NotNull
    public String toString() {
        return "ContextDescriptor(kClass: " + this.f315827b + ", original: " + this.f315826a + ')';
    }
}
