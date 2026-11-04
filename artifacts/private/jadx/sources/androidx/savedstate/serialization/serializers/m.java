package androidx.savedstate.serialization.serializers;

import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBuiltInSerializer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInSerializer.android.kt\nandroidx/savedstate/serialization/serializers/ParcelableSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 4 SavedStateReader.android.kt\nandroidx/savedstate/SavedStateReader\n*L\n1#1,421:1\n1#2:422\n106#3:423\n90#3:424\n252#4:425\n*S KotlinDebug\n*F\n+ 1 BuiltInSerializer.android.kt\nandroidx/savedstate/serialization/serializers/ParcelableSerializer\n*L\n186#1:423\n194#1:424\n194#1:425\n*E\n"})
public abstract class m<T extends Parcelable> implements KSerializer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SerialDescriptor f75242a = kotlinx.serialization.descriptors.k.f("android.os.Parcelable", new SerialDescriptor[0], null, 4, null);

    @Override // kotlinx.serialization.e
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final T deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(decoder instanceof androidx.savedstate.serialization.j)) {
            throw new IllegalArgumentException(a.a(this.f75242a.getSerialName(), decoder).toString());
        }
        androidx.savedstate.serialization.j jVar = (androidx.savedstate.serialization.j) decoder;
        T t10 = (T) androidx.savedstate.f.V(androidx.savedstate.f.b(jVar.w()), jVar.v(), j1.d(Parcelable.class));
        Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type T of androidx.savedstate.serialization.serializers.ParcelableSerializer");
        return t10;
    }

    @Override // kotlinx.serialization.d0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void serialize(@NotNull Encoder encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(encoder instanceof androidx.savedstate.serialization.m)) {
            throw new IllegalArgumentException(a.b(this.f75242a.getSerialName(), encoder).toString());
        }
        androidx.savedstate.serialization.m mVar = (androidx.savedstate.serialization.m) encoder;
        androidx.savedstate.n.A(androidx.savedstate.n.c(mVar.t()), mVar.s(), value);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return this.f75242a;
    }
}
