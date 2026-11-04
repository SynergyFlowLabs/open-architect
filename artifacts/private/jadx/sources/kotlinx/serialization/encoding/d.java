package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f315867a = a.f315870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f315868b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f315869c = -3;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f315870a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f315871b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f315872c = -3;

        private a() {
        }
    }

    public static final class b {
        @Deprecated
        public static int a(@NotNull d dVar, @NotNull SerialDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return d.super.g(descriptor);
        }

        @Deprecated
        @kotlinx.serialization.g
        public static boolean c(@NotNull d dVar) {
            return d.super.c();
        }
    }

    static /* synthetic */ Object a(d dVar, SerialDescriptor serialDescriptor, int i10, kotlinx.serialization.e eVar, Object obj, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
        }
        if ((i11 & 8) != 0) {
            obj = null;
        }
        return dVar.decodeSerializableElement(serialDescriptor, i10, eVar, obj);
    }

    static /* synthetic */ Object d(d dVar, SerialDescriptor serialDescriptor, int i10, kotlinx.serialization.e eVar, Object obj, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeNullableSerializableElement");
        }
        if ((i11 & 8) != 0) {
            obj = null;
        }
        return dVar.decodeNullableSerializableElement(serialDescriptor, i10, eVar, obj);
    }

    @kotlinx.serialization.g
    default boolean c() {
        return false;
    }

    boolean decodeBooleanElement(@NotNull SerialDescriptor serialDescriptor, int i10);

    byte decodeByteElement(@NotNull SerialDescriptor serialDescriptor, int i10);

    char decodeCharElement(@NotNull SerialDescriptor serialDescriptor, int i10);

    double decodeDoubleElement(@NotNull SerialDescriptor serialDescriptor, int i10);

    int decodeElementIndex(@NotNull SerialDescriptor serialDescriptor);

    float decodeFloatElement(@NotNull SerialDescriptor serialDescriptor, int i10);

    @NotNull
    Decoder decodeInlineElement(@NotNull SerialDescriptor serialDescriptor, int i10);

    int decodeIntElement(@NotNull SerialDescriptor serialDescriptor, int i10);

    long decodeLongElement(@NotNull SerialDescriptor serialDescriptor, int i10);

    @kotlinx.serialization.g
    @Nullable
    <T> T decodeNullableSerializableElement(@NotNull SerialDescriptor serialDescriptor, int i10, @NotNull kotlinx.serialization.e<? extends T> eVar, @Nullable T t10);

    <T> T decodeSerializableElement(@NotNull SerialDescriptor serialDescriptor, int i10, @NotNull kotlinx.serialization.e<? extends T> eVar, @Nullable T t10);

    short decodeShortElement(@NotNull SerialDescriptor serialDescriptor, int i10);

    @NotNull
    String decodeStringElement(@NotNull SerialDescriptor serialDescriptor, int i10);

    void endStructure(@NotNull SerialDescriptor serialDescriptor);

    default int g(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return -1;
    }

    @NotNull
    kotlinx.serialization.modules.f getSerializersModule();
}
