package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.l2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f315865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final SerialDescriptor f315866b;

    public n(@NotNull String serialName, @NotNull SerialDescriptor original) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(original, "original");
        this.f315865a = serialName;
        this.f315866b = original;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(getSerialName(), nVar.getSerialName()) && Intrinsics.areEqual(this.f315866b, nVar.f315866b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getAnnotations() {
        return this.f315866b.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getElementAnnotations(int i10) {
        return this.f315866b.getElementAnnotations(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor getElementDescriptor(int i10) {
        return this.f315866b.getElementDescriptor(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f315866b.getElementIndex(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getElementName(int i10) {
        return this.f315866b.getElementName(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.f315866b.getElementsCount();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public l getKind() {
        return this.f315866b.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getSerialName() {
        return this.f315865a;
    }

    public int hashCode() {
        return (getSerialName().hashCode() * 31) + this.f315866b.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int i10) {
        return this.f315866b.isElementOptional(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.f315866b.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return this.f315866b.isNullable();
    }

    @NotNull
    public String toString() {
        return l2.d(this);
    }
}
