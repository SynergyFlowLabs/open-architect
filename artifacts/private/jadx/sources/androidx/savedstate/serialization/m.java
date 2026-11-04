package androidx.savedstate.serialization;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.d0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSavedStateEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateEncoder.kt\nandroidx/savedstate/serialization/SavedStateEncoder\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,281:1\n90#2:282\n90#2:283\n106#2:284\n106#2:285\n106#2:286\n106#2:287\n106#2:288\n106#2:289\n106#2:290\n106#2:291\n106#2:292\n106#2:293\n106#2:294\n106#2:295\n106#2:296\n106#2:297\n106#2:298\n106#2:299\n106#2:300\n106#2:301\n106#2:302\n106#2:303\n106#2:324\n106#2:326\n90#2:327\n106#2:328\n27#3:304\n46#3:305\n32#3,4:306\n31#3,7:316\n126#4:310\n153#4,3:311\n37#5,2:314\n1#6:323\n46#7:325\n*S KotlinDebug\n*F\n+ 1 SavedStateEncoder.kt\nandroidx/savedstate/serialization/SavedStateEncoder\n*L\n108#1:282\n111#1:283\n122#1:284\n126#1:285\n130#1:286\n134#1:287\n138#1:288\n142#1:289\n146#1:290\n150#1:291\n154#1:292\n158#1:293\n162#1:294\n166#1:295\n170#1:296\n174#1:297\n178#1:298\n182#1:299\n186#1:300\n190#1:301\n194#1:302\n198#1:303\n211#1:324\n212#1:326\n229#1:327\n234#1:328\n211#1:304\n211#1:305\n211#1:306,4\n211#1:316,7\n211#1:310\n211#1:311,3\n211#1:314,2\n211#1:323\n211#1:325\n*E\n"})
public final class m extends kotlinx.serialization.encoding.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Bundle f75207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h f75208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f75209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlinx.serialization.modules.f f75210d;

    public m(@NotNull Bundle savedState, @NotNull h configuration) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f75207a = savedState;
        this.f75208b = configuration;
        this.f75209c = "";
        this.f75210d = configuration.c();
    }

    private final void h(Bundle bundle, String str) {
        if (this.f75208b.a() == 1) {
            boolean zC = androidx.savedstate.f.c(androidx.savedstate.f.b(bundle), "type");
            boolean zAreEqual = Intrinsics.areEqual(str, "type");
            if (zC && zAreEqual) {
                throw new IllegalArgumentException("SavedStateEncoder for " + androidx.savedstate.f.u0(androidx.savedstate.f.b(bundle), "type") + " has property '" + str + "' that conflicts with the class discriminator. You can rename a property with @SerialName annotation.");
            }
        }
    }

    private final void i(boolean[] zArr) {
        androidx.savedstate.n.j(androidx.savedstate.n.c(this.f75207a), this.f75209c, zArr);
    }

    private final void j(char[] cArr) {
        androidx.savedstate.n.l(androidx.savedstate.n.c(this.f75207a), this.f75209c, cArr);
    }

    private final void k(double[] dArr) {
        androidx.savedstate.n.q(androidx.savedstate.n.c(this.f75207a), this.f75209c, dArr);
    }

    private final void l(float[] fArr) {
        androidx.savedstate.n.s(androidx.savedstate.n.c(this.f75207a), this.f75209c, fArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> boolean m(d0<? super T> d0Var, T t10) {
        if (!o.a(this, d0Var, t10)) {
            SerialDescriptor descriptor = d0Var.getDescriptor();
            if (Intrinsics.areEqual(descriptor, d.f())) {
                Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
                o((List) t10);
            } else if (Intrinsics.areEqual(descriptor, d.j())) {
                Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                r((List) t10);
            } else if (Intrinsics.areEqual(descriptor, d.a())) {
                Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type kotlin.BooleanArray");
                i((boolean[]) t10);
            } else if (Intrinsics.areEqual(descriptor, d.b())) {
                Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type kotlin.CharArray");
                j((char[]) t10);
            } else if (Intrinsics.areEqual(descriptor, d.c())) {
                Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type kotlin.DoubleArray");
                k((double[]) t10);
            } else if (Intrinsics.areEqual(descriptor, d.d())) {
                Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type kotlin.FloatArray");
                l((float[]) t10);
            } else if (Intrinsics.areEqual(descriptor, d.e())) {
                Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type kotlin.IntArray");
                n((int[]) t10);
            } else if (Intrinsics.areEqual(descriptor, d.g())) {
                Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type kotlin.LongArray");
                p((long[]) t10);
            } else {
                if (!Intrinsics.areEqual(descriptor, d.h())) {
                    return false;
                }
                Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                q((String[]) t10);
            }
        }
        return true;
    }

    private final void n(int[] iArr) {
        androidx.savedstate.n.u(androidx.savedstate.n.c(this.f75207a), this.f75209c, iArr);
    }

    private final void o(List<Integer> list) {
        androidx.savedstate.n.v(androidx.savedstate.n.c(this.f75207a), this.f75209c, list);
    }

    private final void p(long[] jArr) {
        androidx.savedstate.n.y(androidx.savedstate.n.c(this.f75207a), this.f75209c, jArr);
    }

    private final void q(String[] strArr) {
        androidx.savedstate.n.K(androidx.savedstate.n.c(this.f75207a), this.f75209c, strArr);
    }

    private final void r(List<String> list) {
        androidx.savedstate.n.L(androidx.savedstate.n.c(this.f75207a), this.f75209c, list);
    }

    private final void u(h hVar, SerialDescriptor serialDescriptor, Bundle bundle) {
        if (hVar.a() == 1 && !androidx.savedstate.f.c(androidx.savedstate.f.b(bundle), "type")) {
            if (Intrinsics.areEqual(serialDescriptor.getKind(), kotlinx.serialization.descriptors.m.a.f315861a) || Intrinsics.areEqual(serialDescriptor.getKind(), kotlinx.serialization.descriptors.m.d.f315864a)) {
                androidx.savedstate.n.J(androidx.savedstate.n.c(bundle), "type", serialDescriptor.getSerialName());
            }
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    @NotNull
    public kotlinx.serialization.encoding.e beginStructure(@NotNull SerialDescriptor descriptor) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (Intrinsics.areEqual(this.f75209c, "")) {
            u(this.f75208b, descriptor, this.f75207a);
            return this;
        }
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        androidx.savedstate.n.c(bundleB);
        androidx.savedstate.n.D(androidx.savedstate.n.c(this.f75207a), this.f75209c, bundleB);
        u(this.f75208b, descriptor, bundleB);
        return new m(bundleB, this.f75208b);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void encodeBoolean(boolean z10) {
        androidx.savedstate.n.i(androidx.savedstate.n.c(this.f75207a), this.f75209c, z10);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void encodeByte(byte b10) {
        androidx.savedstate.n.t(androidx.savedstate.n.c(this.f75207a), this.f75209c, b10);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void encodeChar(char c10) {
        androidx.savedstate.n.k(androidx.savedstate.n.c(this.f75207a), this.f75209c, c10);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void encodeDouble(double d10) {
        androidx.savedstate.n.p(androidx.savedstate.n.c(this.f75207a), this.f75209c, d10);
    }

    @Override // kotlinx.serialization.encoding.b
    public boolean encodeElement(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String elementName = descriptor.getElementName(i10);
        this.f75209c = elementName;
        h(this.f75207a, elementName);
        return true;
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void encodeEnum(@NotNull SerialDescriptor enumDescriptor, int i10) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        androidx.savedstate.n.t(androidx.savedstate.n.c(this.f75207a), this.f75209c, i10);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void encodeFloat(float f10) {
        androidx.savedstate.n.r(androidx.savedstate.n.c(this.f75207a), this.f75209c, f10);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void encodeInt(int i10) {
        androidx.savedstate.n.t(androidx.savedstate.n.c(this.f75207a), this.f75209c, i10);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void encodeLong(long j10) {
        androidx.savedstate.n.x(androidx.savedstate.n.c(this.f75207a), this.f75209c, j10);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        androidx.savedstate.n.z(androidx.savedstate.n.c(this.f75207a), this.f75209c);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public <T> void encodeSerializableValue(@NotNull d0<? super T> serializer, T t10) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (!m(serializer, t10)) {
            super.encodeSerializableValue(serializer, t10);
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void encodeShort(short s10) {
        androidx.savedstate.n.t(androidx.savedstate.n.c(this.f75207a), this.f75209c, s10);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public void encodeString(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        androidx.savedstate.n.J(androidx.savedstate.n.c(this.f75207a), this.f75209c, value);
    }

    @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.e
    @NotNull
    public kotlinx.serialization.modules.f getSerializersModule() {
        return this.f75210d;
    }

    @NotNull
    public final String s() {
        return this.f75209c;
    }

    @Override // kotlinx.serialization.encoding.e
    public boolean shouldEncodeElementDefault(@NotNull SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.f75208b.b();
    }

    @NotNull
    public final Bundle t() {
        return this.f75207a;
    }
}
