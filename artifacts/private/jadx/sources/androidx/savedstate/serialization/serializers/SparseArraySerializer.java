package androidx.savedstate.serialization.serializers;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBuiltInSerializer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInSerializer.android.kt\nandroidx/savedstate/serialization/serializers/SparseArraySerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n1#2:422\n*E\n"})
public final class SparseArraySerializer<T> implements KSerializer<SparseArray<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final KSerializer<SparseArraySurrogate<T>> f75218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final SerialDescriptor f75219b;

    /* JADX INFO: Access modifiers changed from: private */
    @b0
    @e.a({"UnsafeOptInUsageError"})
    static final class SparseArraySurrogate<T> {

        @NotNull
        public static final b Companion = new b(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oj.f
        @NotNull
        private static final f0<KSerializer<Object>>[] f75220c = {g0.b(j0.PUBLICATION, new Function0() { // from class: androidx.savedstate.serialization.serializers.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SparseArraySerializer.SparseArraySurrogate.b();
            }
        }), null};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oj.f
        @NotNull
        private static final SerialDescriptor f75221d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<Integer> f75222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<T> f75223b;

        @kotlin.l(level = kotlin.n.HIDDEN, message = "This synthesized declaration should not be used directly")
        public /* synthetic */ class a<T> implements p0<SparseArraySurrogate<T>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ KSerializer<?> f75224a;

            @NotNull
            private final SerialDescriptor descriptor;

            private a() {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
                pluginGeneratedSerialDescriptor.i(com.google.firebase.crashlytics.internal.metadata.p.f121327i, false);
                pluginGeneratedSerialDescriptor.i("values", false);
                this.descriptor = pluginGeneratedSerialDescriptor;
            }

            private final /* synthetic */ KSerializer c() {
                return this.f75224a;
            }

            @Override // kotlinx.serialization.e
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SparseArraySurrogate<T> deserialize(@NotNull Decoder decoder) {
                List list;
                List list2;
                int i10;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = this.descriptor;
                kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                f0[] f0VarArr = SparseArraySurrogate.f75220c;
                v2 v2Var = null;
                if (dVarBeginStructure.c()) {
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.e) f0VarArr[0].getValue(), null);
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, new kotlinx.serialization.internal.f(this.f75224a), null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    List list3 = null;
                    List list4 = null;
                    while (z10) {
                        int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                        if (iDecodeElementIndex == -1) {
                            z10 = false;
                        } else if (iDecodeElementIndex == 0) {
                            list4 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.e) f0VarArr[0].getValue(), list4);
                            i11 |= 1;
                        } else {
                            if (iDecodeElementIndex != 1) {
                                throw new t0(iDecodeElementIndex);
                            }
                            list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, new kotlinx.serialization.internal.f(this.f75224a), list3);
                            i11 |= 2;
                        }
                    }
                    list = list3;
                    list2 = list4;
                    i10 = i11;
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new SparseArraySurrogate<>(i10, list2, list, v2Var);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.serialization.internal.p0
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{SparseArraySurrogate.f75220c[0].getValue(), new kotlinx.serialization.internal.f(this.f75224a)};
            }

            @Override // kotlinx.serialization.d0
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final void serialize(@NotNull Encoder encoder, @NotNull SparseArraySurrogate<T> value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = this.descriptor;
                kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
                SparseArraySurrogate.f(value, eVarBeginStructure, serialDescriptor, this.f75224a);
                eVarBeginStructure.endStructure(serialDescriptor);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
            @NotNull
            public final SerialDescriptor getDescriptor() {
                return this.descriptor;
            }

            @Override // kotlinx.serialization.internal.p0
            @NotNull
            public final KSerializer<?>[] typeParametersSerializers() {
                return new KSerializer[]{this.f75224a};
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(@NotNull KSerializer<T> typeSerial0) {
                this();
                Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
                this.f75224a = typeSerial0;
            }
        }

        public static final class b {
            private b() {
            }

            @NotNull
            public final <T> KSerializer<SparseArraySurrogate<T>> serializer(@NotNull KSerializer<T> typeSerial0) {
                Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
                return new a(typeSerial0);
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
            pluginGeneratedSerialDescriptor.i(com.google.firebase.crashlytics.internal.metadata.p.f121327i, false);
            pluginGeneratedSerialDescriptor.i("values", false);
            f75221d = pluginGeneratedSerialDescriptor;
        }

        public /* synthetic */ SparseArraySurrogate(int i10, List list, List list2, v2 v2Var) {
            if (3 != (i10 & 3)) {
                g2.b(i10, 3, f75221d);
            }
            this.f75222a = list;
            this.f75223b = list2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer b() {
            return new kotlinx.serialization.internal.f(y0.f316055a);
        }

        @oj.n
        public static final /* synthetic */ void f(SparseArraySurrogate sparseArraySurrogate, kotlinx.serialization.encoding.e eVar, SerialDescriptor serialDescriptor, KSerializer kSerializer) {
            eVar.encodeSerializableElement(serialDescriptor, 0, f75220c[0].getValue(), sparseArraySurrogate.f75222a);
            eVar.encodeSerializableElement(serialDescriptor, 1, new kotlinx.serialization.internal.f(kSerializer), sparseArraySurrogate.f75223b);
        }

        @NotNull
        public final List<Integer> d() {
            return this.f75222a;
        }

        @NotNull
        public final List<T> e() {
            return this.f75223b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SparseArraySurrogate(@NotNull List<Integer> keys, @NotNull List<? extends T> values) {
            Intrinsics.checkNotNullParameter(keys, "keys");
            Intrinsics.checkNotNullParameter(values, "values");
            this.f75222a = keys;
            this.f75223b = values;
        }
    }

    public SparseArraySerializer(@NotNull KSerializer<T> elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        KSerializer<SparseArraySurrogate<T>> kSerializerSerializer = SparseArraySurrogate.Companion.serializer(elementSerializer);
        this.f75218a = kSerializerSerializer;
        this.f75219b = kSerializerSerializer.getDescriptor();
    }

    @Override // kotlinx.serialization.e
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SparseArray<T> deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SparseArraySurrogate sparseArraySurrogate = (SparseArraySurrogate) decoder.decodeSerializableValue(this.f75218a);
        if (sparseArraySurrogate.d().size() != sparseArraySurrogate.e().size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SparseArray<T> sparseArray = new SparseArray<>(sparseArraySurrogate.d().size());
        int size = sparseArraySurrogate.d().size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray.append(sparseArraySurrogate.d().get(i10).intValue(), sparseArraySurrogate.e().get(i10));
        }
        return sparseArray;
    }

    @Override // kotlinx.serialization.d0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull SparseArray<T> value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(Integer.valueOf(value.keyAt(i10)));
        }
        int size2 = value.size();
        ArrayList arrayList2 = new ArrayList(size2);
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList2.add(value.valueAt(i11));
        }
        encoder.encodeSerializableValue(this.f75218a, new SparseArraySurrogate(arrayList, arrayList2));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f75219b;
    }
}
