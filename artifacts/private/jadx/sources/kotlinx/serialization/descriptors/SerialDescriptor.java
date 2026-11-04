package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.i1;
import kotlinx.serialization.w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@i1(markerClass = {w.class})
public interface SerialDescriptor {

    public static final class a {
        @Deprecated
        @NotNull
        public static List<Annotation> a(@NotNull SerialDescriptor serialDescriptor) {
            return SerialDescriptor.super.getAnnotations();
        }

        @Deprecated
        public static boolean b(@NotNull SerialDescriptor serialDescriptor) {
            return SerialDescriptor.super.isInline();
        }

        @Deprecated
        public static boolean c(@NotNull SerialDescriptor serialDescriptor) {
            return SerialDescriptor.super.isNullable();
        }
    }

    @NotNull
    default List<Annotation> getAnnotations() {
        return CollectionsKt.emptyList();
    }

    @NotNull
    List<Annotation> getElementAnnotations(int i10);

    @NotNull
    SerialDescriptor getElementDescriptor(int i10);

    int getElementIndex(@NotNull String str);

    @NotNull
    String getElementName(int i10);

    int getElementsCount();

    @NotNull
    l getKind();

    @NotNull
    String getSerialName();

    boolean isElementOptional(int i10);

    default boolean isInline() {
        return false;
    }

    default boolean isNullable() {
        return false;
    }
}
