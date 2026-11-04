package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@kotlinx.serialization.i
public abstract class a<Element, Collection, Builder> implements KSerializer<Collection> {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void j(a aVar, kotlinx.serialization.encoding.d dVar, int i10, Object obj, boolean z10, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        aVar.i(dVar, i10, obj, z10);
    }

    private final int k(kotlinx.serialization.encoding.d dVar, Builder builder) {
        int iG = dVar.g(getDescriptor());
        d(builder, iG);
        return iG;
    }

    protected abstract Builder b();

    protected abstract int c(Builder builder);

    protected abstract void d(Builder builder, int i10);

    @Override // kotlinx.serialization.e
    public Collection deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return g(decoder, null);
    }

    @NotNull
    protected abstract Iterator<Element> e(Collection collection);

    protected abstract int f(Collection collection);

    @kotlinx.serialization.i
    public final Collection g(@NotNull Decoder decoder, @Nullable Collection collection) {
        Builder builderB;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (collection == null || (builderB = l(collection)) == null) {
            builderB = b();
        }
        Builder builder = builderB;
        int iC = c(builder);
        kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(getDescriptor());
        if (!dVarBeginStructure.c()) {
            while (true) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    break;
                }
                j(this, dVarBeginStructure, iC + iDecodeElementIndex, builder, false, 8, null);
            }
        } else {
            h(dVarBeginStructure, builder, iC, k(dVarBeginStructure, builder));
        }
        dVarBeginStructure.endStructure(getDescriptor());
        return m(builder);
    }

    protected abstract void h(@NotNull kotlinx.serialization.encoding.d dVar, Builder builder, int i10, int i11);

    protected abstract void i(@NotNull kotlinx.serialization.encoding.d dVar, int i10, Builder builder, boolean z10);

    protected abstract Builder l(Collection collection);

    protected abstract Collection m(Builder builder);

    @Override // kotlinx.serialization.d0
    public abstract void serialize(@NotNull Encoder encoder, Collection collection);

    private a() {
    }
}
