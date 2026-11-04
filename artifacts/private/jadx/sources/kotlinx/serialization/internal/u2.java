package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class u2 implements SerialDescriptor, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SerialDescriptor f316027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f316028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Set<String> f316029c;

    public u2(@NotNull SerialDescriptor original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.f316027a = original;
        this.f316028b = original.getSerialName() + '?';
        this.f316029c = f2.a(original);
    }

    @Override // kotlinx.serialization.internal.n
    @NotNull
    public Set<String> a() {
        return this.f316029c;
    }

    @NotNull
    public final SerialDescriptor e() {
        return this.f316027a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u2) && Intrinsics.areEqual(this.f316027a, ((u2) obj).f316027a);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getAnnotations() {
        return this.f316027a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getElementAnnotations(int i10) {
        return this.f316027a.getElementAnnotations(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor getElementDescriptor(int i10) {
        return this.f316027a.getElementDescriptor(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f316027a.getElementIndex(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getElementName(int i10) {
        return this.f316027a.getElementName(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.f316027a.getElementsCount();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public kotlinx.serialization.descriptors.l getKind() {
        return this.f316027a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getSerialName() {
        return this.f316028b;
    }

    public int hashCode() {
        return this.f316027a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int i10) {
        return this.f316027a.isElementOptional(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.f316027a.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return true;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f316027a);
        sb2.append('?');
        return sb2.toString();
    }
}
