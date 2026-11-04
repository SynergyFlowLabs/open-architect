package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class u1 implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final u1 f316024a = new u1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final kotlinx.serialization.descriptors.l f316025b = kotlinx.serialization.descriptors.m.d.f315864a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f316026c = "kotlin.Nothing";

    private u1() {
    }

    private final Void a() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public boolean equals(@Nullable Object obj) {
        return this == obj;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getElementAnnotations(int i10) {
        a();
        throw new kotlin.a0();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor getElementDescriptor(int i10) {
        a();
        throw new kotlin.a0();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        a();
        throw new kotlin.a0();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getElementName(int i10) {
        a();
        throw new kotlin.a0();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public kotlinx.serialization.descriptors.l getKind() {
        return f316025b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getSerialName() {
        return f316026c;
    }

    public int hashCode() {
        return getSerialName().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int i10) {
        a();
        throw new kotlin.a0();
    }

    @NotNull
    public String toString() {
        return "NothingSerialDescriptor";
    }
}
