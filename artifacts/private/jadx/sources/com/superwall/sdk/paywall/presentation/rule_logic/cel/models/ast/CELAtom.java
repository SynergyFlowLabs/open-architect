package com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast;

import com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELAtom;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlin.reflect.d;
import kotlin.y1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.k;
import kotlinx.serialization.internal.s3;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.z1;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kotlinx.serialization.v;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
@a0("CELAtom")
public abstract class CELAtom implements ToExprString {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: cg.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CELAtom._init_$_anonymous_();
        }
    });

    @b0
    @a0("Bool")
    public static final class Bool extends CELAtom {

        @NotNull
        public static final Companion Companion = new Companion(null);
        private final boolean value;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Bool> serializer() {
                return CELAtom$Bool$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Bool(int i10, boolean z10, v2 v2Var) {
            super(i10, v2Var);
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, CELAtom$Bool$$serializer.INSTANCE.getDescriptor());
            }
            this.value = z10;
        }

        public static /* synthetic */ Bool copy$default(Bool bool, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = bool.value;
            }
            return bool.copy(z10);
        }

        @a0("value")
        public static /* synthetic */ void getValue$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Bool bool, e eVar, SerialDescriptor serialDescriptor) {
            CELAtom.write$Self(bool, eVar, serialDescriptor);
            eVar.encodeBooleanElement(serialDescriptor, 0, bool.value);
        }

        public final boolean component1() {
            return this.value;
        }

        @NotNull
        public final Bool copy(boolean z10) {
            return new Bool(z10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Bool) && this.value == ((Bool) obj).value;
        }

        public final boolean getValue() {
            return this.value;
        }

        public int hashCode() {
            return Boolean.hashCode(this.value);
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public java.lang.String toExprString() {
            return java.lang.String.valueOf(this.value);
        }

        @NotNull
        public java.lang.String toString() {
            return "Bool(value=" + this.value + ")";
        }

        public Bool(boolean z10) {
            super(null);
            this.value = z10;
        }
    }

    @b0
    @a0("Bytes")
    public static final class Bytes extends CELAtom {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final byte[] value;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Bytes> serializer() {
                return CELAtom$Bytes$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Bytes(int i10, byte[] bArr, v2 v2Var) {
            super(i10, v2Var);
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, CELAtom$Bytes$$serializer.INSTANCE.getDescriptor());
            }
            this.value = bArr;
        }

        public static /* synthetic */ Bytes copy$default(Bytes bytes, byte[] bArr, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bArr = bytes.value;
            }
            return bytes.copy(bArr);
        }

        @a0("value")
        public static /* synthetic */ void getValue$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence toExprString$lambda$0(byte b10) {
            java.lang.String str = java.lang.String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Bytes bytes, e eVar, SerialDescriptor serialDescriptor) {
            CELAtom.write$Self(bytes, eVar, serialDescriptor);
            eVar.encodeSerializableElement(serialDescriptor, 0, k.f315954c, bytes.value);
        }

        @NotNull
        public final byte[] component1() {
            return this.value;
        }

        @NotNull
        public final Bytes copy(@NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Bytes(value);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Intrinsics.areEqual(Bytes.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELAtom.Bytes");
            return Arrays.equals(this.value, ((Bytes) obj).value);
        }

        @NotNull
        public final byte[] getValue() {
            return this.value;
        }

        public int hashCode() {
            return Arrays.hashCode(this.value);
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public java.lang.String toExprString() {
            return "b\"" + ArraysKt.joinToString$default(this.value, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: cg.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CELAtom.Bytes.toExprString$lambda$0(((Byte) obj).byteValue());
                }
            }, 30, (Object) null) + "\"";
        }

        @NotNull
        public java.lang.String toString() {
            return "Bytes(value=" + Arrays.toString(this.value) + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Bytes(@NotNull byte[] value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) CELAtom.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<CELAtom> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @b0
    @a0("Float")
    public static final class Float extends CELAtom {

        @NotNull
        public static final Companion Companion = new Companion(null);
        private final double value;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Float> serializer() {
                return CELAtom$Float$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Float(int i10, double d10, v2 v2Var) {
            super(i10, v2Var);
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, CELAtom$Float$$serializer.INSTANCE.getDescriptor());
            }
            this.value = d10;
        }

        public static /* synthetic */ Float copy$default(Float r10, double d10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d10 = r10.value;
            }
            return r10.copy(d10);
        }

        @a0("value")
        public static /* synthetic */ void getValue$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Float r10, e eVar, SerialDescriptor serialDescriptor) {
            CELAtom.write$Self(r10, eVar, serialDescriptor);
            eVar.encodeDoubleElement(serialDescriptor, 0, r10.value);
        }

        public final double component1() {
            return this.value;
        }

        @NotNull
        public final Float copy(double d10) {
            return new Float(d10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Float) && Double.compare(this.value, ((Float) obj).value) == 0;
        }

        public final double getValue() {
            return this.value;
        }

        public int hashCode() {
            return Double.hashCode(this.value);
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public java.lang.String toExprString() {
            return java.lang.String.valueOf(this.value);
        }

        @NotNull
        public java.lang.String toString() {
            return "Float(value=" + this.value + ")";
        }

        public Float(double d10) {
            super(null);
            this.value = d10;
        }
    }

    @b0
    @a0("Int")
    public static final class Int extends CELAtom {

        @NotNull
        public static final Companion Companion = new Companion(null);
        private final long value;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Int> serializer() {
                return CELAtom$Int$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Int(int i10, long j10, v2 v2Var) {
            super(i10, v2Var);
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, CELAtom$Int$$serializer.INSTANCE.getDescriptor());
            }
            this.value = j10;
        }

        public static /* synthetic */ Int copy$default(Int r10, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = r10.value;
            }
            return r10.copy(j10);
        }

        @a0("value")
        public static /* synthetic */ void getValue$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Int r10, e eVar, SerialDescriptor serialDescriptor) {
            CELAtom.write$Self(r10, eVar, serialDescriptor);
            eVar.encodeLongElement(serialDescriptor, 0, r10.value);
        }

        public final long component1() {
            return this.value;
        }

        @NotNull
        public final Int copy(long j10) {
            return new Int(j10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Int) && this.value == ((Int) obj).value;
        }

        public final long getValue() {
            return this.value;
        }

        public int hashCode() {
            return Long.hashCode(this.value);
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public java.lang.String toExprString() {
            return java.lang.String.valueOf(this.value);
        }

        @NotNull
        public java.lang.String toString() {
            return "Int(value=" + this.value + ")";
        }

        public Int(long j10) {
            super(null);
            this.value = j10;
        }
    }

    @b0
    @a0("Null")
    public static final class Null extends CELAtom {

        @NotNull
        public static final Null INSTANCE = new Null();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: cg.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CELAtom.Null._init_$_anonymous_();
            }
        });

        private Null() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("Null", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<Null> serializer() {
            return get$cachedSerializer();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public java.lang.String toExprString() {
            return AbstractJsonLexerKt.NULL;
        }
    }

    @b0
    @a0("String")
    public static final class String extends CELAtom {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final java.lang.String value;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<String> serializer() {
                return CELAtom$String$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ String(int i10, java.lang.String str, v2 v2Var) {
            super(i10, v2Var);
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, CELAtom$String$$serializer.INSTANCE.getDescriptor());
            }
            this.value = str;
        }

        public static /* synthetic */ String copy$default(String string, java.lang.String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = string.value;
            }
            return string.copy(str);
        }

        @a0("value")
        public static /* synthetic */ void getValue$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(String string, e eVar, SerialDescriptor serialDescriptor) {
            CELAtom.write$Self(string, eVar, serialDescriptor);
            eVar.encodeStringElement(serialDescriptor, 0, string.value);
        }

        @NotNull
        public final java.lang.String component1() {
            return this.value;
        }

        @NotNull
        public final String copy(@NotNull java.lang.String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new String(value);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof String) && Intrinsics.areEqual(this.value, ((String) obj).value);
        }

        @NotNull
        public final java.lang.String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public java.lang.String toExprString() {
            return "\"" + this.value + "\"";
        }

        @NotNull
        public java.lang.String toString() {
            return "String(value=" + this.value + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public String(@NotNull java.lang.String value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }
    }

    @b0
    @a0("UInt")
    public static final class UInt extends CELAtom {

        @NotNull
        public static final Companion Companion = new Companion(null);
        private final long value;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<UInt> serializer() {
                return CELAtom$UInt$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ UInt(int i10, y1 y1Var, v2 v2Var, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, y1Var, v2Var);
        }

        /* JADX INFO: renamed from: copy-VKZWuLQ$default, reason: not valid java name */
        public static /* synthetic */ UInt m75copyVKZWuLQ$default(UInt uInt, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = uInt.value;
            }
            return uInt.m78copyVKZWuLQ(j10);
        }

        @a0("value")
        /* JADX INFO: renamed from: getValue-s-VKNKU$annotations, reason: not valid java name */
        public static /* synthetic */ void m76getValuesVKNKU$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(UInt uInt, e eVar, SerialDescriptor serialDescriptor) {
            CELAtom.write$Self(uInt, eVar, serialDescriptor);
            eVar.encodeSerializableElement(serialDescriptor, 0, s3.f316008a, y1.c(uInt.value));
        }

        /* JADX INFO: renamed from: component1-s-VKNKU, reason: not valid java name */
        public final long m77component1sVKNKU() {
            return this.value;
        }

        @NotNull
        /* JADX INFO: renamed from: copy-VKZWuLQ, reason: not valid java name */
        public final UInt m78copyVKZWuLQ(long j10) {
            return new UInt(j10, null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UInt) && this.value == ((UInt) obj).value;
        }

        /* JADX INFO: renamed from: getValue-s-VKNKU, reason: not valid java name */
        public final long m79getValuesVKNKU() {
            return this.value;
        }

        public int hashCode() {
            return y1.H(this.value);
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public java.lang.String toExprString() {
            return y1.u0(this.value) + "u";
        }

        @NotNull
        public java.lang.String toString() {
            return "UInt(value=" + y1.u0(this.value) + ")";
        }

        public /* synthetic */ UInt(long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private /* synthetic */ UInt(int i10, y1 y1Var, v2 v2Var) {
            super(i10, v2Var);
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, CELAtom$UInt$$serializer.INSTANCE.getDescriptor());
            }
            this.value = y1Var.z0();
        }

        private UInt(long j10) {
            super(null);
            this.value = j10;
        }
    }

    public /* synthetic */ CELAtom(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new v("CELAtom", j1.d(CELAtom.class), new d[]{j1.d(Bool.class), j1.d(Bytes.class), j1.d(Float.class), j1.d(Int.class), j1.d(Null.class), j1.d(String.class), j1.d(UInt.class)}, new KSerializer[]{CELAtom$Bool$$serializer.INSTANCE, CELAtom$Bytes$$serializer.INSTANCE, CELAtom$Float$$serializer.INSTANCE, CELAtom$Int$$serializer.INSTANCE, new z1("Null", Null.INSTANCE, new Annotation[0]), CELAtom$String$$serializer.INSTANCE, CELAtom$UInt$$serializer.INSTANCE}, new Annotation[0]);
    }

    @n
    public static final /* synthetic */ void write$Self(CELAtom cELAtom, e eVar, SerialDescriptor serialDescriptor) {
    }

    private CELAtom() {
    }

    public /* synthetic */ CELAtom(int i10, v2 v2Var) {
    }
}
