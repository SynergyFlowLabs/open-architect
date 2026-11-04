package com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast;

import com.facebook.GraphRequest;
import com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELMember;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlin.reflect.d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b2;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.m;
import kotlinx.serialization.p;
import kotlinx.serialization.v;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
@m
@a0("CELMember")
public abstract class CELMember implements ToExprString {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: cg.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CELMember._init_$_anonymous_();
        }
    });

    @b0
    @a0("Attribute")
    public static final class Attribute extends CELMember {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final String name;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Attribute> serializer() {
                return CELMember$Attribute$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Attribute(int i10, String str, v2 v2Var) {
            super(i10, v2Var);
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, CELMember$Attribute$$serializer.INSTANCE.getDescriptor());
            }
            this.name = str;
        }

        public static /* synthetic */ Attribute copy$default(Attribute attribute, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = attribute.name;
            }
            return attribute.copy(str);
        }

        @a0("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Attribute attribute, e eVar, SerialDescriptor serialDescriptor) {
            CELMember.write$Self(attribute, eVar, serialDescriptor);
            eVar.encodeStringElement(serialDescriptor, 0, attribute.name);
        }

        @NotNull
        public final String component1() {
            return this.name;
        }

        @NotNull
        public final Attribute copy(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Attribute(name);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Attribute) && Intrinsics.areEqual(this.name, ((Attribute) obj).name);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return "." + this.name;
        }

        @NotNull
        public String toString() {
            return "Attribute(name=" + this.name + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Attribute(@NotNull String name) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) CELMember.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<CELMember> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @b0
    @a0("Fields")
    public static final class Fields extends CELMember {

        @NotNull
        private final List<Pair<String, CELExpression>> fields;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {new kotlinx.serialization.internal.f(new b2(b3.f315897a, CELExpression.Companion.serializer()))};

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Fields> serializer() {
                return CELMember$Fields$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Fields(int i10, List list, v2 v2Var) {
            super(i10, v2Var);
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, CELMember$Fields$$serializer.INSTANCE.getDescriptor());
            }
            this.fields = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Fields copy$default(Fields fields, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = fields.fields;
            }
            return fields.copy(list);
        }

        @a0(GraphRequest.f98513a0)
        public static /* synthetic */ void getFields$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence toExprString$lambda$0(Pair pair) {
            Intrinsics.checkNotNullParameter(pair, "<destruct>");
            return ((String) pair.component1()) + ": " + ((CELExpression) pair.component2()).toExprString();
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Fields fields, e eVar, SerialDescriptor serialDescriptor) {
            CELMember.write$Self(fields, eVar, serialDescriptor);
            eVar.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], fields.fields);
        }

        @NotNull
        public final List<Pair<String, CELExpression>> component1() {
            return this.fields;
        }

        @NotNull
        public final Fields copy(@NotNull List<? extends Pair<String, ? extends CELExpression>> fields) {
            Intrinsics.checkNotNullParameter(fields, "fields");
            return new Fields(fields);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fields) && Intrinsics.areEqual(this.fields, ((Fields) obj).fields);
        }

        @NotNull
        public final List<Pair<String, CELExpression>> getFields() {
            return this.fields;
        }

        public int hashCode() {
            return this.fields.hashCode();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return "{" + CollectionsKt.joinToString$default(this.fields, ", ", null, null, 0, null, new Function1() { // from class: cg.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CELMember.Fields.toExprString$lambda$0((Pair) obj);
                }
            }, 30, null) + "}";
        }

        @NotNull
        public String toString() {
            return "Fields(fields=" + this.fields + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Fields(@NotNull List<? extends Pair<String, ? extends CELExpression>> fields) {
            super(null);
            Intrinsics.checkNotNullParameter(fields, "fields");
            this.fields = fields;
        }
    }

    @b0
    @a0("Index")
    public static final class Index extends CELMember {

        @NotNull
        private final CELExpression expr;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {new p(j1.d(CELExpression.class), new Annotation[0])};

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Index> serializer() {
                return CELMember$Index$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Index(int i10, CELExpression cELExpression, v2 v2Var) {
            super(i10, v2Var);
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, CELMember$Index$$serializer.INSTANCE.getDescriptor());
            }
            this.expr = cELExpression;
        }

        public static /* synthetic */ Index copy$default(Index index, CELExpression cELExpression, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cELExpression = index.expr;
            }
            return index.copy(cELExpression);
        }

        @a0("expr")
        public static /* synthetic */ void getExpr$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Index index, e eVar, SerialDescriptor serialDescriptor) {
            CELMember.write$Self(index, eVar, serialDescriptor);
            eVar.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], index.expr);
        }

        @NotNull
        public final CELExpression component1() {
            return this.expr;
        }

        @NotNull
        public final Index copy(@NotNull CELExpression expr) {
            Intrinsics.checkNotNullParameter(expr, "expr");
            return new Index(expr);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Index) && Intrinsics.areEqual(this.expr, ((Index) obj).expr);
        }

        @NotNull
        public final CELExpression getExpr() {
            return this.expr;
        }

        public int hashCode() {
            return this.expr.hashCode();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return "[" + this.expr.toExprString() + "]";
        }

        @NotNull
        public String toString() {
            return "Index(expr=" + this.expr + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Index(@NotNull CELExpression expr) {
            super(null);
            Intrinsics.checkNotNullParameter(expr, "expr");
            this.expr = expr;
        }
    }

    public /* synthetic */ CELMember(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new v("CELMember", j1.d(CELMember.class), new d[]{j1.d(Attribute.class), j1.d(Fields.class), j1.d(Index.class)}, new KSerializer[]{CELMember$Attribute$$serializer.INSTANCE, CELMember$Fields$$serializer.INSTANCE, CELMember$Index$$serializer.INSTANCE}, new Annotation[0]);
    }

    @n
    public static final /* synthetic */ void write$Self(CELMember cELMember, e eVar, SerialDescriptor serialDescriptor) {
    }

    private CELMember() {
    }

    public /* synthetic */ CELMember(int i10, v2 v2Var) {
    }
}
