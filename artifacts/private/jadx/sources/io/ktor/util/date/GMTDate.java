package io.ktor.util.date;

import io.ktor.util.date.GMTDate;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.n;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.e;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.k1;
import kotlinx.serialization.internal.l0;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.t0;
import ni.h;
import ni.i;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@b0
public final class GMTDate implements Comparable<GMTDate> {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @f
    @NotNull
    private static final f0<KSerializer<Object>>[] f296561j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final GMTDate f296562k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f296563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f296564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f296565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final i f296566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f296567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f296568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final h f296569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f296570h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f296571i;

    @l(level = n.HIDDEN, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class a implements p0<GMTDate> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f296572a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f296572a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.ktor.util.date.GMTDate", aVar, 9);
            pluginGeneratedSerialDescriptor.i("seconds", false);
            pluginGeneratedSerialDescriptor.i("minutes", false);
            pluginGeneratedSerialDescriptor.i("hours", false);
            pluginGeneratedSerialDescriptor.i("dayOfWeek", false);
            pluginGeneratedSerialDescriptor.i("dayOfMonth", false);
            pluginGeneratedSerialDescriptor.i("dayOfYear", false);
            pluginGeneratedSerialDescriptor.i("month", false);
            pluginGeneratedSerialDescriptor.i("year", false);
            pluginGeneratedSerialDescriptor.i("timestamp", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.e
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GMTDate deserialize(@NotNull Decoder decoder) {
            int iDecodeIntElement;
            h hVar;
            i iVar;
            int iDecodeIntElement2;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            long jDecodeLongElement;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            f0[] f0VarArr = GMTDate.f296561j;
            int i15 = 7;
            if (dVarBeginStructure.c()) {
                iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 0);
                int iDecodeIntElement3 = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
                int iDecodeIntElement4 = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
                i iVar2 = (i) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (e) f0VarArr[3].getValue(), null);
                int iDecodeIntElement5 = dVarBeginStructure.decodeIntElement(serialDescriptor, 4);
                int iDecodeIntElement6 = dVarBeginStructure.decodeIntElement(serialDescriptor, 5);
                hVar = (h) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (e) f0VarArr[6].getValue(), null);
                iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 7);
                i10 = iDecodeIntElement6;
                i11 = 511;
                i12 = iDecodeIntElement5;
                i13 = iDecodeIntElement4;
                iVar = iVar2;
                i14 = iDecodeIntElement3;
                jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 8);
            } else {
                boolean z10 = true;
                iDecodeIntElement = 0;
                int iDecodeIntElement7 = 0;
                int iDecodeIntElement8 = 0;
                int iDecodeIntElement9 = 0;
                h hVar2 = null;
                long jDecodeLongElement2 = 0;
                int iDecodeIntElement10 = 0;
                int iDecodeIntElement11 = 0;
                int i16 = 0;
                i iVar3 = null;
                while (z10) {
                    int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z10 = false;
                            break;
                        case 0:
                            i16 |= 1;
                            iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 0);
                            i15 = 7;
                            break;
                        case 1:
                            iDecodeIntElement9 = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
                            i16 |= 2;
                            i15 = 7;
                            break;
                        case 2:
                            iDecodeIntElement8 = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
                            i16 |= 4;
                            break;
                        case 3:
                            iVar3 = (i) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (e) f0VarArr[3].getValue(), iVar3);
                            i16 |= 8;
                            break;
                        case 4:
                            iDecodeIntElement7 = dVarBeginStructure.decodeIntElement(serialDescriptor, 4);
                            i16 |= 16;
                            break;
                        case 5:
                            iDecodeIntElement11 = dVarBeginStructure.decodeIntElement(serialDescriptor, 5);
                            i16 |= 32;
                            break;
                        case 6:
                            hVar2 = (h) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (e) f0VarArr[6].getValue(), hVar2);
                            i16 |= 64;
                            break;
                        case 7:
                            iDecodeIntElement10 = dVarBeginStructure.decodeIntElement(serialDescriptor, i15);
                            i16 |= 128;
                            break;
                        case 8:
                            jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 8);
                            i16 |= 256;
                            break;
                        default:
                            throw new t0(iDecodeElementIndex);
                    }
                }
                hVar = hVar2;
                iVar = iVar3;
                iDecodeIntElement2 = iDecodeIntElement10;
                i10 = iDecodeIntElement11;
                i11 = i16;
                i12 = iDecodeIntElement7;
                i13 = iDecodeIntElement8;
                i14 = iDecodeIntElement9;
                jDecodeLongElement = jDecodeLongElement2;
            }
            int i17 = iDecodeIntElement;
            dVarBeginStructure.endStructure(serialDescriptor);
            return new GMTDate(i11, i17, i14, i13, iVar, i12, i10, hVar, iDecodeIntElement2, jDecodeLongElement, null);
        }

        @Override // kotlinx.serialization.d0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull GMTDate value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
            GMTDate.Y(value, eVarBeginStructure, serialDescriptor);
            eVarBeginStructure.endStructure(serialDescriptor);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.serialization.internal.p0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            f0[] f0VarArr = GMTDate.f296561j;
            y0 y0Var = y0.f316055a;
            return new KSerializer[]{y0Var, y0Var, y0Var, f0VarArr[3].getValue(), y0Var, y0Var, f0VarArr[6].getValue(), y0Var, k1.f315958a};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final GMTDate a() {
            return GMTDate.f296562k;
        }

        @NotNull
        public final KSerializer<GMTDate> serializer() {
            return a.f296572a;
        }

        private b() {
        }
    }

    static {
        j0 j0Var = j0.PUBLICATION;
        f296561j = new f0[]{null, null, null, g0.b(j0Var, new Function0() { // from class: ni.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GMTDate.n();
            }
        }), null, null, g0.b(j0Var, new Function0() { // from class: ni.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GMTDate.o();
            }
        }), null, null};
        f296562k = ni.a.b(0L);
    }

    public /* synthetic */ GMTDate(int i10, int i11, int i12, int i13, i iVar, int i14, int i15, h hVar, int i16, long j10, v2 v2Var) {
        if (511 != (i10 & 511)) {
            g2.b(i10, 511, a.f296572a.getDescriptor());
        }
        this.f296563a = i11;
        this.f296564b = i12;
        this.f296565c = i13;
        this.f296566d = iVar;
        this.f296567e = i14;
        this.f296568f = i15;
        this.f296569g = hVar;
        this.f296570h = i16;
        this.f296571i = j10;
    }

    public static /* synthetic */ GMTDate M(GMTDate gMTDate, int i10, int i11, int i12, i iVar, int i13, int i14, h hVar, int i15, long j10, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i10 = gMTDate.f296563a;
        }
        if ((i16 & 2) != 0) {
            i11 = gMTDate.f296564b;
        }
        if ((i16 & 4) != 0) {
            i12 = gMTDate.f296565c;
        }
        if ((i16 & 8) != 0) {
            iVar = gMTDate.f296566d;
        }
        if ((i16 & 16) != 0) {
            i13 = gMTDate.f296567e;
        }
        if ((i16 & 32) != 0) {
            i14 = gMTDate.f296568f;
        }
        if ((i16 & 64) != 0) {
            hVar = gMTDate.f296569g;
        }
        if ((i16 & 128) != 0) {
            i15 = gMTDate.f296570h;
        }
        if ((i16 & 256) != 0) {
            j10 = gMTDate.f296571i;
        }
        long j11 = j10;
        h hVar2 = hVar;
        int i17 = i15;
        int i18 = i13;
        int i19 = i14;
        return gMTDate.L(i10, i11, i12, iVar, i18, i19, hVar2, i17, j11);
    }

    @oj.n
    public static final /* synthetic */ void Y(GMTDate gMTDate, kotlinx.serialization.encoding.e eVar, SerialDescriptor serialDescriptor) {
        f0<KSerializer<Object>>[] f0VarArr = f296561j;
        eVar.encodeIntElement(serialDescriptor, 0, gMTDate.f296563a);
        eVar.encodeIntElement(serialDescriptor, 1, gMTDate.f296564b);
        int i10 = 4 & 2;
        eVar.encodeIntElement(serialDescriptor, 2, gMTDate.f296565c);
        eVar.encodeSerializableElement(serialDescriptor, 3, f0VarArr[3].getValue(), gMTDate.f296566d);
        eVar.encodeIntElement(serialDescriptor, 4, gMTDate.f296567e);
        eVar.encodeIntElement(serialDescriptor, 5, gMTDate.f296568f);
        eVar.encodeSerializableElement(serialDescriptor, 6, f0VarArr[6].getValue(), gMTDate.f296569g);
        eVar.encodeIntElement(serialDescriptor, 7, gMTDate.f296570h);
        eVar.encodeLongElement(serialDescriptor, 8, gMTDate.f296571i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer n() {
        return l0.c("io.ktor.util.date.WeekDay", i.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer o() {
        return l0.c("io.ktor.util.date.Month", h.values());
    }

    @NotNull
    public final h D() {
        return this.f296569g;
    }

    public final int E() {
        return this.f296570h;
    }

    public final long H() {
        return this.f296571i;
    }

    @NotNull
    public final GMTDate I() {
        return ni.a.c(null, 1, null);
    }

    @NotNull
    public final GMTDate L(int i10, int i11, int i12, @NotNull i dayOfWeek, int i13, int i14, @NotNull h month, int i15, long j10) {
        Intrinsics.checkNotNullParameter(dayOfWeek, "dayOfWeek");
        Intrinsics.checkNotNullParameter(month, "month");
        return new GMTDate(i10, i11, i12, dayOfWeek, i13, i14, month, i15, j10);
    }

    public final int N() {
        return this.f296567e;
    }

    @NotNull
    public final i O() {
        return this.f296566d;
    }

    public final int R() {
        return this.f296568f;
    }

    public final int S() {
        return this.f296565c;
    }

    public final int T() {
        return this.f296564b;
    }

    @NotNull
    public final h U() {
        return this.f296569g;
    }

    public final int V() {
        return this.f296563a;
    }

    public final long W() {
        return this.f296571i;
    }

    public final int X() {
        return this.f296570h;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GMTDate)) {
            return false;
        }
        GMTDate gMTDate = (GMTDate) obj;
        if (this.f296563a == gMTDate.f296563a && this.f296564b == gMTDate.f296564b && this.f296565c == gMTDate.f296565c && this.f296566d == gMTDate.f296566d && this.f296567e == gMTDate.f296567e && this.f296568f == gMTDate.f296568f && this.f296569g == gMTDate.f296569g && this.f296570h == gMTDate.f296570h && this.f296571i == gMTDate.f296571i) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.f296563a) * 31) + Integer.hashCode(this.f296564b)) * 31) + Integer.hashCode(this.f296565c)) * 31) + this.f296566d.hashCode()) * 31) + Integer.hashCode(this.f296567e)) * 31) + Integer.hashCode(this.f296568f)) * 31) + this.f296569g.hashCode()) * 31) + Integer.hashCode(this.f296570h)) * 31) + Long.hashCode(this.f296571i);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull GMTDate other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.compare(this.f296571i, other.f296571i);
    }

    public final int s() {
        return this.f296563a;
    }

    public final int t() {
        return this.f296564b;
    }

    @NotNull
    public String toString() {
        return "GMTDate(seconds=" + this.f296563a + ", minutes=" + this.f296564b + ", hours=" + this.f296565c + ", dayOfWeek=" + this.f296566d + ", dayOfMonth=" + this.f296567e + ", dayOfYear=" + this.f296568f + ", month=" + this.f296569g + ", year=" + this.f296570h + ", timestamp=" + this.f296571i + ')';
    }

    public final int v() {
        return this.f296565c;
    }

    @NotNull
    public final i w() {
        return this.f296566d;
    }

    public final int x() {
        return this.f296567e;
    }

    public final int z() {
        return this.f296568f;
    }

    public GMTDate(int i10, int i11, int i12, @NotNull i dayOfWeek, int i13, int i14, @NotNull h month, int i15, long j10) {
        Intrinsics.checkNotNullParameter(dayOfWeek, "dayOfWeek");
        Intrinsics.checkNotNullParameter(month, "month");
        this.f296563a = i10;
        this.f296564b = i11;
        this.f296565c = i12;
        this.f296566d = dayOfWeek;
        this.f296567e = i13;
        this.f296568f = i14;
        this.f296569g = month;
        this.f296570h = i15;
        this.f296571i = j10;
    }
}
