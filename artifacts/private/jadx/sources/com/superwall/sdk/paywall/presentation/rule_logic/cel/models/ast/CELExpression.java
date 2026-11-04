package com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast;

import com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELExpression;
import io.sentry.protocol.z;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.reflect.d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b2;
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
@a0("CELExpression")
public abstract class CELExpression implements CELNode, ToExprString {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: cg.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CELExpression._init_$_anonymous_();
        }
    });

    @b0
    @a0("And")
    public static final class And extends CELExpression {

        @NotNull
        private final CELExpression left;

        @NotNull
        private final CELExpression right;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {new p(j1.d(CELExpression.class), new Annotation[0]), new p(j1.d(CELExpression.class), new Annotation[0])};

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<And> serializer() {
                return CELExpression$And$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ And(int i10, CELExpression cELExpression, CELExpression cELExpression2, v2 v2Var) {
            super(i10, v2Var);
            if (3 != (i10 & 3)) {
                g2.b(i10, 3, CELExpression$And$$serializer.INSTANCE.getDescriptor());
            }
            this.left = cELExpression;
            this.right = cELExpression2;
        }

        public static /* synthetic */ And copy$default(And and, CELExpression cELExpression, CELExpression cELExpression2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cELExpression = and.left;
            }
            if ((i10 & 2) != 0) {
                cELExpression2 = and.right;
            }
            return and.copy(cELExpression, cELExpression2);
        }

        @a0("left")
        public static /* synthetic */ void getLeft$annotations() {
        }

        @a0("right")
        public static /* synthetic */ void getRight$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(And and, e eVar, SerialDescriptor serialDescriptor) {
            CELExpression.write$Self(and, eVar, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            int i10 = 4 << 0;
            eVar.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], and.left);
            eVar.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], and.right);
        }

        @NotNull
        public final CELExpression component1() {
            return this.left;
        }

        @NotNull
        public final CELExpression component2() {
            return this.right;
        }

        @NotNull
        public final And copy(@NotNull CELExpression left, @NotNull CELExpression right) {
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            return new And(left, right);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof And)) {
                return false;
            }
            And and = (And) obj;
            return Intrinsics.areEqual(this.left, and.left) && Intrinsics.areEqual(this.right, and.right);
        }

        @NotNull
        public final CELExpression getLeft() {
            return this.left;
        }

        @NotNull
        public final CELExpression getRight() {
            return this.right;
        }

        public int hashCode() {
            return (this.left.hashCode() * 31) + this.right.hashCode();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELNode
        @NotNull
        public CELExpression mapAll(@NotNull Function1<? super CELExpression, ? extends CELExpression> transform) {
            Intrinsics.checkNotNullParameter(transform, "transform");
            return transform.invoke(new And(this.left.mapAll(transform), this.right.mapAll(transform)));
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return "(" + this.left.toExprString() + " && " + this.right.toExprString() + ")";
        }

        @NotNull
        public String toString() {
            return "And(left=" + this.left + ", right=" + this.right + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public And(@NotNull CELExpression left, @NotNull CELExpression right) {
            super(null);
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            this.left = left;
            this.right = right;
        }
    }

    @b0
    @a0("Arithmetic")
    public static final class Arithmetic extends CELExpression {

        @NotNull
        private final CELExpression left;

        @NotNull
        private final CELArithmeticOp op;

        @NotNull
        private final CELExpression right;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {new p(j1.d(CELExpression.class), new Annotation[0]), new p(j1.d(CELArithmeticOp.class), new Annotation[0]), new p(j1.d(CELExpression.class), new Annotation[0])};

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Arithmetic> serializer() {
                return CELExpression$Arithmetic$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            boolean z10 = false | false;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Arithmetic(int i10, CELExpression cELExpression, CELArithmeticOp cELArithmeticOp, CELExpression cELExpression2, v2 v2Var) {
            super(i10, v2Var);
            if (7 != (i10 & 7)) {
                g2.b(i10, 7, CELExpression$Arithmetic$$serializer.INSTANCE.getDescriptor());
            }
            this.left = cELExpression;
            this.op = cELArithmeticOp;
            this.right = cELExpression2;
        }

        public static /* synthetic */ Arithmetic copy$default(Arithmetic arithmetic, CELExpression cELExpression, CELArithmeticOp cELArithmeticOp, CELExpression cELExpression2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cELExpression = arithmetic.left;
            }
            if ((i10 & 2) != 0) {
                cELArithmeticOp = arithmetic.op;
            }
            if ((i10 & 4) != 0) {
                cELExpression2 = arithmetic.right;
            }
            return arithmetic.copy(cELExpression, cELArithmeticOp, cELExpression2);
        }

        @a0("left")
        public static /* synthetic */ void getLeft$annotations() {
        }

        @a0("op")
        public static /* synthetic */ void getOp$annotations() {
        }

        @a0("right")
        public static /* synthetic */ void getRight$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Arithmetic arithmetic, e eVar, SerialDescriptor serialDescriptor) {
            CELExpression.write$Self(arithmetic, eVar, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            eVar.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], arithmetic.left);
            eVar.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], arithmetic.op);
            eVar.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], arithmetic.right);
        }

        @NotNull
        public final CELExpression component1() {
            return this.left;
        }

        @NotNull
        public final CELArithmeticOp component2() {
            return this.op;
        }

        @NotNull
        public final CELExpression component3() {
            return this.right;
        }

        @NotNull
        public final Arithmetic copy(@NotNull CELExpression left, @NotNull CELArithmeticOp op, @NotNull CELExpression right) {
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(op, "op");
            Intrinsics.checkNotNullParameter(right, "right");
            return new Arithmetic(left, op, right);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Arithmetic)) {
                return false;
            }
            Arithmetic arithmetic = (Arithmetic) obj;
            return Intrinsics.areEqual(this.left, arithmetic.left) && Intrinsics.areEqual(this.op, arithmetic.op) && Intrinsics.areEqual(this.right, arithmetic.right);
        }

        @NotNull
        public final CELExpression getLeft() {
            return this.left;
        }

        @NotNull
        public final CELArithmeticOp getOp() {
            return this.op;
        }

        @NotNull
        public final CELExpression getRight() {
            return this.right;
        }

        public int hashCode() {
            return (((this.left.hashCode() * 31) + this.op.hashCode()) * 31) + this.right.hashCode();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELNode
        @NotNull
        public CELExpression mapAll(@NotNull Function1<? super CELExpression, ? extends CELExpression> transform) {
            Intrinsics.checkNotNullParameter(transform, "transform");
            return transform.invoke(new Arithmetic(this.left.mapAll(transform), this.op, this.right.mapAll(transform)));
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return "(" + this.left.toExprString() + " " + this.op.toExprString() + " " + this.right.toExprString() + ")";
        }

        @NotNull
        public String toString() {
            return "Arithmetic(left=" + this.left + ", op=" + this.op + ", right=" + this.right + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Arithmetic(@NotNull CELExpression left, @NotNull CELArithmeticOp op, @NotNull CELExpression right) {
            super(null);
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(op, "op");
            Intrinsics.checkNotNullParameter(right, "right");
            this.left = left;
            this.op = op;
            this.right = right;
        }
    }

    @b0
    @a0("Atom")
    public static final class Atom extends CELExpression {

        @NotNull
        private final CELAtom value;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {CELAtom.Companion.serializer()};

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Atom> serializer() {
                return CELExpression$Atom$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Atom(int i10, CELAtom cELAtom, v2 v2Var) {
            super(i10, v2Var);
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, CELExpression$Atom$$serializer.INSTANCE.getDescriptor());
            }
            this.value = cELAtom;
        }

        public static /* synthetic */ Atom copy$default(Atom atom, CELAtom cELAtom, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cELAtom = atom.value;
            }
            return atom.copy(cELAtom);
        }

        @a0("value")
        public static /* synthetic */ void getValue$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Atom atom, e eVar, SerialDescriptor serialDescriptor) {
            CELExpression.write$Self(atom, eVar, serialDescriptor);
            eVar.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], atom.value);
        }

        @NotNull
        public final CELAtom component1() {
            return this.value;
        }

        @NotNull
        public final Atom copy(@NotNull CELAtom value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Atom(value);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Atom) && Intrinsics.areEqual(this.value, ((Atom) obj).value);
        }

        @NotNull
        public final CELAtom getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELNode
        @NotNull
        public CELExpression mapAll(@NotNull Function1<? super CELExpression, ? extends CELExpression> transform) {
            Intrinsics.checkNotNullParameter(transform, "transform");
            return transform.invoke(this);
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return this.value.toExprString();
        }

        @NotNull
        public String toString() {
            return "Atom(value=" + this.value + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Atom(@NotNull CELAtom value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) CELExpression.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<CELExpression> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @b0
    @a0("FunctionCall")
    @SourceDebugExtension({"SMAP\nCELRelationOp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CELRelationOp.kt\ncom/superwall/sdk/paywall/presentation/rule_logic/cel/models/ast/CELExpression$FunctionCall\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,427:1\n1557#2:428\n1628#2,3:429\n*S KotlinDebug\n*F\n+ 1 CELRelationOp.kt\ncom/superwall/sdk/paywall/presentation/rule_logic/cel/models/ast/CELExpression$FunctionCall\n*L\n269#1:428\n269#1:429,3\n*E\n"})
    public static final class FunctionCall extends CELExpression {

        @NotNull
        private final java.util.List<CELExpression> arguments;

        @NotNull
        private final CELExpression function;

        @Nullable
        private final CELExpression receiver;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {new p(j1.d(CELExpression.class), new Annotation[0]), new p(j1.d(CELExpression.class), new Annotation[0]), new kotlinx.serialization.internal.f(CELExpression.Companion.serializer())};

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<FunctionCall> serializer() {
                return CELExpression$FunctionCall$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FunctionCall(int i10, CELExpression cELExpression, CELExpression cELExpression2, java.util.List list, v2 v2Var) {
            super(i10, v2Var);
            if (7 != (i10 & 7)) {
                g2.b(i10, 7, CELExpression$FunctionCall$$serializer.INSTANCE.getDescriptor());
            }
            this.function = cELExpression;
            this.receiver = cELExpression2;
            this.arguments = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FunctionCall copy$default(FunctionCall functionCall, CELExpression cELExpression, CELExpression cELExpression2, java.util.List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cELExpression = functionCall.function;
            }
            if ((i10 & 2) != 0) {
                cELExpression2 = functionCall.receiver;
            }
            if ((i10 & 4) != 0) {
                list = functionCall.arguments;
            }
            return functionCall.copy(cELExpression, cELExpression2, list);
        }

        @a0("arguments")
        public static /* synthetic */ void getArguments$annotations() {
        }

        @a0(z.b.f306535b)
        public static /* synthetic */ void getFunction$annotations() {
        }

        @a0("receiver")
        public static /* synthetic */ void getReceiver$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence toExprString$lambda$1(CELExpression it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toExprString();
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(FunctionCall functionCall, e eVar, SerialDescriptor serialDescriptor) {
            CELExpression.write$Self(functionCall, eVar, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            eVar.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], functionCall.function);
            eVar.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], functionCall.receiver);
            eVar.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], functionCall.arguments);
        }

        @NotNull
        public final CELExpression component1() {
            return this.function;
        }

        @Nullable
        public final CELExpression component2() {
            return this.receiver;
        }

        @NotNull
        public final java.util.List<CELExpression> component3() {
            return this.arguments;
        }

        @NotNull
        public final FunctionCall copy(@NotNull CELExpression function, @Nullable CELExpression cELExpression, @NotNull java.util.List<? extends CELExpression> arguments) {
            Intrinsics.checkNotNullParameter(function, "function");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            return new FunctionCall(function, cELExpression, arguments);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FunctionCall)) {
                return false;
            }
            FunctionCall functionCall = (FunctionCall) obj;
            return Intrinsics.areEqual(this.function, functionCall.function) && Intrinsics.areEqual(this.receiver, functionCall.receiver) && Intrinsics.areEqual(this.arguments, functionCall.arguments);
        }

        @NotNull
        public final java.util.List<CELExpression> getArguments() {
            return this.arguments;
        }

        @NotNull
        public final CELExpression getFunction() {
            return this.function;
        }

        @Nullable
        public final CELExpression getReceiver() {
            return this.receiver;
        }

        public int hashCode() {
            int iHashCode = this.function.hashCode() * 31;
            CELExpression cELExpression = this.receiver;
            return ((iHashCode + (cELExpression == null ? 0 : cELExpression.hashCode())) * 31) + this.arguments.hashCode();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELNode
        @NotNull
        public CELExpression mapAll(@NotNull Function1<? super CELExpression, ? extends CELExpression> transform) {
            Intrinsics.checkNotNullParameter(transform, "transform");
            CELExpression cELExpressionMapAll = this.function.mapAll(transform);
            CELExpression cELExpression = this.receiver;
            CELExpression cELExpressionMapAll2 = cELExpression != null ? cELExpression.mapAll(transform) : null;
            java.util.List<CELExpression> list = this.arguments;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((CELExpression) it.next()).mapAll(transform));
            }
            return transform.invoke(new FunctionCall(cELExpressionMapAll, cELExpressionMapAll2, arrayList));
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            String str;
            String exprString;
            CELExpression cELExpression = this.receiver;
            if (cELExpression == null || (exprString = cELExpression.toExprString()) == null) {
                str = "";
            } else {
                str = exprString + ".";
                if (str == null) {
                    str = "";
                }
            }
            String strJoinToString$default = CollectionsKt.joinToString$default(this.arguments, ", ", null, null, 0, null, new Function1() { // from class: cg.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CELExpression.FunctionCall.toExprString$lambda$1((CELExpression) obj);
                }
            }, 30, null);
            return str + this.function.toExprString() + "(" + strJoinToString$default + ")";
        }

        @NotNull
        public String toString() {
            return "FunctionCall(function=" + this.function + ", receiver=" + this.receiver + ", arguments=" + this.arguments + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FunctionCall(@NotNull CELExpression function, @Nullable CELExpression cELExpression, @NotNull java.util.List<? extends CELExpression> arguments) {
            super(null);
            Intrinsics.checkNotNullParameter(function, "function");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            this.function = function;
            this.receiver = cELExpression;
            this.arguments = arguments;
        }
    }

    @b0
    @a0("Ident")
    public static final class Ident extends CELExpression {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final String name;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Ident> serializer() {
                return CELExpression$Ident$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Ident(int i10, String str, v2 v2Var) {
            super(i10, v2Var);
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, CELExpression$Ident$$serializer.INSTANCE.getDescriptor());
            }
            this.name = str;
        }

        public static /* synthetic */ Ident copy$default(Ident ident, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = ident.name;
            }
            return ident.copy(str);
        }

        @a0("name")
        public static /* synthetic */ void getName$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Ident ident, e eVar, SerialDescriptor serialDescriptor) {
            CELExpression.write$Self(ident, eVar, serialDescriptor);
            eVar.encodeStringElement(serialDescriptor, 0, ident.name);
        }

        @NotNull
        public final String component1() {
            return this.name;
        }

        @NotNull
        public final Ident copy(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Ident(name);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ident) && Intrinsics.areEqual(this.name, ((Ident) obj).name);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELNode
        @NotNull
        public CELExpression mapAll(@NotNull Function1<? super CELExpression, ? extends CELExpression> transform) {
            Intrinsics.checkNotNullParameter(transform, "transform");
            return transform.invoke(this);
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return this.name;
        }

        @NotNull
        public String toString() {
            return "Ident(name=" + this.name + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ident(@NotNull String name) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }
    }

    @b0
    @a0("List")
    @SourceDebugExtension({"SMAP\nCELRelationOp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CELRelationOp.kt\ncom/superwall/sdk/paywall/presentation/rule_logic/cel/models/ast/CELExpression$List\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,427:1\n1557#2:428\n1628#2,3:429\n*S KotlinDebug\n*F\n+ 1 CELRelationOp.kt\ncom/superwall/sdk/paywall/presentation/rule_logic/cel/models/ast/CELExpression$List\n*L\n288#1:428\n288#1:429,3\n*E\n"})
    public static final class List extends CELExpression {

        @NotNull
        private final java.util.List<CELExpression> elements;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {new kotlinx.serialization.internal.f(CELExpression.Companion.serializer())};

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<List> serializer() {
                return CELExpression$List$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ List(int i10, java.util.List list, v2 v2Var) {
            super(i10, v2Var);
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, CELExpression$List$$serializer.INSTANCE.getDescriptor());
            }
            this.elements = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ List copy$default(List list, java.util.List list2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list2 = list.elements;
            }
            return list.copy(list2);
        }

        @a0("elements")
        public static /* synthetic */ void getElements$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence toExprString$lambda$1(CELExpression it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toExprString();
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(List list, e eVar, SerialDescriptor serialDescriptor) {
            CELExpression.write$Self(list, eVar, serialDescriptor);
            eVar.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], list.elements);
        }

        @NotNull
        public final java.util.List<CELExpression> component1() {
            return this.elements;
        }

        @NotNull
        public final List copy(@NotNull java.util.List<? extends CELExpression> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return new List(elements);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof List) && Intrinsics.areEqual(this.elements, ((List) obj).elements);
        }

        @NotNull
        public final java.util.List<CELExpression> getElements() {
            return this.elements;
        }

        public int hashCode() {
            return this.elements.hashCode();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELNode
        @NotNull
        public CELExpression mapAll(@NotNull Function1<? super CELExpression, ? extends CELExpression> transform) {
            Intrinsics.checkNotNullParameter(transform, "transform");
            java.util.List<CELExpression> list = this.elements;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((CELExpression) it.next()).mapAll(transform));
            }
            return transform.invoke(new List(arrayList));
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return "[" + CollectionsKt.joinToString$default(this.elements, ", ", null, null, 0, null, new Function1() { // from class: cg.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CELExpression.List.toExprString$lambda$1((CELExpression) obj);
                }
            }, 30, null) + "]";
        }

        @NotNull
        public String toString() {
            return "List(elements=" + this.elements + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public List(@NotNull java.util.List<? extends CELExpression> elements) {
            super(null);
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.elements = elements;
        }
    }

    @b0
    @a0("Map")
    @SourceDebugExtension({"SMAP\nCELRelationOp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CELRelationOp.kt\ncom/superwall/sdk/paywall/presentation/rule_logic/cel/models/ast/CELExpression$Map\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,427:1\n1557#2:428\n1628#2,3:429\n*S KotlinDebug\n*F\n+ 1 CELRelationOp.kt\ncom/superwall/sdk/paywall/presentation/rule_logic/cel/models/ast/CELExpression$Map\n*L\n303#1:428\n303#1:429,3\n*E\n"})
    public static final class Map extends CELExpression {

        @f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final java.util.List<Pair<CELExpression, CELExpression>> entries;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Map> serializer() {
                return CELExpression$Map$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            Companion companion = CELExpression.Companion;
            $childSerializers = new KSerializer[]{new kotlinx.serialization.internal.f(new b2(companion.serializer(), companion.serializer()))};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Map(int i10, java.util.List list, v2 v2Var) {
            super(i10, v2Var);
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, CELExpression$Map$$serializer.INSTANCE.getDescriptor());
            }
            this.entries = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Map copy$default(Map map, java.util.List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = map.entries;
            }
            return map.copy(list);
        }

        @a0("entries")
        public static /* synthetic */ void getEntries$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence toExprString$lambda$1(Pair pair) {
            Intrinsics.checkNotNullParameter(pair, "<destruct>");
            CELExpression cELExpression = (CELExpression) pair.component1();
            CELExpression cELExpression2 = (CELExpression) pair.component2();
            return cELExpression.toExprString() + ": " + cELExpression2.toExprString();
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Map map, e eVar, SerialDescriptor serialDescriptor) {
            CELExpression.write$Self(map, eVar, serialDescriptor);
            eVar.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], map.entries);
        }

        @NotNull
        public final java.util.List<Pair<CELExpression, CELExpression>> component1() {
            return this.entries;
        }

        @NotNull
        public final Map copy(@NotNull java.util.List<? extends Pair<? extends CELExpression, ? extends CELExpression>> entries) {
            Intrinsics.checkNotNullParameter(entries, "entries");
            return new Map(entries);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Map) && Intrinsics.areEqual(this.entries, ((Map) obj).entries);
        }

        @NotNull
        public final java.util.List<Pair<CELExpression, CELExpression>> getEntries() {
            return this.entries;
        }

        public int hashCode() {
            return this.entries.hashCode();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELNode
        @NotNull
        public CELExpression mapAll(@NotNull Function1<? super CELExpression, ? extends CELExpression> transform) {
            Intrinsics.checkNotNullParameter(transform, "transform");
            java.util.List<Pair<CELExpression, CELExpression>> list = this.entries;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                arrayList.add(TuplesKt.to(((CELExpression) pair.component1()).mapAll(transform), ((CELExpression) pair.component2()).mapAll(transform)));
            }
            return transform.invoke(new Map(arrayList));
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return "{" + CollectionsKt.joinToString$default(this.entries, ", ", null, null, 0, null, new Function1() { // from class: cg.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CELExpression.Map.toExprString$lambda$1((Pair) obj);
                }
            }, 30, null) + "}";
        }

        @NotNull
        public String toString() {
            return "Map(entries=" + this.entries + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Map(@NotNull java.util.List<? extends Pair<? extends CELExpression, ? extends CELExpression>> entries) {
            super(null);
            Intrinsics.checkNotNullParameter(entries, "entries");
            this.entries = entries;
        }
    }

    @b0
    @a0("Member")
    public static final class Member extends CELExpression {

        @NotNull
        private final CELExpression expr;

        @NotNull
        private final CELMember member;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {new p(j1.d(CELExpression.class), new Annotation[0]), new p(j1.d(CELMember.class), new Annotation[0])};

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Member> serializer() {
                return CELExpression$Member$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Member(int i10, CELExpression cELExpression, CELMember cELMember, v2 v2Var) {
            super(i10, v2Var);
            if (3 != (i10 & 3)) {
                g2.b(i10, 3, CELExpression$Member$$serializer.INSTANCE.getDescriptor());
            }
            this.expr = cELExpression;
            this.member = cELMember;
        }

        public static /* synthetic */ Member copy$default(Member member, CELExpression cELExpression, CELMember cELMember, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cELExpression = member.expr;
            }
            if ((i10 & 2) != 0) {
                cELMember = member.member;
            }
            return member.copy(cELExpression, cELMember);
        }

        @a0("expr")
        public static /* synthetic */ void getExpr$annotations() {
        }

        @a0("member")
        public static /* synthetic */ void getMember$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Member member, e eVar, SerialDescriptor serialDescriptor) {
            CELExpression.write$Self(member, eVar, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            eVar.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], member.expr);
            eVar.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], member.member);
        }

        @NotNull
        public final CELExpression component1() {
            return this.expr;
        }

        @NotNull
        public final CELMember component2() {
            return this.member;
        }

        @NotNull
        public final Member copy(@NotNull CELExpression expr, @NotNull CELMember member) {
            Intrinsics.checkNotNullParameter(expr, "expr");
            Intrinsics.checkNotNullParameter(member, "member");
            return new Member(expr, member);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Member)) {
                return false;
            }
            Member member = (Member) obj;
            return Intrinsics.areEqual(this.expr, member.expr) && Intrinsics.areEqual(this.member, member.member);
        }

        @NotNull
        public final CELExpression getExpr() {
            return this.expr;
        }

        @NotNull
        public final CELMember getMember() {
            return this.member;
        }

        public int hashCode() {
            return (this.expr.hashCode() * 31) + this.member.hashCode();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELNode
        @NotNull
        public CELExpression mapAll(@NotNull Function1<? super CELExpression, ? extends CELExpression> transform) {
            Intrinsics.checkNotNullParameter(transform, "transform");
            return transform.invoke(new Member(this.expr.mapAll(transform), this.member));
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return this.expr.toExprString() + this.member.toExprString();
        }

        @NotNull
        public String toString() {
            return "Member(expr=" + this.expr + ", member=" + this.member + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Member(@NotNull CELExpression expr, @NotNull CELMember member) {
            super(null);
            Intrinsics.checkNotNullParameter(expr, "expr");
            Intrinsics.checkNotNullParameter(member, "member");
            this.expr = expr;
            this.member = member;
        }
    }

    @b0
    @a0("Or")
    public static final class Or extends CELExpression {

        @NotNull
        private final CELExpression left;

        @NotNull
        private final CELExpression right;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {new p(j1.d(CELExpression.class), new Annotation[0]), new p(j1.d(CELExpression.class), new Annotation[0])};

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Or> serializer() {
                return CELExpression$Or$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Or(int i10, CELExpression cELExpression, CELExpression cELExpression2, v2 v2Var) {
            super(i10, v2Var);
            if (3 != (i10 & 3)) {
                g2.b(i10, 3, CELExpression$Or$$serializer.INSTANCE.getDescriptor());
            }
            this.left = cELExpression;
            this.right = cELExpression2;
        }

        public static /* synthetic */ Or copy$default(Or or, CELExpression cELExpression, CELExpression cELExpression2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cELExpression = or.left;
            }
            if ((i10 & 2) != 0) {
                cELExpression2 = or.right;
            }
            return or.copy(cELExpression, cELExpression2);
        }

        @a0("left")
        public static /* synthetic */ void getLeft$annotations() {
        }

        @a0("right")
        public static /* synthetic */ void getRight$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Or or, e eVar, SerialDescriptor serialDescriptor) {
            CELExpression.write$Self(or, eVar, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            eVar.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], or.left);
            eVar.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], or.right);
        }

        @NotNull
        public final CELExpression component1() {
            return this.left;
        }

        @NotNull
        public final CELExpression component2() {
            return this.right;
        }

        @NotNull
        public final Or copy(@NotNull CELExpression left, @NotNull CELExpression right) {
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            return new Or(left, right);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Or)) {
                return false;
            }
            Or or = (Or) obj;
            return Intrinsics.areEqual(this.left, or.left) && Intrinsics.areEqual(this.right, or.right);
        }

        @NotNull
        public final CELExpression getLeft() {
            return this.left;
        }

        @NotNull
        public final CELExpression getRight() {
            return this.right;
        }

        public int hashCode() {
            return (this.left.hashCode() * 31) + this.right.hashCode();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELNode
        @NotNull
        public CELExpression mapAll(@NotNull Function1<? super CELExpression, ? extends CELExpression> transform) {
            Intrinsics.checkNotNullParameter(transform, "transform");
            return transform.invoke(new Or(this.left.mapAll(transform), this.right.mapAll(transform)));
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return "(" + this.left.toExprString() + " || " + this.right.toExprString() + ")";
        }

        @NotNull
        public String toString() {
            return "Or(left=" + this.left + ", right=" + this.right + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Or(@NotNull CELExpression left, @NotNull CELExpression right) {
            super(null);
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            this.left = left;
            this.right = right;
        }
    }

    @b0
    @a0("Relation")
    public static final class Relation extends CELExpression {

        @NotNull
        private final CELExpression left;

        @NotNull
        private final CELRelationOp op;

        @NotNull
        private final CELExpression right;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {new p(j1.d(CELExpression.class), new Annotation[0]), new p(j1.d(CELRelationOp.class), new Annotation[0]), new p(j1.d(CELExpression.class), new Annotation[0])};

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Relation> serializer() {
                return CELExpression$Relation$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Relation(int i10, CELExpression cELExpression, CELRelationOp cELRelationOp, CELExpression cELExpression2, v2 v2Var) {
            super(i10, v2Var);
            if (7 != (i10 & 7)) {
                g2.b(i10, 7, CELExpression$Relation$$serializer.INSTANCE.getDescriptor());
            }
            this.left = cELExpression;
            this.op = cELRelationOp;
            this.right = cELExpression2;
        }

        public static /* synthetic */ Relation copy$default(Relation relation, CELExpression cELExpression, CELRelationOp cELRelationOp, CELExpression cELExpression2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cELExpression = relation.left;
            }
            if ((i10 & 2) != 0) {
                cELRelationOp = relation.op;
            }
            if ((i10 & 4) != 0) {
                cELExpression2 = relation.right;
            }
            return relation.copy(cELExpression, cELRelationOp, cELExpression2);
        }

        @a0("left")
        public static /* synthetic */ void getLeft$annotations() {
        }

        @a0("op")
        public static /* synthetic */ void getOp$annotations() {
        }

        @a0("right")
        public static /* synthetic */ void getRight$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Relation relation, e eVar, SerialDescriptor serialDescriptor) {
            CELExpression.write$Self(relation, eVar, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            eVar.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], relation.left);
            int i10 = 7 >> 1;
            eVar.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], relation.op);
            eVar.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], relation.right);
        }

        @NotNull
        public final CELExpression component1() {
            return this.left;
        }

        @NotNull
        public final CELRelationOp component2() {
            return this.op;
        }

        @NotNull
        public final CELExpression component3() {
            return this.right;
        }

        @NotNull
        public final Relation copy(@NotNull CELExpression left, @NotNull CELRelationOp op, @NotNull CELExpression right) {
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(op, "op");
            Intrinsics.checkNotNullParameter(right, "right");
            return new Relation(left, op, right);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Relation)) {
                return false;
            }
            Relation relation = (Relation) obj;
            return Intrinsics.areEqual(this.left, relation.left) && Intrinsics.areEqual(this.op, relation.op) && Intrinsics.areEqual(this.right, relation.right);
        }

        @NotNull
        public final CELExpression getLeft() {
            return this.left;
        }

        @NotNull
        public final CELRelationOp getOp() {
            return this.op;
        }

        @NotNull
        public final CELExpression getRight() {
            return this.right;
        }

        public int hashCode() {
            return (((this.left.hashCode() * 31) + this.op.hashCode()) * 31) + this.right.hashCode();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELNode
        @NotNull
        public CELExpression mapAll(@NotNull Function1<? super CELExpression, ? extends CELExpression> transform) {
            Intrinsics.checkNotNullParameter(transform, "transform");
            return transform.invoke(new Relation(this.left.mapAll(transform), this.op, this.right.mapAll(transform)));
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return "(" + this.left.toExprString() + " " + this.op.toExprString() + " " + this.right.toExprString() + ")";
        }

        @NotNull
        public String toString() {
            return "Relation(left=" + this.left + ", op=" + this.op + ", right=" + this.right + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Relation(@NotNull CELExpression left, @NotNull CELRelationOp op, @NotNull CELExpression right) {
            super(null);
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(op, "op");
            Intrinsics.checkNotNullParameter(right, "right");
            this.left = left;
            this.op = op;
            this.right = right;
        }
    }

    @b0
    @a0("Ternary")
    public static final class Ternary extends CELExpression {

        @NotNull
        private final CELExpression condition;

        @NotNull
        private final CELExpression falseExpr;

        @NotNull
        private final CELExpression trueExpr;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {new p(j1.d(CELExpression.class), new Annotation[0]), new p(j1.d(CELExpression.class), new Annotation[0]), new p(j1.d(CELExpression.class), new Annotation[0])};

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Ternary> serializer() {
                return CELExpression$Ternary$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Ternary(int i10, CELExpression cELExpression, CELExpression cELExpression2, CELExpression cELExpression3, v2 v2Var) {
            super(i10, v2Var);
            if (7 != (i10 & 7)) {
                g2.b(i10, 7, CELExpression$Ternary$$serializer.INSTANCE.getDescriptor());
            }
            this.condition = cELExpression;
            this.trueExpr = cELExpression2;
            this.falseExpr = cELExpression3;
        }

        public static /* synthetic */ Ternary copy$default(Ternary ternary, CELExpression cELExpression, CELExpression cELExpression2, CELExpression cELExpression3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cELExpression = ternary.condition;
            }
            if ((i10 & 2) != 0) {
                cELExpression2 = ternary.trueExpr;
            }
            if ((i10 & 4) != 0) {
                cELExpression3 = ternary.falseExpr;
            }
            return ternary.copy(cELExpression, cELExpression2, cELExpression3);
        }

        @a0("condition")
        public static /* synthetic */ void getCondition$annotations() {
        }

        @a0("falseExpr")
        public static /* synthetic */ void getFalseExpr$annotations() {
        }

        @a0("trueExpr")
        public static /* synthetic */ void getTrueExpr$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Ternary ternary, e eVar, SerialDescriptor serialDescriptor) {
            CELExpression.write$Self(ternary, eVar, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            eVar.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], ternary.condition);
            eVar.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], ternary.trueExpr);
            eVar.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], ternary.falseExpr);
        }

        @NotNull
        public final CELExpression component1() {
            return this.condition;
        }

        @NotNull
        public final CELExpression component2() {
            return this.trueExpr;
        }

        @NotNull
        public final CELExpression component3() {
            return this.falseExpr;
        }

        @NotNull
        public final Ternary copy(@NotNull CELExpression condition, @NotNull CELExpression trueExpr, @NotNull CELExpression falseExpr) {
            Intrinsics.checkNotNullParameter(condition, "condition");
            Intrinsics.checkNotNullParameter(trueExpr, "trueExpr");
            Intrinsics.checkNotNullParameter(falseExpr, "falseExpr");
            return new Ternary(condition, trueExpr, falseExpr);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ternary)) {
                return false;
            }
            Ternary ternary = (Ternary) obj;
            return Intrinsics.areEqual(this.condition, ternary.condition) && Intrinsics.areEqual(this.trueExpr, ternary.trueExpr) && Intrinsics.areEqual(this.falseExpr, ternary.falseExpr);
        }

        @NotNull
        public final CELExpression getCondition() {
            return this.condition;
        }

        @NotNull
        public final CELExpression getFalseExpr() {
            return this.falseExpr;
        }

        @NotNull
        public final CELExpression getTrueExpr() {
            return this.trueExpr;
        }

        public int hashCode() {
            return (((this.condition.hashCode() * 31) + this.trueExpr.hashCode()) * 31) + this.falseExpr.hashCode();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELNode
        @NotNull
        public CELExpression mapAll(@NotNull Function1<? super CELExpression, ? extends CELExpression> transform) {
            Intrinsics.checkNotNullParameter(transform, "transform");
            return transform.invoke(new Ternary(this.condition.mapAll(transform), this.trueExpr.mapAll(transform), this.falseExpr.mapAll(transform)));
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return "(" + this.condition.toExprString() + " ? " + this.trueExpr.toExprString() + " : " + this.falseExpr.toExprString() + ")";
        }

        @NotNull
        public String toString() {
            return "Ternary(condition=" + this.condition + ", trueExpr=" + this.trueExpr + ", falseExpr=" + this.falseExpr + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ternary(@NotNull CELExpression condition, @NotNull CELExpression trueExpr, @NotNull CELExpression falseExpr) {
            super(null);
            Intrinsics.checkNotNullParameter(condition, "condition");
            Intrinsics.checkNotNullParameter(trueExpr, "trueExpr");
            Intrinsics.checkNotNullParameter(falseExpr, "falseExpr");
            this.condition = condition;
            this.trueExpr = trueExpr;
            this.falseExpr = falseExpr;
        }
    }

    @b0
    @a0("Unary")
    public static final class Unary extends CELExpression {

        @NotNull
        private final CELExpression expr;

        @NotNull
        private final CELUnaryOp op;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {new p(j1.d(CELUnaryOp.class), new Annotation[0]), new p(j1.d(CELExpression.class), new Annotation[0])};

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Unary> serializer() {
                return CELExpression$Unary$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Unary(int i10, CELUnaryOp cELUnaryOp, CELExpression cELExpression, v2 v2Var) {
            super(i10, v2Var);
            if (3 != (i10 & 3)) {
                g2.b(i10, 3, CELExpression$Unary$$serializer.INSTANCE.getDescriptor());
            }
            this.op = cELUnaryOp;
            this.expr = cELExpression;
        }

        public static /* synthetic */ Unary copy$default(Unary unary, CELUnaryOp cELUnaryOp, CELExpression cELExpression, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cELUnaryOp = unary.op;
            }
            if ((i10 & 2) != 0) {
                cELExpression = unary.expr;
            }
            return unary.copy(cELUnaryOp, cELExpression);
        }

        @a0("expr")
        public static /* synthetic */ void getExpr$annotations() {
        }

        @a0("op")
        public static /* synthetic */ void getOp$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Unary unary, e eVar, SerialDescriptor serialDescriptor) {
            CELExpression.write$Self(unary, eVar, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            eVar.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], unary.op);
            eVar.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], unary.expr);
        }

        @NotNull
        public final CELUnaryOp component1() {
            return this.op;
        }

        @NotNull
        public final CELExpression component2() {
            return this.expr;
        }

        @NotNull
        public final Unary copy(@NotNull CELUnaryOp op, @NotNull CELExpression expr) {
            Intrinsics.checkNotNullParameter(op, "op");
            Intrinsics.checkNotNullParameter(expr, "expr");
            return new Unary(op, expr);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Unary)) {
                return false;
            }
            Unary unary = (Unary) obj;
            return Intrinsics.areEqual(this.op, unary.op) && Intrinsics.areEqual(this.expr, unary.expr);
        }

        @NotNull
        public final CELExpression getExpr() {
            return this.expr;
        }

        @NotNull
        public final CELUnaryOp getOp() {
            return this.op;
        }

        public int hashCode() {
            return (this.op.hashCode() * 31) + this.expr.hashCode();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELNode
        @NotNull
        public CELExpression mapAll(@NotNull Function1<? super CELExpression, ? extends CELExpression> transform) {
            Intrinsics.checkNotNullParameter(transform, "transform");
            return transform.invoke(new Unary(this.op, this.expr.mapAll(transform)));
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return this.op.toExprString() + "(" + this.expr.toExprString() + ")";
        }

        @NotNull
        public String toString() {
            return "Unary(op=" + this.op + ", expr=" + this.expr + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unary(@NotNull CELUnaryOp op, @NotNull CELExpression expr) {
            super(null);
            Intrinsics.checkNotNullParameter(op, "op");
            Intrinsics.checkNotNullParameter(expr, "expr");
            this.op = op;
            this.expr = expr;
        }
    }

    public /* synthetic */ CELExpression(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new v("CELExpression", j1.d(CELExpression.class), new d[]{j1.d(And.class), j1.d(Arithmetic.class), j1.d(Atom.class), j1.d(FunctionCall.class), j1.d(Ident.class), j1.d(List.class), j1.d(Map.class), j1.d(Member.class), j1.d(Or.class), j1.d(Relation.class), j1.d(Ternary.class), j1.d(Unary.class)}, new KSerializer[]{CELExpression$And$$serializer.INSTANCE, CELExpression$Arithmetic$$serializer.INSTANCE, CELExpression$Atom$$serializer.INSTANCE, CELExpression$FunctionCall$$serializer.INSTANCE, CELExpression$Ident$$serializer.INSTANCE, CELExpression$List$$serializer.INSTANCE, CELExpression$Map$$serializer.INSTANCE, CELExpression$Member$$serializer.INSTANCE, CELExpression$Or$$serializer.INSTANCE, CELExpression$Relation$$serializer.INSTANCE, CELExpression$Ternary$$serializer.INSTANCE, CELExpression$Unary$$serializer.INSTANCE}, new Annotation[0]);
    }

    @n
    public static final /* synthetic */ void write$Self(CELExpression cELExpression, e eVar, SerialDescriptor serialDescriptor) {
    }

    private CELExpression() {
    }

    public /* synthetic */ CELExpression(int i10, v2 v2Var) {
    }
}
