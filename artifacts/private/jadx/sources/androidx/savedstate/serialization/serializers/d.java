package androidx.savedstate.serialization.serializers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBuiltInSerializer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInSerializer.android.kt\nandroidx/savedstate/serialization/serializers/CharSequenceSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,421:1\n1#2:422\n106#3:423\n90#3:424\n*S KotlinDebug\n*F\n+ 1 BuiltInSerializer.android.kt\nandroidx/savedstate/serialization/serializers/CharSequenceSerializer\n*L\n118#1:423\n125#1:424\n*E\n"})
public final class d implements KSerializer<CharSequence> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f75229a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor f75230b = kotlinx.serialization.descriptors.k.f("kotlin.CharSequence", new SerialDescriptor[0], null, 4, null);

    private d() {
    }

    @Override // kotlinx.serialization.e
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CharSequence deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(decoder instanceof androidx.savedstate.serialization.j)) {
            throw new IllegalArgumentException(a.a(f75229a.getDescriptor().getSerialName(), decoder).toString());
        }
        androidx.savedstate.serialization.j jVar = (androidx.savedstate.serialization.j) decoder;
        return androidx.savedstate.f.s(androidx.savedstate.f.b(jVar.w()), jVar.v());
    }

    @Override // kotlinx.serialization.d0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(encoder instanceof androidx.savedstate.serialization.m)) {
            throw new IllegalArgumentException(a.b(f75229a.getDescriptor().getSerialName(), encoder).toString());
        }
        androidx.savedstate.serialization.m mVar = (androidx.savedstate.serialization.m) encoder;
        androidx.savedstate.n.m(androidx.savedstate.n.c(mVar.t()), mVar.s(), value);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f75230b;
    }
}
