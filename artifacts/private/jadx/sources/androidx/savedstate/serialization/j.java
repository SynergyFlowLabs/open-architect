package androidx.savedstate.serialization;

import android.os.Bundle;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSavedStateDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateDecoder.kt\nandroidx/savedstate/serialization/SavedStateDecoder\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,215:1\n90#2:216\n90#2:217\n90#2:218\n90#2:219\n90#2:220\n90#2:221\n90#2:222\n90#2:223\n90#2:224\n90#2:225\n90#2:226\n90#2:227\n90#2:228\n90#2:229\n90#2:230\n90#2:231\n90#2:232\n90#2:233\n90#2:234\n90#2:235\n90#2:236\n90#2:237\n90#2:238\n*S KotlinDebug\n*F\n+ 1 SavedStateDecoder.kt\nandroidx/savedstate/serialization/SavedStateDecoder\n*L\n92#1:216\n116#1:217\n118#1:218\n120#1:219\n122#1:220\n124#1:221\n126#1:222\n128#1:223\n130#1:224\n132#1:225\n134#1:226\n137#1:227\n141#1:228\n145#1:229\n149#1:230\n153#1:231\n157#1:232\n161#1:233\n165#1:234\n169#1:235\n177#1:236\n184#1:237\n100#1:238\n*E\n"})
public final class j extends kotlinx.serialization.encoding.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Bundle f75202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final h f75203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private String f75204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f75205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final kotlinx.serialization.modules.f f75206h;

    public j(@NotNull Bundle savedState, @NotNull h configuration) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f75202d = savedState;
        this.f75203e = configuration;
        this.f75204f = "";
        this.f75206h = configuration.c();
    }

    private final boolean[] j() {
        return androidx.savedstate.f.l(androidx.savedstate.f.b(this.f75202d), this.f75204f);
    }

    private final char[] k() {
        return androidx.savedstate.f.p(androidx.savedstate.f.b(this.f75202d), this.f75204f);
    }

    private final double[] l() {
        return androidx.savedstate.f.z(androidx.savedstate.f.b(this.f75202d), this.f75204f);
    }

    private static final boolean m(SerialDescriptor serialDescriptor, int i10) {
        return serialDescriptor.isElementOptional(i10);
    }

    private static final boolean n(j jVar, SerialDescriptor serialDescriptor, int i10) {
        return androidx.savedstate.f.c(androidx.savedstate.f.b(jVar.f75202d), serialDescriptor.getElementName(i10));
    }

    private final float[] o() {
        return androidx.savedstate.f.D(androidx.savedstate.f.b(this.f75202d), this.f75204f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T p(kotlinx.serialization.e<? extends T> eVar) {
        T t10 = (T) l.a(this, eVar);
        if (t10 != null) {
            return t10;
        }
        SerialDescriptor descriptor = eVar.getDescriptor();
        if (Intrinsics.areEqual(descriptor, d.f())) {
            return (T) r();
        }
        if (Intrinsics.areEqual(descriptor, d.j())) {
            return (T) u();
        }
        if (Intrinsics.areEqual(descriptor, d.a())) {
            return (T) j();
        }
        if (Intrinsics.areEqual(descriptor, d.b())) {
            return (T) k();
        }
        if (Intrinsics.areEqual(descriptor, d.c())) {
            return (T) l();
        }
        if (Intrinsics.areEqual(descriptor, d.d())) {
            return (T) o();
        }
        if (Intrinsics.areEqual(descriptor, d.e())) {
            return (T) q();
        }
        if (Intrinsics.areEqual(descriptor, d.g())) {
            return (T) s();
        }
        if (Intrinsics.areEqual(descriptor, d.h())) {
            return (T) t();
        }
        return null;
    }

    private final int[] q() {
        return androidx.savedstate.f.H(androidx.savedstate.f.b(this.f75202d), this.f75204f);
    }

    private final List<Integer> r() {
        return androidx.savedstate.f.J(androidx.savedstate.f.b(this.f75202d), this.f75204f);
    }

    private final long[] s() {
        return androidx.savedstate.f.R(androidx.savedstate.f.b(this.f75202d), this.f75204f);
    }

    private final String[] t() {
        return androidx.savedstate.f.v0(androidx.savedstate.f.b(this.f75202d), this.f75204f);
    }

    private final List<String> u() {
        return androidx.savedstate.f.x0(androidx.savedstate.f.b(this.f75202d), this.f75204f);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    @NotNull
    public kotlinx.serialization.encoding.d beginStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return Intrinsics.areEqual(this.f75204f, "") ? this : new j(androidx.savedstate.f.g0(androidx.savedstate.f.b(this.f75202d), this.f75204f), this.f75203e);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public boolean decodeBoolean() {
        return androidx.savedstate.f.k(androidx.savedstate.f.b(this.f75202d), this.f75204f);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public byte decodeByte() {
        return (byte) androidx.savedstate.f.G(androidx.savedstate.f.b(this.f75202d), this.f75204f);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public char decodeChar() {
        return androidx.savedstate.f.o(androidx.savedstate.f.b(this.f75202d), this.f75204f);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public double decodeDouble() {
        return androidx.savedstate.f.y(androidx.savedstate.f.b(this.f75202d), this.f75204f);
    }

    @Override // kotlinx.serialization.encoding.d
    public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int iD0 = (Intrinsics.areEqual(descriptor.getKind(), kotlinx.serialization.descriptors.m.b.f315862a) || Intrinsics.areEqual(descriptor.getKind(), kotlinx.serialization.descriptors.m.c.f315863a)) ? androidx.savedstate.f.D0(androidx.savedstate.f.b(this.f75202d)) : descriptor.getElementsCount();
        while (true) {
            int i10 = this.f75205g;
            if (i10 >= iD0 || !m(descriptor, i10) || n(this, descriptor, this.f75205g)) {
                break;
            }
            this.f75205g++;
        }
        int i11 = this.f75205g;
        if (i11 >= iD0) {
            return -1;
        }
        this.f75204f = descriptor.getElementName(i11);
        int i12 = this.f75205g;
        this.f75205g = i12 + 1;
        return i12;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public int decodeEnum(@NotNull SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return androidx.savedstate.f.G(androidx.savedstate.f.b(this.f75202d), this.f75204f);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public float decodeFloat() {
        return androidx.savedstate.f.C(androidx.savedstate.f.b(this.f75202d), this.f75204f);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        return androidx.savedstate.f.G(androidx.savedstate.f.b(this.f75202d), this.f75204f);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public long decodeLong() {
        return androidx.savedstate.f.Q(androidx.savedstate.f.b(this.f75202d), this.f75204f);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return !androidx.savedstate.f.C0(androidx.savedstate.f.b(this.f75202d), this.f75204f);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public <T> T decodeSerializableValue(@NotNull kotlinx.serialization.e<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        T t10 = (T) p(deserializer);
        return t10 == null ? (T) super.decodeSerializableValue(deserializer) : t10;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    public short decodeShort() {
        return (short) androidx.savedstate.f.G(androidx.savedstate.f.b(this.f75202d), this.f75204f);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.Decoder
    @NotNull
    public String decodeString() {
        return androidx.savedstate.f.u0(androidx.savedstate.f.b(this.f75202d), this.f75204f);
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.d
    @NotNull
    public kotlinx.serialization.modules.f getSerializersModule() {
        return this.f75206h;
    }

    @NotNull
    public final String v() {
        return this.f75204f;
    }

    @NotNull
    public final Bundle w() {
        return this.f75202d;
    }
}
