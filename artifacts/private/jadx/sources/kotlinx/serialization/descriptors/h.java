package kotlinx.serialization.descriptors;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    public static final class a implements Iterator<SerialDescriptor>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f315853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SerialDescriptor f315854b;

        a(SerialDescriptor serialDescriptor) {
            this.f315854b = serialDescriptor;
            this.f315853a = serialDescriptor.getElementsCount();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SerialDescriptor next() {
            SerialDescriptor serialDescriptor = this.f315854b;
            int elementsCount = serialDescriptor.getElementsCount();
            int i10 = this.f315853a;
            this.f315853a = i10 - 1;
            return serialDescriptor.getElementDescriptor(elementsCount - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f315853a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class b implements Iterator<String>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f315855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SerialDescriptor f315856b;

        b(SerialDescriptor serialDescriptor) {
            this.f315856b = serialDescriptor;
            this.f315855a = serialDescriptor.getElementsCount();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            SerialDescriptor serialDescriptor = this.f315856b;
            int elementsCount = serialDescriptor.getElementsCount();
            int i10 = this.f315855a;
            this.f315855a = i10 - 1;
            return serialDescriptor.getElementName(elementsCount - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f315855a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @SourceDebugExtension({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 SerialDescriptor.kt\nkotlinx/serialization/descriptors/SerialDescriptorKt\n*L\n1#1,17:1\n415#2,8:18\n*E\n"})
    public static final class c implements Iterable<SerialDescriptor>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SerialDescriptor f315857a;

        public c(SerialDescriptor serialDescriptor) {
            this.f315857a = serialDescriptor;
        }

        @Override // java.lang.Iterable
        public Iterator<SerialDescriptor> iterator() {
            return new a(this.f315857a);
        }
    }

    @SourceDebugExtension({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 SerialDescriptor.kt\nkotlinx/serialization/descriptors/SerialDescriptorKt\n*L\n1#1,17:1\n439#2,8:18\n*E\n"})
    public static final class d implements Iterable<String>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SerialDescriptor f315858a;

        public d(SerialDescriptor serialDescriptor) {
            this.f315858a = serialDescriptor;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return new b(this.f315858a);
        }
    }

    @NotNull
    public static final Iterable<SerialDescriptor> a(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return new c(serialDescriptor);
    }

    @NotNull
    public static final Iterable<String> b(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return new d(serialDescriptor);
    }
}
