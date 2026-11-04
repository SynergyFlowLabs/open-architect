package androidx.savedstate.serialization.serializers;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBuiltInSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInSerializer.kt\nandroidx/savedstate/serialization/serializers/SavedStateSerializer\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,87:1\n106#2:88\n106#2:89\n90#2:90\n*S KotlinDebug\n*F\n+ 1 BuiltInSerializer.kt\nandroidx/savedstate/serialization/serializers/SavedStateSerializer\n*L\n55#1:88\n57#1:89\n70#1:90\n*E\n"})
public final class n implements KSerializer<Bundle> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n f75243a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor f75244b = kotlinx.serialization.descriptors.k.f("androidx.savedstate.SavedState", new SerialDescriptor[0], null, 4, null);

    private n() {
    }

    @Override // kotlinx.serialization.e
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bundle deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(decoder instanceof androidx.savedstate.serialization.j)) {
            throw new IllegalArgumentException(a.a(f75243a.getDescriptor().getSerialName(), decoder).toString());
        }
        androidx.savedstate.serialization.j jVar = (androidx.savedstate.serialization.j) decoder;
        return Intrinsics.areEqual(jVar.v(), "") ? jVar.w() : androidx.savedstate.f.g0(androidx.savedstate.f.b(jVar.w()), jVar.v());
    }

    @Override // kotlinx.serialization.d0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull Bundle value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(encoder instanceof androidx.savedstate.serialization.m)) {
            throw new IllegalArgumentException(a.b(f75243a.getDescriptor().getSerialName(), encoder).toString());
        }
        androidx.savedstate.serialization.m mVar = (androidx.savedstate.serialization.m) encoder;
        if (Intrinsics.areEqual(mVar.s(), "")) {
            androidx.savedstate.n.g(androidx.savedstate.n.c(mVar.t()), value);
        } else {
            androidx.savedstate.n.D(androidx.savedstate.n.c(mVar.t()), mVar.s(), value);
        }
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f75244b;
    }
}
