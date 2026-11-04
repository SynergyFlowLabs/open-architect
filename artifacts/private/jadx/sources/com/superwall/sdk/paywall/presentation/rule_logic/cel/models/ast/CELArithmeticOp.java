package com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast;

import com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELArithmeticOp;
import java.lang.annotation.Annotation;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j1;
import kotlin.reflect.d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.z1;
import kotlinx.serialization.m;
import kotlinx.serialization.v;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.slf4j.h;

/* JADX INFO: loaded from: classes13.dex */
@b0
@m
@a0("CELArithmeticOp")
public abstract class CELArithmeticOp implements ToExprString {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: cg.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CELArithmeticOp._init_$_anonymous_();
        }
    });

    @b0
    @a0("Add")
    public static final class Add extends CELArithmeticOp {

        @NotNull
        public static final Add INSTANCE = new Add();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: cg.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CELArithmeticOp.Add._init_$_anonymous_();
            }
        });

        private Add() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("Add", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<Add> serializer() {
            return get$cachedSerializer();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return h.f339615a3;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) CELArithmeticOp.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<CELArithmeticOp> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @b0
    @a0("Divide")
    public static final class Divide extends CELArithmeticOp {

        @NotNull
        public static final Divide INSTANCE = new Divide();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: cg.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CELArithmeticOp.Divide._init_$_anonymous_();
            }
        });

        private Divide() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("Divide", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<Divide> serializer() {
            return get$cachedSerializer();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return "/";
        }
    }

    @b0
    @a0("Modulus")
    public static final class Modulus extends CELArithmeticOp {

        @NotNull
        public static final Modulus INSTANCE = new Modulus();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: cg.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CELArithmeticOp.Modulus._init_$_anonymous_();
            }
        });

        private Modulus() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("Modulus", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<Modulus> serializer() {
            return get$cachedSerializer();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return "%";
        }
    }

    @b0
    @a0("Multiply")
    public static final class Multiply extends CELArithmeticOp {

        @NotNull
        public static final Multiply INSTANCE = new Multiply();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: cg.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CELArithmeticOp.Multiply._init_$_anonymous_();
            }
        });

        private Multiply() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("Multiply", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<Multiply> serializer() {
            return get$cachedSerializer();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return "*";
        }
    }

    @b0
    @a0("Subtract")
    public static final class Subtract extends CELArithmeticOp {

        @NotNull
        public static final Subtract INSTANCE = new Subtract();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: cg.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CELArithmeticOp.Subtract._init_$_anonymous_();
            }
        });

        private Subtract() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("Subtract", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<Subtract> serializer() {
            return get$cachedSerializer();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return "-";
        }
    }

    public /* synthetic */ CELArithmeticOp(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new v("CELArithmeticOp", j1.d(CELArithmeticOp.class), new d[]{j1.d(Add.class), j1.d(Divide.class), j1.d(Modulus.class), j1.d(Multiply.class), j1.d(Subtract.class)}, new KSerializer[]{new z1("Add", Add.INSTANCE, new Annotation[0]), new z1("Divide", Divide.INSTANCE, new Annotation[0]), new z1("Modulus", Modulus.INSTANCE, new Annotation[0]), new z1("Multiply", Multiply.INSTANCE, new Annotation[0]), new z1("Subtract", Subtract.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }

    @n
    public static final /* synthetic */ void write$Self(CELArithmeticOp cELArithmeticOp, e eVar, SerialDescriptor serialDescriptor) {
    }

    private CELArithmeticOp() {
    }

    public /* synthetic */ CELArithmeticOp(int i10, v2 v2Var) {
    }
}
